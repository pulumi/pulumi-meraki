// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.SwitchDscpToCosMappingsMappingArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchDscpToCosMappingsState extends com.pulumi.resources.ResourceArgs {

    public static final SwitchDscpToCosMappingsState Empty = new SwitchDscpToCosMappingsState();

    /**
     * An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
     * 
     */
    @Import(name="mappings")
    private @Nullable Output<List<SwitchDscpToCosMappingsMappingArgs>> mappings;

    /**
     * @return An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
     * 
     */
    public Optional<Output<List<SwitchDscpToCosMappingsMappingArgs>>> mappings() {
        return Optional.ofNullable(this.mappings);
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

    private SwitchDscpToCosMappingsState() {}

    private SwitchDscpToCosMappingsState(SwitchDscpToCosMappingsState $) {
        this.mappings = $.mappings;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchDscpToCosMappingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchDscpToCosMappingsState $;

        public Builder() {
            $ = new SwitchDscpToCosMappingsState();
        }

        public Builder(SwitchDscpToCosMappingsState defaults) {
            $ = new SwitchDscpToCosMappingsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param mappings An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
         * 
         * @return builder
         * 
         */
        public Builder mappings(@Nullable Output<List<SwitchDscpToCosMappingsMappingArgs>> mappings) {
            $.mappings = mappings;
            return this;
        }

        /**
         * @param mappings An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
         * 
         * @return builder
         * 
         */
        public Builder mappings(List<SwitchDscpToCosMappingsMappingArgs> mappings) {
            return mappings(Output.of(mappings));
        }

        /**
         * @param mappings An array of DSCP to CoS mappings. An empty array will reset the mappings to default.
         * 
         * @return builder
         * 
         */
        public Builder mappings(SwitchDscpToCosMappingsMappingArgs... mappings) {
            return mappings(List.of(mappings));
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

        public SwitchDscpToCosMappingsState build() {
            return $;
        }
    }

}