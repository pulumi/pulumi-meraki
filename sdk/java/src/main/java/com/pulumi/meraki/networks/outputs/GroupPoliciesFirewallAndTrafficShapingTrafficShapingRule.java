// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleDefinition;
import com.pulumi.meraki.networks.outputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupPoliciesFirewallAndTrafficShapingTrafficShapingRule {
    /**
     * @return A list of objects describing the definitions of your traffic shaping rule. At least one definition is required.
     * 
     */
    private @Nullable List<GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleDefinition> definitions;
    /**
     * @return The DSCP tag applied by your rule. null means &#39;Do not change DSCP tag&#39;.
     * For a list of possible tag values, use the trafficShaping/dscpTaggingOptions endpoint.
     * 
     */
    private @Nullable Integer dscpTagValue;
    /**
     * @return The PCP tag applied by your rule. Can be 0 (lowest priority) through 7 (highest priority).
     * null means &#39;Do not set PCP tag&#39;.
     * 
     */
    private @Nullable Integer pcpTagValue;
    /**
     * @return An object describing the bandwidth settings for your rule.
     * 
     */
    private @Nullable GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits perClientBandwidthLimits;
    /**
     * @return A string, indicating the priority level for packets bound to your rule.
     * Can be &#39;low&#39;, &#39;normal&#39; or &#39;high&#39;.
     * 
     */
    private @Nullable String priority;

    private GroupPoliciesFirewallAndTrafficShapingTrafficShapingRule() {}
    /**
     * @return A list of objects describing the definitions of your traffic shaping rule. At least one definition is required.
     * 
     */
    public List<GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleDefinition> definitions() {
        return this.definitions == null ? List.of() : this.definitions;
    }
    /**
     * @return The DSCP tag applied by your rule. null means &#39;Do not change DSCP tag&#39;.
     * For a list of possible tag values, use the trafficShaping/dscpTaggingOptions endpoint.
     * 
     */
    public Optional<Integer> dscpTagValue() {
        return Optional.ofNullable(this.dscpTagValue);
    }
    /**
     * @return The PCP tag applied by your rule. Can be 0 (lowest priority) through 7 (highest priority).
     * null means &#39;Do not set PCP tag&#39;.
     * 
     */
    public Optional<Integer> pcpTagValue() {
        return Optional.ofNullable(this.pcpTagValue);
    }
    /**
     * @return An object describing the bandwidth settings for your rule.
     * 
     */
    public Optional<GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits> perClientBandwidthLimits() {
        return Optional.ofNullable(this.perClientBandwidthLimits);
    }
    /**
     * @return A string, indicating the priority level for packets bound to your rule.
     * Can be &#39;low&#39;, &#39;normal&#39; or &#39;high&#39;.
     * 
     */
    public Optional<String> priority() {
        return Optional.ofNullable(this.priority);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPoliciesFirewallAndTrafficShapingTrafficShapingRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleDefinition> definitions;
        private @Nullable Integer dscpTagValue;
        private @Nullable Integer pcpTagValue;
        private @Nullable GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits perClientBandwidthLimits;
        private @Nullable String priority;
        public Builder() {}
        public Builder(GroupPoliciesFirewallAndTrafficShapingTrafficShapingRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definitions = defaults.definitions;
    	      this.dscpTagValue = defaults.dscpTagValue;
    	      this.pcpTagValue = defaults.pcpTagValue;
    	      this.perClientBandwidthLimits = defaults.perClientBandwidthLimits;
    	      this.priority = defaults.priority;
        }

        @CustomType.Setter
        public Builder definitions(@Nullable List<GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleDefinition> definitions) {

            this.definitions = definitions;
            return this;
        }
        public Builder definitions(GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleDefinition... definitions) {
            return definitions(List.of(definitions));
        }
        @CustomType.Setter
        public Builder dscpTagValue(@Nullable Integer dscpTagValue) {

            this.dscpTagValue = dscpTagValue;
            return this;
        }
        @CustomType.Setter
        public Builder pcpTagValue(@Nullable Integer pcpTagValue) {

            this.pcpTagValue = pcpTagValue;
            return this;
        }
        @CustomType.Setter
        public Builder perClientBandwidthLimits(@Nullable GroupPoliciesFirewallAndTrafficShapingTrafficShapingRulePerClientBandwidthLimits perClientBandwidthLimits) {

            this.perClientBandwidthLimits = perClientBandwidthLimits;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable String priority) {

            this.priority = priority;
            return this;
        }
        public GroupPoliciesFirewallAndTrafficShapingTrafficShapingRule build() {
            final var _resultValue = new GroupPoliciesFirewallAndTrafficShapingTrafficShapingRule();
            _resultValue.definitions = definitions;
            _resultValue.dscpTagValue = dscpTagValue;
            _resultValue.pcpTagValue = pcpTagValue;
            _resultValue.perClientBandwidthLimits = perClientBandwidthLimits;
            _resultValue.priority = priority;
            return _resultValue;
        }
    }
}
