// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as meraki from "@pulumi/meraki";
 *
 * const example = new meraki.networks.CellularGatewayDhcp("example", {
 *     dhcpLeaseTime: "1 hour",
 *     dnsCustomNameservers: [
 *         "172.16.2.111",
 *         "172.16.2.30",
 *     ],
 *     dnsNameservers: "custom",
 *     networkId: "string",
 * });
 * export const merakiNetworksCellularGatewayDhcpExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/cellularGatewayDhcp:CellularGatewayDhcp example "network_id"
 * ```
 */
export class CellularGatewayDhcp extends pulumi.CustomResource {
    /**
     * Get an existing CellularGatewayDhcp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CellularGatewayDhcpState, opts?: pulumi.CustomResourceOptions): CellularGatewayDhcp {
        return new CellularGatewayDhcp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/cellularGatewayDhcp:CellularGatewayDhcp';

    /**
     * Returns true if the given object is an instance of CellularGatewayDhcp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CellularGatewayDhcp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CellularGatewayDhcp.__pulumiType;
    }

    /**
     * DHCP Lease time for all MG in the network.
     */
    public readonly dhcpLeaseTime!: pulumi.Output<string>;
    /**
     * List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
     */
    public readonly dnsCustomNameservers!: pulumi.Output<string[]>;
    /**
     * DNS name servers mode for all MG in the network.
     */
    public readonly dnsNameservers!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;

    /**
     * Create a CellularGatewayDhcp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CellularGatewayDhcpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CellularGatewayDhcpArgs | CellularGatewayDhcpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CellularGatewayDhcpState | undefined;
            resourceInputs["dhcpLeaseTime"] = state ? state.dhcpLeaseTime : undefined;
            resourceInputs["dnsCustomNameservers"] = state ? state.dnsCustomNameservers : undefined;
            resourceInputs["dnsNameservers"] = state ? state.dnsNameservers : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
        } else {
            const args = argsOrState as CellularGatewayDhcpArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            resourceInputs["dhcpLeaseTime"] = args ? args.dhcpLeaseTime : undefined;
            resourceInputs["dnsCustomNameservers"] = args ? args.dnsCustomNameservers : undefined;
            resourceInputs["dnsNameservers"] = args ? args.dnsNameservers : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CellularGatewayDhcp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CellularGatewayDhcp resources.
 */
export interface CellularGatewayDhcpState {
    /**
     * DHCP Lease time for all MG in the network.
     */
    dhcpLeaseTime?: pulumi.Input<string>;
    /**
     * List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
     */
    dnsCustomNameservers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * DNS name servers mode for all MG in the network.
     */
    dnsNameservers?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CellularGatewayDhcp resource.
 */
export interface CellularGatewayDhcpArgs {
    /**
     * DHCP Lease time for all MG in the network.
     */
    dhcpLeaseTime?: pulumi.Input<string>;
    /**
     * List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
     */
    dnsCustomNameservers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * DNS name servers mode for all MG in the network.
     */
    dnsNameservers?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
}