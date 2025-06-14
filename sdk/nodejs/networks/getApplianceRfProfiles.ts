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
 * const example = meraki.networks.getApplianceRfProfiles({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceRfProfilesExample = example.then(example => example.item);
 * ```
 */
export function getApplianceRfProfiles(args?: GetApplianceRfProfilesArgs, opts?: pulumi.InvokeOptions): Promise<GetApplianceRfProfilesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getApplianceRfProfiles:getApplianceRfProfiles", {
        "networkId": args.networkId,
        "rfProfileId": args.rfProfileId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceRfProfiles.
 */
export interface GetApplianceRfProfilesArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
    /**
     * rfProfileId path parameter. Rf profile ID
     */
    rfProfileId?: string;
}

/**
 * A collection of values returned by getApplianceRfProfiles.
 */
export interface GetApplianceRfProfilesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetApplianceRfProfilesItem;
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
    /**
     * rfProfileId path parameter. Rf profile ID
     */
    readonly rfProfileId?: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = meraki.networks.getApplianceRfProfiles({
 *     networkId: "string",
 * });
 * export const merakiNetworksApplianceRfProfilesExample = example.then(example => example.item);
 * ```
 */
export function getApplianceRfProfilesOutput(args?: GetApplianceRfProfilesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApplianceRfProfilesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getApplianceRfProfiles:getApplianceRfProfiles", {
        "networkId": args.networkId,
        "rfProfileId": args.rfProfileId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplianceRfProfiles.
 */
export interface GetApplianceRfProfilesOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * rfProfileId path parameter. Rf profile ID
     */
    rfProfileId?: pulumi.Input<string>;
}
