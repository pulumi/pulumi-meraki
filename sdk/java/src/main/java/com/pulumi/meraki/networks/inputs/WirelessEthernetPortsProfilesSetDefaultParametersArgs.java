// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessEthernetPortsProfilesSetDefaultParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessEthernetPortsProfilesSetDefaultParametersArgs Empty = new WirelessEthernetPortsProfilesSetDefaultParametersArgs();

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

    private WirelessEthernetPortsProfilesSetDefaultParametersArgs() {}

    private WirelessEthernetPortsProfilesSetDefaultParametersArgs(WirelessEthernetPortsProfilesSetDefaultParametersArgs $) {
        this.profileId = $.profileId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessEthernetPortsProfilesSetDefaultParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessEthernetPortsProfilesSetDefaultParametersArgs $;

        public Builder() {
            $ = new WirelessEthernetPortsProfilesSetDefaultParametersArgs();
        }

        public Builder(WirelessEthernetPortsProfilesSetDefaultParametersArgs defaults) {
            $ = new WirelessEthernetPortsProfilesSetDefaultParametersArgs(Objects.requireNonNull(defaults));
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

        public WirelessEthernetPortsProfilesSetDefaultParametersArgs build() {
            return $;
        }
    }

}
