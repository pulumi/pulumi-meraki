// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.CellularGatewaySubnetPoolSubnetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CellularGatewaySubnetPoolState extends com.pulumi.resources.ResourceArgs {

    public static final CellularGatewaySubnetPoolState Empty = new CellularGatewaySubnetPoolState();

    /**
     * CIDR of the pool of subnets. Each MG in this network will automatically pick a subnet from this pool.
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return CIDR of the pool of subnets. Each MG in this network will automatically pick a subnet from this pool.
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    @Import(name="deploymentMode")
    private @Nullable Output<String> deploymentMode;

    public Optional<Output<String>> deploymentMode() {
        return Optional.ofNullable(this.deploymentMode);
    }

    /**
     * Mask used for the subnet of all MGs in  this network.
     * 
     */
    @Import(name="mask")
    private @Nullable Output<Integer> mask;

    /**
     * @return Mask used for the subnet of all MGs in  this network.
     * 
     */
    public Optional<Output<Integer>> mask() {
        return Optional.ofNullable(this.mask);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    @Import(name="subnets")
    private @Nullable Output<List<CellularGatewaySubnetPoolSubnetArgs>> subnets;

    public Optional<Output<List<CellularGatewaySubnetPoolSubnetArgs>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    private CellularGatewaySubnetPoolState() {}

    private CellularGatewaySubnetPoolState(CellularGatewaySubnetPoolState $) {
        this.cidr = $.cidr;
        this.deploymentMode = $.deploymentMode;
        this.mask = $.mask;
        this.networkId = $.networkId;
        this.subnets = $.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CellularGatewaySubnetPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CellularGatewaySubnetPoolState $;

        public Builder() {
            $ = new CellularGatewaySubnetPoolState();
        }

        public Builder(CellularGatewaySubnetPoolState defaults) {
            $ = new CellularGatewaySubnetPoolState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr CIDR of the pool of subnets. Each MG in this network will automatically pick a subnet from this pool.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr CIDR of the pool of subnets. Each MG in this network will automatically pick a subnet from this pool.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        public Builder deploymentMode(@Nullable Output<String> deploymentMode) {
            $.deploymentMode = deploymentMode;
            return this;
        }

        public Builder deploymentMode(String deploymentMode) {
            return deploymentMode(Output.of(deploymentMode));
        }

        /**
         * @param mask Mask used for the subnet of all MGs in  this network.
         * 
         * @return builder
         * 
         */
        public Builder mask(@Nullable Output<Integer> mask) {
            $.mask = mask;
            return this;
        }

        /**
         * @param mask Mask used for the subnet of all MGs in  this network.
         * 
         * @return builder
         * 
         */
        public Builder mask(Integer mask) {
            return mask(Output.of(mask));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public Builder subnets(@Nullable Output<List<CellularGatewaySubnetPoolSubnetArgs>> subnets) {
            $.subnets = subnets;
            return this;
        }

        public Builder subnets(List<CellularGatewaySubnetPoolSubnetArgs> subnets) {
            return subnets(Output.of(subnets));
        }

        public Builder subnets(CellularGatewaySubnetPoolSubnetArgs... subnets) {
            return subnets(List.of(subnets));
        }

        public CellularGatewaySubnetPoolState build() {
            return $;
        }
    }

}
