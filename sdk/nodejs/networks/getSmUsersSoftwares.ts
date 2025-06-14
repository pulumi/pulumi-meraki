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
 * const example = meraki.networks.getSmUsersSoftwares({
 *     networkId: "string",
 *     userId: "string",
 * });
 * export const merakiNetworksSmUsersSoftwaresExample = example.then(example => example.items);
 * ```
 */
export function getSmUsersSoftwares(args: GetSmUsersSoftwaresArgs, opts?: pulumi.InvokeOptions): Promise<GetSmUsersSoftwaresResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSmUsersSoftwares:getSmUsersSoftwares", {
        "networkId": args.networkId,
        "userId": args.userId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmUsersSoftwares.
 */
export interface GetSmUsersSoftwaresArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
    /**
     * userId path parameter. User ID
     */
    userId: string;
}

/**
 * A collection of values returned by getSmUsersSoftwares.
 */
export interface GetSmUsersSoftwaresResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of ResponseSmGetNetworkSmUserSoftwares
     */
    readonly items: outputs.networks.GetSmUsersSoftwaresItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId: string;
    /**
     * userId path parameter. User ID
     */
    readonly userId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.networks.getSmUsersSoftwares({
 *     networkId: "string",
 *     userId: "string",
 * });
 * export const merakiNetworksSmUsersSoftwaresExample = example.then(example => example.items);
 * ```
 */
export function getSmUsersSoftwaresOutput(args: GetSmUsersSoftwaresOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSmUsersSoftwaresResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getSmUsersSoftwares:getSmUsersSoftwares", {
        "networkId": args.networkId,
        "userId": args.userId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSmUsersSoftwares.
 */
export interface GetSmUsersSoftwaresOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * userId path parameter. User ID
     */
    userId: pulumi.Input<string>;
}
