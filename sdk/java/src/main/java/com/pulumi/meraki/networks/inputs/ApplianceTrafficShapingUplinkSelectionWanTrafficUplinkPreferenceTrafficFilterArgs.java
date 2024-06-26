// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs Empty = new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs();

    /**
     * Traffic filter type. Must be &#34;custom&#34;
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Traffic filter type. Must be &#34;custom&#34;
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Value of traffic filter
     * 
     */
    @Import(name="value")
    private @Nullable Output<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs> value;

    /**
     * @return Value of traffic filter
     * 
     */
    public Optional<Output<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs>> value() {
        return Optional.ofNullable(this.value);
    }

    private ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs() {}

    private ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs $;

        public Builder() {
            $ = new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs();
        }

        public Builder(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs defaults) {
            $ = new ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Traffic filter type. Must be &#34;custom&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Traffic filter type. Must be &#34;custom&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value Value of traffic filter
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of traffic filter
         * 
         * @return builder
         * 
         */
        public Builder value(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterValueArgs value) {
            return value(Output.of(value));
        }

        public ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceTrafficFilterArgs build() {
            return $;
        }
    }

}
