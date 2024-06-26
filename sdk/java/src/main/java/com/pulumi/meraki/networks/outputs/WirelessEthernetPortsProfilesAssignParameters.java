// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessEthernetPortsProfilesAssignParameters {
    /**
     * @return AP profile ID
     * 
     */
    private @Nullable String profileId;
    /**
     * @return List of AP serials
     * 
     */
    private @Nullable List<String> serials;

    private WirelessEthernetPortsProfilesAssignParameters() {}
    /**
     * @return AP profile ID
     * 
     */
    public Optional<String> profileId() {
        return Optional.ofNullable(this.profileId);
    }
    /**
     * @return List of AP serials
     * 
     */
    public List<String> serials() {
        return this.serials == null ? List.of() : this.serials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessEthernetPortsProfilesAssignParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String profileId;
        private @Nullable List<String> serials;
        public Builder() {}
        public Builder(WirelessEthernetPortsProfilesAssignParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileId = defaults.profileId;
    	      this.serials = defaults.serials;
        }

        @CustomType.Setter
        public Builder profileId(@Nullable String profileId) {

            this.profileId = profileId;
            return this;
        }
        @CustomType.Setter
        public Builder serials(@Nullable List<String> serials) {

            this.serials = serials;
            return this;
        }
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }
        public WirelessEthernetPortsProfilesAssignParameters build() {
            final var _resultValue = new WirelessEthernetPortsProfilesAssignParameters();
            _resultValue.profileId = profileId;
            _resultValue.serials = serials;
            return _resultValue;
        }
    }
}
