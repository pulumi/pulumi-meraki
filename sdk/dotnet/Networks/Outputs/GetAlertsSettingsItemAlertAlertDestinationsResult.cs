// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetAlertsSettingsItemAlertAlertDestinationsResult
    {
        public readonly bool AllAdmins;
        public readonly ImmutableArray<string> Emails;
        public readonly ImmutableArray<string> HttpServerIds;
        public readonly bool Snmp;

        [OutputConstructor]
        private GetAlertsSettingsItemAlertAlertDestinationsResult(
            bool allAdmins,

            ImmutableArray<string> emails,

            ImmutableArray<string> httpServerIds,

            bool snmp)
        {
            AllAdmins = allAdmins;
            Emails = emails;
            HttpServerIds = httpServerIds;
            Snmp = snmp;
        }
    }
}