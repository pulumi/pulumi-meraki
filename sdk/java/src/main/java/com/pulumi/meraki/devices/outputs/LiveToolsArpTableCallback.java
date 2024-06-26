// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.devices.outputs.LiveToolsArpTableCallbackHttpServer;
import com.pulumi.meraki.devices.outputs.LiveToolsArpTableCallbackPayloadTemplate;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveToolsArpTableCallback {
    /**
     * @return The webhook receiver used for the callback webhook.
     * 
     */
    private @Nullable LiveToolsArpTableCallbackHttpServer httpServer;
    /**
     * @return The payload template of the webhook used for the callback
     * 
     */
    private @Nullable LiveToolsArpTableCallbackPayloadTemplate payloadTemplate;
    /**
     * @return A shared secret that will be included in the requests sent to the callback URL. It can be used to verify that the request was sent by Meraki. If using this field, please also specify an url.
     * 
     */
    private @Nullable String sharedSecret;
    /**
     * @return The callback URL for the webhook target. If using this field, please also specify a sharedSecret.
     * 
     */
    private @Nullable String url;

    private LiveToolsArpTableCallback() {}
    /**
     * @return The webhook receiver used for the callback webhook.
     * 
     */
    public Optional<LiveToolsArpTableCallbackHttpServer> httpServer() {
        return Optional.ofNullable(this.httpServer);
    }
    /**
     * @return The payload template of the webhook used for the callback
     * 
     */
    public Optional<LiveToolsArpTableCallbackPayloadTemplate> payloadTemplate() {
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
     * @return The callback URL for the webhook target. If using this field, please also specify a sharedSecret.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveToolsArpTableCallback defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LiveToolsArpTableCallbackHttpServer httpServer;
        private @Nullable LiveToolsArpTableCallbackPayloadTemplate payloadTemplate;
        private @Nullable String sharedSecret;
        private @Nullable String url;
        public Builder() {}
        public Builder(LiveToolsArpTableCallback defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpServer = defaults.httpServer;
    	      this.payloadTemplate = defaults.payloadTemplate;
    	      this.sharedSecret = defaults.sharedSecret;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder httpServer(@Nullable LiveToolsArpTableCallbackHttpServer httpServer) {

            this.httpServer = httpServer;
            return this;
        }
        @CustomType.Setter
        public Builder payloadTemplate(@Nullable LiveToolsArpTableCallbackPayloadTemplate payloadTemplate) {

            this.payloadTemplate = payloadTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder sharedSecret(@Nullable String sharedSecret) {

            this.sharedSecret = sharedSecret;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public LiveToolsArpTableCallback build() {
            final var _resultValue = new LiveToolsArpTableCallback();
            _resultValue.httpServer = httpServer;
            _resultValue.payloadTemplate = payloadTemplate;
            _resultValue.sharedSecret = sharedSecret;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
