// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetWirelessBluetoothSettingsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWirelessBluetoothSettingsPlainArgs Empty = new GetWirelessBluetoothSettingsPlainArgs();

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial", required=true)
    private String serial;

    /**
     * @return serial path parameter.
     * 
     */
    public String serial() {
        return this.serial;
    }

    private GetWirelessBluetoothSettingsPlainArgs() {}

    private GetWirelessBluetoothSettingsPlainArgs(GetWirelessBluetoothSettingsPlainArgs $) {
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWirelessBluetoothSettingsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWirelessBluetoothSettingsPlainArgs $;

        public Builder() {
            $ = new GetWirelessBluetoothSettingsPlainArgs();
        }

        public Builder(GetWirelessBluetoothSettingsPlainArgs defaults) {
            $ = new GetWirelessBluetoothSettingsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            $.serial = serial;
            return this;
        }

        public GetWirelessBluetoothSettingsPlainArgs build() {
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("GetWirelessBluetoothSettingsPlainArgs", "serial");
            }
            return $;
        }
    }

}
