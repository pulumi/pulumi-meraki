// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPolicyObjectsItem {
    /**
     * @return Category of a policy object (one of: adaptivePolicy, network)
     * 
     */
    private String category;
    /**
     * @return CIDR Value of a policy object
     * 
     */
    private String cidr;
    /**
     * @return Time Stamp of policy object creation.
     * 
     */
    private String createdAt;
    /**
     * @return The IDs of policy object groups the policy object belongs to.
     * 
     */
    private List<String> groupIds;
    /**
     * @return Policy object ID
     * 
     */
    private String id;
    /**
     * @return Name of policy object (alphanumeric, space, dash, or underscore characters only).
     * 
     */
    private String name;
    /**
     * @return The IDs of the networks that use the policy object.
     * 
     */
    private List<String> networkIds;
    /**
     * @return Type of a policy object (one of: adaptivePolicyIpv4Cidr, cidr, fqdn, ipAndMask)
     * 
     */
    private String type;
    /**
     * @return Time Stamp of policy object updation.
     * 
     */
    private String updatedAt;

    private GetPolicyObjectsItem() {}
    /**
     * @return Category of a policy object (one of: adaptivePolicy, network)
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return CIDR Value of a policy object
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    /**
     * @return Time Stamp of policy object creation.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The IDs of policy object groups the policy object belongs to.
     * 
     */
    public List<String> groupIds() {
        return this.groupIds;
    }
    /**
     * @return Policy object ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of policy object (alphanumeric, space, dash, or underscore characters only).
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The IDs of the networks that use the policy object.
     * 
     */
    public List<String> networkIds() {
        return this.networkIds;
    }
    /**
     * @return Type of a policy object (one of: adaptivePolicyIpv4Cidr, cidr, fqdn, ipAndMask)
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Time Stamp of policy object updation.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyObjectsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String category;
        private String cidr;
        private String createdAt;
        private List<String> groupIds;
        private String id;
        private String name;
        private List<String> networkIds;
        private String type;
        private String updatedAt;
        public Builder() {}
        public Builder(GetPolicyObjectsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.cidr = defaults.cidr;
    	      this.createdAt = defaults.createdAt;
    	      this.groupIds = defaults.groupIds;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.networkIds = defaults.networkIds;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder category(String category) {
            if (category == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsItem", "category");
            }
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder cidr(String cidr) {
            if (cidr == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsItem", "cidr");
            }
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsItem", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder groupIds(List<String> groupIds) {
            if (groupIds == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsItem", "groupIds");
            }
            this.groupIds = groupIds;
            return this;
        }
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkIds(List<String> networkIds) {
            if (networkIds == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsItem", "networkIds");
            }
            this.networkIds = networkIds;
            return this;
        }
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsItem", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetPolicyObjectsItem", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        public GetPolicyObjectsItem build() {
            final var _resultValue = new GetPolicyObjectsItem();
            _resultValue.category = category;
            _resultValue.cidr = cidr;
            _resultValue.createdAt = createdAt;
            _resultValue.groupIds = groupIds;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.networkIds = networkIds;
            _resultValue.type = type;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}