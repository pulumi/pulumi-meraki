// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSummaryTopNetworksByStatusItemStatusesByProductTypeCounts {
    /**
     * @return Count of alerting devices
     * 
     */
    private Integer alerting;
    /**
     * @return Count of dormant devices
     * 
     */
    private Integer dormant;
    /**
     * @return Count of offline devices
     * 
     */
    private Integer offline;
    /**
     * @return Count of online devices
     * 
     */
    private Integer online;

    private GetSummaryTopNetworksByStatusItemStatusesByProductTypeCounts() {}
    /**
     * @return Count of alerting devices
     * 
     */
    public Integer alerting() {
        return this.alerting;
    }
    /**
     * @return Count of dormant devices
     * 
     */
    public Integer dormant() {
        return this.dormant;
    }
    /**
     * @return Count of offline devices
     * 
     */
    public Integer offline() {
        return this.offline;
    }
    /**
     * @return Count of online devices
     * 
     */
    public Integer online() {
        return this.online;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSummaryTopNetworksByStatusItemStatusesByProductTypeCounts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer alerting;
        private Integer dormant;
        private Integer offline;
        private Integer online;
        public Builder() {}
        public Builder(GetSummaryTopNetworksByStatusItemStatusesByProductTypeCounts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerting = defaults.alerting;
    	      this.dormant = defaults.dormant;
    	      this.offline = defaults.offline;
    	      this.online = defaults.online;
        }

        @CustomType.Setter
        public Builder alerting(Integer alerting) {
            if (alerting == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopNetworksByStatusItemStatusesByProductTypeCounts", "alerting");
            }
            this.alerting = alerting;
            return this;
        }
        @CustomType.Setter
        public Builder dormant(Integer dormant) {
            if (dormant == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopNetworksByStatusItemStatusesByProductTypeCounts", "dormant");
            }
            this.dormant = dormant;
            return this;
        }
        @CustomType.Setter
        public Builder offline(Integer offline) {
            if (offline == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopNetworksByStatusItemStatusesByProductTypeCounts", "offline");
            }
            this.offline = offline;
            return this;
        }
        @CustomType.Setter
        public Builder online(Integer online) {
            if (online == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopNetworksByStatusItemStatusesByProductTypeCounts", "online");
            }
            this.online = online;
            return this;
        }
        public GetSummaryTopNetworksByStatusItemStatusesByProductTypeCounts build() {
            final var _resultValue = new GetSummaryTopNetworksByStatusItemStatusesByProductTypeCounts();
            _resultValue.alerting = alerting;
            _resultValue.dormant = dormant;
            _resultValue.offline = offline;
            _resultValue.online = online;
            return _resultValue;
        }
    }
}