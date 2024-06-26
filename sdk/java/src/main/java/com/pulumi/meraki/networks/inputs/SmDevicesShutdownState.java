// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.SmDevicesShutdownItemArgs;
import com.pulumi.meraki.networks.inputs.SmDevicesShutdownParametersArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SmDevicesShutdownState extends com.pulumi.resources.ResourceArgs {

    public static final SmDevicesShutdownState Empty = new SmDevicesShutdownState();

    @Import(name="item")
    private @Nullable Output<SmDevicesShutdownItemArgs> item;

    public Optional<Output<SmDevicesShutdownItemArgs>> item() {
        return Optional.ofNullable(this.item);
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

    @Import(name="parameters")
    private @Nullable Output<SmDevicesShutdownParametersArgs> parameters;

    public Optional<Output<SmDevicesShutdownParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private SmDevicesShutdownState() {}

    private SmDevicesShutdownState(SmDevicesShutdownState $) {
        this.item = $.item;
        this.networkId = $.networkId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmDevicesShutdownState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmDevicesShutdownState $;

        public Builder() {
            $ = new SmDevicesShutdownState();
        }

        public Builder(SmDevicesShutdownState defaults) {
            $ = new SmDevicesShutdownState(Objects.requireNonNull(defaults));
        }

        public Builder item(@Nullable Output<SmDevicesShutdownItemArgs> item) {
            $.item = item;
            return this;
        }

        public Builder item(SmDevicesShutdownItemArgs item) {
            return item(Output.of(item));
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

        public Builder parameters(@Nullable Output<SmDevicesShutdownParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(SmDevicesShutdownParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public SmDevicesShutdownState build() {
            return $;
        }
    }

}
