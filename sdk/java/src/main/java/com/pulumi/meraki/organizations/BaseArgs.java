// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.BaseApiArgs;
import com.pulumi.meraki.organizations.inputs.BaseManagementArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final BaseArgs Empty = new BaseArgs();

    /**
     * API related settings
     * 
     */
    @Import(name="api")
    private @Nullable Output<BaseApiArgs> api;

    /**
     * @return API related settings
     * 
     */
    public Optional<Output<BaseApiArgs>> api() {
        return Optional.ofNullable(this.api);
    }

    /**
     * Information about the organization&#39;s management system
     * 
     */
    @Import(name="management")
    private @Nullable Output<BaseManagementArgs> management;

    /**
     * @return Information about the organization&#39;s management system
     * 
     */
    public Optional<Output<BaseManagementArgs>> management() {
        return Optional.ofNullable(this.management);
    }

    /**
     * Organization name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Organization name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    private BaseArgs() {}

    private BaseArgs(BaseArgs $) {
        this.api = $.api;
        this.management = $.management;
        this.name = $.name;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaseArgs $;

        public Builder() {
            $ = new BaseArgs();
        }

        public Builder(BaseArgs defaults) {
            $ = new BaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param api API related settings
         * 
         * @return builder
         * 
         */
        public Builder api(@Nullable Output<BaseApiArgs> api) {
            $.api = api;
            return this;
        }

        /**
         * @param api API related settings
         * 
         * @return builder
         * 
         */
        public Builder api(BaseApiArgs api) {
            return api(Output.of(api));
        }

        /**
         * @param management Information about the organization&#39;s management system
         * 
         * @return builder
         * 
         */
        public Builder management(@Nullable Output<BaseManagementArgs> management) {
            $.management = management;
            return this;
        }

        /**
         * @param management Information about the organization&#39;s management system
         * 
         * @return builder
         * 
         */
        public Builder management(BaseManagementArgs management) {
            return management(Output.of(management));
        }

        /**
         * @param name Organization name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Organization name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
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

        public BaseArgs build() {
            return $;
        }
    }

}
