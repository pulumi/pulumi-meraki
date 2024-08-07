// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SmDevicesMoveItem {
    /**
     * @return The Meraki Ids of the set of devices.
     * 
     */
    private @Nullable List<String> ids;
    /**
     * @return The network to which the devices was moved.
     * 
     */
    private @Nullable String newNetwork;

    private SmDevicesMoveItem() {}
    /**
     * @return The Meraki Ids of the set of devices.
     * 
     */
    public List<String> ids() {
        return this.ids == null ? List.of() : this.ids;
    }
    /**
     * @return The network to which the devices was moved.
     * 
     */
    public Optional<String> newNetwork() {
        return Optional.ofNullable(this.newNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmDevicesMoveItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> ids;
        private @Nullable String newNetwork;
        public Builder() {}
        public Builder(SmDevicesMoveItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ids = defaults.ids;
    	      this.newNetwork = defaults.newNetwork;
        }

        @CustomType.Setter
        public Builder ids(@Nullable List<String> ids) {

            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder newNetwork(@Nullable String newNetwork) {

            this.newNetwork = newNetwork;
            return this;
        }
        public SmDevicesMoveItem build() {
            final var _resultValue = new SmDevicesMoveItem();
            _resultValue.ids = ids;
            _resultValue.newNetwork = newNetwork;
            return _resultValue;
        }
    }
}
