// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSsidsActiveDirectoryCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSsidsActiveDirectoryCredentialsArgs Empty = new WirelessSsidsActiveDirectoryCredentialsArgs();

    /**
     * The logon name of the Active Directory account.
     * 
     */
    @Import(name="logonName")
    private @Nullable Output<String> logonName;

    /**
     * @return The logon name of the Active Directory account.
     * 
     */
    public Optional<Output<String>> logonName() {
        return Optional.ofNullable(this.logonName);
    }

    /**
     * The password to the Active Directory user account.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password to the Active Directory user account.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    private WirelessSsidsActiveDirectoryCredentialsArgs() {}

    private WirelessSsidsActiveDirectoryCredentialsArgs(WirelessSsidsActiveDirectoryCredentialsArgs $) {
        this.logonName = $.logonName;
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSsidsActiveDirectoryCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSsidsActiveDirectoryCredentialsArgs $;

        public Builder() {
            $ = new WirelessSsidsActiveDirectoryCredentialsArgs();
        }

        public Builder(WirelessSsidsActiveDirectoryCredentialsArgs defaults) {
            $ = new WirelessSsidsActiveDirectoryCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logonName The logon name of the Active Directory account.
         * 
         * @return builder
         * 
         */
        public Builder logonName(@Nullable Output<String> logonName) {
            $.logonName = logonName;
            return this;
        }

        /**
         * @param logonName The logon name of the Active Directory account.
         * 
         * @return builder
         * 
         */
        public Builder logonName(String logonName) {
            return logonName(Output.of(logonName));
        }

        /**
         * @param password The password to the Active Directory user account.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password to the Active Directory user account.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public WirelessSsidsActiveDirectoryCredentialsArgs build() {
            return $;
        }
    }

}
