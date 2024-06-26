// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetLiveToolsWakeOnLanItemRequest;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLiveToolsWakeOnLanItem {
    /**
     * @return An error message for a failed execution
     * 
     */
    private String error;
    /**
     * @return The parameters of the Wake-on-LAN request
     * 
     */
    private GetLiveToolsWakeOnLanItemRequest request;
    /**
     * @return Status of the Wake-on-LAN request
     * 
     */
    private String status;
    /**
     * @return GET this url to check the status of your ping request
     * 
     */
    private String url;
    /**
     * @return ID of the Wake-on-LAN job
     * 
     */
    private String wakeOnLanId;

    private GetLiveToolsWakeOnLanItem() {}
    /**
     * @return An error message for a failed execution
     * 
     */
    public String error() {
        return this.error;
    }
    /**
     * @return The parameters of the Wake-on-LAN request
     * 
     */
    public GetLiveToolsWakeOnLanItemRequest request() {
        return this.request;
    }
    /**
     * @return Status of the Wake-on-LAN request
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return GET this url to check the status of your ping request
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return ID of the Wake-on-LAN job
     * 
     */
    public String wakeOnLanId() {
        return this.wakeOnLanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveToolsWakeOnLanItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String error;
        private GetLiveToolsWakeOnLanItemRequest request;
        private String status;
        private String url;
        private String wakeOnLanId;
        public Builder() {}
        public Builder(GetLiveToolsWakeOnLanItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.request = defaults.request;
    	      this.status = defaults.status;
    	      this.url = defaults.url;
    	      this.wakeOnLanId = defaults.wakeOnLanId;
        }

        @CustomType.Setter
        public Builder error(String error) {
            if (error == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsWakeOnLanItem", "error");
            }
            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder request(GetLiveToolsWakeOnLanItemRequest request) {
            if (request == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsWakeOnLanItem", "request");
            }
            this.request = request;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsWakeOnLanItem", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsWakeOnLanItem", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder wakeOnLanId(String wakeOnLanId) {
            if (wakeOnLanId == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsWakeOnLanItem", "wakeOnLanId");
            }
            this.wakeOnLanId = wakeOnLanId;
            return this;
        }
        public GetLiveToolsWakeOnLanItem build() {
            final var _resultValue = new GetLiveToolsWakeOnLanItem();
            _resultValue.error = error;
            _resultValue.request = request;
            _resultValue.status = status;
            _resultValue.url = url;
            _resultValue.wakeOnLanId = wakeOnLanId;
            return _resultValue;
        }
    }
}
