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

__all__ = [
    'GetFloorPlansResult',
    'AwaitableGetFloorPlansResult',
    'get_floor_plans',
    'get_floor_plans_output',
]

@pulumi.output_type
class GetFloorPlansResult:
    """
    A collection of values returned by getFloorPlans.
    """
    def __init__(__self__, floor_plan_id=None, id=None, item=None, items=None, network_id=None):
        if floor_plan_id and not isinstance(floor_plan_id, str):
            raise TypeError("Expected argument 'floor_plan_id' to be a str")
        pulumi.set(__self__, "floor_plan_id", floor_plan_id)
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

    @_builtins.property
    @pulumi.getter(name="floorPlanId")
    def floor_plan_id(self) -> Optional[_builtins.str]:
        """
        floorPlanId path parameter. Floor plan ID
        """
        return pulumi.get(self, "floor_plan_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def item(self) -> 'outputs.GetFloorPlansItemResult':
        return pulumi.get(self, "item")

    @_builtins.property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetFloorPlansItemResult']:
        """
        Array of ResponseNetworksGetNetworkFloorPlans
        """
        return pulumi.get(self, "items")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")


class AwaitableGetFloorPlansResult(GetFloorPlansResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFloorPlansResult(
            floor_plan_id=self.floor_plan_id,
            id=self.id,
            item=self.item,
            items=self.items,
            network_id=self.network_id)


def get_floor_plans(floor_plan_id: Optional[_builtins.str] = None,
                    network_id: Optional[_builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFloorPlansResult:
    """
    ## Example Usage


    :param _builtins.str floor_plan_id: floorPlanId path parameter. Floor plan ID
    :param _builtins.str network_id: networkId path parameter. Network ID
    """
    __args__ = dict()
    __args__['floorPlanId'] = floor_plan_id
    __args__['networkId'] = network_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getFloorPlans:getFloorPlans', __args__, opts=opts, typ=GetFloorPlansResult).value

    return AwaitableGetFloorPlansResult(
        floor_plan_id=pulumi.get(__ret__, 'floor_plan_id'),
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'))
def get_floor_plans_output(floor_plan_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           network_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFloorPlansResult]:
    """
    ## Example Usage


    :param _builtins.str floor_plan_id: floorPlanId path parameter. Floor plan ID
    :param _builtins.str network_id: networkId path parameter. Network ID
    """
    __args__ = dict()
    __args__['floorPlanId'] = floor_plan_id
    __args__['networkId'] = network_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:networks/getFloorPlans:getFloorPlans', __args__, opts=opts, typ=GetFloorPlansResult)
    return __ret__.apply(lambda __response__: GetFloorPlansResult(
        floor_plan_id=pulumi.get(__response__, 'floor_plan_id'),
        id=pulumi.get(__response__, 'id'),
        item=pulumi.get(__response__, 'item'),
        items=pulumi.get(__response__, 'items'),
        network_id=pulumi.get(__response__, 'network_id')))
