// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringPrepareItemConfigParamsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryOnboardingCloudMonitoringPrepareItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryOnboardingCloudMonitoringPrepareItemArgs Empty = new InventoryOnboardingCloudMonitoringPrepareItemArgs();

    /**
     * Params used in order to connect to the device
     * 
     */
    @Import(name="configParams")
    private @Nullable Output<InventoryOnboardingCloudMonitoringPrepareItemConfigParamsArgs> configParams;

    /**
     * @return Params used in order to connect to the device
     * 
     */
    public Optional<Output<InventoryOnboardingCloudMonitoringPrepareItemConfigParamsArgs>> configParams() {
        return Optional.ofNullable(this.configParams);
    }

    /**
     * Import ID from the Import operation
     * 
     */
    @Import(name="deviceId")
    private @Nullable Output<String> deviceId;

    /**
     * @return Import ID from the Import operation
     * 
     */
    public Optional<Output<String>> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }

    /**
     * Message related to whether or not the device was found and can be imported.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Message related to whether or not the device was found and can be imported.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * The import status of the device
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The import status of the device
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Device UDI certificate
     * 
     */
    @Import(name="udi")
    private @Nullable Output<String> udi;

    /**
     * @return Device UDI certificate
     * 
     */
    public Optional<Output<String>> udi() {
        return Optional.ofNullable(this.udi);
    }

    private InventoryOnboardingCloudMonitoringPrepareItemArgs() {}

    private InventoryOnboardingCloudMonitoringPrepareItemArgs(InventoryOnboardingCloudMonitoringPrepareItemArgs $) {
        this.configParams = $.configParams;
        this.deviceId = $.deviceId;
        this.message = $.message;
        this.status = $.status;
        this.udi = $.udi;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryOnboardingCloudMonitoringPrepareItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryOnboardingCloudMonitoringPrepareItemArgs $;

        public Builder() {
            $ = new InventoryOnboardingCloudMonitoringPrepareItemArgs();
        }

        public Builder(InventoryOnboardingCloudMonitoringPrepareItemArgs defaults) {
            $ = new InventoryOnboardingCloudMonitoringPrepareItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configParams Params used in order to connect to the device
         * 
         * @return builder
         * 
         */
        public Builder configParams(@Nullable Output<InventoryOnboardingCloudMonitoringPrepareItemConfigParamsArgs> configParams) {
            $.configParams = configParams;
            return this;
        }

        /**
         * @param configParams Params used in order to connect to the device
         * 
         * @return builder
         * 
         */
        public Builder configParams(InventoryOnboardingCloudMonitoringPrepareItemConfigParamsArgs configParams) {
            return configParams(Output.of(configParams));
        }

        /**
         * @param deviceId Import ID from the Import operation
         * 
         * @return builder
         * 
         */
        public Builder deviceId(@Nullable Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param deviceId Import ID from the Import operation
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        /**
         * @param message Message related to whether or not the device was found and can be imported.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Message related to whether or not the device was found and can be imported.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param status The import status of the device
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The import status of the device
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param udi Device UDI certificate
         * 
         * @return builder
         * 
         */
        public Builder udi(@Nullable Output<String> udi) {
            $.udi = udi;
            return this;
        }

        /**
         * @param udi Device UDI certificate
         * 
         * @return builder
         * 
         */
        public Builder udi(String udi) {
            return udi(Output.of(udi));
        }

        public InventoryOnboardingCloudMonitoringPrepareItemArgs build() {
            return $;
        }
    }

}
