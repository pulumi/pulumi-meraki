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
    'GetInsightApplicationsHealthByTimeResult',
    'AwaitableGetInsightApplicationsHealthByTimeResult',
    'get_insight_applications_health_by_time',
    'get_insight_applications_health_by_time_output',
]

@pulumi.output_type
class GetInsightApplicationsHealthByTimeResult:
    """
    A collection of values returned by getInsightApplicationsHealthByTime.
    """
    def __init__(__self__, application_id=None, id=None, items=None, network_id=None, resolution=None, t0=None, t1=None, timespan=None):
        if application_id and not isinstance(application_id, str):
            raise TypeError("Expected argument 'application_id' to be a str")
        pulumi.set(__self__, "application_id", application_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
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
    @pulumi.getter(name="applicationId")
    def application_id(self) -> str:
        """
        applicationId path parameter. Application ID
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetInsightApplicationsHealthByTimeItemResult']:
        """
        Array of ResponseInsightGetNetworkInsightApplicationHealthByTime
        """
        return pulumi.get(self, "items")

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
        resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 60, 300, 3600, 86400. The default is 300.
        """
        return pulumi.get(self, "resolution")

    @property
    @pulumi.getter
    def t0(self) -> Optional[str]:
        """
        t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 7 days from today.
        """
        return pulumi.get(self, "t0")

    @property
    @pulumi.getter
    def t1(self) -> Optional[str]:
        """
        t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
        """
        return pulumi.get(self, "t1")

    @property
    @pulumi.getter
    def timespan(self) -> Optional[float]:
        """
        timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
        """
        return pulumi.get(self, "timespan")


class AwaitableGetInsightApplicationsHealthByTimeResult(GetInsightApplicationsHealthByTimeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInsightApplicationsHealthByTimeResult(
            application_id=self.application_id,
            id=self.id,
            items=self.items,
            network_id=self.network_id,
            resolution=self.resolution,
            t0=self.t0,
            t1=self.t1,
            timespan=self.timespan)


def get_insight_applications_health_by_time(application_id: Optional[str] = None,
                                            network_id: Optional[str] = None,
                                            resolution: Optional[int] = None,
                                            t0: Optional[str] = None,
                                            t1: Optional[str] = None,
                                            timespan: Optional[float] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInsightApplicationsHealthByTimeResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_insight_applications_health_by_time(application_id="string",
        network_id="string",
        resolution=1,
        t0="string",
        t1="string",
        timespan=1)
    pulumi.export("merakiNetworksInsightApplicationsHealthByTimeExample", example.items)
    ```


    :param str application_id: applicationId path parameter. Application ID
    :param str network_id: networkId path parameter. Network ID
    :param int resolution: resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 60, 300, 3600, 86400. The default is 300.
    :param str t0: t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 7 days from today.
    :param str t1: t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
    :param float timespan: timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
    """
    __args__ = dict()
    __args__['applicationId'] = application_id
    __args__['networkId'] = network_id
    __args__['resolution'] = resolution
    __args__['t0'] = t0
    __args__['t1'] = t1
    __args__['timespan'] = timespan
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getInsightApplicationsHealthByTime:getInsightApplicationsHealthByTime', __args__, opts=opts, typ=GetInsightApplicationsHealthByTimeResult).value

    return AwaitableGetInsightApplicationsHealthByTimeResult(
        application_id=pulumi.get(__ret__, 'application_id'),
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'),
        resolution=pulumi.get(__ret__, 'resolution'),
        t0=pulumi.get(__ret__, 't0'),
        t1=pulumi.get(__ret__, 't1'),
        timespan=pulumi.get(__ret__, 'timespan'))


@_utilities.lift_output_func(get_insight_applications_health_by_time)
def get_insight_applications_health_by_time_output(application_id: Optional[pulumi.Input[str]] = None,
                                                   network_id: Optional[pulumi.Input[str]] = None,
                                                   resolution: Optional[pulumi.Input[Optional[int]]] = None,
                                                   t0: Optional[pulumi.Input[Optional[str]]] = None,
                                                   t1: Optional[pulumi.Input[Optional[str]]] = None,
                                                   timespan: Optional[pulumi.Input[Optional[float]]] = None,
                                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInsightApplicationsHealthByTimeResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.networks.get_insight_applications_health_by_time(application_id="string",
        network_id="string",
        resolution=1,
        t0="string",
        t1="string",
        timespan=1)
    pulumi.export("merakiNetworksInsightApplicationsHealthByTimeExample", example.items)
    ```


    :param str application_id: applicationId path parameter. Application ID
    :param str network_id: networkId path parameter. Network ID
    :param int resolution: resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 60, 300, 3600, 86400. The default is 300.
    :param str t0: t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 7 days from today.
    :param str t1: t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
    :param float timespan: timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
    """
    ...