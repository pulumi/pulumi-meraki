// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceFirewallSettingsSpoofingProtectionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceFirewallSettingsState extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceFirewallSettingsState Empty = new ApplianceFirewallSettingsState();

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

    /**
     * Spoofing protection settings
     * 
     */
    @Import(name="spoofingProtection")
    private @Nullable Output<ApplianceFirewallSettingsSpoofingProtectionArgs> spoofingProtection;

    /**
     * @return Spoofing protection settings
     * 
     */
    public Optional<Output<ApplianceFirewallSettingsSpoofingProtectionArgs>> spoofingProtection() {
        return Optional.ofNullable(this.spoofingProtection);
    }

    private ApplianceFirewallSettingsState() {}

    private ApplianceFirewallSettingsState(ApplianceFirewallSettingsState $) {
        this.networkId = $.networkId;
        this.spoofingProtection = $.spoofingProtection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceFirewallSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceFirewallSettingsState $;

        public Builder() {
            $ = new ApplianceFirewallSettingsState();
        }

        public Builder(ApplianceFirewallSettingsState defaults) {
            $ = new ApplianceFirewallSettingsState(Objects.requireNonNull(defaults));
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

        /**
         * @param spoofingProtection Spoofing protection settings
         * 
         * @return builder
         * 
         */
        public Builder spoofingProtection(@Nullable Output<ApplianceFirewallSettingsSpoofingProtectionArgs> spoofingProtection) {
            $.spoofingProtection = spoofingProtection;
            return this;
        }

        /**
         * @param spoofingProtection Spoofing protection settings
         * 
         * @return builder
         * 
         */
        public Builder spoofingProtection(ApplianceFirewallSettingsSpoofingProtectionArgs spoofingProtection) {
            return spoofingProtection(Output.of(spoofingProtection));
        }

        public ApplianceFirewallSettingsState build() {
            return $;
        }
    }

}
