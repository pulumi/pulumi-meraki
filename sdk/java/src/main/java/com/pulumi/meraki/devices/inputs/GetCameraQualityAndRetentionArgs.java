// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCameraQualityAndRetentionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCameraQualityAndRetentionArgs Empty = new GetCameraQualityAndRetentionArgs();

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial", required=true)
    private Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }

    private GetCameraQualityAndRetentionArgs() {}

    private GetCameraQualityAndRetentionArgs(GetCameraQualityAndRetentionArgs $) {
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCameraQualityAndRetentionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCameraQualityAndRetentionArgs $;

        public Builder() {
            $ = new GetCameraQualityAndRetentionArgs();
        }

        public Builder(GetCameraQualityAndRetentionArgs defaults) {
            $ = new GetCameraQualityAndRetentionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        public GetCameraQualityAndRetentionArgs build() {
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("GetCameraQualityAndRetentionArgs", "serial");
            }
            return $;
        }
    }

}
