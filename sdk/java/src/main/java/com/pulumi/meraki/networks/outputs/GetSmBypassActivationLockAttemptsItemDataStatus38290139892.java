// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetSmBypassActivationLockAttemptsItemDataStatus38290139892 {
    private Boolean success;

    private GetSmBypassActivationLockAttemptsItemDataStatus38290139892() {}
    public Boolean success() {
        return this.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmBypassActivationLockAttemptsItemDataStatus38290139892 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean success;
        public Builder() {}
        public Builder(GetSmBypassActivationLockAttemptsItemDataStatus38290139892 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.success = defaults.success;
        }

        @CustomType.Setter
        public Builder success(Boolean success) {
            if (success == null) {
              throw new MissingRequiredPropertyException("GetSmBypassActivationLockAttemptsItemDataStatus38290139892", "success");
            }
            this.success = success;
            return this;
        }
        public GetSmBypassActivationLockAttemptsItemDataStatus38290139892 build() {
            final var _resultValue = new GetSmBypassActivationLockAttemptsItemDataStatus38290139892();
            _resultValue.success = success;
            return _resultValue;
        }
    }
}
