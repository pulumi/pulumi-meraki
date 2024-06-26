// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirmwareUpgradesStagedStagesItemGroup {
    /**
     * @return Description of the Staged Upgrade Group
     * 
     */
    private String description;
    /**
     * @return Id of the Staged Upgrade Group
     * 
     */
    private String id;
    /**
     * @return Name of the Staged Upgrade Group
     * 
     */
    private String name;

    private GetFirmwareUpgradesStagedStagesItemGroup() {}
    /**
     * @return Description of the Staged Upgrade Group
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Id of the Staged Upgrade Group
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the Staged Upgrade Group
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesStagedStagesItemGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetFirmwareUpgradesStagedStagesItemGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesStagedStagesItemGroup", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesStagedStagesItemGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesStagedStagesItemGroup", "name");
            }
            this.name = name;
            return this;
        }
        public GetFirmwareUpgradesStagedStagesItemGroup build() {
            final var _resultValue = new GetFirmwareUpgradesStagedStagesItemGroup();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
