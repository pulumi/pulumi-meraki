// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetCellularGatewayConnectivityMonitoringDestinationsItemDestination;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCellularGatewayConnectivityMonitoringDestinationsItem {
    private List<GetCellularGatewayConnectivityMonitoringDestinationsItemDestination> destinations;

    private GetCellularGatewayConnectivityMonitoringDestinationsItem() {}
    public List<GetCellularGatewayConnectivityMonitoringDestinationsItemDestination> destinations() {
        return this.destinations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellularGatewayConnectivityMonitoringDestinationsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCellularGatewayConnectivityMonitoringDestinationsItemDestination> destinations;
        public Builder() {}
        public Builder(GetCellularGatewayConnectivityMonitoringDestinationsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
        }

        @CustomType.Setter
        public Builder destinations(List<GetCellularGatewayConnectivityMonitoringDestinationsItemDestination> destinations) {
            if (destinations == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayConnectivityMonitoringDestinationsItem", "destinations");
            }
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(GetCellularGatewayConnectivityMonitoringDestinationsItemDestination... destinations) {
            return destinations(List.of(destinations));
        }
        public GetCellularGatewayConnectivityMonitoringDestinationsItem build() {
            final var _resultValue = new GetCellularGatewayConnectivityMonitoringDestinationsItem();
            _resultValue.destinations = destinations;
            return _resultValue;
        }
    }
}
