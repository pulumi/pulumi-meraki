// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchAccessPoliciesRadiusCriticalAuth {
    /**
     * @return VLAN that clients who use data will be placed on when RADIUS authentication fails. Will be null if hostMode is Multi-Auth
     * 
     */
    private @Nullable Integer dataVlanId;
    /**
     * @return Enable to suspend port bounce when RADIUS servers are unreachable
     * 
     */
    private @Nullable Boolean suspendPortBounce;
    /**
     * @return VLAN that clients who use voice will be placed on when RADIUS authentication fails. Will be null if hostMode is Multi-Auth
     * 
     */
    private @Nullable Integer voiceVlanId;

    private SwitchAccessPoliciesRadiusCriticalAuth() {}
    /**
     * @return VLAN that clients who use data will be placed on when RADIUS authentication fails. Will be null if hostMode is Multi-Auth
     * 
     */
    public Optional<Integer> dataVlanId() {
        return Optional.ofNullable(this.dataVlanId);
    }
    /**
     * @return Enable to suspend port bounce when RADIUS servers are unreachable
     * 
     */
    public Optional<Boolean> suspendPortBounce() {
        return Optional.ofNullable(this.suspendPortBounce);
    }
    /**
     * @return VLAN that clients who use voice will be placed on when RADIUS authentication fails. Will be null if hostMode is Multi-Auth
     * 
     */
    public Optional<Integer> voiceVlanId() {
        return Optional.ofNullable(this.voiceVlanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchAccessPoliciesRadiusCriticalAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer dataVlanId;
        private @Nullable Boolean suspendPortBounce;
        private @Nullable Integer voiceVlanId;
        public Builder() {}
        public Builder(SwitchAccessPoliciesRadiusCriticalAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataVlanId = defaults.dataVlanId;
    	      this.suspendPortBounce = defaults.suspendPortBounce;
    	      this.voiceVlanId = defaults.voiceVlanId;
        }

        @CustomType.Setter
        public Builder dataVlanId(@Nullable Integer dataVlanId) {

            this.dataVlanId = dataVlanId;
            return this;
        }
        @CustomType.Setter
        public Builder suspendPortBounce(@Nullable Boolean suspendPortBounce) {

            this.suspendPortBounce = suspendPortBounce;
            return this;
        }
        @CustomType.Setter
        public Builder voiceVlanId(@Nullable Integer voiceVlanId) {

            this.voiceVlanId = voiceVlanId;
            return this;
        }
        public SwitchAccessPoliciesRadiusCriticalAuth build() {
            final var _resultValue = new SwitchAccessPoliciesRadiusCriticalAuth();
            _resultValue.dataVlanId = dataVlanId;
            _resultValue.suspendPortBounce = suspendPortBounce;
            _resultValue.voiceVlanId = voiceVlanId;
            return _resultValue;
        }
    }
}
