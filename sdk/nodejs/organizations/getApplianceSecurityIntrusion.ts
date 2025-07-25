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
 * const example = meraki.organizations.getApplianceSecurityIntrusion({
 *     organizationId: "string",
 * });
 * export const merakiOrganizationsApplianceSecurityIntrusionExample = example.then(example => example.item);
 * ```
 */
export function getApplianceSecurityIntrusion(args: GetApplianceSecurityIntrusionArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceSecurityIntrusionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getApplianceSecurityIntrusion:getApplianceSecurityIntrusion", {
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceSecurityIntrusion.
 */
export interface GetApplianceSecurityIntrusionArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: string;
}

/**
 * A collection of values returned by getApplianceSecurityIntrusion.
 */
export interface GetApplianceSecurityIntrusionResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetApplianceSecurityIntrusionItem;
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
 * const example = meraki.organizations.getApplianceSecurityIntrusion({
 *     organizationId: "string",
 * });
 * export const merakiOrganizationsApplianceSecurityIntrusionExample = example.then(example => example.item);
 * ```
 */
export function getApplianceSecurityIntrusionOutput(args: GetApplianceSecurityIntrusionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApplianceSecurityIntrusionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:organizations/getApplianceSecurityIntrusion:getApplianceSecurityIntrusion", {
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceSecurityIntrusion.
 */
export interface GetApplianceSecurityIntrusionOutputArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
}
