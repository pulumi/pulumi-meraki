// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigTemplatesState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigTemplatesState Empty = new ConfigTemplatesState();

    /**
     * configTemplateId path parameter. Config template ID
     * 
     */
    @Import(name="configTemplateId")
    private @Nullable Output<String> configTemplateId;

    /**
     * @return configTemplateId path parameter. Config template ID
     * 
     */
    public Optional<Output<String>> configTemplateId() {
        return Optional.ofNullable(this.configTemplateId);
    }

    /**
     * The name of the configuration template
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the configuration template
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
     * The product types of the configuration template
     * 
     */
    @Import(name="productTypes")
    private @Nullable Output<List<String>> productTypes;

    /**
     * @return The product types of the configuration template
     * 
     */
    public Optional<Output<List<String>>> productTypes() {
        return Optional.ofNullable(this.productTypes);
    }

    /**
     * The timezone of the configuration template. For a list of allowed timezones, please see the &#39;TZ&#39; column in the table in \n\nthis article\n\n. Not applicable if copying from existing network or template
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The timezone of the configuration template. For a list of allowed timezones, please see the &#39;TZ&#39; column in the table in \n\nthis article\n\n. Not applicable if copying from existing network or template
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private ConfigTemplatesState() {}

    private ConfigTemplatesState(ConfigTemplatesState $) {
        this.configTemplateId = $.configTemplateId;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.productTypes = $.productTypes;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigTemplatesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigTemplatesState $;

        public Builder() {
            $ = new ConfigTemplatesState();
        }

        public Builder(ConfigTemplatesState defaults) {
            $ = new ConfigTemplatesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configTemplateId configTemplateId path parameter. Config template ID
         * 
         * @return builder
         * 
         */
        public Builder configTemplateId(@Nullable Output<String> configTemplateId) {
            $.configTemplateId = configTemplateId;
            return this;
        }

        /**
         * @param configTemplateId configTemplateId path parameter. Config template ID
         * 
         * @return builder
         * 
         */
        public Builder configTemplateId(String configTemplateId) {
            return configTemplateId(Output.of(configTemplateId));
        }

        /**
         * @param name The name of the configuration template
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the configuration template
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
         * @param productTypes The product types of the configuration template
         * 
         * @return builder
         * 
         */
        public Builder productTypes(@Nullable Output<List<String>> productTypes) {
            $.productTypes = productTypes;
            return this;
        }

        /**
         * @param productTypes The product types of the configuration template
         * 
         * @return builder
         * 
         */
        public Builder productTypes(List<String> productTypes) {
            return productTypes(Output.of(productTypes));
        }

        /**
         * @param productTypes The product types of the configuration template
         * 
         * @return builder
         * 
         */
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
        }

        /**
         * @param timeZone The timezone of the configuration template. For a list of allowed timezones, please see the &#39;TZ&#39; column in the table in \n\nthis article\n\n. Not applicable if copying from existing network or template
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The timezone of the configuration template. For a list of allowed timezones, please see the &#39;TZ&#39; column in the table in \n\nthis article\n\n. Not applicable if copying from existing network or template
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public ConfigTemplatesState build() {
            return $;
        }
    }

}