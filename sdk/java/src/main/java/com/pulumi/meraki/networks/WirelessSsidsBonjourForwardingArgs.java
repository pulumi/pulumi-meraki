// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.WirelessSsidsBonjourForwardingExceptionArgs;
import com.pulumi.meraki.networks.inputs.WirelessSsidsBonjourForwardingRuleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsBonjourForwardingArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsBonjourForwardingArgs Empty = new WirelessSsidsBonjourForwardingArgs();

    /**
     * If true, Bonjour forwarding is enabled on the SSID.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return If true, Bonjour forwarding is enabled on the SSID.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Bonjour forwarding exception
     * 
     */
    @Import(name="exception")
    private @Nullable Output<WirelessSsidsBonjourForwardingExceptionArgs> exception;

    /**
     * @return Bonjour forwarding exception
     * 
     */
    public Optional<Output<WirelessSsidsBonjourForwardingExceptionArgs>> exception() {
        return Optional.ofNullable(this.exception);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * number path parameter.
     * 
     */
    @Import(name="number", required=true)
    private Output<String> number;

    /**
     * @return number path parameter.
     * 
     */
    public Output<String> number() {
        return this.number;
    }

    /**
     * Bonjour forwarding rules
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<WirelessSsidsBonjourForwardingRuleArgs>> rules;

    /**
     * @return Bonjour forwarding rules
     * 
     */
    public Optional<Output<List<WirelessSsidsBonjourForwardingRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private WirelessSsidsBonjourForwardingArgs() {}

    private WirelessSsidsBonjourForwardingArgs(WirelessSsidsBonjourForwardingArgs $) {
        this.enabled = $.enabled;
        this.exception = $.exception;
        this.networkId = $.networkId;
        this.number = $.number;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsBonjourForwardingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsBonjourForwardingArgs $;

        public Builder() {
            $ = new WirelessSsidsBonjourForwardingArgs();
        }

        public Builder(WirelessSsidsBonjourForwardingArgs defaults) {
            $ = new WirelessSsidsBonjourForwardingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled If true, Bonjour forwarding is enabled on the SSID.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If true, Bonjour forwarding is enabled on the SSID.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param exception Bonjour forwarding exception
         * 
         * @return builder
         * 
         */
        public Builder exception(@Nullable Output<WirelessSsidsBonjourForwardingExceptionArgs> exception) {
            $.exception = exception;
            return this;
        }

        /**
         * @param exception Bonjour forwarding exception
         * 
         * @return builder
         * 
         */
        public Builder exception(WirelessSsidsBonjourForwardingExceptionArgs exception) {
            return exception(Output.of(exception));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
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
         * @param number number path parameter.
         * 
         * @return builder
         * 
         */
        public Builder number(Output<String> number) {
            $.number = number;
            return this;
        }

        /**
         * @param number number path parameter.
         * 
         * @return builder
         * 
         */
        public Builder number(String number) {
            return number(Output.of(number));
        }

        /**
         * @param rules Bonjour forwarding rules
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<WirelessSsidsBonjourForwardingRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Bonjour forwarding rules
         * 
         * @return builder
         * 
         */
        public Builder rules(List<WirelessSsidsBonjourForwardingRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Bonjour forwarding rules
         * 
         * @return builder
         * 
         */
        public Builder rules(WirelessSsidsBonjourForwardingRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public WirelessSsidsBonjourForwardingArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("WirelessSsidsBonjourForwardingArgs", "networkId");
            }
            if ($.number == null) {
                throw new MissingRequiredPropertyException("WirelessSsidsBonjourForwardingArgs", "number");
            }
            return $;
        }
    }

}
