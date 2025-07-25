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

__all__ = ['CellularGatewayDhcpArgs', 'CellularGatewayDhcp']

@pulumi.input_type
class CellularGatewayDhcpArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[_builtins.str],
                 dhcp_lease_time: Optional[pulumi.Input[_builtins.str]] = None,
                 dns_custom_nameservers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 dns_nameservers: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a CellularGatewayDhcp resource.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[_builtins.str] dhcp_lease_time: DHCP Lease time for all MG in the network.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] dns_custom_nameservers: List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
        :param pulumi.Input[_builtins.str] dns_nameservers: DNS name servers mode for all MG in the network.
        """
        pulumi.set(__self__, "network_id", network_id)
        if dhcp_lease_time is not None:
            pulumi.set(__self__, "dhcp_lease_time", dhcp_lease_time)
        if dns_custom_nameservers is not None:
            pulumi.set(__self__, "dns_custom_nameservers", dns_custom_nameservers)
        if dns_nameservers is not None:
            pulumi.set(__self__, "dns_nameservers", dns_nameservers)

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Input[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "network_id", value)

    @_builtins.property
    @pulumi.getter(name="dhcpLeaseTime")
    def dhcp_lease_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        DHCP Lease time for all MG in the network.
        """
        return pulumi.get(self, "dhcp_lease_time")

    @dhcp_lease_time.setter
    def dhcp_lease_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dhcp_lease_time", value)

    @_builtins.property
    @pulumi.getter(name="dnsCustomNameservers")
    def dns_custom_nameservers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
        """
        return pulumi.get(self, "dns_custom_nameservers")

    @dns_custom_nameservers.setter
    def dns_custom_nameservers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "dns_custom_nameservers", value)

    @_builtins.property
    @pulumi.getter(name="dnsNameservers")
    def dns_nameservers(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        DNS name servers mode for all MG in the network.
        """
        return pulumi.get(self, "dns_nameservers")

    @dns_nameservers.setter
    def dns_nameservers(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dns_nameservers", value)


@pulumi.input_type
class _CellularGatewayDhcpState:
    def __init__(__self__, *,
                 dhcp_lease_time: Optional[pulumi.Input[_builtins.str]] = None,
                 dns_custom_nameservers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 dns_nameservers: Optional[pulumi.Input[_builtins.str]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering CellularGatewayDhcp resources.
        :param pulumi.Input[_builtins.str] dhcp_lease_time: DHCP Lease time for all MG in the network.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] dns_custom_nameservers: List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
        :param pulumi.Input[_builtins.str] dns_nameservers: DNS name servers mode for all MG in the network.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        """
        if dhcp_lease_time is not None:
            pulumi.set(__self__, "dhcp_lease_time", dhcp_lease_time)
        if dns_custom_nameservers is not None:
            pulumi.set(__self__, "dns_custom_nameservers", dns_custom_nameservers)
        if dns_nameservers is not None:
            pulumi.set(__self__, "dns_nameservers", dns_nameservers)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)

    @_builtins.property
    @pulumi.getter(name="dhcpLeaseTime")
    def dhcp_lease_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        DHCP Lease time for all MG in the network.
        """
        return pulumi.get(self, "dhcp_lease_time")

    @dhcp_lease_time.setter
    def dhcp_lease_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dhcp_lease_time", value)

    @_builtins.property
    @pulumi.getter(name="dnsCustomNameservers")
    def dns_custom_nameservers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
        """
        return pulumi.get(self, "dns_custom_nameservers")

    @dns_custom_nameservers.setter
    def dns_custom_nameservers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "dns_custom_nameservers", value)

    @_builtins.property
    @pulumi.getter(name="dnsNameservers")
    def dns_nameservers(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        DNS name servers mode for all MG in the network.
        """
        return pulumi.get(self, "dns_nameservers")

    @dns_nameservers.setter
    def dns_nameservers(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dns_nameservers", value)

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network_id", value)


@pulumi.type_token("meraki:networks/cellularGatewayDhcp:CellularGatewayDhcp")
class CellularGatewayDhcp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dhcp_lease_time: Optional[pulumi.Input[_builtins.str]] = None,
                 dns_custom_nameservers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 dns_nameservers: Optional[pulumi.Input[_builtins.str]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.CellularGatewayDhcp("example",
            dhcp_lease_time="1 hour",
            dns_custom_nameservers=[
                "172.16.2.111",
                "172.16.2.30",
            ],
            dns_nameservers="custom",
            network_id="string")
        pulumi.export("merakiNetworksCellularGatewayDhcpExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/cellularGatewayDhcp:CellularGatewayDhcp example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] dhcp_lease_time: DHCP Lease time for all MG in the network.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] dns_custom_nameservers: List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
        :param pulumi.Input[_builtins.str] dns_nameservers: DNS name servers mode for all MG in the network.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CellularGatewayDhcpArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.CellularGatewayDhcp("example",
            dhcp_lease_time="1 hour",
            dns_custom_nameservers=[
                "172.16.2.111",
                "172.16.2.30",
            ],
            dns_nameservers="custom",
            network_id="string")
        pulumi.export("merakiNetworksCellularGatewayDhcpExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/cellularGatewayDhcp:CellularGatewayDhcp example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param CellularGatewayDhcpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CellularGatewayDhcpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dhcp_lease_time: Optional[pulumi.Input[_builtins.str]] = None,
                 dns_custom_nameservers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 dns_nameservers: Optional[pulumi.Input[_builtins.str]] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CellularGatewayDhcpArgs.__new__(CellularGatewayDhcpArgs)

            __props__.__dict__["dhcp_lease_time"] = dhcp_lease_time
            __props__.__dict__["dns_custom_nameservers"] = dns_custom_nameservers
            __props__.__dict__["dns_nameservers"] = dns_nameservers
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
        super(CellularGatewayDhcp, __self__).__init__(
            'meraki:networks/cellularGatewayDhcp:CellularGatewayDhcp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dhcp_lease_time: Optional[pulumi.Input[_builtins.str]] = None,
            dns_custom_nameservers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            dns_nameservers: Optional[pulumi.Input[_builtins.str]] = None,
            network_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'CellularGatewayDhcp':
        """
        Get an existing CellularGatewayDhcp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] dhcp_lease_time: DHCP Lease time for all MG in the network.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] dns_custom_nameservers: List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
        :param pulumi.Input[_builtins.str] dns_nameservers: DNS name servers mode for all MG in the network.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CellularGatewayDhcpState.__new__(_CellularGatewayDhcpState)

        __props__.__dict__["dhcp_lease_time"] = dhcp_lease_time
        __props__.__dict__["dns_custom_nameservers"] = dns_custom_nameservers
        __props__.__dict__["dns_nameservers"] = dns_nameservers
        __props__.__dict__["network_id"] = network_id
        return CellularGatewayDhcp(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="dhcpLeaseTime")
    def dhcp_lease_time(self) -> pulumi.Output[_builtins.str]:
        """
        DHCP Lease time for all MG in the network.
        """
        return pulumi.get(self, "dhcp_lease_time")

    @_builtins.property
    @pulumi.getter(name="dnsCustomNameservers")
    def dns_custom_nameservers(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
        """
        return pulumi.get(self, "dns_custom_nameservers")

    @_builtins.property
    @pulumi.getter(name="dnsNameservers")
    def dns_nameservers(self) -> pulumi.Output[_builtins.str]:
        """
        DNS name servers mode for all MG in the network.
        """
        return pulumi.get(self, "dns_nameservers")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

