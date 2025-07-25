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
    'GetApiRequestsResult',
    'AwaitableGetApiRequestsResult',
    'get_api_requests',
    'get_api_requests_output',
]

@pulumi.output_type
class GetApiRequestsResult:
    """
    A collection of values returned by getApiRequests.
    """
    def __init__(__self__, admin_id=None, ending_before=None, id=None, items=None, method=None, operation_ids=None, organization_id=None, path=None, per_page=None, response_code=None, source_ip=None, starting_after=None, t0=None, t1=None, timespan=None, user_agent=None, version=None):
        if admin_id and not isinstance(admin_id, str):
            raise TypeError("Expected argument 'admin_id' to be a str")
        pulumi.set(__self__, "admin_id", admin_id)
        if ending_before and not isinstance(ending_before, str):
            raise TypeError("Expected argument 'ending_before' to be a str")
        pulumi.set(__self__, "ending_before", ending_before)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if method and not isinstance(method, str):
            raise TypeError("Expected argument 'method' to be a str")
        pulumi.set(__self__, "method", method)
        if operation_ids and not isinstance(operation_ids, list):
            raise TypeError("Expected argument 'operation_ids' to be a list")
        pulumi.set(__self__, "operation_ids", operation_ids)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)
        if per_page and not isinstance(per_page, int):
            raise TypeError("Expected argument 'per_page' to be a int")
        pulumi.set(__self__, "per_page", per_page)
        if response_code and not isinstance(response_code, int):
            raise TypeError("Expected argument 'response_code' to be a int")
        pulumi.set(__self__, "response_code", response_code)
        if source_ip and not isinstance(source_ip, str):
            raise TypeError("Expected argument 'source_ip' to be a str")
        pulumi.set(__self__, "source_ip", source_ip)
        if starting_after and not isinstance(starting_after, str):
            raise TypeError("Expected argument 'starting_after' to be a str")
        pulumi.set(__self__, "starting_after", starting_after)
        if t0 and not isinstance(t0, str):
            raise TypeError("Expected argument 't0' to be a str")
        pulumi.set(__self__, "t0", t0)
        if t1 and not isinstance(t1, str):
            raise TypeError("Expected argument 't1' to be a str")
        pulumi.set(__self__, "t1", t1)
        if timespan and not isinstance(timespan, float):
            raise TypeError("Expected argument 'timespan' to be a float")
        pulumi.set(__self__, "timespan", timespan)
        if user_agent and not isinstance(user_agent, str):
            raise TypeError("Expected argument 'user_agent' to be a str")
        pulumi.set(__self__, "user_agent", user_agent)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter(name="adminId")
    def admin_id(self) -> Optional[_builtins.str]:
        """
        adminId query parameter. Filter the results by the ID of the admin who made the API requests
        """
        return pulumi.get(self, "admin_id")

    @_builtins.property
    @pulumi.getter(name="endingBefore")
    def ending_before(self) -> Optional[_builtins.str]:
        """
        endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "ending_before")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetApiRequestsItemResult']:
        """
        Array of ResponseOrganizationsGetOrganizationApiRequests
        """
        return pulumi.get(self, "items")

    @_builtins.property
    @pulumi.getter
    def method(self) -> Optional[_builtins.str]:
        """
        method query parameter. Filter the results by the method of the API requests (must be 'GET', 'PUT', 'POST' or 'DELETE')
        """
        return pulumi.get(self, "method")

    @_builtins.property
    @pulumi.getter(name="operationIds")
    def operation_ids(self) -> Optional[Sequence[_builtins.str]]:
        """
        operationIds query parameter. Filter the results by one or more operation IDs for the API request
        """
        return pulumi.get(self, "operation_ids")

    @_builtins.property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> _builtins.str:
        """
        organizationId path parameter. Organization ID
        """
        return pulumi.get(self, "organization_id")

    @_builtins.property
    @pulumi.getter
    def path(self) -> Optional[_builtins.str]:
        """
        path query parameter. Filter the results by the path of the API requests
        """
        return pulumi.get(self, "path")

    @_builtins.property
    @pulumi.getter(name="perPage")
    def per_page(self) -> Optional[_builtins.int]:
        """
        perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
        """
        return pulumi.get(self, "per_page")

    @_builtins.property
    @pulumi.getter(name="responseCode")
    def response_code(self) -> Optional[_builtins.int]:
        """
        responseCode query parameter. Filter the results by the response code of the API requests
        """
        return pulumi.get(self, "response_code")

    @_builtins.property
    @pulumi.getter(name="sourceIp")
    def source_ip(self) -> Optional[_builtins.str]:
        """
        sourceIp query parameter. Filter the results by the IP address of the originating API request
        """
        return pulumi.get(self, "source_ip")

    @_builtins.property
    @pulumi.getter(name="startingAfter")
    def starting_after(self) -> Optional[_builtins.str]:
        """
        startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        """
        return pulumi.get(self, "starting_after")

    @_builtins.property
    @pulumi.getter
    def t0(self) -> Optional[_builtins.str]:
        """
        t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
        """
        return pulumi.get(self, "t0")

    @_builtins.property
    @pulumi.getter
    def t1(self) -> Optional[_builtins.str]:
        """
        t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
        """
        return pulumi.get(self, "t1")

    @_builtins.property
    @pulumi.getter
    def timespan(self) -> Optional[_builtins.float]:
        """
        timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days.
        """
        return pulumi.get(self, "timespan")

    @_builtins.property
    @pulumi.getter(name="userAgent")
    def user_agent(self) -> Optional[_builtins.str]:
        """
        userAgent query parameter. Filter the results by the user agent string of the API request
        """
        return pulumi.get(self, "user_agent")

    @_builtins.property
    @pulumi.getter
    def version(self) -> Optional[_builtins.int]:
        """
        version query parameter. Filter the results by the API version of the API request
        """
        return pulumi.get(self, "version")


class AwaitableGetApiRequestsResult(GetApiRequestsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApiRequestsResult(
            admin_id=self.admin_id,
            ending_before=self.ending_before,
            id=self.id,
            items=self.items,
            method=self.method,
            operation_ids=self.operation_ids,
            organization_id=self.organization_id,
            path=self.path,
            per_page=self.per_page,
            response_code=self.response_code,
            source_ip=self.source_ip,
            starting_after=self.starting_after,
            t0=self.t0,
            t1=self.t1,
            timespan=self.timespan,
            user_agent=self.user_agent,
            version=self.version)


def get_api_requests(admin_id: Optional[_builtins.str] = None,
                     ending_before: Optional[_builtins.str] = None,
                     method: Optional[_builtins.str] = None,
                     operation_ids: Optional[Sequence[_builtins.str]] = None,
                     organization_id: Optional[_builtins.str] = None,
                     path: Optional[_builtins.str] = None,
                     per_page: Optional[_builtins.int] = None,
                     response_code: Optional[_builtins.int] = None,
                     source_ip: Optional[_builtins.str] = None,
                     starting_after: Optional[_builtins.str] = None,
                     t0: Optional[_builtins.str] = None,
                     t1: Optional[_builtins.str] = None,
                     timespan: Optional[_builtins.float] = None,
                     user_agent: Optional[_builtins.str] = None,
                     version: Optional[_builtins.int] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApiRequestsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_api_requests(admin_id="string",
        ending_before="string",
        method="string",
        operation_ids=["string"],
        organization_id="string",
        path="string",
        per_page=1,
        response_code=1,
        source_ip="string",
        starting_after="string",
        t0="string",
        t1="string",
        timespan=1,
        user_agent="string",
        version=1)
    pulumi.export("merakiOrganizationsApiRequestsExample", example.items)
    ```


    :param _builtins.str admin_id: adminId query parameter. Filter the results by the ID of the admin who made the API requests
    :param _builtins.str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param _builtins.str method: method query parameter. Filter the results by the method of the API requests (must be 'GET', 'PUT', 'POST' or 'DELETE')
    :param Sequence[_builtins.str] operation_ids: operationIds query parameter. Filter the results by one or more operation IDs for the API request
    :param _builtins.str organization_id: organizationId path parameter. Organization ID
    :param _builtins.str path: path query parameter. Filter the results by the path of the API requests
    :param _builtins.int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
    :param _builtins.int response_code: responseCode query parameter. Filter the results by the response code of the API requests
    :param _builtins.str source_ip: sourceIp query parameter. Filter the results by the IP address of the originating API request
    :param _builtins.str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param _builtins.str t0: t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
    :param _builtins.str t1: t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
    :param _builtins.float timespan: timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days.
    :param _builtins.str user_agent: userAgent query parameter. Filter the results by the user agent string of the API request
    :param _builtins.int version: version query parameter. Filter the results by the API version of the API request
    """
    __args__ = dict()
    __args__['adminId'] = admin_id
    __args__['endingBefore'] = ending_before
    __args__['method'] = method
    __args__['operationIds'] = operation_ids
    __args__['organizationId'] = organization_id
    __args__['path'] = path
    __args__['perPage'] = per_page
    __args__['responseCode'] = response_code
    __args__['sourceIp'] = source_ip
    __args__['startingAfter'] = starting_after
    __args__['t0'] = t0
    __args__['t1'] = t1
    __args__['timespan'] = timespan
    __args__['userAgent'] = user_agent
    __args__['version'] = version
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('meraki:organizations/getApiRequests:getApiRequests', __args__, opts=opts, typ=GetApiRequestsResult).value

    return AwaitableGetApiRequestsResult(
        admin_id=pulumi.get(__ret__, 'admin_id'),
        ending_before=pulumi.get(__ret__, 'ending_before'),
        id=pulumi.get(__ret__, 'id'),
        items=pulumi.get(__ret__, 'items'),
        method=pulumi.get(__ret__, 'method'),
        operation_ids=pulumi.get(__ret__, 'operation_ids'),
        organization_id=pulumi.get(__ret__, 'organization_id'),
        path=pulumi.get(__ret__, 'path'),
        per_page=pulumi.get(__ret__, 'per_page'),
        response_code=pulumi.get(__ret__, 'response_code'),
        source_ip=pulumi.get(__ret__, 'source_ip'),
        starting_after=pulumi.get(__ret__, 'starting_after'),
        t0=pulumi.get(__ret__, 't0'),
        t1=pulumi.get(__ret__, 't1'),
        timespan=pulumi.get(__ret__, 'timespan'),
        user_agent=pulumi.get(__ret__, 'user_agent'),
        version=pulumi.get(__ret__, 'version'))
