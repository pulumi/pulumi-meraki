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

__all__ = ['ApplianceVpnSiteToSiteVpnArgs', 'ApplianceVpnSiteToSiteVpn']

@pulumi.input_type
class ApplianceVpnSiteToSiteVpnArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[_builtins.str],
                 hubs: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnHubArgs']]]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnSubnetArgs']]]] = None):
        """
        The set of arguments for constructing a ApplianceVpnSiteToSiteVpn resource.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnHubArgs']]] hubs: The list of VPN hubs, in order of preference.
        :param pulumi.Input[_builtins.str] mode: The site-to-site VPN mode.
        :param pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnSubnetArgs']]] subnets: The list of subnets and their VPN presence.
        """
        pulumi.set(__self__, "network_id", network_id)
        if hubs is not None:
            pulumi.set(__self__, "hubs", hubs)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if subnets is not None:
            pulumi.set(__self__, "subnets", subnets)

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
    @pulumi.getter
    def hubs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnHubArgs']]]]:
        """
        The list of VPN hubs, in order of preference.
        """
        return pulumi.get(self, "hubs")

    @hubs.setter
    def hubs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnHubArgs']]]]):
        pulumi.set(self, "hubs", value)

    @_builtins.property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The site-to-site VPN mode.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mode", value)

    @_builtins.property
    @pulumi.getter
    def subnets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnSubnetArgs']]]]:
        """
        The list of subnets and their VPN presence.
        """
        return pulumi.get(self, "subnets")

    @subnets.setter
    def subnets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnSubnetArgs']]]]):
        pulumi.set(self, "subnets", value)


@pulumi.input_type
class _ApplianceVpnSiteToSiteVpnState:
    def __init__(__self__, *,
                 hubs: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnHubArgs']]]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnSubnetArgs']]]] = None):
        """
        Input properties used for looking up and filtering ApplianceVpnSiteToSiteVpn resources.
        :param pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnHubArgs']]] hubs: The list of VPN hubs, in order of preference.
        :param pulumi.Input[_builtins.str] mode: The site-to-site VPN mode.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnSubnetArgs']]] subnets: The list of subnets and their VPN presence.
        """
        if hubs is not None:
            pulumi.set(__self__, "hubs", hubs)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if subnets is not None:
            pulumi.set(__self__, "subnets", subnets)

    @_builtins.property
    @pulumi.getter
    def hubs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnHubArgs']]]]:
        """
        The list of VPN hubs, in order of preference.
        """
        return pulumi.get(self, "hubs")

    @hubs.setter
    def hubs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnHubArgs']]]]):
        pulumi.set(self, "hubs", value)

    @_builtins.property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The site-to-site VPN mode.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mode", value)

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
    def subnets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnSubnetArgs']]]]:
        """
        The list of subnets and their VPN presence.
        """
        return pulumi.get(self, "subnets")

    @subnets.setter
    def subnets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceVpnSiteToSiteVpnSubnetArgs']]]]):
        pulumi.set(self, "subnets", value)


@pulumi.type_token("meraki:networks/applianceVpnSiteToSiteVpn:ApplianceVpnSiteToSiteVpn")
class ApplianceVpnSiteToSiteVpn(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hubs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplianceVpnSiteToSiteVpnHubArgs', 'ApplianceVpnSiteToSiteVpnHubArgsDict']]]]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplianceVpnSiteToSiteVpnSubnetArgs', 'ApplianceVpnSiteToSiteVpnSubnetArgsDict']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/applianceVpnSiteToSiteVpn:ApplianceVpnSiteToSiteVpn example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApplianceVpnSiteToSiteVpnHubArgs', 'ApplianceVpnSiteToSiteVpnHubArgsDict']]]] hubs: The list of VPN hubs, in order of preference.
        :param pulumi.Input[_builtins.str] mode: The site-to-site VPN mode.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApplianceVpnSiteToSiteVpnSubnetArgs', 'ApplianceVpnSiteToSiteVpnSubnetArgsDict']]]] subnets: The list of subnets and their VPN presence.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplianceVpnSiteToSiteVpnArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/applianceVpnSiteToSiteVpn:ApplianceVpnSiteToSiteVpn example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param ApplianceVpnSiteToSiteVpnArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplianceVpnSiteToSiteVpnArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hubs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplianceVpnSiteToSiteVpnHubArgs', 'ApplianceVpnSiteToSiteVpnHubArgsDict']]]]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplianceVpnSiteToSiteVpnSubnetArgs', 'ApplianceVpnSiteToSiteVpnSubnetArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplianceVpnSiteToSiteVpnArgs.__new__(ApplianceVpnSiteToSiteVpnArgs)

            __props__.__dict__["hubs"] = hubs
            __props__.__dict__["mode"] = mode
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["subnets"] = subnets
        super(ApplianceVpnSiteToSiteVpn, __self__).__init__(
            'meraki:networks/applianceVpnSiteToSiteVpn:ApplianceVpnSiteToSiteVpn',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            hubs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplianceVpnSiteToSiteVpnHubArgs', 'ApplianceVpnSiteToSiteVpnHubArgsDict']]]]] = None,
            mode: Optional[pulumi.Input[_builtins.str]] = None,
            network_id: Optional[pulumi.Input[_builtins.str]] = None,
            subnets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplianceVpnSiteToSiteVpnSubnetArgs', 'ApplianceVpnSiteToSiteVpnSubnetArgsDict']]]]] = None) -> 'ApplianceVpnSiteToSiteVpn':
        """
        Get an existing ApplianceVpnSiteToSiteVpn resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApplianceVpnSiteToSiteVpnHubArgs', 'ApplianceVpnSiteToSiteVpnHubArgsDict']]]] hubs: The list of VPN hubs, in order of preference.
        :param pulumi.Input[_builtins.str] mode: The site-to-site VPN mode.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApplianceVpnSiteToSiteVpnSubnetArgs', 'ApplianceVpnSiteToSiteVpnSubnetArgsDict']]]] subnets: The list of subnets and their VPN presence.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplianceVpnSiteToSiteVpnState.__new__(_ApplianceVpnSiteToSiteVpnState)

        __props__.__dict__["hubs"] = hubs
        __props__.__dict__["mode"] = mode
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["subnets"] = subnets
        return ApplianceVpnSiteToSiteVpn(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def hubs(self) -> pulumi.Output[Sequence['outputs.ApplianceVpnSiteToSiteVpnHub']]:
        """
        The list of VPN hubs, in order of preference.
        """
        return pulumi.get(self, "hubs")

    @_builtins.property
    @pulumi.getter
    def mode(self) -> pulumi.Output[_builtins.str]:
        """
        The site-to-site VPN mode.
        """
        return pulumi.get(self, "mode")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @_builtins.property
    @pulumi.getter
    def subnets(self) -> pulumi.Output[Sequence['outputs.ApplianceVpnSiteToSiteVpnSubnet']]:
        """
        The list of subnets and their VPN presence.
        """
        return pulumi.get(self, "subnets")

