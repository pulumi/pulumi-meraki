// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveToolsWakeOnLanCallbackHttpServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiveToolsWakeOnLanCallbackHttpServerArgs Empty = new LiveToolsWakeOnLanCallbackHttpServerArgs();

    /**
     * The webhook receiver ID that will receive information. If specifying this, please leave the url and sharedSecret fields blank.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The webhook receiver ID that will receive information. If specifying this, please leave the url and sharedSecret fields blank.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private LiveToolsWakeOnLanCallbackHttpServerArgs() {}

    private LiveToolsWakeOnLanCallbackHttpServerArgs(LiveToolsWakeOnLanCallbackHttpServerArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveToolsWakeOnLanCallbackHttpServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveToolsWakeOnLanCallbackHttpServerArgs $;

        public Builder() {
            $ = new LiveToolsWakeOnLanCallbackHttpServerArgs();
        }

        public Builder(LiveToolsWakeOnLanCallbackHttpServerArgs defaults) {
            $ = new LiveToolsWakeOnLanCallbackHttpServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The webhook receiver ID that will receive information. If specifying this, please leave the url and sharedSecret fields blank.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The webhook receiver ID that will receive information. If specifying this, please leave the url and sharedSecret fields blank.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public LiveToolsWakeOnLanCallbackHttpServerArgs build() {
            return $;
        }
    }

}