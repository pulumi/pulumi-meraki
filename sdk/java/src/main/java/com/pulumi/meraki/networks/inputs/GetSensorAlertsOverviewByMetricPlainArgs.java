// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSensorAlertsOverviewByMetricPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSensorAlertsOverviewByMetricPlainArgs Empty = new GetSensorAlertsOverviewByMetricPlainArgs();

    /**
     * interval query parameter. The time interval in seconds for returned data. The valid intervals are: 86400, 604800. The default is 604800.
     * 
     */
    @Import(name="interval")
    private @Nullable Integer interval;

    /**
     * @return interval query parameter. The time interval in seconds for returned data. The valid intervals are: 86400, 604800. The default is 604800.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days from today.
     * 
     */
    @Import(name="t0")
    private @Nullable String t0;

    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days from today.
     * 
     */
    public Optional<String> t0() {
        return Optional.ofNullable(this.t0);
    }

    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    @Import(name="t1")
    private @Nullable String t1;

    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    public Optional<String> t1() {
        return Optional.ofNullable(this.t1);
    }

    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
     * 
     */
    @Import(name="timespan")
    private @Nullable Double timespan;

    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
     * 
     */
    public Optional<Double> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    private GetSensorAlertsOverviewByMetricPlainArgs() {}

    private GetSensorAlertsOverviewByMetricPlainArgs(GetSensorAlertsOverviewByMetricPlainArgs $) {
        this.interval = $.interval;
        this.networkId = $.networkId;
        this.t0 = $.t0;
        this.t1 = $.t1;
        this.timespan = $.timespan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSensorAlertsOverviewByMetricPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSensorAlertsOverviewByMetricPlainArgs $;

        public Builder() {
            $ = new GetSensorAlertsOverviewByMetricPlainArgs();
        }

        public Builder(GetSensorAlertsOverviewByMetricPlainArgs defaults) {
            $ = new GetSensorAlertsOverviewByMetricPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interval interval query parameter. The time interval in seconds for returned data. The valid intervals are: 86400, 604800. The default is 604800.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Integer interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(@Nullable String t0) {
            $.t0 = t0;
            return this;
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(@Nullable String t1) {
            $.t1 = t1;
            return this;
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
         * 
         * @return builder
         * 
         */
        public Builder timespan(@Nullable Double timespan) {
            $.timespan = timespan;
            return this;
        }

        public GetSensorAlertsOverviewByMetricPlainArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricPlainArgs", "networkId");
            }
            return $;
        }
    }

}