// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessEthernetPortsProfilesPort {
    /**
     * @return Enabled
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Name
     * 
     */
    private @Nullable String name;
    /**
     * @return Number
     * 
     */
    private @Nullable Integer number;
    /**
     * @return PSK Group number
     * 
     */
    private @Nullable String pskGroupId;
    /**
     * @return Ssid number
     * 
     */
    private @Nullable Integer ssid;

    private WirelessEthernetPortsProfilesPort() {}
    /**
     * @return Enabled
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Number
     * 
     */
    public Optional<Integer> number() {
        return Optional.ofNullable(this.number);
    }
    /**
     * @return PSK Group number
     * 
     */
    public Optional<String> pskGroupId() {
        return Optional.ofNullable(this.pskGroupId);
    }
    /**
     * @return Ssid number
     * 
     */
    public Optional<Integer> ssid() {
        return Optional.ofNullable(this.ssid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessEthernetPortsProfilesPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String name;
        private @Nullable Integer number;
        private @Nullable String pskGroupId;
        private @Nullable Integer ssid;
        public Builder() {}
        public Builder(WirelessEthernetPortsProfilesPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.pskGroupId = defaults.pskGroupId;
    	      this.ssid = defaults.ssid;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder number(@Nullable Integer number) {

            this.number = number;
            return this;
        }
        @CustomType.Setter
        public Builder pskGroupId(@Nullable String pskGroupId) {

            this.pskGroupId = pskGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder ssid(@Nullable Integer ssid) {

            this.ssid = ssid;
            return this;
        }
        public WirelessEthernetPortsProfilesPort build() {
            final var _resultValue = new WirelessEthernetPortsProfilesPort();
            _resultValue.enabled = enabled;
            _resultValue.name = name;
            _resultValue.number = number;
            _resultValue.pskGroupId = pskGroupId;
            _resultValue.ssid = ssid;
            return _resultValue;
        }
    }
}