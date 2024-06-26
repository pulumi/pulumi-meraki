// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.administered.outputs.GetIdentitiesMeItemAuthenticationApiKey;
import java.util.Objects;

@CustomType
public final class GetIdentitiesMeItemAuthenticationApi {
    /**
     * @return API key
     * 
     */
    private GetIdentitiesMeItemAuthenticationApiKey key;

    private GetIdentitiesMeItemAuthenticationApi() {}
    /**
     * @return API key
     * 
     */
    public GetIdentitiesMeItemAuthenticationApiKey key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIdentitiesMeItemAuthenticationApi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetIdentitiesMeItemAuthenticationApiKey key;
        public Builder() {}
        public Builder(GetIdentitiesMeItemAuthenticationApi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder key(GetIdentitiesMeItemAuthenticationApiKey key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetIdentitiesMeItemAuthenticationApi", "key");
            }
            this.key = key;
            return this;
        }
        public GetIdentitiesMeItemAuthenticationApi build() {
            final var _resultValue = new GetIdentitiesMeItemAuthenticationApi();
            _resultValue.key = key;
            return _resultValue;
        }
    }
}
