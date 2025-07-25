// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getWirelessSsidsIdentityPsks(args?: GetWirelessSsidsIdentityPsksArgs, opts?: pulumi.InvokeOptions): Promise<GetWirelessSsidsIdentityPsksResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getWirelessSsidsIdentityPsks:getWirelessSsidsIdentityPsks", {
        "identityPskId": args.identityPskId,
        "networkId": args.networkId,
        "number": args.number,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessSsidsIdentityPsks.
 */
export interface GetWirelessSsidsIdentityPsksArgs {
    /**
     * identityPskId path parameter. Identity psk ID
     */
    identityPskId?: string;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
    /**
     * number path parameter.
     */
    number?: string;
}

/**
 * A collection of values returned by getWirelessSsidsIdentityPsks.
 */
export interface GetWirelessSsidsIdentityPsksResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * identityPskId path parameter. Identity psk ID
     */
    readonly identityPskId?: string;
    readonly item: outputs.networks.GetWirelessSsidsIdentityPsksItem;
    /**
     * Array of ResponseWirelessGetNetworkWirelessSsidIdentityPsks
     */
    readonly items: outputs.networks.GetWirelessSsidsIdentityPsksItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
    /**
     * number path parameter.
     */
    readonly number?: string;
}
/**
 * ## Example Usage
 */
export function getWirelessSsidsIdentityPsksOutput(args?: GetWirelessSsidsIdentityPsksOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWirelessSsidsIdentityPsksResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("meraki:networks/getWirelessSsidsIdentityPsks:getWirelessSsidsIdentityPsks", {
        "identityPskId": args.identityPskId,
        "networkId": args.networkId,
        "number": args.number,
    }, opts);
}

/**
 * A collection of arguments for invoking getWirelessSsidsIdentityPsks.
 */
export interface GetWirelessSsidsIdentityPsksOutputArgs {
    /**
     * identityPskId path parameter. Identity psk ID
     */
    identityPskId?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * number path parameter.
     */
    number?: pulumi.Input<string>;
}
