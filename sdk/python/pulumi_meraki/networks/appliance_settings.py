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

__all__ = ['ApplianceSettingsArgs', 'ApplianceSettings']

@pulumi.input_type
class ApplianceSettingsArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[_builtins.str],
                 client_tracking_method: Optional[pulumi.Input[_builtins.str]] = None,
                 deployment_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 dynamic_dns: Optional[pulumi.Input['ApplianceSettingsDynamicDnsArgs']] = None):
        """
        The set of arguments for constructing a ApplianceSettings resource.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[_builtins.str] client_tracking_method: Client tracking method of a network
        :param pulumi.Input[_builtins.str] deployment_mode: Deployment mode of a network
        :param pulumi.Input['ApplianceSettingsDynamicDnsArgs'] dynamic_dns: Dynamic DNS settings for a network
        """
        pulumi.set(__self__, "network_id", network_id)
        if client_tracking_method is not None:
            pulumi.set(__self__, "client_tracking_method", client_tracking_method)
        if deployment_mode is not None:
            pulumi.set(__self__, "deployment_mode", deployment_mode)
        if dynamic_dns is not None:
            pulumi.set(__self__, "dynamic_dns", dynamic_dns)

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
    @pulumi.getter(name="clientTrackingMethod")
    def client_tracking_method(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Client tracking method of a network
        """
        return pulumi.get(self, "client_tracking_method")

    @client_tracking_method.setter
    def client_tracking_method(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "client_tracking_method", value)

    @_builtins.property
    @pulumi.getter(name="deploymentMode")
    def deployment_mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Deployment mode of a network
        """
        return pulumi.get(self, "deployment_mode")

    @deployment_mode.setter
    def deployment_mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "deployment_mode", value)

    @_builtins.property
    @pulumi.getter(name="dynamicDns")
    def dynamic_dns(self) -> Optional[pulumi.Input['ApplianceSettingsDynamicDnsArgs']]:
        """
        Dynamic DNS settings for a network
        """
        return pulumi.get(self, "dynamic_dns")

    @dynamic_dns.setter
    def dynamic_dns(self, value: Optional[pulumi.Input['ApplianceSettingsDynamicDnsArgs']]):
        pulumi.set(self, "dynamic_dns", value)


