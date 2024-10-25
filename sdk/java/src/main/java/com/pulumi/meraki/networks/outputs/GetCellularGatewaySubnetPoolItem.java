// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetCellularGatewaySubnetPoolItemSubnet;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCellularGatewaySubnetPoolItem {
    private String cidr;
    private String deploymentMode;
    private Integer mask;
    private List<GetCellularGatewaySubnetPoolItemSubnet> subnets;

    private GetCellularGatewaySubnetPoolItem() {}
    public String cidr() {
        return this.cidr;
    }
    public String deploymentMode() {
        return this.deploymentMode;
    }
    public Integer mask() {
        return this.mask;
    }
    public List<GetCellularGatewaySubnetPoolItemSubnet> subnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellularGatewaySubnetPoolItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidr;
        private String deploymentMode;
        private Integer mask;
        private List<GetCellularGatewaySubnetPoolItemSubnet> subnets;
        public Builder() {}
        public Builder(GetCellularGatewaySubnetPoolItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.deploymentMode = defaults.deploymentMode;
    	      this.mask = defaults.mask;
    	      this.subnets = defaults.subnets;
        }

        @CustomType.Setter
        public Builder cidr(String cidr) {
            if (cidr == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolItem", "cidr");
            }
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder deploymentMode(String deploymentMode) {
            if (deploymentMode == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolItem", "deploymentMode");
            }
            this.deploymentMode = deploymentMode;
            return this;
        }
        @CustomType.Setter
        public Builder mask(Integer mask) {
            if (mask == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolItem", "mask");
            }
            this.mask = mask;
            return this;
        }
        @CustomType.Setter
        public Builder subnets(List<GetCellularGatewaySubnetPoolItemSubnet> subnets) {
            if (subnets == null) {
              throw new MissingRequiredPropertyException("GetCellularGatewaySubnetPoolItem", "subnets");
            }
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(GetCellularGatewaySubnetPoolItemSubnet... subnets) {
            return subnets(List.of(subnets));
        }
        public GetCellularGatewaySubnetPoolItem build() {
            final var _resultValue = new GetCellularGatewaySubnetPoolItem();
            _resultValue.cidr = cidr;
            _resultValue.deploymentMode = deploymentMode;
            _resultValue.mask = mask;
            _resultValue.subnets = subnets;
            return _resultValue;
        }
    }
}
