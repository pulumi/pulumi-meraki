# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetClientsOverviewResult',
    'AwaitableGetClientsOverviewResult',
    'get_clients_overview',
    'get_clients_overview_output',
]

@pulumi.output_type
class GetClientsOverviewResult:
    """
    A collection of values returned by getClientsOverview.
    """
    def __init__(__self__, id=None, item=None, network_id=None, resolution=None, t0=None, t1=None, timespan=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)
        if resolution and not isinstance(resolution, int):
            raise TypeError("Expected argument 'resolution' to be a int")
        pulumi.set(__self__, "resolution", resolution)
        if t0 and not isinstance(t0, str):
            raise TypeError("Expected argument 't0' to be a str")
        pulumi.set(__self__, "t0", t0)
        if t1 and not isinstance(t1, str):
            raise TypeError("Expected argument 't1' to be a str")
        pulumi.set(__self__, "t1", t1)
        if timespan and not isinstance(timespan, float):
            raise TypeError("Expected argument 'timespan' to be a float")
        pulumi.set(__self__, "timespan", timespan)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetClientsOverviewItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> str:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def resolution(self) -> Optional[int]:
        """
        resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 7200, 86400, 604800, 2592000. The default is 604800.
        """
        return pulumi.get(self, "resolution")

    @property
    @pulumi.getter
    def t0(self) -> Optional[str]:
        """
        t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
        """
        return pulumi.get(self, "t0")

    @property
    @pulumi.getter
    def t1(self) -> Optional[str]:
        """
        t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
        """
        return pulumi.get(self, "t1")

    @property
    @pulumi.getter
    def timespan(self) -> Optional[float]:
        """
        timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
        """
        return pulumi.get(self, "timespan")


class AwaitableGetClientsOverviewResult(GetClientsOverviewResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClientsOverviewResult(
            id=self.id,
            item=self.item,
            network_id=self.network_id,
            resolution=self.resolution,
            t0=self.t0,
            t1=self.t1,
            timespan=self.timespan)


def get_clients_overview(network_id: Optional[str] = None,
                         resolution: Optional[int] = None,
                         t0: Optional[str] = None,
                         t1: Optional[str] = None,
                         timespan: Optional[float] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClientsOverviewResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_clients_overview(network_id="string",
        resolution=1,
        t0="string",
        t1="string",
        timespan=1)
    pulumi.export("merakiNetworksClientsOverviewExample", example.item)
    ```


    :param str network_id: networkId path parameter. Network ID
    :param int resolution: resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 7200, 86400, 604800, 2592000. The default is 604800.
    :param str t0: t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
    :param str t1: t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
    :param float timespan: timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
    """
    __args__ = dict()
    __args__['networkId'] = network_id
    __args__['resolution'] = resolution
    __args__['t0'] = t0
    __args__['t1'] = t1
    __args__['timespan'] = timespan
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getClientsOverview:getClientsOverview', __args__, opts=opts, typ=GetClientsOverviewResult).value

    return AwaitableGetClientsOverviewResult(
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        network_id=pulumi.get(__ret__, 'network_id'),
        resolution=pulumi.get(__ret__, 'resolution'),
        t0=pulumi.get(__ret__, 't0'),
        t1=pulumi.get(__ret__, 't1'),
        timespan=pulumi.get(__ret__, 'timespan'))


@_utilities.lift_output_func(get_clients_overview)
def get_clients_overview_output(network_id: Optional[pulumi.Input[str]] = None,
                                resolution: Optional[pulumi.Input[Optional[int]]] = None,
                                t0: Optional[pulumi.Input[Optional[str]]] = None,
                                t1: Optional[pulumi.Input[Optional[str]]] = None,
                                timespan: Optional[pulumi.Input[Optional[float]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClientsOverviewResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_clients_overview(network_id="string",
        resolution=1,
        t0="string",
        t1="string",
        timespan=1)
    pulumi.export("merakiNetworksClientsOverviewExample", example.item)
    ```


    :param str network_id: networkId path parameter. Network ID
    :param int resolution: resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 7200, 86400, 604800, 2592000. The default is 604800.
    :param str t0: t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
    :param str t1: t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
    :param float timespan: timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
    """
    ...