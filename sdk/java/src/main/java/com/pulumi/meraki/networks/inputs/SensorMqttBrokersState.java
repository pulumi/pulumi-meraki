// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SensorMqttBrokersState extends com.pulumi.resources.ResourceArgs {

    public static final SensorMqttBrokersState Empty = new SensorMqttBrokersState();

    /**
     * Specifies whether the broker is enabled for sensor data. Currently, only a single broker may be enabled for sensor data.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether the broker is enabled for sensor data. Currently, only a single broker may be enabled for sensor data.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * ID of the MQTT Broker.
     * 
     */
    @Import(name="mqttBrokerId")
    private @Nullable Output<String> mqttBrokerId;

    /**
     * @return ID of the MQTT Broker.
     * 
     */
    public Optional<Output<String>> mqttBrokerId() {
        return Optional.ofNullable(this.mqttBrokerId);
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

    private SensorMqttBrokersState() {}

    private SensorMqttBrokersState(SensorMqttBrokersState $) {
        this.enabled = $.enabled;
        this.mqttBrokerId = $.mqttBrokerId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SensorMqttBrokersState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SensorMqttBrokersState $;

        public Builder() {
            $ = new SensorMqttBrokersState();
        }

        public Builder(SensorMqttBrokersState defaults) {
            $ = new SensorMqttBrokersState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Specifies whether the broker is enabled for sensor data. Currently, only a single broker may be enabled for sensor data.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether the broker is enabled for sensor data. Currently, only a single broker may be enabled for sensor data.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param mqttBrokerId ID of the MQTT Broker.
         * 
         * @return builder
         * 
         */
        public Builder mqttBrokerId(@Nullable Output<String> mqttBrokerId) {
            $.mqttBrokerId = mqttBrokerId;
            return this;
        }

        /**
         * @param mqttBrokerId ID of the MQTT Broker.
         * 
         * @return builder
         * 
         */
        public Builder mqttBrokerId(String mqttBrokerId) {
            return mqttBrokerId(Output.of(mqttBrokerId));
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

        public SensorMqttBrokersState build() {
            return $;
        }
    }

}