// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getFirmwareUpgradesByDevice({
 *     endingBefore: "string",
 *     firmwareUpgradeBatchIds: ["string"],
 *     macs: ["string"],
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     perPage: 1,
 *     serials: ["string"],
 *     startingAfter: "string",
 *     upgradestatuses: ["string"],
 * });
 * export const merakiOrganizationsFirmwareUpgradesByDeviceExample = example.then(example => example.items);
 * ```
 */
export function getFirmwareUpgradesByDevice(args: GetFirmwareUpgradesByDeviceArgs, opts?: pulumi.InvokeOptions): Promise<GetFirmwareUpgradesByDeviceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getFirmwareUpgradesByDevice:getFirmwareUpgradesByDevice", {
        "endingBefore": args.endingBefore,
        "firmwareUpgradeBatchIds": args.firmwareUpgradeBatchIds,
        "macs": args.macs,
        "networkIds": args.networkIds,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "serials": args.serials,
        "startingAfter": args.startingAfter,
        "upgradestatuses": args.upgradestatuses,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirmwareUpgradesByDevice.
 */
export interface GetFirmwareUpgradesByDeviceArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
     */
    firmwareUpgradeBatchIds?: string[];
    /**
     * macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
     */
    macs?: string[];
    /**
     * networkIds query parameter. Optional parameter to filter by network
     */
    networkIds?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     */
    perPage?: number;
    /**
     * serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
     */
    serials?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
    /**
     * upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
     */
    upgradestatuses?: string[];
}

/**
 * A collection of values returned by getFirmwareUpgradesByDevice.
 */
export interface GetFirmwareUpgradesByDeviceResult {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
     */
    readonly firmwareUpgradeBatchIds?: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseOrganizationsGetOrganizationFirmwareUpgradesByDevice
     */
    readonly items: outputs.organizations.GetFirmwareUpgradesByDeviceItem[];
    /**
     * macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
     */
    readonly macs?: string[];
    /**
     * networkIds query parameter. Optional parameter to filter by network
     */
    readonly networkIds?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     */
    readonly perPage?: number;
    /**
     * serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
     */
    readonly serials?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly startingAfter?: string;
    /**
     * upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
     */
    readonly upgradestatuses?: string[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getFirmwareUpgradesByDevice({
 *     endingBefore: "string",
 *     firmwareUpgradeBatchIds: ["string"],
 *     macs: ["string"],
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     perPage: 1,
 *     serials: ["string"],
 *     startingAfter: "string",
 *     upgradestatuses: ["string"],
 * });
 * export const merakiOrganizationsFirmwareUpgradesByDeviceExample = example.then(example => example.items);
 * ```
 */
export function getFirmwareUpgradesByDeviceOutput(args: GetFirmwareUpgradesByDeviceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFirmwareUpgradesByDeviceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:organizations/getFirmwareUpgradesByDevice:getFirmwareUpgradesByDevice", {
        "endingBefore": args.endingBefore,
        "firmwareUpgradeBatchIds": args.firmwareUpgradeBatchIds,
        "macs": args.macs,
        "networkIds": args.networkIds,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "serials": args.serials,
        "startingAfter": args.startingAfter,
        "upgradestatuses": args.upgradestatuses,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirmwareUpgradesByDevice.
 */
export interface GetFirmwareUpgradesByDeviceOutputArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
     */
    firmwareUpgradeBatchIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
     */
    macs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * networkIds query parameter. Optional parameter to filter by network
     */
    networkIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     */
    perPage?: pulumi.Input<number>;
    /**
     * serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
     */
    serials?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
    /**
     * upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
     */
    upgradestatuses?: pulumi.Input<pulumi.Input<string>[]>;
}
