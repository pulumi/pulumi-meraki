// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.WirelessSsidsEapOverrideEapolKeyArgs;
import com.pulumi.meraki.networks.inputs.WirelessSsidsEapOverrideIdentityArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsEapOverrideState extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsEapOverrideState Empty = new WirelessSsidsEapOverrideState();

    /**
     * EAPOL Key settings.
     * 
     */
    @Import(name="eapolKey")
    private @Nullable Output<WirelessSsidsEapOverrideEapolKeyArgs> eapolKey;

    /**
     * @return EAPOL Key settings.
     * 
     */
    public Optional<Output<WirelessSsidsEapOverrideEapolKeyArgs>> eapolKey() {
        return Optional.ofNullable(this.eapolKey);
    }

    /**
     * EAP settings for identity requests.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<WirelessSsidsEapOverrideIdentityArgs> identity;

    /**
     * @return EAP settings for identity requests.
     * 
     */
    public Optional<Output<WirelessSsidsEapOverrideIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Maximum number of general EAP retries.
     * 
     */
    @Import(name="maxRetries")
    private @Nullable Output<Integer> maxRetries;

    /**
     * @return Maximum number of general EAP retries.
     * 
     */
    public Optional<Output<Integer>> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

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
     * number path parameter.
     * 
     */
    @Import(name="number")
    private @Nullable Output<String> number;

    /**
     * @return number path parameter.
     * 
     */
    public Optional<Output<String>> number() {
        return Optional.ofNullable(this.number);
    }

    /**
     * General EAP timeout in seconds.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return General EAP timeout in seconds.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private WirelessSsidsEapOverrideState() {}

    private WirelessSsidsEapOverrideState(WirelessSsidsEapOverrideState $) {
        this.eapolKey = $.eapolKey;
        this.identity = $.identity;
        this.maxRetries = $.maxRetries;
        this.networkId = $.networkId;
        this.number = $.number;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsEapOverrideState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsEapOverrideState $;

        public Builder() {
            $ = new WirelessSsidsEapOverrideState();
        }

        public Builder(WirelessSsidsEapOverrideState defaults) {
            $ = new WirelessSsidsEapOverrideState(Objects.requireNonNull(defaults));
        }

        /**
         * @param eapolKey EAPOL Key settings.
         * 
         * @return builder
         * 
         */
        public Builder eapolKey(@Nullable Output<WirelessSsidsEapOverrideEapolKeyArgs> eapolKey) {
            $.eapolKey = eapolKey;
            return this;
        }

        /**
         * @param eapolKey EAPOL Key settings.
         * 
         * @return builder
         * 
         */
        public Builder eapolKey(WirelessSsidsEapOverrideEapolKeyArgs eapolKey) {
            return eapolKey(Output.of(eapolKey));
        }

        /**
         * @param identity EAP settings for identity requests.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<WirelessSsidsEapOverrideIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity EAP settings for identity requests.
         * 
         * @return builder
         * 
         */
        public Builder identity(WirelessSsidsEapOverrideIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param maxRetries Maximum number of general EAP retries.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        /**
         * @param maxRetries Maximum number of general EAP retries.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
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
         * @param number number path parameter.
         * 
         * @return builder
         * 
         */
        public Builder number(@Nullable Output<String> number) {
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
         * @param timeout General EAP timeout in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout General EAP timeout in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public WirelessSsidsEapOverrideState build() {
            return $;
        }
    }

}