@pulumi.input_type
class _ApplianceSettingsState:
    def __init__(__self__, *,
                 client_tracking_method: Optional[pulumi.Input[_builtins.str]] = None,
                 deployment_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 dynamic_dns: Optional[pulumi.Input['ApplianceSettingsDynamicDnsArgs']] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ApplianceSettings resources.
        :param pulumi.Input[_builtins.str] client_tracking_method: Client tracking method of a network
        :param pulumi.Input[_builtins.str] deployment_mode: Deployment mode of a network
        :param pulumi.Input['ApplianceSettingsDynamicDnsArgs'] dynamic_dns: Dynamic DNS settings for a network
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        """
        if client_tracking_method is not None:
            pulumi.set(__self__, "client_tracking_method", client_tracking_method)
        if deployment_mode is not None:
            pulumi.set(__self__, "deployment_mode", deployment_mode)
        if dynamic_dns is not None:
            pulumi.set(__self__, "dynamic_dns", dynamic_dns)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)

    @_builtins.property
    @pulumi.getter(name="clientTrackingMethod")
    def client_tracking_method(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Client tracking method of a network
        """
        return pulumi.get(self, "client_tracking_method")

    @client_tracking_method.setter
    def client_tracking_method(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "client_tracking_method", value)

    @_builtins.property
    @pulumi.getter(name="deploymentMode")
    def deployment_mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Deployment mode of a network
        """
        return pulumi.get(self, "deployment_mode")

    @deployment_mode.setter
    def deployment_mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "deployment_mode", value)

    @_builtins.property
    @pulumi.getter(name="dynamicDns")
    def dynamic_dns(self) -> Optional[pulumi.Input['ApplianceSettingsDynamicDnsArgs']]:
        """
        Dynamic DNS settings for a network
        """
        return pulumi.get(self, "dynamic_dns")

    @dynamic_dns.setter
    def dynamic_dns(self, value: Optional[pulumi.Input['ApplianceSettingsDynamicDnsArgs']]):
        pulumi.set(self, "dynamic_dns", value)

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


@pulumi.type_token("meraki:networks/applianceSettings:ApplianceSettings")
class ApplianceSettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_tracking_method: Optional[pulumi.Input[_builtins.str]] = None,
                 deployment_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 dynamic_dns: Optional[pulumi.Input[Union['ApplianceSettingsDynamicDnsArgs', 'ApplianceSettingsDynamicDnsArgsDict']]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.ApplianceSettings("example",
            client_tracking_method="MAC address",
            deployment_mode="routed",
            dynamic_dns={
                "enabled": True,
                "prefix": "test",
            },
            network_id="string")
        pulumi.export("merakiNetworksApplianceSettingsExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/applianceSettings:ApplianceSettings example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] client_tracking_method: Client tracking method of a network
        :param pulumi.Input[_builtins.str] deployment_mode: Deployment mode of a network
        :param pulumi.Input[Union['ApplianceSettingsDynamicDnsArgs', 'ApplianceSettingsDynamicDnsArgsDict']] dynamic_dns: Dynamic DNS settings for a network
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplianceSettingsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.ApplianceSettings("example",
            client_tracking_method="MAC address",
            deployment_mode="routed",
            dynamic_dns={
                "enabled": True,
                "prefix": "test",
            },
            network_id="string")
        pulumi.export("merakiNetworksApplianceSettingsExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/applianceSettings:ApplianceSettings example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param ApplianceSettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplianceSettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_tracking_method: Optional[pulumi.Input[_builtins.str]] = None,
                 deployment_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 dynamic_dns: Optional[pulumi.Input[Union['ApplianceSettingsDynamicDnsArgs', 'ApplianceSettingsDynamicDnsArgsDict']]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplianceSettingsArgs.__new__(ApplianceSettingsArgs)

            __props__.__dict__["client_tracking_method"] = client_tracking_method
            __props__.__dict__["deployment_mode"] = deployment_mode
            __props__.__dict__["dynamic_dns"] = dynamic_dns
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
        super(ApplianceSettings, __self__).__init__(
            'meraki:networks/applianceSettings:ApplianceSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            client_tracking_method: Optional[pulumi.Input[_builtins.str]] = None,
            deployment_mode: Optional[pulumi.Input[_builtins.str]] = None,
            dynamic_dns: Optional[pulumi.Input[Union['ApplianceSettingsDynamicDnsArgs', 'ApplianceSettingsDynamicDnsArgsDict']]] = None,
            network_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'ApplianceSettings':
        """
        Get an existing ApplianceSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] client_tracking_method: Client tracking method of a network
        :param pulumi.Input[_builtins.str] deployment_mode: Deployment mode of a network
        :param pulumi.Input[Union['ApplianceSettingsDynamicDnsArgs', 'ApplianceSettingsDynamicDnsArgsDict']] dynamic_dns: Dynamic DNS settings for a network
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplianceSettingsState.__new__(_ApplianceSettingsState)

        __props__.__dict__["client_tracking_method"] = client_tracking_method
        __props__.__dict__["deployment_mode"] = deployment_mode
        __props__.__dict__["dynamic_dns"] = dynamic_dns
        __props__.__dict__["network_id"] = network_id
        return ApplianceSettings(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="clientTrackingMethod")
    def client_tracking_method(self) -> pulumi.Output[_builtins.str]:
        """
        Client tracking method of a network
        """
        return pulumi.get(self, "client_tracking_method")

    @_builtins.property
    @pulumi.getter(name="deploymentMode")
    def deployment_mode(self) -> pulumi.Output[_builtins.str]:
        """
        Deployment mode of a network
        """
        return pulumi.get(self, "deployment_mode")

    @_builtins.property
    @pulumi.getter(name="dynamicDns")
    def dynamic_dns(self) -> pulumi.Output['outputs.ApplianceSettingsDynamicDns']:
        """
        Dynamic DNS settings for a network
        """
        return pulumi.get(self, "dynamic_dns")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

