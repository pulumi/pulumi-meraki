// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class BaseManagementDetail
    {
        /// <summary>
        /// Name of management data
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Value of management data
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private BaseManagementDetail(
            string? name,

            string? value)
        {
            Name = name;
            Value = value;
        }
    }
}