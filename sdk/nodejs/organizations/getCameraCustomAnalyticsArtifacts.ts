// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getCameraCustomAnalyticsArtifacts(args?: GetCameraCustomAnalyticsArtifactsArgs, opts?: pulumi.InvokeOptions): Promise<GetCameraCustomAnalyticsArtifactsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getCameraCustomAnalyticsArtifacts:getCameraCustomAnalyticsArtifacts", {
        "artifactId": args.artifactId,
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCameraCustomAnalyticsArtifacts.
 */
export interface GetCameraCustomAnalyticsArtifactsArgs {
    /**
     * artifactId path parameter. Artifact ID
     */
    artifactId?: string;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: string;
}

/**
 * A collection of values returned by getCameraCustomAnalyticsArtifacts.
 */
export interface GetCameraCustomAnalyticsArtifactsResult {
    /**
     * artifactId path parameter. Artifact ID
     */
    readonly artifactId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetCameraCustomAnalyticsArtifactsItem;
    /**
     * Array of ResponseCameraGetOrganizationCameraCustomAnalyticsArtifacts
     */
    readonly items: outputs.organizations.GetCameraCustomAnalyticsArtifactsItem[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId?: string;
}
/**
 * ## Example Usage
 */
export function getCameraCustomAnalyticsArtifactsOutput(args?: GetCameraCustomAnalyticsArtifactsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCameraCustomAnalyticsArtifactsResult> {
    return pulumi.output(args).apply((a: any) => getCameraCustomAnalyticsArtifacts(a, opts))
}

/**
 * A collection of arguments for invoking getCameraCustomAnalyticsArtifacts.
 */
export interface GetCameraCustomAnalyticsArtifactsOutputArgs {
    /**
     * artifactId path parameter. Artifact ID
     */
    artifactId?: pulumi.Input<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
}