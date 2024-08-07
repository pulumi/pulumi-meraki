// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetTrafficShapingDscpTaggingOptionsItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTrafficShapingDscpTaggingOptionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of ResponseNetworksGetNetworkTrafficShapingDscpTaggingOptions
     * 
     */
    private List<GetTrafficShapingDscpTaggingOptionsItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;

    private GetTrafficShapingDscpTaggingOptionsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of ResponseNetworksGetNetworkTrafficShapingDscpTaggingOptions
     * 
     */
    public List<GetTrafficShapingDscpTaggingOptionsItem> items() {
        return this.items;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficShapingDscpTaggingOptionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetTrafficShapingDscpTaggingOptionsItem> items;
        private String networkId;
        public Builder() {}
        public Builder(GetTrafficShapingDscpTaggingOptionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTrafficShapingDscpTaggingOptionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetTrafficShapingDscpTaggingOptionsItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetTrafficShapingDscpTaggingOptionsResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetTrafficShapingDscpTaggingOptionsItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetTrafficShapingDscpTaggingOptionsResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        public GetTrafficShapingDscpTaggingOptionsResult build() {
            final var _resultValue = new GetTrafficShapingDscpTaggingOptionsResult();
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}
