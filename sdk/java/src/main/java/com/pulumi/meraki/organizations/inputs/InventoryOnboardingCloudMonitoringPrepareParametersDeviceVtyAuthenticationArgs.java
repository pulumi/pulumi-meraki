// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationGroupArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs Empty = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs();

    /**
     * Group Details
     * 
     */
    @Import(name="group")
    private @Nullable Output<InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationGroupArgs> group;

    /**
     * @return Group Details
     * 
     */
    public Optional<Output<InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationGroupArgs>> group() {
        return Optional.ofNullable(this.group);
    }

    private InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs() {}

    private InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs $) {
        this.group = $.group;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs $;

        public Builder() {
            $ = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs();
        }

        public Builder(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs defaults) {
            $ = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group Group Details
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationGroupArgs> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group Group Details
         * 
         * @return builder
         * 
         */
        public Builder group(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationGroupArgs group) {
            return group(Output.of(group));
        }

        public InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs build() {
            return $;
        }
    }

}
