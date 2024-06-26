// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessRfProfilesTransmissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessRfProfilesTransmissionArgs Empty = new WirelessRfProfilesTransmissionArgs();

    /**
     * Toggle for radio transmission. When false, radios will not transmit at all.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Toggle for radio transmission. When false, radios will not transmit at all.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private WirelessRfProfilesTransmissionArgs() {}

    private WirelessRfProfilesTransmissionArgs(WirelessRfProfilesTransmissionArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessRfProfilesTransmissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessRfProfilesTransmissionArgs $;

        public Builder() {
            $ = new WirelessRfProfilesTransmissionArgs();
        }

        public Builder(WirelessRfProfilesTransmissionArgs defaults) {
            $ = new WirelessRfProfilesTransmissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Toggle for radio transmission. When false, radios will not transmit at all.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Toggle for radio transmission. When false, radios will not transmit at all.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public WirelessRfProfilesTransmissionArgs build() {
            return $;
        }
    }

}