def get_api_requests_output(admin_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            ending_before: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            method: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            operation_ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                            organization_id: Optional[pulumi.Input[_builtins.str]] = None,
                            path: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            per_page: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                            response_code: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                            source_ip: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            starting_after: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            t0: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            t1: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            timespan: Optional[pulumi.Input[Optional[_builtins.float]]] = None,
                            user_agent: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            version: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetApiRequestsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_meraki as meraki

    example = meraki.organizations.get_api_requests(admin_id="string",
        ending_before="string",
        method="string",
        operation_ids=["string"],
        organization_id="string",
        path="string",
        per_page=1,
        response_code=1,
        source_ip="string",
        starting_after="string",
        t0="string",
        t1="string",
        timespan=1,
        user_agent="string",
        version=1)
    pulumi.export("merakiOrganizationsApiRequestsExample", example.items)
    ```


    :param _builtins.str admin_id: adminId query parameter. Filter the results by the ID of the admin who made the API requests
    :param _builtins.str ending_before: endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param _builtins.str method: method query parameter. Filter the results by the method of the API requests (must be 'GET', 'PUT', 'POST' or 'DELETE')
    :param Sequence[_builtins.str] operation_ids: operationIds query parameter. Filter the results by one or more operation IDs for the API request
    :param _builtins.str organization_id: organizationId path parameter. Organization ID
    :param _builtins.str path: path query parameter. Filter the results by the path of the API requests
    :param _builtins.int per_page: perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
    :param _builtins.int response_code: responseCode query parameter. Filter the results by the response code of the API requests
    :param _builtins.str source_ip: sourceIp query parameter. Filter the results by the IP address of the originating API request
    :param _builtins.str starting_after: startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
    :param _builtins.str t0: t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
    :param _builtins.str t1: t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
    :param _builtins.float timespan: timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days.
    :param _builtins.str user_agent: userAgent query parameter. Filter the results by the user agent string of the API request
    :param _builtins.int version: version query parameter. Filter the results by the API version of the API request
    """
    __args__ = dict()
    __args__['adminId'] = admin_id
    __args__['endingBefore'] = ending_before
    __args__['method'] = method
    __args__['operationIds'] = operation_ids
    __args__['organizationId'] = organization_id
    __args__['path'] = path
    __args__['perPage'] = per_page
    __args__['responseCode'] = response_code
    __args__['sourceIp'] = source_ip
    __args__['startingAfter'] = starting_after
    __args__['t0'] = t0
    __args__['t1'] = t1
    __args__['timespan'] = timespan
    __args__['userAgent'] = user_agent
    __args__['version'] = version
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('meraki:organizations/getApiRequests:getApiRequests', __args__, opts=opts, typ=GetApiRequestsResult)
    return __ret__.apply(lambda __response__: GetApiRequestsResult(
        admin_id=pulumi.get(__response__, 'admin_id'),
        ending_before=pulumi.get(__response__, 'ending_before'),
        id=pulumi.get(__response__, 'id'),
        items=pulumi.get(__response__, 'items'),
        method=pulumi.get(__response__, 'method'),
        operation_ids=pulumi.get(__response__, 'operation_ids'),
        organization_id=pulumi.get(__response__, 'organization_id'),
        path=pulumi.get(__response__, 'path'),
        per_page=pulumi.get(__response__, 'per_page'),
        response_code=pulumi.get(__response__, 'response_code'),
        source_ip=pulumi.get(__response__, 'source_ip'),
        starting_after=pulumi.get(__response__, 'starting_after'),
        t0=pulumi.get(__response__, 't0'),
        t1=pulumi.get(__response__, 't1'),
        timespan=pulumi.get(__response__, 'timespan'),
        user_agent=pulumi.get(__response__, 'user_agent'),
        version=pulumi.get(__response__, 'version')))
