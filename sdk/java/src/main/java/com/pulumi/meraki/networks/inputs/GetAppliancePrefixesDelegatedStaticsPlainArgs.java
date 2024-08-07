// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppliancePrefixesDelegatedStaticsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppliancePrefixesDelegatedStaticsPlainArgs Empty = new GetAppliancePrefixesDelegatedStaticsPlainArgs();

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable String networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * staticDelegatedPrefixId path parameter. Static delegated prefix ID
     * 
     */
    @Import(name="staticDelegatedPrefixId")
    private @Nullable String staticDelegatedPrefixId;

    /**
     * @return staticDelegatedPrefixId path parameter. Static delegated prefix ID
     * 
     */
    public Optional<String> staticDelegatedPrefixId() {
        return Optional.ofNullable(this.staticDelegatedPrefixId);
    }

    private GetAppliancePrefixesDelegatedStaticsPlainArgs() {}

    private GetAppliancePrefixesDelegatedStaticsPlainArgs(GetAppliancePrefixesDelegatedStaticsPlainArgs $) {
        this.networkId = $.networkId;
        this.staticDelegatedPrefixId = $.staticDelegatedPrefixId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppliancePrefixesDelegatedStaticsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppliancePrefixesDelegatedStaticsPlainArgs $;

        public Builder() {
            $ = new GetAppliancePrefixesDelegatedStaticsPlainArgs();
        }

        public Builder(GetAppliancePrefixesDelegatedStaticsPlainArgs defaults) {
            $ = new GetAppliancePrefixesDelegatedStaticsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable String networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param staticDelegatedPrefixId staticDelegatedPrefixId path parameter. Static delegated prefix ID
         * 
         * @return builder
         * 
         */
        public Builder staticDelegatedPrefixId(@Nullable String staticDelegatedPrefixId) {
            $.staticDelegatedPrefixId = staticDelegatedPrefixId;
            return this;
        }

        public GetAppliancePrefixesDelegatedStaticsPlainArgs build() {
            return $;
        }
    }

}
