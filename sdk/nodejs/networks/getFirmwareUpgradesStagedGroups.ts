// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getFirmwareUpgradesStagedGroups(args?: GetFirmwareUpgradesStagedGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetFirmwareUpgradesStagedGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getFirmwareUpgradesStagedGroups:getFirmwareUpgradesStagedGroups", {
        "groupId": args.groupId,
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirmwareUpgradesStagedGroups.
 */
export interface GetFirmwareUpgradesStagedGroupsArgs {
    /**
     * groupId path parameter. Group ID
     */
    groupId?: string;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
}

/**
 * A collection of values returned by getFirmwareUpgradesStagedGroups.
 */
export interface GetFirmwareUpgradesStagedGroupsResult {
    /**
     * groupId path parameter. Group ID
     */
    readonly groupId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetFirmwareUpgradesStagedGroupsItem;
    /**
     * Array of ResponseNetworksGetNetworkFirmwareUpgradesStagedGroups
     */
    readonly items: outputs.networks.GetFirmwareUpgradesStagedGroupsItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
}
/**
 * ## Example Usage
 */
export function getFirmwareUpgradesStagedGroupsOutput(args?: GetFirmwareUpgradesStagedGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFirmwareUpgradesStagedGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getFirmwareUpgradesStagedGroups:getFirmwareUpgradesStagedGroups", {
        "groupId": args.groupId,
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirmwareUpgradesStagedGroups.
 */
export interface GetFirmwareUpgradesStagedGroupsOutputArgs {
    /**
     * groupId path parameter. Group ID
     */
    groupId?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
}
