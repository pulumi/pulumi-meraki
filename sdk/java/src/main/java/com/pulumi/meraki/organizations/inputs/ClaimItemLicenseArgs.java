// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClaimItemLicenseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClaimItemLicenseArgs Empty = new ClaimItemLicenseArgs();

    /**
     * The key of the license
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The key of the license
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The mode of the license
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The mode of the license
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    private ClaimItemLicenseArgs() {}

    private ClaimItemLicenseArgs(ClaimItemLicenseArgs $) {
        this.key = $.key;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClaimItemLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClaimItemLicenseArgs $;

        public Builder() {
            $ = new ClaimItemLicenseArgs();
        }

        public Builder(ClaimItemLicenseArgs defaults) {
            $ = new ClaimItemLicenseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key of the license
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key of the license
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param mode The mode of the license
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode of the license
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public ClaimItemLicenseArgs build() {
            return $;
        }
    }

}
