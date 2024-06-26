// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.administered.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.administered.inputs.LicensingSubscriptionSubscriptionsBindItemArgs;
import com.pulumi.meraki.administered.inputs.LicensingSubscriptionSubscriptionsBindParametersArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicensingSubscriptionSubscriptionsBindState extends com.pulumi.resources.ResourceArgs {

    public static final LicensingSubscriptionSubscriptionsBindState Empty = new LicensingSubscriptionSubscriptionsBindState();

    @Import(name="item")
    private @Nullable Output<LicensingSubscriptionSubscriptionsBindItemArgs> item;

    public Optional<Output<LicensingSubscriptionSubscriptionsBindItemArgs>> item() {
        return Optional.ofNullable(this.item);
    }

    @Import(name="parameters")
    private @Nullable Output<LicensingSubscriptionSubscriptionsBindParametersArgs> parameters;

    public Optional<Output<LicensingSubscriptionSubscriptionsBindParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * subscriptionId path parameter. Subscription ID
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return subscriptionId path parameter. Subscription ID
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * validate query parameter. Check if the provided networks can be bound to the subscription. Returns any licensing problems and does not commit the results.
     * 
     */
    @Import(name="validate")
    private @Nullable Output<Boolean> validate;

    /**
     * @return validate query parameter. Check if the provided networks can be bound to the subscription. Returns any licensing problems and does not commit the results.
     * 
     */
    public Optional<Output<Boolean>> validate() {
        return Optional.ofNullable(this.validate);
    }

    private LicensingSubscriptionSubscriptionsBindState() {}

    private LicensingSubscriptionSubscriptionsBindState(LicensingSubscriptionSubscriptionsBindState $) {
        this.item = $.item;
        this.parameters = $.parameters;
        this.subscriptionId = $.subscriptionId;
        this.validate = $.validate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicensingSubscriptionSubscriptionsBindState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicensingSubscriptionSubscriptionsBindState $;

        public Builder() {
            $ = new LicensingSubscriptionSubscriptionsBindState();
        }

        public Builder(LicensingSubscriptionSubscriptionsBindState defaults) {
            $ = new LicensingSubscriptionSubscriptionsBindState(Objects.requireNonNull(defaults));
        }

        public Builder item(@Nullable Output<LicensingSubscriptionSubscriptionsBindItemArgs> item) {
            $.item = item;
            return this;
        }

        public Builder item(LicensingSubscriptionSubscriptionsBindItemArgs item) {
            return item(Output.of(item));
        }

        public Builder parameters(@Nullable Output<LicensingSubscriptionSubscriptionsBindParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(LicensingSubscriptionSubscriptionsBindParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param subscriptionId subscriptionId path parameter. Subscription ID
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId subscriptionId path parameter. Subscription ID
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param validate validate query parameter. Check if the provided networks can be bound to the subscription. Returns any licensing problems and does not commit the results.
         * 
         * @return builder
         * 
         */
        public Builder validate(@Nullable Output<Boolean> validate) {
            $.validate = validate;
            return this;
        }

        /**
         * @param validate validate query parameter. Check if the provided networks can be bound to the subscription. Returns any licensing problems and does not commit the results.
         * 
         * @return builder
         * 
         */
        public Builder validate(Boolean validate) {
            return validate(Output.of(validate));
        }

        public LicensingSubscriptionSubscriptionsBindState build() {
            return $;
        }
    }

}
