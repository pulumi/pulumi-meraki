# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
from . import _utilities
from . import outputs

__all__ = [
    'GetDevicesItemResult',
    'GetDevicesItemDetailResult',
    'GetNetworksItemResult',
    'GetOrganizationsItemResult',
    'GetOrganizationsItemApiResult',
    'GetOrganizationsItemCloudResult',
    'GetOrganizationsItemCloudRegionResult',
    'GetOrganizationsItemLicensingResult',
    'GetOrganizationsItemManagementResult',
    'GetOrganizationsItemManagementDetailResult',
]

@pulumi.output_type
class GetDevicesItemResult(dict):
    def __init__(__self__, *,
                 address: str,
                 details: Sequence['outputs.GetDevicesItemDetailResult'],
                 firmware: str,
                 imei: float,
                 lan_ip: str,
                 lat: float,
                 lng: float,
                 mac: str,
                 model: str,
                 name: str,
                 network_id: str,
                 notes: str,
                 product_type: str,
                 serial: str,
                 tags: Sequence[str]):
        """
        :param str address: Physical address of the device
        :param Sequence['GetDevicesItemDetailArgs'] details: Additional device information
        :param str firmware: Firmware version of the device
        :param float imei: IMEI of the device, if applicable
        :param str lan_ip: LAN IP address of the device
        :param float lat: Latitude of the device
        :param float lng: Longitude of the device
        :param str mac: MAC address of the device
        :param str model: Model of the device
        :param str name: Name of the device
        :param str network_id: ID of the network the device belongs to
        :param str notes: Notes for the device, limited to 255 characters
        :param str product_type: Product type of the device
        :param str serial: Serial number of the device
        :param Sequence[str] tags: List of tags assigned to the device
        """
        pulumi.set(__self__, "address", address)
        pulumi.set(__self__, "details", details)
        pulumi.set(__self__, "firmware", firmware)
        pulumi.set(__self__, "imei", imei)
        pulumi.set(__self__, "lan_ip", lan_ip)
        pulumi.set(__self__, "lat", lat)
        pulumi.set(__self__, "lng", lng)
        pulumi.set(__self__, "mac", mac)
        pulumi.set(__self__, "model", model)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "network_id", network_id)
        pulumi.set(__self__, "notes", notes)
        pulumi.set(__self__, "product_type", product_type)
        pulumi.set(__self__, "serial", serial)
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def address(self) -> str:
        """
        Physical address of the device
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def details(self) -> Sequence['outputs.GetDevicesItemDetailResult']:
        """
        Additional device information
        """
        return pulumi.get(self, "details")

    @property
    @pulumi.getter
    def firmware(self) -> str:
        """
        Firmware version of the device
        """
        return pulumi.get(self, "firmware")

    @property
    @pulumi.getter
    def imei(self) -> float:
        """
        IMEI of the device, if applicable
        """
        return pulumi.get(self, "imei")

    @property
    @pulumi.getter(name="lanIp")
    def lan_ip(self) -> str:
        """
        LAN IP address of the device
        """
        return pulumi.get(self, "lan_ip")

    @property
    @pulumi.getter
    def lat(self) -> float:
        """
        Latitude of the device
        """
        return pulumi.get(self, "lat")

    @property
    @pulumi.getter
    def lng(self) -> float:
        """
        Longitude of the device
        """
        return pulumi.get(self, "lng")

    @property
    @pulumi.getter
    def mac(self) -> str:
        """
        MAC address of the device
        """
        return pulumi.get(self, "mac")

    @property
    @pulumi.getter
    def model(self) -> str:
        """
        Model of the device
        """
        return pulumi.get(self, "model")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the device
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> str:
        """
        ID of the network the device belongs to
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def notes(self) -> str:
        """
        Notes for the device, limited to 255 characters
        """
        return pulumi.get(self, "notes")

    @property
    @pulumi.getter(name="productType")
    def product_type(self) -> str:
        """
        Product type of the device
        """
        return pulumi.get(self, "product_type")

    @property
    @pulumi.getter
    def serial(self) -> str:
        """
        Serial number of the device
        """
        return pulumi.get(self, "serial")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        List of tags assigned to the device
        """
        return pulumi.get(self, "tags")


@pulumi.output_type
class GetDevicesItemDetailResult(dict):
    def __init__(__self__, *,
                 name: str,
                 value: str):
        """
        :param str name: Additional property name
        :param str value: Additional property value
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Additional property name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Additional property value
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetNetworksItemResult(dict):
    def __init__(__self__, *,
                 enrollment_string: str,
                 id: str,
                 is_bound_to_config_template: bool,
                 name: str,
                 notes: str,
                 organization_id: str,
                 product_types: Sequence[str],
                 tags: Sequence[str],
                 time_zone: str,
                 url: str):
        """
        :param str enrollment_string: Enrollment string for the network
        :param str id: Network ID
        :param bool is_bound_to_config_template: If the network is bound to a config template
        :param str name: Network name
        :param str notes: Notes for the network
        :param str organization_id: Organization ID
        :param Sequence[str] product_types: List of the product types that the network supports
        :param Sequence[str] tags: Network tags
        :param str time_zone: Timezone of the network
        :param str url: URL to the network Dashboard UI
        """
        pulumi.set(__self__, "enrollment_string", enrollment_string)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "is_bound_to_config_template", is_bound_to_config_template)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "notes", notes)
        pulumi.set(__self__, "organization_id", organization_id)
        pulumi.set(__self__, "product_types", product_types)
        pulumi.set(__self__, "tags", tags)
        pulumi.set(__self__, "time_zone", time_zone)
        pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="enrollmentString")
    def enrollment_string(self) -> str:
        """
        Enrollment string for the network
        """
        return pulumi.get(self, "enrollment_string")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Network ID
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isBoundToConfigTemplate")
    def is_bound_to_config_template(self) -> bool:
        """
        If the network is bound to a config template
        """
        return pulumi.get(self, "is_bound_to_config_template")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Network name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def notes(self) -> str:
        """
        Notes for the network
        """
        return pulumi.get(self, "notes")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> str:
        """
        Organization ID
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="productTypes")
    def product_types(self) -> Sequence[str]:
        """
        List of the product types that the network supports
        """
        return pulumi.get(self, "product_types")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Network tags
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> str:
        """
        Timezone of the network
        """
        return pulumi.get(self, "time_zone")

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        URL to the network Dashboard UI
        """
        return pulumi.get(self, "url")


