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
    'GetWirelessFailedConnectionsResult',
    'AwaitableGetWirelessFailedConnectionsResult',
    'get_wireless_failed_connections',
    'get_wireless_failed_connections_output',
]

@pulumi.output_type
class GetWirelessFailedConnectionsResult:
    """
    A collection of values returned by getWirelessFailedConnections.
    """
    def __init__(__self__, ap_tag=None, band=None, client_id=None, id=None, items=None, network_id=None, serial=None, ssid=None, t0=None, t1=None, timespan=None, vlan=None):
        if ap_tag and not isinstance(ap_tag, str):
            raise TypeError("Expected argument 'ap_tag' to be a str")
        pulumi.set(__self__, "ap_tag", ap_tag)
        if band and not isinstance(band, str):
            raise TypeError("Expected argument 'band' to be a str")
        pulumi.set(__self__, "band", band)
        if client_id and not isinstance(client_id, str):
            raise TypeError("Expected argument 'client_id' to be a str")
        pulumi.set(__self__, "client_id", client_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)
        if serial and not isinstance(serial, str):
            raise TypeError("Expected argument 'serial' to be a str")
        pulumi.set(__self__, "serial", serial)
        if ssid and not isinstance(ssid, int):
            raise TypeError("Expected argument 'ssid' to be a int")
        pulumi.set(__self__, "ssid", ssid)
        if t0 and not isinstance(t0, str):
            raise TypeError("Expected argument 't0' to be a str")
        pulumi.set(__self__, "t0", t0)
        if t1 and not isinstance(t1, str):
            raise TypeError("Expected argument 't1' to be a str")
        pulumi.set(__self__, "t1", t1)
        if timespan and not isinstance(timespan, float):
            raise TypeError("Expected argument 'timespan' to be a float")
        pulumi.set(__self__, "timespan", timespan)
        if vlan and not isinstance(vlan, int):
            raise TypeError("Expected argument 'vlan' to be a int")
        pulumi.set(__self__, "vlan", vlan)

    @_builtins.property
    @pulumi.getter(name="apTag")
    def ap_tag(self) -> Optional[_builtins.str]:
        """
        apTag query parameter. Filter results by AP Tag
        """
        return pulumi.get(self, "ap_tag")

    @_builtins.property
    @pulumi.getter
    def band(self) -> Optional[_builtins.str]:
        """
        band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
        """
        return pulumi.get(self, "band")

    @_builtins.property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[_builtins.str]:
        """
        clientId query parameter. Filter by client MAC
        """
        return pulumi.get(self, "client_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetWirelessFailedConnectionsItemResult']:
        """
        Array of ResponseWirelessGetNetworkWirelessFailedConnections
        """
        return pulumi.get(self, "items")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> _builtins.str:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @_builtins.property
    @pulumi.getter
    def serial(self) -> Optional[_builtins.str]:
        """
        serial query parameter. Filter by AP
        """
        return pulumi.get(self, "serial")

    @_builtins.property
    @pulumi.getter
    def ssid(self) -> Optional[_builtins.int]:
        """
        ssid query parameter. Filter results by SSID
        """
        return pulumi.get(self, "ssid")

    @_builtins.property
    @pulumi.getter
    def t0(self) -> Optional[_builtins.str]:
        """
        t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
        """
        return pulumi.get(self, "t0")

    @_builtins.property
    @pulumi.getter
    def t1(self) -> Optional[_builtins.str]:
        """
        t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
        """
        return pulumi.get(self, "t1")

    @_builtins.property
    @pulumi.getter
    def timespan(self) -> Optional[_builtins.float]:
        """
        timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
        """
        return pulumi.get(self, "timespan")

    @_builtins.property
    @pulumi.getter
    def vlan(self) -> Optional[_builtins.int]:
        """
        vlan query parameter. Filter results by VLAN
        """
        return pulumi.get(self, "vlan")


class AwaitableGetWirelessFailedConnectionsResult(GetWirelessFailedConnectionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWirelessFailedConnectionsResult(
            ap_tag=self.ap_tag,
            band=self.band,
            client_id=self.client_id,
            id=self.id,
            items=self.items,
            network_id=self.network_id,
            serial=self.serial,
            ssid=self.ssid,
            t0=self.t0,
            t1=self.t1,
            timespan=self.timespan,
            vlan=self.vlan)


def get_wireless_failed_connections(ap_tag: Optional[_builtins.str] = None,
                                    band: Optional[_builtins.str] = None,
                                    client_id: Optional[_builtins.str] = None,
                                    network_id: Optional[_builtins.str] = None,
                                    serial: Optional[_builtins.str] = None,
                                    ssid: Optional[_builtins.int] = None,
                                    t0: Optional[_builtins.str] = None,
                                    t1: Optional[_builtins.str] = None,
                                    timespan: Optional[_builtins.float] = None,
                                    vlan: Optional[_builtins.int] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWirelessFailedConnectionsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_wireless_failed_connections(ap_tag="string",
        band="string",
        client_id="string",
        network_id="string",
        serial="string",
        ssid=1,
        t0="string",
        t1="string",
        timespan=1,
        vlan=1)
    pulumi.export("merakiNetworksWirelessFailedConnectionsExample", example.items)
    ```


    :param _builtins.str ap_tag: apTag query parameter. Filter results by AP Tag
    :param _builtins.str band: band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
    :param _builtins.str client_id: clientId query parameter. Filter by client MAC
    :param _builtins.str network_id: networkId path parameter. Network ID
    :param _builtins.str serial: serial query parameter. Filter by AP
    :param _builtins.int ssid: ssid query parameter. Filter results by SSID
    :param _builtins.str t0: t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
    :param _builtins.str t1: t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
    :param _builtins.float timespan: timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
    :param _builtins.int vlan: vlan query parameter. Filter results by VLAN
    """
    __args__ = dict()
    __args__['apTag'] = ap_tag
    __args__['band'] = band
    __args__['clientId'] = client_id
    __args__['networkId'] = network_id
    __args__['serial'] = serial
    __args__['ssid'] = ssid
    __args__['t0'] = t0
    __args__['t1'] = t1
    __args__['timespan'] = timespan
    __args__['vlan'] = vlan
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getWirelessFailedConnections:getWirelessFailedConnections', __args__, opts=opts, typ=GetWirelessFailedConnectionsResult).value

    return AwaitableGetWirelessFailedConnectionsResult(
        ap_tag=pulumi.get(__ret__, 'ap_tag'),
        band=pulumi.get(__ret__, 'band'),
        client_id=pulumi.get(__ret__, 'client_id'),
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'),
        serial=pulumi.get(__ret__, 'serial'),
        ssid=pulumi.get(__ret__, 'ssid'),
        t0=pulumi.get(__ret__, 't0'),
        t1=pulumi.get(__ret__, 't1'),
        timespan=pulumi.get(__ret__, 'timespan'),
        vlan=pulumi.get(__ret__, 'vlan'))
def get_wireless_failed_connections_output(ap_tag: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                           band: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                           client_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                           network_id: Optional[pulumi.Input[_builtins.str]] = None,
                                           serial: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                           ssid: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                           t0: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                           t1: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                           timespan: Optional[pulumi.Input[Optional[_builtins.float]]] = None,
                                           vlan: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetWirelessFailedConnectionsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_wireless_failed_connections(ap_tag="string",
        band="string",
        client_id="string",
        network_id="string",
        serial="string",
        ssid=1,
        t0="string",
        t1="string",
        timespan=1,
        vlan=1)
    pulumi.export("merakiNetworksWirelessFailedConnectionsExample", example.items)
    ```


    :param _builtins.str ap_tag: apTag query parameter. Filter results by AP Tag
    :param _builtins.str band: band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
    :param _builtins.str client_id: clientId query parameter. Filter by client MAC
    :param _builtins.str network_id: networkId path parameter. Network ID
    :param _builtins.str serial: serial query parameter. Filter by AP
    :param _builtins.int ssid: ssid query parameter. Filter results by SSID
    :param _builtins.str t0: t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
    :param _builtins.str t1: t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
    :param _builtins.float timespan: timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
    :param _builtins.int vlan: vlan query parameter. Filter results by VLAN
    """
    __args__ = dict()
    __args__['apTag'] = ap_tag
    __args__['band'] = band
    __args__['clientId'] = client_id
    __args__['networkId'] = network_id
    __args__['serial'] = serial
    __args__['ssid'] = ssid
    __args__['t0'] = t0
    __args__['t1'] = t1
    __args__['timespan'] = timespan
    __args__['vlan'] = vlan
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:networks/getWirelessFailedConnections:getWirelessFailedConnections', __args__, opts=opts, typ=GetWirelessFailedConnectionsResult)
    return __ret__.apply(lambda __response__: GetWirelessFailedConnectionsResult(
        ap_tag=pulumi.get(__response__, 'ap_tag'),
        band=pulumi.get(__response__, 'band'),
        client_id=pulumi.get(__response__, 'client_id'),
        id=pulumi.get(__response__, 'id'),
        items=pulumi.get(__response__, 'items'),
        network_id=pulumi.get(__response__, 'network_id'),
        serial=pulumi.get(__response__, 'serial'),
        ssid=pulumi.get(__response__, 'ssid'),
        t0=pulumi.get(__response__, 't0'),
        t1=pulumi.get(__response__, 't1'),
        timespan=pulumi.get(__response__, 'timespan'),
        vlan=pulumi.get(__response__, 'vlan')))
