// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingGlobalBandwidthLimitsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingArgs Empty = new ApplianceTrafficShapingArgs();

    /**
     * Global per-client bandwidth limit
     * 
     */
    @Import(name="globalBandwidthLimits")
    private @Nullable Output<ApplianceTrafficShapingGlobalBandwidthLimitsArgs> globalBandwidthLimits;

    /**
     * @return Global per-client bandwidth limit
     * 
     */
    public Optional<Output<ApplianceTrafficShapingGlobalBandwidthLimitsArgs>> globalBandwidthLimits() {
        return Optional.ofNullable(this.globalBandwidthLimits);
    }

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

    private ApplianceTrafficShapingArgs() {}

    private ApplianceTrafficShapingArgs(ApplianceTrafficShapingArgs $) {
        this.globalBandwidthLimits = $.globalBandwidthLimits;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingArgs $;

        public Builder() {
            $ = new ApplianceTrafficShapingArgs();
        }

        public Builder(ApplianceTrafficShapingArgs defaults) {
            $ = new ApplianceTrafficShapingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param globalBandwidthLimits Global per-client bandwidth limit
         * 
         * @return builder
         * 
         */
        public Builder globalBandwidthLimits(@Nullable Output<ApplianceTrafficShapingGlobalBandwidthLimitsArgs> globalBandwidthLimits) {
            $.globalBandwidthLimits = globalBandwidthLimits;
            return this;
        }

        /**
         * @param globalBandwidthLimits Global per-client bandwidth limit
         * 
         * @return builder
         * 
         */
        public Builder globalBandwidthLimits(ApplianceTrafficShapingGlobalBandwidthLimitsArgs globalBandwidthLimits) {
            return globalBandwidthLimits(Output.of(globalBandwidthLimits));
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

        public ApplianceTrafficShapingArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("ApplianceTrafficShapingArgs", "networkId");
            }
            return $;
        }
    }

}
