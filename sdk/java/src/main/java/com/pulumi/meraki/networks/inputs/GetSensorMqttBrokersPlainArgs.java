// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSensorMqttBrokersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSensorMqttBrokersPlainArgs Empty = new GetSensorMqttBrokersPlainArgs();

    /**
     * mqttBrokerId path parameter. Mqtt broker ID
     * 
     */
    @Import(name="mqttBrokerId")
    private @Nullable String mqttBrokerId;

    /**
     * @return mqttBrokerId path parameter. Mqtt broker ID
     * 
     */
    public Optional<String> mqttBrokerId() {
        return Optional.ofNullable(this.mqttBrokerId);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private GetSensorMqttBrokersPlainArgs() {}

    private GetSensorMqttBrokersPlainArgs(GetSensorMqttBrokersPlainArgs $) {
        this.mqttBrokerId = $.mqttBrokerId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSensorMqttBrokersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSensorMqttBrokersPlainArgs $;

        public Builder() {
            $ = new GetSensorMqttBrokersPlainArgs();
        }

        public Builder(GetSensorMqttBrokersPlainArgs defaults) {
            $ = new GetSensorMqttBrokersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mqttBrokerId mqttBrokerId path parameter. Mqtt broker ID
         * 
         * @return builder
         * 
         */
        public Builder mqttBrokerId(@Nullable String mqttBrokerId) {
            $.mqttBrokerId = mqttBrokerId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable String networkId) {
            $.networkId = networkId;
            return this;
        }

        public GetSensorMqttBrokersPlainArgs build() {
            return $;
        }
    }

}