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
 * const example = meraki.devices.getLiveToolsArpTable({
 *     arpTableId: "string",
 *     serial: "string",
 * });
 * export const merakiDevicesLiveToolsArpTableExample = example.then(example => example.item);
 * ```
 */
export function getLiveToolsArpTable(args: GetLiveToolsArpTableArgs, opts?: pulumi.InvokeOptions): Promise<GetLiveToolsArpTableResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:devices/getLiveToolsArpTable:getLiveToolsArpTable", {
        "arpTableId": args.arpTableId,
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getLiveToolsArpTable.
 */
export interface GetLiveToolsArpTableArgs {
    /**
     * arpTableId path parameter. Arp table ID
     */
    arpTableId: string;
    /**
     * serial path parameter.
     */
    serial: string;
}

/**
 * A collection of values returned by getLiveToolsArpTable.
 */
export interface GetLiveToolsArpTableResult {
    /**
     * arpTableId path parameter. Arp table ID
     */
    readonly arpTableId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.devices.GetLiveToolsArpTableItem;
    /**
     * serial path parameter.
     */
    readonly serial: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.devices.getLiveToolsArpTable({
 *     arpTableId: "string",
 *     serial: "string",
 * });
 * export const merakiDevicesLiveToolsArpTableExample = example.then(example => example.item);
 * ```
 */
export function getLiveToolsArpTableOutput(args: GetLiveToolsArpTableOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLiveToolsArpTableResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:devices/getLiveToolsArpTable:getLiveToolsArpTable", {
        "arpTableId": args.arpTableId,
        "serial": args.serial,
    }, opts);
}

/**
 * A collection of arguments for invoking getLiveToolsArpTable.
 */
export interface GetLiveToolsArpTableOutputArgs {
    /**
     * arpTableId path parameter. Arp table ID
     */
    arpTableId: pulumi.Input<string>;
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
}
