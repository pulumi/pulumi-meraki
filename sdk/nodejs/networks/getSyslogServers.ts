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
 * const example = meraki.networks.getSyslogServers({
 *     networkId: "string",
 * });
 * export const merakiNetworksSyslogServersExample = example.then(example => example.item);
 * ```
 */
export function getSyslogServers(args: GetSyslogServersArgs, opts?: pulumi.InvokeOptions): Promise<GetSyslogServersResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSyslogServers:getSyslogServers", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSyslogServers.
 */
export interface GetSyslogServersArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getSyslogServers.
 */
export interface GetSyslogServersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetSyslogServersItem;
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.networks.getSyslogServers({
 *     networkId: "string",
 * });
 * export const merakiNetworksSyslogServersExample = example.then(example => example.item);
 * ```
 */
export function getSyslogServersOutput(args: GetSyslogServersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSyslogServersResult> {
    return pulumi.output(args).apply((a: any) => getSyslogServers(a, opts))
}

/**
 * A collection of arguments for invoking getSyslogServers.
 */
export interface GetSyslogServersOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}