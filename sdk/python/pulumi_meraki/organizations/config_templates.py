# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ConfigTemplatesArgs', 'ConfigTemplates']

@pulumi.input_type
class ConfigTemplatesArgs:
    def __init__(__self__, *,
                 organization_id: pulumi.Input[str],
                 config_template_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ConfigTemplates resource.
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[str] config_template_id: configTemplateId path parameter. Config template ID
        :param pulumi.Input[str] name: The name of the configuration template
        :param pulumi.Input[str] time_zone: The timezone of the configuration template. For a list of allowed timezones, please see the 'TZ' column in the table in \\n\\nthis article\\n\\n. Not applicable if copying from existing network or template
        """
        pulumi.set(__self__, "organization_id", organization_id)
        if config_template_id is not None:
            pulumi.set(__self__, "config_template_id", config_template_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if time_zone is not None:
            pulumi.set(__self__, "time_zone", time_zone)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="configTemplateId")
    def config_template_id(self) -> Optional[pulumi.Input[str]]:
        """
        configTemplateId path parameter. Config template ID
        """
        return pulumi.get(self, "config_template_id")

    @config_template_id.setter
    def config_template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_template_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the configuration template
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The timezone of the configuration template. For a list of allowed timezones, please see the 'TZ' column in the table in \\n\\nthis article\\n\\n. Not applicable if copying from existing network or template
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "time_zone", value)


@pulumi.input_type
class _ConfigTemplatesState:
    def __init__(__self__, *,
                 config_template_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 product_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ConfigTemplates resources.
        :param pulumi.Input[str] config_template_id: configTemplateId path parameter. Config template ID
        :param pulumi.Input[str] name: The name of the configuration template
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] product_types: The product types of the configuration template
        :param pulumi.Input[str] time_zone: The timezone of the configuration template. For a list of allowed timezones, please see the 'TZ' column in the table in \\n\\nthis article\\n\\n. Not applicable if copying from existing network or template
        """
        if config_template_id is not None:
            pulumi.set(__self__, "config_template_id", config_template_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if product_types is not None:
            pulumi.set(__self__, "product_types", product_types)
        if time_zone is not None:
            pulumi.set(__self__, "time_zone", time_zone)

    @property
    @pulumi.getter(name="configTemplateId")
    def config_template_id(self) -> Optional[pulumi.Input[str]]:
        """
        configTemplateId path parameter. Config template ID
        """
        return pulumi.get(self, "config_template_id")

    @config_template_id.setter
    def config_template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_template_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the configuration template
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="productTypes")
    def product_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The product types of the configuration template
        """
        return pulumi.get(self, "product_types")

    @product_types.setter
    def product_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "product_types", value)

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The timezone of the configuration template. For a list of allowed timezones, please see the 'TZ' column in the table in \\n\\nthis article\\n\\n. Not applicable if copying from existing network or template
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "time_zone", value)


class ConfigTemplates(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_template_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.ConfigTemplates("example",
            name="My config template",
            organization_id="string",
            time_zone="America/Los_Angeles")
        pulumi.export("merakiOrganizationsConfigTemplatesExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/configTemplates:ConfigTemplates example "config_template_id,organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config_template_id: configTemplateId path parameter. Config template ID
        :param pulumi.Input[str] name: The name of the configuration template
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[str] time_zone: The timezone of the configuration template. For a list of allowed timezones, please see the 'TZ' column in the table in \\n\\nthis article\\n\\n. Not applicable if copying from existing network or template
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConfigTemplatesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.ConfigTemplates("example",
            name="My config template",
            organization_id="string",
            time_zone="America/Los_Angeles")
        pulumi.export("merakiOrganizationsConfigTemplatesExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/configTemplates:ConfigTemplates example "config_template_id,organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param ConfigTemplatesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConfigTemplatesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_template_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConfigTemplatesArgs.__new__(ConfigTemplatesArgs)

            __props__.__dict__["config_template_id"] = config_template_id
            __props__.__dict__["name"] = name
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            __props__.__dict__["time_zone"] = time_zone
            __props__.__dict__["product_types"] = None
        super(ConfigTemplates, __self__).__init__(
            'meraki:organizations/configTemplates:ConfigTemplates',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_template_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            product_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            time_zone: Optional[pulumi.Input[str]] = None) -> 'ConfigTemplates':
        """
        Get an existing ConfigTemplates resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config_template_id: configTemplateId path parameter. Config template ID
        :param pulumi.Input[str] name: The name of the configuration template
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] product_types: The product types of the configuration template
        :param pulumi.Input[str] time_zone: The timezone of the configuration template. For a list of allowed timezones, please see the 'TZ' column in the table in \\n\\nthis article\\n\\n. Not applicable if copying from existing network or template
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConfigTemplatesState.__new__(_ConfigTemplatesState)

        __props__.__dict__["config_template_id"] = config_template_id
        __props__.__dict__["name"] = name
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["product_types"] = product_types
        __props__.__dict__["time_zone"] = time_zone
        return ConfigTemplates(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configTemplateId")
    def config_template_id(self) -> pulumi.Output[Optional[str]]:
        """
        configTemplateId path parameter. Config template ID
        """
        return pulumi.get(self, "config_template_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the configuration template
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="productTypes")
    def product_types(self) -> pulumi.Output[Sequence[str]]:
        """
        The product types of the configuration template
        """
        return pulumi.get(self, "product_types")

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Output[str]:
        """
        The timezone of the configuration template. For a list of allowed timezones, please see the 'TZ' column in the table in \\n\\nthis article\\n\\n. Not applicable if copying from existing network or template
        """
        return pulumi.get(self, "time_zone")
