# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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
    'GetInventoryDevicesResult',
    'AwaitableGetInventoryDevicesResult',
    'get_inventory_devices',
    'get_inventory_devices_output',
]

@pulumi.output_type
class GetInventoryDevicesResult:
    """
    A collection of values returned by getInventoryDevices.
    """
    def __init__(__self__, ending_before=None, id=None, item=None, items=None, macs=None, models=None, network_ids=None, order_numbers=None, organization_id=None, per_page=None, product_types=None, search=None, serial=None, serials=None, starting_after=None, tags=None, tags_filter_type=None, used_state=None):
        if ending_before and not isinstance(ending_before, str):
            raise TypeError("Expected argument 'ending_before' to be a str")
        pulumi.set(__self__, "ending_before", ending_before)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if macs and not isinstance(macs, list):
            raise TypeError("Expected argument 'macs' to be a list")
        pulumi.set(__self__, "macs", macs)
        if models and not isinstance(models, list):
            raise TypeError("Expected argument 'models' to be a list")
        pulumi.set(__self__, "models", models)
        if network_ids and not isinstance(network_ids, list):
            raise TypeError("Expected argument 'network_ids' to be a list")
        pulumi.set(__self__, "network_ids", network_ids)
        if order_numbers and not isinstance(order_numbers, list):
            raise TypeError("Expected argument 'order_numbers' to be a list")
        pulumi.set(__self__, "order_numbers", order_numbers)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if per_page and not isinstance(per_page, int):
            raise TypeError("Expected argument 'per_page' to be a int")
        pulumi.set(__self__, "per_page", per_page)
        if product_types and not isinstance(product_types, list):
            raise TypeError("Expected argument 'product_types' to be a list")
        pulumi.set(__self__, "product_types", product_types)
        if search and not isinstance(search, str):
            raise TypeError("Expected argument 'search' to be a str")
        pulumi.set(__self__, "search", search)
        if serial and not isinstance(serial, str):
            raise TypeError("Expected argument 'serial' to be a str")
        pulumi.set(__self__, "serial", serial)
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
        if used_state and not isinstance(used_state, str):
            raise TypeError("Expected argument 'used_state' to be a str")
        pulumi.set(__self__, "used_state", used_state)

    @property
    @pulumi.getter(name="endingBefore")
    def ending_before(self) -> Optional[builtins.str]:
        """
        endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "ending_before")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetInventoryDevicesItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetInventoryDevicesItemResult']:
        """
        Array of ResponseOrganizationsGetOrganizationInventoryDevices
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter
    def macs(self) -> Optional[Sequence[builtins.str]]:
        """
        macs query parameter. Search for devices in inventory based on mac addresses.
        """
        return pulumi.get(self, "macs")

    @property
    @pulumi.getter
    def models(self) -> Optional[Sequence[builtins.str]]:
        """
        models query parameter. Search for devices in inventory based on model.
        """
        return pulumi.get(self, "models")

    @property
    @pulumi.getter(name="networkIds")
    def network_ids(self) -> Optional[Sequence[builtins.str]]:
        """
        networkIds query parameter. Search for devices in inventory based on network ids. Use explicit 'null' value to get available devices only.
        """
        return pulumi.get(self, "network_ids")

    @property
    @pulumi.getter(name="orderNumbers")
    def order_numbers(self) -> Optional[Sequence[builtins.str]]:
        """
        orderNumbers query parameter. Search for devices in inventory based on order numbers.
        """
        return pulumi.get(self, "order_numbers")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[builtins.str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="perPage")
    def per_page(self) -> Optional[builtins.int]:
        """
        perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        """
        return pulumi.get(self, "per_page")

    @property
    @pulumi.getter(name="productTypes")
    def product_types(self) -> Optional[Sequence[builtins.str]]:
        """
        productTypes query parameter. Filter devices by product type. Accepted values are appliance, camera, cellularGateway, sensor, switch, systemsManager, and wireless.
        """
        return pulumi.get(self, "product_types")

    @property
    @pulumi.getter
    def search(self) -> Optional[builtins.str]:
        """
        search query parameter. Search for devices in inventory based on serial number, mac address, or model.
        """
        return pulumi.get(self, "search")

    @property
    @pulumi.getter
    def serial(self) -> Optional[builtins.str]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

    @property
    @pulumi.getter
    def serials(self) -> Optional[Sequence[builtins.str]]:
        """
        serials query parameter. Search for devices in inventory based on serials.
        """
        return pulumi.get(self, "serials")

    @property
    @pulumi.getter(name="startingAfter")
    def starting_after(self) -> Optional[builtins.str]:
        """
        startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "starting_after")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Sequence[builtins.str]]:
        """
        tags query parameter. Filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsFilterType")
    def tags_filter_type(self) -> Optional[builtins.str]:
        """
        tagsFilterType query parameter. To use with 'tags' parameter, to filter devices which contain ANY or ALL given tags. Accepted values are 'withAnyTags' or 'withAllTags', default is 'withAnyTags'.
        """
        return pulumi.get(self, "tags_filter_type")

    @property
    @pulumi.getter(name="usedState")
    def used_state(self) -> Optional[builtins.str]:
        """
        usedState query parameter. Filter results by used or unused inventory. Accepted values are 'used' or 'unused'.
        """
        return pulumi.get(self, "used_state")


