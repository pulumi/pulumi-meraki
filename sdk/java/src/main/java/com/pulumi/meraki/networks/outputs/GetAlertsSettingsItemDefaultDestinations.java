// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAlertsSettingsItemDefaultDestinations {
    private Boolean allAdmins;
    private List<String> emails;
    private List<String> httpServerIds;
    private Boolean snmp;

    private GetAlertsSettingsItemDefaultDestinations() {}
    public Boolean allAdmins() {
        return this.allAdmins;
    }
    public List<String> emails() {
        return this.emails;
    }
    public List<String> httpServerIds() {
        return this.httpServerIds;
    }
    public Boolean snmp() {
        return this.snmp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertsSettingsItemDefaultDestinations defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allAdmins;
        private List<String> emails;
        private List<String> httpServerIds;
        private Boolean snmp;
        public Builder() {}
        public Builder(GetAlertsSettingsItemDefaultDestinations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allAdmins = defaults.allAdmins;
    	      this.emails = defaults.emails;
    	      this.httpServerIds = defaults.httpServerIds;
    	      this.snmp = defaults.snmp;
        }

        @CustomType.Setter
        public Builder allAdmins(Boolean allAdmins) {
            if (allAdmins == null) {
              throw new MissingRequiredPropertyException("GetAlertsSettingsItemDefaultDestinations", "allAdmins");
            }
            this.allAdmins = allAdmins;
            return this;
        }
        @CustomType.Setter
        public Builder emails(List<String> emails) {
            if (emails == null) {
              throw new MissingRequiredPropertyException("GetAlertsSettingsItemDefaultDestinations", "emails");
            }
            this.emails = emails;
            return this;
        }
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }
        @CustomType.Setter
        public Builder httpServerIds(List<String> httpServerIds) {
            if (httpServerIds == null) {
              throw new MissingRequiredPropertyException("GetAlertsSettingsItemDefaultDestinations", "httpServerIds");
            }
            this.httpServerIds = httpServerIds;
            return this;
        }
        public Builder httpServerIds(String... httpServerIds) {
            return httpServerIds(List.of(httpServerIds));
        }
        @CustomType.Setter
        public Builder snmp(Boolean snmp) {
            if (snmp == null) {
              throw new MissingRequiredPropertyException("GetAlertsSettingsItemDefaultDestinations", "snmp");
            }
            this.snmp = snmp;
            return this;
        }
        public GetAlertsSettingsItemDefaultDestinations build() {
            final var _resultValue = new GetAlertsSettingsItemDefaultDestinations();
            _resultValue.allAdmins = allAdmins;
            _resultValue.emails = emails;
            _resultValue.httpServerIds = httpServerIds;
            _resultValue.snmp = snmp;
            return _resultValue;
        }
    }
}