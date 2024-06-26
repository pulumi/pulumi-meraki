// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.WebhooksPayloadTemplatesHeaderArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhooksPayloadTemplatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhooksPayloadTemplatesArgs Empty = new WebhooksPayloadTemplatesArgs();

    /**
     * The body of the payload template, in liquid template
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return The body of the payload template, in liquid template
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
     * 
     */
    @Import(name="bodyFile")
    private @Nullable Output<String> bodyFile;

    /**
     * @return A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
     * 
     */
    public Optional<Output<String>> bodyFile() {
        return Optional.ofNullable(this.bodyFile);
    }

    /**
     * The payload template headers, will be rendered as a key-value pair in the webhook.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<WebhooksPayloadTemplatesHeaderArgs>> headers;

    /**
     * @return The payload template headers, will be rendered as a key-value pair in the webhook.
     * 
     */
    public Optional<Output<List<WebhooksPayloadTemplatesHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * A file containing the liquid template used with the webhook headers.
     * 
     */
    @Import(name="headersFile")
    private @Nullable Output<String> headersFile;

    /**
     * @return A file containing the liquid template used with the webhook headers.
     * 
     */
    public Optional<Output<String>> headersFile() {
        return Optional.ofNullable(this.headersFile);
    }

    /**
     * The name of the payload template
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the payload template
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * Webhook payload template Id
     * 
     */
    @Import(name="payloadTemplateId")
    private @Nullable Output<String> payloadTemplateId;

    /**
     * @return Webhook payload template Id
     * 
     */
    public Optional<Output<String>> payloadTemplateId() {
        return Optional.ofNullable(this.payloadTemplateId);
    }

    private WebhooksPayloadTemplatesArgs() {}

    private WebhooksPayloadTemplatesArgs(WebhooksPayloadTemplatesArgs $) {
        this.body = $.body;
        this.bodyFile = $.bodyFile;
        this.headers = $.headers;
        this.headersFile = $.headersFile;
        this.name = $.name;
        this.networkId = $.networkId;
        this.payloadTemplateId = $.payloadTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhooksPayloadTemplatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhooksPayloadTemplatesArgs $;

        public Builder() {
            $ = new WebhooksPayloadTemplatesArgs();
        }

        public Builder(WebhooksPayloadTemplatesArgs defaults) {
            $ = new WebhooksPayloadTemplatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param body The body of the payload template, in liquid template
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body The body of the payload template, in liquid template
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param bodyFile A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
         * 
         * @return builder
         * 
         */
        public Builder bodyFile(@Nullable Output<String> bodyFile) {
            $.bodyFile = bodyFile;
            return this;
        }

        /**
         * @param bodyFile A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
         * 
         * @return builder
         * 
         */
        public Builder bodyFile(String bodyFile) {
            return bodyFile(Output.of(bodyFile));
        }

        /**
         * @param headers The payload template headers, will be rendered as a key-value pair in the webhook.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<WebhooksPayloadTemplatesHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers The payload template headers, will be rendered as a key-value pair in the webhook.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<WebhooksPayloadTemplatesHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers The payload template headers, will be rendered as a key-value pair in the webhook.
         * 
         * @return builder
         * 
         */
        public Builder headers(WebhooksPayloadTemplatesHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param headersFile A file containing the liquid template used with the webhook headers.
         * 
         * @return builder
         * 
         */
        public Builder headersFile(@Nullable Output<String> headersFile) {
            $.headersFile = headersFile;
            return this;
        }

        /**
         * @param headersFile A file containing the liquid template used with the webhook headers.
         * 
         * @return builder
         * 
         */
        public Builder headersFile(String headersFile) {
            return headersFile(Output.of(headersFile));
        }

        /**
         * @param name The name of the payload template
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the payload template
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param payloadTemplateId Webhook payload template Id
         * 
         * @return builder
         * 
         */
        public Builder payloadTemplateId(@Nullable Output<String> payloadTemplateId) {
            $.payloadTemplateId = payloadTemplateId;
            return this;
        }

        /**
         * @param payloadTemplateId Webhook payload template Id
         * 
         * @return builder
         * 
         */
        public Builder payloadTemplateId(String payloadTemplateId) {
            return payloadTemplateId(Output.of(payloadTemplateId));
        }

        public WebhooksPayloadTemplatesArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("WebhooksPayloadTemplatesArgs", "networkId");
            }
            return $;
        }
    }

}
