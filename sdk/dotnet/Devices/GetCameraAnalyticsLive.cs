// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices
{
    public static class GetCameraAnalyticsLive
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
        ///     var example = Meraki.Devices.GetCameraAnalyticsLive.Invoke(new()
        ///     {
        ///         Serial = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiDevicesCameraAnalyticsLiveExample"] = example.Apply(getCameraAnalyticsLiveResult =&gt; getCameraAnalyticsLiveResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetCameraAnalyticsLiveResult> InvokeAsync(GetCameraAnalyticsLiveArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCameraAnalyticsLiveResult>("meraki:devices/getCameraAnalyticsLive:getCameraAnalyticsLive", args ?? new GetCameraAnalyticsLiveArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Devices.GetCameraAnalyticsLive.Invoke(new()
        ///     {
        ///         Serial = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiDevicesCameraAnalyticsLiveExample"] = example.Apply(getCameraAnalyticsLiveResult =&gt; getCameraAnalyticsLiveResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCameraAnalyticsLiveResult> Invoke(GetCameraAnalyticsLiveInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCameraAnalyticsLiveResult>("meraki:devices/getCameraAnalyticsLive:getCameraAnalyticsLive", args ?? new GetCameraAnalyticsLiveInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCameraAnalyticsLiveArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public string Serial { get; set; } = null!;

        public GetCameraAnalyticsLiveArgs()
        {
        }
        public static new GetCameraAnalyticsLiveArgs Empty => new GetCameraAnalyticsLiveArgs();
    }

    public sealed class GetCameraAnalyticsLiveInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        public GetCameraAnalyticsLiveInvokeArgs()
        {
        }
        public static new GetCameraAnalyticsLiveInvokeArgs Empty => new GetCameraAnalyticsLiveInvokeArgs();
    }


    [OutputType]
    public sealed class GetCameraAnalyticsLiveResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetCameraAnalyticsLiveItemResult Item;
        /// <summary>
        /// serial path parameter.
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetCameraAnalyticsLiveResult(
            string id,

            Outputs.GetCameraAnalyticsLiveItemResult item,

            string serial)
        {
            Id = id;
            Item = item;
            Serial = serial;
        }
    }
}