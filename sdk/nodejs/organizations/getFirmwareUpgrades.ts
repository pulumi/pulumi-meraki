// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
 * const example = meraki.organizations.getFirmwareUpgrades({
 *     endingBefore: "string",
 *     organizationId: "string",
 *     perPage: 1,
 *     productTypes: ["string"],
 *     startingAfter: "string",
 *     statuses: ["string"],
 * });
 * export const merakiOrganizationsFirmwareUpgradesExample = example.then(example => example.items);
 * ```
 */
export function getFirmwareUpgrades(args: GetFirmwareUpgradesArgs, opts?: pulumi.InvokeOptions): Promise<GetFirmwareUpgradesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getFirmwareUpgrades:getFirmwareUpgrades", {
        "endingBefore": args.endingBefore,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "productTypes": args.productTypes,
        "startingAfter": args.startingAfter,
        "statuses": args.statuses,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirmwareUpgrades.
 */
export interface GetFirmwareUpgradesArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: number;
    /**
     * productTypes query parameter. Optional parameter to filter the upgrade by product type.
     */
    productTypes?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
    /**
     * status query parameter. Optional parameter to filter the upgrade by status.
     */
    statuses?: string[];
}

/**
 * A collection of values returned by getFirmwareUpgrades.
 */
export interface GetFirmwareUpgradesResult {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseOrganizationsGetOrganizationFirmwareUpgrades
     */
    readonly items: outputs.organizations.GetFirmwareUpgradesItem[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    readonly perPage?: number;
    /**
     * productTypes query parameter. Optional parameter to filter the upgrade by product type.
     */
    readonly productTypes?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly startingAfter?: string;
    /**
     * status query parameter. Optional parameter to filter the upgrade by status.
     */
    readonly statuses?: string[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getFirmwareUpgrades({
 *     endingBefore: "string",
 *     organizationId: "string",
 *     perPage: 1,
 *     productTypes: ["string"],
 *     startingAfter: "string",
 *     statuses: ["string"],
 * });
 * export const merakiOrganizationsFirmwareUpgradesExample = example.then(example => example.items);
 * ```
 */
export function getFirmwareUpgradesOutput(args: GetFirmwareUpgradesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFirmwareUpgradesResult> {
    return pulumi.output(args).apply((a: any) => getFirmwareUpgrades(a, opts))
}

/**
 * A collection of arguments for invoking getFirmwareUpgrades.
 */
export interface GetFirmwareUpgradesOutputArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: pulumi.Input<number>;
    /**
     * productTypes query parameter. Optional parameter to filter the upgrade by product type.
     */
    productTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
    /**
     * status query parameter. Optional parameter to filter the upgrade by status.
     */
    statuses?: pulumi.Input<pulumi.Input<string>[]>;
}