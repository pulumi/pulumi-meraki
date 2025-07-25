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
    'GetEarlyAccessFeaturesResult',
    'AwaitableGetEarlyAccessFeaturesResult',
    'get_early_access_features',
    'get_early_access_features_output',
]

@pulumi.output_type
class GetEarlyAccessFeaturesResult:
    """
    A collection of values returned by getEarlyAccessFeatures.
    """
    def __init__(__self__, id=None, items=None, organization_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetEarlyAccessFeaturesItemResult']:
        """
        Array of ResponseOrganizationsGetOrganizationEarlyAccessFeatures
        """
        return pulumi.get(self, "items")

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> _builtins.str:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")


class AwaitableGetEarlyAccessFeaturesResult(GetEarlyAccessFeaturesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEarlyAccessFeaturesResult(
            id=self.id,
            items=self.items,
            organization_id=self.organization_id)


def get_early_access_features(organization_id: Optional[_builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEarlyAccessFeaturesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_early_access_features(organization_id="string")
    pulumi.export("merakiOrganizationsEarlyAccessFeaturesExample", example.items)
    ```


    :param _builtins.str organization_id: organizationId path parameter. Organization ID
    """
    __args__ = dict()
    __args__['organizationId'] = organization_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:organizations/getEarlyAccessFeatures:getEarlyAccessFeatures', __args__, opts=opts, typ=GetEarlyAccessFeaturesResult).value

    return AwaitableGetEarlyAccessFeaturesResult(
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        organization_id=pulumi.get(__ret__, 'organization_id'))
def get_early_access_features_output(organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetEarlyAccessFeaturesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_early_access_features(organization_id="string")
    pulumi.export("merakiOrganizationsEarlyAccessFeaturesExample", example.items)
    ```


    :param _builtins.str organization_id: organizationId path parameter. Organization ID
    """
    __args__ = dict()
    __args__['organizationId'] = organization_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:organizations/getEarlyAccessFeatures:getEarlyAccessFeatures', __args__, opts=opts, typ=GetEarlyAccessFeaturesResult)
    return __ret__.apply(lambda __response__: GetEarlyAccessFeaturesResult(
        id=pulumi.get(__response__, 'id'),
        items=pulumi.get(__response__, 'items'),
        organization_id=pulumi.get(__response__, 'organization_id')))
