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

__all__ = ['AdaptivePolicyPoliciesArgs', 'AdaptivePolicyPolicies']

@pulumi.input_type
class AdaptivePolicyPoliciesArgs:
    def __init__(__self__, *,
                 organization_id: pulumi.Input[_builtins.str],
                 acls: Optional[pulumi.Input[Sequence[pulumi.Input['AdaptivePolicyPoliciesAclArgs']]]] = None,
                 destination_group: Optional[pulumi.Input['AdaptivePolicyPoliciesDestinationGroupArgs']] = None,
                 last_entry_rule: Optional[pulumi.Input[_builtins.str]] = None,
                 source_group: Optional[pulumi.Input['AdaptivePolicyPoliciesSourceGroupArgs']] = None):
        """
        The set of arguments for constructing a AdaptivePolicyPolicies resource.
        :param pulumi.Input[_builtins.str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Sequence[pulumi.Input['AdaptivePolicyPoliciesAclArgs']]] acls: An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
        :param pulumi.Input['AdaptivePolicyPoliciesDestinationGroupArgs'] destination_group: The destination adaptive policy group (requires one unique attribute)
        :param pulumi.Input[_builtins.str] last_entry_rule: The rule to apply if there is no matching ACL (default: "default")
        :param pulumi.Input['AdaptivePolicyPoliciesSourceGroupArgs'] source_group: The source adaptive policy group (requires one unique attribute)
        """
        pulumi.set(__self__, "organization_id", organization_id)
        if acls is not None:
            pulumi.set(__self__, "acls", acls)
        if destination_group is not None:
            pulumi.set(__self__, "destination_group", destination_group)
        if last_entry_rule is not None:
            pulumi.set(__self__, "last_entry_rule", last_entry_rule)
        if source_group is not None:
            pulumi.set(__self__, "source_group", source_group)

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
    @pulumi.getter
    def acls(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AdaptivePolicyPoliciesAclArgs']]]]:
        """
        An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
        """
        return pulumi.get(self, "acls")

    @acls.setter
    def acls(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AdaptivePolicyPoliciesAclArgs']]]]):
        pulumi.set(self, "acls", value)

    @_builtins.property
    @pulumi.getter(name="destinationGroup")
    def destination_group(self) -> Optional[pulumi.Input['AdaptivePolicyPoliciesDestinationGroupArgs']]:
        """
        The destination adaptive policy group (requires one unique attribute)
        """
        return pulumi.get(self, "destination_group")

    @destination_group.setter
    def destination_group(self, value: Optional[pulumi.Input['AdaptivePolicyPoliciesDestinationGroupArgs']]):
        pulumi.set(self, "destination_group", value)

    @_builtins.property
    @pulumi.getter(name="lastEntryRule")
    def last_entry_rule(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The rule to apply if there is no matching ACL (default: "default")
        """
        return pulumi.get(self, "last_entry_rule")

    @last_entry_rule.setter
    def last_entry_rule(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "last_entry_rule", value)

    @_builtins.property
    @pulumi.getter(name="sourceGroup")
    def source_group(self) -> Optional[pulumi.Input['AdaptivePolicyPoliciesSourceGroupArgs']]:
        """
        The source adaptive policy group (requires one unique attribute)
        """
        return pulumi.get(self, "source_group")

    @source_group.setter
    def source_group(self, value: Optional[pulumi.Input['AdaptivePolicyPoliciesSourceGroupArgs']]):
        pulumi.set(self, "source_group", value)


@pulumi.input_type
class _AdaptivePolicyPoliciesState:
    def __init__(__self__, *,
                 acls: Optional[pulumi.Input[Sequence[pulumi.Input['AdaptivePolicyPoliciesAclArgs']]]] = None,
                 adaptive_policy_id: Optional[pulumi.Input[_builtins.str]] = None,
                 created_at: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_group: Optional[pulumi.Input['AdaptivePolicyPoliciesDestinationGroupArgs']] = None,
                 last_entry_rule: Optional[pulumi.Input[_builtins.str]] = None,
                 organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                 source_group: Optional[pulumi.Input['AdaptivePolicyPoliciesSourceGroupArgs']] = None,
                 updated_at: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AdaptivePolicyPolicies resources.
        :param pulumi.Input[Sequence[pulumi.Input['AdaptivePolicyPoliciesAclArgs']]] acls: An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
        :param pulumi.Input['AdaptivePolicyPoliciesDestinationGroupArgs'] destination_group: The destination adaptive policy group (requires one unique attribute)
        :param pulumi.Input[_builtins.str] last_entry_rule: The rule to apply if there is no matching ACL (default: "default")
        :param pulumi.Input[_builtins.str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input['AdaptivePolicyPoliciesSourceGroupArgs'] source_group: The source adaptive policy group (requires one unique attribute)
        """
        if acls is not None:
            pulumi.set(__self__, "acls", acls)
        if adaptive_policy_id is not None:
            pulumi.set(__self__, "adaptive_policy_id", adaptive_policy_id)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if destination_group is not None:
            pulumi.set(__self__, "destination_group", destination_group)
        if last_entry_rule is not None:
            pulumi.set(__self__, "last_entry_rule", last_entry_rule)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if source_group is not None:
            pulumi.set(__self__, "source_group", source_group)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @_builtins.property
    @pulumi.getter
    def acls(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AdaptivePolicyPoliciesAclArgs']]]]:
        """
        An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
        """
        return pulumi.get(self, "acls")

    @acls.setter
    def acls(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AdaptivePolicyPoliciesAclArgs']]]]):
        pulumi.set(self, "acls", value)

    @_builtins.property
    @pulumi.getter(name="adaptivePolicyId")
    def adaptive_policy_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "adaptive_policy_id")

    @adaptive_policy_id.setter
    def adaptive_policy_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "adaptive_policy_id", value)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_at", value)

    @_builtins.property
    @pulumi.getter(name="destinationGroup")
    def destination_group(self) -> Optional[pulumi.Input['AdaptivePolicyPoliciesDestinationGroupArgs']]:
        """
        The destination adaptive policy group (requires one unique attribute)
        """
        return pulumi.get(self, "destination_group")

    @destination_group.setter
    def destination_group(self, value: Optional[pulumi.Input['AdaptivePolicyPoliciesDestinationGroupArgs']]):
        pulumi.set(self, "destination_group", value)

    @_builtins.property
    @pulumi.getter(name="lastEntryRule")
    def last_entry_rule(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The rule to apply if there is no matching ACL (default: "default")
        """
        return pulumi.get(self, "last_entry_rule")

    @last_entry_rule.setter
    def last_entry_rule(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "last_entry_rule", value)

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

    @_builtins.property
    @pulumi.getter(name="sourceGroup")
    def source_group(self) -> Optional[pulumi.Input['AdaptivePolicyPoliciesSourceGroupArgs']]:
        """
        The source adaptive policy group (requires one unique attribute)
        """
        return pulumi.get(self, "source_group")

    @source_group.setter
    def source_group(self, value: Optional[pulumi.Input['AdaptivePolicyPoliciesSourceGroupArgs']]):
        pulumi.set(self, "source_group", value)

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "updated_at", value)


@pulumi.type_token("meraki:organizations/adaptivePolicyPolicies:AdaptivePolicyPolicies")
class AdaptivePolicyPolicies(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acls: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AdaptivePolicyPoliciesAclArgs', 'AdaptivePolicyPoliciesAclArgsDict']]]]] = None,
                 destination_group: Optional[pulumi.Input[Union['AdaptivePolicyPoliciesDestinationGroupArgs', 'AdaptivePolicyPoliciesDestinationGroupArgsDict']]] = None,
                 last_entry_rule: Optional[pulumi.Input[_builtins.str]] = None,
                 organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                 source_group: Optional[pulumi.Input[Union['AdaptivePolicyPoliciesSourceGroupArgs', 'AdaptivePolicyPoliciesSourceGroupArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.AdaptivePolicyPolicies("example",
            acls=[{
                "id": "444",
                "name": "Block web",
            }],
            destination_group={
                "id": "333",
                "name": "IoT Servers",
                "sgt": 51,
            },
            last_entry_rule="allow",
            organization_id="string",
            source_group={
                "id": "222",
                "name": "IoT Devices",
                "sgt": 50,
            })
        pulumi.export("merakiOrganizationsAdaptivePolicyPoliciesExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/adaptivePolicyPolicies:AdaptivePolicyPolicies example "id,organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AdaptivePolicyPoliciesAclArgs', 'AdaptivePolicyPoliciesAclArgsDict']]]] acls: An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
        :param pulumi.Input[Union['AdaptivePolicyPoliciesDestinationGroupArgs', 'AdaptivePolicyPoliciesDestinationGroupArgsDict']] destination_group: The destination adaptive policy group (requires one unique attribute)
        :param pulumi.Input[_builtins.str] last_entry_rule: The rule to apply if there is no matching ACL (default: "default")
        :param pulumi.Input[_builtins.str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Union['AdaptivePolicyPoliciesSourceGroupArgs', 'AdaptivePolicyPoliciesSourceGroupArgsDict']] source_group: The source adaptive policy group (requires one unique attribute)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AdaptivePolicyPoliciesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_meraki as meraki

        example = meraki.organizations.AdaptivePolicyPolicies("example",
            acls=[{
                "id": "444",
                "name": "Block web",
            }],
            destination_group={
                "id": "333",
                "name": "IoT Servers",
                "sgt": 51,
            },
            last_entry_rule="allow",
            organization_id="string",
            source_group={
                "id": "222",
                "name": "IoT Devices",
                "sgt": 50,
            })
        pulumi.export("merakiOrganizationsAdaptivePolicyPoliciesExample", example)
        ```

        ## Import

        ```sh
        $ pulumi import meraki:organizations/adaptivePolicyPolicies:AdaptivePolicyPolicies example "id,organization_id"
        ```

        :param str resource_name: The name of the resource.
        :param AdaptivePolicyPoliciesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AdaptivePolicyPoliciesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acls: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AdaptivePolicyPoliciesAclArgs', 'AdaptivePolicyPoliciesAclArgsDict']]]]] = None,
                 destination_group: Optional[pulumi.Input[Union['AdaptivePolicyPoliciesDestinationGroupArgs', 'AdaptivePolicyPoliciesDestinationGroupArgsDict']]] = None,
                 last_entry_rule: Optional[pulumi.Input[_builtins.str]] = None,
                 organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                 source_group: Optional[pulumi.Input[Union['AdaptivePolicyPoliciesSourceGroupArgs', 'AdaptivePolicyPoliciesSourceGroupArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AdaptivePolicyPoliciesArgs.__new__(AdaptivePolicyPoliciesArgs)

            __props__.__dict__["acls"] = acls
            __props__.__dict__["destination_group"] = destination_group
            __props__.__dict__["last_entry_rule"] = last_entry_rule
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            __props__.__dict__["source_group"] = source_group
            __props__.__dict__["adaptive_policy_id"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["updated_at"] = None
        super(AdaptivePolicyPolicies, __self__).__init__(
            'meraki:organizations/adaptivePolicyPolicies:AdaptivePolicyPolicies',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            acls: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AdaptivePolicyPoliciesAclArgs', 'AdaptivePolicyPoliciesAclArgsDict']]]]] = None,
            adaptive_policy_id: Optional[pulumi.Input[_builtins.str]] = None,
            created_at: Optional[pulumi.Input[_builtins.str]] = None,
            destination_group: Optional[pulumi.Input[Union['AdaptivePolicyPoliciesDestinationGroupArgs', 'AdaptivePolicyPoliciesDestinationGroupArgsDict']]] = None,
            last_entry_rule: Optional[pulumi.Input[_builtins.str]] = None,
            organization_id: Optional[pulumi.Input[_builtins.str]] = None,
            source_group: Optional[pulumi.Input[Union['AdaptivePolicyPoliciesSourceGroupArgs', 'AdaptivePolicyPoliciesSourceGroupArgsDict']]] = None,
            updated_at: Optional[pulumi.Input[_builtins.str]] = None) -> 'AdaptivePolicyPolicies':
        """
        Get an existing AdaptivePolicyPolicies resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AdaptivePolicyPoliciesAclArgs', 'AdaptivePolicyPoliciesAclArgsDict']]]] acls: An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
        :param pulumi.Input[Union['AdaptivePolicyPoliciesDestinationGroupArgs', 'AdaptivePolicyPoliciesDestinationGroupArgsDict']] destination_group: The destination adaptive policy group (requires one unique attribute)
        :param pulumi.Input[_builtins.str] last_entry_rule: The rule to apply if there is no matching ACL (default: "default")
        :param pulumi.Input[_builtins.str] organization_id: organizationId path parameter. Organization ID
        :param pulumi.Input[Union['AdaptivePolicyPoliciesSourceGroupArgs', 'AdaptivePolicyPoliciesSourceGroupArgsDict']] source_group: The source adaptive policy group (requires one unique attribute)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AdaptivePolicyPoliciesState.__new__(_AdaptivePolicyPoliciesState)

        __props__.__dict__["acls"] = acls
        __props__.__dict__["adaptive_policy_id"] = adaptive_policy_id
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["destination_group"] = destination_group
        __props__.__dict__["last_entry_rule"] = last_entry_rule
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["source_group"] = source_group
        __props__.__dict__["updated_at"] = updated_at
        return AdaptivePolicyPolicies(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def acls(self) -> pulumi.Output[Sequence['outputs.AdaptivePolicyPoliciesAcl']]:
        """
        An ordered array of adaptive policy ACLs (each requires one unique attribute) that apply to this policy (default: [])
        """
        return pulumi.get(self, "acls")

    @_builtins.property
    @pulumi.getter(name="adaptivePolicyId")
    def adaptive_policy_id(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "adaptive_policy_id")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter(name="destinationGroup")
    def destination_group(self) -> pulumi.Output['outputs.AdaptivePolicyPoliciesDestinationGroup']:
        """
        The destination adaptive policy group (requires one unique attribute)
        """
        return pulumi.get(self, "destination_group")

    @_builtins.property
    @pulumi.getter(name="lastEntryRule")
    def last_entry_rule(self) -> pulumi.Output[_builtins.str]:
        """
        The rule to apply if there is no matching ACL (default: "default")
        """
        return pulumi.get(self, "last_entry_rule")

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[_builtins.str]:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @_builtins.property
    @pulumi.getter(name="sourceGroup")
    def source_group(self) -> pulumi.Output['outputs.AdaptivePolicyPoliciesSourceGroup']:
        """
        The source adaptive policy group (requires one unique attribute)
        """
        return pulumi.get(self, "source_group")

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "updated_at")

