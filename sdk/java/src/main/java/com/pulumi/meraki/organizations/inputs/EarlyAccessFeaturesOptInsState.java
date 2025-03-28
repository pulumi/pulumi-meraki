// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EarlyAccessFeaturesOptInsState extends com.pulumi.resources.ResourceArgs {

    public static final EarlyAccessFeaturesOptInsState Empty = new EarlyAccessFeaturesOptInsState();

    /**
     * Time when Early Access Feature was created
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Time when Early Access Feature was created
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

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
     * Networks assigned to the Early Access Feature
     * 
     */
    @Import(name="limitScopeToNetworksRs")
    private @Nullable Output<List<String>> limitScopeToNetworksRs;

    /**
     * @return Networks assigned to the Early Access Feature
     * 
     */
    public Optional<Output<List<String>>> limitScopeToNetworksRs() {
        return Optional.ofNullable(this.limitScopeToNetworksRs);
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
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
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

    private EarlyAccessFeaturesOptInsState() {}

    private EarlyAccessFeaturesOptInsState(EarlyAccessFeaturesOptInsState $) {
        this.createdAt = $.createdAt;
        this.limitScopeToNetworks = $.limitScopeToNetworks;
        this.limitScopeToNetworksRs = $.limitScopeToNetworksRs;
        this.optInId = $.optInId;
        this.organizationId = $.organizationId;
        this.shortName = $.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EarlyAccessFeaturesOptInsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EarlyAccessFeaturesOptInsState $;

        public Builder() {
            $ = new EarlyAccessFeaturesOptInsState();
        }

        public Builder(EarlyAccessFeaturesOptInsState defaults) {
            $ = new EarlyAccessFeaturesOptInsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt Time when Early Access Feature was created
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Time when Early Access Feature was created
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
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
         * @param limitScopeToNetworksRs Networks assigned to the Early Access Feature
         * 
         * @return builder
         * 
         */
        public Builder limitScopeToNetworksRs(@Nullable Output<List<String>> limitScopeToNetworksRs) {
            $.limitScopeToNetworksRs = limitScopeToNetworksRs;
            return this;
        }

        /**
         * @param limitScopeToNetworksRs Networks assigned to the Early Access Feature
         * 
         * @return builder
         * 
         */
        public Builder limitScopeToNetworksRs(List<String> limitScopeToNetworksRs) {
            return limitScopeToNetworksRs(Output.of(limitScopeToNetworksRs));
        }

        /**
         * @param limitScopeToNetworksRs Networks assigned to the Early Access Feature
         * 
         * @return builder
         * 
         */
        public Builder limitScopeToNetworksRs(String... limitScopeToNetworksRs) {
            return limitScopeToNetworksRs(List.of(limitScopeToNetworksRs));
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
        public Builder organizationId(@Nullable Output<String> organizationId) {
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

        public EarlyAccessFeaturesOptInsState build() {
            return $;
        }
    }

}
