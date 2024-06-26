// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyOutArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs Empty = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs();

    /**
     * VTY in ACL
     * 
     */
    @Import(name="vtyIn")
    private @Nullable Output<InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs> vtyIn;

    /**
     * @return VTY in ACL
     * 
     */
    public Optional<Output<InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs>> vtyIn() {
        return Optional.ofNullable(this.vtyIn);
    }

    /**
     * VTY out ACL
     * 
     */
    @Import(name="vtyOut")
    private @Nullable Output<InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyOutArgs> vtyOut;

    /**
     * @return VTY out ACL
     * 
     */
    public Optional<Output<InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyOutArgs>> vtyOut() {
        return Optional.ofNullable(this.vtyOut);
    }

    private InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs() {}

    private InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs $) {
        this.vtyIn = $.vtyIn;
        this.vtyOut = $.vtyOut;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs $;

        public Builder() {
            $ = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs();
        }

        public Builder(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs defaults) {
            $ = new InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vtyIn VTY in ACL
         * 
         * @return builder
         * 
         */
        public Builder vtyIn(@Nullable Output<InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs> vtyIn) {
            $.vtyIn = vtyIn;
            return this;
        }

        /**
         * @param vtyIn VTY in ACL
         * 
         * @return builder
         * 
         */
        public Builder vtyIn(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs vtyIn) {
            return vtyIn(Output.of(vtyIn));
        }

        /**
         * @param vtyOut VTY out ACL
         * 
         * @return builder
         * 
         */
        public Builder vtyOut(@Nullable Output<InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyOutArgs> vtyOut) {
            $.vtyOut = vtyOut;
            return this;
        }

        /**
         * @param vtyOut VTY out ACL
         * 
         * @return builder
         * 
         */
        public Builder vtyOut(InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyOutArgs vtyOut) {
            return vtyOut(Output.of(vtyOut));
        }

        public InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs build() {
            return $;
        }
    }

}
