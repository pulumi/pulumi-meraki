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
 * const example = meraki.organizations.getAdaptivePolicyOverview({
 *     organizationId: "string",
 * });
 * export const merakiOrganizationsAdaptivePolicyOverviewExample = example.then(example => example.item);
 * ```
 */
export function getAdaptivePolicyOverview(args: GetAdaptivePolicyOverviewArgs, opts?: pulumi.InvokeOptions): Promise<GetAdaptivePolicyOverviewResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getAdaptivePolicyOverview:getAdaptivePolicyOverview", {
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAdaptivePolicyOverview.
 */
export interface GetAdaptivePolicyOverviewArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
}

/**
 * A collection of values returned by getAdaptivePolicyOverview.
 */
export interface GetAdaptivePolicyOverviewResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetAdaptivePolicyOverviewItem;
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.organizations.getAdaptivePolicyOverview({
 *     organizationId: "string",
 * });
 * export const merakiOrganizationsAdaptivePolicyOverviewExample = example.then(example => example.item);
 * ```
 */
export function getAdaptivePolicyOverviewOutput(args: GetAdaptivePolicyOverviewOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAdaptivePolicyOverviewResult> {
    return pulumi.output(args).apply((a: any) => getAdaptivePolicyOverview(a, opts))
}

/**
 * A collection of arguments for invoking getAdaptivePolicyOverview.
 */
export interface GetAdaptivePolicyOverviewOutputArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
}