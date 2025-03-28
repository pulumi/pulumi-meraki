// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceFirewallInboundFirewallRulesRuleArgs;
import com.pulumi.meraki.networks.inputs.ApplianceFirewallInboundFirewallRulesRulesResponseArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceFirewallInboundFirewallRulesState extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceFirewallInboundFirewallRulesState Empty = new ApplianceFirewallInboundFirewallRulesState();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * An ordered array of the firewall rules (not including the default rule)
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<ApplianceFirewallInboundFirewallRulesRuleArgs>> rules;

    /**
     * @return An ordered array of the firewall rules (not including the default rule)
     * 
     */
    public Optional<Output<List<ApplianceFirewallInboundFirewallRulesRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * An ordered array of the firewall rules (not including the default rule)
     * 
     */
    @Import(name="rulesResponses")
    private @Nullable Output<List<ApplianceFirewallInboundFirewallRulesRulesResponseArgs>> rulesResponses;

    /**
     * @return An ordered array of the firewall rules (not including the default rule)
     * 
     */
    public Optional<Output<List<ApplianceFirewallInboundFirewallRulesRulesResponseArgs>>> rulesResponses() {
        return Optional.ofNullable(this.rulesResponses);
    }

    /**
     * Log the special default rule (boolean value - enable only if you&#39;ve configured a syslog server) (optional)
     * 
     */
    @Import(name="syslogDefaultRule")
    private @Nullable Output<Boolean> syslogDefaultRule;

    /**
     * @return Log the special default rule (boolean value - enable only if you&#39;ve configured a syslog server) (optional)
     * 
     */
    public Optional<Output<Boolean>> syslogDefaultRule() {
        return Optional.ofNullable(this.syslogDefaultRule);
    }

    private ApplianceFirewallInboundFirewallRulesState() {}

    private ApplianceFirewallInboundFirewallRulesState(ApplianceFirewallInboundFirewallRulesState $) {
        this.networkId = $.networkId;
        this.rules = $.rules;
        this.rulesResponses = $.rulesResponses;
        this.syslogDefaultRule = $.syslogDefaultRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceFirewallInboundFirewallRulesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceFirewallInboundFirewallRulesState $;

        public Builder() {
            $ = new ApplianceFirewallInboundFirewallRulesState();
        }

        public Builder(ApplianceFirewallInboundFirewallRulesState defaults) {
            $ = new ApplianceFirewallInboundFirewallRulesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param rules An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<ApplianceFirewallInboundFirewallRulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ApplianceFirewallInboundFirewallRulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rules(ApplianceFirewallInboundFirewallRulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param rulesResponses An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rulesResponses(@Nullable Output<List<ApplianceFirewallInboundFirewallRulesRulesResponseArgs>> rulesResponses) {
            $.rulesResponses = rulesResponses;
            return this;
        }

        /**
         * @param rulesResponses An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rulesResponses(List<ApplianceFirewallInboundFirewallRulesRulesResponseArgs> rulesResponses) {
            return rulesResponses(Output.of(rulesResponses));
        }

        /**
         * @param rulesResponses An ordered array of the firewall rules (not including the default rule)
         * 
         * @return builder
         * 
         */
        public Builder rulesResponses(ApplianceFirewallInboundFirewallRulesRulesResponseArgs... rulesResponses) {
            return rulesResponses(List.of(rulesResponses));
        }

        /**
         * @param syslogDefaultRule Log the special default rule (boolean value - enable only if you&#39;ve configured a syslog server) (optional)
         * 
         * @return builder
         * 
         */
        public Builder syslogDefaultRule(@Nullable Output<Boolean> syslogDefaultRule) {
            $.syslogDefaultRule = syslogDefaultRule;
            return this;
        }

        /**
         * @param syslogDefaultRule Log the special default rule (boolean value - enable only if you&#39;ve configured a syslog server) (optional)
         * 
         * @return builder
         * 
         */
        public Builder syslogDefaultRule(Boolean syslogDefaultRule) {
            return syslogDefaultRule(Output.of(syslogDefaultRule));
        }

        public ApplianceFirewallInboundFirewallRulesState build() {
            return $;
        }
    }

}
