// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.devices.inputs.ManagementInterfaceDdnsHostnamesArgs;
import com.pulumi.meraki.devices.inputs.ManagementInterfaceWan1Args;
import com.pulumi.meraki.devices.inputs.ManagementInterfaceWan2Args;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementInterfaceState extends com.pulumi.resources.ResourceArgs {

    public static final ManagementInterfaceState Empty = new ManagementInterfaceState();

    /**
     * Dynamic DNS hostnames.
     * 
     */
    @Import(name="ddnsHostnames")
    private @Nullable Output<ManagementInterfaceDdnsHostnamesArgs> ddnsHostnames;

    /**
     * @return Dynamic DNS hostnames.
     * 
     */
    public Optional<Output<ManagementInterfaceDdnsHostnamesArgs>> ddnsHostnames() {
        return Optional.ofNullable(this.ddnsHostnames);
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * WAN 1 settings
     * 
     */
    @Import(name="wan1")
    private @Nullable Output<ManagementInterfaceWan1Args> wan1;

    /**
     * @return WAN 1 settings
     * 
     */
    public Optional<Output<ManagementInterfaceWan1Args>> wan1() {
        return Optional.ofNullable(this.wan1);
    }

    /**
     * WAN 2 settings (only for MX devices)
     * 
     */
    @Import(name="wan2")
    private @Nullable Output<ManagementInterfaceWan2Args> wan2;

    /**
     * @return WAN 2 settings (only for MX devices)
     * 
     */
    public Optional<Output<ManagementInterfaceWan2Args>> wan2() {
        return Optional.ofNullable(this.wan2);
    }

    private ManagementInterfaceState() {}

    private ManagementInterfaceState(ManagementInterfaceState $) {
        this.ddnsHostnames = $.ddnsHostnames;
        this.serial = $.serial;
        this.wan1 = $.wan1;
        this.wan2 = $.wan2;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementInterfaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementInterfaceState $;

        public Builder() {
            $ = new ManagementInterfaceState();
        }

        public Builder(ManagementInterfaceState defaults) {
            $ = new ManagementInterfaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param ddnsHostnames Dynamic DNS hostnames.
         * 
         * @return builder
         * 
         */
        public Builder ddnsHostnames(@Nullable Output<ManagementInterfaceDdnsHostnamesArgs> ddnsHostnames) {
            $.ddnsHostnames = ddnsHostnames;
            return this;
        }

        /**
         * @param ddnsHostnames Dynamic DNS hostnames.
         * 
         * @return builder
         * 
         */
        public Builder ddnsHostnames(ManagementInterfaceDdnsHostnamesArgs ddnsHostnames) {
            return ddnsHostnames(Output.of(ddnsHostnames));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        /**
         * @param wan1 WAN 1 settings
         * 
         * @return builder
         * 
         */
        public Builder wan1(@Nullable Output<ManagementInterfaceWan1Args> wan1) {
            $.wan1 = wan1;
            return this;
        }

        /**
         * @param wan1 WAN 1 settings
         * 
         * @return builder
         * 
         */
        public Builder wan1(ManagementInterfaceWan1Args wan1) {
            return wan1(Output.of(wan1));
        }

        /**
         * @param wan2 WAN 2 settings (only for MX devices)
         * 
         * @return builder
         * 
         */
        public Builder wan2(@Nullable Output<ManagementInterfaceWan2Args> wan2) {
            $.wan2 = wan2;
            return this;
        }

        /**
         * @param wan2 WAN 2 settings (only for MX devices)
         * 
         * @return builder
         * 
         */
        public Builder wan2(ManagementInterfaceWan2Args wan2) {
            return wan2(Output.of(wan2));
        }

        public ManagementInterfaceState build() {
            return $;
        }
    }

}