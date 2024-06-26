// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesProductsSwitchCatalystNextUpgradeToVersionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs Empty = new FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs();

    /**
     * The time of the last successful upgrade
     * 
     */
    @Import(name="time")
    private @Nullable Output<String> time;

    /**
     * @return The time of the last successful upgrade
     * 
     */
    public Optional<Output<String>> time() {
        return Optional.ofNullable(this.time);
    }

    /**
     * The version to be updated to
     * 
     */
    @Import(name="toVersion")
    private @Nullable Output<FirmwareUpgradesProductsSwitchCatalystNextUpgradeToVersionArgs> toVersion;

    /**
     * @return The version to be updated to
     * 
     */
    public Optional<Output<FirmwareUpgradesProductsSwitchCatalystNextUpgradeToVersionArgs>> toVersion() {
        return Optional.ofNullable(this.toVersion);
    }

    private FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs() {}

    private FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs(FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs $) {
        this.time = $.time;
        this.toVersion = $.toVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs $;

        public Builder() {
            $ = new FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs();
        }

        public Builder(FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs defaults) {
            $ = new FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param time The time of the last successful upgrade
         * 
         * @return builder
         * 
         */
        public Builder time(@Nullable Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time The time of the last successful upgrade
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        /**
         * @param toVersion The version to be updated to
         * 
         * @return builder
         * 
         */
        public Builder toVersion(@Nullable Output<FirmwareUpgradesProductsSwitchCatalystNextUpgradeToVersionArgs> toVersion) {
            $.toVersion = toVersion;
            return this;
        }

        /**
         * @param toVersion The version to be updated to
         * 
         * @return builder
         * 
         */
        public Builder toVersion(FirmwareUpgradesProductsSwitchCatalystNextUpgradeToVersionArgs toVersion) {
            return toVersion(Output.of(toVersion));
        }

        public FirmwareUpgradesProductsSwitchCatalystNextUpgradeArgs build() {
            return $;
        }
    }

}
