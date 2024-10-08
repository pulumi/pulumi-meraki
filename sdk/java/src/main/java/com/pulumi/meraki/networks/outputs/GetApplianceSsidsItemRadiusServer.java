// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceSsidsItemRadiusServer {
    /**
     * @return The IP address of your RADIUS server.
     * 
     */
    private String host;
    /**
     * @return The UDP port your RADIUS servers listens on for Access-requests.
     * 
     */
    private Integer port;

    private GetApplianceSsidsItemRadiusServer() {}
    /**
     * @return The IP address of your RADIUS server.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The UDP port your RADIUS servers listens on for Access-requests.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceSsidsItemRadiusServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private Integer port;
        public Builder() {}
        public Builder(GetApplianceSsidsItemRadiusServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetApplianceSsidsItemRadiusServer", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetApplianceSsidsItemRadiusServer", "port");
            }
            this.port = port;
            return this;
        }
        public GetApplianceSsidsItemRadiusServer build() {
            final var _resultValue = new GetApplianceSsidsItemRadiusServer();
            _resultValue.host = host;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
