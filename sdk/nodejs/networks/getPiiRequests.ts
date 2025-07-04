// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getPiiRequests(args?: GetPiiRequestsArgs, opts?: pulumi.InvokeOptions): Promise<GetPiiRequestsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getPiiRequests:getPiiRequests", {
        "networkId": args.networkId,
        "requestId": args.requestId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPiiRequests.
 */
export interface GetPiiRequestsArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
    /**
     * requestId path parameter. Request ID
     */
    requestId?: string;
}

/**
 * A collection of values returned by getPiiRequests.
 */
export interface GetPiiRequestsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetPiiRequestsItem;
    /**
     * Array of ResponseNetworksGetNetworkPiiRequests
     */
    readonly items: outputs.networks.GetPiiRequestsItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
    /**
     * requestId path parameter. Request ID
     */
    readonly requestId?: string;
}
/**
 * ## Example Usage
 */
export function getPiiRequestsOutput(args?: GetPiiRequestsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPiiRequestsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getPiiRequests:getPiiRequests", {
        "networkId": args.networkId,
        "requestId": args.requestId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPiiRequests.
 */
export interface GetPiiRequestsOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * requestId path parameter. Request ID
     */
    requestId?: pulumi.Input<string>;
}
