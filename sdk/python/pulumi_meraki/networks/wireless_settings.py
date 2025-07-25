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
from . import outputs
from ._inputs import *

__all__ = ['WirelessSettingsArgs', 'WirelessSettings']

@pulumi.input_type
class WirelessSettingsArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[_builtins.str],
                 ipv6_bridge_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 led_lights_on: Optional[pulumi.Input[_builtins.bool]] = None,
                 location_analytics_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 meshing_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 named_vlans: Optional[pulumi.Input['WirelessSettingsNamedVlansArgs']] = None,
                 upgradestrategy: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a WirelessSettings resource.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[_builtins.bool] ipv6_bridge_enabled: Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
        :param pulumi.Input[_builtins.bool] led_lights_on: Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
        :param pulumi.Input[_builtins.bool] location_analytics_enabled: Toggle for enabling or disabling location analytics for your network
        :param pulumi.Input[_builtins.bool] meshing_enabled: Toggle for enabling or disabling meshing in a network
        :param pulumi.Input['WirelessSettingsNamedVlansArgs'] named_vlans: Named VLAN settings for wireless networks.
        :param pulumi.Input[_builtins.str] upgradestrategy: The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
        """
        pulumi.set(__self__, "network_id", network_id)
        if ipv6_bridge_enabled is not None:
            pulumi.set(__self__, "ipv6_bridge_enabled", ipv6_bridge_enabled)
        if led_lights_on is not None:
            pulumi.set(__self__, "led_lights_on", led_lights_on)
        if location_analytics_enabled is not None:
            pulumi.set(__self__, "location_analytics_enabled", location_analytics_enabled)
        if meshing_enabled is not None:
            pulumi.set(__self__, "meshing_enabled", meshing_enabled)
        if named_vlans is not None:
            pulumi.set(__self__, "named_vlans", named_vlans)
        if upgradestrategy is not None:
            pulumi.set(__self__, "upgradestrategy", upgradestrategy)

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
    @pulumi.getter(name="ipv6BridgeEnabled")
    def ipv6_bridge_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
        """
        return pulumi.get(self, "ipv6_bridge_enabled")

    @ipv6_bridge_enabled.setter
    def ipv6_bridge_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "ipv6_bridge_enabled", value)

    @_builtins.property
    @pulumi.getter(name="ledLightsOn")
    def led_lights_on(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
        """
        return pulumi.get(self, "led_lights_on")

    @led_lights_on.setter
    def led_lights_on(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "led_lights_on", value)

    @_builtins.property
    @pulumi.getter(name="locationAnalyticsEnabled")
    def location_analytics_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Toggle for enabling or disabling location analytics for your network
        """
        return pulumi.get(self, "location_analytics_enabled")

    @location_analytics_enabled.setter
    def location_analytics_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "location_analytics_enabled", value)

    @_builtins.property
    @pulumi.getter(name="meshingEnabled")
    def meshing_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Toggle for enabling or disabling meshing in a network
        """
        return pulumi.get(self, "meshing_enabled")

    @meshing_enabled.setter
    def meshing_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "meshing_enabled", value)

    @_builtins.property
    @pulumi.getter(name="namedVlans")
    def named_vlans(self) -> Optional[pulumi.Input['WirelessSettingsNamedVlansArgs']]:
        """
        Named VLAN settings for wireless networks.
        """
        return pulumi.get(self, "named_vlans")

    @named_vlans.setter
    def named_vlans(self, value: Optional[pulumi.Input['WirelessSettingsNamedVlansArgs']]):
        pulumi.set(self, "named_vlans", value)

    @_builtins.property
    @pulumi.getter
    def upgradestrategy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
        """
        return pulumi.get(self, "upgradestrategy")

    @upgradestrategy.setter
    def upgradestrategy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "upgradestrategy", value)


