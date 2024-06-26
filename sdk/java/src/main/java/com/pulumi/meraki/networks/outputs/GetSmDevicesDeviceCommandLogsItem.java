// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSmDevicesDeviceCommandLogsItem {
    /**
     * @return The type of command sent to the device.
     * 
     */
    private String action;
    /**
     * @return The Meraki dashboard user who initiated the command.
     * 
     */
    private String dashboardUser;
    /**
     * @return A JSON string object containing command details.
     * 
     */
    private String details;
    /**
     * @return The name of the device to which the command is sent.
     * 
     */
    private String name;
    /**
     * @return The time the command was sent to the device.
     * 
     */
    private String ts;

    private GetSmDevicesDeviceCommandLogsItem() {}
    /**
     * @return The type of command sent to the device.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The Meraki dashboard user who initiated the command.
     * 
     */
    public String dashboardUser() {
        return this.dashboardUser;
    }
    /**
     * @return A JSON string object containing command details.
     * 
     */
    public String details() {
        return this.details;
    }
    /**
     * @return The name of the device to which the command is sent.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The time the command was sent to the device.
     * 
     */
    public String ts() {
        return this.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSmDevicesDeviceCommandLogsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private String dashboardUser;
        private String details;
        private String name;
        private String ts;
        public Builder() {}
        public Builder(GetSmDevicesDeviceCommandLogsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.dashboardUser = defaults.dashboardUser;
    	      this.details = defaults.details;
    	      this.name = defaults.name;
    	      this.ts = defaults.ts;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceCommandLogsItem", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder dashboardUser(String dashboardUser) {
            if (dashboardUser == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceCommandLogsItem", "dashboardUser");
            }
            this.dashboardUser = dashboardUser;
            return this;
        }
        @CustomType.Setter
        public Builder details(String details) {
            if (details == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceCommandLogsItem", "details");
            }
            this.details = details;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceCommandLogsItem", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ts(String ts) {
            if (ts == null) {
              throw new MissingRequiredPropertyException("GetSmDevicesDeviceCommandLogsItem", "ts");
            }
            this.ts = ts;
            return this;
        }
        public GetSmDevicesDeviceCommandLogsItem build() {
            final var _resultValue = new GetSmDevicesDeviceCommandLogsItem();
            _resultValue.action = action;
            _resultValue.dashboardUser = dashboardUser;
            _resultValue.details = details;
            _resultValue.name = name;
            _resultValue.ts = ts;
            return _resultValue;
        }
    }
}
