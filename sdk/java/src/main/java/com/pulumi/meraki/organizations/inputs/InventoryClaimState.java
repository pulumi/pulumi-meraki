// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.InventoryClaimItemArgs;
import com.pulumi.meraki.organizations.inputs.InventoryClaimParametersArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryClaimState extends com.pulumi.resources.ResourceArgs {

    public static final InventoryClaimState Empty = new InventoryClaimState();

    @Import(name="item")
    private @Nullable Output<InventoryClaimItemArgs> item;

    public Optional<Output<InventoryClaimItemArgs>> item() {
        return Optional.ofNullable(this.item);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    @Import(name="parameters")
    private @Nullable Output<InventoryClaimParametersArgs> parameters;

    public Optional<Output<InventoryClaimParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private InventoryClaimState() {}

    private InventoryClaimState(InventoryClaimState $) {
        this.item = $.item;
        this.organizationId = $.organizationId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryClaimState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryClaimState $;

        public Builder() {
            $ = new InventoryClaimState();
        }

        public Builder(InventoryClaimState defaults) {
            $ = new InventoryClaimState(Objects.requireNonNull(defaults));
        }

        public Builder item(@Nullable Output<InventoryClaimItemArgs> item) {
            $.item = item;
            return this;
        }

        public Builder item(InventoryClaimItemArgs item) {
            return item(Output.of(item));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public Builder parameters(@Nullable Output<InventoryClaimParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(InventoryClaimParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public InventoryClaimState build() {
            return $;
        }
    }

}