// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetDevicesUplinksAddressesByDevice
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
        ///     var example = Meraki.Organizations.GetDevicesUplinksAddressesByDevice.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         NetworkIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         OrganizationId = "string",
        ///         PerPage = 1,
        ///         ProductTypes = new[]
        ///         {
        ///             "string",
        ///         },
        ///         Serials = new[]
        ///         {
        ///             "string",
        ///         },
        ///         StartingAfter = "string",
        ///         Tags = new[]
        ///         {
        ///             "string",
        ///         },
        ///         TagsFilterType = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsDevicesUplinksAddressesByDeviceExample"] = example.Apply(getDevicesUplinksAddressesByDeviceResult =&gt; getDevicesUplinksAddressesByDeviceResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetDevicesUplinksAddressesByDeviceResult> InvokeAsync(GetDevicesUplinksAddressesByDeviceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDevicesUplinksAddressesByDeviceResult>("meraki:organizations/getDevicesUplinksAddressesByDevice:getDevicesUplinksAddressesByDevice", args ?? new GetDevicesUplinksAddressesByDeviceArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Organizations.GetDevicesUplinksAddressesByDevice.Invoke(new()
        ///     {
        ///         EndingBefore = "string",
        ///         NetworkIds = new[]
        ///         {
        ///             "string",
        ///         },
        ///         OrganizationId = "string",
        ///         PerPage = 1,
        ///         ProductTypes = new[]
        ///         {
        ///             "string",
        ///         },
        ///         Serials = new[]
        ///         {
        ///             "string",
        ///         },
        ///         StartingAfter = "string",
        ///         Tags = new[]
        ///         {
        ///             "string",
        ///         },
        ///         TagsFilterType = "string",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiOrganizationsDevicesUplinksAddressesByDeviceExample"] = example.Apply(getDevicesUplinksAddressesByDeviceResult =&gt; getDevicesUplinksAddressesByDeviceResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDevicesUplinksAddressesByDeviceResult> Invoke(GetDevicesUplinksAddressesByDeviceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDevicesUplinksAddressesByDeviceResult>("meraki:organizations/getDevicesUplinksAddressesByDevice:getDevicesUplinksAddressesByDevice", args ?? new GetDevicesUplinksAddressesByDeviceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDevicesUplinksAddressesByDeviceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public string? EndingBefore { get; set; }

        [Input("networkIds")]
        private List<string>? _networkIds;

        /// <summary>
        /// networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
        /// </summary>
        public List<string> NetworkIds
        {
            get => _networkIds ?? (_networkIds = new List<string>());
            set => _networkIds = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public string OrganizationId { get; set; } = null!;

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public int? PerPage { get; set; }

        [Input("productTypes")]
        private List<string>? _productTypes;

        /// <summary>
        /// productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
        /// </summary>
        public List<string> ProductTypes
        {
            get => _productTypes ?? (_productTypes = new List<string>());
            set => _productTypes = value;
        }

        [Input("serials")]
        private List<string>? _serials;

        /// <summary>
        /// serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
        /// </summary>
        public List<string> Serials
        {
            get => _serials ?? (_serials = new List<string>());
            set => _serials = value;
        }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public string? StartingAfter { get; set; }

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        /// <summary>
        /// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
        /// </summary>
        [Input("tagsFilterType")]
        public string? TagsFilterType { get; set; }

        public GetDevicesUplinksAddressesByDeviceArgs()
        {
        }
        public static new GetDevicesUplinksAddressesByDeviceArgs Empty => new GetDevicesUplinksAddressesByDeviceArgs();
    }

    public sealed class GetDevicesUplinksAddressesByDeviceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public Input<string>? EndingBefore { get; set; }

        [Input("networkIds")]
        private InputList<string>? _networkIds;

        /// <summary>
        /// networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
        /// </summary>
        public InputList<string> NetworkIds
        {
            get => _networkIds ?? (_networkIds = new InputList<string>());
            set => _networkIds = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public Input<int>? PerPage { get; set; }

        [Input("productTypes")]
        private InputList<string>? _productTypes;

        /// <summary>
        /// productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
        /// </summary>
        public InputList<string> ProductTypes
        {
            get => _productTypes ?? (_productTypes = new InputList<string>());
            set => _productTypes = value;
        }

        [Input("serials")]
        private InputList<string>? _serials;

        /// <summary>
        /// serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
        /// </summary>
        public InputList<string> Serials
        {
            get => _serials ?? (_serials = new InputList<string>());
            set => _serials = value;
        }

        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("startingAfter")]
        public Input<string>? StartingAfter { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
        /// </summary>
        [Input("tagsFilterType")]
        public Input<string>? TagsFilterType { get; set; }

        public GetDevicesUplinksAddressesByDeviceInvokeArgs()
        {
        }
        public static new GetDevicesUplinksAddressesByDeviceInvokeArgs Empty => new GetDevicesUplinksAddressesByDeviceInvokeArgs();
    }


    [OutputType]
    public sealed class GetDevicesUplinksAddressesByDeviceResult
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? EndingBefore;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Array of ResponseOrganizationsGetOrganizationDevicesUplinksAddressesByDevice
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDevicesUplinksAddressesByDeviceItemResult> Items;
        /// <summary>
        /// networkIds query parameter. Optional parameter to filter device uplinks by network ID. This filter uses multiple exact matches.
        /// </summary>
        public readonly ImmutableArray<string> NetworkIds;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// productTypes query parameter. Optional parameter to filter device uplinks by device product types. This filter uses multiple exact matches.
        /// </summary>
        public readonly ImmutableArray<string> ProductTypes;
        /// <summary>
        /// serials query parameter. Optional parameter to filter device availabilities by device serial numbers. This filter uses multiple exact matches.
        /// </summary>
        public readonly ImmutableArray<string> Serials;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;
        /// <summary>
        /// tags query parameter. An optional parameter to filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below). This filter uses multiple exact matches.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// tagsFilterType query parameter. An optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return devices which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
        /// </summary>
        public readonly string? TagsFilterType;

        [OutputConstructor]
        private GetDevicesUplinksAddressesByDeviceResult(
            string? endingBefore,

            string id,

            ImmutableArray<Outputs.GetDevicesUplinksAddressesByDeviceItemResult> items,

            ImmutableArray<string> networkIds,

            string organizationId,

            int? perPage,

            ImmutableArray<string> productTypes,

            ImmutableArray<string> serials,

            string? startingAfter,

            ImmutableArray<string> tags,

            string? tagsFilterType)
        {
            EndingBefore = endingBefore;
            Id = id;
            Items = items;
            NetworkIds = networkIds;
            OrganizationId = organizationId;
            PerPage = perPage;
            ProductTypes = productTypes;
            Serials = serials;
            StartingAfter = startingAfter;
            Tags = tags;
            TagsFilterType = tagsFilterType;
        }
    }
}