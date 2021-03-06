package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v13.campaignmanagement.ImageAdExtension;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents an image ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Image Ad Extension record in a
 * bulk file.
 *
 * For more information, see Image Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkImageAdExtension extends BulkAdExtension<ImageAdExtension> {

    /**
     * Gets the image ad extension.
     */
    public ImageAdExtension getImageAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the image ad extension.
     */
    public void setImageAdExtension(ImageAdExtension imageAdExtension) {
        setAdExtension(imageAdExtension);
    }

    private static final List<BulkMapping<BulkImageAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkImageAdExtension>> m = new ArrayList<BulkMapping<BulkImageAdExtension>>();

        m.add(new SimpleBulkMapping<BulkImageAdExtension, String>(StringTable.DestinationUrl,
                new Function<BulkImageAdExtension, String>() {
                    @Override
                    public String apply(BulkImageAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getImageAdExtension().getDestinationUrl(), c.getImageAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkImageAdExtension>() {
                    @Override
                    public void accept(String v, BulkImageAdExtension c) {
                        c.getImageAdExtension().setDestinationUrl(StringExtensions.getValueOrEmptyString(v));
                    }
                },
                true
        ));

        m.add(new SimpleBulkMapping<BulkImageAdExtension, String>(StringTable.AltText,
                new Function<BulkImageAdExtension, String>() {
                    @Override
                    public String apply(BulkImageAdExtension c) {
                        return c.getImageAdExtension().getAlternativeText();
                    }
                },
                new BiConsumer<String, BulkImageAdExtension>() {
                    @Override
                    public void accept(String v, BulkImageAdExtension c) {
                        c.getImageAdExtension().setAlternativeText(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkImageAdExtension, String>(StringTable.MediaIds,
                new Function<BulkImageAdExtension, String>() {
                    @Override
                    public String apply(BulkImageAdExtension c) {
                        return StringExtensions.toIdListBulkString(";", c.getImageAdExtension().getImageMediaIds());
                    }
                },
                new BiConsumer<String, BulkImageAdExtension>() {
                    @Override
                    public void accept(String v, BulkImageAdExtension c) {
                    	ArrayOflong ids = new ArrayOflong();
                    	List<Long> idArray = StringExtensions.parseIdList(v);
                    	
                    	if (idArray == null) {
                    		ids = null;
                    	} else {
                    		ids.getLongs().addAll(idArray);
                		}
                    	
                        c.getImageAdExtension().setImageMediaIds(ids);
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkImageAdExtension, String>(StringTable.FinalUrlSuffix,
                new Function<BulkImageAdExtension, String>() {
                    @Override
                    public String apply(BulkImageAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getFinalUrlSuffix(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkImageAdExtension>() {
                    @Override
                    public void accept(String v, BulkImageAdExtension c) {
                        c.getAdExtension().setFinalUrlSuffix(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        ImageAdExtension extension = new ImageAdExtension();

        extension.setType("ImageAdExtension");
        
        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getImageAdExtension(), "ImageAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
