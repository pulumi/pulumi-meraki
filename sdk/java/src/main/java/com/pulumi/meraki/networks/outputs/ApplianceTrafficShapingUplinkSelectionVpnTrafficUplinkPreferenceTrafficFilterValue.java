// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestination;
import com.pulumi.meraki.networks.outputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueSource;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValue {
    /**
     * @return Destination of &#39;custom&#39; type traffic filter
     * 
     */
    private @Nullable ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestination destination;
    /**
     * @return ID of &#39;applicationCategory&#39; or &#39;application&#39; type traffic filter
     * 
     */
    private @Nullable String id;
    /**
     * @return Protocol of &#39;custom&#39; type traffic filter. Must be one of: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp&#39;, &#39;icmp6&#39; or &#39;any&#39;
     * 
     */
    private @Nullable String protocol;
    /**
     * @return Source of &#39;custom&#39; type traffic filter
     * 
     */
    private @Nullable ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueSource source;

    private ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValue() {}
    /**
     * @return Destination of &#39;custom&#39; type traffic filter
     * 
     */
    public Optional<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestination> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * @return ID of &#39;applicationCategory&#39; or &#39;application&#39; type traffic filter
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Protocol of &#39;custom&#39; type traffic filter. Must be one of: &#39;tcp&#39;, &#39;udp&#39;, &#39;icmp&#39;, &#39;icmp6&#39; or &#39;any&#39;
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Source of &#39;custom&#39; type traffic filter
     * 
     */
    public Optional<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueSource> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestination destination;
        private @Nullable String id;
        private @Nullable String protocol;
        private @Nullable ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueSource source;
        public Builder() {}
        public Builder(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.id = defaults.id;
    	      this.protocol = defaults.protocol;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder destination(@Nullable ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueDestination destination) {

            this.destination = destination;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValueSource source) {

            this.source = source;
            return this;
        }
        public ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValue build() {
            final var _resultValue = new ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceTrafficFilterValue();
            _resultValue.destination = destination;
            _resultValue.id = id;
            _resultValue.protocol = protocol;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
