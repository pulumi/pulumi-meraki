// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetTrafficAnalysisItemCustomPieChartItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTrafficAnalysisItem {
    /**
     * @return The list of items that make up the custom pie chart for traffic reporting.
     * 
     */
    private List<GetTrafficAnalysisItemCustomPieChartItem> customPieChartItems;
    /**
     * @return The traffic analysis mode for the network. Can be one of &#39;disabled&#39; (do not collect traffic types),
     * &#39;basic&#39; (collect generic traffic categories), or &#39;detailed&#39; (collect destination hostnames).
     * 
     */
    private String mode;

    private GetTrafficAnalysisItem() {}
    /**
     * @return The list of items that make up the custom pie chart for traffic reporting.
     * 
     */
    public List<GetTrafficAnalysisItemCustomPieChartItem> customPieChartItems() {
        return this.customPieChartItems;
    }
    /**
     * @return The traffic analysis mode for the network. Can be one of &#39;disabled&#39; (do not collect traffic types),
     * &#39;basic&#39; (collect generic traffic categories), or &#39;detailed&#39; (collect destination hostnames).
     * 
     */
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficAnalysisItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTrafficAnalysisItemCustomPieChartItem> customPieChartItems;
        private String mode;
        public Builder() {}
        public Builder(GetTrafficAnalysisItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPieChartItems = defaults.customPieChartItems;
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder customPieChartItems(List<GetTrafficAnalysisItemCustomPieChartItem> customPieChartItems) {
            if (customPieChartItems == null) {
              throw new MissingRequiredPropertyException("GetTrafficAnalysisItem", "customPieChartItems");
            }
            this.customPieChartItems = customPieChartItems;
            return this;
        }
        public Builder customPieChartItems(GetTrafficAnalysisItemCustomPieChartItem... customPieChartItems) {
            return customPieChartItems(List.of(customPieChartItems));
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetTrafficAnalysisItem", "mode");
            }
            this.mode = mode;
            return this;
        }
        public GetTrafficAnalysisItem build() {
            final var _resultValue = new GetTrafficAnalysisItem();
            _resultValue.customPieChartItems = customPieChartItems;
            _resultValue.mode = mode;
            return _resultValue;
        }
    }
}
