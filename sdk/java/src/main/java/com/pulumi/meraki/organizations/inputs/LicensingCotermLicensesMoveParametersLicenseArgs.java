// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.LicensingCotermLicensesMoveParametersLicenseCountArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicensingCotermLicensesMoveParametersLicenseArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicensingCotermLicensesMoveParametersLicenseArgs Empty = new LicensingCotermLicensesMoveParametersLicenseArgs();

    /**
     * The counts to move from the license by model type
     * 
     */
    @Import(name="counts")
    private @Nullable Output<List<LicensingCotermLicensesMoveParametersLicenseCountArgs>> counts;

    /**
     * @return The counts to move from the license by model type
     * 
     */
    public Optional<Output<List<LicensingCotermLicensesMoveParametersLicenseCountArgs>>> counts() {
        return Optional.ofNullable(this.counts);
    }

    /**
     * The license key to move counts from
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The license key to move counts from
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    private LicensingCotermLicensesMoveParametersLicenseArgs() {}

    private LicensingCotermLicensesMoveParametersLicenseArgs(LicensingCotermLicensesMoveParametersLicenseArgs $) {
        this.counts = $.counts;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensingCotermLicensesMoveParametersLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensingCotermLicensesMoveParametersLicenseArgs $;

        public Builder() {
            $ = new LicensingCotermLicensesMoveParametersLicenseArgs();
        }

        public Builder(LicensingCotermLicensesMoveParametersLicenseArgs defaults) {
            $ = new LicensingCotermLicensesMoveParametersLicenseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param counts The counts to move from the license by model type
         * 
         * @return builder
         * 
         */
        public Builder counts(@Nullable Output<List<LicensingCotermLicensesMoveParametersLicenseCountArgs>> counts) {
            $.counts = counts;
            return this;
        }

        /**
         * @param counts The counts to move from the license by model type
         * 
         * @return builder
         * 
         */
        public Builder counts(List<LicensingCotermLicensesMoveParametersLicenseCountArgs> counts) {
            return counts(Output.of(counts));
        }

        /**
         * @param counts The counts to move from the license by model type
         * 
         * @return builder
         * 
         */
        public Builder counts(LicensingCotermLicensesMoveParametersLicenseCountArgs... counts) {
            return counts(List.of(counts));
        }

        /**
         * @param key The license key to move counts from
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The license key to move counts from
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public LicensingCotermLicensesMoveParametersLicenseArgs build() {
            return $;
        }
    }

}