// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination {
    /**
     * @return CIDR format address (e.g.&#34;192.168.10.1&#34;, which is the same as &#34;192.168.10.1/32&#34;), or &#34;any&#34;. Cannot be used in combination with the &#34;vlan&#34; or &#34;fqdn&#34; property
     * 
     */
    private String cidr;
    /**
     * @return FQDN format address. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available in the &#34;destination&#34; object of the &#34;vpnTrafficUplinkPreference&#34; object. E.g.: &#34;www.google.com&#34;
     * 
     */
    private String fqdn;
    /**
     * @return Host ID in the VLAN. Should not exceed the VLAN subnet capacity. Must be used along with the &#34;vlan&#34; property and is currently only available under a template network.
     * 
     */
    private Integer host;
    /**
     * @return Meraki network ID. Currently only available under a template network, and the value should be ID of either same template network, or another template network currently. E.g.: &#34;L_12345678&#34;.
     * 
     */
    private String network;
    /**
     * @return E.g.: &#34;any&#34;, &#34;0&#34; (also means &#34;any&#34;), &#34;8080&#34;, &#34;1-1024&#34;
     * 
     */
    private String port;
    /**
     * @return VLAN ID of the configured VLAN in the Meraki network. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available under a template network.
     * 
     */
    private Integer vlan;

    private GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination() {}
    /**
     * @return CIDR format address (e.g.&#34;192.168.10.1&#34;, which is the same as &#34;192.168.10.1/32&#34;), or &#34;any&#34;. Cannot be used in combination with the &#34;vlan&#34; or &#34;fqdn&#34; property
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    /**
     * @return FQDN format address. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available in the &#34;destination&#34; object of the &#34;vpnTrafficUplinkPreference&#34; object. E.g.: &#34;www.google.com&#34;
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return Host ID in the VLAN. Should not exceed the VLAN subnet capacity. Must be used along with the &#34;vlan&#34; property and is currently only available under a template network.
     * 
     */
    public Integer host() {
        return this.host;
    }
    /**
     * @return Meraki network ID. Currently only available under a template network, and the value should be ID of either same template network, or another template network currently. E.g.: &#34;L_12345678&#34;.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return E.g.: &#34;any&#34;, &#34;0&#34; (also means &#34;any&#34;), &#34;8080&#34;, &#34;1-1024&#34;
     * 
     */
    public String port() {
        return this.port;
    }
    /**
     * @return VLAN ID of the configured VLAN in the Meraki network. Cannot be used in combination with the &#34;cidr&#34; or &#34;fqdn&#34; property and is currently only available under a template network.
     * 
     */
    public Integer vlan() {
        return this.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidr;
        private String fqdn;
        private Integer host;
        private String network;
        private String port;
        private Integer vlan;
        public Builder() {}
        public Builder(GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.fqdn = defaults.fqdn;
    	      this.host = defaults.host;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
    	      this.vlan = defaults.vlan;
        }

        @CustomType.Setter
        public Builder cidr(String cidr) {
            if (cidr == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination", "cidr");
            }
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder fqdn(String fqdn) {
            if (fqdn == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination", "fqdn");
            }
            this.fqdn = fqdn;
            return this;
        }
        @CustomType.Setter
        public Builder host(Integer host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder vlan(Integer vlan) {
            if (vlan == null) {
              throw new MissingRequiredPropertyException("GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination", "vlan");
            }
            this.vlan = vlan;
            return this;
        }
        public GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination build() {
            final var _resultValue = new GetApplianceTrafficShapingUplinkSelectionItemVpnTrafficUplinkPreferenceTrafficFilterValueDestination();
            _resultValue.cidr = cidr;
            _resultValue.fqdn = fqdn;
            _resultValue.host = host;
            _resultValue.network = network;
            _resultValue.port = port;
            _resultValue.vlan = vlan;
            return _resultValue;
        }
    }
}
