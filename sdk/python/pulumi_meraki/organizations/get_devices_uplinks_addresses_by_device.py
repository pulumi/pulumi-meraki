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
    'GetDevicesUplinksAddressesByDeviceResult',
    'AwaitableGetDevicesUplinksAddressesByDeviceResult',
    'get_devices_uplinks_addresses_by_device',
    'get_devices_uplinks_addresses_by_device_output',
]

@pulumi.output_type
class GetDevicesUplinksAddressesByDeviceResult:
    """
    A collection of values returned by getDevicesUplinksAddressesByDevice.
    """
    def __init__(__self__, ending_before=None, id=None, items=None, network_ids=None, organization_id=None, per_page=None, product_types=None, serials=None, starting_after=None, tags=None, tags_filter_type=None):
        if ending_before and not isinstance(ending_before, str):
            raise TypeError("Expected argument 'ending_before' to be a str")
        pulumi.set(__self__, "ending_before", ending_before)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if network_ids and not isinstance(network_ids, list):
            raise TypeError("Expected argument 'network_ids' to be a list")
        pulumi.set(__self__, "network_ids", network_ids)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if per_page and not isinstance(per_page, int):
            raise TypeError("Expected argument 'per_page' to be a int")
        pulumi.set(__self__, "per_page", per_page)
        if product_types and not isinstance(product_types, list):
            raise TypeError("Expected argument 'product_types' to be a list")
        pulumi.set(__self__, "product_types", product_types)
        if serials and not isinstance(serials, list):
            raise TypeError("Expected argument 'serials' to be a list")
        pulumi.set(__self__, "serials", serials)
        if starting_after and not isinstance(starting_after, str):
            raise TypeError("Expected argument 'starting_after' to be a str")
        pulumi.set(__self__, "starting_after", starting_after)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if tags_filter_type and not isinstance(tags_filter_type, str):
            raise TypeError("Expected argument 'tags_filter_type' to be a str")
        pulumi.set(__self__, "tags_filter_type", tags_filter_type)

    @_builtins.property
    @pulumi.getter(name="endingBefore")
    def ending_before(self) -> Optional[_builtins.str]:
        """
        endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "ending_before")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetDevicesUplinksAddressesByDeviceItemResult']:
        """
        Array of ResponseOrganizationsGetOrganizationDevicesUplinksAddressesByDevice
        """
        return pulumi.get(self, "items")

    @_builtins.property
    @pulumi.getter(name="networkIds")
    def network_ids(self) -> Optional[Sequence[_builtins.str]]:
        """
        networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
        """
        return pulumi.get(self, "network_ids")

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> _builtins.str:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @_builtins.property
    @pulumi.getter(name="perPage")
    def per_page(self) -> Optional[_builtins.int]:
        """
        perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        """
        return pulumi.get(self, "per_page")

    @_builtins.property
    @pulumi.getter(name="productTypes")
    def product_types(self) -> Optional[Sequence[_builtins.str]]:
        """
        productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
        """
        return pulumi.get(self, "product_types")

    @_builtins.property
    @pulumi.getter
    def serials(self) -> Optional[Sequence[_builtins.str]]:
        """
        serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
        """
        return pulumi.get(self, "serials")

    @_builtins.property
    @pulumi.getter(name="startingAfter")
    def starting_after(self) -> Optional[_builtins.str]:
        """
        startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "starting_after")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[Sequence[_builtins.str]]:
        """
        tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="tagsFilterType")
    def tags_filter_type(self) -> Optional[_builtins.str]:
        """
        tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
        """
        return pulumi.get(self, "tags_filter_type")


class AwaitableGetDevicesUplinksAddressesByDeviceResult(GetDevicesUplinksAddressesByDeviceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDevicesUplinksAddressesByDeviceResult(
            ending_before=self.ending_before,
            id=self.id,
            items=self.items,
            network_ids=self.network_ids,
            organization_id=self.organization_id,
            per_page=self.per_page,
            product_types=self.product_types,
            serials=self.serials,
            starting_after=self.starting_after,
            tags=self.tags,
            tags_filter_type=self.tags_filter_type)


def get_devices_uplinks_addresses_by_device(ending_before: Optional[_builtins.str] = None,
                                            network_ids: Optional[Sequence[_builtins.str]] = None,
                                            organization_id: Optional[_builtins.str] = None,
                                            per_page: Optional[_builtins.int] = None,
                                            product_types: Optional[Sequence[_builtins.str]] = None,
                                            serials: Optional[Sequence[_builtins.str]] = None,
                                            starting_after: Optional[_builtins.str] = None,
                                            tags: Optional[Sequence[_builtins.str]] = None,
                                            tags_filter_type: Optional[_builtins.str] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDevicesUplinksAddressesByDeviceResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_devices_uplinks_addresses_by_device(ending_before="string",
        network_ids=["string"],
        organization_id="string",
        per_page=1,
        product_types=["string"],
        serials=["string"],
        starting_after="string",
        tags=["string"],
        tags_filter_type="string")
    pulumi.export("merakiOrganizationsDevicesUplinksAddressesByDeviceExample", example.items)
    ```


    :param _builtins.str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[_builtins.str] network_ids: networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
    :param _builtins.str organization_id: organizationId path parameter. Organization ID
    :param _builtins.int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
    :param Sequence[_builtins.str] product_types: productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
    :param Sequence[_builtins.str] serials: serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
    :param _builtins.str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[_builtins.str] tags: tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
    :param _builtins.str tags_filter_type: tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
    """
    __args__ = dict()
    __args__['endingBefore'] = ending_before
    __args__['networkIds'] = network_ids
    __args__['organizationId'] = organization_id
    __args__['perPage'] = per_page
    __args__['productTypes'] = product_types
    __args__['serials'] = serials
    __args__['startingAfter'] = starting_after
    __args__['tags'] = tags
    __args__['tagsFilterType'] = tags_filter_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:organizations/getDevicesUplinksAddressesByDevice:getDevicesUplinksAddressesByDevice', __args__, opts=opts, typ=GetDevicesUplinksAddressesByDeviceResult).value

    return AwaitableGetDevicesUplinksAddressesByDeviceResult(
        ending_before=pulumi.get(__ret__, 'ending_before'),
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        network_ids=pulumi.get(__ret__, 'network_ids'),
        organization_id=pulumi.get(__ret__, 'organization_id'),
        per_page=pulumi.get(__ret__, 'per_page'),
        product_types=pulumi.get(__ret__, 'product_types'),
        serials=pulumi.get(__ret__, 'serials'),
        starting_after=pulumi.get(__ret__, 'starting_after'),
        tags=pulumi.get(__ret__, 'tags'),
        tags_filter_type=pulumi.get(__ret__, 'tags_filter_type'))
