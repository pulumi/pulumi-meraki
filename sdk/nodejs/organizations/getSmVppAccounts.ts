// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getSmVppAccounts(args?: GetSmVppAccountsArgs, opts?: pulumi.InvokeOptions): Promise<GetSmVppAccountsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getSmVppAccounts:getSmVppAccounts", {
        "organizationId": args.organizationId,
        "vppAccountId": args.vppAccountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmVppAccounts.
 */
export interface GetSmVppAccountsArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: string;
    /**
     * vppAccountId path parameter. Vpp account ID
     */
    vppAccountId?: string;
}

/**
 * A collection of values returned by getSmVppAccounts.
 */
export interface GetSmVppAccountsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetSmVppAccountsItem;
    /**
     * Array of ResponseSmGetOrganizationSmVppAccounts
     */
    readonly items: outputs.organizations.GetSmVppAccountsItem[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId?: string;
    /**
     * vppAccountId path parameter. Vpp account ID
     */
    readonly vppAccountId?: string;
}
/**
 * ## Example Usage
 */
export function getSmVppAccountsOutput(args?: GetSmVppAccountsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSmVppAccountsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:organizations/getSmVppAccounts:getSmVppAccounts", {
        "organizationId": args.organizationId,
        "vppAccountId": args.vppAccountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmVppAccounts.
 */
export interface GetSmVppAccountsOutputArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
    /**
     * vppAccountId path parameter. Vpp account ID
     */
    vppAccountId?: pulumi.Input<string>;
}
