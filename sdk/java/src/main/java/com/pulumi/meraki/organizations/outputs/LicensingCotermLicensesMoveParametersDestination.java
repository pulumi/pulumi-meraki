// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LicensingCotermLicensesMoveParametersDestination {
    /**
     * @return The claim mode of the moved license
     * 
     */
    private @Nullable String mode;
    /**
     * @return The organization to move the license to
     * 
     */
    private @Nullable String organizationId;

    private LicensingCotermLicensesMoveParametersDestination() {}
    /**
     * @return The claim mode of the moved license
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return The organization to move the license to
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicensingCotermLicensesMoveParametersDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mode;
        private @Nullable String organizationId;
        public Builder() {}
        public Builder(LicensingCotermLicensesMoveParametersDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.organizationId = defaults.organizationId;
        }

        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(@Nullable String organizationId) {

            this.organizationId = organizationId;
            return this;
        }
        public LicensingCotermLicensesMoveParametersDestination build() {
            final var _resultValue = new LicensingCotermLicensesMoveParametersDestination();
            _resultValue.mode = mode;
            _resultValue.organizationId = organizationId;
            return _resultValue;
        }
    }
}