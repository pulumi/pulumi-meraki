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

__all__ = ['SwitchRoutingMulticastArgs', 'SwitchRoutingMulticast']

@pulumi.input_type
class SwitchRoutingMulticastArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[str],
                 default_settings: Optional[pulumi.Input['SwitchRoutingMulticastDefaultSettingsArgs']] = None,
                 overrides: Optional[pulumi.Input[Sequence[pulumi.Input['SwitchRoutingMulticastOverrideArgs']]]] = None):
        """
        The set of arguments for constructing a SwitchRoutingMulticast resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input['SwitchRoutingMulticastDefaultSettingsArgs'] default_settings: Default multicast setting for entire network. IGMP snooping and Flood unknown
                 multicast traffic settings are enabled by default.
        :param pulumi.Input[Sequence[pulumi.Input['SwitchRoutingMulticastOverrideArgs']]] overrides: Array of paired switches/stacks/profiles and corresponding multicast settings.
                 An empty array will clear the multicast settings.
        """
        pulumi.set(__self__, "network_id", network_id)
        if default_settings is not None:
            pulumi.set(__self__, "default_settings", default_settings)
        if overrides is not None:
            pulumi.set(__self__, "overrides", overrides)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Input[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter(name="defaultSettings")
    def default_settings(self) -> Optional[pulumi.Input['SwitchRoutingMulticastDefaultSettingsArgs']]:
        """
        Default multicast setting for entire network. IGMP snooping and Flood unknown
          multicast traffic settings are enabled by default.
        """
        return pulumi.get(self, "default_settings")

    @default_settings.setter
    def default_settings(self, value: Optional[pulumi.Input['SwitchRoutingMulticastDefaultSettingsArgs']]):
        pulumi.set(self, "default_settings", value)

    @property
    @pulumi.getter
    def overrides(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SwitchRoutingMulticastOverrideArgs']]]]:
        """
        Array of paired switches/stacks/profiles and corresponding multicast settings.
          An empty array will clear the multicast settings.
        """
        return pulumi.get(self, "overrides")

    @overrides.setter
    def overrides(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SwitchRoutingMulticastOverrideArgs']]]]):
        pulumi.set(self, "overrides", value)


@pulumi.input_type
class _SwitchRoutingMulticastState:
    def __init__(__self__, *,
                 default_settings: Optional[pulumi.Input['SwitchRoutingMulticastDefaultSettingsArgs']] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 overrides: Optional[pulumi.Input[Sequence[pulumi.Input['SwitchRoutingMulticastOverrideArgs']]]] = None):
        """
        Input properties used for looking up and filtering SwitchRoutingMulticast resources.
        :param pulumi.Input['SwitchRoutingMulticastDefaultSettingsArgs'] default_settings: Default multicast setting for entire network. IGMP snooping and Flood unknown
                 multicast traffic settings are enabled by default.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input['SwitchRoutingMulticastOverrideArgs']]] overrides: Array of paired switches/stacks/profiles and corresponding multicast settings.
                 An empty array will clear the multicast settings.
        """
        if default_settings is not None:
            pulumi.set(__self__, "default_settings", default_settings)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if overrides is not None:
            pulumi.set(__self__, "overrides", overrides)

    @property
    @pulumi.getter(name="defaultSettings")
    def default_settings(self) -> Optional[pulumi.Input['SwitchRoutingMulticastDefaultSettingsArgs']]:
        """
        Default multicast setting for entire network. IGMP snooping and Flood unknown
          multicast traffic settings are enabled by default.
        """
        return pulumi.get(self, "default_settings")

    @default_settings.setter
    def default_settings(self, value: Optional[pulumi.Input['SwitchRoutingMulticastDefaultSettingsArgs']]):
        pulumi.set(self, "default_settings", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[str]]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter
    def overrides(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SwitchRoutingMulticastOverrideArgs']]]]:
        """
        Array of paired switches/stacks/profiles and corresponding multicast settings.
          An empty array will clear the multicast settings.
        """
        return pulumi.get(self, "overrides")

    @overrides.setter
    def overrides(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SwitchRoutingMulticastOverrideArgs']]]]):
        pulumi.set(self, "overrides", value)


class SwitchRoutingMulticast(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_settings: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingMulticastDefaultSettingsArgs']]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 overrides: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwitchRoutingMulticastOverrideArgs']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/switchRoutingMulticast:SwitchRoutingMulticast example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['SwitchRoutingMulticastDefaultSettingsArgs']] default_settings: Default multicast setting for entire network. IGMP snooping and Flood unknown
                 multicast traffic settings are enabled by default.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwitchRoutingMulticastOverrideArgs']]]] overrides: Array of paired switches/stacks/profiles and corresponding multicast settings.
                 An empty array will clear the multicast settings.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SwitchRoutingMulticastArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/switchRoutingMulticast:SwitchRoutingMulticast example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param SwitchRoutingMulticastArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SwitchRoutingMulticastArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_settings: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingMulticastDefaultSettingsArgs']]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 overrides: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwitchRoutingMulticastOverrideArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SwitchRoutingMulticastArgs.__new__(SwitchRoutingMulticastArgs)

            __props__.__dict__["default_settings"] = default_settings
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["overrides"] = overrides
        super(SwitchRoutingMulticast, __self__).__init__(
            'meraki:networks/switchRoutingMulticast:SwitchRoutingMulticast',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            default_settings: Optional[pulumi.Input[pulumi.InputType['SwitchRoutingMulticastDefaultSettingsArgs']]] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            overrides: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwitchRoutingMulticastOverrideArgs']]]]] = None) -> 'SwitchRoutingMulticast':
        """
        Get an existing SwitchRoutingMulticast resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['SwitchRoutingMulticastDefaultSettingsArgs']] default_settings: Default multicast setting for entire network. IGMP snooping and Flood unknown
                 multicast traffic settings are enabled by default.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SwitchRoutingMulticastOverrideArgs']]]] overrides: Array of paired switches/stacks/profiles and corresponding multicast settings.
                 An empty array will clear the multicast settings.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SwitchRoutingMulticastState.__new__(_SwitchRoutingMulticastState)

        __props__.__dict__["default_settings"] = default_settings
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["overrides"] = overrides
        return SwitchRoutingMulticast(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="defaultSettings")
    def default_settings(self) -> pulumi.Output['outputs.SwitchRoutingMulticastDefaultSettings']:
        """
        Default multicast setting for entire network. IGMP snooping and Flood unknown
          multicast traffic settings are enabled by default.
        """
        return pulumi.get(self, "default_settings")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def overrides(self) -> pulumi.Output[Sequence['outputs.SwitchRoutingMulticastOverride']]:
        """
        Array of paired switches/stacks/profiles and corresponding multicast settings.
          An empty array will clear the multicast settings.
        """
        return pulumi.get(self, "overrides")
