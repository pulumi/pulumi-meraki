// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplianceUplinksSettingsItemInterfacesWan2SvisIpv4Nameservers {
    /**
     * @return Up to 2 nameserver addresses to use, ordered in priority from highest to lowest priority.
     * 
     */
    private List<String> addresses;

    private GetApplianceUplinksSettingsItemInterfacesWan2SvisIpv4Nameservers() {}
    /**
     * @return Up to 2 nameserver addresses to use, ordered in priority from highest to lowest priority.
     * 
     */
    public List<String> addresses() {
        return this.addresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceUplinksSettingsItemInterfacesWan2SvisIpv4Nameservers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> addresses;
        public Builder() {}
        public Builder(GetApplianceUplinksSettingsItemInterfacesWan2SvisIpv4Nameservers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
        }

        @CustomType.Setter
        public Builder addresses(List<String> addresses) {
            if (addresses == null) {
              throw new MissingRequiredPropertyException("GetApplianceUplinksSettingsItemInterfacesWan2SvisIpv4Nameservers", "addresses");
            }
            this.addresses = addresses;
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        public GetApplianceUplinksSettingsItemInterfacesWan2SvisIpv4Nameservers build() {
            final var _resultValue = new GetApplianceUplinksSettingsItemInterfacesWan2SvisIpv4Nameservers();
            _resultValue.addresses = addresses;
            return _resultValue;
        }
    }
}
