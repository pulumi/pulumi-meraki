// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCameraPermissionsItem {
    /**
     * @return Permission scope id
     * 
     */
    private String id;
    /**
     * @return Permission scope level
     * 
     */
    private String level;
    /**
     * @return Name of permission scope
     * 
     */
    private String name;

    private GetCameraPermissionsItem() {}
    /**
     * @return Permission scope id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Permission scope level
     * 
     */
    public String level() {
        return this.level;
    }
    /**
     * @return Name of permission scope
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCameraPermissionsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String level;
        private String name;
        public Builder() {}
        public Builder(GetCameraPermissionsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.level = defaults.level;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCameraPermissionsItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder level(String level) {
            if (level == null) {
              throw new MissingRequiredPropertyException("GetCameraPermissionsItem", "level");
            }
            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCameraPermissionsItem", "name");
            }
            this.name = name;
            return this;
        }
        public GetCameraPermissionsItem build() {
            final var _resultValue = new GetCameraPermissionsItem();
            _resultValue.id = id;
            _resultValue.level = level;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
