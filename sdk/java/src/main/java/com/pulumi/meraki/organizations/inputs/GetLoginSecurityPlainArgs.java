// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetLoginSecurityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoginSecurityPlainArgs Empty = new GetLoginSecurityPlainArgs();

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    private GetLoginSecurityPlainArgs() {}

    private GetLoginSecurityPlainArgs(GetLoginSecurityPlainArgs $) {
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoginSecurityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoginSecurityPlainArgs $;

        public Builder() {
            $ = new GetLoginSecurityPlainArgs();
        }

        public Builder(GetLoginSecurityPlainArgs defaults) {
            $ = new GetLoginSecurityPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetLoginSecurityPlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetLoginSecurityPlainArgs", "organizationId");
            }
            return $;
        }
    }

}
