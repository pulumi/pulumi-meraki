// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSamlRolesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSamlRolesPlainArgs Empty = new GetSamlRolesPlainArgs();

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * samlRoleId path parameter. Saml role ID
     * 
     */
    @Import(name="samlRoleId")
    private @Nullable String samlRoleId;

    /**
     * @return samlRoleId path parameter. Saml role ID
     * 
     */
    public Optional<String> samlRoleId() {
        return Optional.ofNullable(this.samlRoleId);
    }

    private GetSamlRolesPlainArgs() {}

    private GetSamlRolesPlainArgs(GetSamlRolesPlainArgs $) {
        this.organizationId = $.organizationId;
        this.samlRoleId = $.samlRoleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSamlRolesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSamlRolesPlainArgs $;

        public Builder() {
            $ = new GetSamlRolesPlainArgs();
        }

        public Builder(GetSamlRolesPlainArgs defaults) {
            $ = new GetSamlRolesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param samlRoleId samlRoleId path parameter. Saml role ID
         * 
         * @return builder
         * 
         */
        public Builder samlRoleId(@Nullable String samlRoleId) {
            $.samlRoleId = samlRoleId;
            return this;
        }

        public GetSamlRolesPlainArgs build() {
            return $;
        }
    }

}
