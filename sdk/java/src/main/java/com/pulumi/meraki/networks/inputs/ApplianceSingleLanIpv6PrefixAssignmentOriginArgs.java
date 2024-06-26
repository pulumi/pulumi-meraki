// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceSingleLanIpv6PrefixAssignmentOriginArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceSingleLanIpv6PrefixAssignmentOriginArgs Empty = new ApplianceSingleLanIpv6PrefixAssignmentOriginArgs();

    /**
     * Interfaces associated with the prefix
     * 
     */
    @Import(name="interfaces")
    private @Nullable Output<List<String>> interfaces;

    /**
     * @return Interfaces associated with the prefix
     * 
     */
    public Optional<Output<List<String>>> interfaces() {
        return Optional.ofNullable(this.interfaces);
    }

    /**
     * Type of the origin
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the origin
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ApplianceSingleLanIpv6PrefixAssignmentOriginArgs() {}

    private ApplianceSingleLanIpv6PrefixAssignmentOriginArgs(ApplianceSingleLanIpv6PrefixAssignmentOriginArgs $) {
        this.interfaces = $.interfaces;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceSingleLanIpv6PrefixAssignmentOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceSingleLanIpv6PrefixAssignmentOriginArgs $;

        public Builder() {
            $ = new ApplianceSingleLanIpv6PrefixAssignmentOriginArgs();
        }

        public Builder(ApplianceSingleLanIpv6PrefixAssignmentOriginArgs defaults) {
            $ = new ApplianceSingleLanIpv6PrefixAssignmentOriginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interfaces Interfaces associated with the prefix
         * 
         * @return builder
         * 
         */
        public Builder interfaces(@Nullable Output<List<String>> interfaces) {
            $.interfaces = interfaces;
            return this;
        }

        /**
         * @param interfaces Interfaces associated with the prefix
         * 
         * @return builder
         * 
         */
        public Builder interfaces(List<String> interfaces) {
            return interfaces(Output.of(interfaces));
        }

        /**
         * @param interfaces Interfaces associated with the prefix
         * 
         * @return builder
         * 
         */
        public Builder interfaces(String... interfaces) {
            return interfaces(List.of(interfaces));
        }

        /**
         * @param type Type of the origin
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the origin
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ApplianceSingleLanIpv6PrefixAssignmentOriginArgs build() {
            return $;
        }
    }

}
