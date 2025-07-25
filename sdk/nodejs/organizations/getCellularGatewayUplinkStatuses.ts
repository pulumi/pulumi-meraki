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
 * const example = meraki.organizations.getCellularGatewayUplinkStatuses({
 *     endingBefore: "string",
 *     iccids: ["string"],
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     perPage: 1,
 *     serials: ["string"],
 *     startingAfter: "string",
 * });
 * export const merakiOrganizationsCellularGatewayUplinkStatusesExample = example.then(example => example.items);
 * ```
 */
export function getCellularGatewayUplinkStatuses(args: GetCellularGatewayUplinkStatusesArgs, opts?: pulumi.InvokeOptions): Promise<GetCellularGatewayUplinkStatusesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getCellularGatewayUplinkStatuses:getCellularGatewayUplinkStatuses", {
        "endingBefore": args.endingBefore,
        "iccids": args.iccids,
        "networkIds": args.networkIds,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "serials": args.serials,
        "startingAfter": args.startingAfter,
    }, opts);
}

/**
 * A collection of arguments for invoking getCellularGatewayUplinkStatuses.
 */
export interface GetCellularGatewayUplinkStatusesArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
     */
    iccids?: string[];
    /**
     * networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
     */
    networkIds?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: number;
    /**
     * serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
     */
    serials?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
}

/**
 * A collection of values returned by getCellularGatewayUplinkStatuses.
 */
export interface GetCellularGatewayUplinkStatusesResult {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
     */
    readonly iccids?: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseCellularGatewayGetOrganizationCellularGatewayUplinkStatuses
     */
    readonly items: outputs.organizations.GetCellularGatewayUplinkStatusesItem[];
    /**
     * networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
     */
    readonly networkIds?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    readonly perPage?: number;
    /**
     * serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
     */
    readonly serials?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly startingAfter?: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getCellularGatewayUplinkStatuses({
 *     endingBefore: "string",
 *     iccids: ["string"],
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     perPage: 1,
 *     serials: ["string"],
 *     startingAfter: "string",
 * });
 * export const merakiOrganizationsCellularGatewayUplinkStatusesExample = example.then(example => example.items);
 * ```
 */
export function getCellularGatewayUplinkStatusesOutput(args: GetCellularGatewayUplinkStatusesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCellularGatewayUplinkStatusesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:organizations/getCellularGatewayUplinkStatuses:getCellularGatewayUplinkStatuses", {
        "endingBefore": args.endingBefore,
        "iccids": args.iccids,
        "networkIds": args.networkIds,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "serials": args.serials,
        "startingAfter": args.startingAfter,
    }, opts);
}

/**
 * A collection of arguments for invoking getCellularGatewayUplinkStatuses.
 */
export interface GetCellularGatewayUplinkStatusesOutputArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * iccids query parameter. A list of ICCIDs. The returned devices will be filtered to only include these ICCIDs.
     */
    iccids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * networkIds query parameter. A list of network IDs. The returned devices will be filtered to only include these networks.
     */
    networkIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: pulumi.Input<number>;
    /**
     * serials query parameter. A list of serial numbers. The returned devices will be filtered to only include these serials.
     */
    serials?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
}
