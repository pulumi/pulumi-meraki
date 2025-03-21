// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetLiveToolsCableTestItemRequest;
import com.pulumi.meraki.devices.outputs.GetLiveToolsCableTestItemResult;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLiveToolsCableTestItem {
    /**
     * @return Id of the cable test request. Used to check the status of the request.
     * 
     */
    private String cableTestId;
    /**
     * @return An error message for a failed execution
     * 
     */
    private String error;
    /**
     * @return Cable test request parameters
     * 
     */
    private GetLiveToolsCableTestItemRequest request;
    /**
     * @return Results of the cable test request, one for each requested port.
     * 
     */
    private List<GetLiveToolsCableTestItemResult> results;
    /**
     * @return Status of the cable test request.
     * 
     */
    private String status;
    /**
     * @return GET this url to check the status of your cable test request.
     * 
     */
    private String url;

    private GetLiveToolsCableTestItem() {}
    /**
     * @return Id of the cable test request. Used to check the status of the request.
     * 
     */
    public String cableTestId() {
        return this.cableTestId;
    }
    /**
     * @return An error message for a failed execution
     * 
     */
    public String error() {
        return this.error;
    }
    /**
     * @return Cable test request parameters
     * 
     */
    public GetLiveToolsCableTestItemRequest request() {
        return this.request;
    }
    /**
     * @return Results of the cable test request, one for each requested port.
     * 
     */
    public List<GetLiveToolsCableTestItemResult> results() {
        return this.results;
    }
    /**
     * @return Status of the cable test request.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return GET this url to check the status of your cable test request.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveToolsCableTestItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cableTestId;
        private String error;
        private GetLiveToolsCableTestItemRequest request;
        private List<GetLiveToolsCableTestItemResult> results;
        private String status;
        private String url;
        public Builder() {}
        public Builder(GetLiveToolsCableTestItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cableTestId = defaults.cableTestId;
    	      this.error = defaults.error;
    	      this.request = defaults.request;
    	      this.results = defaults.results;
    	      this.status = defaults.status;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder cableTestId(String cableTestId) {
            if (cableTestId == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsCableTestItem", "cableTestId");
            }
            this.cableTestId = cableTestId;
            return this;
        }
        @CustomType.Setter
        public Builder error(String error) {
            if (error == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsCableTestItem", "error");
            }
            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder request(GetLiveToolsCableTestItemRequest request) {
            if (request == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsCableTestItem", "request");
            }
            this.request = request;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetLiveToolsCableTestItemResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsCableTestItem", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetLiveToolsCableTestItemResult... results) {
            return results(List.of(results));
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsCableTestItem", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsCableTestItem", "url");
            }
            this.url = url;
            return this;
        }
        public GetLiveToolsCableTestItem build() {
            final var _resultValue = new GetLiveToolsCableTestItem();
            _resultValue.cableTestId = cableTestId;
            _resultValue.error = error;
            _resultValue.request = request;
            _resultValue.results = results;
            _resultValue.status = status;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
