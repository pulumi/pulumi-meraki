// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveToolsWakeOnLanCallbackPayloadTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiveToolsWakeOnLanCallbackPayloadTemplateArgs Empty = new LiveToolsWakeOnLanCallbackPayloadTemplateArgs();

    /**
     * The ID of the payload template. Defaults to &#39;wpt_00005&#39; for the Callback (included) template.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the payload template. Defaults to &#39;wpt_00005&#39; for the Callback (included) template.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private LiveToolsWakeOnLanCallbackPayloadTemplateArgs() {}

    private LiveToolsWakeOnLanCallbackPayloadTemplateArgs(LiveToolsWakeOnLanCallbackPayloadTemplateArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveToolsWakeOnLanCallbackPayloadTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveToolsWakeOnLanCallbackPayloadTemplateArgs $;

        public Builder() {
            $ = new LiveToolsWakeOnLanCallbackPayloadTemplateArgs();
        }

        public Builder(LiveToolsWakeOnLanCallbackPayloadTemplateArgs defaults) {
            $ = new LiveToolsWakeOnLanCallbackPayloadTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the payload template. Defaults to &#39;wpt_00005&#39; for the Callback (included) template.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the payload template. Defaults to &#39;wpt_00005&#39; for the Callback (included) template.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public LiveToolsWakeOnLanCallbackPayloadTemplateArgs build() {
            return $;
        }
    }

}
