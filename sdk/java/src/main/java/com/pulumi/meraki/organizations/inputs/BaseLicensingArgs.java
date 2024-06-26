// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BaseLicensingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BaseLicensingArgs Empty = new BaseLicensingArgs();

    /**
     * Organization licensing model. Can be &#39;co-term&#39;, &#39;per-device&#39;, or &#39;subscription&#39;.
     * 
     */
    @Import(name="model")
    private @Nullable Output<String> model;

    /**
     * @return Organization licensing model. Can be &#39;co-term&#39;, &#39;per-device&#39;, or &#39;subscription&#39;.
     * 
     */
    public Optional<Output<String>> model() {
        return Optional.ofNullable(this.model);
    }

    private BaseLicensingArgs() {}

    private BaseLicensingArgs(BaseLicensingArgs $) {
        this.model = $.model;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaseLicensingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaseLicensingArgs $;

        public Builder() {
            $ = new BaseLicensingArgs();
        }

        public Builder(BaseLicensingArgs defaults) {
            $ = new BaseLicensingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param model Organization licensing model. Can be &#39;co-term&#39;, &#39;per-device&#39;, or &#39;subscription&#39;.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Output<String> model) {
            $.model = model;
            return this;
        }

        /**
         * @param model Organization licensing model. Can be &#39;co-term&#39;, &#39;per-device&#39;, or &#39;subscription&#39;.
         * 
         * @return builder
         * 
         */
        public Builder model(String model) {
            return model(Output.of(model));
        }

        public BaseLicensingArgs build() {
            return $;
        }
    }

}
