// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AlertsProfilesRecipients {
    /**
     * @return A list of emails that will receive information about the alert
     * 
     */
    private @Nullable List<String> emails;
    /**
     * @return A list base64 encoded urls of webhook endpoints that will receive information about the alert
     * 
     */
    private @Nullable List<String> httpServerIds;

    private AlertsProfilesRecipients() {}
    /**
     * @return A list of emails that will receive information about the alert
     * 
     */
    public List<String> emails() {
        return this.emails == null ? List.of() : this.emails;
    }
    /**
     * @return A list base64 encoded urls of webhook endpoints that will receive information about the alert
     * 
     */
    public List<String> httpServerIds() {
        return this.httpServerIds == null ? List.of() : this.httpServerIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertsProfilesRecipients defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> emails;
        private @Nullable List<String> httpServerIds;
        public Builder() {}
        public Builder(AlertsProfilesRecipients defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emails = defaults.emails;
    	      this.httpServerIds = defaults.httpServerIds;
        }

        @CustomType.Setter
        public Builder emails(@Nullable List<String> emails) {

            this.emails = emails;
            return this;
        }
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }
        @CustomType.Setter
        public Builder httpServerIds(@Nullable List<String> httpServerIds) {

            this.httpServerIds = httpServerIds;
            return this;
        }
        public Builder httpServerIds(String... httpServerIds) {
            return httpServerIds(List.of(httpServerIds));
        }
        public AlertsProfilesRecipients build() {
            final var _resultValue = new AlertsProfilesRecipients();
            _resultValue.emails = emails;
            _resultValue.httpServerIds = httpServerIds;
            return _resultValue;
        }
    }
}