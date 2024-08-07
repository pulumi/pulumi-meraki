// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedGroupsAssignedDevicesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirmwareUpgradesStagedGroupsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirmwareUpgradesStagedGroupsArgs Empty = new FirmwareUpgradesStagedGroupsArgs();

    /**
     * The devices and Switch Stacks assigned to the Group
     * 
     */
    @Import(name="assignedDevices")
    private @Nullable Output<FirmwareUpgradesStagedGroupsAssignedDevicesArgs> assignedDevices;

    /**
     * @return The devices and Switch Stacks assigned to the Group
     * 
     */
    public Optional<Output<FirmwareUpgradesStagedGroupsAssignedDevicesArgs>> assignedDevices() {
        return Optional.ofNullable(this.assignedDevices);
    }

    /**
     * Description of the Staged Upgrade Group
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the Staged Upgrade Group
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Id of staged upgrade group
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return Id of staged upgrade group
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Boolean indicating the default Group. Any device that does not have a group explicitly assigned will upgrade with this group
     * 
     */
    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    /**
     * @return Boolean indicating the default Group. Any device that does not have a group explicitly assigned will upgrade with this group
     * 
     */
    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * Name of the Staged Upgrade Group
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Staged Upgrade Group
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    private FirmwareUpgradesStagedGroupsArgs() {}

    private FirmwareUpgradesStagedGroupsArgs(FirmwareUpgradesStagedGroupsArgs $) {
        this.assignedDevices = $.assignedDevices;
        this.description = $.description;
        this.groupId = $.groupId;
        this.isDefault = $.isDefault;
        this.name = $.name;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirmwareUpgradesStagedGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirmwareUpgradesStagedGroupsArgs $;

        public Builder() {
            $ = new FirmwareUpgradesStagedGroupsArgs();
        }

        public Builder(FirmwareUpgradesStagedGroupsArgs defaults) {
            $ = new FirmwareUpgradesStagedGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignedDevices The devices and Switch Stacks assigned to the Group
         * 
         * @return builder
         * 
         */
        public Builder assignedDevices(@Nullable Output<FirmwareUpgradesStagedGroupsAssignedDevicesArgs> assignedDevices) {
            $.assignedDevices = assignedDevices;
            return this;
        }

        /**
         * @param assignedDevices The devices and Switch Stacks assigned to the Group
         * 
         * @return builder
         * 
         */
        public Builder assignedDevices(FirmwareUpgradesStagedGroupsAssignedDevicesArgs assignedDevices) {
            return assignedDevices(Output.of(assignedDevices));
        }

        /**
         * @param description Description of the Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param groupId Id of staged upgrade group
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Id of staged upgrade group
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param isDefault Boolean indicating the default Group. Any device that does not have a group explicitly assigned will upgrade with this group
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault Boolean indicating the default Group. Any device that does not have a group explicitly assigned will upgrade with this group
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param name Name of the Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Staged Upgrade Group
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
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

        public FirmwareUpgradesStagedGroupsArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("FirmwareUpgradesStagedGroupsArgs", "networkId");
            }
            return $;
        }
    }

}
