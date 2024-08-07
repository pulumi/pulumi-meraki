// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchStacksAddParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchStacksAddParametersArgs Empty = new SwitchStacksAddParametersArgs();

    /**
     * The serial of the switch to be added
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return The serial of the switch to be added
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    private SwitchStacksAddParametersArgs() {}

    private SwitchStacksAddParametersArgs(SwitchStacksAddParametersArgs $) {
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchStacksAddParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchStacksAddParametersArgs $;

        public Builder() {
            $ = new SwitchStacksAddParametersArgs();
        }

        public Builder(SwitchStacksAddParametersArgs defaults) {
            $ = new SwitchStacksAddParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serial The serial of the switch to be added
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial The serial of the switch to be added
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        public SwitchStacksAddParametersArgs build() {
            return $;
        }
    }

}
