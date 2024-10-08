// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceConnectivityMonitoringDestinationsDestinationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceConnectivityMonitoringDestinationsState extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceConnectivityMonitoringDestinationsState Empty = new ApplianceConnectivityMonitoringDestinationsState();

    /**
     * The list of connectivity monitoring destinations
     * 
     */
    @Import(name="destinations")
    private @Nullable Output<List<ApplianceConnectivityMonitoringDestinationsDestinationArgs>> destinations;

    /**
     * @return The list of connectivity monitoring destinations
     * 
     */
    public Optional<Output<List<ApplianceConnectivityMonitoringDestinationsDestinationArgs>>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private ApplianceConnectivityMonitoringDestinationsState() {}

    private ApplianceConnectivityMonitoringDestinationsState(ApplianceConnectivityMonitoringDestinationsState $) {
        this.destinations = $.destinations;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceConnectivityMonitoringDestinationsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceConnectivityMonitoringDestinationsState $;

        public Builder() {
            $ = new ApplianceConnectivityMonitoringDestinationsState();
        }

        public Builder(ApplianceConnectivityMonitoringDestinationsState defaults) {
            $ = new ApplianceConnectivityMonitoringDestinationsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinations The list of connectivity monitoring destinations
         * 
         * @return builder
         * 
         */
        public Builder destinations(@Nullable Output<List<ApplianceConnectivityMonitoringDestinationsDestinationArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations The list of connectivity monitoring destinations
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<ApplianceConnectivityMonitoringDestinationsDestinationArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        /**
         * @param destinations The list of connectivity monitoring destinations
         * 
         * @return builder
         * 
         */
        public Builder destinations(ApplianceConnectivityMonitoringDestinationsDestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
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

        public ApplianceConnectivityMonitoringDestinationsState build() {
            return $;
        }
    }

}
