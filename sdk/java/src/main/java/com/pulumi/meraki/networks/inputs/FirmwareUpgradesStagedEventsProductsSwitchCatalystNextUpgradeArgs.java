// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersionArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs Empty = new FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs();

    /**
     * The version to be updated to for switch Catalyst devices
     * 
     */
    @Import(name="toVersion")
    private @Nullable Output<FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersionArgs> toVersion;

    /**
     * @return The version to be updated to for switch Catalyst devices
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersionArgs>> toVersion() {
        return Optional.ofNullable(this.toVersion);
    }

    private FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs() {}

    private FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs(FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs $) {
        this.toVersion = $.toVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param toVersion The version to be updated to for switch Catalyst devices
         * 
         * @return builder
         * 
         */
        public Builder toVersion(@Nullable Output<FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersionArgs> toVersion) {
            $.toVersion = toVersion;
            return this;
        }

        /**
         * @param toVersion The version to be updated to for switch Catalyst devices
         * 
         * @return builder
         * 
         */
        public Builder toVersion(FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeToVersionArgs toVersion) {
            return toVersion(Output.of(toVersion));
        }

        public FirmwareUpgradesStagedEventsProductsSwitchCatalystNextUpgradeArgs build() {
            return $;
        }
    }

}