// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MerakiAuthUsersAuthorization {
    /**
     * @return User is authorized by the account email address
     * 
     */
    private @Nullable String authorizedByEmail;
    /**
     * @return User is authorized by the account name
     * 
     */
    private @Nullable String authorizedByName;
    /**
     * @return Authorized zone of the user
     * 
     */
    private @Nullable String authorizedZone;
    /**
     * @return Authorization expiration time
     * 
     */
    private @Nullable String expiresAt;
    /**
     * @return SSID number
     * 
     */
    private @Nullable Integer ssidNumber;

    private MerakiAuthUsersAuthorization() {}
    /**
     * @return User is authorized by the account email address
     * 
     */
    public Optional<String> authorizedByEmail() {
        return Optional.ofNullable(this.authorizedByEmail);
    }
    /**
     * @return User is authorized by the account name
     * 
     */
    public Optional<String> authorizedByName() {
        return Optional.ofNullable(this.authorizedByName);
    }
    /**
     * @return Authorized zone of the user
     * 
     */
    public Optional<String> authorizedZone() {
        return Optional.ofNullable(this.authorizedZone);
    }
    /**
     * @return Authorization expiration time
     * 
     */
    public Optional<String> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }
    /**
     * @return SSID number
     * 
     */
    public Optional<Integer> ssidNumber() {
        return Optional.ofNullable(this.ssidNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MerakiAuthUsersAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authorizedByEmail;
        private @Nullable String authorizedByName;
        private @Nullable String authorizedZone;
        private @Nullable String expiresAt;
        private @Nullable Integer ssidNumber;
        public Builder() {}
        public Builder(MerakiAuthUsersAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedByEmail = defaults.authorizedByEmail;
    	      this.authorizedByName = defaults.authorizedByName;
    	      this.authorizedZone = defaults.authorizedZone;
    	      this.expiresAt = defaults.expiresAt;
    	      this.ssidNumber = defaults.ssidNumber;
        }

        @CustomType.Setter
        public Builder authorizedByEmail(@Nullable String authorizedByEmail) {

            this.authorizedByEmail = authorizedByEmail;
            return this;
        }
        @CustomType.Setter
        public Builder authorizedByName(@Nullable String authorizedByName) {

            this.authorizedByName = authorizedByName;
            return this;
        }
        @CustomType.Setter
        public Builder authorizedZone(@Nullable String authorizedZone) {

            this.authorizedZone = authorizedZone;
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(@Nullable String expiresAt) {

            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder ssidNumber(@Nullable Integer ssidNumber) {

            this.ssidNumber = ssidNumber;
            return this;
        }
        public MerakiAuthUsersAuthorization build() {
            final var _resultValue = new MerakiAuthUsersAuthorization();
            _resultValue.authorizedByEmail = authorizedByEmail;
            _resultValue.authorizedByName = authorizedByName;
            _resultValue.authorizedZone = authorizedZone;
            _resultValue.expiresAt = expiresAt;
            _resultValue.ssidNumber = ssidNumber;
            return _resultValue;
        }
    }
}