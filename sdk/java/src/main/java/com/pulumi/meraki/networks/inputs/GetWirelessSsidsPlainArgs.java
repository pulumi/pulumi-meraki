// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWirelessSsidsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWirelessSsidsPlainArgs Empty = new GetWirelessSsidsPlainArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * number path parameter.
     * 
     */
    @Import(name="number")
    private @Nullable String number;

    /**
     * @return number path parameter.
     * 
     */
    public Optional<String> number() {
        return Optional.ofNullable(this.number);
    }

    private GetWirelessSsidsPlainArgs() {}

    private GetWirelessSsidsPlainArgs(GetWirelessSsidsPlainArgs $) {
        this.networkId = $.networkId;
        this.number = $.number;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWirelessSsidsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWirelessSsidsPlainArgs $;

        public Builder() {
            $ = new GetWirelessSsidsPlainArgs();
        }

        public Builder(GetWirelessSsidsPlainArgs defaults) {
            $ = new GetWirelessSsidsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable String networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param number number path parameter.
         * 
         * @return builder
         * 
         */
        public Builder number(@Nullable String number) {
            $.number = number;
            return this;
        }

        public GetWirelessSsidsPlainArgs build() {
            return $;
        }
    }

}