class AwaitableGetInventoryDevicesResult(GetInventoryDevicesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInventoryDevicesResult(
            ending_before=self.ending_before,
            id=self.id,
            item=self.item,
            items=self.items,
            macs=self.macs,
            models=self.models,
            network_ids=self.network_ids,
            order_numbers=self.order_numbers,
            organization_id=self.organization_id,
            per_page=self.per_page,
            product_types=self.product_types,
            search=self.search,
            serial=self.serial,
            serials=self.serials,
            starting_after=self.starting_after,
            tags=self.tags,
            tags_filter_type=self.tags_filter_type,
            used_state=self.used_state)


def get_inventory_devices(ending_before: Optional[builtins.str] = None,
                          macs: Optional[Sequence[builtins.str]] = None,
                          models: Optional[Sequence[builtins.str]] = None,
                          network_ids: Optional[Sequence[builtins.str]] = None,
                          order_numbers: Optional[Sequence[builtins.str]] = None,
                          organization_id: Optional[builtins.str] = None,
                          per_page: Optional[builtins.int] = None,
                          product_types: Optional[Sequence[builtins.str]] = None,
                          search: Optional[builtins.str] = None,
                          serial: Optional[builtins.str] = None,
                          serials: Optional[Sequence[builtins.str]] = None,
                          starting_after: Optional[builtins.str] = None,
                          tags: Optional[Sequence[builtins.str]] = None,
                          tags_filter_type: Optional[builtins.str] = None,
                          used_state: Optional[builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInventoryDevicesResult:
    """
    ## Example Usage


    :param builtins.str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[builtins.str] macs: macs query parameter. Search for devices in inventory based on mac addresses.
    :param Sequence[builtins.str] models: models query parameter. Search for devices in inventory based on model.
    :param Sequence[builtins.str] network_ids: networkIds query parameter. Search for devices in inventory based on network ids. Use explicit 'null' value to get available devices only.
    :param Sequence[builtins.str] order_numbers: orderNumbers query parameter. Search for devices in inventory based on order numbers.
    :param builtins.str organization_id: organizationId path parameter. Organization ID
    :param builtins.int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
    :param Sequence[builtins.str] product_types: productTypes query parameter. Filter devices by product type. Accepted values are appliance, camera, cellularGateway, sensor, switch, systemsManager, and wireless.
    :param builtins.str search: search query parameter. Search for devices in inventory based on serial number, mac address, or model.
    :param builtins.str serial: serial path parameter.
    :param Sequence[builtins.str] serials: serials query parameter. Search for devices in inventory based on serials.
    :param builtins.str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[builtins.str] tags: tags query parameter. Filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
    :param builtins.str tags_filter_type: tagsFilterType query parameter. To use with 'tags' parameter, to filter devices which contain ANY or ALL given tags. Accepted values are 'withAnyTags' or 'withAllTags', default is 'withAnyTags'.
    :param builtins.str used_state: usedState query parameter. Filter results by used or unused inventory. Accepted values are 'used' or 'unused'.
    """
    __args__ = dict()
    __args__['endingBefore'] = ending_before
    __args__['macs'] = macs
    __args__['models'] = models
    __args__['networkIds'] = network_ids
    __args__['orderNumbers'] = order_numbers
    __args__['organizationId'] = organization_id
    __args__['perPage'] = per_page
    __args__['productTypes'] = product_types
    __args__['search'] = search
    __args__['serial'] = serial
    __args__['serials'] = serials
    __args__['startingAfter'] = starting_after
    __args__['tags'] = tags
    __args__['tagsFilterType'] = tags_filter_type
    __args__['usedState'] = used_state
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:organizations/getInventoryDevices:getInventoryDevices', __args__, opts=opts, typ=GetInventoryDevicesResult).value

    return AwaitableGetInventoryDevicesResult(
        ending_before=pulumi.get(__ret__, 'ending_before'),
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        items=pulumi.get(__ret__, 'items'),
        macs=pulumi.get(__ret__, 'macs'),
        models=pulumi.get(__ret__, 'models'),
        network_ids=pulumi.get(__ret__, 'network_ids'),
        order_numbers=pulumi.get(__ret__, 'order_numbers'),
        organization_id=pulumi.get(__ret__, 'organization_id'),
        per_page=pulumi.get(__ret__, 'per_page'),
        product_types=pulumi.get(__ret__, 'product_types'),
        search=pulumi.get(__ret__, 'search'),
        serial=pulumi.get(__ret__, 'serial'),
        serials=pulumi.get(__ret__, 'serials'),
        starting_after=pulumi.get(__ret__, 'starting_after'),
        tags=pulumi.get(__ret__, 'tags'),
        tags_filter_type=pulumi.get(__ret__, 'tags_filter_type'),
        used_state=pulumi.get(__ret__, 'used_state'))
def get_inventory_devices_output(ending_before: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 macs: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                 models: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                 network_ids: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                 order_numbers: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                 organization_id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 per_page: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                                 product_types: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                 search: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 serial: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 serials: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                 starting_after: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 tags: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                 tags_filter_type: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 used_state: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetInventoryDevicesResult]:
    """
    ## Example Usage


    :param builtins.str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[builtins.str] macs: macs query parameter. Search for devices in inventory based on mac addresses.
    :param Sequence[builtins.str] models: models query parameter. Search for devices in inventory based on model.
    :param Sequence[builtins.str] network_ids: networkIds query parameter. Search for devices in inventory based on network ids. Use explicit 'null' value to get available devices only.
    :param Sequence[builtins.str] order_numbers: orderNumbers query parameter. Search for devices in inventory based on order numbers.
    :param builtins.str organization_id: organizationId path parameter. Organization ID
    :param builtins.int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
    :param Sequence[builtins.str] product_types: productTypes query parameter. Filter devices by product type. Accepted values are appliance, camera, cellularGateway, sensor, switch, systemsManager, and wireless.
    :param builtins.str search: search query parameter. Search for devices in inventory based on serial number, mac address, or model.
    :param builtins.str serial: serial path parameter.
    :param Sequence[builtins.str] serials: serials query parameter. Search for devices in inventory based on serials.
    :param builtins.str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[builtins.str] tags: tags query parameter. Filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
    :param builtins.str tags_filter_type: tagsFilterType query parameter. To use with 'tags' parameter, to filter devices which contain ANY or ALL given tags. Accepted values are 'withAnyTags' or 'withAllTags', default is 'withAnyTags'.
    :param builtins.str used_state: usedState query parameter. Filter results by used or unused inventory. Accepted values are 'used' or 'unused'.
    """
    __args__ = dict()
    __args__['endingBefore'] = ending_before
    __args__['macs'] = macs
    __args__['models'] = models
    __args__['networkIds'] = network_ids
    __args__['orderNumbers'] = order_numbers
    __args__['organizationId'] = organization_id
    __args__['perPage'] = per_page
    __args__['productTypes'] = product_types
    __args__['search'] = search
    __args__['serial'] = serial
    __args__['serials'] = serials
    __args__['startingAfter'] = starting_after
    __args__['tags'] = tags
    __args__['tagsFilterType'] = tags_filter_type
    __args__['usedState'] = used_state
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:organizations/getInventoryDevices:getInventoryDevices', __args__, opts=opts, typ=GetInventoryDevicesResult)
    return __ret__.apply(lambda __response__: GetInventoryDevicesResult(
        ending_before=pulumi.get(__response__, 'ending_before'),
        id=pulumi.get(__response__, 'id'),
        item=pulumi.get(__response__, 'item'),
        items=pulumi.get(__response__, 'items'),
        macs=pulumi.get(__response__, 'macs'),
        models=pulumi.get(__response__, 'models'),
        network_ids=pulumi.get(__response__, 'network_ids'),
        order_numbers=pulumi.get(__response__, 'order_numbers'),
        organization_id=pulumi.get(__response__, 'organization_id'),
        per_page=pulumi.get(__response__, 'per_page'),
        product_types=pulumi.get(__response__, 'product_types'),
        search=pulumi.get(__response__, 'search'),
        serial=pulumi.get(__response__, 'serial'),
        serials=pulumi.get(__response__, 'serials'),
        starting_after=pulumi.get(__response__, 'starting_after'),
        tags=pulumi.get(__response__, 'tags'),
        tags_filter_type=pulumi.get(__response__, 'tags_filter_type'),
        used_state=pulumi.get(__response__, 'used_state')))
