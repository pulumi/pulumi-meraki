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
    'GetWebhooksHttpServersResult',
    'AwaitableGetWebhooksHttpServersResult',
    'get_webhooks_http_servers',
    'get_webhooks_http_servers_output',
]

@pulumi.output_type
class GetWebhooksHttpServersResult:
    """
    A collection of values returned by getWebhooksHttpServers.
    """
    def __init__(__self__, http_server_id=None, id=None, item=None, items=None, network_id=None):
        if http_server_id and not isinstance(http_server_id, str):
            raise TypeError("Expected argument 'http_server_id' to be a str")
        pulumi.set(__self__, "http_server_id", http_server_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if item and not isinstance(item, dict):
            raise TypeError("Expected argument 'item' to be a dict")
        pulumi.set(__self__, "item", item)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)

    @property
    @pulumi.getter(name="httpServerId")
    def http_server_id(self) -> Optional[str]:
        """
        httpServerId path parameter. Http server ID
        """
        return pulumi.get(self, "http_server_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def item(self) -> 'outputs.GetWebhooksHttpServersItemResult':
        return pulumi.get(self, "item")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetWebhooksHttpServersItemResult']:
        """
        Array of ResponseNetworksGetNetworkWebhooksHttpServers
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")


class AwaitableGetWebhooksHttpServersResult(GetWebhooksHttpServersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWebhooksHttpServersResult(
            http_server_id=self.http_server_id,
            id=self.id,
            item=self.item,
            items=self.items,
            network_id=self.network_id)


def get_webhooks_http_servers(http_server_id: Optional[str] = None,
                              network_id: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWebhooksHttpServersResult:
    """
    ## Example Usage


    :param str http_server_id: httpServerId path parameter. Http server ID
    :param str network_id: networkId path parameter. Network ID
    """
    __args__ = dict()
    __args__['httpServerId'] = http_server_id
    __args__['networkId'] = network_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:networks/getWebhooksHttpServers:getWebhooksHttpServers', __args__, opts=opts, typ=GetWebhooksHttpServersResult).value

    return AwaitableGetWebhooksHttpServersResult(
        http_server_id=pulumi.get(__ret__, 'http_server_id'),
        id=pulumi.get(__ret__, 'id'),
        item=pulumi.get(__ret__, 'item'),
        items=pulumi.get(__ret__, 'items'),
        network_id=pulumi.get(__ret__, 'network_id'))


@_utilities.lift_output_func(get_webhooks_http_servers)
def get_webhooks_http_servers_output(http_server_id: Optional[pulumi.Input[Optional[str]]] = None,
                                     network_id: Optional[pulumi.Input[Optional[str]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetWebhooksHttpServersResult]:
    """
    ## Example Usage


    :param str http_server_id: httpServerId path parameter. Http server ID
    :param str network_id: networkId path parameter. Network ID
    """
    ...