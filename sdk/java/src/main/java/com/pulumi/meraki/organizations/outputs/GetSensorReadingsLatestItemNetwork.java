// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSensorReadingsLatestItemNetwork {
    /**
     * @return ID of the network.
     * 
     */
    private String id;
    /**
     * @return Name of the network.
     * 
     */
    private String name;

    private GetSensorReadingsLatestItemNetwork() {}
    /**
     * @return ID of the network.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the network.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorReadingsLatestItemNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetSensorReadingsLatestItemNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsLatestItemNetwork", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSensorReadingsLatestItemNetwork", "name");
            }
            this.name = name;
            return this;
        }
        public GetSensorReadingsLatestItemNetwork build() {
            final var _resultValue = new GetSensorReadingsLatestItemNetwork();
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}