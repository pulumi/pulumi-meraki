// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsSchedulesRangesInSecondArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsSchedulesRangesInSecondArgs Empty = new WirelessSsidsSchedulesRangesInSecondArgs();

    /**
     * Seconds since Sunday at midnight when that outage range ends.
     * 
     */
    @Import(name="end")
    private @Nullable Output<Integer> end;

    /**
     * @return Seconds since Sunday at midnight when that outage range ends.
     * 
     */
    public Optional<Output<Integer>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * Seconds since Sunday at midnight when the outage range starts.
     * 
     */
    @Import(name="start")
    private @Nullable Output<Integer> start;

    /**
     * @return Seconds since Sunday at midnight when the outage range starts.
     * 
     */
    public Optional<Output<Integer>> start() {
        return Optional.ofNullable(this.start);
    }

    private WirelessSsidsSchedulesRangesInSecondArgs() {}

    private WirelessSsidsSchedulesRangesInSecondArgs(WirelessSsidsSchedulesRangesInSecondArgs $) {
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsSchedulesRangesInSecondArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsSchedulesRangesInSecondArgs $;

        public Builder() {
            $ = new WirelessSsidsSchedulesRangesInSecondArgs();
        }

        public Builder(WirelessSsidsSchedulesRangesInSecondArgs defaults) {
            $ = new WirelessSsidsSchedulesRangesInSecondArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param end Seconds since Sunday at midnight when that outage range ends.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<Integer> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end Seconds since Sunday at midnight when that outage range ends.
         * 
         * @return builder
         * 
         */
        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        /**
         * @param start Seconds since Sunday at midnight when the outage range starts.
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<Integer> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start Seconds since Sunday at midnight when the outage range starts.
         * 
         * @return builder
         * 
         */
        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        public WirelessSsidsSchedulesRangesInSecondArgs build() {
            return $;
        }
    }

}