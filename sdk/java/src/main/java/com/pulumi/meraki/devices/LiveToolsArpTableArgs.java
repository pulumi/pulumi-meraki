// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.inputs.LiveToolsArpTableCallbackArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveToolsArpTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiveToolsArpTableArgs Empty = new LiveToolsArpTableArgs();

    /**
     * Id of the ARP table request. Used to check the status of the request.
     * 
     */
    @Import(name="arpTableId")
    private @Nullable Output<String> arpTableId;

    /**
     * @return Id of the ARP table request. Used to check the status of the request.
     * 
     */
    public Optional<Output<String>> arpTableId() {
        return Optional.ofNullable(this.arpTableId);
    }

    /**
     * Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    @Import(name="callback")
    private @Nullable Output<LiveToolsArpTableCallbackArgs> callback;

    /**
     * @return Details for the callback. Please include either an httpServerId OR url and sharedSecret
     * 
     */
    public Optional<Output<LiveToolsArpTableCallbackArgs>> callback() {
        return Optional.ofNullable(this.callback);
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial", required=true)
    private Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }

    private LiveToolsArpTableArgs() {}

    private LiveToolsArpTableArgs(LiveToolsArpTableArgs $) {
        this.arpTableId = $.arpTableId;
        this.callback = $.callback;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveToolsArpTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveToolsArpTableArgs $;

        public Builder() {
            $ = new LiveToolsArpTableArgs();
        }

        public Builder(LiveToolsArpTableArgs defaults) {
            $ = new LiveToolsArpTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arpTableId Id of the ARP table request. Used to check the status of the request.
         * 
         * @return builder
         * 
         */
        public Builder arpTableId(@Nullable Output<String> arpTableId) {
            $.arpTableId = arpTableId;
            return this;
        }

        /**
         * @param arpTableId Id of the ARP table request. Used to check the status of the request.
         * 
         * @return builder
         * 
         */
        public Builder arpTableId(String arpTableId) {
            return arpTableId(Output.of(arpTableId));
        }

        /**
         * @param callback Details for the callback. Please include either an httpServerId OR url and sharedSecret
         * 
         * @return builder
         * 
         */
        public Builder callback(@Nullable Output<LiveToolsArpTableCallbackArgs> callback) {
            $.callback = callback;
            return this;
        }

        /**
         * @param callback Details for the callback. Please include either an httpServerId OR url and sharedSecret
         * 
         * @return builder
         * 
         */
        public Builder callback(LiveToolsArpTableCallbackArgs callback) {
            return callback(Output.of(callback));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(Output<String> serial) {
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

        public LiveToolsArpTableArgs build() {
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("LiveToolsArpTableArgs", "serial");
            }
            return $;
        }
    }

}
