package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.negative_location.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.negative_location.BulkAdGroupNegativeLocationCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupNegativeLocationCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeLocationCriterionWriteAdGroupNameTest extends BulkAdGroupNegativeLocationCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Ad Group",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupNegativeLocationCriterion, String>() {
                    @Override
                    public void accept(BulkAdGroupNegativeLocationCriterion c, String v) {
                        c.setAdGroupName(v);
                    }
                }
        );
    }
}
