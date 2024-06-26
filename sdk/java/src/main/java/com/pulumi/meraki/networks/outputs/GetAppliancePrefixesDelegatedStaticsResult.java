// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetAppliancePrefixesDelegatedStaticsItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppliancePrefixesDelegatedStaticsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetAppliancePrefixesDelegatedStaticsItem item;
    /**
     * @return Array of ResponseApplianceGetNetworkAppliancePrefixesDelegatedStatics
     * 
     */
    private List<GetAppliancePrefixesDelegatedStaticsItem> items;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private @Nullable String networkId;
    /**
     * @return staticDelegatedPrefixId path parameter. Static delegated prefix ID
     * 
     */
    private @Nullable String staticDelegatedPrefixId;

    private GetAppliancePrefixesDelegatedStaticsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetAppliancePrefixesDelegatedStaticsItem item() {
        return this.item;
    }
    /**
     * @return Array of ResponseApplianceGetNetworkAppliancePrefixesDelegatedStatics
     * 
     */
    public List<GetAppliancePrefixesDelegatedStaticsItem> items() {
        return this.items;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }
    /**
     * @return staticDelegatedPrefixId path parameter. Static delegated prefix ID
     * 
     */
    public Optional<String> staticDelegatedPrefixId() {
        return Optional.ofNullable(this.staticDelegatedPrefixId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppliancePrefixesDelegatedStaticsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetAppliancePrefixesDelegatedStaticsItem item;
        private List<GetAppliancePrefixesDelegatedStaticsItem> items;
        private @Nullable String networkId;
        private @Nullable String staticDelegatedPrefixId;
        public Builder() {}
        public Builder(GetAppliancePrefixesDelegatedStaticsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.item = defaults.item;
    	      this.items = defaults.items;
    	      this.networkId = defaults.networkId;
    	      this.staticDelegatedPrefixId = defaults.staticDelegatedPrefixId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppliancePrefixesDelegatedStaticsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetAppliancePrefixesDelegatedStaticsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetAppliancePrefixesDelegatedStaticsResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetAppliancePrefixesDelegatedStaticsItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetAppliancePrefixesDelegatedStaticsResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetAppliancePrefixesDelegatedStaticsItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder staticDelegatedPrefixId(@Nullable String staticDelegatedPrefixId) {

            this.staticDelegatedPrefixId = staticDelegatedPrefixId;
            return this;
        }
        public GetAppliancePrefixesDelegatedStaticsResult build() {
            final var _resultValue = new GetAppliancePrefixesDelegatedStaticsResult();
            _resultValue.id = id;
            _resultValue.item = item;
            _resultValue.items = items;
            _resultValue.networkId = networkId;
            _resultValue.staticDelegatedPrefixId = staticDelegatedPrefixId;
            return _resultValue;
        }
    }
}
