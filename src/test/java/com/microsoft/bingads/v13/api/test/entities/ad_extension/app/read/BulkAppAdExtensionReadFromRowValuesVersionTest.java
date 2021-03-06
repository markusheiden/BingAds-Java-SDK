package com.microsoft.bingads.v13.api.test.entities.ad_extension.app.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAppAdExtension;

@RunWith(Parameterized.class)
public class BulkAppAdExtensionReadFromRowValuesVersionTest extends BulkAppAdExtensionTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123", 123},
                {"2147483647", 2147483647},
                {"", null},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Version", this.datum, this.expectedResult, new Function<BulkAppAdExtension, Integer>() {
            @Override
            public Integer apply(BulkAppAdExtension c) {
                return c.getAppAdExtension().getVersion();
            }
        });
    }
}
