// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchRoutingMulticastRendezvousPointsItem {
    /**
     * @return The IP address of the interface to use.
     * 
     */
    private String interfaceIp;
    /**
     * @return The name of the interface to use.
     * 
     */
    private String interfaceName;
    /**
     * @return &#39;Any&#39;, or the IP address of a multicast group.
     * 
     */
    private String multicastGroup;
    /**
     * @return The id.
     * 
     */
    private String rendezvousPointId;
    /**
     * @return The serial.
     * 
     */
    private String serial;

    private GetSwitchRoutingMulticastRendezvousPointsItem() {}
    /**
     * @return The IP address of the interface to use.
     * 
     */
    public String interfaceIp() {
        return this.interfaceIp;
    }
    /**
     * @return The name of the interface to use.
     * 
     */
    public String interfaceName() {
        return this.interfaceName;
    }
    /**
     * @return &#39;Any&#39;, or the IP address of a multicast group.
     * 
     */
    public String multicastGroup() {
        return this.multicastGroup;
    }
    /**
     * @return The id.
     * 
     */
    public String rendezvousPointId() {
        return this.rendezvousPointId;
    }
    /**
     * @return The serial.
     * 
     */
    public String serial() {
        return this.serial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchRoutingMulticastRendezvousPointsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String interfaceIp;
        private String interfaceName;
        private String multicastGroup;
        private String rendezvousPointId;
        private String serial;
        public Builder() {}
        public Builder(GetSwitchRoutingMulticastRendezvousPointsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interfaceIp = defaults.interfaceIp;
    	      this.interfaceName = defaults.interfaceName;
    	      this.multicastGroup = defaults.multicastGroup;
    	      this.rendezvousPointId = defaults.rendezvousPointId;
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder interfaceIp(String interfaceIp) {
            if (interfaceIp == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastRendezvousPointsItem", "interfaceIp");
            }
            this.interfaceIp = interfaceIp;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceName(String interfaceName) {
            if (interfaceName == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastRendezvousPointsItem", "interfaceName");
            }
            this.interfaceName = interfaceName;
            return this;
        }
        @CustomType.Setter
        public Builder multicastGroup(String multicastGroup) {
            if (multicastGroup == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastRendezvousPointsItem", "multicastGroup");
            }
            this.multicastGroup = multicastGroup;
            return this;
        }
        @CustomType.Setter
        public Builder rendezvousPointId(String rendezvousPointId) {
            if (rendezvousPointId == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastRendezvousPointsItem", "rendezvousPointId");
            }
            this.rendezvousPointId = rendezvousPointId;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingMulticastRendezvousPointsItem", "serial");
            }
            this.serial = serial;
            return this;
        }
        public GetSwitchRoutingMulticastRendezvousPointsItem build() {
            final var _resultValue = new GetSwitchRoutingMulticastRendezvousPointsItem();
            _resultValue.interfaceIp = interfaceIp;
            _resultValue.interfaceName = interfaceName;
            _resultValue.multicastGroup = multicastGroup;
            _resultValue.rendezvousPointId = rendezvousPointId;
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}