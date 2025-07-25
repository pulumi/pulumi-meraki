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

merakiBaseUrl: Optional[str]
"""
Cisco Meraki base URL, FQDN or IP. If not set, it uses the MERAKI_BASE_URL environment variable. Default is
(https://api.meraki.com/)
"""

merakiDashboardApiKey: Optional[str]
"""
Cisco Meraki meraki_dashboard_api_key to authenticate. If not set, it uses the MERAKI_DASHBOARD_API_KEY environment
variable.
"""

merakiDebug: Optional[str]
"""
Flag for Cisco Meraki to enable debugging. If not set, it uses the MERAKI_DEBUG environment variable defaults to
`false`.
"""

merakiRequestsPerSecond: Optional[int]
"""
Flag requests per second allowed for client. Default is (10)
"""

