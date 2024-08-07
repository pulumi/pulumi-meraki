// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchAccessPoliciesRadiusServersResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchAccessPoliciesRadiusServersResponseArgs Empty = new SwitchAccessPoliciesRadiusServersResponseArgs();

    /**
     * Public IP address of the RADIUS server
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Public IP address of the RADIUS server
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * UDP port that the RADIUS server listens on for access requests
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return UDP port that the RADIUS server listens on for access requests
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * RADIUS client shared secret
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return RADIUS client shared secret
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    private SwitchAccessPoliciesRadiusServersResponseArgs() {}

    private SwitchAccessPoliciesRadiusServersResponseArgs(SwitchAccessPoliciesRadiusServersResponseArgs $) {
        this.host = $.host;
        this.port = $.port;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchAccessPoliciesRadiusServersResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchAccessPoliciesRadiusServersResponseArgs $;

        public Builder() {
            $ = new SwitchAccessPoliciesRadiusServersResponseArgs();
        }

        public Builder(SwitchAccessPoliciesRadiusServersResponseArgs defaults) {
            $ = new SwitchAccessPoliciesRadiusServersResponseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host Public IP address of the RADIUS server
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Public IP address of the RADIUS server
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port UDP port that the RADIUS server listens on for access requests
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port UDP port that the RADIUS server listens on for access requests
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param secret RADIUS client shared secret
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret RADIUS client shared secret
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public SwitchAccessPoliciesRadiusServersResponseArgs build() {
            return $;
        }
    }

}
