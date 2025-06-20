// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices
{
    public static class GetCameraCustomAnalytics
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
        ///     var example = Meraki.Devices.GetCameraCustomAnalytics.Invoke(new()
        ///     {
        ///         Serial = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiDevicesCameraCustomAnalyticsExample"] = example.Apply(getCameraCustomAnalyticsResult =&gt; getCameraCustomAnalyticsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetCameraCustomAnalyticsResult> InvokeAsync(GetCameraCustomAnalyticsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCameraCustomAnalyticsResult>("meraki:devices/getCameraCustomAnalytics:getCameraCustomAnalytics", args ?? new GetCameraCustomAnalyticsArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Devices.GetCameraCustomAnalytics.Invoke(new()
        ///     {
        ///         Serial = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiDevicesCameraCustomAnalyticsExample"] = example.Apply(getCameraCustomAnalyticsResult =&gt; getCameraCustomAnalyticsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCameraCustomAnalyticsResult> Invoke(GetCameraCustomAnalyticsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCameraCustomAnalyticsResult>("meraki:devices/getCameraCustomAnalytics:getCameraCustomAnalytics", args ?? new GetCameraCustomAnalyticsInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Devices.GetCameraCustomAnalytics.Invoke(new()
        ///     {
        ///         Serial = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiDevicesCameraCustomAnalyticsExample"] = example.Apply(getCameraCustomAnalyticsResult =&gt; getCameraCustomAnalyticsResult.Item),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCameraCustomAnalyticsResult> Invoke(GetCameraCustomAnalyticsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCameraCustomAnalyticsResult>("meraki:devices/getCameraCustomAnalytics:getCameraCustomAnalytics", args ?? new GetCameraCustomAnalyticsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCameraCustomAnalyticsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public string Serial { get; set; } = null!;

        public GetCameraCustomAnalyticsArgs()
        {
        }
        public static new GetCameraCustomAnalyticsArgs Empty => new GetCameraCustomAnalyticsArgs();
    }

    public sealed class GetCameraCustomAnalyticsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial", required: true)]
        public Input<string> Serial { get; set; } = null!;

        public GetCameraCustomAnalyticsInvokeArgs()
        {
        }
        public static new GetCameraCustomAnalyticsInvokeArgs Empty => new GetCameraCustomAnalyticsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCameraCustomAnalyticsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetCameraCustomAnalyticsItemResult Item;
        /// <summary>
        /// serial path parameter.
        /// </summary>
        public readonly string Serial;

        [OutputConstructor]
        private GetCameraCustomAnalyticsResult(
            string id,

            Outputs.GetCameraCustomAnalyticsItemResult item,

            string serial)
        {
            Id = id;
            Item = item;
            Serial = serial;
        }
    }
}
