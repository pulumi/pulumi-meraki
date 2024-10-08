// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSwitchPortsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchPortsPlainArgs Empty = new GetSwitchPortsPlainArgs();

    /**
     * portId path parameter. Port ID
     * 
     */
    @Import(name="portId")
    private @Nullable String portId;

    /**
     * @return portId path parameter. Port ID
     * 
     */
    public Optional<String> portId() {
        return Optional.ofNullable(this.portId);
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial")
    private @Nullable String serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }

    private GetSwitchPortsPlainArgs() {}

    private GetSwitchPortsPlainArgs(GetSwitchPortsPlainArgs $) {
        this.portId = $.portId;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchPortsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchPortsPlainArgs $;

        public Builder() {
            $ = new GetSwitchPortsPlainArgs();
        }

        public Builder(GetSwitchPortsPlainArgs defaults) {
            $ = new GetSwitchPortsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param portId portId path parameter. Port ID
         * 
         * @return builder
         * 
         */
        public Builder portId(@Nullable String portId) {
            $.portId = portId;
            return this;
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable String serial) {
            $.serial = serial;
            return this;
        }

        public GetSwitchPortsPlainArgs build() {
            return $;
        }
    }

}
