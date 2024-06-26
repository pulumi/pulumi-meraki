// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceVlansItemDhcpOption;
import com.pulumi.meraki.networks.outputs.GetApplianceVlansItemIpv6;
import com.pulumi.meraki.networks.outputs.GetApplianceVlansItemMandatoryDhcp;
import com.pulumi.meraki.networks.outputs.GetApplianceVlansItemReservedIpRange;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplianceVlansItem {
    /**
     * @return The local IP of the appliance on the VLAN
     * 
     */
    private String applianceIp;
    /**
     * @return CIDR of the pool of subnets. Applicable only for template network. Each network bound to the template will automatically pick a subnet from this pool to build its own VLAN.
     * 
     */
    private String cidr;
    /**
     * @return DHCP boot option for boot filename
     * 
     */
    private String dhcpBootFilename;
    /**
     * @return DHCP boot option to direct boot clients to the server to load the boot file from
     * 
     */
    private String dhcpBootNextServer;
    /**
     * @return Use DHCP boot options specified in other properties
     * 
     */
    private Boolean dhcpBootOptionsEnabled;
    /**
     * @return The appliance&#39;s handling of DHCP requests on this VLAN. One of: &#39;Run a DHCP server&#39;, &#39;Relay DHCP to another server&#39; or &#39;Do not respond to DHCP requests&#39;
     * 
     */
    private String dhcpHandling;
    /**
     * @return The term of DHCP leases if the appliance is running a DHCP server on this VLAN. One of: &#39;30 minutes&#39;, &#39;1 hour&#39;, &#39;4 hours&#39;, &#39;12 hours&#39;, &#39;1 day&#39; or &#39;1 week&#39;
     * 
     */
    private String dhcpLeaseTime;
    /**
     * @return The list of DHCP options that will be included in DHCP responses. Each object in the list should have &#34;code&#34;, &#34;type&#34;, and &#34;value&#34; properties.
     * 
     */
    private List<GetApplianceVlansItemDhcpOption> dhcpOptions;
    /**
     * @return The IPs of the DHCP servers that DHCP requests should be relayed to
     * 
     */
    private List<String> dhcpRelayServerIps;
    /**
     * @return The DNS nameservers used for DHCP responses, either &#34;upstream*dns&#34;, &#34;google*dns&#34;, &#34;opendns&#34;, or a newline seperated string of IP addresses or domain names
     * 
     */
    private String dnsNameservers;
    /**
     * @return The DHCP fixed IP assignments on the VLAN. This should be an object that contains mappings from MAC addresses to objects that themselves each contain &#34;ip&#34; and &#34;name&#34; string fields. See the sample request/response for more details.
     * 
     */
    private String fixedIpAssignments;
    /**
     * @return The id of the desired group policy to apply to the VLAN
     * 
     */
    private String groupPolicyId;
    /**
     * @return The VLAN ID of the VLAN
     * 
     */
    private Integer id;
    /**
     * @return The interface ID of the VLAN
     * 
     */
    private String interfaceId;
    /**
     * @return IPv6 configuration on the VLAN
     * 
     */
    private GetApplianceVlansItemIpv6 ipv6;
    /**
     * @return Mandatory DHCP will enforce that clients connecting to this VLAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won&#39;t be able to associate. Only available on firmware versions 17.0 and above
     * 
     */
    private GetApplianceVlansItemMandatoryDhcp mandatoryDhcp;
    /**
     * @return Mask used for the subnet of all bound to the template networks. Applicable only for template network.
     * 
     */
    private Integer mask;
    /**
     * @return The name of the VLAN
     * 
     */
    private String name;
    /**
     * @return The DHCP reserved IP ranges on the VLAN
     * 
     */
    private List<GetApplianceVlansItemReservedIpRange> reservedIpRanges;
    /**
     * @return The subnet of the VLAN
     * 
     */
    private String subnet;
    /**
     * @return Type of subnetting of the VLAN. Applicable only for template network.
     * 
     */
    private String templateVlanType;
    /**
     * @return The translated VPN subnet if VPN and VPN subnet translation are enabled on the VLAN
     * 
     */
    private String vpnNatSubnet;

    private GetApplianceVlansItem() {}
    /**
     * @return The local IP of the appliance on the VLAN
     * 
     */
    public String applianceIp() {
        return this.applianceIp;
    }
    /**
     * @return CIDR of the pool of subnets. Applicable only for template network. Each network bound to the template will automatically pick a subnet from this pool to build its own VLAN.
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    /**
     * @return DHCP boot option for boot filename
     * 
     */
    public String dhcpBootFilename() {
        return this.dhcpBootFilename;
    }
    /**
     * @return DHCP boot option to direct boot clients to the server to load the boot file from
     * 
     */
    public String dhcpBootNextServer() {
        return this.dhcpBootNextServer;
    }
    /**
     * @return Use DHCP boot options specified in other properties
     * 
     */
    public Boolean dhcpBootOptionsEnabled() {
        return this.dhcpBootOptionsEnabled;
    }
    /**
     * @return The appliance&#39;s handling of DHCP requests on this VLAN. One of: &#39;Run a DHCP server&#39;, &#39;Relay DHCP to another server&#39; or &#39;Do not respond to DHCP requests&#39;
     * 
     */
    public String dhcpHandling() {
        return this.dhcpHandling;
    }
    /**
     * @return The term of DHCP leases if the appliance is running a DHCP server on this VLAN. One of: &#39;30 minutes&#39;, &#39;1 hour&#39;, &#39;4 hours&#39;, &#39;12 hours&#39;, &#39;1 day&#39; or &#39;1 week&#39;
     * 
     */
    public String dhcpLeaseTime() {
        return this.dhcpLeaseTime;
    }
    /**
     * @return The list of DHCP options that will be included in DHCP responses. Each object in the list should have &#34;code&#34;, &#34;type&#34;, and &#34;value&#34; properties.
     * 
     */
    public List<GetApplianceVlansItemDhcpOption> dhcpOptions() {
        return this.dhcpOptions;
    }
    /**
     * @return The IPs of the DHCP servers that DHCP requests should be relayed to
     * 
     */
    public List<String> dhcpRelayServerIps() {
        return this.dhcpRelayServerIps;
    }
    /**
     * @return The DNS nameservers used for DHCP responses, either &#34;upstream*dns&#34;, &#34;google*dns&#34;, &#34;opendns&#34;, or a newline seperated string of IP addresses or domain names
     * 
     */
    public String dnsNameservers() {
        return this.dnsNameservers;
    }
    /**
     * @return The DHCP fixed IP assignments on the VLAN. This should be an object that contains mappings from MAC addresses to objects that themselves each contain &#34;ip&#34; and &#34;name&#34; string fields. See the sample request/response for more details.
     * 
     */
    public String fixedIpAssignments() {
        return this.fixedIpAssignments;
    }
    /**
     * @return The id of the desired group policy to apply to the VLAN
     * 
     */
    public String groupPolicyId() {
        return this.groupPolicyId;
    }
    /**
     * @return The VLAN ID of the VLAN
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The interface ID of the VLAN
     * 
     */
    public String interfaceId() {
        return this.interfaceId;
    }
    /**
     * @return IPv6 configuration on the VLAN
     * 
     */
    public GetApplianceVlansItemIpv6 ipv6() {
        return this.ipv6;
    }
    /**
     * @return Mandatory DHCP will enforce that clients connecting to this VLAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won&#39;t be able to associate. Only available on firmware versions 17.0 and above
     * 
     */
    public GetApplianceVlansItemMandatoryDhcp mandatoryDhcp() {
        return this.mandatoryDhcp;
    }
    /**
     * @return Mask used for the subnet of all bound to the template networks. Applicable only for template network.
     * 
     */
    public Integer mask() {
        return this.mask;
    }
    /**
     * @return The name of the VLAN
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The DHCP reserved IP ranges on the VLAN
     * 
     */
    public List<GetApplianceVlansItemReservedIpRange> reservedIpRanges() {
        return this.reservedIpRanges;
    }
    /**
     * @return The subnet of the VLAN
     * 
     */
    public String subnet() {
        return this.subnet;
    }
    /**
     * @return Type of subnetting of the VLAN. Applicable only for template network.
     * 
     */
    public String templateVlanType() {
        return this.templateVlanType;
    }
    /**
     * @return The translated VPN subnet if VPN and VPN subnet translation are enabled on the VLAN
     * 
     */
    public String vpnNatSubnet() {
        return this.vpnNatSubnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceVlansItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applianceIp;
        private String cidr;
        private String dhcpBootFilename;
        private String dhcpBootNextServer;
        private Boolean dhcpBootOptionsEnabled;
        private String dhcpHandling;
        private String dhcpLeaseTime;
        private List<GetApplianceVlansItemDhcpOption> dhcpOptions;
        private List<String> dhcpRelayServerIps;
        private String dnsNameservers;
        private String fixedIpAssignments;
        private String groupPolicyId;
        private Integer id;
        private String interfaceId;
        private GetApplianceVlansItemIpv6 ipv6;
        private GetApplianceVlansItemMandatoryDhcp mandatoryDhcp;
        private Integer mask;
        private String name;
        private List<GetApplianceVlansItemReservedIpRange> reservedIpRanges;
        private String subnet;
        private String templateVlanType;
        private String vpnNatSubnet;
        public Builder() {}
        public Builder(GetApplianceVlansItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applianceIp = defaults.applianceIp;
    	      this.cidr = defaults.cidr;
    	      this.dhcpBootFilename = defaults.dhcpBootFilename;
    	      this.dhcpBootNextServer = defaults.dhcpBootNextServer;
    	      this.dhcpBootOptionsEnabled = defaults.dhcpBootOptionsEnabled;
    	      this.dhcpHandling = defaults.dhcpHandling;
    	      this.dhcpLeaseTime = defaults.dhcpLeaseTime;
    	      this.dhcpOptions = defaults.dhcpOptions;
    	      this.dhcpRelayServerIps = defaults.dhcpRelayServerIps;
    	      this.dnsNameservers = defaults.dnsNameservers;
    	      this.fixedIpAssignments = defaults.fixedIpAssignments;
    	      this.groupPolicyId = defaults.groupPolicyId;
    	      this.id = defaults.id;
    	      this.interfaceId = defaults.interfaceId;
    	      this.ipv6 = defaults.ipv6;
    	      this.mandatoryDhcp = defaults.mandatoryDhcp;
    	      this.mask = defaults.mask;
    	      this.name = defaults.name;
    	      this.reservedIpRanges = defaults.reservedIpRanges;
    	      this.subnet = defaults.subnet;
    	      this.templateVlanType = defaults.templateVlanType;
    	      this.vpnNatSubnet = defaults.vpnNatSubnet;
        }

        @CustomType.Setter
        public Builder applianceIp(String applianceIp) {
            if (applianceIp == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "applianceIp");
            }
            this.applianceIp = applianceIp;
            return this;
        }
        @CustomType.Setter
        public Builder cidr(String cidr) {
            if (cidr == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "cidr");
            }
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpBootFilename(String dhcpBootFilename) {
            if (dhcpBootFilename == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "dhcpBootFilename");
            }
            this.dhcpBootFilename = dhcpBootFilename;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpBootNextServer(String dhcpBootNextServer) {
            if (dhcpBootNextServer == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "dhcpBootNextServer");
            }
            this.dhcpBootNextServer = dhcpBootNextServer;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpBootOptionsEnabled(Boolean dhcpBootOptionsEnabled) {
            if (dhcpBootOptionsEnabled == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "dhcpBootOptionsEnabled");
            }
            this.dhcpBootOptionsEnabled = dhcpBootOptionsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpHandling(String dhcpHandling) {
            if (dhcpHandling == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "dhcpHandling");
            }
            this.dhcpHandling = dhcpHandling;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpLeaseTime(String dhcpLeaseTime) {
            if (dhcpLeaseTime == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "dhcpLeaseTime");
            }
            this.dhcpLeaseTime = dhcpLeaseTime;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpOptions(List<GetApplianceVlansItemDhcpOption> dhcpOptions) {
            if (dhcpOptions == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "dhcpOptions");
            }
            this.dhcpOptions = dhcpOptions;
            return this;
        }
        public Builder dhcpOptions(GetApplianceVlansItemDhcpOption... dhcpOptions) {
            return dhcpOptions(List.of(dhcpOptions));
        }
        @CustomType.Setter
        public Builder dhcpRelayServerIps(List<String> dhcpRelayServerIps) {
            if (dhcpRelayServerIps == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "dhcpRelayServerIps");
            }
            this.dhcpRelayServerIps = dhcpRelayServerIps;
            return this;
        }
        public Builder dhcpRelayServerIps(String... dhcpRelayServerIps) {
            return dhcpRelayServerIps(List.of(dhcpRelayServerIps));
        }
        @CustomType.Setter
        public Builder dnsNameservers(String dnsNameservers) {
            if (dnsNameservers == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "dnsNameservers");
            }
            this.dnsNameservers = dnsNameservers;
            return this;
        }
        @CustomType.Setter
        public Builder fixedIpAssignments(String fixedIpAssignments) {
            if (fixedIpAssignments == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "fixedIpAssignments");
            }
            this.fixedIpAssignments = fixedIpAssignments;
            return this;
        }
        @CustomType.Setter
        public Builder groupPolicyId(String groupPolicyId) {
            if (groupPolicyId == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "groupPolicyId");
            }
            this.groupPolicyId = groupPolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceId(String interfaceId) {
            if (interfaceId == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "interfaceId");
            }
            this.interfaceId = interfaceId;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(GetApplianceVlansItemIpv6 ipv6) {
            if (ipv6 == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "ipv6");
            }
            this.ipv6 = ipv6;
            return this;
        }
        @CustomType.Setter
        public Builder mandatoryDhcp(GetApplianceVlansItemMandatoryDhcp mandatoryDhcp) {
            if (mandatoryDhcp == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "mandatoryDhcp");
            }
            this.mandatoryDhcp = mandatoryDhcp;
            return this;
        }
        @CustomType.Setter
        public Builder mask(Integer mask) {
            if (mask == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "mask");
            }
            this.mask = mask;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder reservedIpRanges(List<GetApplianceVlansItemReservedIpRange> reservedIpRanges) {
            if (reservedIpRanges == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "reservedIpRanges");
            }
            this.reservedIpRanges = reservedIpRanges;
            return this;
        }
        public Builder reservedIpRanges(GetApplianceVlansItemReservedIpRange... reservedIpRanges) {
            return reservedIpRanges(List.of(reservedIpRanges));
        }
        @CustomType.Setter
        public Builder subnet(String subnet) {
            if (subnet == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "subnet");
            }
            this.subnet = subnet;
            return this;
        }
        @CustomType.Setter
        public Builder templateVlanType(String templateVlanType) {
            if (templateVlanType == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "templateVlanType");
            }
            this.templateVlanType = templateVlanType;
            return this;
        }
        @CustomType.Setter
        public Builder vpnNatSubnet(String vpnNatSubnet) {
            if (vpnNatSubnet == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansItem", "vpnNatSubnet");
            }
            this.vpnNatSubnet = vpnNatSubnet;
            return this;
        }
        public GetApplianceVlansItem build() {
            final var _resultValue = new GetApplianceVlansItem();
            _resultValue.applianceIp = applianceIp;
            _resultValue.cidr = cidr;
            _resultValue.dhcpBootFilename = dhcpBootFilename;
            _resultValue.dhcpBootNextServer = dhcpBootNextServer;
            _resultValue.dhcpBootOptionsEnabled = dhcpBootOptionsEnabled;
            _resultValue.dhcpHandling = dhcpHandling;
            _resultValue.dhcpLeaseTime = dhcpLeaseTime;
            _resultValue.dhcpOptions = dhcpOptions;
            _resultValue.dhcpRelayServerIps = dhcpRelayServerIps;
            _resultValue.dnsNameservers = dnsNameservers;
            _resultValue.fixedIpAssignments = fixedIpAssignments;
            _resultValue.groupPolicyId = groupPolicyId;
            _resultValue.id = id;
            _resultValue.interfaceId = interfaceId;
            _resultValue.ipv6 = ipv6;
            _resultValue.mandatoryDhcp = mandatoryDhcp;
            _resultValue.mask = mask;
            _resultValue.name = name;
            _resultValue.reservedIpRanges = reservedIpRanges;
            _resultValue.subnet = subnet;
            _resultValue.templateVlanType = templateVlanType;
            _resultValue.vpnNatSubnet = vpnNatSubnet;
            return _resultValue;
        }
    }
}
