// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.WirelessSsidsLocalRadiusCertificateAuthentication;
import com.pulumi.meraki.networks.outputs.WirelessSsidsLocalRadiusPasswordAuthentication;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsLocalRadius {
    /**
     * @return The duration (in seconds) for which LDAP and OCSP lookups are cached.
     * 
     */
    private @Nullable Integer cacheTimeout;
    /**
     * @return The current setting for certificate verification.
     * 
     */
    private @Nullable WirelessSsidsLocalRadiusCertificateAuthentication certificateAuthentication;
    /**
     * @return The current setting for password-based authentication.
     * 
     */
    private @Nullable WirelessSsidsLocalRadiusPasswordAuthentication passwordAuthentication;

    private WirelessSsidsLocalRadius() {}
    /**
     * @return The duration (in seconds) for which LDAP and OCSP lookups are cached.
     * 
     */
    public Optional<Integer> cacheTimeout() {
        return Optional.ofNullable(this.cacheTimeout);
    }
    /**
     * @return The current setting for certificate verification.
     * 
     */
    public Optional<WirelessSsidsLocalRadiusCertificateAuthentication> certificateAuthentication() {
        return Optional.ofNullable(this.certificateAuthentication);
    }
    /**
     * @return The current setting for password-based authentication.
     * 
     */
    public Optional<WirelessSsidsLocalRadiusPasswordAuthentication> passwordAuthentication() {
        return Optional.ofNullable(this.passwordAuthentication);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsLocalRadius defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer cacheTimeout;
        private @Nullable WirelessSsidsLocalRadiusCertificateAuthentication certificateAuthentication;
        private @Nullable WirelessSsidsLocalRadiusPasswordAuthentication passwordAuthentication;
        public Builder() {}
        public Builder(WirelessSsidsLocalRadius defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheTimeout = defaults.cacheTimeout;
    	      this.certificateAuthentication = defaults.certificateAuthentication;
    	      this.passwordAuthentication = defaults.passwordAuthentication;
        }

        @CustomType.Setter
        public Builder cacheTimeout(@Nullable Integer cacheTimeout) {

            this.cacheTimeout = cacheTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder certificateAuthentication(@Nullable WirelessSsidsLocalRadiusCertificateAuthentication certificateAuthentication) {

            this.certificateAuthentication = certificateAuthentication;
            return this;
        }
        @CustomType.Setter
        public Builder passwordAuthentication(@Nullable WirelessSsidsLocalRadiusPasswordAuthentication passwordAuthentication) {

            this.passwordAuthentication = passwordAuthentication;
            return this;
        }
        public WirelessSsidsLocalRadius build() {
            final var _resultValue = new WirelessSsidsLocalRadius();
            _resultValue.cacheTimeout = cacheTimeout;
            _resultValue.certificateAuthentication = certificateAuthentication;
            _resultValue.passwordAuthentication = passwordAuthentication;
            return _resultValue;
        }
    }
}