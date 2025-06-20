// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces example "interface_id,network_id,switch_stack_id"
 * ```
 */
export class SwitchStacksRoutingInterfaces extends pulumi.CustomResource {
    /**
     * Get an existing SwitchStacksRoutingInterfaces resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SwitchStacksRoutingInterfacesState, opts?: pulumi.CustomResourceOptions): SwitchStacksRoutingInterfaces {
        return new SwitchStacksRoutingInterfaces(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces';

    /**
     * Returns true if the given object is an instance of SwitchStacksRoutingInterfaces.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SwitchStacksRoutingInterfaces {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SwitchStacksRoutingInterfaces.__pulumiType;
    }

    /**
     * IPv4 default gateway
     */
    public readonly defaultGateway!: pulumi.Output<string>;
    /**
     * IPv4 default gateway
     */
    public /*out*/ readonly defaultGatewayResponse!: pulumi.Output<string>;
    /**
     * The id
     */
    public readonly interfaceId!: pulumi.Output<string>;
    /**
     * IPv4 address
     */
    public readonly interfaceIp!: pulumi.Output<string>;
    /**
     * IPv6 addressing
     */
    public readonly ipv6!: pulumi.Output<outputs.networks.SwitchStacksRoutingInterfacesIpv6>;
    /**
     * Multicast routing status
     */
    public readonly multicastRouting!: pulumi.Output<string>;
    /**
     * The name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * IPv4 OSPF Settings
     */
    public readonly ospfSettings!: pulumi.Output<outputs.networks.SwitchStacksRoutingInterfacesOspfSettings>;
    /**
     * IPv6 OSPF Settings
     */
    public /*out*/ readonly ospfV3!: pulumi.Output<outputs.networks.SwitchStacksRoutingInterfacesOspfV3>;
    /**
     * IPv4 subnet
     */
    public readonly subnet!: pulumi.Output<string>;
    /**
     * switchStackId path parameter. Switch stack ID
     */
    public readonly switchStackId!: pulumi.Output<string>;
    /**
     * VLAN id
     */
    public readonly vlanId!: pulumi.Output<number>;

    /**
     * Create a SwitchStacksRoutingInterfaces resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SwitchStacksRoutingInterfacesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SwitchStacksRoutingInterfacesArgs | SwitchStacksRoutingInterfacesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SwitchStacksRoutingInterfacesState | undefined;
            resourceInputs["defaultGateway"] = state ? state.defaultGateway : undefined;
            resourceInputs["defaultGatewayResponse"] = state ? state.defaultGatewayResponse : undefined;
            resourceInputs["interfaceId"] = state ? state.interfaceId : undefined;
            resourceInputs["interfaceIp"] = state ? state.interfaceIp : undefined;
            resourceInputs["ipv6"] = state ? state.ipv6 : undefined;
            resourceInputs["multicastRouting"] = state ? state.multicastRouting : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["ospfSettings"] = state ? state.ospfSettings : undefined;
            resourceInputs["ospfV3"] = state ? state.ospfV3 : undefined;
            resourceInputs["subnet"] = state ? state.subnet : undefined;
            resourceInputs["switchStackId"] = state ? state.switchStackId : undefined;
            resourceInputs["vlanId"] = state ? state.vlanId : undefined;
        } else {
            const args = argsOrState as SwitchStacksRoutingInterfacesArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            if ((!args || args.switchStackId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'switchStackId'");
            }
            resourceInputs["defaultGateway"] = args ? args.defaultGateway : undefined;
            resourceInputs["interfaceId"] = args ? args.interfaceId : undefined;
            resourceInputs["interfaceIp"] = args ? args.interfaceIp : undefined;
            resourceInputs["ipv6"] = args ? args.ipv6 : undefined;
            resourceInputs["multicastRouting"] = args ? args.multicastRouting : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["ospfSettings"] = args ? args.ospfSettings : undefined;
            resourceInputs["subnet"] = args ? args.subnet : undefined;
            resourceInputs["switchStackId"] = args ? args.switchStackId : undefined;
            resourceInputs["vlanId"] = args ? args.vlanId : undefined;
            resourceInputs["defaultGatewayResponse"] = undefined /*out*/;
            resourceInputs["ospfV3"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SwitchStacksRoutingInterfaces.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SwitchStacksRoutingInterfaces resources.
 */
export interface SwitchStacksRoutingInterfacesState {
    /**
     * IPv4 default gateway
     */
    defaultGateway?: pulumi.Input<string>;
    /**
     * IPv4 default gateway
     */
    defaultGatewayResponse?: pulumi.Input<string>;
    /**
     * The id
     */
    interfaceId?: pulumi.Input<string>;
    /**
     * IPv4 address
     */
    interfaceIp?: pulumi.Input<string>;
    /**
     * IPv6 addressing
     */
    ipv6?: pulumi.Input<inputs.networks.SwitchStacksRoutingInterfacesIpv6>;
    /**
     * Multicast routing status
     */
    multicastRouting?: pulumi.Input<string>;
    /**
     * The name
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * IPv4 OSPF Settings
     */
    ospfSettings?: pulumi.Input<inputs.networks.SwitchStacksRoutingInterfacesOspfSettings>;
    /**
     * IPv6 OSPF Settings
     */
    ospfV3?: pulumi.Input<inputs.networks.SwitchStacksRoutingInterfacesOspfV3>;
    /**
     * IPv4 subnet
     */
    subnet?: pulumi.Input<string>;
    /**
     * switchStackId path parameter. Switch stack ID
     */
    switchStackId?: pulumi.Input<string>;
    /**
     * VLAN id
     */
    vlanId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SwitchStacksRoutingInterfaces resource.
 */
export interface SwitchStacksRoutingInterfacesArgs {
    /**
     * IPv4 default gateway
     */
    defaultGateway?: pulumi.Input<string>;
    /**
     * The id
     */
    interfaceId?: pulumi.Input<string>;
    /**
     * IPv4 address
     */
    interfaceIp?: pulumi.Input<string>;
    /**
     * IPv6 addressing
     */
    ipv6?: pulumi.Input<inputs.networks.SwitchStacksRoutingInterfacesIpv6>;
    /**
     * Multicast routing status
     */
    multicastRouting?: pulumi.Input<string>;
    /**
     * The name
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * IPv4 OSPF Settings
     */
    ospfSettings?: pulumi.Input<inputs.networks.SwitchStacksRoutingInterfacesOspfSettings>;
    /**
     * IPv4 subnet
     */
    subnet?: pulumi.Input<string>;
    /**
     * switchStackId path parameter. Switch stack ID
     */
    switchStackId: pulumi.Input<string>;
    /**
     * VLAN id
     */
    vlanId?: pulumi.Input<number>;
}
