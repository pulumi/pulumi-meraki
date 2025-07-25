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

__all__ = ['BrandingPoliciesPrioritiesArgs', 'BrandingPoliciesPriorities']

@pulumi.input_type
class BrandingPoliciesPrioritiesArgs:
    def __init__(__self__, *,
                 organization_id: pulumi.Input[_builtins.str],
                 branding_policy_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a BrandingPoliciesPriorities resource.
        :param pulumi.Input[_builtins.str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] branding_policy_ids: An ordered list of branding policy IDs that determines the priority order of how to apply the policies
        """
        pulumi.set(__self__, "organization_id", organization_id)
        if branding_policy_ids is not None:
            pulumi.set(__self__, "branding_policy_ids", branding_policy_ids)

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[_builtins.str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "organization_id", value)

    @_builtins.property
    @pulumi.getter(name="brandingPolicyIds")
    def branding_policy_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        An ordered list of branding policy IDs that determines the priority order of how to apply the policies
        """
        return pulumi.get(self, "branding_policy_ids")

    @branding_policy_ids.setter
    def branding_policy_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "branding_policy_ids", value)


@pulumi.input_type
class _BrandingPoliciesPrioritiesState:
    def __init__(__self__, *,
                 branding_policy_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 organization_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering BrandingPoliciesPriorities resources.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] branding_policy_ids: An ordered list of branding policy IDs that determines the priority order of how to apply the policies
        :param pulumi.Input[_builtins.str] organization_id: organizationId path parameter. Organization ID
        """
        if branding_policy_ids is not None:
            pulumi.set(__self__, "branding_policy_ids", branding_policy_ids)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)

    @_builtins.property
    @pulumi.getter(name="brandingPolicyIds")
    def branding_policy_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        An ordered list of branding policy IDs that determines the priority order of how to apply the policies
        """
        return pulumi.get(self, "branding_policy_ids")

    @branding_policy_ids.setter
    def branding_policy_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "branding_policy_ids", value)

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "organization_id", value)


@pulumi.type_token("meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities")
class BrandingPoliciesPriorities(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 branding_policy_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.BrandingPoliciesPriorities("example",
            branding_policy_ids=[
                "123",
                "456",
                "789",
            ],
            organization_id="string")
        pulumi.export("merakiOrganizationsBrandingPoliciesPrioritiesExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities example "organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] branding_policy_ids: An ordered list of branding policy IDs that determines the priority order of how to apply the policies
        :param pulumi.Input[_builtins.str] organization_id: organizationId path parameter. Organization ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BrandingPoliciesPrioritiesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.BrandingPoliciesPriorities("example",
            branding_policy_ids=[
                "123",
                "456",
                "789",
            ],
            organization_id="string")
        pulumi.export("merakiOrganizationsBrandingPoliciesPrioritiesExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities example "organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param BrandingPoliciesPrioritiesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BrandingPoliciesPrioritiesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 branding_policy_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BrandingPoliciesPrioritiesArgs.__new__(BrandingPoliciesPrioritiesArgs)

            __props__.__dict__["branding_policy_ids"] = branding_policy_ids
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
        super(BrandingPoliciesPriorities, __self__).__init__(
            'meraki:organizations/brandingPoliciesPriorities:BrandingPoliciesPriorities',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            branding_policy_ids: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            organization_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'BrandingPoliciesPriorities':
        """
        Get an existing BrandingPoliciesPriorities resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] branding_policy_ids: An ordered list of branding policy IDs that determines the priority order of how to apply the policies
        :param pulumi.Input[_builtins.str] organization_id: organizationId path parameter. Organization ID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BrandingPoliciesPrioritiesState.__new__(_BrandingPoliciesPrioritiesState)

        __props__.__dict__["branding_policy_ids"] = branding_policy_ids
        __props__.__dict__["organization_id"] = organization_id
        return BrandingPoliciesPriorities(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="brandingPolicyIds")
    def branding_policy_ids(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        An ordered list of branding policy IDs that determines the priority order of how to apply the policies
        """
        return pulumi.get(self, "branding_policy_ids")

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[_builtins.str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

