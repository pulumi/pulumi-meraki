// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LicensingSubscriptionSubscriptionsBindItemNetwork {
    /**
     * @return Network ID
     * 
     */
    private @Nullable String id;
    /**
     * @return Network name
     * 
     */
    private @Nullable String name;

    private LicensingSubscriptionSubscriptionsBindItemNetwork() {}
    /**
     * @return Network ID
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Network name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicensingSubscriptionSubscriptionsBindItemNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        public Builder() {}
        public Builder(LicensingSubscriptionSubscriptionsBindItemNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public LicensingSubscriptionSubscriptionsBindItemNetwork build() {
            final var _resultValue = new LicensingSubscriptionSubscriptionsBindItemNetwork();
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}