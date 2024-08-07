// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.GroupPoliciesFirewallAndTrafficShapingL3FirewallRuleArgs;
import com.pulumi.meraki.networks.inputs.GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleArgs;
import com.pulumi.meraki.networks.inputs.GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupPoliciesFirewallAndTrafficShapingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupPoliciesFirewallAndTrafficShapingArgs Empty = new GroupPoliciesFirewallAndTrafficShapingArgs();

    /**
     * An ordered array of the L3 firewall rules
     * 
     */
    @Import(name="l3FirewallRules")
    private @Nullable Output<List<GroupPoliciesFirewallAndTrafficShapingL3FirewallRuleArgs>> l3FirewallRules;

    /**
     * @return An ordered array of the L3 firewall rules
     * 
     */
    public Optional<Output<List<GroupPoliciesFirewallAndTrafficShapingL3FirewallRuleArgs>>> l3FirewallRules() {
        return Optional.ofNullable(this.l3FirewallRules);
    }

    /**
     * An ordered array of L7 firewall rules
     * 
     */
    @Import(name="l7FirewallRules")
    private @Nullable Output<List<GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleArgs>> l7FirewallRules;

    /**
     * @return An ordered array of L7 firewall rules
     * 
     */
    public Optional<Output<List<GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleArgs>>> l7FirewallRules() {
        return Optional.ofNullable(this.l7FirewallRules);
    }

    /**
     * How firewall and traffic shaping rules are enforced. Can be &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<String> settings;

    /**
     * @return How firewall and traffic shaping rules are enforced. Can be &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    public Optional<Output<String>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * An array of traffic shaping rules. Rules are applied in the order that
     * they are specified in. An empty list (or null) means no rules. Note that
     * you are allowed a maximum of 8 rules.
     * 
     */
    @Import(name="trafficShapingRules")
    private @Nullable Output<List<GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleArgs>> trafficShapingRules;

    /**
     * @return An array of traffic shaping rules. Rules are applied in the order that
     * they are specified in. An empty list (or null) means no rules. Note that
     * you are allowed a maximum of 8 rules.
     * 
     */
    public Optional<Output<List<GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleArgs>>> trafficShapingRules() {
        return Optional.ofNullable(this.trafficShapingRules);
    }

    private GroupPoliciesFirewallAndTrafficShapingArgs() {}

    private GroupPoliciesFirewallAndTrafficShapingArgs(GroupPoliciesFirewallAndTrafficShapingArgs $) {
        this.l3FirewallRules = $.l3FirewallRules;
        this.l7FirewallRules = $.l7FirewallRules;
        this.settings = $.settings;
        this.trafficShapingRules = $.trafficShapingRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPoliciesFirewallAndTrafficShapingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPoliciesFirewallAndTrafficShapingArgs $;

        public Builder() {
            $ = new GroupPoliciesFirewallAndTrafficShapingArgs();
        }

        public Builder(GroupPoliciesFirewallAndTrafficShapingArgs defaults) {
            $ = new GroupPoliciesFirewallAndTrafficShapingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param l3FirewallRules An ordered array of the L3 firewall rules
         * 
         * @return builder
         * 
         */
        public Builder l3FirewallRules(@Nullable Output<List<GroupPoliciesFirewallAndTrafficShapingL3FirewallRuleArgs>> l3FirewallRules) {
            $.l3FirewallRules = l3FirewallRules;
            return this;
        }

        /**
         * @param l3FirewallRules An ordered array of the L3 firewall rules
         * 
         * @return builder
         * 
         */
        public Builder l3FirewallRules(List<GroupPoliciesFirewallAndTrafficShapingL3FirewallRuleArgs> l3FirewallRules) {
            return l3FirewallRules(Output.of(l3FirewallRules));
        }

        /**
         * @param l3FirewallRules An ordered array of the L3 firewall rules
         * 
         * @return builder
         * 
         */
        public Builder l3FirewallRules(GroupPoliciesFirewallAndTrafficShapingL3FirewallRuleArgs... l3FirewallRules) {
            return l3FirewallRules(List.of(l3FirewallRules));
        }

        /**
         * @param l7FirewallRules An ordered array of L7 firewall rules
         * 
         * @return builder
         * 
         */
        public Builder l7FirewallRules(@Nullable Output<List<GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleArgs>> l7FirewallRules) {
            $.l7FirewallRules = l7FirewallRules;
            return this;
        }

        /**
         * @param l7FirewallRules An ordered array of L7 firewall rules
         * 
         * @return builder
         * 
         */
        public Builder l7FirewallRules(List<GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleArgs> l7FirewallRules) {
            return l7FirewallRules(Output.of(l7FirewallRules));
        }

        /**
         * @param l7FirewallRules An ordered array of L7 firewall rules
         * 
         * @return builder
         * 
         */
        public Builder l7FirewallRules(GroupPoliciesFirewallAndTrafficShapingL7FirewallRuleArgs... l7FirewallRules) {
            return l7FirewallRules(List.of(l7FirewallRules));
        }

        /**
         * @param settings How firewall and traffic shaping rules are enforced. Can be &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<String> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings How firewall and traffic shaping rules are enforced. Can be &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
         * 
         * @return builder
         * 
         */
        public Builder settings(String settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param trafficShapingRules An array of traffic shaping rules. Rules are applied in the order that
         * they are specified in. An empty list (or null) means no rules. Note that
         * you are allowed a maximum of 8 rules.
         * 
         * @return builder
         * 
         */
        public Builder trafficShapingRules(@Nullable Output<List<GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleArgs>> trafficShapingRules) {
            $.trafficShapingRules = trafficShapingRules;
            return this;
        }

        /**
         * @param trafficShapingRules An array of traffic shaping rules. Rules are applied in the order that
         * they are specified in. An empty list (or null) means no rules. Note that
         * you are allowed a maximum of 8 rules.
         * 
         * @return builder
         * 
         */
        public Builder trafficShapingRules(List<GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleArgs> trafficShapingRules) {
            return trafficShapingRules(Output.of(trafficShapingRules));
        }

        /**
         * @param trafficShapingRules An array of traffic shaping rules. Rules are applied in the order that
         * they are specified in. An empty list (or null) means no rules. Note that
         * you are allowed a maximum of 8 rules.
         * 
         * @return builder
         * 
         */
        public Builder trafficShapingRules(GroupPoliciesFirewallAndTrafficShapingTrafficShapingRuleArgs... trafficShapingRules) {
            return trafficShapingRules(List.of(trafficShapingRules));
        }

        public GroupPoliciesFirewallAndTrafficShapingArgs build() {
            return $;
        }
    }

}
