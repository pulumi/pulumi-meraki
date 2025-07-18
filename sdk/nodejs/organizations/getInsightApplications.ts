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
 * const example = meraki.organizations.getInsightApplications({
 *     organizationId: "string",
 * });
 * export const merakiOrganizationsInsightApplicationsExample = example.then(example => example.items);
 * ```
 */
export function getInsightApplications(args: GetInsightApplicationsArgs, opts?: pulumi.InvokeOptions): Promise<GetInsightApplicationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getInsightApplications:getInsightApplications", {
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInsightApplications.
 */
export interface GetInsightApplicationsArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
}

/**
 * A collection of values returned by getInsightApplications.
 */
export interface GetInsightApplicationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseInsightGetOrganizationInsightApplications
     */
    readonly items: outputs.organizations.GetInsightApplicationsItem[];
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
 * const example = meraki.organizations.getInsightApplications({
 *     organizationId: "string",
 * });
 * export const merakiOrganizationsInsightApplicationsExample = example.then(example => example.items);
 * ```
 */
export function getInsightApplicationsOutput(args: GetInsightApplicationsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInsightApplicationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:organizations/getInsightApplications:getInsightApplications", {
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInsightApplications.
 */
export interface GetInsightApplicationsOutputArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
}
