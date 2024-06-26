// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesPacketLossByClientItemClient;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesPacketLossByClientItemDownstream;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesPacketLossByClientItemNetwork;
import com.pulumi.meraki.organizations.outputs.GetWirelessDevicesPacketLossByClientItemUpstream;
import java.util.Objects;

@CustomType
public final class GetWirelessDevicesPacketLossByClientItem {
    /**
     * @return Client.
     * 
     */
    private GetWirelessDevicesPacketLossByClientItemClient client;
    /**
     * @return Packets sent from an AP to a client.
     * 
     */
    private GetWirelessDevicesPacketLossByClientItemDownstream downstream;
    /**
     * @return Network.
     * 
     */
    private GetWirelessDevicesPacketLossByClientItemNetwork network;
    /**
     * @return Packets sent from a client to an AP.
     * 
     */
    private GetWirelessDevicesPacketLossByClientItemUpstream upstream;

    private GetWirelessDevicesPacketLossByClientItem() {}
    /**
     * @return Client.
     * 
     */
    public GetWirelessDevicesPacketLossByClientItemClient client() {
        return this.client;
    }
    /**
     * @return Packets sent from an AP to a client.
     * 
     */
    public GetWirelessDevicesPacketLossByClientItemDownstream downstream() {
        return this.downstream;
    }
    /**
     * @return Network.
     * 
     */
    public GetWirelessDevicesPacketLossByClientItemNetwork network() {
        return this.network;
    }
    /**
     * @return Packets sent from a client to an AP.
     * 
     */
    public GetWirelessDevicesPacketLossByClientItemUpstream upstream() {
        return this.upstream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessDevicesPacketLossByClientItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetWirelessDevicesPacketLossByClientItemClient client;
        private GetWirelessDevicesPacketLossByClientItemDownstream downstream;
        private GetWirelessDevicesPacketLossByClientItemNetwork network;
        private GetWirelessDevicesPacketLossByClientItemUpstream upstream;
        public Builder() {}
        public Builder(GetWirelessDevicesPacketLossByClientItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.client = defaults.client;
    	      this.downstream = defaults.downstream;
    	      this.network = defaults.network;
    	      this.upstream = defaults.upstream;
        }

        @CustomType.Setter
        public Builder client(GetWirelessDevicesPacketLossByClientItemClient client) {
            if (client == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByClientItem", "client");
            }
            this.client = client;
            return this;
        }
        @CustomType.Setter
        public Builder downstream(GetWirelessDevicesPacketLossByClientItemDownstream downstream) {
            if (downstream == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByClientItem", "downstream");
            }
            this.downstream = downstream;
            return this;
        }
        @CustomType.Setter
        public Builder network(GetWirelessDevicesPacketLossByClientItemNetwork network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByClientItem", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder upstream(GetWirelessDevicesPacketLossByClientItemUpstream upstream) {
            if (upstream == null) {
              throw new MissingRequiredPropertyException("GetWirelessDevicesPacketLossByClientItem", "upstream");
            }
            this.upstream = upstream;
            return this;
        }
        public GetWirelessDevicesPacketLossByClientItem build() {
            final var _resultValue = new GetWirelessDevicesPacketLossByClientItem();
            _resultValue.client = client;
            _resultValue.downstream = downstream;
            _resultValue.network = network;
            _resultValue.upstream = upstream;
            return _resultValue;
        }
    }
}
