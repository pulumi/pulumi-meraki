// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getSensorAlertsProfiles(args?: GetSensorAlertsProfilesArgs, opts?: pulumi.InvokeOptions): Promise<GetSensorAlertsProfilesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSensorAlertsProfiles:getSensorAlertsProfiles", {
        "id": args.id,
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSensorAlertsProfiles.
 */
export interface GetSensorAlertsProfilesArgs {
    /**
     * id path parameter.
     */
    id?: string;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: string;
}

/**
 * A collection of values returned by getSensorAlertsProfiles.
 */
export interface GetSensorAlertsProfilesResult {
    /**
     * id path parameter.
     */
    readonly id?: string;
    readonly item: outputs.networks.GetSensorAlertsProfilesItem;
    /**
     * Array of ResponseSensorGetNetworkSensorAlertsProfiles
     */
    readonly items: outputs.networks.GetSensorAlertsProfilesItem[];
    /**
     * networkId path parameter. Network ID
     */
    readonly networkId?: string;
}
/**
 * ## Example Usage
 */
export function getSensorAlertsProfilesOutput(args?: GetSensorAlertsProfilesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSensorAlertsProfilesResult> {
    return pulumi.output(args).apply((a: any) => getSensorAlertsProfiles(a, opts))
}

/**
 * A collection of arguments for invoking getSensorAlertsProfiles.
 */
export interface GetSensorAlertsProfilesOutputArgs {
    /**
     * id path parameter.
     */
    id?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
}