@pulumi.output_type
class GetOrganizationsItemResult(dict):
    def __init__(__self__, *,
                 api: 'outputs.GetOrganizationsItemApiResult',
                 cloud: 'outputs.GetOrganizationsItemCloudResult',
                 id: str,
                 licensing: 'outputs.GetOrganizationsItemLicensingResult',
                 management: 'outputs.GetOrganizationsItemManagementResult',
                 name: str,
                 url: str):
        """
        :param 'GetOrganizationsItemApiArgs' api: API related settings
        :param 'GetOrganizationsItemCloudArgs' cloud: Data for this organization
        :param str id: Organization ID
        :param 'GetOrganizationsItemLicensingArgs' licensing: Licensing related settings
        :param 'GetOrganizationsItemManagementArgs' management: Information about the organization's management system
        :param str name: Organization name
        :param str url: Organization URL
        """
        pulumi.set(__self__, "api", api)
        pulumi.set(__self__, "cloud", cloud)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "licensing", licensing)
        pulumi.set(__self__, "management", management)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def api(self) -> 'outputs.GetOrganizationsItemApiResult':
        """
        API related settings
        """
        return pulumi.get(self, "api")

    @property
    @pulumi.getter
    def cloud(self) -> 'outputs.GetOrganizationsItemCloudResult':
        """
        Data for this organization
        """
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Organization ID
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def licensing(self) -> 'outputs.GetOrganizationsItemLicensingResult':
        """
        Licensing related settings
        """
        return pulumi.get(self, "licensing")

    @property
    @pulumi.getter
    def management(self) -> 'outputs.GetOrganizationsItemManagementResult':
        """
        Information about the organization's management system
        """
        return pulumi.get(self, "management")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Organization name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        Organization URL
        """
        return pulumi.get(self, "url")


@pulumi.output_type
class GetOrganizationsItemApiResult(dict):
    def __init__(__self__, *,
                 enabled: bool):
        """
        :param bool enabled: Enable API access
        """
        pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Enable API access
        """
        return pulumi.get(self, "enabled")


@pulumi.output_type
class GetOrganizationsItemCloudResult(dict):
    def __init__(__self__, *,
                 region: 'outputs.GetOrganizationsItemCloudRegionResult'):
        """
        :param 'GetOrganizationsItemCloudRegionArgs' region: Region info
        """
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def region(self) -> 'outputs.GetOrganizationsItemCloudRegionResult':
        """
        Region info
        """
        return pulumi.get(self, "region")


@pulumi.output_type
class GetOrganizationsItemCloudRegionResult(dict):
    def __init__(__self__, *,
                 name: str):
        """
        :param str name: Name of region
        """
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of region
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class GetOrganizationsItemLicensingResult(dict):
    def __init__(__self__, *,
                 model: str):
        """
        :param str model: Organization licensing model. Can be 'co-term', 'per-device', or 'subscription'.
        """
        pulumi.set(__self__, "model", model)

    @property
    @pulumi.getter
    def model(self) -> str:
        """
        Organization licensing model. Can be 'co-term', 'per-device', or 'subscription'.
        """
        return pulumi.get(self, "model")


@pulumi.output_type
class GetOrganizationsItemManagementResult(dict):
    def __init__(__self__, *,
                 details: Sequence['outputs.GetOrganizationsItemManagementDetailResult']):
        """
        :param Sequence['GetOrganizationsItemManagementDetailArgs'] details: Details related to organization management, possibly empty. Details may be named 'MSP ID', 'IP restriction mode for API', or 'IP restriction mode for dashboard', if the organization admin has configured any.
        """
        pulumi.set(__self__, "details", details)

    @property
    @pulumi.getter
    def details(self) -> Sequence['outputs.GetOrganizationsItemManagementDetailResult']:
        """
        Details related to organization management, possibly empty. Details may be named 'MSP ID', 'IP restriction mode for API', or 'IP restriction mode for dashboard', if the organization admin has configured any.
        """
        return pulumi.get(self, "details")


@pulumi.output_type
class GetOrganizationsItemManagementDetailResult(dict):
    def __init__(__self__, *,
                 name: str,
                 value: str):
        """
        :param str name: Name of management data
        :param str value: Value of management data
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of management data
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Value of management data
        """
        return pulumi.get(self, "value")


