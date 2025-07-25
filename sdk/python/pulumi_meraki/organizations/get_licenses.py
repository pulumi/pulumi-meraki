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
    'GetLicensesResult',
    'AwaitableGetLicensesResult',
    'get_licenses',
    'get_licenses_output',
]

@pulumi.output_type
class GetLicensesResult:
    """
    A collection of values returned by getLicenses.
    """
    def __init__(__self__, id=None, item=None, license_id=None, organization_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if license_id and not isinstance(license_id, str):
            raise TypeError("Expected argument 'license_id' to be a str")
        pulumi.set(__self__, "license_id", license_id)
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
    def item(self) -> 'outputs.GetLicensesItemResult':
        return pulumi.get(self, "item")

    @_builtins.property
    @pulumi.getter(name="licenseId")
    def license_id(self) -> _builtins.str:
        """
        licenseId path parameter. License ID
        """
        return pulumi.get(self, "license_id")

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> _builtins.str:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")


class AwaitableGetLicensesResult(GetLicensesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLicensesResult(
            id=self.id,
            item=self.item,
            license_id=self.license_id,
            organization_id=self.organization_id)


def get_licenses(license_id: Optional[_builtins.str] = None,
                 organization_id: Optional[_builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLicensesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_licenses(license_id="string",
        organization_id="string")
    pulumi.export("merakiOrganizationsLicensesExample", example.item)
    ```


    :param _builtins.str license_id: licenseId path parameter. License ID
    :param _builtins.str organization_id: organizationId path parameter. Organization ID
    """
    __args__ = dict()
    __args__['licenseId'] = license_id
    __args__['organizationId'] = organization_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:organizations/getLicenses:getLicenses', __args__, opts=opts, typ=GetLicensesResult).value

    return AwaitableGetLicensesResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        license_id=pulumi.get(__ret__, 'license_id'),
        organization_id=pulumi.get(__ret__, 'organization_id'))
def get_licenses_output(license_id: Optional[pulumi.Input[_builtins.str]] = None,
                        organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetLicensesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_licenses(license_id="string",
        organization_id="string")
    pulumi.export("merakiOrganizationsLicensesExample", example.item)
    ```


    :param _builtins.str license_id: licenseId path parameter. License ID
    :param _builtins.str organization_id: organizationId path parameter. Organization ID
    """
    __args__ = dict()
    __args__['licenseId'] = license_id
    __args__['organizationId'] = organization_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:organizations/getLicenses:getLicenses', __args__, opts=opts, typ=GetLicensesResult)
    return __ret__.apply(lambda __response__: GetLicensesResult(
        id=pulumi.get(__response__, 'id'),
        item=pulumi.get(__response__, 'item'),
        license_id=pulumi.get(__response__, 'license_id'),
        organization_id=pulumi.get(__response__, 'organization_id')))
