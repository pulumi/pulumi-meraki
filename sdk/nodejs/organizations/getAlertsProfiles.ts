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
 * const example = meraki.organizations.getAlertsProfiles({
 *     organizationId: "string",
 * });
 * export const merakiOrganizationsAlertsProfilesExample = example.then(example => example.items);
 * ```
 */
export function getAlertsProfiles(args: GetAlertsProfilesArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertsProfilesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getAlertsProfiles:getAlertsProfiles", {
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertsProfiles.
 */
export interface GetAlertsProfilesArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
}

/**
 * A collection of values returned by getAlertsProfiles.
 */
export interface GetAlertsProfilesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseOrganizationsGetOrganizationAlertsProfiles
     */
    readonly items: outputs.organizations.GetAlertsProfilesItem[];
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
 * const example = meraki.organizations.getAlertsProfiles({
 *     organizationId: "string",
 * });
 * export const merakiOrganizationsAlertsProfilesExample = example.then(example => example.items);
 * ```
 */
export function getAlertsProfilesOutput(args: GetAlertsProfilesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAlertsProfilesResult> {
    return pulumi.output(args).apply((a: any) => getAlertsProfiles(a, opts))
}

/**
 * A collection of arguments for invoking getAlertsProfiles.
 */
export interface GetAlertsProfilesOutputArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
}