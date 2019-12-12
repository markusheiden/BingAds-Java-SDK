package com.microsoft.bingads.v13.api.test.entities.ad_group_dsa_target.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_dsa_target.BulkAdGroupDynamicSearchAdTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProductPartition;

public class BulkAdGroupDynamicSearchAdTargetWriteFusTest extends BulkAdGroupDynamicSearchAdTargetTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                    {"delete_value", ""},
                    {null, null},
                    {"Final Url Suffix", "Final Url Suffix"},
                    {"?src=bing&param=123", "?src=bing&param=123"},
                }
        );
    }


    @Test
    public void testWriteNotExcluded() {
        testWriteProperty(
                "Final Url Suffix",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public void accept(BulkAdGroupDynamicSearchAdTarget c, String v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);
                        adGroupCriterion.setFinalUrlSuffix(v);
                        adGroupCriterion.setId(100L);

                        c.setBiddableAdGroupCriterion(adGroupCriterion);
                    }
                }
        );
    }
}
