// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsRollbacksParametersStageGroup;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsRollbacksParametersStageMilestones;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesStagedEventsRollbacksParametersStage {
    /**
     * @return The Staged Upgrade Group containing the name and ID
     * 
     */
    private @Nullable FirmwareUpgradesStagedEventsRollbacksParametersStageGroup group;
    /**
     * @return The Staged Upgrade Milestones for the specific stage
     * 
     */
    private @Nullable FirmwareUpgradesStagedEventsRollbacksParametersStageMilestones milestones;

    private FirmwareUpgradesStagedEventsRollbacksParametersStage() {}
    /**
     * @return The Staged Upgrade Group containing the name and ID
     * 
     */
    public Optional<FirmwareUpgradesStagedEventsRollbacksParametersStageGroup> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return The Staged Upgrade Milestones for the specific stage
     * 
     */
    public Optional<FirmwareUpgradesStagedEventsRollbacksParametersStageMilestones> milestones() {
        return Optional.ofNullable(this.milestones);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesStagedEventsRollbacksParametersStage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FirmwareUpgradesStagedEventsRollbacksParametersStageGroup group;
        private @Nullable FirmwareUpgradesStagedEventsRollbacksParametersStageMilestones milestones;
        public Builder() {}
        public Builder(FirmwareUpgradesStagedEventsRollbacksParametersStage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.milestones = defaults.milestones;
        }

        @CustomType.Setter
        public Builder group(@Nullable FirmwareUpgradesStagedEventsRollbacksParametersStageGroup group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder milestones(@Nullable FirmwareUpgradesStagedEventsRollbacksParametersStageMilestones milestones) {

            this.milestones = milestones;
            return this;
        }
        public FirmwareUpgradesStagedEventsRollbacksParametersStage build() {
            final var _resultValue = new FirmwareUpgradesStagedEventsRollbacksParametersStage();
            _resultValue.group = group;
            _resultValue.milestones = milestones;
            return _resultValue;
        }
    }
}
