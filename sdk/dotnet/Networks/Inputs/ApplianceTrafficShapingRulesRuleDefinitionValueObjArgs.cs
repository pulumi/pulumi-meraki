// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Inputs
{

    public sealed class ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs : global::Pulumi.ResourceArgs
    {
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs()
        {
        }
        public static new ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs Empty => new ApplianceTrafficShapingRulesRuleDefinitionValueObjArgs();
    }
}
