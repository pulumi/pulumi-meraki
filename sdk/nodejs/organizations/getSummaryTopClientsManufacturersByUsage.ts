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
 * const example = meraki.organizations.getSummaryTopClientsManufacturersByUsage({
 *     organizationId: "string",
 *     t0: "string",
 *     t1: "string",
 *     timespan: 1,
 * });
 * export const merakiOrganizationsSummaryTopClientsManufacturersByUsageExample = example.then(example => example.items);
 * ```
 */
export function getSummaryTopClientsManufacturersByUsage(args: GetSummaryTopClientsManufacturersByUsageArgs, opts?: pulumi.InvokeOptions): Promise<GetSummaryTopClientsManufacturersByUsageResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getSummaryTopClientsManufacturersByUsage:getSummaryTopClientsManufacturersByUsage", {
        "organizationId": args.organizationId,
        "t0": args.t0,
        "t1": args.t1,
        "timespan": args.timespan,
    }, opts);
}

/**
 * A collection of arguments for invoking getSummaryTopClientsManufacturersByUsage.
 */
export interface GetSummaryTopClientsManufacturersByUsageArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
    /**
     * t0 query parameter. The beginning of the timespan for the data.
     */
    t0?: string;
    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     */
    t1?: string;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     */
    timespan?: number;
}

/**
 * A collection of values returned by getSummaryTopClientsManufacturersByUsage.
 */
export interface GetSummaryTopClientsManufacturersByUsageResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseOrganizationsGetOrganizationSummaryTopClientsManufacturersByUsage
     */
    readonly items: outputs.organizations.GetSummaryTopClientsManufacturersByUsageItem[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
    /**
     * t0 query parameter. The beginning of the timespan for the data.
     */
    readonly t0?: string;
    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     */
    readonly t1?: string;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     */
    readonly timespan?: number;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getSummaryTopClientsManufacturersByUsage({
 *     organizationId: "string",
 *     t0: "string",
 *     t1: "string",
 *     timespan: 1,
 * });
 * export const merakiOrganizationsSummaryTopClientsManufacturersByUsageExample = example.then(example => example.items);
 * ```
 */
export function getSummaryTopClientsManufacturersByUsageOutput(args: GetSummaryTopClientsManufacturersByUsageOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSummaryTopClientsManufacturersByUsageResult> {
    return pulumi.output(args).apply((a: any) => getSummaryTopClientsManufacturersByUsage(a, opts))
}

/**
 * A collection of arguments for invoking getSummaryTopClientsManufacturersByUsage.
 */
export interface GetSummaryTopClientsManufacturersByUsageOutputArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    /**
     * t0 query parameter. The beginning of the timespan for the data.
     */
    t0?: pulumi.Input<string>;
    /**
     * t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
     */
    t1?: pulumi.Input<string>;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     */
    timespan?: pulumi.Input<number>;
}