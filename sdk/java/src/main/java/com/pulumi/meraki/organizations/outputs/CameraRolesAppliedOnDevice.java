// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CameraRolesAppliedOnDevice {
    /**
     * @return Device id.
     * 
     */
    private @Nullable String id;
    /**
     * @return Network id scope
     * 
     */
    private @Nullable String inNetworksWithId;
    /**
     * @return Network tag scope
     * 
     */
    private @Nullable String inNetworksWithTag;
    private @Nullable String permissionLevel;
    private @Nullable String permissionScope;
    /**
     * @return Permission scope id
     * 
     */
    private @Nullable String permissionScopeId;
    /**
     * @return Device tag.
     * 
     */
    private @Nullable String tag;

    private CameraRolesAppliedOnDevice() {}
    /**
     * @return Device id.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Network id scope
     * 
     */
    public Optional<String> inNetworksWithId() {
        return Optional.ofNullable(this.inNetworksWithId);
    }
    /**
     * @return Network tag scope
     * 
     */
    public Optional<String> inNetworksWithTag() {
        return Optional.ofNullable(this.inNetworksWithTag);
    }
    public Optional<String> permissionLevel() {
        return Optional.ofNullable(this.permissionLevel);
    }
    public Optional<String> permissionScope() {
        return Optional.ofNullable(this.permissionScope);
    }
    /**
     * @return Permission scope id
     * 
     */
    public Optional<String> permissionScopeId() {
        return Optional.ofNullable(this.permissionScopeId);
    }
    /**
     * @return Device tag.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CameraRolesAppliedOnDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String inNetworksWithId;
        private @Nullable String inNetworksWithTag;
        private @Nullable String permissionLevel;
        private @Nullable String permissionScope;
        private @Nullable String permissionScopeId;
        private @Nullable String tag;
        public Builder() {}
        public Builder(CameraRolesAppliedOnDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.inNetworksWithId = defaults.inNetworksWithId;
    	      this.inNetworksWithTag = defaults.inNetworksWithTag;
    	      this.permissionLevel = defaults.permissionLevel;
    	      this.permissionScope = defaults.permissionScope;
    	      this.permissionScopeId = defaults.permissionScopeId;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder inNetworksWithId(@Nullable String inNetworksWithId) {

            this.inNetworksWithId = inNetworksWithId;
            return this;
        }
        @CustomType.Setter
        public Builder inNetworksWithTag(@Nullable String inNetworksWithTag) {

            this.inNetworksWithTag = inNetworksWithTag;
            return this;
        }
        @CustomType.Setter
        public Builder permissionLevel(@Nullable String permissionLevel) {

            this.permissionLevel = permissionLevel;
            return this;
        }
        @CustomType.Setter
        public Builder permissionScope(@Nullable String permissionScope) {

            this.permissionScope = permissionScope;
            return this;
        }
        @CustomType.Setter
        public Builder permissionScopeId(@Nullable String permissionScopeId) {

            this.permissionScopeId = permissionScopeId;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable String tag) {

            this.tag = tag;
            return this;
        }
        public CameraRolesAppliedOnDevice build() {
            final var _resultValue = new CameraRolesAppliedOnDevice();
            _resultValue.id = id;
            _resultValue.inNetworksWithId = inNetworksWithId;
            _resultValue.inNetworksWithTag = inNetworksWithTag;
            _resultValue.permissionLevel = permissionLevel;
            _resultValue.permissionScope = permissionScope;
            _resultValue.permissionScopeId = permissionScopeId;
            _resultValue.tag = tag;
            return _resultValue;
        }
    }
}