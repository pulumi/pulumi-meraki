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

__all__ = ['WebhooksPayloadTemplatesArgs', 'WebhooksPayloadTemplates']

@pulumi.input_type
class WebhooksPayloadTemplatesArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[str],
                 body: Optional[pulumi.Input[str]] = None,
                 body_file: Optional[pulumi.Input[str]] = None,
                 headers: Optional[pulumi.Input[Sequence[pulumi.Input['WebhooksPayloadTemplatesHeaderArgs']]]] = None,
                 headers_file: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 payload_template_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a WebhooksPayloadTemplates resource.
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] body: The body of the payload template, in liquid template
        :param pulumi.Input[str] body_file: A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
        :param pulumi.Input[Sequence[pulumi.Input['WebhooksPayloadTemplatesHeaderArgs']]] headers: The payload template headers, will be rendered as a key-value pair in the webhook.
        :param pulumi.Input[str] headers_file: A file containing the liquid template used with the webhook headers.
        :param pulumi.Input[str] name: The name of the payload template
        :param pulumi.Input[str] payload_template_id: Webhook payload template Id
        """
        pulumi.set(__self__, "network_id", network_id)
        if body is not None:
            pulumi.set(__self__, "body", body)
        if body_file is not None:
            pulumi.set(__self__, "body_file", body_file)
        if headers is not None:
            pulumi.set(__self__, "headers", headers)
        if headers_file is not None:
            pulumi.set(__self__, "headers_file", headers_file)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if payload_template_id is not None:
            pulumi.set(__self__, "payload_template_id", payload_template_id)

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
    def body(self) -> Optional[pulumi.Input[str]]:
        """
        The body of the payload template, in liquid template
        """
        return pulumi.get(self, "body")

    @body.setter
    def body(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "body", value)

    @property
    @pulumi.getter(name="bodyFile")
    def body_file(self) -> Optional[pulumi.Input[str]]:
        """
        A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
        """
        return pulumi.get(self, "body_file")

    @body_file.setter
    def body_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "body_file", value)

    @property
    @pulumi.getter
    def headers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WebhooksPayloadTemplatesHeaderArgs']]]]:
        """
        The payload template headers, will be rendered as a key-value pair in the webhook.
        """
        return pulumi.get(self, "headers")

    @headers.setter
    def headers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WebhooksPayloadTemplatesHeaderArgs']]]]):
        pulumi.set(self, "headers", value)

    @property
    @pulumi.getter(name="headersFile")
    def headers_file(self) -> Optional[pulumi.Input[str]]:
        """
        A file containing the liquid template used with the webhook headers.
        """
        return pulumi.get(self, "headers_file")

    @headers_file.setter
    def headers_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "headers_file", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the payload template
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="payloadTemplateId")
    def payload_template_id(self) -> Optional[pulumi.Input[str]]:
        """
        Webhook payload template Id
        """
        return pulumi.get(self, "payload_template_id")

    @payload_template_id.setter
    def payload_template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "payload_template_id", value)


@pulumi.input_type
class _WebhooksPayloadTemplatesState:
    def __init__(__self__, *,
                 body: Optional[pulumi.Input[str]] = None,
                 body_file: Optional[pulumi.Input[str]] = None,
                 headers: Optional[pulumi.Input[Sequence[pulumi.Input['WebhooksPayloadTemplatesHeaderArgs']]]] = None,
                 headers_file: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 payload_template_id: Optional[pulumi.Input[str]] = None,
                 sharing: Optional[pulumi.Input['WebhooksPayloadTemplatesSharingArgs']] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WebhooksPayloadTemplates resources.
        :param pulumi.Input[str] body: The body of the payload template, in liquid template
        :param pulumi.Input[str] body_file: A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
        :param pulumi.Input[Sequence[pulumi.Input['WebhooksPayloadTemplatesHeaderArgs']]] headers: The payload template headers, will be rendered as a key-value pair in the webhook.
        :param pulumi.Input[str] headers_file: A file containing the liquid template used with the webhook headers.
        :param pulumi.Input[str] name: The name of the payload template
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] payload_template_id: Webhook payload template Id
        :param pulumi.Input['WebhooksPayloadTemplatesSharingArgs'] sharing: Information on which entities have access to the template
        :param pulumi.Input[str] type: The type of the payload template
        """
        if body is not None:
            pulumi.set(__self__, "body", body)
        if body_file is not None:
            pulumi.set(__self__, "body_file", body_file)
        if headers is not None:
            pulumi.set(__self__, "headers", headers)
        if headers_file is not None:
            pulumi.set(__self__, "headers_file", headers_file)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if payload_template_id is not None:
            pulumi.set(__self__, "payload_template_id", payload_template_id)
        if sharing is not None:
            pulumi.set(__self__, "sharing", sharing)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def body(self) -> Optional[pulumi.Input[str]]:
        """
        The body of the payload template, in liquid template
        """
        return pulumi.get(self, "body")

    @body.setter
    def body(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "body", value)

    @property
    @pulumi.getter(name="bodyFile")
    def body_file(self) -> Optional[pulumi.Input[str]]:
        """
        A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
        """
        return pulumi.get(self, "body_file")

    @body_file.setter
    def body_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "body_file", value)

    @property
    @pulumi.getter
    def headers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WebhooksPayloadTemplatesHeaderArgs']]]]:
        """
        The payload template headers, will be rendered as a key-value pair in the webhook.
        """
        return pulumi.get(self, "headers")

    @headers.setter
    def headers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WebhooksPayloadTemplatesHeaderArgs']]]]):
        pulumi.set(self, "headers", value)

    @property
    @pulumi.getter(name="headersFile")
    def headers_file(self) -> Optional[pulumi.Input[str]]:
        """
        A file containing the liquid template used with the webhook headers.
        """
        return pulumi.get(self, "headers_file")

    @headers_file.setter
    def headers_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "headers_file", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the payload template
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

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
    @pulumi.getter(name="payloadTemplateId")
    def payload_template_id(self) -> Optional[pulumi.Input[str]]:
        """
        Webhook payload template Id
        """
        return pulumi.get(self, "payload_template_id")

    @payload_template_id.setter
    def payload_template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "payload_template_id", value)

    @property
    @pulumi.getter
    def sharing(self) -> Optional[pulumi.Input['WebhooksPayloadTemplatesSharingArgs']]:
        """
        Information on which entities have access to the template
        """
        return pulumi.get(self, "sharing")

    @sharing.setter
    def sharing(self, value: Optional[pulumi.Input['WebhooksPayloadTemplatesSharingArgs']]):
        pulumi.set(self, "sharing", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the payload template
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class WebhooksPayloadTemplates(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 body: Optional[pulumi.Input[str]] = None,
                 body_file: Optional[pulumi.Input[str]] = None,
                 headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhooksPayloadTemplatesHeaderArgs']]]]] = None,
                 headers_file: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 payload_template_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.WebhooksPayloadTemplates("example",
            body="{'event_type':'{{alertTypeId}}','client_payload':{'text':'{{alertData}}'}}",
            body_file="Qm9keSBGaWxl",
            headers=[meraki.networks.WebhooksPayloadTemplatesHeaderArgs(
                name="Authorization",
                template="Bearer {{sharedSecret}}",
            )],
            headers_file="SGVhZGVycyBGaWxl",
            name="Custom Template",
            network_id="string")
        pulumi.export("merakiNetworksWebhooksPayloadTemplatesExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/webhooksPayloadTemplates:WebhooksPayloadTemplates example "network_id,payload_template_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] body: The body of the payload template, in liquid template
        :param pulumi.Input[str] body_file: A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhooksPayloadTemplatesHeaderArgs']]]] headers: The payload template headers, will be rendered as a key-value pair in the webhook.
        :param pulumi.Input[str] headers_file: A file containing the liquid template used with the webhook headers.
        :param pulumi.Input[str] name: The name of the payload template
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] payload_template_id: Webhook payload template Id
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebhooksPayloadTemplatesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.networks.WebhooksPayloadTemplates("example",
            body="{'event_type':'{{alertTypeId}}','client_payload':{'text':'{{alertData}}'}}",
            body_file="Qm9keSBGaWxl",
            headers=[meraki.networks.WebhooksPayloadTemplatesHeaderArgs(
                name="Authorization",
                template="Bearer {{sharedSecret}}",
            )],
            headers_file="SGVhZGVycyBGaWxl",
            name="Custom Template",
            network_id="string")
        pulumi.export("merakiNetworksWebhooksPayloadTemplatesExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:networks/webhooksPayloadTemplates:WebhooksPayloadTemplates example "network_id,payload_template_id"
        ```

        :param str resource_name: The name of the resource.
        :param WebhooksPayloadTemplatesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebhooksPayloadTemplatesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 body: Optional[pulumi.Input[str]] = None,
                 body_file: Optional[pulumi.Input[str]] = None,
                 headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhooksPayloadTemplatesHeaderArgs']]]]] = None,
                 headers_file: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 payload_template_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebhooksPayloadTemplatesArgs.__new__(WebhooksPayloadTemplatesArgs)

            __props__.__dict__["body"] = body
            __props__.__dict__["body_file"] = body_file
            __props__.__dict__["headers"] = headers
            __props__.__dict__["headers_file"] = headers_file
            __props__.__dict__["name"] = name
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["payload_template_id"] = payload_template_id
            __props__.__dict__["sharing"] = None
            __props__.__dict__["type"] = None
        super(WebhooksPayloadTemplates, __self__).__init__(
            'meraki:networks/webhooksPayloadTemplates:WebhooksPayloadTemplates',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            body: Optional[pulumi.Input[str]] = None,
            body_file: Optional[pulumi.Input[str]] = None,
            headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhooksPayloadTemplatesHeaderArgs']]]]] = None,
            headers_file: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            payload_template_id: Optional[pulumi.Input[str]] = None,
            sharing: Optional[pulumi.Input[pulumi.InputType['WebhooksPayloadTemplatesSharingArgs']]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'WebhooksPayloadTemplates':
        """
        Get an existing WebhooksPayloadTemplates resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] body: The body of the payload template, in liquid template
        :param pulumi.Input[str] body_file: A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhooksPayloadTemplatesHeaderArgs']]]] headers: The payload template headers, will be rendered as a key-value pair in the webhook.
        :param pulumi.Input[str] headers_file: A file containing the liquid template used with the webhook headers.
        :param pulumi.Input[str] name: The name of the payload template
        :param pulumi.Input[str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[str] payload_template_id: Webhook payload template Id
        :param pulumi.Input[pulumi.InputType['WebhooksPayloadTemplatesSharingArgs']] sharing: Information on which entities have access to the template
        :param pulumi.Input[str] type: The type of the payload template
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebhooksPayloadTemplatesState.__new__(_WebhooksPayloadTemplatesState)

        __props__.__dict__["body"] = body
        __props__.__dict__["body_file"] = body_file
        __props__.__dict__["headers"] = headers
        __props__.__dict__["headers_file"] = headers_file
        __props__.__dict__["name"] = name
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["payload_template_id"] = payload_template_id
        __props__.__dict__["sharing"] = sharing
        __props__.__dict__["type"] = type
        return WebhooksPayloadTemplates(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def body(self) -> pulumi.Output[str]:
        """
        The body of the payload template, in liquid template
        """
        return pulumi.get(self, "body")

    @property
    @pulumi.getter(name="bodyFile")
    def body_file(self) -> pulumi.Output[str]:
        """
        A file containing liquid template used for the body of the webhook message. Either *body* or *bodyFile* must be specified.
        """
        return pulumi.get(self, "body_file")

    @property
    @pulumi.getter
    def headers(self) -> pulumi.Output[Sequence['outputs.WebhooksPayloadTemplatesHeader']]:
        """
        The payload template headers, will be rendered as a key-value pair in the webhook.
        """
        return pulumi.get(self, "headers")

    @property
    @pulumi.getter(name="headersFile")
    def headers_file(self) -> pulumi.Output[str]:
        """
        A file containing the liquid template used with the webhook headers.
        """
        return pulumi.get(self, "headers_file")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the payload template
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter(name="payloadTemplateId")
    def payload_template_id(self) -> pulumi.Output[str]:
        """
        Webhook payload template Id
        """
        return pulumi.get(self, "payload_template_id")

    @property
    @pulumi.getter
    def sharing(self) -> pulumi.Output['outputs.WebhooksPayloadTemplatesSharing']:
        """
        Information on which entities have access to the template
        """
        return pulumi.get(self, "sharing")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the payload template
        """
        return pulumi.get(self, "type")
