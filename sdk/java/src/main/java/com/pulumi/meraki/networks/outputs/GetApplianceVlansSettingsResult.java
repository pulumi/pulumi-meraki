// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetApplianceVlansSettingsItem;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceVlansSettingsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetApplianceVlansSettingsItem item;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;

    private GetApplianceVlansSettingsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetApplianceVlansSettingsItem item() {
        return this.item;
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

    public static Builder builder(GetApplianceVlansSettingsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetApplianceVlansSettingsItem item;
        private String networkId;
        public Builder() {}
        public Builder(GetApplianceVlansSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansSettingsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetApplianceVlansSettingsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansSettingsResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetApplianceVlansSettingsResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        public GetApplianceVlansSettingsResult build() {
            final var _resultValue = new GetApplianceVlansSettingsResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}