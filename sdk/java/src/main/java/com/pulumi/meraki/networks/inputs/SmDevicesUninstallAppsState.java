// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.SmDevicesUninstallAppsParametersArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SmDevicesUninstallAppsState extends com.pulumi.resources.ResourceArgs {

    public static final SmDevicesUninstallAppsState Empty = new SmDevicesUninstallAppsState();

    /**
     * deviceId path parameter. Device ID
     * 
     */
    @Import(name="deviceId")
    private @Nullable Output<String> deviceId;

    /**
     * @return deviceId path parameter. Device ID
     * 
     */
    public Optional<Output<String>> deviceId() {
        return Optional.ofNullable(this.deviceId);
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
    private @Nullable Output<SmDevicesUninstallAppsParametersArgs> parameters;

    public Optional<Output<SmDevicesUninstallAppsParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private SmDevicesUninstallAppsState() {}

    private SmDevicesUninstallAppsState(SmDevicesUninstallAppsState $) {
        this.deviceId = $.deviceId;
        this.networkId = $.networkId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmDevicesUninstallAppsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmDevicesUninstallAppsState $;

        public Builder() {
            $ = new SmDevicesUninstallAppsState();
        }

        public Builder(SmDevicesUninstallAppsState defaults) {
            $ = new SmDevicesUninstallAppsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId deviceId path parameter. Device ID
         * 
         * @return builder
         * 
         */
        public Builder deviceId(@Nullable Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param deviceId deviceId path parameter. Device ID
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
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

        public Builder parameters(@Nullable Output<SmDevicesUninstallAppsParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(SmDevicesUninstallAppsParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public SmDevicesUninstallAppsState build() {
            return $;
        }
    }

}
