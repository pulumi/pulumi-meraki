// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetWirelessSsidsHotspot20ItemNaiRealmMethodAuthenticationTypes;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessSsidsHotspot20ItemNaiRealmMethod {
    private GetWirelessSsidsHotspot20ItemNaiRealmMethodAuthenticationTypes authenticationTypes;
    private String id;

    private GetWirelessSsidsHotspot20ItemNaiRealmMethod() {}
    public GetWirelessSsidsHotspot20ItemNaiRealmMethodAuthenticationTypes authenticationTypes() {
        return this.authenticationTypes;
    }
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSsidsHotspot20ItemNaiRealmMethod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetWirelessSsidsHotspot20ItemNaiRealmMethodAuthenticationTypes authenticationTypes;
        private String id;
        public Builder() {}
        public Builder(GetWirelessSsidsHotspot20ItemNaiRealmMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationTypes = defaults.authenticationTypes;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder authenticationTypes(GetWirelessSsidsHotspot20ItemNaiRealmMethodAuthenticationTypes authenticationTypes) {
            if (authenticationTypes == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsHotspot20ItemNaiRealmMethod", "authenticationTypes");
            }
            this.authenticationTypes = authenticationTypes;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsHotspot20ItemNaiRealmMethod", "id");
            }
            this.id = id;
            return this;
        }
        public GetWirelessSsidsHotspot20ItemNaiRealmMethod build() {
            final var _resultValue = new GetWirelessSsidsHotspot20ItemNaiRealmMethod();
            _resultValue.authenticationTypes = authenticationTypes;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}