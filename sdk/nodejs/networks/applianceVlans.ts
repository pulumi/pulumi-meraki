// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
 * $ pulumi import meraki:networks/applianceVlans:ApplianceVlans example "network_id,vlan_id"
 * ```
 */
export class ApplianceVlans extends pulumi.CustomResource {
    /**
     * Get an existing ApplianceVlans resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplianceVlansState, opts?: pulumi.CustomResourceOptions): ApplianceVlans {
        return new ApplianceVlans(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/applianceVlans:ApplianceVlans';

    /**
     * Returns true if the given object is an instance of ApplianceVlans.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplianceVlans {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplianceVlans.__pulumiType;
    }

    /**
     * The local IP of the appliance on the VLAN
     */
    public readonly applianceIp!: pulumi.Output<string>;
    /**
     * CIDR of the pool of subnets. Applicable only for template network. Each network bound to the template will automatically pick a subnet from this pool to build its own VLAN.
     */
    public readonly cidr!: pulumi.Output<string | undefined>;
    /**
     * DHCP boot option for boot filename
     */
    public readonly dhcpBootFilename!: pulumi.Output<string>;
    /**
     * DHCP boot option to direct boot clients to the server to load the boot file from
     */
    public readonly dhcpBootNextServer!: pulumi.Output<string>;
    /**
     * Use DHCP boot options specified in other properties
     */
    public readonly dhcpBootOptionsEnabled!: pulumi.Output<boolean>;
    /**
     * The appliance's handling of DHCP requests on this VLAN. One of: 'Run a DHCP server', 'Relay DHCP to another server' or 'Do not respond to DHCP requests'
     */
    public readonly dhcpHandling!: pulumi.Output<string>;
    /**
     * The term of DHCP leases if the appliance is running a DHCP server on this VLAN. One of: '30 minutes', '1 hour', '4 hours', '12 hours', '1 day' or '1 week'
     */
    public readonly dhcpLeaseTime!: pulumi.Output<string>;
    /**
     * The list of DHCP options that will be included in DHCP responses. Each object in the list should have "code", "type", and "value" properties.
     */
    public readonly dhcpOptions!: pulumi.Output<outputs.networks.ApplianceVlansDhcpOption[]>;
    /**
     * The IPs of the DHCP servers that DHCP requests should be relayed to
     */
    public readonly dhcpRelayServerIps!: pulumi.Output<string[]>;
    /**
     * The DNS nameservers used for DHCP responses, either "upstream*dns", "google*dns", "opendns", or a newline seperated string of IP addresses or domain names
     */
    public readonly dnsNameservers!: pulumi.Output<string>;
    /**
     * The id of the desired group policy to apply to the VLAN
     */
    public readonly groupPolicyId!: pulumi.Output<string>;
    /**
     * The interface ID of the VLAN
     */
    public /*out*/ readonly interfaceId!: pulumi.Output<string>;
    /**
     * IPv6 configuration on the VLAN
     */
    public readonly ipv6!: pulumi.Output<outputs.networks.ApplianceVlansIpv6>;
    /**
     * Mandatory DHCP will enforce that clients connecting to this VLAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
     */
    public readonly mandatoryDhcp!: pulumi.Output<outputs.networks.ApplianceVlansMandatoryDhcp>;
    /**
     * Mask used for the subnet of all bound to the template networks. Applicable only for template network.
     */
    public readonly mask!: pulumi.Output<number>;
    /**
     * The name of the VLAN
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * The DHCP reserved IP ranges on the VLAN
     */
    public readonly reservedIpRanges!: pulumi.Output<outputs.networks.ApplianceVlansReservedIpRange[]>;
    /**
     * The subnet of the VLAN
     */
    public readonly subnet!: pulumi.Output<string>;
    /**
     * Type of subnetting of the VLAN. Applicable only for template network.
     */
    public readonly templateVlanType!: pulumi.Output<string>;
    /**
     * The VLAN ID of the VLAN
     */
    public readonly vlanId!: pulumi.Output<string>;
    /**
     * The translated VPN subnet if VPN and VPN subnet translation are enabled on the VLAN
     */
    public readonly vpnNatSubnet!: pulumi.Output<string>;

    /**
     * Create a ApplianceVlans resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplianceVlansArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplianceVlansArgs | ApplianceVlansState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplianceVlansState | undefined;
            resourceInputs["applianceIp"] = state ? state.applianceIp : undefined;
            resourceInputs["cidr"] = state ? state.cidr : undefined;
            resourceInputs["dhcpBootFilename"] = state ? state.dhcpBootFilename : undefined;
            resourceInputs["dhcpBootNextServer"] = state ? state.dhcpBootNextServer : undefined;
            resourceInputs["dhcpBootOptionsEnabled"] = state ? state.dhcpBootOptionsEnabled : undefined;
            resourceInputs["dhcpHandling"] = state ? state.dhcpHandling : undefined;
            resourceInputs["dhcpLeaseTime"] = state ? state.dhcpLeaseTime : undefined;
            resourceInputs["dhcpOptions"] = state ? state.dhcpOptions : undefined;
            resourceInputs["dhcpRelayServerIps"] = state ? state.dhcpRelayServerIps : undefined;
            resourceInputs["dnsNameservers"] = state ? state.dnsNameservers : undefined;
            resourceInputs["groupPolicyId"] = state ? state.groupPolicyId : undefined;
            resourceInputs["interfaceId"] = state ? state.interfaceId : undefined;
            resourceInputs["ipv6"] = state ? state.ipv6 : undefined;
            resourceInputs["mandatoryDhcp"] = state ? state.mandatoryDhcp : undefined;
            resourceInputs["mask"] = state ? state.mask : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["reservedIpRanges"] = state ? state.reservedIpRanges : undefined;
            resourceInputs["subnet"] = state ? state.subnet : undefined;
            resourceInputs["templateVlanType"] = state ? state.templateVlanType : undefined;
            resourceInputs["vlanId"] = state ? state.vlanId : undefined;
            resourceInputs["vpnNatSubnet"] = state ? state.vpnNatSubnet : undefined;
        } else {
            const args = argsOrState as ApplianceVlansArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            if ((!args || args.vlanId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vlanId'");
            }
            resourceInputs["applianceIp"] = args ? args.applianceIp : undefined;
            resourceInputs["cidr"] = args ? args.cidr : undefined;
            resourceInputs["dhcpBootFilename"] = args ? args.dhcpBootFilename : undefined;
            resourceInputs["dhcpBootNextServer"] = args ? args.dhcpBootNextServer : undefined;
            resourceInputs["dhcpBootOptionsEnabled"] = args ? args.dhcpBootOptionsEnabled : undefined;
            resourceInputs["dhcpHandling"] = args ? args.dhcpHandling : undefined;
            resourceInputs["dhcpLeaseTime"] = args ? args.dhcpLeaseTime : undefined;
            resourceInputs["dhcpOptions"] = args ? args.dhcpOptions : undefined;
            resourceInputs["dhcpRelayServerIps"] = args ? args.dhcpRelayServerIps : undefined;
            resourceInputs["dnsNameservers"] = args ? args.dnsNameservers : undefined;
            resourceInputs["groupPolicyId"] = args ? args.groupPolicyId : undefined;
            resourceInputs["ipv6"] = args ? args.ipv6 : undefined;
            resourceInputs["mandatoryDhcp"] = args ? args.mandatoryDhcp : undefined;
            resourceInputs["mask"] = args ? args.mask : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["reservedIpRanges"] = args ? args.reservedIpRanges : undefined;
            resourceInputs["subnet"] = args ? args.subnet : undefined;
            resourceInputs["templateVlanType"] = args ? args.templateVlanType : undefined;
            resourceInputs["vlanId"] = args ? args.vlanId : undefined;
            resourceInputs["vpnNatSubnet"] = args ? args.vpnNatSubnet : undefined;
            resourceInputs["interfaceId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplianceVlans.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplianceVlans resources.
 */
export interface ApplianceVlansState {
    /**
     * The local IP of the appliance on the VLAN
     */
    applianceIp?: pulumi.Input<string>;
    /**
     * CIDR of the pool of subnets. Applicable only for template network. Each network bound to the template will automatically pick a subnet from this pool to build its own VLAN.
     */
    cidr?: pulumi.Input<string>;
    /**
     * DHCP boot option for boot filename
     */
    dhcpBootFilename?: pulumi.Input<string>;
    /**
     * DHCP boot option to direct boot clients to the server to load the boot file from
     */
    dhcpBootNextServer?: pulumi.Input<string>;
    /**
     * Use DHCP boot options specified in other properties
     */
    dhcpBootOptionsEnabled?: pulumi.Input<boolean>;
    /**
     * The appliance's handling of DHCP requests on this VLAN. One of: 'Run a DHCP server', 'Relay DHCP to another server' or 'Do not respond to DHCP requests'
     */
    dhcpHandling?: pulumi.Input<string>;
    /**
     * The term of DHCP leases if the appliance is running a DHCP server on this VLAN. One of: '30 minutes', '1 hour', '4 hours', '12 hours', '1 day' or '1 week'
     */
    dhcpLeaseTime?: pulumi.Input<string>;
    /**
     * The list of DHCP options that will be included in DHCP responses. Each object in the list should have "code", "type", and "value" properties.
     */
    dhcpOptions?: pulumi.Input<pulumi.Input<inputs.networks.ApplianceVlansDhcpOption>[]>;
    /**
     * The IPs of the DHCP servers that DHCP requests should be relayed to
     */
    dhcpRelayServerIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DNS nameservers used for DHCP responses, either "upstream*dns", "google*dns", "opendns", or a newline seperated string of IP addresses or domain names
     */
    dnsNameservers?: pulumi.Input<string>;
    /**
     * The id of the desired group policy to apply to the VLAN
     */
    groupPolicyId?: pulumi.Input<string>;
    /**
     * The interface ID of the VLAN
     */
    interfaceId?: pulumi.Input<string>;
    /**
     * IPv6 configuration on the VLAN
     */
    ipv6?: pulumi.Input<inputs.networks.ApplianceVlansIpv6>;
    /**
     * Mandatory DHCP will enforce that clients connecting to this VLAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
     */
    mandatoryDhcp?: pulumi.Input<inputs.networks.ApplianceVlansMandatoryDhcp>;
    /**
     * Mask used for the subnet of all bound to the template networks. Applicable only for template network.
     */
    mask?: pulumi.Input<number>;
    /**
     * The name of the VLAN
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * The DHCP reserved IP ranges on the VLAN
     */
    reservedIpRanges?: pulumi.Input<pulumi.Input<inputs.networks.ApplianceVlansReservedIpRange>[]>;
    /**
     * The subnet of the VLAN
     */
    subnet?: pulumi.Input<string>;
    /**
     * Type of subnetting of the VLAN. Applicable only for template network.
     */
    templateVlanType?: pulumi.Input<string>;
    /**
     * The VLAN ID of the VLAN
     */
    vlanId?: pulumi.Input<string>;
    /**
     * The translated VPN subnet if VPN and VPN subnet translation are enabled on the VLAN
     */
    vpnNatSubnet?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplianceVlans resource.
 */
export interface ApplianceVlansArgs {
    /**
     * The local IP of the appliance on the VLAN
     */
    applianceIp?: pulumi.Input<string>;
    /**
     * CIDR of the pool of subnets. Applicable only for template network. Each network bound to the template will automatically pick a subnet from this pool to build its own VLAN.
     */
    cidr?: pulumi.Input<string>;
    /**
     * DHCP boot option for boot filename
     */
    dhcpBootFilename?: pulumi.Input<string>;
    /**
     * DHCP boot option to direct boot clients to the server to load the boot file from
     */
    dhcpBootNextServer?: pulumi.Input<string>;
    /**
     * Use DHCP boot options specified in other properties
     */
    dhcpBootOptionsEnabled?: pulumi.Input<boolean>;
    /**
     * The appliance's handling of DHCP requests on this VLAN. One of: 'Run a DHCP server', 'Relay DHCP to another server' or 'Do not respond to DHCP requests'
     */
    dhcpHandling?: pulumi.Input<string>;
    /**
     * The term of DHCP leases if the appliance is running a DHCP server on this VLAN. One of: '30 minutes', '1 hour', '4 hours', '12 hours', '1 day' or '1 week'
     */
    dhcpLeaseTime?: pulumi.Input<string>;
    /**
     * The list of DHCP options that will be included in DHCP responses. Each object in the list should have "code", "type", and "value" properties.
     */
    dhcpOptions?: pulumi.Input<pulumi.Input<inputs.networks.ApplianceVlansDhcpOption>[]>;
    /**
     * The IPs of the DHCP servers that DHCP requests should be relayed to
     */
    dhcpRelayServerIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DNS nameservers used for DHCP responses, either "upstream*dns", "google*dns", "opendns", or a newline seperated string of IP addresses or domain names
     */
    dnsNameservers?: pulumi.Input<string>;
    /**
     * The id of the desired group policy to apply to the VLAN
     */
    groupPolicyId?: pulumi.Input<string>;
    /**
     * IPv6 configuration on the VLAN
     */
    ipv6?: pulumi.Input<inputs.networks.ApplianceVlansIpv6>;
    /**
     * Mandatory DHCP will enforce that clients connecting to this VLAN must use the IP address assigned by the DHCP server. Clients who use a static IP address won't be able to associate. Only available on firmware versions 17.0 and above
     */
    mandatoryDhcp?: pulumi.Input<inputs.networks.ApplianceVlansMandatoryDhcp>;
    /**
     * Mask used for the subnet of all bound to the template networks. Applicable only for template network.
     */
    mask?: pulumi.Input<number>;
    /**
     * The name of the VLAN
     */
    name?: pulumi.Input<string>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * The DHCP reserved IP ranges on the VLAN
     */
    reservedIpRanges?: pulumi.Input<pulumi.Input<inputs.networks.ApplianceVlansReservedIpRange>[]>;
    /**
     * The subnet of the VLAN
     */
    subnet?: pulumi.Input<string>;
    /**
     * Type of subnetting of the VLAN. Applicable only for template network.
     */
    templateVlanType?: pulumi.Input<string>;
    /**
     * The VLAN ID of the VLAN
     */
    vlanId: pulumi.Input<string>;
    /**
     * The translated VPN subnet if VPN and VPN subnet translation are enabled on the VLAN
     */
    vpnNatSubnet?: pulumi.Input<string>;
}