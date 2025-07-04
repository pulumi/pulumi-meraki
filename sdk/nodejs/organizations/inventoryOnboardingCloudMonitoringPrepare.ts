// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = new meraki.organizations.InventoryOnboardingCloudMonitoringPrepare("example", {
 *     organizationId: "string",
 *     parameters: {
 *         devices: [{
 *             sudi: `          "-----BEGIN CERTIFICATE-----
 *         MIIDyTCCArGgAwIBAgIKBBNXOVCGU1YztjANBgkqhkiG9w0BAQsFADAnMQ4wDAYD
 *         VQQKEwVDaXNjbzEVMBMGA1UEAxMMQUNUMiBTVURJIENBMB4XDTIxMDUzMTEzNTUx
 *         NVoXDTI5MDUxNDIwMjU0MVowbTEpMCcGA1UEBRMgUElEOkM5MjAwTC0yNFAtNEcg
 *         U046SkFFMjUyMjBSMksxDjAMBgNVBAoTBUNpc2NvMRgwFgYDVQQLEw9BQ1QtMiBM
 *         aXRlIFNVREkxFjAUBgNVBAMTDUM5MjAwTC0yNFAtNEcwggEiMA0GCSqGSIb3DQEB
 *         AQUAA4IBDwAwggEKAoIBAQDaUPxW76gT5MdoEAt+UrDFiYA9RYh2iHicDViBEyow
 *         TR1TuP36bHh13X3vtGiDsCD88Ci2TZIqd/EDkkc7v9ipUUYVVH+YDrPt2Aukb1PH
 *         D6K0R+KhgEzRo5x54TlU6oWvjUpwNZUwwdhMWIQaUVkMyZBYNy0jGPLO8jwZhyBg
 *         1Fneybr9pwedGbLrAaz+gdEikB8B4a/fvPjVfL5Ngb4QRjFqWuE+X3nLc0kHedep
 *         6nfgpUNXMlStVm5nIXKP6OjmzfCHPYh9L2Ehs1TrSk1ser9Ofx0ZMVL/jBZR2EIj
 *         OZ8tH6KlX2/B2pbSPIO6kD5c4UA8Cf1SbDJCwJ/kI9ihAgMBAAGjgbAwga0wDgYD
 *         VR0PAQH/BAQDAgXgMAwGA1UdEwEB/wQCMAAwHwYDVR0jBBgwFoAUSNjx8cJw1Vu7
 *         fHMJk6+4uDAD+H8wTQYDVR0RBEYwRKBCBgkrBgEEAQkVAgOgNRMzQ2hpcElEPVVV
 *         VUNNaElGcUVFMklFUUVBQWNBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE9MB0GA1Ud
 *         DgQWBBRdhMkFD/z5hokaQeLbaRsp4hkvbzANBgkqhkiG9w0BAQsFAAOCAQEAMtuh
 *         YpBz4xEZ7YdJsLpw67Q0TTJGnTBRpzAeY1urYDoDz8TSx556XG7z3IRzuED5KVSp
 *         OwmH/iZ+tDfYQ3W3ElWTW93871DkuW4WQIfbnoHg/F7bF0DKYVkD3rpZjyz3NhzH
 *         d7cjTdJXQ85bTAOXDuxKH3qewrXxxOGXgh3I6NUq0UwMTWh84lND7Jl+ZAQkYNS2
 *         iHanTZFQBk3ML0NUb7fKDYGRTZRqwQ/upIO4S6LV1cxH/6V0qbMy3sCSHZoMLrW3
 *         0m3M6yKpe5+VZzHZwmWdUf3Ot+zKjhveK5/YNsMIASdvtvymxUizq2Hr1hvR/kPc
 *         p1vuyWxipU8JfzOh/A==
 *         -----END CERTIFICATE-----
 *         "
 * `,
 *             tunnel: {
 *                 certificateName: "DeviceSUDI",
 *                 localInterface: 1,
 *                 loopbackNumber: 1000,
 *                 name: "MERAKI",
 *             },
 *             user: {
 *                 username: "Meraki",
 *             },
 *             vty: {
 *                 accessList: {
 *                     vtyIn: {
 *                         name: "MERAKI_IN",
 *                     },
 *                     vtyOut: {
 *                         name: "MERAKI_OUT",
 *                     },
 *                 },
 *                 authentication: {
 *                     group: {
 *                         name: "",
 *                     },
 *                 },
 *                 authorization: {
 *                     group: {
 *                         name: "MERAKI",
 *                     },
 *                 },
 *                 endLineNumber: 17,
 *                 rotaryNumber: 50,
 *                 startLineNumber: 16,
 *             },
 *         }],
 *     },
 * });
 * export const merakiOrganizationsInventoryOnboardingCloudMonitoringPrepareExample = example;
 * ```
 */
export class InventoryOnboardingCloudMonitoringPrepare extends pulumi.CustomResource {
    /**
     * Get an existing InventoryOnboardingCloudMonitoringPrepare resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InventoryOnboardingCloudMonitoringPrepareState, opts?: pulumi.CustomResourceOptions): InventoryOnboardingCloudMonitoringPrepare {
        return new InventoryOnboardingCloudMonitoringPrepare(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:organizations/inventoryOnboardingCloudMonitoringPrepare:InventoryOnboardingCloudMonitoringPrepare';

    /**
     * Returns true if the given object is an instance of InventoryOnboardingCloudMonitoringPrepare.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InventoryOnboardingCloudMonitoringPrepare {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InventoryOnboardingCloudMonitoringPrepare.__pulumiType;
    }

    /**
     * Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringPrepare
     */
    public /*out*/ readonly items!: pulumi.Output<outputs.organizations.InventoryOnboardingCloudMonitoringPrepareItem[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    public readonly organizationId!: pulumi.Output<string>;
    public readonly parameters!: pulumi.Output<outputs.organizations.InventoryOnboardingCloudMonitoringPrepareParameters>;

    /**
     * Create a InventoryOnboardingCloudMonitoringPrepare resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InventoryOnboardingCloudMonitoringPrepareArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InventoryOnboardingCloudMonitoringPrepareArgs | InventoryOnboardingCloudMonitoringPrepareState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InventoryOnboardingCloudMonitoringPrepareState | undefined;
            resourceInputs["items"] = state ? state.items : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
        } else {
            const args = argsOrState as InventoryOnboardingCloudMonitoringPrepareArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            if ((!args || args.parameters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parameters'");
            }
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["items"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InventoryOnboardingCloudMonitoringPrepare.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InventoryOnboardingCloudMonitoringPrepare resources.
 */
export interface InventoryOnboardingCloudMonitoringPrepareState {
    /**
     * Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringPrepare
     */
    items?: pulumi.Input<pulumi.Input<inputs.organizations.InventoryOnboardingCloudMonitoringPrepareItem>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
    parameters?: pulumi.Input<inputs.organizations.InventoryOnboardingCloudMonitoringPrepareParameters>;
}

/**
 * The set of arguments for constructing a InventoryOnboardingCloudMonitoringPrepare resource.
 */
export interface InventoryOnboardingCloudMonitoringPrepareArgs {
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId: pulumi.Input<string>;
    parameters: pulumi.Input<inputs.organizations.InventoryOnboardingCloudMonitoringPrepareParameters>;
}
