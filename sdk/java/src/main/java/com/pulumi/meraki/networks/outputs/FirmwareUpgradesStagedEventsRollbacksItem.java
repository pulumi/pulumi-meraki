// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsRollbacksItemProducts;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsRollbacksItemReason;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsRollbacksItemStage;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirmwareUpgradesStagedEventsRollbacksItem {
    /**
     * @return The network devices to be updated
     * 
     */
    private @Nullable FirmwareUpgradesStagedEventsRollbacksItemProducts products;
    /**
     * @return Reasons for the rollback
     * 
     */
    private @Nullable List<FirmwareUpgradesStagedEventsRollbacksItemReason> reasons;
    /**
     * @return The ordered stages in the network
     * 
     */
    private @Nullable List<FirmwareUpgradesStagedEventsRollbacksItemStage> stages;

    private FirmwareUpgradesStagedEventsRollbacksItem() {}
    /**
     * @return The network devices to be updated
     * 
     */
    public Optional<FirmwareUpgradesStagedEventsRollbacksItemProducts> products() {
        return Optional.ofNullable(this.products);
    }
    /**
     * @return Reasons for the rollback
     * 
     */
    public List<FirmwareUpgradesStagedEventsRollbacksItemReason> reasons() {
        return this.reasons == null ? List.of() : this.reasons;
    }
    /**
     * @return The ordered stages in the network
     * 
     */
    public List<FirmwareUpgradesStagedEventsRollbacksItemStage> stages() {
        return this.stages == null ? List.of() : this.stages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirmwareUpgradesStagedEventsRollbacksItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FirmwareUpgradesStagedEventsRollbacksItemProducts products;
        private @Nullable List<FirmwareUpgradesStagedEventsRollbacksItemReason> reasons;
        private @Nullable List<FirmwareUpgradesStagedEventsRollbacksItemStage> stages;
        public Builder() {}
        public Builder(FirmwareUpgradesStagedEventsRollbacksItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.products = defaults.products;
    	      this.reasons = defaults.reasons;
    	      this.stages = defaults.stages;
        }

        @CustomType.Setter
        public Builder products(@Nullable FirmwareUpgradesStagedEventsRollbacksItemProducts products) {

            this.products = products;
            return this;
        }
        @CustomType.Setter
        public Builder reasons(@Nullable List<FirmwareUpgradesStagedEventsRollbacksItemReason> reasons) {

            this.reasons = reasons;
            return this;
        }
        public Builder reasons(FirmwareUpgradesStagedEventsRollbacksItemReason... reasons) {
            return reasons(List.of(reasons));
        }
        @CustomType.Setter
        public Builder stages(@Nullable List<FirmwareUpgradesStagedEventsRollbacksItemStage> stages) {

            this.stages = stages;
            return this;
        }
        public Builder stages(FirmwareUpgradesStagedEventsRollbacksItemStage... stages) {
            return stages(List.of(stages));
        }
        public FirmwareUpgradesStagedEventsRollbacksItem build() {
            final var _resultValue = new FirmwareUpgradesStagedEventsRollbacksItem();
            _resultValue.products = products;
            _resultValue.reasons = reasons;
            _resultValue.stages = stages;
            return _resultValue;
        }
    }
}
