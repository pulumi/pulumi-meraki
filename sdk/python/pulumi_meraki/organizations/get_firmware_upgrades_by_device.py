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
    'GetFirmwareUpgradesByDeviceResult',
    'AwaitableGetFirmwareUpgradesByDeviceResult',
    'get_firmware_upgrades_by_device',
    'get_firmware_upgrades_by_device_output',
]

@pulumi.output_type
class GetFirmwareUpgradesByDeviceResult:
    """
    A collection of values returned by getFirmwareUpgradesByDevice.
    """
    def __init__(__self__, ending_before=None, firmware_upgrade_batch_ids=None, id=None, items=None, macs=None, network_ids=None, organization_id=None, per_page=None, serials=None, starting_after=None, upgradestatuses=None):
        if ending_before and not isinstance(ending_before, str):
            raise TypeError("Expected argument 'ending_before' to be a str")
        pulumi.set(__self__, "ending_before", ending_before)
        if firmware_upgrade_batch_ids and not isinstance(firmware_upgrade_batch_ids, list):
            raise TypeError("Expected argument 'firmware_upgrade_batch_ids' to be a list")
        pulumi.set(__self__, "firmware_upgrade_batch_ids", firmware_upgrade_batch_ids)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if macs and not isinstance(macs, list):
            raise TypeError("Expected argument 'macs' to be a list")
        pulumi.set(__self__, "macs", macs)
        if network_ids and not isinstance(network_ids, list):
            raise TypeError("Expected argument 'network_ids' to be a list")
        pulumi.set(__self__, "network_ids", network_ids)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if per_page and not isinstance(per_page, int):
            raise TypeError("Expected argument 'per_page' to be a int")
        pulumi.set(__self__, "per_page", per_page)
        if serials and not isinstance(serials, list):
            raise TypeError("Expected argument 'serials' to be a list")
        pulumi.set(__self__, "serials", serials)
        if starting_after and not isinstance(starting_after, str):
            raise TypeError("Expected argument 'starting_after' to be a str")
        pulumi.set(__self__, "starting_after", starting_after)
        if upgradestatuses and not isinstance(upgradestatuses, list):
            raise TypeError("Expected argument 'upgradestatuses' to be a list")
        pulumi.set(__self__, "upgradestatuses", upgradestatuses)

    @_builtins.property
    @pulumi.getter(name="endingBefore")
    def ending_before(self) -> Optional[_builtins.str]:
        """
        endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "ending_before")

    @_builtins.property
    @pulumi.getter(name="firmwareUpgradeBatchIds")
    def firmware_upgrade_batch_ids(self) -> Optional[Sequence[_builtins.str]]:
        """
        firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
        """
        return pulumi.get(self, "firmware_upgrade_batch_ids")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetFirmwareUpgradesByDeviceItemResult']:
        """
        Array of ResponseOrganizationsGetOrganizationFirmwareUpgradesByDevice
        """
        return pulumi.get(self, "items")

    @_builtins.property
    @pulumi.getter
    def macs(self) -> Optional[Sequence[_builtins.str]]:
        """
        macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
        """
        return pulumi.get(self, "macs")

    @_builtins.property
    @pulumi.getter(name="networkIds")
    def network_ids(self) -> Optional[Sequence[_builtins.str]]:
        """
        networkIds query parameter. Optional parameter to filter by network
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
        perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
        """
        return pulumi.get(self, "per_page")

    @_builtins.property
    @pulumi.getter
    def serials(self) -> Optional[Sequence[_builtins.str]]:
        """
        serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
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
    def upgradestatuses(self) -> Optional[Sequence[_builtins.str]]:
        """
        upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
        """
        return pulumi.get(self, "upgradestatuses")


