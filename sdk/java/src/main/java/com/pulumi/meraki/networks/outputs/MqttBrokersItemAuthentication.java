// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MqttBrokersItemAuthentication {
    /**
     * @return Username for the MQTT broker.
     * 
     */
    private @Nullable String username;

    private MqttBrokersItemAuthentication() {}
    /**
     * @return Username for the MQTT broker.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MqttBrokersItemAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String username;
        public Builder() {}
        public Builder(MqttBrokersItemAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public MqttBrokersItemAuthentication build() {
            final var _resultValue = new MqttBrokersItemAuthentication();
            _resultValue.username = username;
            return _resultValue;
        }
    }
}