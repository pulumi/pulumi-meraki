// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInsightApplicationsItemThresholdsByNetwork {
    /**
     * @return Number of useful information bits delivered over a network per unit of time
     * 
     */
    private Integer goodput;
    /**
     * @return Network identifier
     * 
     */
    private String networkId;
    /**
     * @return Duration of the response, in milliseconds
     * 
     */
    private Integer responseDuration;

    private GetInsightApplicationsItemThresholdsByNetwork() {}
    /**
     * @return Number of useful information bits delivered over a network per unit of time
     * 
     */
    public Integer goodput() {
        return this.goodput;
    }
    /**
     * @return Network identifier
     * 
     */
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return Duration of the response, in milliseconds
     * 
     */
    public Integer responseDuration() {
        return this.responseDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInsightApplicationsItemThresholdsByNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer goodput;
        private String networkId;
        private Integer responseDuration;
        public Builder() {}
        public Builder(GetInsightApplicationsItemThresholdsByNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goodput = defaults.goodput;
    	      this.networkId = defaults.networkId;
    	      this.responseDuration = defaults.responseDuration;
        }

        @CustomType.Setter
        public Builder goodput(Integer goodput) {
            if (goodput == null) {
              throw new MissingRequiredPropertyException("GetInsightApplicationsItemThresholdsByNetwork", "goodput");
            }
            this.goodput = goodput;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetInsightApplicationsItemThresholdsByNetwork", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder responseDuration(Integer responseDuration) {
            if (responseDuration == null) {
              throw new MissingRequiredPropertyException("GetInsightApplicationsItemThresholdsByNetwork", "responseDuration");
            }
            this.responseDuration = responseDuration;
            return this;
        }
        public GetInsightApplicationsItemThresholdsByNetwork build() {
            final var _resultValue = new GetInsightApplicationsItemThresholdsByNetwork();
            _resultValue.goodput = goodput;
            _resultValue.networkId = networkId;
            _resultValue.responseDuration = responseDuration;
            return _resultValue;
        }
    }
}