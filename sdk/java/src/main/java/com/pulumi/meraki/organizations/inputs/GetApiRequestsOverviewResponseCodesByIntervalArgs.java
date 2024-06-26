// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiRequestsOverviewResponseCodesByIntervalArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiRequestsOverviewResponseCodesByIntervalArgs Empty = new GetApiRequestsOverviewResponseCodesByIntervalArgs();

    /**
     * adminIds query parameter. Filter by admin ID of user that made the API request
     * 
     */
    @Import(name="adminIds")
    private @Nullable Output<List<String>> adminIds;

    /**
     * @return adminIds query parameter. Filter by admin ID of user that made the API request
     * 
     */
    public Optional<Output<List<String>>> adminIds() {
        return Optional.ofNullable(this.adminIds);
    }

    /**
     * interval query parameter. The time interval in seconds for returned data. The valid intervals are: 120, 3600, 14400, 21600. The default is 21600. Interval is calculated if time params are provided.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return interval query parameter. The time interval in seconds for returned data. The valid intervals are: 120, 3600, 14400, 21600. The default is 21600. Interval is calculated if time params are provided.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * operationIds query parameter. Filter by operation ID of the endpoint
     * 
     */
    @Import(name="operationIds")
    private @Nullable Output<List<String>> operationIds;

    /**
     * @return operationIds query parameter. Filter by operation ID of the endpoint
     * 
     */
    public Optional<Output<List<String>>> operationIds() {
        return Optional.ofNullable(this.operationIds);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * sourceIps query parameter. Filter by source IP that made the API request
     * 
     */
    @Import(name="sourceIps")
    private @Nullable Output<List<String>> sourceIps;

    /**
     * @return sourceIps query parameter. Filter by source IP that made the API request
     * 
     */
    public Optional<Output<List<String>>> sourceIps() {
        return Optional.ofNullable(this.sourceIps);
    }

    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     * 
     */
    @Import(name="t0")
    private @Nullable Output<String> t0;

    /**
     * @return t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     * 
     */
    public Optional<Output<String>> t0() {
        return Optional.ofNullable(this.t0);
    }

    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    @Import(name="t1")
    private @Nullable Output<String> t1;

    /**
     * @return t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     * 
     */
    public Optional<Output<String>> t1() {
        return Optional.ofNullable(this.t1);
    }

    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days. If interval is provided, the timespan will be autocalculated.
     * 
     */
    @Import(name="timespan")
    private @Nullable Output<Double> timespan;

    /**
     * @return timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days. If interval is provided, the timespan will be autocalculated.
     * 
     */
    public Optional<Output<Double>> timespan() {
        return Optional.ofNullable(this.timespan);
    }

    /**
     * userAgent query parameter. Filter by user agent string for API request. This will filter by a complete or partial match.
     * 
     */
    @Import(name="userAgent")
    private @Nullable Output<String> userAgent;

    /**
     * @return userAgent query parameter. Filter by user agent string for API request. This will filter by a complete or partial match.
     * 
     */
    public Optional<Output<String>> userAgent() {
        return Optional.ofNullable(this.userAgent);
    }

    /**
     * version query parameter. Filter by API version of the endpoint. Allowable values are: [0, 1]
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return version query parameter. Filter by API version of the endpoint. Allowable values are: [0, 1]
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetApiRequestsOverviewResponseCodesByIntervalArgs() {}

    private GetApiRequestsOverviewResponseCodesByIntervalArgs(GetApiRequestsOverviewResponseCodesByIntervalArgs $) {
        this.adminIds = $.adminIds;
        this.interval = $.interval;
        this.operationIds = $.operationIds;
        this.organizationId = $.organizationId;
        this.sourceIps = $.sourceIps;
        this.t0 = $.t0;
        this.t1 = $.t1;
        this.timespan = $.timespan;
        this.userAgent = $.userAgent;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiRequestsOverviewResponseCodesByIntervalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiRequestsOverviewResponseCodesByIntervalArgs $;

        public Builder() {
            $ = new GetApiRequestsOverviewResponseCodesByIntervalArgs();
        }

        public Builder(GetApiRequestsOverviewResponseCodesByIntervalArgs defaults) {
            $ = new GetApiRequestsOverviewResponseCodesByIntervalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminIds adminIds query parameter. Filter by admin ID of user that made the API request
         * 
         * @return builder
         * 
         */
        public Builder adminIds(@Nullable Output<List<String>> adminIds) {
            $.adminIds = adminIds;
            return this;
        }

        /**
         * @param adminIds adminIds query parameter. Filter by admin ID of user that made the API request
         * 
         * @return builder
         * 
         */
        public Builder adminIds(List<String> adminIds) {
            return adminIds(Output.of(adminIds));
        }

        /**
         * @param adminIds adminIds query parameter. Filter by admin ID of user that made the API request
         * 
         * @return builder
         * 
         */
        public Builder adminIds(String... adminIds) {
            return adminIds(List.of(adminIds));
        }

        /**
         * @param interval interval query parameter. The time interval in seconds for returned data. The valid intervals are: 120, 3600, 14400, 21600. The default is 21600. Interval is calculated if time params are provided.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval interval query parameter. The time interval in seconds for returned data. The valid intervals are: 120, 3600, 14400, 21600. The default is 21600. Interval is calculated if time params are provided.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param operationIds operationIds query parameter. Filter by operation ID of the endpoint
         * 
         * @return builder
         * 
         */
        public Builder operationIds(@Nullable Output<List<String>> operationIds) {
            $.operationIds = operationIds;
            return this;
        }

        /**
         * @param operationIds operationIds query parameter. Filter by operation ID of the endpoint
         * 
         * @return builder
         * 
         */
        public Builder operationIds(List<String> operationIds) {
            return operationIds(Output.of(operationIds));
        }

        /**
         * @param operationIds operationIds query parameter. Filter by operation ID of the endpoint
         * 
         * @return builder
         * 
         */
        public Builder operationIds(String... operationIds) {
            return operationIds(List.of(operationIds));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param sourceIps sourceIps query parameter. Filter by source IP that made the API request
         * 
         * @return builder
         * 
         */
        public Builder sourceIps(@Nullable Output<List<String>> sourceIps) {
            $.sourceIps = sourceIps;
            return this;
        }

        /**
         * @param sourceIps sourceIps query parameter. Filter by source IP that made the API request
         * 
         * @return builder
         * 
         */
        public Builder sourceIps(List<String> sourceIps) {
            return sourceIps(Output.of(sourceIps));
        }

        /**
         * @param sourceIps sourceIps query parameter. Filter by source IP that made the API request
         * 
         * @return builder
         * 
         */
        public Builder sourceIps(String... sourceIps) {
            return sourceIps(List.of(sourceIps));
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(@Nullable Output<String> t0) {
            $.t0 = t0;
            return this;
        }

        /**
         * @param t0 t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
         * 
         * @return builder
         * 
         */
        public Builder t0(String t0) {
            return t0(Output.of(t0));
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(@Nullable Output<String> t1) {
            $.t1 = t1;
            return this;
        }

        /**
         * @param t1 t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
         * 
         * @return builder
         * 
         */
        public Builder t1(String t1) {
            return t1(Output.of(t1));
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days. If interval is provided, the timespan will be autocalculated.
         * 
         * @return builder
         * 
         */
        public Builder timespan(@Nullable Output<Double> timespan) {
            $.timespan = timespan;
            return this;
        }

        /**
         * @param timespan timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days. If interval is provided, the timespan will be autocalculated.
         * 
         * @return builder
         * 
         */
        public Builder timespan(Double timespan) {
            return timespan(Output.of(timespan));
        }

        /**
         * @param userAgent userAgent query parameter. Filter by user agent string for API request. This will filter by a complete or partial match.
         * 
         * @return builder
         * 
         */
        public Builder userAgent(@Nullable Output<String> userAgent) {
            $.userAgent = userAgent;
            return this;
        }

        /**
         * @param userAgent userAgent query parameter. Filter by user agent string for API request. This will filter by a complete or partial match.
         * 
         * @return builder
         * 
         */
        public Builder userAgent(String userAgent) {
            return userAgent(Output.of(userAgent));
        }

        /**
         * @param version version query parameter. Filter by API version of the endpoint. Allowable values are: [0, 1]
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version version query parameter. Filter by API version of the endpoint. Allowable values are: [0, 1]
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetApiRequestsOverviewResponseCodesByIntervalArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetApiRequestsOverviewResponseCodesByIntervalArgs", "organizationId");
            }
            return $;
        }
    }

}
