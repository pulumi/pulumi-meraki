// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetEarlyAccessFeaturesOptInsItemLimitScopeToNetwork;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEarlyAccessFeaturesOptInsItem {
    /**
     * @return Time when Early Access Feature was created
     * 
     */
    private String createdAt;
    /**
     * @return ID of Early Access Feature
     * 
     */
    private String id;
    /**
     * @return Networks assigned to the Early Access Feature
     * 
     */
    private List<GetEarlyAccessFeaturesOptInsItemLimitScopeToNetwork> limitScopeToNetworks;
    /**
     * @return Name of Early Access Feature
     * 
     */
    private String shortName;

    private GetEarlyAccessFeaturesOptInsItem() {}
    /**
     * @return Time when Early Access Feature was created
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return ID of Early Access Feature
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Networks assigned to the Early Access Feature
     * 
     */
    public List<GetEarlyAccessFeaturesOptInsItemLimitScopeToNetwork> limitScopeToNetworks() {
        return this.limitScopeToNetworks;
    }
    /**
     * @return Name of Early Access Feature
     * 
     */
    public String shortName() {
        return this.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEarlyAccessFeaturesOptInsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private String id;
        private List<GetEarlyAccessFeaturesOptInsItemLimitScopeToNetwork> limitScopeToNetworks;
        private String shortName;
        public Builder() {}
        public Builder(GetEarlyAccessFeaturesOptInsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.limitScopeToNetworks = defaults.limitScopeToNetworks;
    	      this.shortName = defaults.shortName;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesOptInsItem", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesOptInsItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder limitScopeToNetworks(List<GetEarlyAccessFeaturesOptInsItemLimitScopeToNetwork> limitScopeToNetworks) {
            if (limitScopeToNetworks == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesOptInsItem", "limitScopeToNetworks");
            }
            this.limitScopeToNetworks = limitScopeToNetworks;
            return this;
        }
        public Builder limitScopeToNetworks(GetEarlyAccessFeaturesOptInsItemLimitScopeToNetwork... limitScopeToNetworks) {
            return limitScopeToNetworks(List.of(limitScopeToNetworks));
        }
        @CustomType.Setter
        public Builder shortName(String shortName) {
            if (shortName == null) {
              throw new MissingRequiredPropertyException("GetEarlyAccessFeaturesOptInsItem", "shortName");
            }
            this.shortName = shortName;
            return this;
        }
        public GetEarlyAccessFeaturesOptInsItem build() {
            final var _resultValue = new GetEarlyAccessFeaturesOptInsItem();
            _resultValue.createdAt = createdAt;
            _resultValue.id = id;
            _resultValue.limitScopeToNetworks = limitScopeToNetworks;
            _resultValue.shortName = shortName;
            return _resultValue;
        }
    }
}