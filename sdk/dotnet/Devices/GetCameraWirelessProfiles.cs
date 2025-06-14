// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices
{
    public static class GetCameraWirelessProfiles
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
        ///     var example = Meraki.Devices.GetCameraWirelessProfiles.Invoke(new()
        ///     {
        ///         Serial = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiDevicesCameraWirelessProfilesExample"] = example.Apply(getCameraWirelessProfilesResult =&gt; getCameraWirelessProfilesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetCameraWirelessProfilesResult> InvokeAsync(GetCameraWirelessProfilesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCameraWirelessProfilesResult>("meraki:devices/getCameraWirelessProfiles:getCameraWirelessProfiles", args ?? new GetCameraWirelessProfilesArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Devices.GetCameraWirelessProfiles.Invoke(new()
        ///     {
        ///         Serial = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiDevicesCameraWirelessProfilesExample"] = example.Apply(getCameraWirelessProfilesResult =&gt; getCameraWirelessProfilesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCameraWirelessProfilesResult> Invoke(GetCameraWirelessProfilesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCameraWirelessProfilesResult>("meraki:devices/getCameraWirelessProfiles:getCameraWirelessProfiles", args ?? new GetCameraWirelessProfilesInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Devices.GetCameraWirelessProfiles.Invoke(new()
        ///     {
        ///         Serial = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiDevicesCameraWirelessProfilesExample"] = example.Apply(getCameraWirelessProfilesResult =&gt; getCameraWirelessProfilesResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCameraWirelessProfilesResult> Invoke(GetCameraWirelessProfilesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCameraWirelessProfilesResult>("meraki:devices/getCameraWirelessProfiles:getCameraWirelessProfiles", args ?? new GetCameraWirelessProfilesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCameraWirelessProfilesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public string Serial { get; set; } = null!;

        public GetCameraWirelessProfilesArgs()
        {
        }
        public static new GetCameraWirelessProfilesArgs Empty => new GetCameraWirelessProfilesArgs();
    }

    public sealed class GetCameraWirelessProfilesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        public GetCameraWirelessProfilesInvokeArgs()
        {
        }
        public static new GetCameraWirelessProfilesInvokeArgs Empty => new GetCameraWirelessProfilesInvokeArgs();
    }


    [OutputType]
    public sealed class GetCameraWirelessProfilesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetCameraWirelessProfilesItemResult Item;
        /// <summary>
        /// serial path parameter.
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetCameraWirelessProfilesResult(
            string id,

            Outputs.GetCameraWirelessProfilesItemResult item,

            string serial)
        {
            Id = id;
            Item = item;
            Serial = serial;
        }
    }
}