class AwaitableGetFirmwareUpgradesByDeviceResult(GetFirmwareUpgradesByDeviceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFirmwareUpgradesByDeviceResult(
            ending_before=self.ending_before,
            firmware_upgrade_batch_ids=self.firmware_upgrade_batch_ids,
            id=self.id,
            items=self.items,
            macs=self.macs,
            network_ids=self.network_ids,
            organization_id=self.organization_id,
            per_page=self.per_page,
            serials=self.serials,
            starting_after=self.starting_after,
            upgradestatuses=self.upgradestatuses)


def get_firmware_upgrades_by_device(ending_before: Optional[_builtins.str] = None,
                                    firmware_upgrade_batch_ids: Optional[Sequence[_builtins.str]] = None,
                                    macs: Optional[Sequence[_builtins.str]] = None,
                                    network_ids: Optional[Sequence[_builtins.str]] = None,
                                    organization_id: Optional[_builtins.str] = None,
                                    per_page: Optional[_builtins.int] = None,
                                    serials: Optional[Sequence[_builtins.str]] = None,
                                    starting_after: Optional[_builtins.str] = None,
                                    upgradestatuses: Optional[Sequence[_builtins.str]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFirmwareUpgradesByDeviceResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_firmware_upgrades_by_device(ending_before="string",
        firmware_upgrade_batch_ids=["string"],
        macs=["string"],
        network_ids=["string"],
        organization_id="string",
        per_page=1,
        serials=["string"],
        starting_after="string",
        upgradestatuses=["string"])
    pulumi.export("merakiOrganizationsFirmwareUpgradesByDeviceExample", example.items)
    ```


    :param _builtins.str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[_builtins.str] firmware_upgrade_batch_ids: firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
    :param Sequence[_builtins.str] macs: macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
    :param Sequence[_builtins.str] network_ids: networkIds query parameter. Optional parameter to filter by network
    :param _builtins.str organization_id: organizationId path parameter. Organization ID
    :param _builtins.int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
    :param Sequence[_builtins.str] serials: serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
    :param _builtins.str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[_builtins.str] upgradestatuses: upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
    """
    __args__ = dict()
    __args__['endingBefore'] = ending_before
    __args__['firmwareUpgradeBatchIds'] = firmware_upgrade_batch_ids
    __args__['macs'] = macs
    __args__['networkIds'] = network_ids
    __args__['organizationId'] = organization_id
    __args__['perPage'] = per_page
    __args__['serials'] = serials
    __args__['startingAfter'] = starting_after
    __args__['upgradestatuses'] = upgradestatuses
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:organizations/getFirmwareUpgradesByDevice:getFirmwareUpgradesByDevice', __args__, opts=opts, typ=GetFirmwareUpgradesByDeviceResult).value

    return AwaitableGetFirmwareUpgradesByDeviceResult(
        ending_before=pulumi.get(__ret__, 'ending_before'),
        firmware_upgrade_batch_ids=pulumi.get(__ret__, 'firmware_upgrade_batch_ids'),
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        macs=pulumi.get(__ret__, 'macs'),
        network_ids=pulumi.get(__ret__, 'network_ids'),
        organization_id=pulumi.get(__ret__, 'organization_id'),
        per_page=pulumi.get(__ret__, 'per_page'),
        serials=pulumi.get(__ret__, 'serials'),
        starting_after=pulumi.get(__ret__, 'starting_after'),
        upgradestatuses=pulumi.get(__ret__, 'upgradestatuses'))
def get_firmware_upgrades_by_device_output(ending_before: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                           firmware_upgrade_batch_ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                           macs: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                           network_ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                           organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                                           per_page: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                           serials: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                           starting_after: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                           upgradestatuses: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFirmwareUpgradesByDeviceResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_firmware_upgrades_by_device(ending_before="string",
        firmware_upgrade_batch_ids=["string"],
        macs=["string"],
        network_ids=["string"],
        organization_id="string",
        per_page=1,
        serials=["string"],
        starting_after="string",
        upgradestatuses=["string"])
    pulumi.export("merakiOrganizationsFirmwareUpgradesByDeviceExample", example.items)
    ```


    :param _builtins.str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[_builtins.str] firmware_upgrade_batch_ids: firmwareUpgradeBatchIds query parameter. Optional parameter to filter by firmware upgrade batch ids.
    :param Sequence[_builtins.str] macs: macs query parameter. Optional parameter to filter by one or more MAC addresses belonging to devices. All devices returned belong to MAC addresses that are an exact match.
    :param Sequence[_builtins.str] network_ids: networkIds query parameter. Optional parameter to filter by network
    :param _builtins.str organization_id: organizationId path parameter. Organization ID
    :param _builtins.int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
    :param Sequence[_builtins.str] serials: serials query parameter. Optional parameter to filter by serial number.  All returned devices will have a serial number that is an exact match.
    :param _builtins.str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param Sequence[_builtins.str] upgradestatuses: upgradeStatuses query parameter. Optional parameter to filter by firmware upgrade statuses.
    """
    __args__ = dict()
    __args__['endingBefore'] = ending_before
    __args__['firmwareUpgradeBatchIds'] = firmware_upgrade_batch_ids
    __args__['macs'] = macs
    __args__['networkIds'] = network_ids
    __args__['organizationId'] = organization_id
    __args__['perPage'] = per_page
    __args__['serials'] = serials
    __args__['startingAfter'] = starting_after
    __args__['upgradestatuses'] = upgradestatuses
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:organizations/getFirmwareUpgradesByDevice:getFirmwareUpgradesByDevice', __args__, opts=opts, typ=GetFirmwareUpgradesByDeviceResult)
    return __ret__.apply(lambda __response__: GetFirmwareUpgradesByDeviceResult(
        ending_before=pulumi.get(__response__, 'ending_before'),
        firmware_upgrade_batch_ids=pulumi.get(__response__, 'firmware_upgrade_batch_ids'),
        id=pulumi.get(__response__, 'id'),
        items=pulumi.get(__response__, 'items'),
        macs=pulumi.get(__response__, 'macs'),
        network_ids=pulumi.get(__response__, 'network_ids'),
        organization_id=pulumi.get(__response__, 'organization_id'),
        per_page=pulumi.get(__response__, 'per_page'),
        serials=pulumi.get(__response__, 'serials'),
        starting_after=pulumi.get(__response__, 'starting_after'),
        upgradestatuses=pulumi.get(__response__, 'upgradestatuses')))
