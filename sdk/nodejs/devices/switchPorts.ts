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
 * const example = new meraki.devices.SwitchPorts("example", {
 *     accessPolicyNumber: 2,
 *     accessPolicyType: "Sticky MAC allow list",
 *     adaptivePolicyGroupId: "123",
 *     allowedVlans: "1,3,5-10",
 *     daiTrusted: false,
 *     enabled: true,
 *     flexibleStackingEnabled: true,
 *     isolationEnabled: false,
 *     linkNegotiation: "Auto negotiate",
 *     macAllowLists: [
 *         "34:56:fe:ce:8e:b0",
 *         "34:56:fe:ce:8e:b1",
 *     ],
 *     name: "My switch port",
 *     peerSgtCapable: false,
 *     poeEnabled: true,
 *     portId: "string",
 *     portScheduleId: "1234",
 *     profile: {
 *         enabled: false,
 *         id: "1284392014819",
 *         iname: "iname",
 *     },
 *     rstpEnabled: true,
 *     serial: "string",
 *     stickyMacAllowLists: [
 *         "34:56:fe:ce:8e:b0",
 *         "34:56:fe:ce:8e:b1",
 *     ],
 *     stickyMacAllowListLimit: 5,
 *     stormControlEnabled: true,
 *     stpGuard: "disabled",
 *     tags: [
 *         "tag1",
 *         "tag2",
 *     ],
 *     type: "access",
 *     udld: "Alert only",
 *     vlan: 10,
 *     voiceVlan: 20,
 * });
 * export const merakiDevicesSwitchPortsExample = example;
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:devices/switchPorts:SwitchPorts example "port_id,serial"
 * ```
 */
export class SwitchPorts extends pulumi.CustomResource {
    /**
     * Get an existing SwitchPorts resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SwitchPortsState, opts?: pulumi.CustomResourceOptions): SwitchPorts {
        return new SwitchPorts(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:devices/switchPorts:SwitchPorts';

    /**
     * Returns true if the given object is an instance of SwitchPorts.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SwitchPorts {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SwitchPorts.__pulumiType;
    }

    /**
     * The number of a custom access policy to configure on the switch port. Only applicable when 'accessPolicyType' is 'Custom access policy'.
     */
    public readonly accessPolicyNumber!: pulumi.Output<number>;
    /**
     * The type of the access policy of the switch port. Only applicable to access ports. Can be one of 'Open', 'Custom access policy', 'MAC allow list' or 'Sticky MAC allow list'.
     */
    public readonly accessPolicyType!: pulumi.Output<string>;
    /**
     * The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
     */
    public readonly adaptivePolicyGroupId!: pulumi.Output<string>;
    /**
     * The VLANs allowed on the switch port. Only applicable to trunk ports.
     */
    public readonly allowedVlans!: pulumi.Output<string>;
    /**
     * If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
     */
    public readonly daiTrusted!: pulumi.Output<boolean>;
    /**
     * The status of the switch port.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
     */
    public readonly flexibleStackingEnabled!: pulumi.Output<boolean>;
    /**
     * The isolation status of the switch port.
     */
    public readonly isolationEnabled!: pulumi.Output<boolean>;
    /**
     * The link speed for the switch port.
     */
    public readonly linkNegotiation!: pulumi.Output<string>;
    /**
     * Available link speeds for the switch port.
     */
    public /*out*/ readonly linkNegotiationCapabilities!: pulumi.Output<string[]>;
    /**
     * Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when 'accessPolicyType' is 'MAC allow list'.
     */
    public readonly macAllowLists!: pulumi.Output<string[]>;
    /**
     * Port mirror
     */
    public /*out*/ readonly mirror!: pulumi.Output<outputs.devices.SwitchPortsMirror>;
    /**
     * Expansion module
     */
    public /*out*/ readonly module!: pulumi.Output<outputs.devices.SwitchPortsModule>;
    /**
     * The name of the switch port.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
     */
    public readonly peerSgtCapable!: pulumi.Output<boolean>;
    /**
     * The PoE status of the switch port.
     */
    public readonly poeEnabled!: pulumi.Output<boolean>;
    /**
     * The identifier of the switch port.
     */
    public readonly portId!: pulumi.Output<string>;
    /**
     * The ID of the port schedule. A value of null will clear the port schedule.
     */
    public readonly portScheduleId!: pulumi.Output<string>;
    /**
     * Profile attributes
     */
    public readonly profile!: pulumi.Output<outputs.devices.SwitchPortsProfile>;
    /**
     * The rapid spanning tree protocol status.
     */
    public readonly rstpEnabled!: pulumi.Output<boolean>;
    /**
     * serial path parameter.
     */
    public readonly serial!: pulumi.Output<string>;
    /**
     * The maximum number of MAC addresses for sticky MAC allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
     */
    public readonly stickyMacAllowListLimit!: pulumi.Output<number>;
    /**
     * The initial list of MAC addresses for sticky Mac allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
     */
    public readonly stickyMacAllowLists!: pulumi.Output<string[]>;
    /**
     * The storm control status of the switch port.
     */
    public readonly stormControlEnabled!: pulumi.Output<boolean>;
    /**
     * The state of the STP guard ('disabled', 'root guard', 'bpdu guard' or 'loop guard').
     */
    public readonly stpGuard!: pulumi.Output<string>;
    /**
     * The list of tags of the switch port.
     */
    public readonly tags!: pulumi.Output<string[]>;
    /**
     * The type of the switch port ('trunk' or 'access').
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
     */
    public readonly udld!: pulumi.Output<string>;
    /**
     * The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
     */
    public readonly vlan!: pulumi.Output<number>;
    /**
     * The voice VLAN of the switch port. Only applicable to access ports.
     */
    public readonly voiceVlan!: pulumi.Output<number>;

    /**
     * Create a SwitchPorts resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SwitchPortsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SwitchPortsArgs | SwitchPortsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SwitchPortsState | undefined;
            resourceInputs["accessPolicyNumber"] = state ? state.accessPolicyNumber : undefined;
            resourceInputs["accessPolicyType"] = state ? state.accessPolicyType : undefined;
            resourceInputs["adaptivePolicyGroupId"] = state ? state.adaptivePolicyGroupId : undefined;
            resourceInputs["allowedVlans"] = state ? state.allowedVlans : undefined;
            resourceInputs["daiTrusted"] = state ? state.daiTrusted : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["flexibleStackingEnabled"] = state ? state.flexibleStackingEnabled : undefined;
            resourceInputs["isolationEnabled"] = state ? state.isolationEnabled : undefined;
            resourceInputs["linkNegotiation"] = state ? state.linkNegotiation : undefined;
            resourceInputs["linkNegotiationCapabilities"] = state ? state.linkNegotiationCapabilities : undefined;
            resourceInputs["macAllowLists"] = state ? state.macAllowLists : undefined;
            resourceInputs["mirror"] = state ? state.mirror : undefined;
            resourceInputs["module"] = state ? state.module : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["peerSgtCapable"] = state ? state.peerSgtCapable : undefined;
            resourceInputs["poeEnabled"] = state ? state.poeEnabled : undefined;
            resourceInputs["portId"] = state ? state.portId : undefined;
            resourceInputs["portScheduleId"] = state ? state.portScheduleId : undefined;
            resourceInputs["profile"] = state ? state.profile : undefined;
            resourceInputs["rstpEnabled"] = state ? state.rstpEnabled : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
            resourceInputs["stickyMacAllowListLimit"] = state ? state.stickyMacAllowListLimit : undefined;
            resourceInputs["stickyMacAllowLists"] = state ? state.stickyMacAllowLists : undefined;
            resourceInputs["stormControlEnabled"] = state ? state.stormControlEnabled : undefined;
            resourceInputs["stpGuard"] = state ? state.stpGuard : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["udld"] = state ? state.udld : undefined;
            resourceInputs["vlan"] = state ? state.vlan : undefined;
            resourceInputs["voiceVlan"] = state ? state.voiceVlan : undefined;
        } else {
            const args = argsOrState as SwitchPortsArgs | undefined;
            if ((!args || args.portId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'portId'");
            }
            if ((!args || args.serial === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serial'");
            }
            resourceInputs["accessPolicyNumber"] = args ? args.accessPolicyNumber : undefined;
            resourceInputs["accessPolicyType"] = args ? args.accessPolicyType : undefined;
            resourceInputs["adaptivePolicyGroupId"] = args ? args.adaptivePolicyGroupId : undefined;
            resourceInputs["allowedVlans"] = args ? args.allowedVlans : undefined;
            resourceInputs["daiTrusted"] = args ? args.daiTrusted : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["flexibleStackingEnabled"] = args ? args.flexibleStackingEnabled : undefined;
            resourceInputs["isolationEnabled"] = args ? args.isolationEnabled : undefined;
            resourceInputs["linkNegotiation"] = args ? args.linkNegotiation : undefined;
            resourceInputs["macAllowLists"] = args ? args.macAllowLists : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["peerSgtCapable"] = args ? args.peerSgtCapable : undefined;
            resourceInputs["poeEnabled"] = args ? args.poeEnabled : undefined;
            resourceInputs["portId"] = args ? args.portId : undefined;
            resourceInputs["portScheduleId"] = args ? args.portScheduleId : undefined;
            resourceInputs["profile"] = args ? args.profile : undefined;
            resourceInputs["rstpEnabled"] = args ? args.rstpEnabled : undefined;
            resourceInputs["serial"] = args ? args.serial : undefined;
            resourceInputs["stickyMacAllowListLimit"] = args ? args.stickyMacAllowListLimit : undefined;
            resourceInputs["stickyMacAllowLists"] = args ? args.stickyMacAllowLists : undefined;
            resourceInputs["stormControlEnabled"] = args ? args.stormControlEnabled : undefined;
            resourceInputs["stpGuard"] = args ? args.stpGuard : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["udld"] = args ? args.udld : undefined;
            resourceInputs["vlan"] = args ? args.vlan : undefined;
            resourceInputs["voiceVlan"] = args ? args.voiceVlan : undefined;
            resourceInputs["linkNegotiationCapabilities"] = undefined /*out*/;
            resourceInputs["mirror"] = undefined /*out*/;
            resourceInputs["module"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SwitchPorts.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SwitchPorts resources.
 */
export interface SwitchPortsState {
    /**
     * The number of a custom access policy to configure on the switch port. Only applicable when 'accessPolicyType' is 'Custom access policy'.
     */
    accessPolicyNumber?: pulumi.Input<number>;
    /**
     * The type of the access policy of the switch port. Only applicable to access ports. Can be one of 'Open', 'Custom access policy', 'MAC allow list' or 'Sticky MAC allow list'.
     */
    accessPolicyType?: pulumi.Input<string>;
    /**
     * The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
     */
    adaptivePolicyGroupId?: pulumi.Input<string>;
    /**
     * The VLANs allowed on the switch port. Only applicable to trunk ports.
     */
    allowedVlans?: pulumi.Input<string>;
    /**
     * If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
     */
    daiTrusted?: pulumi.Input<boolean>;
    /**
     * The status of the switch port.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
     */
    flexibleStackingEnabled?: pulumi.Input<boolean>;
    /**
     * The isolation status of the switch port.
     */
    isolationEnabled?: pulumi.Input<boolean>;
    /**
     * The link speed for the switch port.
     */
    linkNegotiation?: pulumi.Input<string>;
    /**
     * Available link speeds for the switch port.
     */
    linkNegotiationCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when 'accessPolicyType' is 'MAC allow list'.
     */
    macAllowLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Port mirror
     */
    mirror?: pulumi.Input<inputs.devices.SwitchPortsMirror>;
    /**
     * Expansion module
     */
    module?: pulumi.Input<inputs.devices.SwitchPortsModule>;
    /**
     * The name of the switch port.
     */
    name?: pulumi.Input<string>;
    /**
     * If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
     */
    peerSgtCapable?: pulumi.Input<boolean>;
    /**
     * The PoE status of the switch port.
     */
    poeEnabled?: pulumi.Input<boolean>;
    /**
     * The identifier of the switch port.
     */
    portId?: pulumi.Input<string>;
    /**
     * The ID of the port schedule. A value of null will clear the port schedule.
     */
    portScheduleId?: pulumi.Input<string>;
    /**
     * Profile attributes
     */
    profile?: pulumi.Input<inputs.devices.SwitchPortsProfile>;
    /**
     * The rapid spanning tree protocol status.
     */
    rstpEnabled?: pulumi.Input<boolean>;
    /**
     * serial path parameter.
     */
    serial?: pulumi.Input<string>;
    /**
     * The maximum number of MAC addresses for sticky MAC allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
     */
    stickyMacAllowListLimit?: pulumi.Input<number>;
    /**
     * The initial list of MAC addresses for sticky Mac allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
     */
    stickyMacAllowLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The storm control status of the switch port.
     */
    stormControlEnabled?: pulumi.Input<boolean>;
    /**
     * The state of the STP guard ('disabled', 'root guard', 'bpdu guard' or 'loop guard').
     */
    stpGuard?: pulumi.Input<string>;
    /**
     * The list of tags of the switch port.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type of the switch port ('trunk' or 'access').
     */
    type?: pulumi.Input<string>;
    /**
     * The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
     */
    udld?: pulumi.Input<string>;
    /**
     * The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
     */
    vlan?: pulumi.Input<number>;
    /**
     * The voice VLAN of the switch port. Only applicable to access ports.
     */
    voiceVlan?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SwitchPorts resource.
 */
export interface SwitchPortsArgs {
    /**
     * The number of a custom access policy to configure on the switch port. Only applicable when 'accessPolicyType' is 'Custom access policy'.
     */
    accessPolicyNumber?: pulumi.Input<number>;
    /**
     * The type of the access policy of the switch port. Only applicable to access ports. Can be one of 'Open', 'Custom access policy', 'MAC allow list' or 'Sticky MAC allow list'.
     */
    accessPolicyType?: pulumi.Input<string>;
    /**
     * The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
     */
    adaptivePolicyGroupId?: pulumi.Input<string>;
    /**
     * The VLANs allowed on the switch port. Only applicable to trunk ports.
     */
    allowedVlans?: pulumi.Input<string>;
    /**
     * If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
     */
    daiTrusted?: pulumi.Input<boolean>;
    /**
     * The status of the switch port.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
     */
    flexibleStackingEnabled?: pulumi.Input<boolean>;
    /**
     * The isolation status of the switch port.
     */
    isolationEnabled?: pulumi.Input<boolean>;
    /**
     * The link speed for the switch port.
     */
    linkNegotiation?: pulumi.Input<string>;
    /**
     * Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when 'accessPolicyType' is 'MAC allow list'.
     */
    macAllowLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the switch port.
     */
    name?: pulumi.Input<string>;
    /**
     * If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
     */
    peerSgtCapable?: pulumi.Input<boolean>;
    /**
     * The PoE status of the switch port.
     */
    poeEnabled?: pulumi.Input<boolean>;
    /**
     * The identifier of the switch port.
     */
    portId: pulumi.Input<string>;
    /**
     * The ID of the port schedule. A value of null will clear the port schedule.
     */
    portScheduleId?: pulumi.Input<string>;
    /**
     * Profile attributes
     */
    profile?: pulumi.Input<inputs.devices.SwitchPortsProfile>;
    /**
     * The rapid spanning tree protocol status.
     */
    rstpEnabled?: pulumi.Input<boolean>;
    /**
     * serial path parameter.
     */
    serial: pulumi.Input<string>;
    /**
     * The maximum number of MAC addresses for sticky MAC allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
     */
    stickyMacAllowListLimit?: pulumi.Input<number>;
    /**
     * The initial list of MAC addresses for sticky Mac allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
     */
    stickyMacAllowLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The storm control status of the switch port.
     */
    stormControlEnabled?: pulumi.Input<boolean>;
    /**
     * The state of the STP guard ('disabled', 'root guard', 'bpdu guard' or 'loop guard').
     */
    stpGuard?: pulumi.Input<string>;
    /**
     * The list of tags of the switch port.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type of the switch port ('trunk' or 'access').
     */
    type?: pulumi.Input<string>;
    /**
     * The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
     */
    udld?: pulumi.Input<string>;
    /**
     * The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
     */
    vlan?: pulumi.Input<number>;
    /**
     * The voice VLAN of the switch port. Only applicable to access ports.
     */
    voiceVlan?: pulumi.Input<number>;
}