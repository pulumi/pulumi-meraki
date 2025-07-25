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
    'GetCameraWirelessProfilesResult',
    'AwaitableGetCameraWirelessProfilesResult',
    'get_camera_wireless_profiles',
    'get_camera_wireless_profiles_output',
]

@pulumi.output_type
class GetCameraWirelessProfilesResult:
    """
    A collection of values returned by getCameraWirelessProfiles.
    """
    def __init__(__self__, id=None, item=None, items=None, network_id=None, wireless_profile_id=None):
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
        if wireless_profile_id and not isinstance(wireless_profile_id, str):
            raise TypeError("Expected argument 'wireless_profile_id' to be a str")
        pulumi.set(__self__, "wireless_profile_id", wireless_profile_id)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def item(self) -> 'outputs.GetCameraWirelessProfilesItemResult':
        return pulumi.get(self, "item")

    @_builtins.property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetCameraWirelessProfilesItemResult']:
        """
        Array of ResponseCameraGetNetworkCameraWirelessProfiles
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
    @pulumi.getter(name="wirelessProfileId")
    def wireless_profile_id(self) -> Optional[_builtins.str]:
        """
        wirelessProfileId path parameter. Wireless profile ID
        """
        return pulumi.get(self, "wireless_profile_id")


class AwaitableGetCameraWirelessProfilesResult(GetCameraWirelessProfilesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCameraWirelessProfilesResult(
            id=self.id,
            item=self.item,
            items=self.items,
            network_id=self.network_id,
            wireless_profile_id=self.wireless_profile_id)


def get_camera_wireless_profiles(network_id: Optional[_builtins.str] = None,
                                 wireless_profile_id: Optional[_builtins.str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCameraWirelessProfilesResult:
    """
    ## Example Usage


    :param _builtins.str network_id: networkId path parameter. Network ID
    :param _builtins.str wireless_profile_id: wirelessProfileId path parameter. Wireless profile ID
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['wirelessProfileId'] = wireless_profile_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getCameraWirelessProfiles:getCameraWirelessProfiles', __args__, opts=opts, typ=GetCameraWirelessProfilesResult).value

    return AwaitableGetCameraWirelessProfilesResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'),
        wireless_profile_id=pulumi.get(__ret__, 'wireless_profile_id'))
def get_camera_wireless_profiles_output(network_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        wireless_profile_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCameraWirelessProfilesResult]:
    """
    ## Example Usage


    :param _builtins.str network_id: networkId path parameter. Network ID
    :param _builtins.str wireless_profile_id: wirelessProfileId path parameter. Wireless profile ID
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['wirelessProfileId'] = wireless_profile_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:networks/getCameraWirelessProfiles:getCameraWirelessProfiles', __args__, opts=opts, typ=GetCameraWirelessProfilesResult)
    return __ret__.apply(lambda __response__: GetCameraWirelessProfilesResult(
        id=pulumi.get(__response__, 'id'),
        item=pulumi.get(__response__, 'item'),
        items=pulumi.get(__response__, 'items'),
        network_id=pulumi.get(__response__, 'network_id'),
        wireless_profile_id=pulumi.get(__response__, 'wireless_profile_id')))
