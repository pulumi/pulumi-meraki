// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSmBypassActivationLockAttemptsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSmBypassActivationLockAttemptsArgs Empty = new GetSmBypassActivationLockAttemptsArgs();

    /**
     * attemptId path parameter. Attempt ID
     * 
     */
    @Import(name="attemptId", required=true)
    private Output<String> attemptId;

    /**
     * @return attemptId path parameter. Attempt ID
     * 
     */
    public Output<String> attemptId() {
        return this.attemptId;
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    private GetSmBypassActivationLockAttemptsArgs() {}

    private GetSmBypassActivationLockAttemptsArgs(GetSmBypassActivationLockAttemptsArgs $) {
        this.attemptId = $.attemptId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSmBypassActivationLockAttemptsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSmBypassActivationLockAttemptsArgs $;

        public Builder() {
            $ = new GetSmBypassActivationLockAttemptsArgs();
        }

        public Builder(GetSmBypassActivationLockAttemptsArgs defaults) {
            $ = new GetSmBypassActivationLockAttemptsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attemptId attemptId path parameter. Attempt ID
         * 
         * @return builder
         * 
         */
        public Builder attemptId(Output<String> attemptId) {
            $.attemptId = attemptId;
            return this;
        }

        /**
         * @param attemptId attemptId path parameter. Attempt ID
         * 
         * @return builder
         * 
         */
        public Builder attemptId(String attemptId) {
            return attemptId(Output.of(attemptId));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
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

        public GetSmBypassActivationLockAttemptsArgs build() {
            if ($.attemptId == null) {
                throw new MissingRequiredPropertyException("GetSmBypassActivationLockAttemptsArgs", "attemptId");
            }
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("GetSmBypassActivationLockAttemptsArgs", "networkId");
            }
            return $;
        }
    }

}