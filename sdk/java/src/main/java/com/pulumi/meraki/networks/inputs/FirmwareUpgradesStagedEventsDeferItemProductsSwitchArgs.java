// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs Empty = new FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs();

    /**
     * Details of the next firmware upgrade
     * 
     */
    @Import(name="nextUpgrade")
    private @Nullable Output<FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs> nextUpgrade;

    /**
     * @return Details of the next firmware upgrade
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs>> nextUpgrade() {
        return Optional.ofNullable(this.nextUpgrade);
    }

    private FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs() {}

    private FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs(FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs $) {
        this.nextUpgrade = $.nextUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nextUpgrade Details of the next firmware upgrade
         * 
         * @return builder
         * 
         */
        public Builder nextUpgrade(@Nullable Output<FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs> nextUpgrade) {
            $.nextUpgrade = nextUpgrade;
            return this;
        }

        /**
         * @param nextUpgrade Details of the next firmware upgrade
         * 
         * @return builder
         * 
         */
        public Builder nextUpgrade(FirmwareUpgradesStagedEventsDeferItemProductsSwitchNextUpgradeArgs nextUpgrade) {
            return nextUpgrade(Output.of(nextUpgrade));
        }

        public FirmwareUpgradesStagedEventsDeferItemProductsSwitchArgs build() {
            return $;
        }
    }

}