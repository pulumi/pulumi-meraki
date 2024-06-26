// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.inputs.LicensesMoveSeatsParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class LicensesMoveSeatsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicensesMoveSeatsArgs Empty = new LicensesMoveSeatsArgs();

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
    private Output<LicensesMoveSeatsParametersArgs> parameters;

    public Output<LicensesMoveSeatsParametersArgs> parameters() {
        return this.parameters;
    }

    private LicensesMoveSeatsArgs() {}

    private LicensesMoveSeatsArgs(LicensesMoveSeatsArgs $) {
        this.organizationId = $.organizationId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensesMoveSeatsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensesMoveSeatsArgs $;

        public Builder() {
            $ = new LicensesMoveSeatsArgs();
        }

        public Builder(LicensesMoveSeatsArgs defaults) {
            $ = new LicensesMoveSeatsArgs(Objects.requireNonNull(defaults));
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

        public Builder parameters(Output<LicensesMoveSeatsParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(LicensesMoveSeatsParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public LicensesMoveSeatsArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("LicensesMoveSeatsArgs", "organizationId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("LicensesMoveSeatsArgs", "parameters");
            }
            return $;
        }
    }

}
