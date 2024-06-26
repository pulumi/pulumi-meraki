// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSmDevicesWlanListsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmDevicesWlanListsPlainArgs Empty = new GetSmDevicesWlanListsPlainArgs();

    /**
     * deviceId path parameter. Device ID
     * 
     */
    @Import(name="deviceId", required=true)
    private String deviceId;

    /**
     * @return deviceId path parameter. Device ID
     * 
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    private GetSmDevicesWlanListsPlainArgs() {}

    private GetSmDevicesWlanListsPlainArgs(GetSmDevicesWlanListsPlainArgs $) {
        this.deviceId = $.deviceId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmDevicesWlanListsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmDevicesWlanListsPlainArgs $;

        public Builder() {
            $ = new GetSmDevicesWlanListsPlainArgs();
        }

        public Builder(GetSmDevicesWlanListsPlainArgs defaults) {
            $ = new GetSmDevicesWlanListsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId deviceId path parameter. Device ID
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            $.networkId = networkId;
            return this;
        }

        public GetSmDevicesWlanListsPlainArgs build() {
            if ($.deviceId == null) {
                throw new MissingRequiredPropertyException("GetSmDevicesWlanListsPlainArgs", "deviceId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSmDevicesWlanListsPlainArgs", "networkId");
            }
            return $;
        }
    }

}
