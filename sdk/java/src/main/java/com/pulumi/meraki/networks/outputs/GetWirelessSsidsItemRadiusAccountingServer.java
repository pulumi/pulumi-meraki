// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessSsidsItemRadiusAccountingServer {
    /**
     * @return Certificate used for authorization for the RADSEC Server
     * 
     */
    private String caCertificate;
    /**
     * @return IP address (or FQDN) to which the APs will send RADIUS accounting messages
     * 
     */
    private String host;
    /**
     * @return The ID of the Openroaming Certificate attached to radius server
     * 
     */
    private Integer openRoamingCertificateId;
    /**
     * @return Port on the RADIUS server that is listening for accounting messages
     * 
     */
    private Integer port;

    private GetWirelessSsidsItemRadiusAccountingServer() {}
    /**
     * @return Certificate used for authorization for the RADSEC Server
     * 
     */
    public String caCertificate() {
        return this.caCertificate;
    }
    /**
     * @return IP address (or FQDN) to which the APs will send RADIUS accounting messages
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The ID of the Openroaming Certificate attached to radius server
     * 
     */
    public Integer openRoamingCertificateId() {
        return this.openRoamingCertificateId;
    }
    /**
     * @return Port on the RADIUS server that is listening for accounting messages
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSsidsItemRadiusAccountingServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String caCertificate;
        private String host;
        private Integer openRoamingCertificateId;
        private Integer port;
        public Builder() {}
        public Builder(GetWirelessSsidsItemRadiusAccountingServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.host = defaults.host;
    	      this.openRoamingCertificateId = defaults.openRoamingCertificateId;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder caCertificate(String caCertificate) {
            if (caCertificate == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsItemRadiusAccountingServer", "caCertificate");
            }
            this.caCertificate = caCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsItemRadiusAccountingServer", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder openRoamingCertificateId(Integer openRoamingCertificateId) {
            if (openRoamingCertificateId == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsItemRadiusAccountingServer", "openRoamingCertificateId");
            }
            this.openRoamingCertificateId = openRoamingCertificateId;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsItemRadiusAccountingServer", "port");
            }
            this.port = port;
            return this;
        }
        public GetWirelessSsidsItemRadiusAccountingServer build() {
            final var _resultValue = new GetWirelessSsidsItemRadiusAccountingServer();
            _resultValue.caCertificate = caCertificate;
            _resultValue.host = host;
            _resultValue.openRoamingCertificateId = openRoamingCertificateId;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
