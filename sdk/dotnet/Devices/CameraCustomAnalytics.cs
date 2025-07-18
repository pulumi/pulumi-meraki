// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Meraki = Pulumi.Meraki;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Meraki.Devices.CameraCustomAnalytics("example", new()
    ///     {
    ///         ArtifactId = "1",
    ///         Enabled = true,
    ///         Parameters = new[]
    ///         {
    ///             new Meraki.Devices.Inputs.CameraCustomAnalyticsParameterArgs
    ///             {
    ///                 Name = "detection_threshold",
    ///                 Value = 0.5,
    ///             },
    ///         },
    ///         Serial = "string",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiDevicesCameraCustomAnalyticsExample"] = example,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import meraki:devices/cameraCustomAnalytics:CameraCustomAnalytics example "serial"
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:devices/cameraCustomAnalytics:CameraCustomAnalytics")]
    public partial class CameraCustomAnalytics : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Custom analytics artifact ID
        /// </summary>
        [Output("artifactId")]
        public Output<string> ArtifactId { get; private set; } = null!;

        /// <summary>
        /// Whether custom analytics is enabled
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Parameters for the custom analytics workload
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.CameraCustomAnalyticsParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;


        /// <summary>
        /// Create a CameraCustomAnalytics resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CameraCustomAnalytics(string name, CameraCustomAnalyticsArgs args, CustomResourceOptions? options = null)
            : base("meraki:devices/cameraCustomAnalytics:CameraCustomAnalytics", name, args ?? new CameraCustomAnalyticsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CameraCustomAnalytics(string name, Input<string> id, CameraCustomAnalyticsState? state = null, CustomResourceOptions? options = null)
            : base("meraki:devices/cameraCustomAnalytics:CameraCustomAnalytics", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-meraki",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CameraCustomAnalytics resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CameraCustomAnalytics Get(string name, Input<string> id, CameraCustomAnalyticsState? state = null, CustomResourceOptions? options = null)
        {
            return new CameraCustomAnalytics(name, id, state, options);
        }
    }

    public sealed class CameraCustomAnalyticsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Custom analytics artifact ID
        /// </summary>
        [Input("artifactId")]
        public Input<string>? ArtifactId { get; set; }

        /// <summary>
        /// Whether custom analytics is enabled
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("parameters")]
        private InputList<Inputs.CameraCustomAnalyticsParameterArgs>? _parameters;

        /// <summary>
        /// Parameters for the custom analytics workload
        /// </summary>
        public InputList<Inputs.CameraCustomAnalyticsParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.CameraCustomAnalyticsParameterArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        public CameraCustomAnalyticsArgs()
        {
        }
        public static new CameraCustomAnalyticsArgs Empty => new CameraCustomAnalyticsArgs();
    }

    public sealed class CameraCustomAnalyticsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Custom analytics artifact ID
        /// </summary>
        [Input("artifactId")]
        public Input<string>? ArtifactId { get; set; }

        /// <summary>
        /// Whether custom analytics is enabled
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("parameters")]
        private InputList<Inputs.CameraCustomAnalyticsParameterGetArgs>? _parameters;

        /// <summary>
        /// Parameters for the custom analytics workload
        /// </summary>
        public InputList<Inputs.CameraCustomAnalyticsParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.CameraCustomAnalyticsParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        public CameraCustomAnalyticsState()
        {
        }
        public static new CameraCustomAnalyticsState Empty => new CameraCustomAnalyticsState();
    }
}
