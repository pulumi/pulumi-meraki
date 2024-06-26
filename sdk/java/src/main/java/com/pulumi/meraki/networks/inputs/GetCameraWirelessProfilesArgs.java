// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCameraWirelessProfilesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCameraWirelessProfilesArgs Empty = new GetCameraWirelessProfilesArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * wirelessProfileId path parameter. Wireless profile ID
     * 
     */
    @Import(name="wirelessProfileId")
    private @Nullable Output<String> wirelessProfileId;

    /**
     * @return wirelessProfileId path parameter. Wireless profile ID
     * 
     */
    public Optional<Output<String>> wirelessProfileId() {
        return Optional.ofNullable(this.wirelessProfileId);
    }

    private GetCameraWirelessProfilesArgs() {}

    private GetCameraWirelessProfilesArgs(GetCameraWirelessProfilesArgs $) {
        this.networkId = $.networkId;
        this.wirelessProfileId = $.wirelessProfileId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCameraWirelessProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCameraWirelessProfilesArgs $;

        public Builder() {
            $ = new GetCameraWirelessProfilesArgs();
        }

        public Builder(GetCameraWirelessProfilesArgs defaults) {
            $ = new GetCameraWirelessProfilesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param wirelessProfileId wirelessProfileId path parameter. Wireless profile ID
         * 
         * @return builder
         * 
         */
        public Builder wirelessProfileId(@Nullable Output<String> wirelessProfileId) {
            $.wirelessProfileId = wirelessProfileId;
            return this;
        }

        /**
         * @param wirelessProfileId wirelessProfileId path parameter. Wireless profile ID
         * 
         * @return builder
         * 
         */
        public Builder wirelessProfileId(String wirelessProfileId) {
            return wirelessProfileId(Output.of(wirelessProfileId));
        }

        public GetCameraWirelessProfilesArgs build() {
            return $;
        }
    }

}
