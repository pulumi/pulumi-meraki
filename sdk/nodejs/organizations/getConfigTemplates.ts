// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getConfigTemplates(args?: GetConfigTemplatesArgs, opts?: pulumi.InvokeOptions): Promise<GetConfigTemplatesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getConfigTemplates:getConfigTemplates", {
        "configTemplateId": args.configTemplateId,
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getConfigTemplates.
 */
export interface GetConfigTemplatesArgs {
    /**
     * configTemplateId path parameter. Config template ID
     */
    configTemplateId?: string;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: string;
}

/**
 * A collection of values returned by getConfigTemplates.
 */
export interface GetConfigTemplatesResult {
    /**
     * configTemplateId path parameter. Config template ID
     */
    readonly configTemplateId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetConfigTemplatesItem;
    /**
     * Array of ResponseOrganizationsGetOrganizationConfigTemplates
     */
    readonly items: outputs.organizations.GetConfigTemplatesItem[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId?: string;
}
/**
 * ## Example Usage
 */
export function getConfigTemplatesOutput(args?: GetConfigTemplatesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConfigTemplatesResult> {
    return pulumi.output(args).apply((a: any) => getConfigTemplates(a, opts))
}

/**
 * A collection of arguments for invoking getConfigTemplates.
 */
export interface GetConfigTemplatesOutputArgs {
    /**
     * configTemplateId path parameter. Config template ID
     */
    configTemplateId?: pulumi.Input<string>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
}