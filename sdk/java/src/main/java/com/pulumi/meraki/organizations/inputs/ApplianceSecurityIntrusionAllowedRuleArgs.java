// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplianceSecurityIntrusionAllowedRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplianceSecurityIntrusionAllowedRuleArgs Empty = new ApplianceSecurityIntrusionAllowedRuleArgs();

    /**
     * Message is optional and is ignored on a PUT call. It is allowed in order for PUT to be compatible with GET
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Message is optional and is ignored on a PUT call. It is allowed in order for PUT to be compatible with GET
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * A rule identifier of the format meraki:intrusion/snort/GID/\n\n/SID/\n\n. gid and sid can be obtained from either https://www.snort.org/rule-docs or as ruleIds from the security events in /organization/[orgId]/securityEvents
     * 
     */
    @Import(name="ruleId")
    private @Nullable Output<String> ruleId;

    /**
     * @return A rule identifier of the format meraki:intrusion/snort/GID/\n\n/SID/\n\n. gid and sid can be obtained from either https://www.snort.org/rule-docs or as ruleIds from the security events in /organization/[orgId]/securityEvents
     * 
     */
    public Optional<Output<String>> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    private ApplianceSecurityIntrusionAllowedRuleArgs() {}

    private ApplianceSecurityIntrusionAllowedRuleArgs(ApplianceSecurityIntrusionAllowedRuleArgs $) {
        this.message = $.message;
        this.ruleId = $.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplianceSecurityIntrusionAllowedRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplianceSecurityIntrusionAllowedRuleArgs $;

        public Builder() {
            $ = new ApplianceSecurityIntrusionAllowedRuleArgs();
        }

        public Builder(ApplianceSecurityIntrusionAllowedRuleArgs defaults) {
            $ = new ApplianceSecurityIntrusionAllowedRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param message Message is optional and is ignored on a PUT call. It is allowed in order for PUT to be compatible with GET
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Message is optional and is ignored on a PUT call. It is allowed in order for PUT to be compatible with GET
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param ruleId A rule identifier of the format meraki:intrusion/snort/GID/\n\n/SID/\n\n. gid and sid can be obtained from either https://www.snort.org/rule-docs or as ruleIds from the security events in /organization/[orgId]/securityEvents
         * 
         * @return builder
         * 
         */
        public Builder ruleId(@Nullable Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId A rule identifier of the format meraki:intrusion/snort/GID/\n\n/SID/\n\n. gid and sid can be obtained from either https://www.snort.org/rule-docs or as ruleIds from the security events in /organization/[orgId]/securityEvents
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        public ApplianceSecurityIntrusionAllowedRuleArgs build() {
            return $;
        }
    }

}