// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSmUserAccessDevicesItemTrustedAccessConnection;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSmUserAccessDevicesItem {
    /**
     * @return user email
     * 
     */
    private String email;
    /**
     * @return device ID
     * 
     */
    private String id;
    /**
     * @return mac address
     * 
     */
    private String mac;
    /**
     * @return device name
     * 
     */
    private String name;
    /**
     * @return system type
     * 
     */
    private String systemType;
    /**
     * @return device tags
     * 
     */
    private List<String> tags;
    /**
     * @return Array of trusted access configs
     * 
     */
    private List<GetSmUserAccessDevicesItemTrustedAccessConnection> trustedAccessConnections;
    /**
     * @return username
     * 
     */
    private String username;

    private GetSmUserAccessDevicesItem() {}
    /**
     * @return user email
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return device ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return mac address
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return device name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return system type
     * 
     */
    public String systemType() {
        return this.systemType;
    }
    /**
     * @return device tags
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Array of trusted access configs
     * 
     */
    public List<GetSmUserAccessDevicesItemTrustedAccessConnection> trustedAccessConnections() {
        return this.trustedAccessConnections;
    }
    /**
     * @return username
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmUserAccessDevicesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private String id;
        private String mac;
        private String name;
        private String systemType;
        private List<String> tags;
        private List<GetSmUserAccessDevicesItemTrustedAccessConnection> trustedAccessConnections;
        private String username;
        public Builder() {}
        public Builder(GetSmUserAccessDevicesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.mac = defaults.mac;
    	      this.name = defaults.name;
    	      this.systemType = defaults.systemType;
    	      this.tags = defaults.tags;
    	      this.trustedAccessConnections = defaults.trustedAccessConnections;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetSmUserAccessDevicesItem", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSmUserAccessDevicesItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetSmUserAccessDevicesItem", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSmUserAccessDevicesItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder systemType(String systemType) {
            if (systemType == null) {
              throw new MissingRequiredPropertyException("GetSmUserAccessDevicesItem", "systemType");
            }
            this.systemType = systemType;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetSmUserAccessDevicesItem", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder trustedAccessConnections(List<GetSmUserAccessDevicesItemTrustedAccessConnection> trustedAccessConnections) {
            if (trustedAccessConnections == null) {
              throw new MissingRequiredPropertyException("GetSmUserAccessDevicesItem", "trustedAccessConnections");
            }
            this.trustedAccessConnections = trustedAccessConnections;
            return this;
        }
        public Builder trustedAccessConnections(GetSmUserAccessDevicesItemTrustedAccessConnection... trustedAccessConnections) {
            return trustedAccessConnections(List.of(trustedAccessConnections));
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetSmUserAccessDevicesItem", "username");
            }
            this.username = username;
            return this;
        }
        public GetSmUserAccessDevicesItem build() {
            final var _resultValue = new GetSmUserAccessDevicesItem();
            _resultValue.email = email;
            _resultValue.id = id;
            _resultValue.mac = mac;
            _resultValue.name = name;
            _resultValue.systemType = systemType;
            _resultValue.tags = tags;
            _resultValue.trustedAccessConnections = trustedAccessConnections;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}