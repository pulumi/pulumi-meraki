// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceTrafficShapingRulesRuleDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceTrafficShapingRulesRuleDefinitionArgs Empty = new ApplianceTrafficShapingRulesRuleDefinitionArgs();

    /**
     * The type of definition. Can be one of &#39;application&#39;, &#39;applicationCategory&#39;, &#39;host&#39;, &#39;port&#39;, &#39;ipRange&#39; or &#39;localNet&#39;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of definition. Can be one of &#39;application&#39;, &#39;applicationCategory&#39;, &#39;host&#39;, &#39;port&#39;, &#39;ipRange&#39; or &#39;localNet&#39;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * If &#34;type&#34; is &#39;host&#39;, &#39;port&#39;, &#39;ipRange&#39; or &#39;localNet&#39;, then &#34;value&#34; must be a string, matching either
     * a hostname (e.g. &#34;somesite.com&#34;), a port (e.g. 8080), or an IP range (&#34;192.1.0.0&#34;,
     * &#34;192.1.0.0/16&#34;, or &#34;10.1.0.0/16:80&#34;). &#39;localNet&#39; also supports CIDR notation, excluding
     * custom ports.
     *  If &#34;type&#34; is &#39;application&#39; or &#39;applicationCategory&#39;, then &#34;value&#34; must be an object
     * with the structure { &#34;id&#34;: &#34;meraki:layer7/...&#34; }, where &#34;id&#34; is the application category or
     * application ID (for a list of IDs for your network, use the trafficShaping/applicationCategories
     * endpoint).
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return If &#34;type&#34; is &#39;host&#39;, &#39;port&#39;, &#39;ipRange&#39; or &#39;localNet&#39;, then &#34;value&#34; must be a string, matching either
     * a hostname (e.g. &#34;somesite.com&#34;), a port (e.g. 8080), or an IP range (&#34;192.1.0.0&#34;,
     * &#34;192.1.0.0/16&#34;, or &#34;10.1.0.0/16:80&#34;). &#39;localNet&#39; also supports CIDR notation, excluding
     * custom ports.
     *  If &#34;type&#34; is &#39;application&#39; or &#39;applicationCategory&#39;, then &#34;value&#34; must be an object
     * with the structure { &#34;id&#34;: &#34;meraki:layer7/...&#34; }, where &#34;id&#34; is the application category or
     * application ID (for a list of IDs for your network, use the trafficShaping/applicationCategories
     * endpoint).
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * The &#39;value_list&#39; of what you want to block. Send a list in request
     * 
     */
    @Import(name="valueLists")
    private @Nullable Output<List<String>> valueLists;

    /**
     * @return The &#39;value_list&#39; of what you want to block. Send a list in request
     * 
     */
    public Optional<Output<List<String>>> valueLists() {
        return Optional.ofNullable(this.valueLists);
    }

    /**
     * The &#39;value_obj&#39; of what you want to block. Send a dict in request
     * 
     */
    @Import(name="valueObj")
    private @Nullable Output<ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs> valueObj;

    /**
     * @return The &#39;value_obj&#39; of what you want to block. Send a dict in request
     * 
     */
    public Optional<Output<ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs>> valueObj() {
        return Optional.ofNullable(this.valueObj);
    }

    private ApplianceTrafficShapingRulesRuleDefinitionArgs() {}

    private ApplianceTrafficShapingRulesRuleDefinitionArgs(ApplianceTrafficShapingRulesRuleDefinitionArgs $) {
        this.type = $.type;
        this.value = $.value;
        this.valueLists = $.valueLists;
        this.valueObj = $.valueObj;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceTrafficShapingRulesRuleDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceTrafficShapingRulesRuleDefinitionArgs $;

        public Builder() {
            $ = new ApplianceTrafficShapingRulesRuleDefinitionArgs();
        }

        public Builder(ApplianceTrafficShapingRulesRuleDefinitionArgs defaults) {
            $ = new ApplianceTrafficShapingRulesRuleDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of definition. Can be one of &#39;application&#39;, &#39;applicationCategory&#39;, &#39;host&#39;, &#39;port&#39;, &#39;ipRange&#39; or &#39;localNet&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of definition. Can be one of &#39;application&#39;, &#39;applicationCategory&#39;, &#39;host&#39;, &#39;port&#39;, &#39;ipRange&#39; or &#39;localNet&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value If &#34;type&#34; is &#39;host&#39;, &#39;port&#39;, &#39;ipRange&#39; or &#39;localNet&#39;, then &#34;value&#34; must be a string, matching either
         * a hostname (e.g. &#34;somesite.com&#34;), a port (e.g. 8080), or an IP range (&#34;192.1.0.0&#34;,
         * &#34;192.1.0.0/16&#34;, or &#34;10.1.0.0/16:80&#34;). &#39;localNet&#39; also supports CIDR notation, excluding
         * custom ports.
         *  If &#34;type&#34; is &#39;application&#39; or &#39;applicationCategory&#39;, then &#34;value&#34; must be an object
         * with the structure { &#34;id&#34;: &#34;meraki:layer7/...&#34; }, where &#34;id&#34; is the application category or
         * application ID (for a list of IDs for your network, use the trafficShaping/applicationCategories
         * endpoint).
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value If &#34;type&#34; is &#39;host&#39;, &#39;port&#39;, &#39;ipRange&#39; or &#39;localNet&#39;, then &#34;value&#34; must be a string, matching either
         * a hostname (e.g. &#34;somesite.com&#34;), a port (e.g. 8080), or an IP range (&#34;192.1.0.0&#34;,
         * &#34;192.1.0.0/16&#34;, or &#34;10.1.0.0/16:80&#34;). &#39;localNet&#39; also supports CIDR notation, excluding
         * custom ports.
         *  If &#34;type&#34; is &#39;application&#39; or &#39;applicationCategory&#39;, then &#34;value&#34; must be an object
         * with the structure { &#34;id&#34;: &#34;meraki:layer7/...&#34; }, where &#34;id&#34; is the application category or
         * application ID (for a list of IDs for your network, use the trafficShaping/applicationCategories
         * endpoint).
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valueLists The &#39;value_list&#39; of what you want to block. Send a list in request
         * 
         * @return builder
         * 
         */
        public Builder valueLists(@Nullable Output<List<String>> valueLists) {
            $.valueLists = valueLists;
            return this;
        }

        /**
         * @param valueLists The &#39;value_list&#39; of what you want to block. Send a list in request
         * 
         * @return builder
         * 
         */
        public Builder valueLists(List<String> valueLists) {
            return valueLists(Output.of(valueLists));
        }

        /**
         * @param valueLists The &#39;value_list&#39; of what you want to block. Send a list in request
         * 
         * @return builder
         * 
         */
        public Builder valueLists(String... valueLists) {
            return valueLists(List.of(valueLists));
        }

        /**
         * @param valueObj The &#39;value_obj&#39; of what you want to block. Send a dict in request
         * 
         * @return builder
         * 
         */
        public Builder valueObj(@Nullable Output<ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs> valueObj) {
            $.valueObj = valueObj;
            return this;
        }

        /**
         * @param valueObj The &#39;value_obj&#39; of what you want to block. Send a dict in request
         * 
         * @return builder
         * 
         */
        public Builder valueObj(ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs valueObj) {
            return valueObj(Output.of(valueObj));
        }

        public ApplianceTrafficShapingRulesRuleDefinitionArgs build() {
            return $;
        }
    }

}