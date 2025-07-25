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
    'GetBluetoothClientsResult',
    'AwaitableGetBluetoothClientsResult',
    'get_bluetooth_clients',
    'get_bluetooth_clients_output',
]

@pulumi.output_type
class GetBluetoothClientsResult:
    """
    A collection of values returned by getBluetoothClients.
    """
    def __init__(__self__, bluetooth_client_id=None, connectivity_history_timespan=None, id=None, include_connectivity_history=None, item=None, network_id=None):
        if bluetooth_client_id and not isinstance(bluetooth_client_id, str):
            raise TypeError("Expected argument 'bluetooth_client_id' to be a str")
        pulumi.set(__self__, "bluetooth_client_id", bluetooth_client_id)
        if connectivity_history_timespan and not isinstance(connectivity_history_timespan, int):
            raise TypeError("Expected argument 'connectivity_history_timespan' to be a int")
        pulumi.set(__self__, "connectivity_history_timespan", connectivity_history_timespan)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if include_connectivity_history and not isinstance(include_connectivity_history, bool):
            raise TypeError("Expected argument 'include_connectivity_history' to be a bool")
        pulumi.set(__self__, "include_connectivity_history", include_connectivity_history)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)

    @_builtins.property
    @pulumi.getter(name="bluetoothClientId")
    def bluetooth_client_id(self) -> _builtins.str:
        """
        bluetoothClientId path parameter. Bluetooth client ID
        """
        return pulumi.get(self, "bluetooth_client_id")

    @_builtins.property
    @pulumi.getter(name="connectivityHistoryTimespan")
    def connectivity_history_timespan(self) -> Optional[_builtins.int]:
        """
        connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
        """
        return pulumi.get(self, "connectivity_history_timespan")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="includeConnectivityHistory")
    def include_connectivity_history(self) -> Optional[_builtins.bool]:
        """
        includeConnectivityHistory query parameter. Include the connectivity history for this client
        """
        return pulumi.get(self, "include_connectivity_history")

    @_builtins.property
    @pulumi.getter
    def item(self) -> 'outputs.GetBluetoothClientsItemResult':
        return pulumi.get(self, "item")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> _builtins.str:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")


class AwaitableGetBluetoothClientsResult(GetBluetoothClientsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBluetoothClientsResult(
            bluetooth_client_id=self.bluetooth_client_id,
            connectivity_history_timespan=self.connectivity_history_timespan,
            id=self.id,
            include_connectivity_history=self.include_connectivity_history,
            item=self.item,
            network_id=self.network_id)


def get_bluetooth_clients(bluetooth_client_id: Optional[_builtins.str] = None,
                          connectivity_history_timespan: Optional[_builtins.int] = None,
                          include_connectivity_history: Optional[_builtins.bool] = None,
                          network_id: Optional[_builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBluetoothClientsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_bluetooth_clients(bluetooth_client_id="string",
        connectivity_history_timespan=1,
        include_connectivity_history=False,
        network_id="string")
    pulumi.export("merakiNetworksBluetoothClientsExample", example.item)
    ```


    :param _builtins.str bluetooth_client_id: bluetoothClientId path parameter. Bluetooth client ID
    :param _builtins.int connectivity_history_timespan: connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
    :param _builtins.bool include_connectivity_history: includeConnectivityHistory query parameter. Include the connectivity history for this client
    :param _builtins.str network_id: networkId path parameter. Network ID
    """
    __args__ = dict()
    __args__['bluetoothClientId'] = bluetooth_client_id
    __args__['connectivityHistoryTimespan'] = connectivity_history_timespan
    __args__['includeConnectivityHistory'] = include_connectivity_history
    __args__['networkId'] = network_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getBluetoothClients:getBluetoothClients', __args__, opts=opts, typ=GetBluetoothClientsResult).value

    return AwaitableGetBluetoothClientsResult(
        bluetooth_client_id=pulumi.get(__ret__, 'bluetooth_client_id'),
        connectivity_history_timespan=pulumi.get(__ret__, 'connectivity_history_timespan'),
        id=pulumi.get(__ret__, 'id'),
        include_connectivity_history=pulumi.get(__ret__, 'include_connectivity_history'),
        item=pulumi.get(__ret__, 'item'),
        network_id=pulumi.get(__ret__, 'network_id'))
def get_bluetooth_clients_output(bluetooth_client_id: Optional[pulumi.Input[_builtins.str]] = None,
                                 connectivity_history_timespan: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                 include_connectivity_history: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBluetoothClientsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_bluetooth_clients(bluetooth_client_id="string",
        connectivity_history_timespan=1,
        include_connectivity_history=False,
        network_id="string")
    pulumi.export("merakiNetworksBluetoothClientsExample", example.item)
    ```


    :param _builtins.str bluetooth_client_id: bluetoothClientId path parameter. Bluetooth client ID
    :param _builtins.int connectivity_history_timespan: connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
    :param _builtins.bool include_connectivity_history: includeConnectivityHistory query parameter. Include the connectivity history for this client
    :param _builtins.str network_id: networkId path parameter. Network ID
    """
    __args__ = dict()
    __args__['bluetoothClientId'] = bluetooth_client_id
    __args__['connectivityHistoryTimespan'] = connectivity_history_timespan
    __args__['includeConnectivityHistory'] = include_connectivity_history
    __args__['networkId'] = network_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:networks/getBluetoothClients:getBluetoothClients', __args__, opts=opts, typ=GetBluetoothClientsResult)
    return __ret__.apply(lambda __response__: GetBluetoothClientsResult(
        bluetooth_client_id=pulumi.get(__response__, 'bluetooth_client_id'),
        connectivity_history_timespan=pulumi.get(__response__, 'connectivity_history_timespan'),
        id=pulumi.get(__response__, 'id'),
        include_connectivity_history=pulumi.get(__response__, 'include_connectivity_history'),
        item=pulumi.get(__response__, 'item'),
        network_id=pulumi.get(__response__, 'network_id')))
