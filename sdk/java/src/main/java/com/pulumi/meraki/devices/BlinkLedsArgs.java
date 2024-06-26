// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.inputs.BlinkLedsParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class BlinkLedsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlinkLedsArgs Empty = new BlinkLedsArgs();

    @Import(name="parameters", required=true)
    private Output<BlinkLedsParametersArgs> parameters;

    public Output<BlinkLedsParametersArgs> parameters() {
        return this.parameters;
    }

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

    private BlinkLedsArgs() {}

    private BlinkLedsArgs(BlinkLedsArgs $) {
        this.parameters = $.parameters;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlinkLedsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlinkLedsArgs $;

        public Builder() {
            $ = new BlinkLedsArgs();
        }

        public Builder(BlinkLedsArgs defaults) {
            $ = new BlinkLedsArgs(Objects.requireNonNull(defaults));
        }

        public Builder parameters(Output<BlinkLedsParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(BlinkLedsParametersArgs parameters) {
            return parameters(Output.of(parameters));
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

        public BlinkLedsArgs build() {
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("BlinkLedsArgs", "parameters");
            }
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("BlinkLedsArgs", "serial");
            }
            return $;
        }
    }

}
