// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BlinkLedsParameters {
    /**
     * @return The duration in seconds. Must be between 5 and 120. Default is 20 seconds
     * 
     */
    private @Nullable Integer duration;
    /**
     * @return The duty cycle as the percent active. Must be between 10 and 90. Default is 50.
     * 
     */
    private @Nullable Integer duty;
    /**
     * @return The period in milliseconds. Must be between 100 and 1000. Default is 160 milliseconds
     * 
     */
    private @Nullable Integer period;

    private BlinkLedsParameters() {}
    /**
     * @return The duration in seconds. Must be between 5 and 120. Default is 20 seconds
     * 
     */
    public Optional<Integer> duration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * @return The duty cycle as the percent active. Must be between 10 and 90. Default is 50.
     * 
     */
    public Optional<Integer> duty() {
        return Optional.ofNullable(this.duty);
    }
    /**
     * @return The period in milliseconds. Must be between 100 and 1000. Default is 160 milliseconds
     * 
     */
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlinkLedsParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer duration;
        private @Nullable Integer duty;
        private @Nullable Integer period;
        public Builder() {}
        public Builder(BlinkLedsParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.duty = defaults.duty;
    	      this.period = defaults.period;
        }

        @CustomType.Setter
        public Builder duration(@Nullable Integer duration) {

            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder duty(@Nullable Integer duty) {

            this.duty = duty;
            return this;
        }
        @CustomType.Setter
        public Builder period(@Nullable Integer period) {

            this.period = period;
            return this;
        }
        public BlinkLedsParameters build() {
            final var _resultValue = new BlinkLedsParameters();
            _resultValue.duration = duration;
            _resultValue.duty = duty;
            _resultValue.period = period;
            return _resultValue;
        }
    }
}
