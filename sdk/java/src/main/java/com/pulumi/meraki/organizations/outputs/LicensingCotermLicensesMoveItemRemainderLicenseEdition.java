// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LicensingCotermLicensesMoveItemRemainderLicenseEdition {
    /**
     * @return The name of the license edition
     * 
     */
    private @Nullable String edition;
    /**
     * @return The product type of the license edition
     * 
     */
    private @Nullable String productType;

    private LicensingCotermLicensesMoveItemRemainderLicenseEdition() {}
    /**
     * @return The name of the license edition
     * 
     */
    public Optional<String> edition() {
        return Optional.ofNullable(this.edition);
    }
    /**
     * @return The product type of the license edition
     * 
     */
    public Optional<String> productType() {
        return Optional.ofNullable(this.productType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicensingCotermLicensesMoveItemRemainderLicenseEdition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String edition;
        private @Nullable String productType;
        public Builder() {}
        public Builder(LicensingCotermLicensesMoveItemRemainderLicenseEdition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edition = defaults.edition;
    	      this.productType = defaults.productType;
        }

        @CustomType.Setter
        public Builder edition(@Nullable String edition) {

            this.edition = edition;
            return this;
        }
        @CustomType.Setter
        public Builder productType(@Nullable String productType) {

            this.productType = productType;
            return this;
        }
        public LicensingCotermLicensesMoveItemRemainderLicenseEdition build() {
            final var _resultValue = new LicensingCotermLicensesMoveItemRemainderLicenseEdition();
            _resultValue.edition = edition;
            _resultValue.productType = productType;
            return _resultValue;
        }
    }
}