// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.SmDevicesMoveParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class SmDevicesMoveArgs extends com.pulumi.resources.ResourceArgs {

    public static final SmDevicesMoveArgs Empty = new SmDevicesMoveArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    @Import(name="parameters", required=true)
    private Output<SmDevicesMoveParametersArgs> parameters;

    public Output<SmDevicesMoveParametersArgs> parameters() {
        return this.parameters;
    }

    private SmDevicesMoveArgs() {}

    private SmDevicesMoveArgs(SmDevicesMoveArgs $) {
        this.networkId = $.networkId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmDevicesMoveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmDevicesMoveArgs $;

        public Builder() {
            $ = new SmDevicesMoveArgs();
        }

        public Builder(SmDevicesMoveArgs defaults) {
            $ = new SmDevicesMoveArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public Builder parameters(Output<SmDevicesMoveParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(SmDevicesMoveParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public SmDevicesMoveArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SmDevicesMoveArgs", "networkId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("SmDevicesMoveArgs", "parameters");
            }
            return $;
        }
    }

}