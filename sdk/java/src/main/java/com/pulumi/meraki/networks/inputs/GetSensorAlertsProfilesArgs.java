// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSensorAlertsProfilesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSensorAlertsProfilesArgs Empty = new GetSensorAlertsProfilesArgs();

    /**
     * id path parameter.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return id path parameter.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

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

    private GetSensorAlertsProfilesArgs() {}

    private GetSensorAlertsProfilesArgs(GetSensorAlertsProfilesArgs $) {
        this.id = $.id;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSensorAlertsProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSensorAlertsProfilesArgs $;

        public Builder() {
            $ = new GetSensorAlertsProfilesArgs();
        }

        public Builder(GetSensorAlertsProfilesArgs defaults) {
            $ = new GetSensorAlertsProfilesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id id path parameter.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id id path parameter.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
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

        public GetSensorAlertsProfilesArgs build() {
            return $;
        }
    }

}