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
    'GetLicensingSubscriptionEntitlementsResult',
    'AwaitableGetLicensingSubscriptionEntitlementsResult',
    'get_licensing_subscription_entitlements',
    'get_licensing_subscription_entitlements_output',
]

@pulumi.output_type
class GetLicensingSubscriptionEntitlementsResult:
    """
    A collection of values returned by getLicensingSubscriptionEntitlements.
    """
    def __init__(__self__, id=None, item=None, skuses=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if skuses and not isinstance(skuses, list):
            raise TypeError("Expected argument 'skuses' to be a list")
        pulumi.set(__self__, "skuses", skuses)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def item(self) -> 'outputs.GetLicensingSubscriptionEntitlementsItemResult':
        return pulumi.get(self, "item")

    @_builtins.property
    @pulumi.getter
    def skuses(self) -> Optional[Sequence[_builtins.str]]:
        """
        skus query parameter. Filter to entitlements with the specified SKUs
        """
        return pulumi.get(self, "skuses")


class AwaitableGetLicensingSubscriptionEntitlementsResult(GetLicensingSubscriptionEntitlementsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLicensingSubscriptionEntitlementsResult(
            id=self.id,
            item=self.item,
            skuses=self.skuses)


def get_licensing_subscription_entitlements(skuses: Optional[Sequence[_builtins.str]] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLicensingSubscriptionEntitlementsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.administered.get_licensing_subscription_entitlements(skuses=["string"])
    pulumi.export("merakiAdministeredLicensingSubscriptionEntitlementsExample", example.item)
    ```


    :param Sequence[_builtins.str] skuses: skus query parameter. Filter to entitlements with the specified SKUs
    """
    __args__ = dict()
    __args__['skuses'] = skuses
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:administered/getLicensingSubscriptionEntitlements:getLicensingSubscriptionEntitlements', __args__, opts=opts, typ=GetLicensingSubscriptionEntitlementsResult).value

    return AwaitableGetLicensingSubscriptionEntitlementsResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        skuses=pulumi.get(__ret__, 'skuses'))
def get_licensing_subscription_entitlements_output(skuses: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetLicensingSubscriptionEntitlementsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.administered.get_licensing_subscription_entitlements(skuses=["string"])
    pulumi.export("merakiAdministeredLicensingSubscriptionEntitlementsExample", example.item)
    ```


    :param Sequence[_builtins.str] skuses: skus query parameter. Filter to entitlements with the specified SKUs
    """
    __args__ = dict()
    __args__['skuses'] = skuses
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:administered/getLicensingSubscriptionEntitlements:getLicensingSubscriptionEntitlements', __args__, opts=opts, typ=GetLicensingSubscriptionEntitlementsResult)
    return __ret__.apply(lambda __response__: GetLicensingSubscriptionEntitlementsResult(
        id=pulumi.get(__response__, 'id'),
        item=pulumi.get(__response__, 'item'),
        skuses=pulumi.get(__response__, 'skuses')))
