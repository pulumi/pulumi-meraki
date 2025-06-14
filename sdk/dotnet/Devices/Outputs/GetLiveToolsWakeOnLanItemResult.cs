// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Devices.Outputs
{

    [OutputType]
    public sealed class GetLiveToolsWakeOnLanItemResult
    {
        /// <summary>
        /// An error message for a failed execution
        /// </summary>
        public readonly string Error;
        /// <summary>
        /// The parameters of the Wake-on-LAN request
        /// </summary>
        public readonly Outputs.GetLiveToolsWakeOnLanItemRequestResult Request;
        /// <summary>
        /// Status of the Wake-on-LAN request
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// GET this url to check the status of your ping request
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// ID of the Wake-on-LAN job
        /// </summary>
        public readonly string WakeOnLanId;

        [OutputConstructor]
        private GetLiveToolsWakeOnLanItemResult(
            string error,

            Outputs.GetLiveToolsWakeOnLanItemRequestResult request,

            string status,

            string url,

            string wakeOnLanId)
        {
            Error = error;
            Request = request;
            Status = status;
            Url = url;
            WakeOnLanId = wakeOnLanId;
        }
    }
}
