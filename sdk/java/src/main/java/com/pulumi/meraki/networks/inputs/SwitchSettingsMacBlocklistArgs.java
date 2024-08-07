// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchSettingsMacBlocklistArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchSettingsMacBlocklistArgs Empty = new SwitchSettingsMacBlocklistArgs();

    /**
     * Enable MAC blocklist for switches in the network
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable MAC blocklist for switches in the network
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private SwitchSettingsMacBlocklistArgs() {}

    private SwitchSettingsMacBlocklistArgs(SwitchSettingsMacBlocklistArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchSettingsMacBlocklistArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchSettingsMacBlocklistArgs $;

        public Builder() {
            $ = new SwitchSettingsMacBlocklistArgs();
        }

        public Builder(SwitchSettingsMacBlocklistArgs defaults) {
            $ = new SwitchSettingsMacBlocklistArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable MAC blocklist for switches in the network
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable MAC blocklist for switches in the network
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public SwitchSettingsMacBlocklistArgs build() {
            return $;
        }
    }

}
