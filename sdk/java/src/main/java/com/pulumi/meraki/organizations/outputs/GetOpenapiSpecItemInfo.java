// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOpenapiSpecItemInfo {
    private String description;
    private String title;
    private String version;

    private GetOpenapiSpecItemInfo() {}
    public String description() {
        return this.description;
    }
    public String title() {
        return this.title;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenapiSpecItemInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String title;
        private String version;
        public Builder() {}
        public Builder(GetOpenapiSpecItemInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.title = defaults.title;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetOpenapiSpecItemInfo", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            if (title == null) {
              throw new MissingRequiredPropertyException("GetOpenapiSpecItemInfo", "title");
            }
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetOpenapiSpecItemInfo", "version");
            }
            this.version = version;
            return this;
        }
        public GetOpenapiSpecItemInfo build() {
            final var _resultValue = new GetOpenapiSpecItemInfo();
            _resultValue.description = description;
            _resultValue.title = title;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
