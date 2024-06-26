// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrandingPoliciesCustomLogoImagePreview {
    /**
     * @return Timestamp of the preview image
     * 
     */
    private @Nullable String expiresAt;
    /**
     * @return Url of the preview image
     * 
     */
    private @Nullable String url;

    private BrandingPoliciesCustomLogoImagePreview() {}
    /**
     * @return Timestamp of the preview image
     * 
     */
    public Optional<String> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }
    /**
     * @return Url of the preview image
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandingPoliciesCustomLogoImagePreview defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expiresAt;
        private @Nullable String url;
        public Builder() {}
        public Builder(BrandingPoliciesCustomLogoImagePreview defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiresAt = defaults.expiresAt;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder expiresAt(@Nullable String expiresAt) {

            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public BrandingPoliciesCustomLogoImagePreview build() {
            final var _resultValue = new BrandingPoliciesCustomLogoImagePreview();
            _resultValue.expiresAt = expiresAt;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
