// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchPortsModule {
    /**
     * @return The model of the expansion module.
     * 
     */
    private @Nullable String model;

    private SwitchPortsModule() {}
    /**
     * @return The model of the expansion module.
     * 
     */
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchPortsModule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String model;
        public Builder() {}
        public Builder(SwitchPortsModule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
        }

        @CustomType.Setter
        public Builder model(@Nullable String model) {

            this.model = model;
            return this;
        }
        public SwitchPortsModule build() {
            final var _resultValue = new SwitchPortsModule();
            _resultValue.model = model;
            return _resultValue;
        }
    }
}
