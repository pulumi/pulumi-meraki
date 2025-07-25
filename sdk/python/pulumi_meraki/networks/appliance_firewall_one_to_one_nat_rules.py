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

__all__ = ['ApplianceFirewallOneToOneNatRulesArgs', 'ApplianceFirewallOneToOneNatRules']

@pulumi.input_type
class ApplianceFirewallOneToOneNatRulesArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[_builtins.str],
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallOneToOneNatRulesRuleArgs']]]] = None):
        """
        The set of arguments for constructing a ApplianceFirewallOneToOneNatRules resource.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallOneToOneNatRulesRuleArgs']]] rules: An array of 1:1 nat rules
        """
        pulumi.set(__self__, "network_id", network_id)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

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
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallOneToOneNatRulesRuleArgs']]]]:
        """
        An array of 1:1 nat rules
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallOneToOneNatRulesRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.input_type
class _ApplianceFirewallOneToOneNatRulesState:
    def __init__(__self__, *,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallOneToOneNatRulesRuleArgs']]]] = None):
        """
        Input properties used for looking up and filtering ApplianceFirewallOneToOneNatRules resources.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallOneToOneNatRulesRuleArgs']]] rules: An array of 1:1 nat rules
        """
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

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

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallOneToOneNatRulesRuleArgs']]]]:
        """
        An array of 1:1 nat rules
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplianceFirewallOneToOneNatRulesRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.type_token("meraki:networks/applianceFirewallOneToOneNatRules:ApplianceFirewallOneToOneNatRules")
class ApplianceFirewallOneToOneNatRules(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplianceFirewallOneToOneNatRulesRuleArgs', 'ApplianceFirewallOneToOneNatRulesRuleArgsDict']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/applianceFirewallOneToOneNatRules:ApplianceFirewallOneToOneNatRules example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApplianceFirewallOneToOneNatRulesRuleArgs', 'ApplianceFirewallOneToOneNatRulesRuleArgsDict']]]] rules: An array of 1:1 nat rules
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplianceFirewallOneToOneNatRulesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import meraki:networks/applianceFirewallOneToOneNatRules:ApplianceFirewallOneToOneNatRules example "network_id"
        ```

        :param str resource_name: The name of the resource.
        :param ApplianceFirewallOneToOneNatRulesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplianceFirewallOneToOneNatRulesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplianceFirewallOneToOneNatRulesRuleArgs', 'ApplianceFirewallOneToOneNatRulesRuleArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplianceFirewallOneToOneNatRulesArgs.__new__(ApplianceFirewallOneToOneNatRulesArgs)

            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["rules"] = rules
        super(ApplianceFirewallOneToOneNatRules, __self__).__init__(
            'meraki:networks/applianceFirewallOneToOneNatRules:ApplianceFirewallOneToOneNatRules',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            network_id: Optional[pulumi.Input[_builtins.str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApplianceFirewallOneToOneNatRulesRuleArgs', 'ApplianceFirewallOneToOneNatRulesRuleArgsDict']]]]] = None) -> 'ApplianceFirewallOneToOneNatRules':
        """
        Get an existing ApplianceFirewallOneToOneNatRules resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] network_id: networkId path parameter. Network ID
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApplianceFirewallOneToOneNatRulesRuleArgs', 'ApplianceFirewallOneToOneNatRulesRuleArgsDict']]]] rules: An array of 1:1 nat rules
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplianceFirewallOneToOneNatRulesState.__new__(_ApplianceFirewallOneToOneNatRulesState)

        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["rules"] = rules
        return ApplianceFirewallOneToOneNatRules(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[_builtins.str]:
        """
        networkId path parameter. Network ID
        """
        return pulumi.get(self, "network_id")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.ApplianceFirewallOneToOneNatRulesRule']]:
        """
        An array of 1:1 nat rules
        """
        return pulumi.get(self, "rules")

