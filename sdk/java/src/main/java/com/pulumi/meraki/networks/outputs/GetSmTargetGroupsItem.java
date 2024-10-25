// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSmTargetGroupsItem {
    /**
     * @return The ID of this target group.
     * 
     */
    private String id;
    /**
     * @return The name of this target group.
     * 
     */
    private String name;
    /**
     * @return The scope of the target group.
     * 
     */
    private String scope;
    /**
     * @return The tags of the target group.
     * 
     */
    private List<String> tags;

    private GetSmTargetGroupsItem() {}
    /**
     * @return The ID of this target group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of this target group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The scope of the target group.
     * 
     */
    public String scope() {
        return this.scope;
    }
    /**
     * @return The tags of the target group.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmTargetGroupsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String scope;
        private List<String> tags;
        public Builder() {}
        public Builder(GetSmTargetGroupsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSmTargetGroupsItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSmTargetGroupsItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            if (scope == null) {
              throw new MissingRequiredPropertyException("GetSmTargetGroupsItem", "scope");
            }
            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetSmTargetGroupsItem", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetSmTargetGroupsItem build() {
            final var _resultValue = new GetSmTargetGroupsItem();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.scope = scope;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
