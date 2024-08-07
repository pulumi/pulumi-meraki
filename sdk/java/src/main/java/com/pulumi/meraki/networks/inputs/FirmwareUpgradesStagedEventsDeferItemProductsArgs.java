// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedEventsDeferItemProductsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsDeferItemProductsArgs Empty = new FirmwareUpgradesStagedEventsDeferItemProductsArgs();

    /**
     * The Switch network to be updated
     * 
     */
    @Import(name="switch")
    private @Nullable Output<FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs> switch_;

    /**
     * @return The Switch network to be updated
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs>> switch_() {
        return Optional.ofNullable(this.switch_);
    }

    private FirmwareUpgradesStagedEventsDeferItemProductsArgs() {}

    private FirmwareUpgradesStagedEventsDeferItemProductsArgs(FirmwareUpgradesStagedEventsDeferItemProductsArgs $) {
        this.switch_ = $.switch_;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsDeferItemProductsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsDeferItemProductsArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsDeferItemProductsArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsDeferItemProductsArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsDeferItemProductsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param switch_ The Switch network to be updated
         * 
         * @return builder
         * 
         */
        public Builder switch_(@Nullable Output<FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs> switch_) {
            $.switch_ = switch_;
            return this;
        }

        /**
         * @param switch_ The Switch network to be updated
         * 
         * @return builder
         * 
         */
        public Builder switch_(FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs switch_) {
            return switch_(Output.of(switch_));
        }

        public FirmwareUpgradesStagedEventsDeferItemProductsArgs build() {
            return $;
        }
    }

}
