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

__all__ = ['ApplianceTrafficShapingUplinkBandwidthArgs', 'ApplianceTrafficShapingUplinkBandwidth']

@pulumi.input_type
class ApplianceTrafficShapingUplinkBandwidthArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[str],
                 bandwidth_limits: Optional[pulumi.Input['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']] = None):
        """
        The set of arguments for constructing a ApplianceTrafficShapingUplinkBandwidth resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs'] bandwidth_limits: A hash uplink keys and their configured settings for the Appliance
        """
        pulumi.set(__self__, "network_id", network_id)
        if bandwidth_limits is not None:
            pulumi.set(__self__, "bandwidth_limits", bandwidth_limits)

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
    @pulumi.getter(name="bandwidthLimits")
    def bandwidth_limits(self) -> Optional[pulumi.Input['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']]:
        """
        A hash uplink keys and their configured settings for the Appliance
        """
        return pulumi.get(self, "bandwidth_limits")

    @bandwidth_limits.setter
    def bandwidth_limits(self, value: Optional[pulumi.Input['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']]):
        pulumi.set(self, "bandwidth_limits", value)


@pulumi.input_type
class _ApplianceTrafficShapingUplinkBandwidthState:
    def __init__(__self__, *,
                 bandwidth_limits: Optional[pulumi.Input['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']] = None,
                 network_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApplianceTrafficShapingUplinkBandwidth resources.
        :param pulumi.Input['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs'] bandwidth_limits: A hash uplink keys and their configured settings for the Appliance
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        """
        if bandwidth_limits is not None:
            pulumi.set(__self__, "bandwidth_limits", bandwidth_limits)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)

    @property
    @pulumi.getter(name="bandwidthLimits")
    def bandwidth_limits(self) -> Optional[pulumi.Input['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']]:
        """
        A hash uplink keys and their configured settings for the Appliance
        """
        return pulumi.get(self, "bandwidth_limits")

    @bandwidth_limits.setter
    def bandwidth_limits(self, value: Optional[pulumi.Input['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']]):
        pulumi.set(self, "bandwidth_limits", value)

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


class ApplianceTrafficShapingUplinkBandwidth(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth_limits: Optional[pulumi.Input[pulumi.InputType['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.ApplianceTrafficShapingUplinkBandwidth("example",
            bandwidth_limits=meraki.networks.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs(
                cellular=meraki.networks.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellularArgs(
                    limit_down=1000000,
                    limit_up=1000000,
                ),
                wan1=meraki.networks.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args(
                    limit_down=1000000,
                    limit_up=1000000,
                ),
                wan2=meraki.networks.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan2Args(
                    limit_down=1000000,
                    limit_up=1000000,
                ),
            ),
            network_id="string")
        pulumi.export("merakiNetworksApplianceTrafficShapingUplinkBandwidthExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/applianceTrafficShapingUplinkBandwidth:ApplianceTrafficShapingUplinkBandwidth example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']] bandwidth_limits: A hash uplink keys and their configured settings for the Appliance
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplianceTrafficShapingUplinkBandwidthArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.ApplianceTrafficShapingUplinkBandwidth("example",
            bandwidth_limits=meraki.networks.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs(
                cellular=meraki.networks.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsCellularArgs(
                    limit_down=1000000,
                    limit_up=1000000,
                ),
                wan1=meraki.networks.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan1Args(
                    limit_down=1000000,
                    limit_up=1000000,
                ),
                wan2=meraki.networks.ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsWan2Args(
                    limit_down=1000000,
                    limit_up=1000000,
                ),
            ),
            network_id="string")
        pulumi.export("merakiNetworksApplianceTrafficShapingUplinkBandwidthExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/applianceTrafficShapingUplinkBandwidth:ApplianceTrafficShapingUplinkBandwidth example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param ApplianceTrafficShapingUplinkBandwidthArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplianceTrafficShapingUplinkBandwidthArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth_limits: Optional[pulumi.Input[pulumi.InputType['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplianceTrafficShapingUplinkBandwidthArgs.__new__(ApplianceTrafficShapingUplinkBandwidthArgs)

            __props__.__dict__["bandwidth_limits"] = bandwidth_limits
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
        super(ApplianceTrafficShapingUplinkBandwidth, __self__).__init__(
            'meraki:networks/applianceTrafficShapingUplinkBandwidth:ApplianceTrafficShapingUplinkBandwidth',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth_limits: Optional[pulumi.Input[pulumi.InputType['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']]] = None,
            network_id: Optional[pulumi.Input[str]] = None) -> 'ApplianceTrafficShapingUplinkBandwidth':
        """
        Get an existing ApplianceTrafficShapingUplinkBandwidth resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ApplianceTrafficShapingUplinkBandwidthBandwidthLimitsArgs']] bandwidth_limits: A hash uplink keys and their configured settings for the Appliance
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplianceTrafficShapingUplinkBandwidthState.__new__(_ApplianceTrafficShapingUplinkBandwidthState)

        __props__.__dict__["bandwidth_limits"] = bandwidth_limits
        __props__.__dict__["network_id"] = network_id
        return ApplianceTrafficShapingUplinkBandwidth(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bandwidthLimits")
    def bandwidth_limits(self) -> pulumi.Output['outputs.ApplianceTrafficShapingUplinkBandwidthBandwidthLimits']:
        """
        A hash uplink keys and their configured settings for the Appliance
        """
        return pulumi.get(self, "bandwidth_limits")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")
