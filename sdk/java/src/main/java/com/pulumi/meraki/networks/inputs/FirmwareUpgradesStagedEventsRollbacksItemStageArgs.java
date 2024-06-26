// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsRollbacksItemStageGroupArgs;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsRollbacksItemStageMilestonesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedEventsRollbacksItemStageArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedEventsRollbacksItemStageArgs Empty = new FirmwareUpgradesStagedEventsRollbacksItemStageArgs();

    /**
     * The staged upgrade group
     * 
     */
    @Import(name="group")
    private @Nullable Output<FirmwareUpgradesStagedEventsRollbacksItemStageGroupArgs> group;

    /**
     * @return The staged upgrade group
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsRollbacksItemStageGroupArgs>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * The Staged Upgrade Milestones for the stage
     * 
     */
    @Import(name="milestones")
    private @Nullable Output<FirmwareUpgradesStagedEventsRollbacksItemStageMilestonesArgs> milestones;

    /**
     * @return The Staged Upgrade Milestones for the stage
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedEventsRollbacksItemStageMilestonesArgs>> milestones() {
        return Optional.ofNullable(this.milestones);
    }

    /**
     * Current upgrade status of the group
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Current upgrade status of the group
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private FirmwareUpgradesStagedEventsRollbacksItemStageArgs() {}

    private FirmwareUpgradesStagedEventsRollbacksItemStageArgs(FirmwareUpgradesStagedEventsRollbacksItemStageArgs $) {
        this.group = $.group;
        this.milestones = $.milestones;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedEventsRollbacksItemStageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedEventsRollbacksItemStageArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedEventsRollbacksItemStageArgs();
        }

        public Builder(FirmwareUpgradesStagedEventsRollbacksItemStageArgs defaults) {
            $ = new FirmwareUpgradesStagedEventsRollbacksItemStageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group The staged upgrade group
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<FirmwareUpgradesStagedEventsRollbacksItemStageGroupArgs> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The staged upgrade group
         * 
         * @return builder
         * 
         */
        public Builder group(FirmwareUpgradesStagedEventsRollbacksItemStageGroupArgs group) {
            return group(Output.of(group));
        }

        /**
         * @param milestones The Staged Upgrade Milestones for the stage
         * 
         * @return builder
         * 
         */
        public Builder milestones(@Nullable Output<FirmwareUpgradesStagedEventsRollbacksItemStageMilestonesArgs> milestones) {
            $.milestones = milestones;
            return this;
        }

        /**
         * @param milestones The Staged Upgrade Milestones for the stage
         * 
         * @return builder
         * 
         */
        public Builder milestones(FirmwareUpgradesStagedEventsRollbacksItemStageMilestonesArgs milestones) {
            return milestones(Output.of(milestones));
        }

        /**
         * @param status Current upgrade status of the group
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Current upgrade status of the group
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public FirmwareUpgradesStagedEventsRollbacksItemStageArgs build() {
            return $;
        }
    }

}
