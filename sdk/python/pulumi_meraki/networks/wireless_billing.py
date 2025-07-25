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

__all__ = ['WirelessBillingArgs', 'WirelessBilling']

@pulumi.input_type
class WirelessBillingArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[_builtins.str],
                 currency: Optional[pulumi.Input[_builtins.str]] = None,
                 plans: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessBillingPlanArgs']]]] = None):
        """
        The set of arguments for constructing a WirelessBilling resource.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[_builtins.str] currency: The currency code of this node group's billing plans
        :param pulumi.Input[Sequence[pulumi.Input['WirelessBillingPlanArgs']]] plans: Array of billing plans in the node group. (Can configure a maximum of 5)
        """
        pulumi.set(__self__, "network_id", network_id)
        if currency is not None:
            pulumi.set(__self__, "currency", currency)
        if plans is not None:
            pulumi.set(__self__, "plans", plans)

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
    def currency(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The currency code of this node group's billing plans
        """
        return pulumi.get(self, "currency")

    @currency.setter
    def currency(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "currency", value)

    @_builtins.property
    @pulumi.getter
    def plans(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WirelessBillingPlanArgs']]]]:
        """
        Array of billing plans in the node group. (Can configure a maximum of 5)
        """
        return pulumi.get(self, "plans")

    @plans.setter
    def plans(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessBillingPlanArgs']]]]):
        pulumi.set(self, "plans", value)


@pulumi.input_type
class _WirelessBillingState:
    def __init__(__self__, *,
                 currency: Optional[pulumi.Input[_builtins.str]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 plans: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessBillingPlanArgs']]]] = None):
        """
        Input properties used for looking up and filtering WirelessBilling resources.
        :param pulumi.Input[_builtins.str] currency: The currency code of this node group's billing plans
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input['WirelessBillingPlanArgs']]] plans: Array of billing plans in the node group. (Can configure a maximum of 5)
        """
        if currency is not None:
            pulumi.set(__self__, "currency", currency)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if plans is not None:
            pulumi.set(__self__, "plans", plans)

    @_builtins.property
    @pulumi.getter
    def currency(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The currency code of this node group's billing plans
        """
        return pulumi.get(self, "currency")

    @currency.setter
    def currency(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "currency", value)

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
    def plans(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WirelessBillingPlanArgs']]]]:
        """
        Array of billing plans in the node group. (Can configure a maximum of 5)
        """
        return pulumi.get(self, "plans")

    @plans.setter
    def plans(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WirelessBillingPlanArgs']]]]):
        pulumi.set(self, "plans", value)


@pulumi.type_token("meraki:networks/wirelessBilling:WirelessBilling")
class WirelessBilling(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 currency: Optional[pulumi.Input[_builtins.str]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 plans: Optional[pulumi.Input[Sequence[pulumi.Input[Union['WirelessBillingPlanArgs', 'WirelessBillingPlanArgsDict']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/wirelessBilling:WirelessBilling example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] currency: The currency code of this node group's billing plans
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[Union['WirelessBillingPlanArgs', 'WirelessBillingPlanArgsDict']]]] plans: Array of billing plans in the node group. (Can configure a maximum of 5)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WirelessBillingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/wirelessBilling:WirelessBilling example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param WirelessBillingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WirelessBillingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 currency: Optional[pulumi.Input[_builtins.str]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 plans: Optional[pulumi.Input[Sequence[pulumi.Input[Union['WirelessBillingPlanArgs', 'WirelessBillingPlanArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WirelessBillingArgs.__new__(WirelessBillingArgs)

            __props__.__dict__["currency"] = currency
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["plans"] = plans
        super(WirelessBilling, __self__).__init__(
            'meraki:networks/wirelessBilling:WirelessBilling',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            currency: Optional[pulumi.Input[_builtins.str]] = None,
            network_id: Optional[pulumi.Input[_builtins.str]] = None,
            plans: Optional[pulumi.Input[Sequence[pulumi.Input[Union['WirelessBillingPlanArgs', 'WirelessBillingPlanArgsDict']]]]] = None) -> 'WirelessBilling':
        """
        Get an existing WirelessBilling resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] currency: The currency code of this node group's billing plans
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[Union['WirelessBillingPlanArgs', 'WirelessBillingPlanArgsDict']]]] plans: Array of billing plans in the node group. (Can configure a maximum of 5)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WirelessBillingState.__new__(_WirelessBillingState)

        __props__.__dict__["currency"] = currency
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["plans"] = plans
        return WirelessBilling(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def currency(self) -> pulumi.Output[_builtins.str]:
        """
        The currency code of this node group's billing plans
        """
        return pulumi.get(self, "currency")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @_builtins.property
    @pulumi.getter
    def plans(self) -> pulumi.Output[Sequence['outputs.WirelessBillingPlan']]:
        """
        Array of billing plans in the node group. (Can configure a maximum of 5)
        """
        return pulumi.get(self, "plans")

