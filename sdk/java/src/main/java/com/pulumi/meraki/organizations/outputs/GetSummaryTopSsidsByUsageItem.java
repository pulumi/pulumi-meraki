// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetSummaryTopSsidsByUsageItemClients;
import com.pulumi.meraki.organizations.outputs.GetSummaryTopSsidsByUsageItemUsage;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSummaryTopSsidsByUsageItem {
    /**
     * @return Clients info of the SSID
     * 
     */
    private GetSummaryTopSsidsByUsageItemClients clients;
    /**
     * @return Name of the SSID
     * 
     */
    private String name;
    /**
     * @return Date usage of the SSID, in megabytes
     * 
     */
    private GetSummaryTopSsidsByUsageItemUsage usage;

    private GetSummaryTopSsidsByUsageItem() {}
    /**
     * @return Clients info of the SSID
     * 
     */
    public GetSummaryTopSsidsByUsageItemClients clients() {
        return this.clients;
    }
    /**
     * @return Name of the SSID
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Date usage of the SSID, in megabytes
     * 
     */
    public GetSummaryTopSsidsByUsageItemUsage usage() {
        return this.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSummaryTopSsidsByUsageItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetSummaryTopSsidsByUsageItemClients clients;
        private String name;
        private GetSummaryTopSsidsByUsageItemUsage usage;
        public Builder() {}
        public Builder(GetSummaryTopSsidsByUsageItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
    	      this.name = defaults.name;
    	      this.usage = defaults.usage;
        }

        @CustomType.Setter
        public Builder clients(GetSummaryTopSsidsByUsageItemClients clients) {
            if (clients == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopSsidsByUsageItem", "clients");
            }
            this.clients = clients;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopSsidsByUsageItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder usage(GetSummaryTopSsidsByUsageItemUsage usage) {
            if (usage == null) {
              throw new MissingRequiredPropertyException("GetSummaryTopSsidsByUsageItem", "usage");
            }
            this.usage = usage;
            return this;
        }
        public GetSummaryTopSsidsByUsageItem build() {
            final var _resultValue = new GetSummaryTopSsidsByUsageItem();
            _resultValue.clients = clients;
            _resultValue.name = name;
            _resultValue.usage = usage;
            return _resultValue;
        }
    }
}
