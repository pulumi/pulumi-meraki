// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs Empty = new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs();

    /**
     * The hashed secret
     * 
     */
    @Import(name="hash")
    private @Nullable Output<String> hash;

    /**
     * @return The hashed secret
     * 
     */
    public Optional<Output<String>> hash() {
        return Optional.ofNullable(this.hash);
    }

    private InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs() {}

    private InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs(InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs $) {
        this.hash = $.hash;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs $;

        public Builder() {
            $ = new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs();
        }

        public Builder(InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs defaults) {
            $ = new InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hash The hashed secret
         * 
         * @return builder
         * 
         */
        public Builder hash(@Nullable Output<String> hash) {
            $.hash = hash;
            return this;
        }

        /**
         * @param hash The hashed secret
         * 
         * @return builder
         * 
         */
        public Builder hash(String hash) {
            return hash(Output.of(hash));
        }

        public InventoryOnboardingCloudMonitoringPrepareItemConfigParamsUserSecretArgs build() {
            return $;
        }
    }

}
