// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSwitchDhcpServerPolicyItemArpInspection {
    /**
     * @return Enable or disable Dynamic ARP Inspection on the network. Default value is false.
     * 
     */
    private Boolean enabled;
    /**
     * @return List of switch models that does not support dynamic ARP inspection
     * 
     */
    private List<String> unsupportedModels;

    private GetSwitchDhcpServerPolicyItemArpInspection() {}
    /**
     * @return Enable or disable Dynamic ARP Inspection on the network. Default value is false.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return List of switch models that does not support dynamic ARP inspection
     * 
     */
    public List<String> unsupportedModels() {
        return this.unsupportedModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchDhcpServerPolicyItemArpInspection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private List<String> unsupportedModels;
        public Builder() {}
        public Builder(GetSwitchDhcpServerPolicyItemArpInspection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.unsupportedModels = defaults.unsupportedModels;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpServerPolicyItemArpInspection", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder unsupportedModels(List<String> unsupportedModels) {
            if (unsupportedModels == null) {
              throw new MissingRequiredPropertyException("GetSwitchDhcpServerPolicyItemArpInspection", "unsupportedModels");
            }
            this.unsupportedModels = unsupportedModels;
            return this;
        }
        public Builder unsupportedModels(String... unsupportedModels) {
            return unsupportedModels(List.of(unsupportedModels));
        }
        public GetSwitchDhcpServerPolicyItemArpInspection build() {
            final var _resultValue = new GetSwitchDhcpServerPolicyItemArpInspection();
            _resultValue.enabled = enabled;
            _resultValue.unsupportedModels = unsupportedModels;
            return _resultValue;
        }
    }
}