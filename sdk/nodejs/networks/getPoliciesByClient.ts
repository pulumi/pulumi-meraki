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
 * const example = meraki.networks.getPoliciesByClient({
 *     endingBefore: "string",
 *     networkId: "string",
 *     perPage: 1,
 *     startingAfter: "string",
 *     t0: "string",
 *     timespan: 1,
 * });
 * export const merakiNetworksPoliciesByClientExample = example.then(example => example.items);
 * ```
 */
export function getPoliciesByClient(args: GetPoliciesByClientArgs, opts?: pulumi.InvokeOptions): Promise<GetPoliciesByClientResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getPoliciesByClient:getPoliciesByClient", {
        "endingBefore": args.endingBefore,
        "networkId": args.networkId,
        "perPage": args.perPage,
        "startingAfter": args.startingAfter,
        "t0": args.t0,
        "timespan": args.timespan,
    }, opts);
}

/**
 * A collection of arguments for invoking getPoliciesByClient.
 */
export interface GetPoliciesByClientArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     */
    perPage?: number;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    t0?: string;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     */
    timespan?: number;
}

/**
 * A collection of values returned by getPoliciesByClient.
 */
export interface GetPoliciesByClientResult {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseNetworksGetNetworkPoliciesByClient
     */
    readonly items: outputs.networks.GetPoliciesByClientItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     */
    readonly perPage?: number;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly startingAfter?: string;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    readonly t0?: string;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
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
 * const example = meraki.networks.getPoliciesByClient({
 *     endingBefore: "string",
 *     networkId: "string",
 *     perPage: 1,
 *     startingAfter: "string",
 *     t0: "string",
 *     timespan: 1,
 * });
 * export const merakiNetworksPoliciesByClientExample = example.then(example => example.items);
 * ```
 */
export function getPoliciesByClientOutput(args: GetPoliciesByClientOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPoliciesByClientResult> {
    return pulumi.output(args).apply((a: any) => getPoliciesByClient(a, opts))
}

/**
 * A collection of arguments for invoking getPoliciesByClient.
 */
export interface GetPoliciesByClientOutputArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
     */
    perPage?: pulumi.Input<number>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
    /**
     * t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
     */
    t0?: pulumi.Input<string>;
    /**
     * timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameter t0. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
     */
    timespan?: pulumi.Input<number>;
}