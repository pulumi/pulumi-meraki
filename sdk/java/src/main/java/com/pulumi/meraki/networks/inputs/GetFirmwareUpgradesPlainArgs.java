// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFirmwareUpgradesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirmwareUpgradesPlainArgs Empty = new GetFirmwareUpgradesPlainArgs();

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

    private GetFirmwareUpgradesPlainArgs() {}

    private GetFirmwareUpgradesPlainArgs(GetFirmwareUpgradesPlainArgs $) {
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirmwareUpgradesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirmwareUpgradesPlainArgs $;

        public Builder() {
            $ = new GetFirmwareUpgradesPlainArgs();
        }

        public Builder(GetFirmwareUpgradesPlainArgs defaults) {
            $ = new GetFirmwareUpgradesPlainArgs(Objects.requireNonNull(defaults));
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

        public GetFirmwareUpgradesPlainArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetFirmwareUpgradesPlainArgs", "networkId");
            }
            return $;
        }
    }

}