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
    'GetSwitchWarmSpareResult',
    'AwaitableGetSwitchWarmSpareResult',
    'get_switch_warm_spare',
    'get_switch_warm_spare_output',
]

@pulumi.output_type
class GetSwitchWarmSpareResult:
    """
    A collection of values returned by getSwitchWarmSpare.
    """
    def __init__(__self__, id=None, item=None, serial=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if serial and not isinstance(serial, str):
            raise TypeError("Expected argument 'serial' to be a str")
        pulumi.set(__self__, "serial", serial)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def item(self) -> 'outputs.GetSwitchWarmSpareItemResult':
        return pulumi.get(self, "item")

    @_builtins.property
    @pulumi.getter
    def serial(self) -> _builtins.str:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")


class AwaitableGetSwitchWarmSpareResult(GetSwitchWarmSpareResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSwitchWarmSpareResult(
            id=self.id,
            item=self.item,
            serial=self.serial)


def get_switch_warm_spare(serial: Optional[_builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSwitchWarmSpareResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.devices.get_switch_warm_spare(serial="string")
    pulumi.export("merakiDevicesSwitchWarmSpareExample", example.item)
    ```


    :param _builtins.str serial: serial path parameter.
    """
    __args__ = dict()
    __args__['serial'] = serial
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:devices/getSwitchWarmSpare:getSwitchWarmSpare', __args__, opts=opts, typ=GetSwitchWarmSpareResult).value

    return AwaitableGetSwitchWarmSpareResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        serial=pulumi.get(__ret__, 'serial'))
def get_switch_warm_spare_output(serial: Optional[pulumi.Input[_builtins.str]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSwitchWarmSpareResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.devices.get_switch_warm_spare(serial="string")
    pulumi.export("merakiDevicesSwitchWarmSpareExample", example.item)
    ```


    :param _builtins.str serial: serial path parameter.
    """
    __args__ = dict()
    __args__['serial'] = serial
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:devices/getSwitchWarmSpare:getSwitchWarmSpare', __args__, opts=opts, typ=GetSwitchWarmSpareResult)
    return __ret__.apply(lambda __response__: GetSwitchWarmSpareResult(
        id=pulumi.get(__response__, 'id'),
        item=pulumi.get(__response__, 'item'),
        serial=pulumi.get(__response__, 'serial')))
