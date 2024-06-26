// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.SmBypassActivationLockAttemptsDataStatus2090938209;
import com.pulumi.meraki.networks.outputs.SmBypassActivationLockAttemptsDataStatus38290139892;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SmBypassActivationLockAttemptsData {
    private @Nullable SmBypassActivationLockAttemptsDataStatus2090938209 status2090938209;
    private @Nullable SmBypassActivationLockAttemptsDataStatus38290139892 status38290139892;

    private SmBypassActivationLockAttemptsData() {}
    public Optional<SmBypassActivationLockAttemptsDataStatus2090938209> status2090938209() {
        return Optional.ofNullable(this.status2090938209);
    }
    public Optional<SmBypassActivationLockAttemptsDataStatus38290139892> status38290139892() {
        return Optional.ofNullable(this.status38290139892);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmBypassActivationLockAttemptsData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SmBypassActivationLockAttemptsDataStatus2090938209 status2090938209;
        private @Nullable SmBypassActivationLockAttemptsDataStatus38290139892 status38290139892;
        public Builder() {}
        public Builder(SmBypassActivationLockAttemptsData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status2090938209 = defaults.status2090938209;
    	      this.status38290139892 = defaults.status38290139892;
        }

        @CustomType.Setter
        public Builder status2090938209(@Nullable SmBypassActivationLockAttemptsDataStatus2090938209 status2090938209) {

            this.status2090938209 = status2090938209;
            return this;
        }
        @CustomType.Setter
        public Builder status38290139892(@Nullable SmBypassActivationLockAttemptsDataStatus38290139892 status38290139892) {

            this.status38290139892 = status38290139892;
            return this;
        }
        public SmBypassActivationLockAttemptsData build() {
            final var _resultValue = new SmBypassActivationLockAttemptsData();
            _resultValue.status2090938209 = status2090938209;
            _resultValue.status38290139892 = status38290139892;
            return _resultValue;
        }
    }
}
