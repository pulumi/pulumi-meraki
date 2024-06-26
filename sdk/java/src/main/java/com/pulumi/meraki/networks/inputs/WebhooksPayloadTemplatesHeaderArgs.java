// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhooksPayloadTemplatesHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhooksPayloadTemplatesHeaderArgs Empty = new WebhooksPayloadTemplatesHeaderArgs();

    /**
     * The name of the header attribute
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the header attribute
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The value returned in the header attribute, in liquid template
     * 
     */
    @Import(name="template")
    private @Nullable Output<String> template;

    /**
     * @return The value returned in the header attribute, in liquid template
     * 
     */
    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    private WebhooksPayloadTemplatesHeaderArgs() {}

    private WebhooksPayloadTemplatesHeaderArgs(WebhooksPayloadTemplatesHeaderArgs $) {
        this.name = $.name;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhooksPayloadTemplatesHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhooksPayloadTemplatesHeaderArgs $;

        public Builder() {
            $ = new WebhooksPayloadTemplatesHeaderArgs();
        }

        public Builder(WebhooksPayloadTemplatesHeaderArgs defaults) {
            $ = new WebhooksPayloadTemplatesHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the header attribute
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the header attribute
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param template The value returned in the header attribute, in liquid template
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template The value returned in the header attribute, in liquid template
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        public WebhooksPayloadTemplatesHeaderArgs build() {
            return $;
        }
    }

}
