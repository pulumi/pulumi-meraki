# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SwitchRoutingInterfacesArgs', 'SwitchRoutingInterfaces']

@pulumi.input_type
class SwitchRoutingInterfacesArgs:
    def __init__(__self__, *,
                 serial: pulumi.Input[str],
                 default_gateway: Optional[pulumi.Input[str]] = None,
                 interface_id: Optional[pulumi.Input[str]] = None,
                 interface_ip: Optional[pulumi.Input[str]] = None,
                 ipv6: Optional[pulumi.Input['SwitchRoutingInterfacesIpv6Args']] = None,
                 multicast_routing: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ospf_settings: Optional[pulumi.Input['SwitchRoutingInterfacesOspfSettingsArgs']] = None,
                 ospf_v3: Optional[pulumi.Input['SwitchRoutingInterfacesOspfV3Args']] = None,
                 subnet: Optional[pulumi.Input[str]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a SwitchRoutingInterfaces resource.
        :param pulumi.Input[str] serial: serial path parameter.
        :param pulumi.Input[str] default_gateway: IPv4 default gateway
        :param pulumi.Input[str] interface_id: The id
        :param pulumi.Input[str] interface_ip: IPv4 address
        :param pulumi.Input['SwitchRoutingInterfacesIpv6Args'] ipv6: IPv6 addressing
        :param pulumi.Input[str] multicast_routing: Multicast routing status
        :param pulumi.Input[str] name: The name
        :param pulumi.Input['SwitchRoutingInterfacesOspfSettingsArgs'] ospf_settings: IPv4 OSPF Settings
        :param pulumi.Input['SwitchRoutingInterfacesOspfV3Args'] ospf_v3: IPv6 OSPF Settings
        :param pulumi.Input[str] subnet: IPv4 subnet
        :param pulumi.Input[int] vlan_id: VLAN id
        """
        pulumi.set(__self__, "serial", serial)
        if default_gateway is not None:
            pulumi.set(__self__, "default_gateway", default_gateway)
        if interface_id is not None:
            pulumi.set(__self__, "interface_id", interface_id)
        if interface_ip is not None:
            pulumi.set(__self__, "interface_ip", interface_ip)
        if ipv6 is not None:
            pulumi.set(__self__, "ipv6", ipv6)
        if multicast_routing is not None:
            pulumi.set(__self__, "multicast_routing", multicast_routing)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ospf_settings is not None:
            pulumi.set(__self__, "ospf_settings", ospf_settings)
        if ospf_v3 is not None:
            pulumi.set(__self__, "ospf_v3", ospf_v3)
        if subnet is not None:
            pulumi.set(__self__, "subnet", subnet)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)

    @property
    @pulumi.getter
    def serial(self) -> pulumi.Input[str]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

    @serial.setter
    def serial(self, value: pulumi.Input[str]):
        pulumi.set(self, "serial", value)

    @property
    @pulumi.getter(name="defaultGateway")
    def default_gateway(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 default gateway
        """
        return pulumi.get(self, "default_gateway")

    @default_gateway.setter
    def default_gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_gateway", value)

    @property
    @pulumi.getter(name="interfaceId")
    def interface_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id
        """
        return pulumi.get(self, "interface_id")

    @interface_id.setter
    def interface_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interface_id", value)

    @property
    @pulumi.getter(name="interfaceIp")
    def interface_ip(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 address
        """
        return pulumi.get(self, "interface_ip")

    @interface_ip.setter
    def interface_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interface_ip", value)

    @property
    @pulumi.getter
    def ipv6(self) -> Optional[pulumi.Input['SwitchRoutingInterfacesIpv6Args']]:
        """
        IPv6 addressing
        """
        return pulumi.get(self, "ipv6")

    @ipv6.setter
    def ipv6(self, value: Optional[pulumi.Input['SwitchRoutingInterfacesIpv6Args']]):
        pulumi.set(self, "ipv6", value)

    @property
    @pulumi.getter(name="multicastRouting")
    def multicast_routing(self) -> Optional[pulumi.Input[str]]:
        """
        Multicast routing status
        """
        return pulumi.get(self, "multicast_routing")

    @multicast_routing.setter
    def multicast_routing(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "multicast_routing", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ospfSettings")
    def ospf_settings(self) -> Optional[pulumi.Input['SwitchRoutingInterfacesOspfSettingsArgs']]:
        """
        IPv4 OSPF Settings
        """
        return pulumi.get(self, "ospf_settings")

    @ospf_settings.setter
    def ospf_settings(self, value: Optional[pulumi.Input['SwitchRoutingInterfacesOspfSettingsArgs']]):
        pulumi.set(self, "ospf_settings", value)

    @property
    @pulumi.getter(name="ospfV3")
    def ospf_v3(self) -> Optional[pulumi.Input['SwitchRoutingInterfacesOspfV3Args']]:
        """
        IPv6 OSPF Settings
        """
        return pulumi.get(self, "ospf_v3")

    @ospf_v3.setter
    def ospf_v3(self, value: Optional[pulumi.Input['SwitchRoutingInterfacesOspfV3Args']]):
        pulumi.set(self, "ospf_v3", value)

    @property
    @pulumi.getter
    def subnet(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 subnet
        """
        return pulumi.get(self, "subnet")

    @subnet.setter
    def subnet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[int]]:
        """
        VLAN id
        """
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vlan_id", value)


@pulumi.input_type
class _SwitchRoutingInterfacesState:
    def __init__(__self__, *,
                 default_gateway: Optional[pulumi.Input[str]] = None,
                 interface_id: Optional[pulumi.Input[str]] = None,
                 interface_ip: Optional[pulumi.Input[str]] = None,
                 ipv6: Optional[pulumi.Input['SwitchRoutingInterfacesIpv6Args']] = None,
                 multicast_routing: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ospf_settings: Optional[pulumi.Input['SwitchRoutingInterfacesOspfSettingsArgs']] = None,
                 ospf_v3: Optional[pulumi.Input['SwitchRoutingInterfacesOspfV3Args']] = None,
                 serial: Optional[pulumi.Input[str]] = None,
                 subnet: Optional[pulumi.Input[str]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering SwitchRoutingInterfaces resources.
        :param pulumi.Input[str] default_gateway: IPv4 default gateway
        :param pulumi.Input[str] interface_id: The id
        :param pulumi.Input[str] interface_ip: IPv4 address
        :param pulumi.Input['SwitchRoutingInterfacesIpv6Args'] ipv6: IPv6 addressing
        :param pulumi.Input[str] multicast_routing: Multicast routing status
        :param pulumi.Input[str] name: The name
        :param pulumi.Input['SwitchRoutingInterfacesOspfSettingsArgs'] ospf_settings: IPv4 OSPF Settings
        :param pulumi.Input['SwitchRoutingInterfacesOspfV3Args'] ospf_v3: IPv6 OSPF Settings
        :param pulumi.Input[str] serial: serial path parameter.
        :param pulumi.Input[str] subnet: IPv4 subnet
        :param pulumi.Input[int] vlan_id: VLAN id
        """
        if default_gateway is not None:
            pulumi.set(__self__, "default_gateway", default_gateway)
        if interface_id is not None:
            pulumi.set(__self__, "interface_id", interface_id)
        if interface_ip is not None:
            pulumi.set(__self__, "interface_ip", interface_ip)
        if ipv6 is not None:
            pulumi.set(__self__, "ipv6", ipv6)
        if multicast_routing is not None:
            pulumi.set(__self__, "multicast_routing", multicast_routing)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ospf_settings is not None:
            pulumi.set(__self__, "ospf_settings", ospf_settings)
        if ospf_v3 is not None:
            pulumi.set(__self__, "ospf_v3", ospf_v3)
        if serial is not None:
            pulumi.set(__self__, "serial", serial)
        if subnet is not None:
            pulumi.set(__self__, "subnet", subnet)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)

    @property
    @pulumi.getter(name="defaultGateway")
    def default_gateway(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 default gateway
        """
        return pulumi.get(self, "default_gateway")

    @default_gateway.setter
    def default_gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_gateway", value)

    @property
    @pulumi.getter(name="interfaceId")
    def interface_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id
        """
        return pulumi.get(self, "interface_id")

    @interface_id.setter
    def interface_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interface_id", value)

    @property
    @pulumi.getter(name="interfaceIp")
    def interface_ip(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 address
        """
        return pulumi.get(self, "interface_ip")

    @interface_ip.setter
    def interface_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interface_ip", value)

    @property
    @pulumi.getter
    def ipv6(self) -> Optional[pulumi.Input['SwitchRoutingInterfacesIpv6Args']]:
        """
        IPv6 addressing
        """
        return pulumi.get(self, "ipv6")

    @ipv6.setter
    def ipv6(self, value: Optional[pulumi.Input['SwitchRoutingInterfacesIpv6Args']]):
        pulumi.set(self, "ipv6", value)

    @property
    @pulumi.getter(name="multicastRouting")
    def multicast_routing(self) -> Optional[pulumi.Input[str]]:
        """
        Multicast routing status
        """
        return pulumi.get(self, "multicast_routing")

    @multicast_routing.setter
    def multicast_routing(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "multicast_routing", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ospfSettings")
    def ospf_settings(self) -> Optional[pulumi.Input['SwitchRoutingInterfacesOspfSettingsArgs']]:
        """
        IPv4 OSPF Settings
        """
        return pulumi.get(self, "ospf_settings")

    @ospf_settings.setter
    def ospf_settings(self, value: Optional[pulumi.Input['SwitchRoutingInterfacesOspfSettingsArgs']]):
        pulumi.set(self, "ospf_settings", value)

    @property
    @pulumi.getter(name="ospfV3")
    def ospf_v3(self) -> Optional[pulumi.Input['SwitchRoutingInterfacesOspfV3Args']]:
        """
        IPv6 OSPF Settings
        """
        return pulumi.get(self, "ospf_v3")

    @ospf_v3.setter
    def ospf_v3(self, value: Optional[pulumi.Input['SwitchRoutingInterfacesOspfV3Args']]):
        pulumi.set(self, "ospf_v3", value)

    @property
    @pulumi.getter
    def serial(self) -> Optional[pulumi.Input[str]]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

    @serial.setter
    def serial(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "serial", value)

    @property
    @pulumi.getter
    def subnet(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 subnet
        """
        return pulumi.get(self, "subnet")

    @subnet.setter
    def subnet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[int]]:
        """
        VLAN id
        """
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vlan_id", value)


class SwitchRoutingInterfaces(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_gateway: Optional[pulumi.Input[str]] = None,
                 interface_id: Optional[pulumi.Input[str]] = None,
                 interface_ip: Optional[pulumi.Input[str]] = None,
                 ipv6: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesIpv6Args']]] = None,
                 multicast_routing: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ospf_settings: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesOspfSettingsArgs']]] = None,
                 ospf_v3: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesOspfV3Args']]] = None,
                 serial: Optional[pulumi.Input[str]] = None,
                 subnet: Optional[pulumi.Input[str]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:devices/switchRoutingInterfaces:SwitchRoutingInterfaces example "interface_id,serial"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_gateway: IPv4 default gateway
        :param pulumi.Input[str] interface_id: The id
        :param pulumi.Input[str] interface_ip: IPv4 address
        :param pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesIpv6Args']] ipv6: IPv6 addressing
        :param pulumi.Input[str] multicast_routing: Multicast routing status
        :param pulumi.Input[str] name: The name
        :param pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesOspfSettingsArgs']] ospf_settings: IPv4 OSPF Settings
        :param pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesOspfV3Args']] ospf_v3: IPv6 OSPF Settings
        :param pulumi.Input[str] serial: serial path parameter.
        :param pulumi.Input[str] subnet: IPv4 subnet
        :param pulumi.Input[int] vlan_id: VLAN id
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SwitchRoutingInterfacesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:devices/switchRoutingInterfaces:SwitchRoutingInterfaces example "interface_id,serial"
        ```

        :param str resource_name: The name of the resource.
        :param SwitchRoutingInterfacesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SwitchRoutingInterfacesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_gateway: Optional[pulumi.Input[str]] = None,
                 interface_id: Optional[pulumi.Input[str]] = None,
                 interface_ip: Optional[pulumi.Input[str]] = None,
                 ipv6: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesIpv6Args']]] = None,
                 multicast_routing: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ospf_settings: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesOspfSettingsArgs']]] = None,
                 ospf_v3: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesOspfV3Args']]] = None,
                 serial: Optional[pulumi.Input[str]] = None,
                 subnet: Optional[pulumi.Input[str]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SwitchRoutingInterfacesArgs.__new__(SwitchRoutingInterfacesArgs)

            __props__.__dict__["default_gateway"] = default_gateway
            __props__.__dict__["interface_id"] = interface_id
            __props__.__dict__["interface_ip"] = interface_ip
            __props__.__dict__["ipv6"] = ipv6
            __props__.__dict__["multicast_routing"] = multicast_routing
            __props__.__dict__["name"] = name
            __props__.__dict__["ospf_settings"] = ospf_settings
            __props__.__dict__["ospf_v3"] = ospf_v3
            if serial is None and not opts.urn:
                raise TypeError("Missing required property 'serial'")
            __props__.__dict__["serial"] = serial
            __props__.__dict__["subnet"] = subnet
            __props__.__dict__["vlan_id"] = vlan_id
        super(SwitchRoutingInterfaces, __self__).__init__(
            'meraki:devices/switchRoutingInterfaces:SwitchRoutingInterfaces',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            default_gateway: Optional[pulumi.Input[str]] = None,
            interface_id: Optional[pulumi.Input[str]] = None,
            interface_ip: Optional[pulumi.Input[str]] = None,
            ipv6: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesIpv6Args']]] = None,
            multicast_routing: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ospf_settings: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesOspfSettingsArgs']]] = None,
            ospf_v3: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesOspfV3Args']]] = None,
            serial: Optional[pulumi.Input[str]] = None,
            subnet: Optional[pulumi.Input[str]] = None,
            vlan_id: Optional[pulumi.Input[int]] = None) -> 'SwitchRoutingInterfaces':
        """
        Get an existing SwitchRoutingInterfaces resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_gateway: IPv4 default gateway
        :param pulumi.Input[str] interface_id: The id
        :param pulumi.Input[str] interface_ip: IPv4 address
        :param pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesIpv6Args']] ipv6: IPv6 addressing
        :param pulumi.Input[str] multicast_routing: Multicast routing status
        :param pulumi.Input[str] name: The name
        :param pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesOspfSettingsArgs']] ospf_settings: IPv4 OSPF Settings
        :param pulumi.Input[pulumi.InputType['SwitchRoutingInterfacesOspfV3Args']] ospf_v3: IPv6 OSPF Settings
        :param pulumi.Input[str] serial: serial path parameter.
        :param pulumi.Input[str] subnet: IPv4 subnet
        :param pulumi.Input[int] vlan_id: VLAN id
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SwitchRoutingInterfacesState.__new__(_SwitchRoutingInterfacesState)

        __props__.__dict__["default_gateway"] = default_gateway
        __props__.__dict__["interface_id"] = interface_id
        __props__.__dict__["interface_ip"] = interface_ip
        __props__.__dict__["ipv6"] = ipv6
        __props__.__dict__["multicast_routing"] = multicast_routing
        __props__.__dict__["name"] = name
        __props__.__dict__["ospf_settings"] = ospf_settings
        __props__.__dict__["ospf_v3"] = ospf_v3
        __props__.__dict__["serial"] = serial
        __props__.__dict__["subnet"] = subnet
        __props__.__dict__["vlan_id"] = vlan_id
        return SwitchRoutingInterfaces(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="defaultGateway")
    def default_gateway(self) -> pulumi.Output[str]:
        """
        IPv4 default gateway
        """
        return pulumi.get(self, "default_gateway")

    @property
    @pulumi.getter(name="interfaceId")
    def interface_id(self) -> pulumi.Output[str]:
        """
        The id
        """
        return pulumi.get(self, "interface_id")

    @property
    @pulumi.getter(name="interfaceIp")
    def interface_ip(self) -> pulumi.Output[str]:
        """
        IPv4 address
        """
        return pulumi.get(self, "interface_ip")

    @property
    @pulumi.getter
    def ipv6(self) -> pulumi.Output['outputs.SwitchRoutingInterfacesIpv6']:
        """
        IPv6 addressing
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter(name="multicastRouting")
    def multicast_routing(self) -> pulumi.Output[str]:
        """
        Multicast routing status
        """
        return pulumi.get(self, "multicast_routing")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ospfSettings")
    def ospf_settings(self) -> pulumi.Output['outputs.SwitchRoutingInterfacesOspfSettings']:
        """
        IPv4 OSPF Settings
        """
        return pulumi.get(self, "ospf_settings")

    @property
    @pulumi.getter(name="ospfV3")
    def ospf_v3(self) -> pulumi.Output['outputs.SwitchRoutingInterfacesOspfV3']:
        """
        IPv6 OSPF Settings
        """
        return pulumi.get(self, "ospf_v3")

    @property
    @pulumi.getter
    def serial(self) -> pulumi.Output[str]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

    @property
    @pulumi.getter
    def subnet(self) -> pulumi.Output[str]:
        """
        IPv4 subnet
        """
        return pulumi.get(self, "subnet")

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> pulumi.Output[int]:
        """
        VLAN id
        """
        return pulumi.get(self, "vlan_id")
