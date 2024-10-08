// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.inputs.NetworksCombineParametersArgs;
import java.lang.String;
import java.util.Objects;


public final class NetworksCombineArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworksCombineArgs Empty = new NetworksCombineArgs();

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
    private Output<NetworksCombineParametersArgs> parameters;

    public Output<NetworksCombineParametersArgs> parameters() {
        return this.parameters;
    }

    private NetworksCombineArgs() {}

    private NetworksCombineArgs(NetworksCombineArgs $) {
        this.organizationId = $.organizationId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworksCombineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworksCombineArgs $;

        public Builder() {
            $ = new NetworksCombineArgs();
        }

        public Builder(NetworksCombineArgs defaults) {
            $ = new NetworksCombineArgs(Objects.requireNonNull(defaults));
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

        public Builder parameters(Output<NetworksCombineParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(NetworksCombineParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public NetworksCombineArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("NetworksCombineArgs", "organizationId");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("NetworksCombineArgs", "parameters");
            }
            return $;
        }
    }

}
