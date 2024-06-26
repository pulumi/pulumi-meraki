// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicensingSubscriptionSubscriptionsBindParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicensingSubscriptionSubscriptionsBindParametersArgs Empty = new LicensingSubscriptionSubscriptionsBindParametersArgs();

    /**
     * List of network ids to bind to the subscription
     * 
     */
    @Import(name="networkIds")
    private @Nullable Output<List<String>> networkIds;

    /**
     * @return List of network ids to bind to the subscription
     * 
     */
    public Optional<Output<List<String>>> networkIds() {
        return Optional.ofNullable(this.networkIds);
    }

    private LicensingSubscriptionSubscriptionsBindParametersArgs() {}

    private LicensingSubscriptionSubscriptionsBindParametersArgs(LicensingSubscriptionSubscriptionsBindParametersArgs $) {
        this.networkIds = $.networkIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensingSubscriptionSubscriptionsBindParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensingSubscriptionSubscriptionsBindParametersArgs $;

        public Builder() {
            $ = new LicensingSubscriptionSubscriptionsBindParametersArgs();
        }

        public Builder(LicensingSubscriptionSubscriptionsBindParametersArgs defaults) {
            $ = new LicensingSubscriptionSubscriptionsBindParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkIds List of network ids to bind to the subscription
         * 
         * @return builder
         * 
         */
        public Builder networkIds(@Nullable Output<List<String>> networkIds) {
            $.networkIds = networkIds;
            return this;
        }

        /**
         * @param networkIds List of network ids to bind to the subscription
         * 
         * @return builder
         * 
         */
        public Builder networkIds(List<String> networkIds) {
            return networkIds(Output.of(networkIds));
        }

        /**
         * @param networkIds List of network ids to bind to the subscription
         * 
         * @return builder
         * 
         */
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
        }

        public LicensingSubscriptionSubscriptionsBindParametersArgs build() {
            return $;
        }
    }

}
