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
    'GetSmTargetGroupsResult',
    'AwaitableGetSmTargetGroupsResult',
    'get_sm_target_groups',
    'get_sm_target_groups_output',
]

@pulumi.output_type
class GetSmTargetGroupsResult:
    """
    A collection of values returned by getSmTargetGroups.
    """
    def __init__(__self__, id=None, item=None, items=None, network_id=None, target_group_id=None, with_details=None):
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
        if target_group_id and not isinstance(target_group_id, str):
            raise TypeError("Expected argument 'target_group_id' to be a str")
        pulumi.set(__self__, "target_group_id", target_group_id)
        if with_details and not isinstance(with_details, bool):
            raise TypeError("Expected argument 'with_details' to be a bool")
        pulumi.set(__self__, "with_details", with_details)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def item(self) -> 'outputs.GetSmTargetGroupsItemResult':
        return pulumi.get(self, "item")

    @_builtins.property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetSmTargetGroupsItemResult']:
        """
        Array of ResponseSmGetNetworkSmTargetGroups
        """
        return pulumi.get(self, "items")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @_builtins.property
    @pulumi.getter(name="targetGroupId")
    def target_group_id(self) -> Optional[_builtins.str]:
        """
        targetGroupId path parameter. Target group ID
        """
        return pulumi.get(self, "target_group_id")

    @_builtins.property
    @pulumi.getter(name="withDetails")
    def with_details(self) -> Optional[_builtins.bool]:
        """
        withDetails query parameter. Boolean indicating if the the ids of the devices or users scoped by the target group should be included in the response
        """
        return pulumi.get(self, "with_details")


class AwaitableGetSmTargetGroupsResult(GetSmTargetGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSmTargetGroupsResult(
            id=self.id,
            item=self.item,
            items=self.items,
            network_id=self.network_id,
            target_group_id=self.target_group_id,
            with_details=self.with_details)


def get_sm_target_groups(network_id: Optional[_builtins.str] = None,
                         target_group_id: Optional[_builtins.str] = None,
                         with_details: Optional[_builtins.bool] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSmTargetGroupsResult:
    """
    ## Example Usage


    :param _builtins.str network_id: networkId path parameter. Network ID
    :param _builtins.str target_group_id: targetGroupId path parameter. Target group ID
    :param _builtins.bool with_details: withDetails query parameter. Boolean indicating if the the ids of the devices or users scoped by the target group should be included in the response
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['targetGroupId'] = target_group_id
    __args__['withDetails'] = with_details
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getSmTargetGroups:getSmTargetGroups', __args__, opts=opts, typ=GetSmTargetGroupsResult).value

    return AwaitableGetSmTargetGroupsResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'),
        target_group_id=pulumi.get(__ret__, 'target_group_id'),
        with_details=pulumi.get(__ret__, 'with_details'))
def get_sm_target_groups_output(network_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                target_group_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                with_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSmTargetGroupsResult]:
    """
    ## Example Usage


    :param _builtins.str network_id: networkId path parameter. Network ID
    :param _builtins.str target_group_id: targetGroupId path parameter. Target group ID
    :param _builtins.bool with_details: withDetails query parameter. Boolean indicating if the the ids of the devices or users scoped by the target group should be included in the response
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['targetGroupId'] = target_group_id
    __args__['withDetails'] = with_details
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:networks/getSmTargetGroups:getSmTargetGroups', __args__, opts=opts, typ=GetSmTargetGroupsResult)
    return __ret__.apply(lambda __response__: GetSmTargetGroupsResult(
        id=pulumi.get(__response__, 'id'),
        item=pulumi.get(__response__, 'item'),
        items=pulumi.get(__response__, 'items'),
        network_id=pulumi.get(__response__, 'network_id'),
        target_group_id=pulumi.get(__response__, 'target_group_id'),
        with_details=pulumi.get(__response__, 'with_details')))
