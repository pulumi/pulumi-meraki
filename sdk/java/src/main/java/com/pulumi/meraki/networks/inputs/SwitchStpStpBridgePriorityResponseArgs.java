// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchStpStpBridgePriorityResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchStpStpBridgePriorityResponseArgs Empty = new SwitchStpStpBridgePriorityResponseArgs();

    /**
     * List of stack IDs
     * 
     */
    @Import(name="stacks")
    private @Nullable Output<List<String>> stacks;

    /**
     * @return List of stack IDs
     * 
     */
    public Optional<Output<List<String>>> stacks() {
        return Optional.ofNullable(this.stacks);
    }

    /**
     * STP priority for switch, stacks, or switch templates
     * 
     */
    @Import(name="stpPriority")
    private @Nullable Output<Integer> stpPriority;

    /**
     * @return STP priority for switch, stacks, or switch templates
     * 
     */
    public Optional<Output<Integer>> stpPriority() {
        return Optional.ofNullable(this.stpPriority);
    }

    /**
     * List of switch template IDs
     * 
     */
    @Import(name="switchProfiles")
    private @Nullable Output<List<String>> switchProfiles;

    /**
     * @return List of switch template IDs
     * 
     */
    public Optional<Output<List<String>>> switchProfiles() {
        return Optional.ofNullable(this.switchProfiles);
    }

    /**
     * List of switch serial numbers
     * 
     */
    @Import(name="switches")
    private @Nullable Output<List<String>> switches;

    /**
     * @return List of switch serial numbers
     * 
     */
    public Optional<Output<List<String>>> switches() {
        return Optional.ofNullable(this.switches);
    }

    private SwitchStpStpBridgePriorityResponseArgs() {}

    private SwitchStpStpBridgePriorityResponseArgs(SwitchStpStpBridgePriorityResponseArgs $) {
        this.stacks = $.stacks;
        this.stpPriority = $.stpPriority;
        this.switchProfiles = $.switchProfiles;
        this.switches = $.switches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchStpStpBridgePriorityResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchStpStpBridgePriorityResponseArgs $;

        public Builder() {
            $ = new SwitchStpStpBridgePriorityResponseArgs();
        }

        public Builder(SwitchStpStpBridgePriorityResponseArgs defaults) {
            $ = new SwitchStpStpBridgePriorityResponseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param stacks List of stack IDs
         * 
         * @return builder
         * 
         */
        public Builder stacks(@Nullable Output<List<String>> stacks) {
            $.stacks = stacks;
            return this;
        }

        /**
         * @param stacks List of stack IDs
         * 
         * @return builder
         * 
         */
        public Builder stacks(List<String> stacks) {
            return stacks(Output.of(stacks));
        }

        /**
         * @param stacks List of stack IDs
         * 
         * @return builder
         * 
         */
        public Builder stacks(String... stacks) {
            return stacks(List.of(stacks));
        }

        /**
         * @param stpPriority STP priority for switch, stacks, or switch templates
         * 
         * @return builder
         * 
         */
        public Builder stpPriority(@Nullable Output<Integer> stpPriority) {
            $.stpPriority = stpPriority;
            return this;
        }

        /**
         * @param stpPriority STP priority for switch, stacks, or switch templates
         * 
         * @return builder
         * 
         */
        public Builder stpPriority(Integer stpPriority) {
            return stpPriority(Output.of(stpPriority));
        }

        /**
         * @param switchProfiles List of switch template IDs
         * 
         * @return builder
         * 
         */
        public Builder switchProfiles(@Nullable Output<List<String>> switchProfiles) {
            $.switchProfiles = switchProfiles;
            return this;
        }

        /**
         * @param switchProfiles List of switch template IDs
         * 
         * @return builder
         * 
         */
        public Builder switchProfiles(List<String> switchProfiles) {
            return switchProfiles(Output.of(switchProfiles));
        }

        /**
         * @param switchProfiles List of switch template IDs
         * 
         * @return builder
         * 
         */
        public Builder switchProfiles(String... switchProfiles) {
            return switchProfiles(List.of(switchProfiles));
        }

        /**
         * @param switches List of switch serial numbers
         * 
         * @return builder
         * 
         */
        public Builder switches(@Nullable Output<List<String>> switches) {
            $.switches = switches;
            return this;
        }

        /**
         * @param switches List of switch serial numbers
         * 
         * @return builder
         * 
         */
        public Builder switches(List<String> switches) {
            return switches(Output.of(switches));
        }

        /**
         * @param switches List of switch serial numbers
         * 
         * @return builder
         * 
         */
        public Builder switches(String... switches) {
            return switches(List.of(switches));
        }

        public SwitchStpStpBridgePriorityResponseArgs build() {
            return $;
        }
    }

}