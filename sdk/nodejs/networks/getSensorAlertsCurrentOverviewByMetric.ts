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
 * const example = meraki.networks.getSensorAlertsCurrentOverviewByMetric({
 *     networkId: "string",
 * });
 * export const merakiNetworksSensorAlertsCurrentOverviewByMetricExample = example.then(example => example.item);
 * ```
 */
export function getSensorAlertsCurrentOverviewByMetric(args: GetSensorAlertsCurrentOverviewByMetricArgs, opts?: pulumi.InvokeOptions): Promise<GetSensorAlertsCurrentOverviewByMetricResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:networks/getSensorAlertsCurrentOverviewByMetric:getSensorAlertsCurrentOverviewByMetric", {
        "networkId": args.networkId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSensorAlertsCurrentOverviewByMetric.
 */
export interface GetSensorAlertsCurrentOverviewByMetricArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: string;
}

/**
 * A collection of values returned by getSensorAlertsCurrentOverviewByMetric.
 */
export interface GetSensorAlertsCurrentOverviewByMetricResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.networks.GetSensorAlertsCurrentOverviewByMetricItem;
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
 * const example = meraki.networks.getSensorAlertsCurrentOverviewByMetric({
 *     networkId: "string",
 * });
 * export const merakiNetworksSensorAlertsCurrentOverviewByMetricExample = example.then(example => example.item);
 * ```
 */
export function getSensorAlertsCurrentOverviewByMetricOutput(args: GetSensorAlertsCurrentOverviewByMetricOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSensorAlertsCurrentOverviewByMetricResult> {
    return pulumi.output(args).apply((a: any) => getSensorAlertsCurrentOverviewByMetric(a, opts))
}

/**
 * A collection of arguments for invoking getSensorAlertsCurrentOverviewByMetric.
 */
export interface GetSensorAlertsCurrentOverviewByMetricOutputArgs {
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}