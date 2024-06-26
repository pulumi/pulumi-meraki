// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrandingPoliciesPrioritiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrandingPoliciesPrioritiesArgs Empty = new BrandingPoliciesPrioritiesArgs();

    /**
     * An ordered list of branding policy IDs that determines the priority order of how to apply the policies
     * 
     */
    @Import(name="brandingPolicyIds")
    private @Nullable Output<List<String>> brandingPolicyIds;

    /**
     * @return An ordered list of branding policy IDs that determines the priority order of how to apply the policies
     * 
     */
    public Optional<Output<List<String>>> brandingPolicyIds() {
        return Optional.ofNullable(this.brandingPolicyIds);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    private BrandingPoliciesPrioritiesArgs() {}

    private BrandingPoliciesPrioritiesArgs(BrandingPoliciesPrioritiesArgs $) {
        this.brandingPolicyIds = $.brandingPolicyIds;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrandingPoliciesPrioritiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrandingPoliciesPrioritiesArgs $;

        public Builder() {
            $ = new BrandingPoliciesPrioritiesArgs();
        }

        public Builder(BrandingPoliciesPrioritiesArgs defaults) {
            $ = new BrandingPoliciesPrioritiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param brandingPolicyIds An ordered list of branding policy IDs that determines the priority order of how to apply the policies
         * 
         * @return builder
         * 
         */
        public Builder brandingPolicyIds(@Nullable Output<List<String>> brandingPolicyIds) {
            $.brandingPolicyIds = brandingPolicyIds;
            return this;
        }

        /**
         * @param brandingPolicyIds An ordered list of branding policy IDs that determines the priority order of how to apply the policies
         * 
         * @return builder
         * 
         */
        public Builder brandingPolicyIds(List<String> brandingPolicyIds) {
            return brandingPolicyIds(Output.of(brandingPolicyIds));
        }

        /**
         * @param brandingPolicyIds An ordered list of branding policy IDs that determines the priority order of how to apply the policies
         * 
         * @return builder
         * 
         */
        public Builder brandingPolicyIds(String... brandingPolicyIds) {
            return brandingPolicyIds(List.of(brandingPolicyIds));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public BrandingPoliciesPrioritiesArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("BrandingPoliciesPrioritiesArgs", "organizationId");
            }
            return $;
        }
    }

}
