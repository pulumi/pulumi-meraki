// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.SwitchStacksAddParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class SwitchStacksAddArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchStacksAddArgs Empty = new SwitchStacksAddArgs();

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
    private Output<SwitchStacksAddParametersArgs> parameters;

    public Output<SwitchStacksAddParametersArgs> parameters() {
        return this.parameters;
    }

    /**
     * switchStackId path parameter. Switch stack ID
     * 
     */
    @Import(name="switchStackId", required=true)
    private Output<String> switchStackId;

    /**
     * @return switchStackId path parameter. Switch stack ID
     * 
     */
    public Output<String> switchStackId() {
        return this.switchStackId;
    }

    private SwitchStacksAddArgs() {}

    private SwitchStacksAddArgs(SwitchStacksAddArgs $) {
        this.networkId = $.networkId;
        this.parameters = $.parameters;
        this.switchStackId = $.switchStackId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchStacksAddArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchStacksAddArgs $;

        public Builder() {
            $ = new SwitchStacksAddArgs();
        }

        public Builder(SwitchStacksAddArgs defaults) {
            $ = new SwitchStacksAddArgs(Objects.requireNonNull(defaults));
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

        public Builder parameters(Output<SwitchStacksAddParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(SwitchStacksAddParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param switchStackId switchStackId path parameter. Switch stack ID
         * 
         * @return builder
         * 
         */
        public Builder switchStackId(Output<String> switchStackId) {
            $.switchStackId = switchStackId;
            return this;
        }

        /**
         * @param switchStackId switchStackId path parameter. Switch stack ID
         * 
         * @return builder
         * 
         */
        public Builder switchStackId(String switchStackId) {
            return switchStackId(Output.of(switchStackId));
        }

        public SwitchStacksAddArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("SwitchStacksAddArgs", "networkId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("SwitchStacksAddArgs", "parameters");
            }
            if ($.switchStackId == null) {
                throw new MissingRequiredPropertyException("SwitchStacksAddArgs", "switchStackId");
            }
            return $;
        }
    }

}