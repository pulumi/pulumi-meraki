// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Inputs
{

    public sealed class SmSentryPoliciesAssignmentsParametersItemPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Group Policy Id
        /// </summary>
        [Input("groupPolicyId")]
        public Input<string>? GroupPolicyId { get; set; }

        /// <summary>
        /// The Sentry Policy Id, if updating an existing Sentry Policy
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        /// <summary>
        /// The scope of the Sentry Policy
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// The Id of the Systems Manager Network
        /// </summary>
        [Input("smNetworkId")]
        public Input<string>? SmNetworkId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags for the Sentry Policy
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public SmSentryPoliciesAssignmentsParametersItemPolicyGetArgs()
        {
        }
        public static new SmSentryPoliciesAssignmentsParametersItemPolicyGetArgs Empty => new SmSentryPoliciesAssignmentsParametersItemPolicyGetArgs();
    }
}