// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsHotspot20MccMncArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsHotspot20MccMncArgs Empty = new WirelessSsidsHotspot20MccMncArgs();

    /**
     * MCC value
     * 
     */
    @Import(name="mcc")
    private @Nullable Output<String> mcc;

    /**
     * @return MCC value
     * 
     */
    public Optional<Output<String>> mcc() {
        return Optional.ofNullable(this.mcc);
    }

    /**
     * MNC value
     * 
     */
    @Import(name="mnc")
    private @Nullable Output<String> mnc;

    /**
     * @return MNC value
     * 
     */
    public Optional<Output<String>> mnc() {
        return Optional.ofNullable(this.mnc);
    }

    private WirelessSsidsHotspot20MccMncArgs() {}

    private WirelessSsidsHotspot20MccMncArgs(WirelessSsidsHotspot20MccMncArgs $) {
        this.mcc = $.mcc;
        this.mnc = $.mnc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsHotspot20MccMncArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsHotspot20MccMncArgs $;

        public Builder() {
            $ = new WirelessSsidsHotspot20MccMncArgs();
        }

        public Builder(WirelessSsidsHotspot20MccMncArgs defaults) {
            $ = new WirelessSsidsHotspot20MccMncArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mcc MCC value
         * 
         * @return builder
         * 
         */
        public Builder mcc(@Nullable Output<String> mcc) {
            $.mcc = mcc;
            return this;
        }

        /**
         * @param mcc MCC value
         * 
         * @return builder
         * 
         */
        public Builder mcc(String mcc) {
            return mcc(Output.of(mcc));
        }

        /**
         * @param mnc MNC value
         * 
         * @return builder
         * 
         */
        public Builder mnc(@Nullable Output<String> mnc) {
            $.mnc = mnc;
            return this;
        }

        /**
         * @param mnc MNC value
         * 
         * @return builder
         * 
         */
        public Builder mnc(String mnc) {
            return mnc(Output.of(mnc));
        }

        public WirelessSsidsHotspot20MccMncArgs build() {
            return $;
        }
    }

}
