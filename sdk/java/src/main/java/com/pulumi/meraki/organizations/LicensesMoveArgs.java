// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.inputs.LicensesMoveParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class LicensesMoveArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicensesMoveArgs Empty = new LicensesMoveArgs();

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    @Import(name="parameters", required=true)
    private Output<LicensesMoveParametersArgs> parameters;

    public Output<LicensesMoveParametersArgs> parameters() {
        return this.parameters;
    }

    private LicensesMoveArgs() {}

    private LicensesMoveArgs(LicensesMoveArgs $) {
        this.organizationId = $.organizationId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensesMoveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensesMoveArgs $;

        public Builder() {
            $ = new LicensesMoveArgs();
        }

        public Builder(LicensesMoveArgs defaults) {
            $ = new LicensesMoveArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public Builder parameters(Output<LicensesMoveParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(LicensesMoveParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public LicensesMoveArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("LicensesMoveArgs", "organizationId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("LicensesMoveArgs", "parameters");
            }
            return $;
        }
    }

}