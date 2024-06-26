// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetLoginSecurityItemApiAuthenticationIpRestrictionsForKeys;
import java.util.Objects;

@CustomType
public final class GetLoginSecurityItemApiAuthentication {
    /**
     * @return Details for API-only IP restrictions.
     * 
     */
    private GetLoginSecurityItemApiAuthenticationIpRestrictionsForKeys ipRestrictionsForKeys;

    private GetLoginSecurityItemApiAuthentication() {}
    /**
     * @return Details for API-only IP restrictions.
     * 
     */
    public GetLoginSecurityItemApiAuthenticationIpRestrictionsForKeys ipRestrictionsForKeys() {
        return this.ipRestrictionsForKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoginSecurityItemApiAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetLoginSecurityItemApiAuthenticationIpRestrictionsForKeys ipRestrictionsForKeys;
        public Builder() {}
        public Builder(GetLoginSecurityItemApiAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRestrictionsForKeys = defaults.ipRestrictionsForKeys;
        }

        @CustomType.Setter
        public Builder ipRestrictionsForKeys(GetLoginSecurityItemApiAuthenticationIpRestrictionsForKeys ipRestrictionsForKeys) {
            if (ipRestrictionsForKeys == null) {
              throw new MissingRequiredPropertyException("GetLoginSecurityItemApiAuthentication", "ipRestrictionsForKeys");
            }
            this.ipRestrictionsForKeys = ipRestrictionsForKeys;
            return this;
        }
        public GetLoginSecurityItemApiAuthentication build() {
            final var _resultValue = new GetLoginSecurityItemApiAuthentication();
            _resultValue.ipRestrictionsForKeys = ipRestrictionsForKeys;
            return _resultValue;
        }
    }
}
