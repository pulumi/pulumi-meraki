# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EarlyAccessFeaturesOptInsArgs', 'EarlyAccessFeaturesOptIns']

@pulumi.input_type
class EarlyAccessFeaturesOptInsArgs:
    def __init__(__self__, *,
                 organization_id: pulumi.Input[str],
                 limit_scope_to_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 opt_in_id: Optional[pulumi.Input[str]] = None,
                 short_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EarlyAccessFeaturesOptIns resource.
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] limit_scope_to_networks: Networks assigned to the Early Access Feature
        :param pulumi.Input[str] opt_in_id: optInId path parameter. Opt in ID
        :param pulumi.Input[str] short_name: Name of Early Access Feature
        """
        pulumi.set(__self__, "organization_id", organization_id)
        if limit_scope_to_networks is not None:
            pulumi.set(__self__, "limit_scope_to_networks", limit_scope_to_networks)
        if opt_in_id is not None:
            pulumi.set(__self__, "opt_in_id", opt_in_id)
        if short_name is not None:
            pulumi.set(__self__, "short_name", short_name)

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
    @pulumi.getter(name="limitScopeToNetworks")
    def limit_scope_to_networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Networks assigned to the Early Access Feature
        """
        return pulumi.get(self, "limit_scope_to_networks")

    @limit_scope_to_networks.setter
    def limit_scope_to_networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "limit_scope_to_networks", value)

    @property
    @pulumi.getter(name="optInId")
    def opt_in_id(self) -> Optional[pulumi.Input[str]]:
        """
        optInId path parameter. Opt in ID
        """
        return pulumi.get(self, "opt_in_id")

    @opt_in_id.setter
    def opt_in_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "opt_in_id", value)

    @property
    @pulumi.getter(name="shortName")
    def short_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of Early Access Feature
        """
        return pulumi.get(self, "short_name")

    @short_name.setter
    def short_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "short_name", value)


@pulumi.input_type
class _EarlyAccessFeaturesOptInsState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 limit_scope_to_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 opt_in_id: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 short_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EarlyAccessFeaturesOptIns resources.
        :param pulumi.Input[str] created_at: Time when Early Access Feature was created
        :param pulumi.Input[Sequence[pulumi.Input[str]]] limit_scope_to_networks: Networks assigned to the Early Access Feature
        :param pulumi.Input[str] opt_in_id: optInId path parameter. Opt in ID
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[str] short_name: Name of Early Access Feature
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if limit_scope_to_networks is not None:
            pulumi.set(__self__, "limit_scope_to_networks", limit_scope_to_networks)
        if opt_in_id is not None:
            pulumi.set(__self__, "opt_in_id", opt_in_id)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if short_name is not None:
            pulumi.set(__self__, "short_name", short_name)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Time when Early Access Feature was created
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="limitScopeToNetworks")
    def limit_scope_to_networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Networks assigned to the Early Access Feature
        """
        return pulumi.get(self, "limit_scope_to_networks")

    @limit_scope_to_networks.setter
    def limit_scope_to_networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "limit_scope_to_networks", value)

    @property
    @pulumi.getter(name="optInId")
    def opt_in_id(self) -> Optional[pulumi.Input[str]]:
        """
        optInId path parameter. Opt in ID
        """
        return pulumi.get(self, "opt_in_id")

    @opt_in_id.setter
    def opt_in_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "opt_in_id", value)

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
    @pulumi.getter(name="shortName")
    def short_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of Early Access Feature
        """
        return pulumi.get(self, "short_name")

    @short_name.setter
    def short_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "short_name", value)


class EarlyAccessFeaturesOptIns(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 limit_scope_to_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 opt_in_id: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 short_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.EarlyAccessFeaturesOptIns("example",
            limit_scope_to_networks=["N_12345"],
            organization_id="string",
            short_name="has_magnetic_beta")
        pulumi.export("merakiOrganizationsEarlyAccessFeaturesOptInsExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/earlyAccessFeaturesOptIns:EarlyAccessFeaturesOptIns example "opt_in_id,organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] limit_scope_to_networks: Networks assigned to the Early Access Feature
        :param pulumi.Input[str] opt_in_id: optInId path parameter. Opt in ID
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[str] short_name: Name of Early Access Feature
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EarlyAccessFeaturesOptInsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.EarlyAccessFeaturesOptIns("example",
            limit_scope_to_networks=["N_12345"],
            organization_id="string",
            short_name="has_magnetic_beta")
        pulumi.export("merakiOrganizationsEarlyAccessFeaturesOptInsExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/earlyAccessFeaturesOptIns:EarlyAccessFeaturesOptIns example "opt_in_id,organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param EarlyAccessFeaturesOptInsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EarlyAccessFeaturesOptInsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 limit_scope_to_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 opt_in_id: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 short_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EarlyAccessFeaturesOptInsArgs.__new__(EarlyAccessFeaturesOptInsArgs)

            __props__.__dict__["limit_scope_to_networks"] = limit_scope_to_networks
            __props__.__dict__["opt_in_id"] = opt_in_id
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            __props__.__dict__["short_name"] = short_name
            __props__.__dict__["created_at"] = None
        super(EarlyAccessFeaturesOptIns, __self__).__init__(
            'meraki:organizations/earlyAccessFeaturesOptIns:EarlyAccessFeaturesOptIns',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            limit_scope_to_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            opt_in_id: Optional[pulumi.Input[str]] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            short_name: Optional[pulumi.Input[str]] = None) -> 'EarlyAccessFeaturesOptIns':
        """
        Get an existing EarlyAccessFeaturesOptIns resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: Time when Early Access Feature was created
        :param pulumi.Input[Sequence[pulumi.Input[str]]] limit_scope_to_networks: Networks assigned to the Early Access Feature
        :param pulumi.Input[str] opt_in_id: optInId path parameter. Opt in ID
        :param pulumi.Input[str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[str] short_name: Name of Early Access Feature
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EarlyAccessFeaturesOptInsState.__new__(_EarlyAccessFeaturesOptInsState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["limit_scope_to_networks"] = limit_scope_to_networks
        __props__.__dict__["opt_in_id"] = opt_in_id
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["short_name"] = short_name
        return EarlyAccessFeaturesOptIns(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Time when Early Access Feature was created
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="limitScopeToNetworks")
    def limit_scope_to_networks(self) -> pulumi.Output[Sequence[str]]:
        """
        Networks assigned to the Early Access Feature
        """
        return pulumi.get(self, "limit_scope_to_networks")

    @property
    @pulumi.getter(name="optInId")
    def opt_in_id(self) -> pulumi.Output[Optional[str]]:
        """
        optInId path parameter. Opt in ID
        """
        return pulumi.get(self, "opt_in_id")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="shortName")
    def short_name(self) -> pulumi.Output[str]:
        """
        Name of Early Access Feature
        """
        return pulumi.get(self, "short_name")
