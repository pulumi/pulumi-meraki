// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnmpItemUser {
    /**
     * @return The passphrase for the SNMP user.
     * 
     */
    private String passphrase;
    /**
     * @return The username for the SNMP user.
     * 
     */
    private String username;

    private GetSnmpItemUser() {}
    /**
     * @return The passphrase for the SNMP user.
     * 
     */
    public String passphrase() {
        return this.passphrase;
    }
    /**
     * @return The username for the SNMP user.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnmpItemUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String passphrase;
        private String username;
        public Builder() {}
        public Builder(GetSnmpItemUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passphrase = defaults.passphrase;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder passphrase(String passphrase) {
            if (passphrase == null) {
              throw new MissingRequiredPropertyException("GetSnmpItemUser", "passphrase");
            }
            this.passphrase = passphrase;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetSnmpItemUser", "username");
            }
            this.username = username;
            return this;
        }
        public GetSnmpItemUser build() {
            final var _resultValue = new GetSnmpItemUser();
            _resultValue.passphrase = passphrase;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
