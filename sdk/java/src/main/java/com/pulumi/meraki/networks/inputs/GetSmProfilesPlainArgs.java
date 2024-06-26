// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSmProfilesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmProfilesPlainArgs Empty = new GetSmProfilesPlainArgs();

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

    /**
     * payloadTypes query parameter. Filter by payload types
     * 
     */
    @Import(name="payloadTypes")
    private @Nullable List<String> payloadTypes;

    /**
     * @return payloadTypes query parameter. Filter by payload types
     * 
     */
    public Optional<List<String>> payloadTypes() {
        return Optional.ofNullable(this.payloadTypes);
    }

    private GetSmProfilesPlainArgs() {}

    private GetSmProfilesPlainArgs(GetSmProfilesPlainArgs $) {
        this.networkId = $.networkId;
        this.payloadTypes = $.payloadTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmProfilesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmProfilesPlainArgs $;

        public Builder() {
            $ = new GetSmProfilesPlainArgs();
        }

        public Builder(GetSmProfilesPlainArgs defaults) {
            $ = new GetSmProfilesPlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param payloadTypes payloadTypes query parameter. Filter by payload types
         * 
         * @return builder
         * 
         */
        public Builder payloadTypes(@Nullable List<String> payloadTypes) {
            $.payloadTypes = payloadTypes;
            return this;
        }

        /**
         * @param payloadTypes payloadTypes query parameter. Filter by payload types
         * 
         * @return builder
         * 
         */
        public Builder payloadTypes(String... payloadTypes) {
            return payloadTypes(List.of(payloadTypes));
        }

        public GetSmProfilesPlainArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSmProfilesPlainArgs", "networkId");
            }
            return $;
        }
    }

}
