// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesProductsArgs;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesUpgradeWindowArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesArgs Empty = new FirmwareUpgradesArgs();

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
     * The network devices to be updated
     * 
     */
    @Import(name="products")
    private @Nullable Output<FirmwareUpgradesProductsArgs> products;

    /**
     * @return The network devices to be updated
     * 
     */
    public Optional<Output<FirmwareUpgradesProductsArgs>> products() {
        return Optional.ofNullable(this.products);
    }

    /**
     * The timezone for the network
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return The timezone for the network
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    /**
     * Upgrade window for devices in network
     * 
     */
    @Import(name="upgradeWindow")
    private @Nullable Output<FirmwareUpgradesUpgradeWindowArgs> upgradeWindow;

    /**
     * @return Upgrade window for devices in network
     * 
     */
    public Optional<Output<FirmwareUpgradesUpgradeWindowArgs>> upgradeWindow() {
        return Optional.ofNullable(this.upgradeWindow);
    }

    private FirmwareUpgradesArgs() {}

    private FirmwareUpgradesArgs(FirmwareUpgradesArgs $) {
        this.networkId = $.networkId;
        this.products = $.products;
        this.timezone = $.timezone;
        this.upgradeWindow = $.upgradeWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesArgs $;

        public Builder() {
            $ = new FirmwareUpgradesArgs();
        }

        public Builder(FirmwareUpgradesArgs defaults) {
            $ = new FirmwareUpgradesArgs(Objects.requireNonNull(defaults));
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
         * @param products The network devices to be updated
         * 
         * @return builder
         * 
         */
        public Builder products(@Nullable Output<FirmwareUpgradesProductsArgs> products) {
            $.products = products;
            return this;
        }

        /**
         * @param products The network devices to be updated
         * 
         * @return builder
         * 
         */
        public Builder products(FirmwareUpgradesProductsArgs products) {
            return products(Output.of(products));
        }

        /**
         * @param timezone The timezone for the network
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone The timezone for the network
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        /**
         * @param upgradeWindow Upgrade window for devices in network
         * 
         * @return builder
         * 
         */
        public Builder upgradeWindow(@Nullable Output<FirmwareUpgradesUpgradeWindowArgs> upgradeWindow) {
            $.upgradeWindow = upgradeWindow;
            return this;
        }

        /**
         * @param upgradeWindow Upgrade window for devices in network
         * 
         * @return builder
         * 
         */
        public Builder upgradeWindow(FirmwareUpgradesUpgradeWindowArgs upgradeWindow) {
            return upgradeWindow(Output.of(upgradeWindow));
        }

        public FirmwareUpgradesArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("FirmwareUpgradesArgs", "networkId");
            }
            return $;
        }
    }

}
