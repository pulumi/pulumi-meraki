// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SplitItemResultingNetwork {
    /**
     * @return Enrollment string for the network
     * 
     */
    private @Nullable String enrollmentString;
    /**
     * @return Network ID
     * 
     */
    private @Nullable String id;
    /**
     * @return If the network is bound to a config template
     * 
     */
    private @Nullable Boolean isBoundToConfigTemplate;
    /**
     * @return Network name
     * 
     */
    private @Nullable String name;
    /**
     * @return Notes for the network
     * 
     */
    private @Nullable String notes;
    /**
     * @return Organization ID
     * 
     */
    private @Nullable String organizationId;
    /**
     * @return List of the product types that the network supports
     * 
     */
    private @Nullable List<String> productTypes;
    /**
     * @return Network tags
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return Timezone of the network
     * 
     */
    private @Nullable String timeZone;
    /**
     * @return URL to the network Dashboard UI
     * 
     */
    private @Nullable String url;

    private SplitItemResultingNetwork() {}
    /**
     * @return Enrollment string for the network
     * 
     */
    public Optional<String> enrollmentString() {
        return Optional.ofNullable(this.enrollmentString);
    }
    /**
     * @return Network ID
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return If the network is bound to a config template
     * 
     */
    public Optional<Boolean> isBoundToConfigTemplate() {
        return Optional.ofNullable(this.isBoundToConfigTemplate);
    }
    /**
     * @return Network name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Notes for the network
     * 
     */
    public Optional<String> notes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * @return Organization ID
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }
    /**
     * @return List of the product types that the network supports
     * 
     */
    public List<String> productTypes() {
        return this.productTypes == null ? List.of() : this.productTypes;
    }
    /**
     * @return Network tags
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return Timezone of the network
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }
    /**
     * @return URL to the network Dashboard UI
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SplitItemResultingNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String enrollmentString;
        private @Nullable String id;
        private @Nullable Boolean isBoundToConfigTemplate;
        private @Nullable String name;
        private @Nullable String notes;
        private @Nullable String organizationId;
        private @Nullable List<String> productTypes;
        private @Nullable List<String> tags;
        private @Nullable String timeZone;
        private @Nullable String url;
        public Builder() {}
        public Builder(SplitItemResultingNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enrollmentString = defaults.enrollmentString;
    	      this.id = defaults.id;
    	      this.isBoundToConfigTemplate = defaults.isBoundToConfigTemplate;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.organizationId = defaults.organizationId;
    	      this.productTypes = defaults.productTypes;
    	      this.tags = defaults.tags;
    	      this.timeZone = defaults.timeZone;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder enrollmentString(@Nullable String enrollmentString) {

            this.enrollmentString = enrollmentString;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isBoundToConfigTemplate(@Nullable Boolean isBoundToConfigTemplate) {

            this.isBoundToConfigTemplate = isBoundToConfigTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notes(@Nullable String notes) {

            this.notes = notes;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(@Nullable String organizationId) {

            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder productTypes(@Nullable List<String> productTypes) {

            this.productTypes = productTypes;
            return this;
        }
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder timeZone(@Nullable String timeZone) {

            this.timeZone = timeZone;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public SplitItemResultingNetwork build() {
            final var _resultValue = new SplitItemResultingNetwork();
            _resultValue.enrollmentString = enrollmentString;
            _resultValue.id = id;
            _resultValue.isBoundToConfigTemplate = isBoundToConfigTemplate;
            _resultValue.name = name;
            _resultValue.notes = notes;
            _resultValue.organizationId = organizationId;
            _resultValue.productTypes = productTypes;
            _resultValue.tags = tags;
            _resultValue.timeZone = timeZone;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}