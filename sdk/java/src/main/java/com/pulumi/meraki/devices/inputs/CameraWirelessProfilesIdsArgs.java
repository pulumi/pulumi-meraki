// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CameraWirelessProfilesIdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CameraWirelessProfilesIdsArgs Empty = new CameraWirelessProfilesIdsArgs();

    /**
     * The id of the backup wireless profile
     * 
     */
    @Import(name="backup")
    private @Nullable Output<String> backup;

    /**
     * @return The id of the backup wireless profile
     * 
     */
    public Optional<Output<String>> backup() {
        return Optional.ofNullable(this.backup);
    }

    /**
     * The id of the primary wireless profile
     * 
     */
    @Import(name="primary")
    private @Nullable Output<String> primary;

    /**
     * @return The id of the primary wireless profile
     * 
     */
    public Optional<Output<String>> primary() {
        return Optional.ofNullable(this.primary);
    }

    /**
     * The id of the secondary wireless profile
     * 
     */
    @Import(name="secondary")
    private @Nullable Output<String> secondary;

    /**
     * @return The id of the secondary wireless profile
     * 
     */
    public Optional<Output<String>> secondary() {
        return Optional.ofNullable(this.secondary);
    }

    private CameraWirelessProfilesIdsArgs() {}

    private CameraWirelessProfilesIdsArgs(CameraWirelessProfilesIdsArgs $) {
        this.backup = $.backup;
        this.primary = $.primary;
        this.secondary = $.secondary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CameraWirelessProfilesIdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CameraWirelessProfilesIdsArgs $;

        public Builder() {
            $ = new CameraWirelessProfilesIdsArgs();
        }

        public Builder(CameraWirelessProfilesIdsArgs defaults) {
            $ = new CameraWirelessProfilesIdsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backup The id of the backup wireless profile
         * 
         * @return builder
         * 
         */
        public Builder backup(@Nullable Output<String> backup) {
            $.backup = backup;
            return this;
        }

        /**
         * @param backup The id of the backup wireless profile
         * 
         * @return builder
         * 
         */
        public Builder backup(String backup) {
            return backup(Output.of(backup));
        }

        /**
         * @param primary The id of the primary wireless profile
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Output<String> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary The id of the primary wireless profile
         * 
         * @return builder
         * 
         */
        public Builder primary(String primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param secondary The id of the secondary wireless profile
         * 
         * @return builder
         * 
         */
        public Builder secondary(@Nullable Output<String> secondary) {
            $.secondary = secondary;
            return this;
        }

        /**
         * @param secondary The id of the secondary wireless profile
         * 
         * @return builder
         * 
         */
        public Builder secondary(String secondary) {
            return secondary(Output.of(secondary));
        }

        public CameraWirelessProfilesIdsArgs build() {
            return $;
        }
    }

}