@pulumi.input_type
class _WirelessSettingsState:
    def __init__(__self__, *,
                 ipv6_bridge_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 led_lights_on: Optional[pulumi.Input[_builtins.bool]] = None,
                 location_analytics_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 meshing_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 named_vlans: Optional[pulumi.Input['WirelessSettingsNamedVlansArgs']] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 regulatory_domain: Optional[pulumi.Input['WirelessSettingsRegulatoryDomainArgs']] = None,
                 upgradestrategy: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering WirelessSettings resources.
        :param pulumi.Input[_builtins.bool] ipv6_bridge_enabled: Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
        :param pulumi.Input[_builtins.bool] led_lights_on: Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
        :param pulumi.Input[_builtins.bool] location_analytics_enabled: Toggle for enabling or disabling location analytics for your network
        :param pulumi.Input[_builtins.bool] meshing_enabled: Toggle for enabling or disabling meshing in a network
        :param pulumi.Input['WirelessSettingsNamedVlansArgs'] named_vlans: Named VLAN settings for wireless networks.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input['WirelessSettingsRegulatoryDomainArgs'] regulatory_domain: Regulatory domain information for this network.
        :param pulumi.Input[_builtins.str] upgradestrategy: The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
        """
        if ipv6_bridge_enabled is not None:
            pulumi.set(__self__, "ipv6_bridge_enabled", ipv6_bridge_enabled)
        if led_lights_on is not None:
            pulumi.set(__self__, "led_lights_on", led_lights_on)
        if location_analytics_enabled is not None:
            pulumi.set(__self__, "location_analytics_enabled", location_analytics_enabled)
        if meshing_enabled is not None:
            pulumi.set(__self__, "meshing_enabled", meshing_enabled)
        if named_vlans is not None:
            pulumi.set(__self__, "named_vlans", named_vlans)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if regulatory_domain is not None:
            pulumi.set(__self__, "regulatory_domain", regulatory_domain)
        if upgradestrategy is not None:
            pulumi.set(__self__, "upgradestrategy", upgradestrategy)

    @_builtins.property
    @pulumi.getter(name="ipv6BridgeEnabled")
    def ipv6_bridge_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
        """
        return pulumi.get(self, "ipv6_bridge_enabled")

    @ipv6_bridge_enabled.setter
    def ipv6_bridge_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "ipv6_bridge_enabled", value)

    @_builtins.property
    @pulumi.getter(name="ledLightsOn")
    def led_lights_on(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
        """
        return pulumi.get(self, "led_lights_on")

    @led_lights_on.setter
    def led_lights_on(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "led_lights_on", value)

    @_builtins.property
    @pulumi.getter(name="locationAnalyticsEnabled")
    def location_analytics_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Toggle for enabling or disabling location analytics for your network
        """
        return pulumi.get(self, "location_analytics_enabled")

    @location_analytics_enabled.setter
    def location_analytics_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "location_analytics_enabled", value)

    @_builtins.property
    @pulumi.getter(name="meshingEnabled")
    def meshing_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Toggle for enabling or disabling meshing in a network
        """
        return pulumi.get(self, "meshing_enabled")

    @meshing_enabled.setter
    def meshing_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "meshing_enabled", value)

    @_builtins.property
    @pulumi.getter(name="namedVlans")
    def named_vlans(self) -> Optional[pulumi.Input['WirelessSettingsNamedVlansArgs']]:
        """
        Named VLAN settings for wireless networks.
        """
        return pulumi.get(self, "named_vlans")

    @named_vlans.setter
    def named_vlans(self, value: Optional[pulumi.Input['WirelessSettingsNamedVlansArgs']]):
        pulumi.set(self, "named_vlans", value)

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
    @pulumi.getter(name="regulatoryDomain")
    def regulatory_domain(self) -> Optional[pulumi.Input['WirelessSettingsRegulatoryDomainArgs']]:
        """
        Regulatory domain information for this network.
        """
        return pulumi.get(self, "regulatory_domain")

    @regulatory_domain.setter
    def regulatory_domain(self, value: Optional[pulumi.Input['WirelessSettingsRegulatoryDomainArgs']]):
        pulumi.set(self, "regulatory_domain", value)

    @_builtins.property
    @pulumi.getter
    def upgradestrategy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
        """
        return pulumi.get(self, "upgradestrategy")

    @upgradestrategy.setter
    def upgradestrategy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "upgradestrategy", value)


