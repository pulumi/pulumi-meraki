// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetCellularGatewayUplinkStatusesItemUplink;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCellularGatewayUplinkStatusesItem {
    /**
     * @return Last reported time for the device
     * 
     */
    private String lastReportedAt;
    /**
     * @return Device model
     * 
     */
    private String model;
    /**
     * @return Network Id
     * 
     */
    private String networkId;
    /**
     * @return Serial number of the device
     * 
     */
    private String serial;
    /**
     * @return Uplinks info
     * 
     */
    private List<GetCellularGatewayUplinkStatusesItemUplink> uplinks;

    private GetCellularGatewayUplinkStatusesItem() {}
    /**
     * @return Last reported time for the device
     * 
     */
    public String lastReportedAt() {
        return this.lastReportedAt;
    }
    /**
     * @return Device model
     * 
     */
    public String model() {
        return this.model;
    }
    /**
     * @return Network Id
     * 
     */
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return Serial number of the device
     * 
     */
    public String serial() {
        return this.serial;
    }
    /**
     * @return Uplinks info
     * 
     */
    public List<GetCellularGatewayUplinkStatusesItemUplink> uplinks() {
        return this.uplinks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellularGatewayUplinkStatusesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String lastReportedAt;
        private String model;
        private String networkId;
        private String serial;
        private List<GetCellularGatewayUplinkStatusesItemUplink> uplinks;
        public Builder() {}
        public Builder(GetCellularGatewayUplinkStatusesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastReportedAt = defaults.lastReportedAt;
    	      this.model = defaults.model;
    	      this.networkId = defaults.networkId;
    	      this.serial = defaults.serial;
    	      this.uplinks = defaults.uplinks;
        }

        @CustomType.Setter
        public Builder lastReportedAt(String lastReportedAt) {
            if (lastReportedAt == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayUplinkStatusesItem", "lastReportedAt");
            }
            this.lastReportedAt = lastReportedAt;
            return this;
        }
        @CustomType.Setter
        public Builder model(String model) {
            if (model == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayUplinkStatusesItem", "model");
            }
            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayUplinkStatusesItem", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayUplinkStatusesItem", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder uplinks(List<GetCellularGatewayUplinkStatusesItemUplink> uplinks) {
            if (uplinks == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewayUplinkStatusesItem", "uplinks");
            }
            this.uplinks = uplinks;
            return this;
        }
        public Builder uplinks(GetCellularGatewayUplinkStatusesItemUplink... uplinks) {
            return uplinks(List.of(uplinks));
        }
        public GetCellularGatewayUplinkStatusesItem build() {
            final var _resultValue = new GetCellularGatewayUplinkStatusesItem();
            _resultValue.lastReportedAt = lastReportedAt;
            _resultValue.model = model;
            _resultValue.networkId = networkId;
            _resultValue.serial = serial;
            _resultValue.uplinks = uplinks;
            return _resultValue;
        }
    }
}