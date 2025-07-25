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

__all__ = [
    'GetLicensingSubscriptionSubscriptionsComplianceStatusesResult',
    'AwaitableGetLicensingSubscriptionSubscriptionsComplianceStatusesResult',
    'get_licensing_subscription_subscriptions_compliance_statuses',
    'get_licensing_subscription_subscriptions_compliance_statuses_output',
]

@pulumi.output_type
class GetLicensingSubscriptionSubscriptionsComplianceStatusesResult:
    """
    A collection of values returned by getLicensingSubscriptionSubscriptionsComplianceStatuses.
    """
    def __init__(__self__, id=None, items=None, organization_ids=None, subscription_ids=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if organization_ids and not isinstance(organization_ids, list):
            raise TypeError("Expected argument 'organization_ids' to be a list")
        pulumi.set(__self__, "organization_ids", organization_ids)
        if subscription_ids and not isinstance(subscription_ids, list):
            raise TypeError("Expected argument 'subscription_ids' to be a list")
        pulumi.set(__self__, "subscription_ids", subscription_ids)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetLicensingSubscriptionSubscriptionsComplianceStatusesItemResult']:
        """
        Array of ResponseLicensingGetAdministeredLicensingSubscriptionSubscriptionsComplianceStatuses
        """
        return pulumi.get(self, "items")

    @_builtins.property
    @pulumi.getter(name="organizationIds")
    def organization_ids(self) -> Optional[Sequence[_builtins.str]]:
        """
        organizationIds query parameter. Organizations to get subscription compliance information for
        """
        return pulumi.get(self, "organization_ids")

    @_builtins.property
    @pulumi.getter(name="subscriptionIds")
    def subscription_ids(self) -> Optional[Sequence[_builtins.str]]:
        """
        subscriptionIds query parameter. Subscription ids
        """
        return pulumi.get(self, "subscription_ids")


class AwaitableGetLicensingSubscriptionSubscriptionsComplianceStatusesResult(GetLicensingSubscriptionSubscriptionsComplianceStatusesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLicensingSubscriptionSubscriptionsComplianceStatusesResult(
            id=self.id,
            items=self.items,
            organization_ids=self.organization_ids,
            subscription_ids=self.subscription_ids)


def get_licensing_subscription_subscriptions_compliance_statuses(organization_ids: Optional[Sequence[_builtins.str]] = None,
                                                                 subscription_ids: Optional[Sequence[_builtins.str]] = None,
                                                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLicensingSubscriptionSubscriptionsComplianceStatusesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.administered.get_licensing_subscription_subscriptions_compliance_statuses(organization_ids=["string"],
        subscription_ids=["string"])
    pulumi.export("merakiAdministeredLicensingSubscriptionSubscriptionsComplianceStatusesExample", example.items)
    ```


    :param Sequence[_builtins.str] organization_ids: organizationIds query parameter. Organizations to get subscription compliance information for
    :param Sequence[_builtins.str] subscription_ids: subscriptionIds query parameter. Subscription ids
    """
    __args__ = dict()
    __args__['organizationIds'] = organization_ids
    __args__['subscriptionIds'] = subscription_ids
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:administered/getLicensingSubscriptionSubscriptionsComplianceStatuses:getLicensingSubscriptionSubscriptionsComplianceStatuses', __args__, opts=opts, typ=GetLicensingSubscriptionSubscriptionsComplianceStatusesResult).value

    return AwaitableGetLicensingSubscriptionSubscriptionsComplianceStatusesResult(
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        organization_ids=pulumi.get(__ret__, 'organization_ids'),
        subscription_ids=pulumi.get(__ret__, 'subscription_ids'))
def get_licensing_subscription_subscriptions_compliance_statuses_output(organization_ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                                                        subscription_ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetLicensingSubscriptionSubscriptionsComplianceStatusesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.administered.get_licensing_subscription_subscriptions_compliance_statuses(organization_ids=["string"],
        subscription_ids=["string"])
    pulumi.export("merakiAdministeredLicensingSubscriptionSubscriptionsComplianceStatusesExample", example.items)
    ```


    :param Sequence[_builtins.str] organization_ids: organizationIds query parameter. Organizations to get subscription compliance information for
    :param Sequence[_builtins.str] subscription_ids: subscriptionIds query parameter. Subscription ids
    """
    __args__ = dict()
    __args__['organizationIds'] = organization_ids
    __args__['subscriptionIds'] = subscription_ids
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:administered/getLicensingSubscriptionSubscriptionsComplianceStatuses:getLicensingSubscriptionSubscriptionsComplianceStatuses', __args__, opts=opts, typ=GetLicensingSubscriptionSubscriptionsComplianceStatusesResult)
    return __ret__.apply(lambda __response__: GetLicensingSubscriptionSubscriptionsComplianceStatusesResult(
        id=pulumi.get(__response__, 'id'),
        items=pulumi.get(__response__, 'items'),
        organization_ids=pulumi.get(__response__, 'organization_ids'),
        subscription_ids=pulumi.get(__response__, 'subscription_ids')))
