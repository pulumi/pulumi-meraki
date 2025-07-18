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
    /// ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
    /// already existed previously.
    /// 
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
    ///     var example = new Meraki.Devices.CameraGenerateSnapshot("example", new()
    ///     {
    ///         Serial = "string",
    ///         Parameters = new Meraki.Devices.Inputs.CameraGenerateSnapshotParametersArgs
    ///         {
    ///             Fullframe = false,
    ///             Timestamp = "2021-04-30T15:18:08Z",
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["merakiDevicesCameraGenerateSnapshotExample"] = example,
    ///     };
    /// });
    /// ```
    /// </summary>
    [MerakiResourceType("meraki:devices/cameraGenerateSnapshot:CameraGenerateSnapshot")]
    public partial class CameraGenerateSnapshot : global::Pulumi.CustomResource
    {
        [Output("parameters")]
        public Output<Outputs.CameraGenerateSnapshotParameters> Parameters { get; private set; } = null!;

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;


        /// <summary>
        /// Create a CameraGenerateSnapshot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CameraGenerateSnapshot(string name, CameraGenerateSnapshotArgs args, CustomResourceOptions? options = null)
            : base("meraki:devices/cameraGenerateSnapshot:CameraGenerateSnapshot", name, args ?? new CameraGenerateSnapshotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CameraGenerateSnapshot(string name, Input<string> id, CameraGenerateSnapshotState? state = null, CustomResourceOptions? options = null)
            : base("meraki:devices/cameraGenerateSnapshot:CameraGenerateSnapshot", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CameraGenerateSnapshot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CameraGenerateSnapshot Get(string name, Input<string> id, CameraGenerateSnapshotState? state = null, CustomResourceOptions? options = null)
        {
            return new CameraGenerateSnapshot(name, id, state, options);
        }
    }

    public sealed class CameraGenerateSnapshotArgs : global::Pulumi.ResourceArgs
    {
        [Input("parameters", required: true)]
        public Input<Inputs.CameraGenerateSnapshotParametersArgs> Parameters { get; set; } = null!;

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        public CameraGenerateSnapshotArgs()
        {
        }
        public static new CameraGenerateSnapshotArgs Empty => new CameraGenerateSnapshotArgs();
    }

    public sealed class CameraGenerateSnapshotState : global::Pulumi.ResourceArgs
    {
        [Input("parameters")]
        public Input<Inputs.CameraGenerateSnapshotParametersGetArgs>? Parameters { get; set; }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        public CameraGenerateSnapshotState()
        {
        }
        public static new CameraGenerateSnapshotState Empty => new CameraGenerateSnapshotState();
    }
}
