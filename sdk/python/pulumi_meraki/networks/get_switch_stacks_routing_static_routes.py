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

__all__ = [
    'GetSwitchStacksRoutingStaticRoutesResult',
    'AwaitableGetSwitchStacksRoutingStaticRoutesResult',
    'get_switch_stacks_routing_static_routes',
    'get_switch_stacks_routing_static_routes_output',
]

@pulumi.output_type
class GetSwitchStacksRoutingStaticRoutesResult:
    """
    A collection of values returned by getSwitchStacksRoutingStaticRoutes.
    """
    def __init__(__self__, id=None, item=None, items=None, network_id=None, static_route_id=None, switch_stack_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)
        if static_route_id and not isinstance(static_route_id, str):
            raise TypeError("Expected argument 'static_route_id' to be a str")
        pulumi.set(__self__, "static_route_id", static_route_id)
        if switch_stack_id and not isinstance(switch_stack_id, str):
            raise TypeError("Expected argument 'switch_stack_id' to be a str")
        pulumi.set(__self__, "switch_stack_id", switch_stack_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetSwitchStacksRoutingStaticRoutesItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetSwitchStacksRoutingStaticRoutesItemResult']:
        """
        Array of ResponseSwitchGetNetworkSwitchStackRoutingStaticRoutes
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter(name="staticRouteId")
    def static_route_id(self) -> Optional[str]:
        """
        staticRouteId path parameter. Static route ID
        """
        return pulumi.get(self, "static_route_id")

    @property
    @pulumi.getter(name="switchStackId")
    def switch_stack_id(self) -> Optional[str]:
        """
        switchStackId path parameter. Switch stack ID
        """
        return pulumi.get(self, "switch_stack_id")


class AwaitableGetSwitchStacksRoutingStaticRoutesResult(GetSwitchStacksRoutingStaticRoutesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSwitchStacksRoutingStaticRoutesResult(
            id=self.id,
            item=self.item,
            items=self.items,
            network_id=self.network_id,
            static_route_id=self.static_route_id,
            switch_stack_id=self.switch_stack_id)


def get_switch_stacks_routing_static_routes(network_id: Optional[str] = None,
                                            static_route_id: Optional[str] = None,
                                            switch_stack_id: Optional[str] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSwitchStacksRoutingStaticRoutesResult:
    """
    ## Example Usage


    :param str network_id: networkId path parameter. Network ID
    :param str static_route_id: staticRouteId path parameter. Static route ID
    :param str switch_stack_id: switchStackId path parameter. Switch stack ID
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['staticRouteId'] = static_route_id
    __args__['switchStackId'] = switch_stack_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getSwitchStacksRoutingStaticRoutes:getSwitchStacksRoutingStaticRoutes', __args__, opts=opts, typ=GetSwitchStacksRoutingStaticRoutesResult).value

    return AwaitableGetSwitchStacksRoutingStaticRoutesResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'),
        static_route_id=pulumi.get(__ret__, 'static_route_id'),
        switch_stack_id=pulumi.get(__ret__, 'switch_stack_id'))


@_utilities.lift_output_func(get_switch_stacks_routing_static_routes)
def get_switch_stacks_routing_static_routes_output(network_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                   static_route_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                   switch_stack_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSwitchStacksRoutingStaticRoutesResult]:
    """
    ## Example Usage


    :param str network_id: networkId path parameter. Network ID
    :param str static_route_id: staticRouteId path parameter. Static route ID
    :param str switch_stack_id: switchStackId path parameter. Switch stack ID
    """
    ...