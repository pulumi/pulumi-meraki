// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringImportsParametersItemArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryOnboardingCloudMonitoringImportsParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryOnboardingCloudMonitoringImportsParametersArgs Empty = new InventoryOnboardingCloudMonitoringImportsParametersArgs();

    /**
     * A set of device imports to commit
     * 
     */
    @Import(name="devices")
    private @Nullable Output<List<InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs>> devices;

    /**
     * @return A set of device imports to commit
     * 
     */
    public Optional<Output<List<InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs>>> devices() {
        return Optional.ofNullable(this.devices);
    }

    @Import(name="items")
    private @Nullable Output<List<InventoryOnboardingCloudMonitoringImportsParametersItemArgs>> items;

    public Optional<Output<List<InventoryOnboardingCloudMonitoringImportsParametersItemArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    private InventoryOnboardingCloudMonitoringImportsParametersArgs() {}

    private InventoryOnboardingCloudMonitoringImportsParametersArgs(InventoryOnboardingCloudMonitoringImportsParametersArgs $) {
        this.devices = $.devices;
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryOnboardingCloudMonitoringImportsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryOnboardingCloudMonitoringImportsParametersArgs $;

        public Builder() {
            $ = new InventoryOnboardingCloudMonitoringImportsParametersArgs();
        }

        public Builder(InventoryOnboardingCloudMonitoringImportsParametersArgs defaults) {
            $ = new InventoryOnboardingCloudMonitoringImportsParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param devices A set of device imports to commit
         * 
         * @return builder
         * 
         */
        public Builder devices(@Nullable Output<List<InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs>> devices) {
            $.devices = devices;
            return this;
        }

        /**
         * @param devices A set of device imports to commit
         * 
         * @return builder
         * 
         */
        public Builder devices(List<InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs> devices) {
            return devices(Output.of(devices));
        }

        /**
         * @param devices A set of device imports to commit
         * 
         * @return builder
         * 
         */
        public Builder devices(InventoryOnboardingCloudMonitoringImportsParametersDeviceArgs... devices) {
            return devices(List.of(devices));
        }

        public Builder items(@Nullable Output<List<InventoryOnboardingCloudMonitoringImportsParametersItemArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<InventoryOnboardingCloudMonitoringImportsParametersItemArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(InventoryOnboardingCloudMonitoringImportsParametersItemArgs... items) {
            return items(List.of(items));
        }

        public InventoryOnboardingCloudMonitoringImportsParametersArgs build() {
            return $;
        }
    }

}
