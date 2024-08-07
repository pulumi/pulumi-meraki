// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.organizations.outputs.ActionBatchesCallbackHttpServer;
import com.pulumi.meraki.organizations.outputs.ActionBatchesCallbackPayloadTemplate;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActionBatchesCallback {
    /**
     * @return The webhook receiver used for the callback webhook.
     * 
     */
    private @Nullable ActionBatchesCallbackHttpServer httpServer;
    /**
     * @return The ID of the callback. To check the status of the callback, use this ID in a request to /webhooks/callbacks/statuses/{id}
     * 
     */
    private @Nullable String id;
    /**
     * @return The payload template of the webhook used for the callback
     * 
     */
    private @Nullable ActionBatchesCallbackPayloadTemplate payloadTemplate;
    /**
     * @return A shared secret that will be included in the requests sent to the callback URL. It can be used to verify that the request was sent by Meraki. If using this field, please also specify an url.
     * 
     */
    private @Nullable String sharedSecret;
    /**
     * @return The status of the callback
     * 
     */
    private @Nullable String status;
    /**
     * @return The callback URL for the webhook target. This was either provided in the original request or comes from a configured webhook receiver
     * 
     */
    private @Nullable String url;

    private ActionBatchesCallback() {}
    /**
     * @return The webhook receiver used for the callback webhook.
     * 
     */
    public Optional<ActionBatchesCallbackHttpServer> httpServer() {
        return Optional.ofNullable(this.httpServer);
    }
    /**
     * @return The ID of the callback. To check the status of the callback, use this ID in a request to /webhooks/callbacks/statuses/{id}
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The payload template of the webhook used for the callback
     * 
     */
    public Optional<ActionBatchesCallbackPayloadTemplate> payloadTemplate() {
        return Optional.ofNullable(this.payloadTemplate);
    }
    /**
     * @return A shared secret that will be included in the requests sent to the callback URL. It can be used to verify that the request was sent by Meraki. If using this field, please also specify an url.
     * 
     */
    public Optional<String> sharedSecret() {
        return Optional.ofNullable(this.sharedSecret);
    }
    /**
     * @return The status of the callback
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The callback URL for the webhook target. This was either provided in the original request or comes from a configured webhook receiver
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionBatchesCallback defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ActionBatchesCallbackHttpServer httpServer;
        private @Nullable String id;
        private @Nullable ActionBatchesCallbackPayloadTemplate payloadTemplate;
        private @Nullable String sharedSecret;
        private @Nullable String status;
        private @Nullable String url;
        public Builder() {}
        public Builder(ActionBatchesCallback defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpServer = defaults.httpServer;
    	      this.id = defaults.id;
    	      this.payloadTemplate = defaults.payloadTemplate;
    	      this.sharedSecret = defaults.sharedSecret;
    	      this.status = defaults.status;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder httpServer(@Nullable ActionBatchesCallbackHttpServer httpServer) {

            this.httpServer = httpServer;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder payloadTemplate(@Nullable ActionBatchesCallbackPayloadTemplate payloadTemplate) {

            this.payloadTemplate = payloadTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder sharedSecret(@Nullable String sharedSecret) {

            this.sharedSecret = sharedSecret;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public ActionBatchesCallback build() {
            final var _resultValue = new ActionBatchesCallback();
            _resultValue.httpServer = httpServer;
            _resultValue.id = id;
            _resultValue.payloadTemplate = payloadTemplate;
            _resultValue.sharedSecret = sharedSecret;
            _resultValue.status = status;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
