// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetApplianceFirewallFirewalledServicesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplianceFirewallFirewalledServicesArgs Empty = new GetApplianceFirewallFirewalledServicesArgs();

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

    /**
     * service path parameter.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return service path parameter.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private GetApplianceFirewallFirewalledServicesArgs() {}

    private GetApplianceFirewallFirewalledServicesArgs(GetApplianceFirewallFirewalledServicesArgs $) {
        this.networkId = $.networkId;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplianceFirewallFirewalledServicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplianceFirewallFirewalledServicesArgs $;

        public Builder() {
            $ = new GetApplianceFirewallFirewalledServicesArgs();
        }

        public Builder(GetApplianceFirewallFirewalledServicesArgs defaults) {
            $ = new GetApplianceFirewallFirewalledServicesArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param service service path parameter.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service service path parameter.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public GetApplianceFirewallFirewalledServicesArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetApplianceFirewallFirewalledServicesArgs", "networkId");
            }
            if ($.service == null) {
                throw new MissingRequiredPropertyException("GetApplianceFirewallFirewalledServicesArgs", "service");
            }
            return $;
        }
    }

}
