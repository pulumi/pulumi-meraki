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
from ._inputs import *

__all__ = ['WirelessSsidsEapOverrideArgs', 'WirelessSsidsEapOverride']

@pulumi.input_type
class WirelessSsidsEapOverrideArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[str],
                 number: pulumi.Input[str],
                 eapol_key: Optional[pulumi.Input['WirelessSsidsEapOverrideEapolKeyArgs']] = None,
                 identity: Optional[pulumi.Input['WirelessSsidsEapOverrideIdentityArgs']] = None,
                 max_retries: Optional[pulumi.Input[int]] = None,
                 timeout: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a WirelessSsidsEapOverride resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] number: number path parameter.
        :param pulumi.Input['WirelessSsidsEapOverrideEapolKeyArgs'] eapol_key: EAPOL Key settings.
        :param pulumi.Input['WirelessSsidsEapOverrideIdentityArgs'] identity: EAP settings for identity requests.
        :param pulumi.Input[int] max_retries: Maximum number of general EAP retries.
        :param pulumi.Input[int] timeout: General EAP timeout in seconds.
        """
        pulumi.set(__self__, "network_id", network_id)
        pulumi.set(__self__, "number", number)
        if eapol_key is not None:
            pulumi.set(__self__, "eapol_key", eapol_key)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if max_retries is not None:
            pulumi.set(__self__, "max_retries", max_retries)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Input[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter
    def number(self) -> pulumi.Input[str]:
        """
        number path parameter.
        """
        return pulumi.get(self, "number")

    @number.setter
    def number(self, value: pulumi.Input[str]):
        pulumi.set(self, "number", value)

    @property
    @pulumi.getter(name="eapolKey")
    def eapol_key(self) -> Optional[pulumi.Input['WirelessSsidsEapOverrideEapolKeyArgs']]:
        """
        EAPOL Key settings.
        """
        return pulumi.get(self, "eapol_key")

    @eapol_key.setter
    def eapol_key(self, value: Optional[pulumi.Input['WirelessSsidsEapOverrideEapolKeyArgs']]):
        pulumi.set(self, "eapol_key", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input['WirelessSsidsEapOverrideIdentityArgs']]:
        """
        EAP settings for identity requests.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input['WirelessSsidsEapOverrideIdentityArgs']]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter(name="maxRetries")
    def max_retries(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of general EAP retries.
        """
        return pulumi.get(self, "max_retries")

    @max_retries.setter
    def max_retries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_retries", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[int]]:
        """
        General EAP timeout in seconds.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timeout", value)


@pulumi.input_type
class _WirelessSsidsEapOverrideState:
    def __init__(__self__, *,
                 eapol_key: Optional[pulumi.Input['WirelessSsidsEapOverrideEapolKeyArgs']] = None,
                 identity: Optional[pulumi.Input['WirelessSsidsEapOverrideIdentityArgs']] = None,
                 max_retries: Optional[pulumi.Input[int]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 number: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering WirelessSsidsEapOverride resources.
        :param pulumi.Input['WirelessSsidsEapOverrideEapolKeyArgs'] eapol_key: EAPOL Key settings.
        :param pulumi.Input['WirelessSsidsEapOverrideIdentityArgs'] identity: EAP settings for identity requests.
        :param pulumi.Input[int] max_retries: Maximum number of general EAP retries.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] number: number path parameter.
        :param pulumi.Input[int] timeout: General EAP timeout in seconds.
        """
        if eapol_key is not None:
            pulumi.set(__self__, "eapol_key", eapol_key)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if max_retries is not None:
            pulumi.set(__self__, "max_retries", max_retries)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if number is not None:
            pulumi.set(__self__, "number", number)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter(name="eapolKey")
    def eapol_key(self) -> Optional[pulumi.Input['WirelessSsidsEapOverrideEapolKeyArgs']]:
        """
        EAPOL Key settings.
        """
        return pulumi.get(self, "eapol_key")

    @eapol_key.setter
    def eapol_key(self, value: Optional[pulumi.Input['WirelessSsidsEapOverrideEapolKeyArgs']]):
        pulumi.set(self, "eapol_key", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input['WirelessSsidsEapOverrideIdentityArgs']]:
        """
        EAP settings for identity requests.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input['WirelessSsidsEapOverrideIdentityArgs']]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter(name="maxRetries")
    def max_retries(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of general EAP retries.
        """
        return pulumi.get(self, "max_retries")

    @max_retries.setter
    def max_retries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_retries", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[str]]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter
    def number(self) -> Optional[pulumi.Input[str]]:
        """
        number path parameter.
        """
        return pulumi.get(self, "number")

    @number.setter
    def number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "number", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[int]]:
        """
        General EAP timeout in seconds.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timeout", value)


class WirelessSsidsEapOverride(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 eapol_key: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsEapOverrideEapolKeyArgs']]] = None,
                 identity: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsEapOverrideIdentityArgs']]] = None,
                 max_retries: Optional[pulumi.Input[int]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 number: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/wirelessSsidsEapOverride:WirelessSsidsEapOverride example "network_id,number"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['WirelessSsidsEapOverrideEapolKeyArgs']] eapol_key: EAPOL Key settings.
        :param pulumi.Input[pulumi.InputType['WirelessSsidsEapOverrideIdentityArgs']] identity: EAP settings for identity requests.
        :param pulumi.Input[int] max_retries: Maximum number of general EAP retries.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] number: number path parameter.
        :param pulumi.Input[int] timeout: General EAP timeout in seconds.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WirelessSsidsEapOverrideArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/wirelessSsidsEapOverride:WirelessSsidsEapOverride example "network_id,number"
        ```

        :param str resource_name: The name of the resource.
        :param WirelessSsidsEapOverrideArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WirelessSsidsEapOverrideArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 eapol_key: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsEapOverrideEapolKeyArgs']]] = None,
                 identity: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsEapOverrideIdentityArgs']]] = None,
                 max_retries: Optional[pulumi.Input[int]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 number: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WirelessSsidsEapOverrideArgs.__new__(WirelessSsidsEapOverrideArgs)

            __props__.__dict__["eapol_key"] = eapol_key
            __props__.__dict__["identity"] = identity
            __props__.__dict__["max_retries"] = max_retries
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            if number is None and not opts.urn:
                raise TypeError("Missing required property 'number'")
            __props__.__dict__["number"] = number
            __props__.__dict__["timeout"] = timeout
        super(WirelessSsidsEapOverride, __self__).__init__(
            'meraki:networks/wirelessSsidsEapOverride:WirelessSsidsEapOverride',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            eapol_key: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsEapOverrideEapolKeyArgs']]] = None,
            identity: Optional[pulumi.Input[pulumi.InputType['WirelessSsidsEapOverrideIdentityArgs']]] = None,
            max_retries: Optional[pulumi.Input[int]] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            number: Optional[pulumi.Input[str]] = None,
            timeout: Optional[pulumi.Input[int]] = None) -> 'WirelessSsidsEapOverride':
        """
        Get an existing WirelessSsidsEapOverride resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['WirelessSsidsEapOverrideEapolKeyArgs']] eapol_key: EAPOL Key settings.
        :param pulumi.Input[pulumi.InputType['WirelessSsidsEapOverrideIdentityArgs']] identity: EAP settings for identity requests.
        :param pulumi.Input[int] max_retries: Maximum number of general EAP retries.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] number: number path parameter.
        :param pulumi.Input[int] timeout: General EAP timeout in seconds.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WirelessSsidsEapOverrideState.__new__(_WirelessSsidsEapOverrideState)

        __props__.__dict__["eapol_key"] = eapol_key
        __props__.__dict__["identity"] = identity
        __props__.__dict__["max_retries"] = max_retries
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["number"] = number
        __props__.__dict__["timeout"] = timeout
        return WirelessSsidsEapOverride(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="eapolKey")
    def eapol_key(self) -> pulumi.Output['outputs.WirelessSsidsEapOverrideEapolKey']:
        """
        EAPOL Key settings.
        """
        return pulumi.get(self, "eapol_key")

    @property
    @pulumi.getter
    def identity(self) -> pulumi.Output['outputs.WirelessSsidsEapOverrideIdentity']:
        """
        EAP settings for identity requests.
        """
        return pulumi.get(self, "identity")

    @property
    @pulumi.getter(name="maxRetries")
    def max_retries(self) -> pulumi.Output[int]:
        """
        Maximum number of general EAP retries.
        """
        return pulumi.get(self, "max_retries")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def number(self) -> pulumi.Output[str]:
        """
        number path parameter.
        """
        return pulumi.get(self, "number")

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Output[int]:
        """
        General EAP timeout in seconds.
        """
        return pulumi.get(self, "timeout")
