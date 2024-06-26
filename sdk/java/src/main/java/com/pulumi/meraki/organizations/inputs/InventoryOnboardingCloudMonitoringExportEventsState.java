// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.InventoryOnboardingCloudMonitoringExportEventsParametersArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryOnboardingCloudMonitoringExportEventsState extends com.pulumi.resources.ResourceArgs {

    public static final InventoryOnboardingCloudMonitoringExportEventsState Empty = new InventoryOnboardingCloudMonitoringExportEventsState();

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
    private @Nullable Output<InventoryOnboardingCloudMonitoringExportEventsParametersArgs> parameters;

    public Optional<Output<InventoryOnboardingCloudMonitoringExportEventsParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private InventoryOnboardingCloudMonitoringExportEventsState() {}

    private InventoryOnboardingCloudMonitoringExportEventsState(InventoryOnboardingCloudMonitoringExportEventsState $) {
        this.organizationId = $.organizationId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryOnboardingCloudMonitoringExportEventsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryOnboardingCloudMonitoringExportEventsState $;

        public Builder() {
            $ = new InventoryOnboardingCloudMonitoringExportEventsState();
        }

        public Builder(InventoryOnboardingCloudMonitoringExportEventsState defaults) {
            $ = new InventoryOnboardingCloudMonitoringExportEventsState(Objects.requireNonNull(defaults));
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

        public Builder parameters(@Nullable Output<InventoryOnboardingCloudMonitoringExportEventsParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(InventoryOnboardingCloudMonitoringExportEventsParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public InventoryOnboardingCloudMonitoringExportEventsState build() {
            return $;
        }
    }

}
