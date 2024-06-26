// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemBonjourForwardingRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupPoliciesItemBonjourForwarding {
    /**
     * @return A list of the Bonjour forwarding rules for your group policy. If &#39;settings&#39; is set to &#39;custom&#39;, at least one rule must be specified.
     * 
     */
    private List<GetGroupPoliciesItemBonjourForwardingRule> rules;
    /**
     * @return How Bonjour rules are applied. Can be &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    private String settings;

    private GetGroupPoliciesItemBonjourForwarding() {}
    /**
     * @return A list of the Bonjour forwarding rules for your group policy. If &#39;settings&#39; is set to &#39;custom&#39;, at least one rule must be specified.
     * 
     */
    public List<GetGroupPoliciesItemBonjourForwardingRule> rules() {
        return this.rules;
    }
    /**
     * @return How Bonjour rules are applied. Can be &#39;network default&#39;, &#39;ignore&#39; or &#39;custom&#39;.
     * 
     */
    public String settings() {
        return this.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupPoliciesItemBonjourForwarding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGroupPoliciesItemBonjourForwardingRule> rules;
        private String settings;
        public Builder() {}
        public Builder(GetGroupPoliciesItemBonjourForwarding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
    	      this.settings = defaults.settings;
        }

        @CustomType.Setter
        public Builder rules(List<GetGroupPoliciesItemBonjourForwardingRule> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemBonjourForwarding", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(GetGroupPoliciesItemBonjourForwardingRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder settings(String settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemBonjourForwarding", "settings");
            }
            this.settings = settings;
            return this;
        }
        public GetGroupPoliciesItemBonjourForwarding build() {
            final var _resultValue = new GetGroupPoliciesItemBonjourForwarding();
            _resultValue.rules = rules;
            _resultValue.settings = settings;
            return _resultValue;
        }
    }
}
