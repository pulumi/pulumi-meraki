// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesProductsCellularGatewayLastUpgradeFromVersionArgs;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesProductsCellularGatewayLastUpgradeToVersionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs Empty = new FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs();

    /**
     * Details of the version the device upgraded from
     * 
     */
    @Import(name="fromVersion")
    private @Nullable Output<FirmwareUpgradesProductsCellularGatewayLastUpgradeFromVersionArgs> fromVersion;

    /**
     * @return Details of the version the device upgraded from
     * 
     */
    public Optional<Output<FirmwareUpgradesProductsCellularGatewayLastUpgradeFromVersionArgs>> fromVersion() {
        return Optional.ofNullable(this.fromVersion);
    }

    /**
     * Timestamp of the last successful firmware upgrade
     * 
     */
    @Import(name="time")
    private @Nullable Output<String> time;

    /**
     * @return Timestamp of the last successful firmware upgrade
     * 
     */
    public Optional<Output<String>> time() {
        return Optional.ofNullable(this.time);
    }

    /**
     * Details of the version the device upgraded to
     * 
     */
    @Import(name="toVersion")
    private @Nullable Output<FirmwareUpgradesProductsCellularGatewayLastUpgradeToVersionArgs> toVersion;

    /**
     * @return Details of the version the device upgraded to
     * 
     */
    public Optional<Output<FirmwareUpgradesProductsCellularGatewayLastUpgradeToVersionArgs>> toVersion() {
        return Optional.ofNullable(this.toVersion);
    }

    private FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs() {}

    private FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs(FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs $) {
        this.fromVersion = $.fromVersion;
        this.time = $.time;
        this.toVersion = $.toVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs $;

        public Builder() {
            $ = new FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs();
        }

        public Builder(FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs defaults) {
            $ = new FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fromVersion Details of the version the device upgraded from
         * 
         * @return builder
         * 
         */
        public Builder fromVersion(@Nullable Output<FirmwareUpgradesProductsCellularGatewayLastUpgradeFromVersionArgs> fromVersion) {
            $.fromVersion = fromVersion;
            return this;
        }

        /**
         * @param fromVersion Details of the version the device upgraded from
         * 
         * @return builder
         * 
         */
        public Builder fromVersion(FirmwareUpgradesProductsCellularGatewayLastUpgradeFromVersionArgs fromVersion) {
            return fromVersion(Output.of(fromVersion));
        }

        /**
         * @param time Timestamp of the last successful firmware upgrade
         * 
         * @return builder
         * 
         */
        public Builder time(@Nullable Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time Timestamp of the last successful firmware upgrade
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        /**
         * @param toVersion Details of the version the device upgraded to
         * 
         * @return builder
         * 
         */
        public Builder toVersion(@Nullable Output<FirmwareUpgradesProductsCellularGatewayLastUpgradeToVersionArgs> toVersion) {
            $.toVersion = toVersion;
            return this;
        }

        /**
         * @param toVersion Details of the version the device upgraded to
         * 
         * @return builder
         * 
         */
        public Builder toVersion(FirmwareUpgradesProductsCellularGatewayLastUpgradeToVersionArgs toVersion) {
            return toVersion(Output.of(toVersion));
        }

        public FirmwareUpgradesProductsCellularGatewayLastUpgradeArgs build() {
            return $;
        }
    }

}
