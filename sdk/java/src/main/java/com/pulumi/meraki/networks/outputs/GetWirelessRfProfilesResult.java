// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetWirelessRfProfilesItem;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWirelessRfProfilesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return includeTemplateProfiles query parameter. If the network is bound to a template, this parameter controls whether or not the non-basic RF profiles defined on the template should be included in the response alongside the non-basic profiles defined on the bound network. Defaults to false.
     * 
     */
    private @Nullable Boolean includeTemplateProfiles;
    private GetWirelessRfProfilesItem item;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private @Nullable String networkId;
    /**
     * @return rfProfileId path parameter. Rf profile ID
     * 
     */
    private @Nullable String rfProfileId;

    private GetWirelessRfProfilesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return includeTemplateProfiles query parameter. If the network is bound to a template, this parameter controls whether or not the non-basic RF profiles defined on the template should be included in the response alongside the non-basic profiles defined on the bound network. Defaults to false.
     * 
     */
    public Optional<Boolean> includeTemplateProfiles() {
        return Optional.ofNullable(this.includeTemplateProfiles);
    }
    public GetWirelessRfProfilesItem item() {
        return this.item;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }
    /**
     * @return rfProfileId path parameter. Rf profile ID
     * 
     */
    public Optional<String> rfProfileId() {
        return Optional.ofNullable(this.rfProfileId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessRfProfilesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Boolean includeTemplateProfiles;
        private GetWirelessRfProfilesItem item;
        private @Nullable String networkId;
        private @Nullable String rfProfileId;
        public Builder() {}
        public Builder(GetWirelessRfProfilesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.includeTemplateProfiles = defaults.includeTemplateProfiles;
    	      this.item = defaults.item;
    	      this.networkId = defaults.networkId;
    	      this.rfProfileId = defaults.rfProfileId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder includeTemplateProfiles(@Nullable Boolean includeTemplateProfiles) {

            this.includeTemplateProfiles = includeTemplateProfiles;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetWirelessRfProfilesItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetWirelessRfProfilesResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder rfProfileId(@Nullable String rfProfileId) {

            this.rfProfileId = rfProfileId;
            return this;
        }
        public GetWirelessRfProfilesResult build() {
            final var _resultValue = new GetWirelessRfProfilesResult();
            _resultValue.id = id;
            _resultValue.includeTemplateProfiles = includeTemplateProfiles;
            _resultValue.item = item;
            _resultValue.networkId = networkId;
            _resultValue.rfProfileId = rfProfileId;
            return _resultValue;
        }
    }
}