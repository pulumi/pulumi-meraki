// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations
{
    public static class GetInventoryDevices
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetInventoryDevicesResult> InvokeAsync(GetInventoryDevicesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInventoryDevicesResult>("meraki:organizations/getInventoryDevices:getInventoryDevices", args ?? new GetInventoryDevicesArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetInventoryDevicesResult> Invoke(GetInventoryDevicesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInventoryDevicesResult>("meraki:organizations/getInventoryDevices:getInventoryDevices", args ?? new GetInventoryDevicesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInventoryDevicesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public string? EndingBefore { get; set; }

        [Input("macs")]
        private List<string>? _macs;

        /// <summary>
        /// macs query parameter. Search for devices in inventory based on mac addresses.
        /// </summary>
        public List<string> Macs
        {
            get => _macs ?? (_macs = new List<string>());
            set => _macs = value;
        }

        [Input("models")]
        private List<string>? _models;

        /// <summary>
        /// models query parameter. Search for devices in inventory based on model.
        /// </summary>
        public List<string> Models
        {
            get => _models ?? (_models = new List<string>());
            set => _models = value;
        }

        [Input("networkIds")]
        private List<string>? _networkIds;

        /// <summary>
        /// networkIds query parameter. Search for devices in inventory based on network ids. Use explicit 'null' value to get available devices only.
        /// </summary>
        public List<string> NetworkIds
        {
            get => _networkIds ?? (_networkIds = new List<string>());
            set => _networkIds = value;
        }

        [Input("orderNumbers")]
        private List<string>? _orderNumbers;

        /// <summary>
        /// orderNumbers query parameter. Search for devices in inventory based on order numbers.
        /// </summary>
        public List<string> OrderNumbers
        {
            get => _orderNumbers ?? (_orderNumbers = new List<string>());
            set => _orderNumbers = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public string? OrganizationId { get; set; }

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public int? PerPage { get; set; }

        [Input("productTypes")]
        private List<string>? _productTypes;

        /// <summary>
        /// productTypes query parameter. Filter devices by product type. Accepted values are appliance, camera, cellularGateway, sensor, switch, systemsManager, and wireless.
        /// </summary>
        public List<string> ProductTypes
        {
            get => _productTypes ?? (_productTypes = new List<string>());
            set => _productTypes = value;
        }

        /// <summary>
        /// search query parameter. Search for devices in inventory based on serial number, mac address, or model.
        /// </summary>
        [Input("search")]
        public string? Search { get; set; }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial")]
        public string? Serial { get; set; }

        [Input("serials")]
        private List<string>? _serials;

        /// <summary>
        /// serials query parameter. Search for devices in inventory based on serials.
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
        /// tags query parameter. Filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        /// <summary>
        /// tagsFilterType query parameter. To use with 'tags' parameter, to filter devices which contain ANY or ALL given tags. Accepted values are 'withAnyTags' or 'withAllTags', default is 'withAnyTags'.
        /// </summary>
        [Input("tagsFilterType")]
        public string? TagsFilterType { get; set; }

        /// <summary>
        /// usedState query parameter. Filter results by used or unused inventory. Accepted values are 'used' or 'unused'.
        /// </summary>
        [Input("usedState")]
        public string? UsedState { get; set; }

        public GetInventoryDevicesArgs()
        {
        }
        public static new GetInventoryDevicesArgs Empty => new GetInventoryDevicesArgs();
    }

    public sealed class GetInventoryDevicesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        [Input("endingBefore")]
        public Input<string>? EndingBefore { get; set; }

        [Input("macs")]
        private InputList<string>? _macs;

        /// <summary>
        /// macs query parameter. Search for devices in inventory based on mac addresses.
        /// </summary>
        public InputList<string> Macs
        {
            get => _macs ?? (_macs = new InputList<string>());
            set => _macs = value;
        }

        [Input("models")]
        private InputList<string>? _models;

        /// <summary>
        /// models query parameter. Search for devices in inventory based on model.
        /// </summary>
        public InputList<string> Models
        {
            get => _models ?? (_models = new InputList<string>());
            set => _models = value;
        }

        [Input("networkIds")]
        private InputList<string>? _networkIds;

        /// <summary>
        /// networkIds query parameter. Search for devices in inventory based on network ids. Use explicit 'null' value to get available devices only.
        /// </summary>
        public InputList<string> NetworkIds
        {
            get => _networkIds ?? (_networkIds = new InputList<string>());
            set => _networkIds = value;
        }

        [Input("orderNumbers")]
        private InputList<string>? _orderNumbers;

        /// <summary>
        /// orderNumbers query parameter. Search for devices in inventory based on order numbers.
        /// </summary>
        public InputList<string> OrderNumbers
        {
            get => _orderNumbers ?? (_orderNumbers = new InputList<string>());
            set => _orderNumbers = value;
        }

        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        [Input("perPage")]
        public Input<int>? PerPage { get; set; }

        [Input("productTypes")]
        private InputList<string>? _productTypes;

        /// <summary>
        /// productTypes query parameter. Filter devices by product type. Accepted values are appliance, camera, cellularGateway, sensor, switch, systemsManager, and wireless.
        /// </summary>
        public InputList<string> ProductTypes
        {
            get => _productTypes ?? (_productTypes = new InputList<string>());
            set => _productTypes = value;
        }

        /// <summary>
        /// search query parameter. Search for devices in inventory based on serial number, mac address, or model.
        /// </summary>
        [Input("search")]
        public Input<string>? Search { get; set; }

        /// <summary>
        /// serial path parameter.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        [Input("serials")]
        private InputList<string>? _serials;

        /// <summary>
        /// serials query parameter. Search for devices in inventory based on serials.
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
        /// tags query parameter. Filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// tagsFilterType query parameter. To use with 'tags' parameter, to filter devices which contain ANY or ALL given tags. Accepted values are 'withAnyTags' or 'withAllTags', default is 'withAnyTags'.
        /// </summary>
        [Input("tagsFilterType")]
        public Input<string>? TagsFilterType { get; set; }

        /// <summary>
        /// usedState query parameter. Filter results by used or unused inventory. Accepted values are 'used' or 'unused'.
        /// </summary>
        [Input("usedState")]
        public Input<string>? UsedState { get; set; }

        public GetInventoryDevicesInvokeArgs()
        {
        }
        public static new GetInventoryDevicesInvokeArgs Empty => new GetInventoryDevicesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInventoryDevicesResult
    {
        /// <summary>
        /// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? EndingBefore;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetInventoryDevicesItemResult Item;
        /// <summary>
        /// Array of ResponseOrganizationsGetOrganizationInventoryDevices
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInventoryDevicesItemResult> Items;
        /// <summary>
        /// macs query parameter. Search for devices in inventory based on mac addresses.
        /// </summary>
        public readonly ImmutableArray<string> Macs;
        /// <summary>
        /// models query parameter. Search for devices in inventory based on model.
        /// </summary>
        public readonly ImmutableArray<string> Models;
        /// <summary>
        /// networkIds query parameter. Search for devices in inventory based on network ids. Use explicit 'null' value to get available devices only.
        /// </summary>
        public readonly ImmutableArray<string> NetworkIds;
        /// <summary>
        /// orderNumbers query parameter. Search for devices in inventory based on order numbers.
        /// </summary>
        public readonly ImmutableArray<string> OrderNumbers;
        /// <summary>
        /// organizationId path parameter. Organization ID
        /// </summary>
        public readonly string? OrganizationId;
        /// <summary>
        /// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
        /// </summary>
        public readonly int? PerPage;
        /// <summary>
        /// productTypes query parameter. Filter devices by product type. Accepted values are appliance, camera, cellularGateway, sensor, switch, systemsManager, and wireless.
        /// </summary>
        public readonly ImmutableArray<string> ProductTypes;
        /// <summary>
        /// search query parameter. Search for devices in inventory based on serial number, mac address, or model.
        /// </summary>
        public readonly string? Search;
        /// <summary>
        /// serial path parameter.
        /// </summary>
        public readonly string? Serial;
        /// <summary>
        /// serials query parameter. Search for devices in inventory based on serials.
        /// </summary>
        public readonly ImmutableArray<string> Serials;
        /// <summary>
        /// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
        /// </summary>
        public readonly string? StartingAfter;
        /// <summary>
        /// tags query parameter. Filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// tagsFilterType query parameter. To use with 'tags' parameter, to filter devices which contain ANY or ALL given tags. Accepted values are 'withAnyTags' or 'withAllTags', default is 'withAnyTags'.
        /// </summary>
        public readonly string? TagsFilterType;
        /// <summary>
        /// usedState query parameter. Filter results by used or unused inventory. Accepted values are 'used' or 'unused'.
        /// </summary>
        public readonly string? UsedState;

        [OutputConstructor]
        private GetInventoryDevicesResult(
            string? endingBefore,

            string id,

            Outputs.GetInventoryDevicesItemResult item,

            ImmutableArray<Outputs.GetInventoryDevicesItemResult> items,

            ImmutableArray<string> macs,

            ImmutableArray<string> models,

            ImmutableArray<string> networkIds,

            ImmutableArray<string> orderNumbers,

            string? organizationId,

            int? perPage,

            ImmutableArray<string> productTypes,

            string? search,

            string? serial,

            ImmutableArray<string> serials,

            string? startingAfter,

            ImmutableArray<string> tags,

            string? tagsFilterType,

            string? usedState)
        {
            EndingBefore = endingBefore;
            Id = id;
            Item = item;
            Items = items;
            Macs = macs;
            Models = models;
            NetworkIds = networkIds;
            OrderNumbers = orderNumbers;
            OrganizationId = organizationId;
            PerPage = perPage;
            ProductTypes = productTypes;
            Search = search;
            Serial = serial;
            Serials = serials;
            StartingAfter = startingAfter;
            Tags = tags;
            TagsFilterType = tagsFilterType;
            UsedState = usedState;
        }
    }
}