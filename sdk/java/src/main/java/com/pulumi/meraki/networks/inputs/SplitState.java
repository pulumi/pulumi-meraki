// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.SplitItemArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SplitState extends com.pulumi.resources.ResourceArgs {

    public static final SplitState Empty = new SplitState();

    @Import(name="item")
    private @Nullable Output<SplitItemArgs> item;

    public Optional<Output<SplitItemArgs>> item() {
        return Optional.ofNullable(this.item);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private SplitState() {}

    private SplitState(SplitState $) {
        this.item = $.item;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SplitState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SplitState $;

        public Builder() {
            $ = new SplitState();
        }

        public Builder(SplitState defaults) {
            $ = new SplitState(Objects.requireNonNull(defaults));
        }

        public Builder item(@Nullable Output<SplitItemArgs> item) {
            $.item = item;
            return this;
        }

        public Builder item(SplitItemArgs item) {
            return item(Output.of(item));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public SplitState build() {
            return $;
        }
    }

}
