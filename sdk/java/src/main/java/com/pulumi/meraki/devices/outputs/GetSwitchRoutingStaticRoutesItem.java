// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchRoutingStaticRoutesItem {
    /**
     * @return Option to advertise static routes via OSPF
     * 
     */
    private Boolean advertiseViaOspfEnabled;
    /**
     * @return The name or description of the layer 3 static route
     * 
     */
    private String name;
    /**
     * @return The IP address of the router to which traffic for this destination network should be sent
     * 
     */
    private String nextHopIp;
    /**
     * @return Option to prefer static routes over OSPF routes
     * 
     */
    private Boolean preferOverOspfRoutesEnabled;
    /**
     * @return The identifier of a layer 3 static route
     * 
     */
    private String staticRouteId;
    /**
     * @return The IP address of the subnetwork specified in CIDR notation (ex. 1.2.3.0/24)
     * 
     */
    private String subnet;

    private GetSwitchRoutingStaticRoutesItem() {}
    /**
     * @return Option to advertise static routes via OSPF
     * 
     */
    public Boolean advertiseViaOspfEnabled() {
        return this.advertiseViaOspfEnabled;
    }
    /**
     * @return The name or description of the layer 3 static route
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The IP address of the router to which traffic for this destination network should be sent
     * 
     */
    public String nextHopIp() {
        return this.nextHopIp;
    }
    /**
     * @return Option to prefer static routes over OSPF routes
     * 
     */
    public Boolean preferOverOspfRoutesEnabled() {
        return this.preferOverOspfRoutesEnabled;
    }
    /**
     * @return The identifier of a layer 3 static route
     * 
     */
    public String staticRouteId() {
        return this.staticRouteId;
    }
    /**
     * @return The IP address of the subnetwork specified in CIDR notation (ex. 1.2.3.0/24)
     * 
     */
    public String subnet() {
        return this.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchRoutingStaticRoutesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean advertiseViaOspfEnabled;
        private String name;
        private String nextHopIp;
        private Boolean preferOverOspfRoutesEnabled;
        private String staticRouteId;
        private String subnet;
        public Builder() {}
        public Builder(GetSwitchRoutingStaticRoutesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseViaOspfEnabled = defaults.advertiseViaOspfEnabled;
    	      this.name = defaults.name;
    	      this.nextHopIp = defaults.nextHopIp;
    	      this.preferOverOspfRoutesEnabled = defaults.preferOverOspfRoutesEnabled;
    	      this.staticRouteId = defaults.staticRouteId;
    	      this.subnet = defaults.subnet;
        }

        @CustomType.Setter
        public Builder advertiseViaOspfEnabled(Boolean advertiseViaOspfEnabled) {
            if (advertiseViaOspfEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingStaticRoutesItem", "advertiseViaOspfEnabled");
            }
            this.advertiseViaOspfEnabled = advertiseViaOspfEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingStaticRoutesItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nextHopIp(String nextHopIp) {
            if (nextHopIp == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingStaticRoutesItem", "nextHopIp");
            }
            this.nextHopIp = nextHopIp;
            return this;
        }
        @CustomType.Setter
        public Builder preferOverOspfRoutesEnabled(Boolean preferOverOspfRoutesEnabled) {
            if (preferOverOspfRoutesEnabled == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingStaticRoutesItem", "preferOverOspfRoutesEnabled");
            }
            this.preferOverOspfRoutesEnabled = preferOverOspfRoutesEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder staticRouteId(String staticRouteId) {
            if (staticRouteId == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingStaticRoutesItem", "staticRouteId");
            }
            this.staticRouteId = staticRouteId;
            return this;
        }
        @CustomType.Setter
        public Builder subnet(String subnet) {
            if (subnet == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingStaticRoutesItem", "subnet");
            }
            this.subnet = subnet;
            return this;
        }
        public GetSwitchRoutingStaticRoutesItem build() {
            final var _resultValue = new GetSwitchRoutingStaticRoutesItem();
            _resultValue.advertiseViaOspfEnabled = advertiseViaOspfEnabled;
            _resultValue.name = name;
            _resultValue.nextHopIp = nextHopIp;
            _resultValue.preferOverOspfRoutesEnabled = preferOverOspfRoutesEnabled;
            _resultValue.staticRouteId = staticRouteId;
            _resultValue.subnet = subnet;
            return _resultValue;
        }
    }
}