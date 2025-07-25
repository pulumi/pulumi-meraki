# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['AppliancePortsArgs', 'AppliancePorts']

@pulumi.input_type
class AppliancePortsArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[_builtins.str],
                 port_id: pulumi.Input[_builtins.str],
                 access_policy: Optional[pulumi.Input[_builtins.str]] = None,
                 allowed_vlans: Optional[pulumi.Input[_builtins.str]] = None,
                 drop_untagged_traffic: Optional[pulumi.Input[_builtins.bool]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 vlan: Optional[pulumi.Input[_builtins.int]] = None):
        """
        The set of arguments for constructing a AppliancePorts resource.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[_builtins.str] port_id: portId path parameter. Port ID
        :param pulumi.Input[_builtins.str] access_policy: The name of the policy. Only applicable to Access ports.
        :param pulumi.Input[_builtins.str] allowed_vlans: Comma-delimited list of the VLAN ID's allowed on the port, or 'all' to permit all VLAN's on the port.
        :param pulumi.Input[_builtins.bool] drop_untagged_traffic: Whether the trunk port can drop all untagged traffic.
        :param pulumi.Input[_builtins.bool] enabled: The status of the port
        :param pulumi.Input[_builtins.str] type: The type of the port: 'access' or 'trunk'.
        :param pulumi.Input[_builtins.int] vlan: Native VLAN when the port is in Trunk mode. Access VLAN when the port is in Access mode.
        """
        pulumi.set(__self__, "network_id", network_id)
        pulumi.set(__self__, "port_id", port_id)
        if access_policy is not None:
            pulumi.set(__self__, "access_policy", access_policy)
        if allowed_vlans is not None:
            pulumi.set(__self__, "allowed_vlans", allowed_vlans)
        if drop_untagged_traffic is not None:
            pulumi.set(__self__, "drop_untagged_traffic", drop_untagged_traffic)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if vlan is not None:
            pulumi.set(__self__, "vlan", vlan)

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Input[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "network_id", value)

    @_builtins.property
    @pulumi.getter(name="portId")
    def port_id(self) -> pulumi.Input[_builtins.str]:
        """
        portId path parameter. Port ID
        """
        return pulumi.get(self, "port_id")

    @port_id.setter
    def port_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "port_id", value)

    @_builtins.property
    @pulumi.getter(name="accessPolicy")
    def access_policy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the policy. Only applicable to Access ports.
        """
        return pulumi.get(self, "access_policy")

    @access_policy.setter
    def access_policy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "access_policy", value)

    @_builtins.property
    @pulumi.getter(name="allowedVlans")
    def allowed_vlans(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Comma-delimited list of the VLAN ID's allowed on the port, or 'all' to permit all VLAN's on the port.
        """
        return pulumi.get(self, "allowed_vlans")

    @allowed_vlans.setter
    def allowed_vlans(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "allowed_vlans", value)

    @_builtins.property
    @pulumi.getter(name="dropUntaggedTraffic")
    def drop_untagged_traffic(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the trunk port can drop all untagged traffic.
        """
        return pulumi.get(self, "drop_untagged_traffic")

    @drop_untagged_traffic.setter
    def drop_untagged_traffic(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "drop_untagged_traffic", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The status of the port
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the port: 'access' or 'trunk'.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter
    def vlan(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Native VLAN when the port is in Trunk mode. Access VLAN when the port is in Access mode.
        """
        return pulumi.get(self, "vlan")

    @vlan.setter
    def vlan(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "vlan", value)


@pulumi.input_type
class _AppliancePortsState:
    def __init__(__self__, *,
                 access_policy: Optional[pulumi.Input[_builtins.str]] = None,
                 allowed_vlans: Optional[pulumi.Input[_builtins.str]] = None,
                 drop_untagged_traffic: Optional[pulumi.Input[_builtins.bool]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 number: Optional[pulumi.Input[_builtins.int]] = None,
                 port_id: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 vlan: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering AppliancePorts resources.
        :param pulumi.Input[_builtins.str] access_policy: The name of the policy. Only applicable to Access ports.
        :param pulumi.Input[_builtins.str] allowed_vlans: Comma-delimited list of the VLAN ID's allowed on the port, or 'all' to permit all VLAN's on the port.
        :param pulumi.Input[_builtins.bool] drop_untagged_traffic: Whether the trunk port can drop all untagged traffic.
        :param pulumi.Input[_builtins.bool] enabled: The status of the port
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[_builtins.int] number: Number of the port
        :param pulumi.Input[_builtins.str] port_id: portId path parameter. Port ID
        :param pulumi.Input[_builtins.str] type: The type of the port: 'access' or 'trunk'.
        :param pulumi.Input[_builtins.int] vlan: Native VLAN when the port is in Trunk mode. Access VLAN when the port is in Access mode.
        """
        if access_policy is not None:
            pulumi.set(__self__, "access_policy", access_policy)
        if allowed_vlans is not None:
            pulumi.set(__self__, "allowed_vlans", allowed_vlans)
        if drop_untagged_traffic is not None:
            pulumi.set(__self__, "drop_untagged_traffic", drop_untagged_traffic)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if number is not None:
            pulumi.set(__self__, "number", number)
        if port_id is not None:
            pulumi.set(__self__, "port_id", port_id)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if vlan is not None:
            pulumi.set(__self__, "vlan", vlan)

    @_builtins.property
    @pulumi.getter(name="accessPolicy")
    def access_policy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the policy. Only applicable to Access ports.
        """
        return pulumi.get(self, "access_policy")

    @access_policy.setter
    def access_policy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "access_policy", value)

    @_builtins.property
    @pulumi.getter(name="allowedVlans")
    def allowed_vlans(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Comma-delimited list of the VLAN ID's allowed on the port, or 'all' to permit all VLAN's on the port.
        """
        return pulumi.get(self, "allowed_vlans")

    @allowed_vlans.setter
    def allowed_vlans(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "allowed_vlans", value)

    @_builtins.property
    @pulumi.getter(name="dropUntaggedTraffic")
    def drop_untagged_traffic(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the trunk port can drop all untagged traffic.
        """
        return pulumi.get(self, "drop_untagged_traffic")

    @drop_untagged_traffic.setter
    def drop_untagged_traffic(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "drop_untagged_traffic", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The status of the port
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network_id", value)

    @_builtins.property
    @pulumi.getter
    def number(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Number of the port
        """
        return pulumi.get(self, "number")

    @number.setter
    def number(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "number", value)

    @_builtins.property
    @pulumi.getter(name="portId")
    def port_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        portId path parameter. Port ID
        """
        return pulumi.get(self, "port_id")

    @port_id.setter
    def port_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "port_id", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the port: 'access' or 'trunk'.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter
    def vlan(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Native VLAN when the port is in Trunk mode. Access VLAN when the port is in Access mode.
        """
        return pulumi.get(self, "vlan")

    @vlan.setter
    def vlan(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "vlan", value)


@pulumi.type_token("meraki:networks/appliancePorts:AppliancePorts")
class AppliancePorts(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_policy: Optional[pulumi.Input[_builtins.str]] = None,
                 allowed_vlans: Optional[pulumi.Input[_builtins.str]] = None,
                 drop_untagged_traffic: Optional[pulumi.Input[_builtins.bool]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 port_id: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 vlan: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.AppliancePorts("example",
            access_policy="open",
            allowed_vlans="all",
            drop_untagged_traffic=False,
            enabled=True,
            network_id="string",
            port_id="string",
            type="access",
            vlan=3)
        pulumi.export("merakiNetworksAppliancePortsExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/appliancePorts:AppliancePorts example "network_id,port_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] access_policy: The name of the policy. Only applicable to Access ports.
        :param pulumi.Input[_builtins.str] allowed_vlans: Comma-delimited list of the VLAN ID's allowed on the port, or 'all' to permit all VLAN's on the port.
        :param pulumi.Input[_builtins.bool] drop_untagged_traffic: Whether the trunk port can drop all untagged traffic.
        :param pulumi.Input[_builtins.bool] enabled: The status of the port
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[_builtins.str] port_id: portId path parameter. Port ID
        :param pulumi.Input[_builtins.str] type: The type of the port: 'access' or 'trunk'.
        :param pulumi.Input[_builtins.int] vlan: Native VLAN when the port is in Trunk mode. Access VLAN when the port is in Access mode.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppliancePortsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.AppliancePorts("example",
            access_policy="open",
            allowed_vlans="all",
            drop_untagged_traffic=False,
            enabled=True,
            network_id="string",
            port_id="string",
            type="access",
            vlan=3)
        pulumi.export("merakiNetworksAppliancePortsExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/appliancePorts:AppliancePorts example "network_id,port_id"
        ```

        :param str resource_name: The name of the resource.
        :param AppliancePortsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppliancePortsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_policy: Optional[pulumi.Input[_builtins.str]] = None,
                 allowed_vlans: Optional[pulumi.Input[_builtins.str]] = None,
                 drop_untagged_traffic: Optional[pulumi.Input[_builtins.bool]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 port_id: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 vlan: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppliancePortsArgs.__new__(AppliancePortsArgs)

            __props__.__dict__["access_policy"] = access_policy
            __props__.__dict__["allowed_vlans"] = allowed_vlans
            __props__.__dict__["drop_untagged_traffic"] = drop_untagged_traffic
            __props__.__dict__["enabled"] = enabled
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            if port_id is None and not opts.urn:
                raise TypeError("Missing required property 'port_id'")
            __props__.__dict__["port_id"] = port_id
            __props__.__dict__["type"] = type
            __props__.__dict__["vlan"] = vlan
            __props__.__dict__["number"] = None
        super(AppliancePorts, __self__).__init__(
            'meraki:networks/appliancePorts:AppliancePorts',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_policy: Optional[pulumi.Input[_builtins.str]] = None,
            allowed_vlans: Optional[pulumi.Input[_builtins.str]] = None,
            drop_untagged_traffic: Optional[pulumi.Input[_builtins.bool]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            network_id: Optional[pulumi.Input[_builtins.str]] = None,
            number: Optional[pulumi.Input[_builtins.int]] = None,
            port_id: Optional[pulumi.Input[_builtins.str]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None,
            vlan: Optional[pulumi.Input[_builtins.int]] = None) -> 'AppliancePorts':
        """
        Get an existing AppliancePorts resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] access_policy: The name of the policy. Only applicable to Access ports.
        :param pulumi.Input[_builtins.str] allowed_vlans: Comma-delimited list of the VLAN ID's allowed on the port, or 'all' to permit all VLAN's on the port.
        :param pulumi.Input[_builtins.bool] drop_untagged_traffic: Whether the trunk port can drop all untagged traffic.
        :param pulumi.Input[_builtins.bool] enabled: The status of the port
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[_builtins.int] number: Number of the port
        :param pulumi.Input[_builtins.str] port_id: portId path parameter. Port ID
        :param pulumi.Input[_builtins.str] type: The type of the port: 'access' or 'trunk'.
        :param pulumi.Input[_builtins.int] vlan: Native VLAN when the port is in Trunk mode. Access VLAN when the port is in Access mode.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppliancePortsState.__new__(_AppliancePortsState)

        __props__.__dict__["access_policy"] = access_policy
        __props__.__dict__["allowed_vlans"] = allowed_vlans
        __props__.__dict__["drop_untagged_traffic"] = drop_untagged_traffic
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["number"] = number
        __props__.__dict__["port_id"] = port_id
        __props__.__dict__["type"] = type
        __props__.__dict__["vlan"] = vlan
        return AppliancePorts(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accessPolicy")
    def access_policy(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the policy. Only applicable to Access ports.
        """
        return pulumi.get(self, "access_policy")

    @_builtins.property
    @pulumi.getter(name="allowedVlans")
    def allowed_vlans(self) -> pulumi.Output[_builtins.str]:
        """
        Comma-delimited list of the VLAN ID's allowed on the port, or 'all' to permit all VLAN's on the port.
        """
        return pulumi.get(self, "allowed_vlans")

    @_builtins.property
    @pulumi.getter(name="dropUntaggedTraffic")
    def drop_untagged_traffic(self) -> pulumi.Output[_builtins.bool]:
        """
        Whether the trunk port can drop all untagged traffic.
        """
        return pulumi.get(self, "drop_untagged_traffic")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        The status of the port
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @_builtins.property
    @pulumi.getter
    def number(self) -> pulumi.Output[_builtins.int]:
        """
        Number of the port
        """
        return pulumi.get(self, "number")

    @_builtins.property
    @pulumi.getter(name="portId")
    def port_id(self) -> pulumi.Output[_builtins.str]:
        """
        portId path parameter. Port ID
        """
        return pulumi.get(self, "port_id")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[_builtins.str]:
        """
        The type of the port: 'access' or 'trunk'.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter
    def vlan(self) -> pulumi.Output[_builtins.int]:
        """
        Native VLAN when the port is in Trunk mode. Access VLAN when the port is in Access mode.
        """
        return pulumi.get(self, "vlan")

