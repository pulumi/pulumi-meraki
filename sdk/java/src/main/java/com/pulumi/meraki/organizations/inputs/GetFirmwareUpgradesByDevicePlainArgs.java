// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirmwareUpgradesByDevicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirmwareUpgradesByDevicePlainArgs Empty = new GetFirmwareUpgradesByDevicePlainArgs();

    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="endingBefore")
    private @Nullable String endingBefore;

    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }

    /**
     * firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
     * 
     */
    @Import(name="firmwareUpgradeBatchIds")
    private @Nullable List<String> firmwareUpgradeBatchIds;

    /**
     * @return firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
     * 
     */
    public Optional<List<String>> firmwareUpgradeBatchIds() {
        return Optional.ofNullable(this.firmwareUpgradeBatchIds);
    }

    /**
     * macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
     * 
     */
    @Import(name="macs")
    private @Nullable List<String> macs;

    /**
     * @return macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
     * 
     */
    public Optional<List<String>> macs() {
        return Optional.ofNullable(this.macs);
    }

    /**
     * networkIds query parameter. Optional parameter to filter by network
     * 
     */
    @Import(name="networkIds")
    private @Nullable List<String> networkIds;

    /**
     * @return networkIds query parameter. Optional parameter to filter by network
     * 
     */
    public Optional<List<String>> networkIds() {
        return Optional.ofNullable(this.networkIds);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     * 
     */
    @Import(name="perPage")
    private @Nullable Integer perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
     * 
     */
    @Import(name="serials")
    private @Nullable List<String> serials;

    /**
     * @return serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
     * 
     */
    public Optional<List<String>> serials() {
        return Optional.ofNullable(this.serials);
    }

    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="startingAfter")
    private @Nullable String startingAfter;

    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }

    /**
     * upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
     * 
     */
    @Import(name="upgradestatuses")
    private @Nullable List<String> upgradestatuses;

    /**
     * @return upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
     * 
     */
    public Optional<List<String>> upgradestatuses() {
        return Optional.ofNullable(this.upgradestatuses);
    }

    private GetFirmwareUpgradesByDevicePlainArgs() {}

    private GetFirmwareUpgradesByDevicePlainArgs(GetFirmwareUpgradesByDevicePlainArgs $) {
        this.endingBefore = $.endingBefore;
        this.firmwareUpgradeBatchIds = $.firmwareUpgradeBatchIds;
        this.macs = $.macs;
        this.networkIds = $.networkIds;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.serials = $.serials;
        this.startingAfter = $.startingAfter;
        this.upgradestatuses = $.upgradestatuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirmwareUpgradesByDevicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirmwareUpgradesByDevicePlainArgs $;

        public Builder() {
            $ = new GetFirmwareUpgradesByDevicePlainArgs();
        }

        public Builder(GetFirmwareUpgradesByDevicePlainArgs defaults) {
            $ = new GetFirmwareUpgradesByDevicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(@Nullable String endingBefore) {
            $.endingBefore = endingBefore;
            return this;
        }

        /**
         * @param firmwareUpgradeBatchIds firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
         * 
         * @return builder
         * 
         */
        public Builder firmwareUpgradeBatchIds(@Nullable List<String> firmwareUpgradeBatchIds) {
            $.firmwareUpgradeBatchIds = firmwareUpgradeBatchIds;
            return this;
        }

        /**
         * @param firmwareUpgradeBatchIds firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
         * 
         * @return builder
         * 
         */
        public Builder firmwareUpgradeBatchIds(String... firmwareUpgradeBatchIds) {
            return firmwareUpgradeBatchIds(List.of(firmwareUpgradeBatchIds));
        }

        /**
         * @param macs macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
         * 
         * @return builder
         * 
         */
        public Builder macs(@Nullable List<String> macs) {
            $.macs = macs;
            return this;
        }

        /**
         * @param macs macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
         * 
         * @return builder
         * 
         */
        public Builder macs(String... macs) {
            return macs(List.of(macs));
        }

        /**
         * @param networkIds networkIds query parameter. Optional parameter to filter by network
         * 
         * @return builder
         * 
         */
        public Builder networkIds(@Nullable List<String> networkIds) {
            $.networkIds = networkIds;
            return this;
        }

        /**
         * @param networkIds networkIds query parameter. Optional parameter to filter by network
         * 
         * @return builder
         * 
         */
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Integer perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param serials serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable List<String> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }

        /**
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(@Nullable String startingAfter) {
            $.startingAfter = startingAfter;
            return this;
        }

        /**
         * @param upgradestatuses upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
         * 
         * @return builder
         * 
         */
        public Builder upgradestatuses(@Nullable List<String> upgradestatuses) {
            $.upgradestatuses = upgradestatuses;
            return this;
        }

        /**
         * @param upgradestatuses upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
         * 
         * @return builder
         * 
         */
        public Builder upgradestatuses(String... upgradestatuses) {
            return upgradestatuses(List.of(upgradestatuses));
        }

        public GetFirmwareUpgradesByDevicePlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetFirmwareUpgradesByDevicePlainArgs", "organizationId");
            }
            return $;
        }
    }

}
