// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetWirelessAlternateManagementInterfaceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWirelessAlternateManagementInterfaceArgs Empty = new GetWirelessAlternateManagementInterfaceArgs();

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

    private GetWirelessAlternateManagementInterfaceArgs() {}

    private GetWirelessAlternateManagementInterfaceArgs(GetWirelessAlternateManagementInterfaceArgs $) {
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWirelessAlternateManagementInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWirelessAlternateManagementInterfaceArgs $;

        public Builder() {
            $ = new GetWirelessAlternateManagementInterfaceArgs();
        }

        public Builder(GetWirelessAlternateManagementInterfaceArgs defaults) {
            $ = new GetWirelessAlternateManagementInterfaceArgs(Objects.requireNonNull(defaults));
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

        public GetWirelessAlternateManagementInterfaceArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetWirelessAlternateManagementInterfaceArgs", "networkId");
            }
            return $;
        }
    }

}