// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.UnbindParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class UnbindArgs extends com.pulumi.resources.ResourceArgs {

    public static final UnbindArgs Empty = new UnbindArgs();

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
    private Output<UnbindParametersArgs> parameters;

    public Output<UnbindParametersArgs> parameters() {
        return this.parameters;
    }

    private UnbindArgs() {}

    private UnbindArgs(UnbindArgs $) {
        this.networkId = $.networkId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UnbindArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UnbindArgs $;

        public Builder() {
            $ = new UnbindArgs();
        }

        public Builder(UnbindArgs defaults) {
            $ = new UnbindArgs(Objects.requireNonNull(defaults));
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

        public Builder parameters(Output<UnbindParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(UnbindParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public UnbindArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("UnbindArgs", "networkId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("UnbindArgs", "parameters");
            }
            return $;
        }
    }

}