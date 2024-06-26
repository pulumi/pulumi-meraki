// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensorRelationshipsLivestreamRelatedDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SensorRelationshipsLivestreamRelatedDeviceArgs Empty = new SensorRelationshipsLivestreamRelatedDeviceArgs();

    /**
     * The product type of the related device
     * 
     */
    @Import(name="productType")
    private @Nullable Output<String> productType;

    /**
     * @return The product type of the related device
     * 
     */
    public Optional<Output<String>> productType() {
        return Optional.ofNullable(this.productType);
    }

    /**
     * The serial of the related device
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return The serial of the related device
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    private SensorRelationshipsLivestreamRelatedDeviceArgs() {}

    private SensorRelationshipsLivestreamRelatedDeviceArgs(SensorRelationshipsLivestreamRelatedDeviceArgs $) {
        this.productType = $.productType;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensorRelationshipsLivestreamRelatedDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensorRelationshipsLivestreamRelatedDeviceArgs $;

        public Builder() {
            $ = new SensorRelationshipsLivestreamRelatedDeviceArgs();
        }

        public Builder(SensorRelationshipsLivestreamRelatedDeviceArgs defaults) {
            $ = new SensorRelationshipsLivestreamRelatedDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param productType The product type of the related device
         * 
         * @return builder
         * 
         */
        public Builder productType(@Nullable Output<String> productType) {
            $.productType = productType;
            return this;
        }

        /**
         * @param productType The product type of the related device
         * 
         * @return builder
         * 
         */
        public Builder productType(String productType) {
            return productType(Output.of(productType));
        }

        /**
         * @param serial The serial of the related device
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial The serial of the related device
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        public SensorRelationshipsLivestreamRelatedDeviceArgs build() {
            return $;
        }
    }

}
