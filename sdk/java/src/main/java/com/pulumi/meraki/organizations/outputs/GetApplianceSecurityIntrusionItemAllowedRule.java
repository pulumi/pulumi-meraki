// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceSecurityIntrusionItemAllowedRule {
    private String message;
    private String ruleId;

    private GetApplianceSecurityIntrusionItemAllowedRule() {}
    public String message() {
        return this.message;
    }
    public String ruleId() {
        return this.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceSecurityIntrusionItemAllowedRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String message;
        private String ruleId;
        public Builder() {}
        public Builder(GetApplianceSecurityIntrusionItemAllowedRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.ruleId = defaults.ruleId;
        }

        @CustomType.Setter
        public Builder message(String message) {
            if (message == null) {
              throw new MissingRequiredPropertyException("GetApplianceSecurityIntrusionItemAllowedRule", "message");
            }
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder ruleId(String ruleId) {
            if (ruleId == null) {
              throw new MissingRequiredPropertyException("GetApplianceSecurityIntrusionItemAllowedRule", "ruleId");
            }
            this.ruleId = ruleId;
            return this;
        }
        public GetApplianceSecurityIntrusionItemAllowedRule build() {
            final var _resultValue = new GetApplianceSecurityIntrusionItemAllowedRule();
            _resultValue.message = message;
            _resultValue.ruleId = ruleId;
            return _resultValue;
        }
    }
}
