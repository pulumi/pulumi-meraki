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
 * const example = meraki.organizations.getDevicesStatusesOverview({
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     productTypes: ["string"],
 * });
 * export const merakiOrganizationsDevicesStatusesOverviewExample = example.then(example => example.item);
 * ```
 */
export function getDevicesStatusesOverview(args: GetDevicesStatusesOverviewArgs, opts?: pulumi.InvokeOptions): Promise<GetDevicesStatusesOverviewResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getDevicesStatusesOverview:getDevicesStatusesOverview", {
        "networkIds": args.networkIds,
        "organizationId": args.organizationId,
        "productTypes": args.productTypes,
    }, opts);
}

/**
 * A collection of arguments for invoking getDevicesStatusesOverview.
 */
export interface GetDevicesStatusesOverviewArgs {
    /**
     * networkIds query parameter. An optional parameter to filter device statuses by network.
     */
    networkIds?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
    /**
     * productTypes query parameter. An optional parameter to filter device statuses by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
     */
    productTypes?: string[];
}

/**
 * A collection of values returned by getDevicesStatusesOverview.
 */
export interface GetDevicesStatusesOverviewResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetDevicesStatusesOverviewItem;
    /**
     * networkIds query parameter. An optional parameter to filter device statuses by network.
     */
    readonly networkIds?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
    /**
     * productTypes query parameter. An optional parameter to filter device statuses by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
     */
    readonly productTypes?: string[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getDevicesStatusesOverview({
 *     networkIds: ["string"],
 *     organizationId: "string",
 *     productTypes: ["string"],
 * });
 * export const merakiOrganizationsDevicesStatusesOverviewExample = example.then(example => example.item);
 * ```
 */
export function getDevicesStatusesOverviewOutput(args: GetDevicesStatusesOverviewOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDevicesStatusesOverviewResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:organizations/getDevicesStatusesOverview:getDevicesStatusesOverview", {
        "networkIds": args.networkIds,
        "organizationId": args.organizationId,
        "productTypes": args.productTypes,
    }, opts);
}

/**
 * A collection of arguments for invoking getDevicesStatusesOverview.
 */
export interface GetDevicesStatusesOverviewOutputArgs {
    /**
     * networkIds query parameter. An optional parameter to filter device statuses by network.
     */
    networkIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * productTypes query parameter. An optional parameter to filter device statuses by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
     */
    productTypes?: pulumi.Input<pulumi.Input<string>[]>;
}
