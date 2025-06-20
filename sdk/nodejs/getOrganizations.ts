// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 */
export function getOrganizations(args?: GetOrganizationsArgs, opts?: pulumi.InvokeOptions): Promise<GetOrganizationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:index/getOrganizations:getOrganizations", {
        "endingBefore": args.endingBefore,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "startingAfter": args.startingAfter,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganizations.
 */
export interface GetOrganizationsArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 9000. Default is 9000.
     */
    perPage?: number;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
}

/**
 * A collection of values returned by getOrganizations.
 */
export interface GetOrganizationsResult {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.GetOrganizationsItem;
    /**
     * Array of ResponseOrganizationsGetOrganizations
     */
    readonly items: outputs.GetOrganizationsItem[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId?: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 9000. Default is 9000.
     */
    readonly perPage?: number;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly startingAfter?: string;
}
/**
 * ## Example Usage
 */
export function getOrganizationsOutput(args?: GetOrganizationsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetOrganizationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:index/getOrganizations:getOrganizations", {
        "endingBefore": args.endingBefore,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "startingAfter": args.startingAfter,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganizations.
 */
export interface GetOrganizationsOutputArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 9000. Default is 9000.
     */
    perPage?: pulumi.Input<number>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
}
