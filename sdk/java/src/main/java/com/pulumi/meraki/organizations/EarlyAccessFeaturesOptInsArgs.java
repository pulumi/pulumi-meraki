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


public final class EarlyAccessFeaturesOptInsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EarlyAccessFeaturesOptInsArgs Empty = new EarlyAccessFeaturesOptInsArgs();

    /**
     * Networks assigned to the Early Access Feature
     * 
     */
    @Import(name="limitScopeToNetworks")
    private @Nullable Output<List<String>> limitScopeToNetworks;

    /**
     * @return Networks assigned to the Early Access Feature
     * 
     */
    public Optional<Output<List<String>>> limitScopeToNetworks() {
        return Optional.ofNullable(this.limitScopeToNetworks);
    }

    /**
     * optInId path parameter. Opt in ID
     * 
     */
    @Import(name="optInId")
    private @Nullable Output<String> optInId;

    /**
     * @return optInId path parameter. Opt in ID
     * 
     */
    public Optional<Output<String>> optInId() {
        return Optional.ofNullable(this.optInId);
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

    /**
     * Name of Early Access Feature
     * 
     */
    @Import(name="shortName")
    private @Nullable Output<String> shortName;

    /**
     * @return Name of Early Access Feature
     * 
     */
    public Optional<Output<String>> shortName() {
        return Optional.ofNullable(this.shortName);
    }

    private EarlyAccessFeaturesOptInsArgs() {}

    private EarlyAccessFeaturesOptInsArgs(EarlyAccessFeaturesOptInsArgs $) {
        this.limitScopeToNetworks = $.limitScopeToNetworks;
        this.optInId = $.optInId;
        this.organizationId = $.organizationId;
        this.shortName = $.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EarlyAccessFeaturesOptInsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EarlyAccessFeaturesOptInsArgs $;

        public Builder() {
            $ = new EarlyAccessFeaturesOptInsArgs();
        }

        public Builder(EarlyAccessFeaturesOptInsArgs defaults) {
            $ = new EarlyAccessFeaturesOptInsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limitScopeToNetworks Networks assigned to the Early Access Feature
         * 
         * @return builder
         * 
         */
        public Builder limitScopeToNetworks(@Nullable Output<List<String>> limitScopeToNetworks) {
            $.limitScopeToNetworks = limitScopeToNetworks;
            return this;
        }

        /**
         * @param limitScopeToNetworks Networks assigned to the Early Access Feature
         * 
         * @return builder
         * 
         */
        public Builder limitScopeToNetworks(List<String> limitScopeToNetworks) {
            return limitScopeToNetworks(Output.of(limitScopeToNetworks));
        }

        /**
         * @param limitScopeToNetworks Networks assigned to the Early Access Feature
         * 
         * @return builder
         * 
         */
        public Builder limitScopeToNetworks(String... limitScopeToNetworks) {
            return limitScopeToNetworks(List.of(limitScopeToNetworks));
        }

        /**
         * @param optInId optInId path parameter. Opt in ID
         * 
         * @return builder
         * 
         */
        public Builder optInId(@Nullable Output<String> optInId) {
            $.optInId = optInId;
            return this;
        }

        /**
         * @param optInId optInId path parameter. Opt in ID
         * 
         * @return builder
         * 
         */
        public Builder optInId(String optInId) {
            return optInId(Output.of(optInId));
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

        /**
         * @param shortName Name of Early Access Feature
         * 
         * @return builder
         * 
         */
        public Builder shortName(@Nullable Output<String> shortName) {
            $.shortName = shortName;
            return this;
        }

        /**
         * @param shortName Name of Early Access Feature
         * 
         * @return builder
         * 
         */
        public Builder shortName(String shortName) {
            return shortName(Output.of(shortName));
        }

        public EarlyAccessFeaturesOptInsArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("EarlyAccessFeaturesOptInsArgs", "organizationId");
            }
            return $;
        }
    }

}