@pulumi.type_token("meraki:networks/wirelessSettings:WirelessSettings")
class WirelessSettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ipv6_bridge_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 led_lights_on: Optional[pulumi.Input[_builtins.bool]] = None,
                 location_analytics_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 meshing_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 named_vlans: Optional[pulumi.Input[Union['WirelessSettingsNamedVlansArgs', 'WirelessSettingsNamedVlansArgsDict']]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 upgradestrategy: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/wirelessSettings:WirelessSettings example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] ipv6_bridge_enabled: Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
        :param pulumi.Input[_builtins.bool] led_lights_on: Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
        :param pulumi.Input[_builtins.bool] location_analytics_enabled: Toggle for enabling or disabling location analytics for your network
        :param pulumi.Input[_builtins.bool] meshing_enabled: Toggle for enabling or disabling meshing in a network
        :param pulumi.Input[Union['WirelessSettingsNamedVlansArgs', 'WirelessSettingsNamedVlansArgsDict']] named_vlans: Named VLAN settings for wireless networks.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[_builtins.str] upgradestrategy: The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WirelessSettingsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/wirelessSettings:WirelessSettings example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param WirelessSettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WirelessSettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ipv6_bridge_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 led_lights_on: Optional[pulumi.Input[_builtins.bool]] = None,
                 location_analytics_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 meshing_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 named_vlans: Optional[pulumi.Input[Union['WirelessSettingsNamedVlansArgs', 'WirelessSettingsNamedVlansArgsDict']]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 upgradestrategy: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WirelessSettingsArgs.__new__(WirelessSettingsArgs)

            __props__.__dict__["ipv6_bridge_enabled"] = ipv6_bridge_enabled
            __props__.__dict__["led_lights_on"] = led_lights_on
            __props__.__dict__["location_analytics_enabled"] = location_analytics_enabled
            __props__.__dict__["meshing_enabled"] = meshing_enabled
            __props__.__dict__["named_vlans"] = named_vlans
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["upgradestrategy"] = upgradestrategy
            __props__.__dict__["regulatory_domain"] = None
        super(WirelessSettings, __self__).__init__(
            'meraki:networks/wirelessSettings:WirelessSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ipv6_bridge_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            led_lights_on: Optional[pulumi.Input[_builtins.bool]] = None,
            location_analytics_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            meshing_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            named_vlans: Optional[pulumi.Input[Union['WirelessSettingsNamedVlansArgs', 'WirelessSettingsNamedVlansArgsDict']]] = None,
            network_id: Optional[pulumi.Input[_builtins.str]] = None,
            regulatory_domain: Optional[pulumi.Input[Union['WirelessSettingsRegulatoryDomainArgs', 'WirelessSettingsRegulatoryDomainArgsDict']]] = None,
            upgradestrategy: Optional[pulumi.Input[_builtins.str]] = None) -> 'WirelessSettings':
        """
        Get an existing WirelessSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] ipv6_bridge_enabled: Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
        :param pulumi.Input[_builtins.bool] led_lights_on: Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
        :param pulumi.Input[_builtins.bool] location_analytics_enabled: Toggle for enabling or disabling location analytics for your network
        :param pulumi.Input[_builtins.bool] meshing_enabled: Toggle for enabling or disabling meshing in a network
        :param pulumi.Input[Union['WirelessSettingsNamedVlansArgs', 'WirelessSettingsNamedVlansArgsDict']] named_vlans: Named VLAN settings for wireless networks.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Union['WirelessSettingsRegulatoryDomainArgs', 'WirelessSettingsRegulatoryDomainArgsDict']] regulatory_domain: Regulatory domain information for this network.
        :param pulumi.Input[_builtins.str] upgradestrategy: The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WirelessSettingsState.__new__(_WirelessSettingsState)

        __props__.__dict__["ipv6_bridge_enabled"] = ipv6_bridge_enabled
        __props__.__dict__["led_lights_on"] = led_lights_on
        __props__.__dict__["location_analytics_enabled"] = location_analytics_enabled
        __props__.__dict__["meshing_enabled"] = meshing_enabled
        __props__.__dict__["named_vlans"] = named_vlans
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["regulatory_domain"] = regulatory_domain
        __props__.__dict__["upgradestrategy"] = upgradestrategy
        return WirelessSettings(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="ipv6BridgeEnabled")
    def ipv6_bridge_enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
        """
        return pulumi.get(self, "ipv6_bridge_enabled")

    @_builtins.property
    @pulumi.getter(name="ledLightsOn")
    def led_lights_on(self) -> pulumi.Output[_builtins.bool]:
        """
        Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
        """
        return pulumi.get(self, "led_lights_on")

    @_builtins.property
    @pulumi.getter(name="locationAnalyticsEnabled")
    def location_analytics_enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        Toggle for enabling or disabling location analytics for your network
        """
        return pulumi.get(self, "location_analytics_enabled")

    @_builtins.property
    @pulumi.getter(name="meshingEnabled")
    def meshing_enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        Toggle for enabling or disabling meshing in a network
        """
        return pulumi.get(self, "meshing_enabled")

    @_builtins.property
    @pulumi.getter(name="namedVlans")
    def named_vlans(self) -> pulumi.Output['outputs.WirelessSettingsNamedVlans']:
        """
        Named VLAN settings for wireless networks.
        """
        return pulumi.get(self, "named_vlans")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @_builtins.property
    @pulumi.getter(name="regulatoryDomain")
    def regulatory_domain(self) -> pulumi.Output['outputs.WirelessSettingsRegulatoryDomain']:
        """
        Regulatory domain information for this network.
        """
        return pulumi.get(self, "regulatory_domain")

    @_builtins.property
    @pulumi.getter
    def upgradestrategy(self) -> pulumi.Output[_builtins.str]:
        """
        The upgrade strategy to apply to the network. Must be one of 'minimizeUpgradeTime' or 'minimizeClientDowntime'. Requires firmware version MR 26.8 or higher'
        """
        return pulumi.get(self, "upgradestrategy")

