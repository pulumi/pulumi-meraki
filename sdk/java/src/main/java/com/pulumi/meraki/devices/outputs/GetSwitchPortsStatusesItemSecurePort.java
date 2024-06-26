// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetSwitchPortsStatusesItemSecurePortConfigOverrides;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchPortsStatusesItemSecurePort {
    /**
     * @return Whether Secure Port is currently active for this port.
     * 
     */
    private Boolean active;
    /**
     * @return The current Secure Port status.
     * 
     */
    private String authenticationStatus;
    /**
     * @return The configuration overrides applied to this port when Secure Port is active.
     * 
     */
    private GetSwitchPortsStatusesItemSecurePortConfigOverrides configOverrides;
    /**
     * @return Whether Secure Port is turned on for this port.
     * 
     */
    private Boolean enabled;

    private GetSwitchPortsStatusesItemSecurePort() {}
    /**
     * @return Whether Secure Port is currently active for this port.
     * 
     */
    public Boolean active() {
        return this.active;
    }
    /**
     * @return The current Secure Port status.
     * 
     */
    public String authenticationStatus() {
        return this.authenticationStatus;
    }
    /**
     * @return The configuration overrides applied to this port when Secure Port is active.
     * 
     */
    public GetSwitchPortsStatusesItemSecurePortConfigOverrides configOverrides() {
        return this.configOverrides;
    }
    /**
     * @return Whether Secure Port is turned on for this port.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchPortsStatusesItemSecurePort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean active;
        private String authenticationStatus;
        private GetSwitchPortsStatusesItemSecurePortConfigOverrides configOverrides;
        private Boolean enabled;
        public Builder() {}
        public Builder(GetSwitchPortsStatusesItemSecurePort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.authenticationStatus = defaults.authenticationStatus;
    	      this.configOverrides = defaults.configOverrides;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder active(Boolean active) {
            if (active == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsStatusesItemSecurePort", "active");
            }
            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationStatus(String authenticationStatus) {
            if (authenticationStatus == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsStatusesItemSecurePort", "authenticationStatus");
            }
            this.authenticationStatus = authenticationStatus;
            return this;
        }
        @CustomType.Setter
        public Builder configOverrides(GetSwitchPortsStatusesItemSecurePortConfigOverrides configOverrides) {
            if (configOverrides == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsStatusesItemSecurePort", "configOverrides");
            }
            this.configOverrides = configOverrides;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortsStatusesItemSecurePort", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public GetSwitchPortsStatusesItemSecurePort build() {
            final var _resultValue = new GetSwitchPortsStatusesItemSecurePort();
            _resultValue.active = active;
            _resultValue.authenticationStatus = authenticationStatus;
            _resultValue.configOverrides = configOverrides;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
