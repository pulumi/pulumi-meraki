// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetWirelessSsidsSplashSettingsItemSentryEnrollmentSystemsManagerNetwork;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWirelessSsidsSplashSettingsItemSentryEnrollment {
    /**
     * @return The system types that the Sentry enforces.
     * 
     */
    private List<String> enforcedSystems;
    /**
     * @return The strength of the enforcement of selected system types.
     * 
     */
    private String strength;
    /**
     * @return Systems Manager network targeted for sentry enrollment.
     * 
     */
    private GetWirelessSsidsSplashSettingsItemSentryEnrollmentSystemsManagerNetwork systemsManagerNetwork;

    private GetWirelessSsidsSplashSettingsItemSentryEnrollment() {}
    /**
     * @return The system types that the Sentry enforces.
     * 
     */
    public List<String> enforcedSystems() {
        return this.enforcedSystems;
    }
    /**
     * @return The strength of the enforcement of selected system types.
     * 
     */
    public String strength() {
        return this.strength;
    }
    /**
     * @return Systems Manager network targeted for sentry enrollment.
     * 
     */
    public GetWirelessSsidsSplashSettingsItemSentryEnrollmentSystemsManagerNetwork systemsManagerNetwork() {
        return this.systemsManagerNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSsidsSplashSettingsItemSentryEnrollment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> enforcedSystems;
        private String strength;
        private GetWirelessSsidsSplashSettingsItemSentryEnrollmentSystemsManagerNetwork systemsManagerNetwork;
        public Builder() {}
        public Builder(GetWirelessSsidsSplashSettingsItemSentryEnrollment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforcedSystems = defaults.enforcedSystems;
    	      this.strength = defaults.strength;
    	      this.systemsManagerNetwork = defaults.systemsManagerNetwork;
        }

        @CustomType.Setter
        public Builder enforcedSystems(List<String> enforcedSystems) {
            if (enforcedSystems == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsSplashSettingsItemSentryEnrollment", "enforcedSystems");
            }
            this.enforcedSystems = enforcedSystems;
            return this;
        }
        public Builder enforcedSystems(String... enforcedSystems) {
            return enforcedSystems(List.of(enforcedSystems));
        }
        @CustomType.Setter
        public Builder strength(String strength) {
            if (strength == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsSplashSettingsItemSentryEnrollment", "strength");
            }
            this.strength = strength;
            return this;
        }
        @CustomType.Setter
        public Builder systemsManagerNetwork(GetWirelessSsidsSplashSettingsItemSentryEnrollmentSystemsManagerNetwork systemsManagerNetwork) {
            if (systemsManagerNetwork == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsSplashSettingsItemSentryEnrollment", "systemsManagerNetwork");
            }
            this.systemsManagerNetwork = systemsManagerNetwork;
            return this;
        }
        public GetWirelessSsidsSplashSettingsItemSentryEnrollment build() {
            final var _resultValue = new GetWirelessSsidsSplashSettingsItemSentryEnrollment();
            _resultValue.enforcedSystems = enforcedSystems;
            _resultValue.strength = strength;
            _resultValue.systemsManagerNetwork = systemsManagerNetwork;
            return _resultValue;
        }
    }
}