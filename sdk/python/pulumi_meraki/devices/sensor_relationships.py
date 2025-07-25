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
from ._inputs import *

__all__ = ['SensorRelationshipsArgs', 'SensorRelationships']

@pulumi.input_type
class SensorRelationshipsArgs:
    def __init__(__self__, *,
                 serial: pulumi.Input[_builtins.str],
                 livestream: Optional[pulumi.Input['SensorRelationshipsLivestreamArgs']] = None,
                 livestream_requests: Optional[pulumi.Input[Sequence[pulumi.Input['SensorRelationshipsLivestreamRequestArgs']]]] = None):
        """
        The set of arguments for constructing a SensorRelationships resource.
        :param pulumi.Input[_builtins.str] serial: serial path parameter.
        :param pulumi.Input['SensorRelationshipsLivestreamArgs'] livestream: A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        :param pulumi.Input[Sequence[pulumi.Input['SensorRelationshipsLivestreamRequestArgs']]] livestream_requests: A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        """
        pulumi.set(__self__, "serial", serial)
        if livestream is not None:
            pulumi.set(__self__, "livestream", livestream)
        if livestream_requests is not None:
            pulumi.set(__self__, "livestream_requests", livestream_requests)

    @_builtins.property
    @pulumi.getter
    def serial(self) -> pulumi.Input[_builtins.str]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

    @serial.setter
    def serial(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "serial", value)

    @_builtins.property
    @pulumi.getter
    def livestream(self) -> Optional[pulumi.Input['SensorRelationshipsLivestreamArgs']]:
        """
        A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        """
        return pulumi.get(self, "livestream")

    @livestream.setter
    def livestream(self, value: Optional[pulumi.Input['SensorRelationshipsLivestreamArgs']]):
        pulumi.set(self, "livestream", value)

    @_builtins.property
    @pulumi.getter(name="livestreamRequests")
    def livestream_requests(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SensorRelationshipsLivestreamRequestArgs']]]]:
        """
        A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        """
        return pulumi.get(self, "livestream_requests")

    @livestream_requests.setter
    def livestream_requests(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SensorRelationshipsLivestreamRequestArgs']]]]):
        pulumi.set(self, "livestream_requests", value)


@pulumi.input_type
class _SensorRelationshipsState:
    def __init__(__self__, *,
                 livestream: Optional[pulumi.Input['SensorRelationshipsLivestreamArgs']] = None,
                 livestream_requests: Optional[pulumi.Input[Sequence[pulumi.Input['SensorRelationshipsLivestreamRequestArgs']]]] = None,
                 serial: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering SensorRelationships resources.
        :param pulumi.Input['SensorRelationshipsLivestreamArgs'] livestream: A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        :param pulumi.Input[Sequence[pulumi.Input['SensorRelationshipsLivestreamRequestArgs']]] livestream_requests: A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        :param pulumi.Input[_builtins.str] serial: serial path parameter.
        """
        if livestream is not None:
            pulumi.set(__self__, "livestream", livestream)
        if livestream_requests is not None:
            pulumi.set(__self__, "livestream_requests", livestream_requests)
        if serial is not None:
            pulumi.set(__self__, "serial", serial)

    @_builtins.property
    @pulumi.getter
    def livestream(self) -> Optional[pulumi.Input['SensorRelationshipsLivestreamArgs']]:
        """
        A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        """
        return pulumi.get(self, "livestream")

    @livestream.setter
    def livestream(self, value: Optional[pulumi.Input['SensorRelationshipsLivestreamArgs']]):
        pulumi.set(self, "livestream", value)

    @_builtins.property
    @pulumi.getter(name="livestreamRequests")
    def livestream_requests(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SensorRelationshipsLivestreamRequestArgs']]]]:
        """
        A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        """
        return pulumi.get(self, "livestream_requests")

    @livestream_requests.setter
    def livestream_requests(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SensorRelationshipsLivestreamRequestArgs']]]]):
        pulumi.set(self, "livestream_requests", value)

    @_builtins.property
    @pulumi.getter
    def serial(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

    @serial.setter
    def serial(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "serial", value)


@pulumi.type_token("meraki:devices/sensorRelationships:SensorRelationships")
class SensorRelationships(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 livestream: Optional[pulumi.Input[Union['SensorRelationshipsLivestreamArgs', 'SensorRelationshipsLivestreamArgsDict']]] = None,
                 livestream_requests: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SensorRelationshipsLivestreamRequestArgs', 'SensorRelationshipsLivestreamRequestArgsDict']]]]] = None,
                 serial: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:devices/sensorRelationships:SensorRelationships example "serial"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['SensorRelationshipsLivestreamArgs', 'SensorRelationshipsLivestreamArgsDict']] livestream: A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SensorRelationshipsLivestreamRequestArgs', 'SensorRelationshipsLivestreamRequestArgsDict']]]] livestream_requests: A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        :param pulumi.Input[_builtins.str] serial: serial path parameter.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SensorRelationshipsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:devices/sensorRelationships:SensorRelationships example "serial"
        ```

        :param str resource_name: The name of the resource.
        :param SensorRelationshipsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SensorRelationshipsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 livestream: Optional[pulumi.Input[Union['SensorRelationshipsLivestreamArgs', 'SensorRelationshipsLivestreamArgsDict']]] = None,
                 livestream_requests: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SensorRelationshipsLivestreamRequestArgs', 'SensorRelationshipsLivestreamRequestArgsDict']]]]] = None,
                 serial: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SensorRelationshipsArgs.__new__(SensorRelationshipsArgs)

            __props__.__dict__["livestream"] = livestream
            __props__.__dict__["livestream_requests"] = livestream_requests
            if serial is None and not opts.urn:
                raise TypeError("Missing required property 'serial'")
            __props__.__dict__["serial"] = serial
        super(SensorRelationships, __self__).__init__(
            'meraki:devices/sensorRelationships:SensorRelationships',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            livestream: Optional[pulumi.Input[Union['SensorRelationshipsLivestreamArgs', 'SensorRelationshipsLivestreamArgsDict']]] = None,
            livestream_requests: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SensorRelationshipsLivestreamRequestArgs', 'SensorRelationshipsLivestreamRequestArgsDict']]]]] = None,
            serial: Optional[pulumi.Input[_builtins.str]] = None) -> 'SensorRelationships':
        """
        Get an existing SensorRelationships resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['SensorRelationshipsLivestreamArgs', 'SensorRelationshipsLivestreamArgsDict']] livestream: A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SensorRelationshipsLivestreamRequestArgs', 'SensorRelationshipsLivestreamRequestArgsDict']]]] livestream_requests: A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        :param pulumi.Input[_builtins.str] serial: serial path parameter.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SensorRelationshipsState.__new__(_SensorRelationshipsState)

        __props__.__dict__["livestream"] = livestream
        __props__.__dict__["livestream_requests"] = livestream_requests
        __props__.__dict__["serial"] = serial
        return SensorRelationships(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def livestream(self) -> pulumi.Output['outputs.SensorRelationshipsLivestream']:
        """
        A role defined between an MT sensor and an MV camera that adds the camera's livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        """
        return pulumi.get(self, "livestream")

    @_builtins.property
    @pulumi.getter(name="livestreamRequests")
    def livestream_requests(self) -> pulumi.Output[Sequence['outputs.SensorRelationshipsLivestreamRequest']]:
        """
        A role defined between an MT sensor and an MV camera that adds the camera's r.Livestream to the sensor's details page. Snapshots from the camera will also appear in alert notifications that the sensor triggers.
        """
        return pulumi.get(self, "livestream_requests")

    @_builtins.property
    @pulumi.getter
    def serial(self) -> pulumi.Output[_builtins.str]:
        """
        serial path parameter.
        """
        return pulumi.get(self, "serial")