def get_devices_uplinks_addresses_by_device_output(ending_before: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                   network_ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                                   organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                   per_page: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                                   product_types: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                                   serials: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                                   starting_after: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                   tags: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                                   tags_filter_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDevicesUplinksAddressesByDeviceResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_devices_uplinks_addresses_by_device(ending_before="string",
        network_ids=["string"],
        organization_id="string",
        per_page=1,
        product_types=["string"],
        serials=["string"],
        starting_after="string",
        tags=["string"],
        tags_filter_type="string")
    pulumi.export("merakiOrganizationsDevicesUplinksAddressesByDeviceExample", example.items)
    ```


    :param _builtins.str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[_builtins.str] network_ids: networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
    :param _builtins.str organization_id: organizationId path parameter. Organization ID
    :param _builtins.int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
    :param Sequence[_builtins.str] product_types: productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
    :param Sequence[_builtins.str] serials: serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
    :param _builtins.str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[_builtins.str] tags: tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
    :param _builtins.str tags_filter_type: tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
    """
    __args__ = dict()
    __args__['endingBefore'] = ending_before
    __args__['networkIds'] = network_ids
    __args__['organizationId'] = organization_id
    __args__['perPage'] = per_page
    __args__['productTypes'] = product_types
    __args__['serials'] = serials
    __args__['startingAfter'] = starting_after
    __args__['tags'] = tags
    __args__['tagsFilterType'] = tags_filter_type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:organizations/getDevicesUplinksAddressesByDevice:getDevicesUplinksAddressesByDevice', __args__, opts=opts, typ=GetDevicesUplinksAddressesByDeviceResult)
    return __ret__.apply(lambda __response__: GetDevicesUplinksAddressesByDeviceResult(
        ending_before=pulumi.get(__response__, 'ending_before'),
        id=pulumi.get(__response__, 'id'),
        items=pulumi.get(__response__, 'items'),
        network_ids=pulumi.get(__response__, 'network_ids'),
        organization_id=pulumi.get(__response__, 'organization_id'),
        per_page=pulumi.get(__response__, 'per_page'),
        product_types=pulumi.get(__response__, 'product_types'),
        serials=pulumi.get(__response__, 'serials'),
        starting_after=pulumi.get(__response__, 'starting_after'),
        tags=pulumi.get(__response__, 'tags'),
        tags_filter_type=pulumi.get(__response__, 'tags_filter_type')))
