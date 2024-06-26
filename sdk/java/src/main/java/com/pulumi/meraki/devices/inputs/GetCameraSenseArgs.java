// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCameraSenseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCameraSenseArgs Empty = new GetCameraSenseArgs();

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

    private GetCameraSenseArgs() {}

    private GetCameraSenseArgs(GetCameraSenseArgs $) {
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCameraSenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCameraSenseArgs $;

        public Builder() {
            $ = new GetCameraSenseArgs();
        }

        public Builder(GetCameraSenseArgs defaults) {
            $ = new GetCameraSenseArgs(Objects.requireNonNull(defaults));
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

        public GetCameraSenseArgs build() {
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("GetCameraSenseArgs", "serial");
            }
            return $;
        }
    }

}
