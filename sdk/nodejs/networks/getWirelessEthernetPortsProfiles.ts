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
 * const example = meraki.networks.getWirelessEthernetPortsProfiles({
 *     networkId: "string",
 *     profileId: "string",
 * });
 * export const merakiNetworksWirelessEthernetPortsProfilesExample = example.then(example => example.item);
 * ```
 */
export function getWirelessEthernetPortsProfiles(args: GetWirelessEthernetPortsProfilesArgs, opts?: pulumi.InvokeOptions): Promise<GetWirelessEthernetPortsProfilesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getWirelessEthernetPortsProfiles:getWirelessEthernetPortsProfiles", {
        "networkId": args.networkId,
        "profileId": args.profileId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessEthernetPortsProfiles.
 */
export interface GetWirelessEthernetPortsProfilesArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
    /**
     * profileId path parameter. Profile ID
     */
    profileId: string;
}

/**
 * A collection of values returned by getWirelessEthernetPortsProfiles.
 */
export interface GetWirelessEthernetPortsProfilesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetWirelessEthernetPortsProfilesItem;
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId: string;
    /**
     * profileId path parameter. Profile ID
     */
    readonly profileId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.networks.getWirelessEthernetPortsProfiles({
 *     networkId: "string",
 *     profileId: "string",
 * });
 * export const merakiNetworksWirelessEthernetPortsProfilesExample = example.then(example => example.item);
 * ```
 */
export function getWirelessEthernetPortsProfilesOutput(args: GetWirelessEthernetPortsProfilesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWirelessEthernetPortsProfilesResult> {
    return pulumi.output(args).apply((a: any) => getWirelessEthernetPortsProfiles(a, opts))
}

/**
 * A collection of arguments for invoking getWirelessEthernetPortsProfiles.
 */
export interface GetWirelessEthernetPortsProfilesOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * profileId path parameter. Profile ID
     */
    profileId: pulumi.Input<string>;
}