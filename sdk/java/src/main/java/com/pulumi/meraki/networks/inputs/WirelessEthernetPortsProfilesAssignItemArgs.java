// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessEthernetPortsProfilesAssignItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessEthernetPortsProfilesAssignItemArgs Empty = new WirelessEthernetPortsProfilesAssignItemArgs();

    /**
     * AP profile ID
     * 
     */
    @Import(name="profileId")
    private @Nullable Output<String> profileId;

    /**
     * @return AP profile ID
     * 
     */
    public Optional<Output<String>> profileId() {
        return Optional.ofNullable(this.profileId);
    }

    /**
     * List of updated AP serials
     * 
     */
    @Import(name="serials")
    private @Nullable Output<List<String>> serials;

    /**
     * @return List of updated AP serials
     * 
     */
    public Optional<Output<List<String>>> serials() {
        return Optional.ofNullable(this.serials);
    }

    private WirelessEthernetPortsProfilesAssignItemArgs() {}

    private WirelessEthernetPortsProfilesAssignItemArgs(WirelessEthernetPortsProfilesAssignItemArgs $) {
        this.profileId = $.profileId;
        this.serials = $.serials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessEthernetPortsProfilesAssignItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessEthernetPortsProfilesAssignItemArgs $;

        public Builder() {
            $ = new WirelessEthernetPortsProfilesAssignItemArgs();
        }

        public Builder(WirelessEthernetPortsProfilesAssignItemArgs defaults) {
            $ = new WirelessEthernetPortsProfilesAssignItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param profileId AP profile ID
         * 
         * @return builder
         * 
         */
        public Builder profileId(@Nullable Output<String> profileId) {
            $.profileId = profileId;
            return this;
        }

        /**
         * @param profileId AP profile ID
         * 
         * @return builder
         * 
         */
        public Builder profileId(String profileId) {
            return profileId(Output.of(profileId));
        }

        /**
         * @param serials List of updated AP serials
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable Output<List<String>> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials List of updated AP serials
         * 
         * @return builder
         * 
         */
        public Builder serials(List<String> serials) {
            return serials(Output.of(serials));
        }

        /**
         * @param serials List of updated AP serials
         * 
         * @return builder
         * 
         */
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }

        public WirelessEthernetPortsProfilesAssignItemArgs build() {
            return $;
        }
    }

}