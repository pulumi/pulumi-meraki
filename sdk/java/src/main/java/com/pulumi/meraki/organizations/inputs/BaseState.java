// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.BaseApiArgs;
import com.pulumi.meraki.organizations.inputs.BaseCloudArgs;
import com.pulumi.meraki.organizations.inputs.BaseLicensingArgs;
import com.pulumi.meraki.organizations.inputs.BaseManagementArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BaseState extends com.pulumi.resources.ResourceArgs {

    public static final BaseState Empty = new BaseState();

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
     * Data for this organization
     * 
     */
    @Import(name="cloud")
    private @Nullable Output<BaseCloudArgs> cloud;

    /**
     * @return Data for this organization
     * 
     */
    public Optional<Output<BaseCloudArgs>> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    /**
     * Licensing related settings
     * 
     */
    @Import(name="licensing")
    private @Nullable Output<BaseLicensingArgs> licensing;

    /**
     * @return Licensing related settings
     * 
     */
    public Optional<Output<BaseLicensingArgs>> licensing() {
        return Optional.ofNullable(this.licensing);
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

    /**
     * Organization URL
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return Organization URL
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private BaseState() {}

    private BaseState(BaseState $) {
        this.api = $.api;
        this.cloud = $.cloud;
        this.licensing = $.licensing;
        this.management = $.management;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaseState $;

        public Builder() {
            $ = new BaseState();
        }

        public Builder(BaseState defaults) {
            $ = new BaseState(Objects.requireNonNull(defaults));
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
         * @param cloud Data for this organization
         * 
         * @return builder
         * 
         */
        public Builder cloud(@Nullable Output<BaseCloudArgs> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud Data for this organization
         * 
         * @return builder
         * 
         */
        public Builder cloud(BaseCloudArgs cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param licensing Licensing related settings
         * 
         * @return builder
         * 
         */
        public Builder licensing(@Nullable Output<BaseLicensingArgs> licensing) {
            $.licensing = licensing;
            return this;
        }

        /**
         * @param licensing Licensing related settings
         * 
         * @return builder
         * 
         */
        public Builder licensing(BaseLicensingArgs licensing) {
            return licensing(Output.of(licensing));
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

        /**
         * @param url Organization URL
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Organization URL
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public BaseState build() {
            return $;
        }
    }

}
