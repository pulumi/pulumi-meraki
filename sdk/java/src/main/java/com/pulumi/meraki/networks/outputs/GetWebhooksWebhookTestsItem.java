// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWebhooksWebhookTestsItem {
    /**
     * @return Webhook delivery identifier
     * 
     */
    private String id;
    /**
     * @return Current status of the webhook delivery
     * 
     */
    private String status;
    /**
     * @return URL where the webhook was delivered
     * 
     */
    private String url;

    private GetWebhooksWebhookTestsItem() {}
    /**
     * @return Webhook delivery identifier
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Current status of the webhook delivery
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return URL where the webhook was delivered
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhooksWebhookTestsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String status;
        private String url;
        public Builder() {}
        public Builder(GetWebhooksWebhookTestsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.status = defaults.status;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWebhooksWebhookTestsItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetWebhooksWebhookTestsItem", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetWebhooksWebhookTestsItem", "url");
            }
            this.url = url;
            return this;
        }
        public GetWebhooksWebhookTestsItem build() {
            final var _resultValue = new GetWebhooksWebhookTestsItem();
            _resultValue.id = id;
            _resultValue.status = status;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
