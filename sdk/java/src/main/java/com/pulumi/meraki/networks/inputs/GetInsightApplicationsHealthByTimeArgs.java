// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInsightApplicationsHealthByTimeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInsightApplicationsHealthByTimeArgs Empty = new GetInsightApplicationsHealthByTimeArgs();

    /**
     * applicationId path parameter. Application ID
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return applicationId path parameter. Application ID
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
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
     * resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 60, 300, 3600, 86400. The default is 300.
     * 
     */
    @Import(name="resolution")
    private @Nullable Output<Integer> resolution;

    /**
     * @return resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 60, 300, 3600, 86400. The default is 300.
     * 
     */
    public Optional<Output<Integer>> resolution() {
        return Optional.ofNullable(this.resolution);
    }

    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 7 days from today.
     * 
     */
    @Import(name="t0")
    private @Nullable Output<String> t0;

    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 7 days from today.
     * 
     */
    public Optional<Output<String>> t0() {
        return Optional.ofNullable(this.t0);
    }

    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
     * 
     */
    @Import(name="t1")
    private @Nullable Output<String> t1;

    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
     * 
     */
    public Optional<Output<String>> t1() {
        return Optional.ofNullable(this.t1);
    }

    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
     * 
     */
    @Import(name="timespan")
    private @Nullable Output<Double> timespan;

    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
     * 
     */
    public Optional<Output<Double>> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    private GetInsightApplicationsHealthByTimeArgs() {}

    private GetInsightApplicationsHealthByTimeArgs(GetInsightApplicationsHealthByTimeArgs $) {
        this.applicationId = $.applicationId;
        this.networkId = $.networkId;
        this.resolution = $.resolution;
        this.t0 = $.t0;
        this.t1 = $.t1;
        this.timespan = $.timespan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInsightApplicationsHealthByTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInsightApplicationsHealthByTimeArgs $;

        public Builder() {
            $ = new GetInsightApplicationsHealthByTimeArgs();
        }

        public Builder(GetInsightApplicationsHealthByTimeArgs defaults) {
            $ = new GetInsightApplicationsHealthByTimeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId applicationId path parameter. Application ID
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId applicationId path parameter. Application ID
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
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
         * @param resolution resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 60, 300, 3600, 86400. The default is 300.
         * 
         * @return builder
         * 
         */
        public Builder resolution(@Nullable Output<Integer> resolution) {
            $.resolution = resolution;
            return this;
        }

        /**
         * @param resolution resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 60, 300, 3600, 86400. The default is 300.
         * 
         * @return builder
         * 
         */
        public Builder resolution(Integer resolution) {
            return resolution(Output.of(resolution));
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 7 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(@Nullable Output<String> t0) {
            $.t0 = t0;
            return this;
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 7 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(String t0) {
            return t0(Output.of(t0));
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(@Nullable Output<String> t1) {
            $.t1 = t1;
            return this;
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(String t1) {
            return t1(Output.of(t1));
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
         * 
         * @return builder
         * 
         */
        public Builder timespan(@Nullable Output<Double> timespan) {
            $.timespan = timespan;
            return this;
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
         * 
         * @return builder
         * 
         */
        public Builder timespan(Double timespan) {
            return timespan(Output.of(timespan));
        }

        public GetInsightApplicationsHealthByTimeArgs build() {
            if ($.applicationId == null) {
                throw new MissingRequiredPropertyException("GetInsightApplicationsHealthByTimeArgs", "applicationId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetInsightApplicationsHealthByTimeArgs", "networkId");
            }
            return $;
        }
    }

}