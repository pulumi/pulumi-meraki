// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks
{
    public static class GetSmUsers
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
        ///     var example = Meraki.Networks.GetSmUsers.Invoke(new()
        ///     {
        ///         Emails = new[]
        ///         {
        ///             "string",
        ///         },
        ///         Ids = new[]
        ///         {
        ///             "string",
        ///         },
        ///         NetworkId = "string",
        ///         Scopes = new[]
        ///         {
        ///             "string",
        ///         },
        ///         Usernames = new[]
        ///         {
        ///             "string",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSmUsersExample"] = example.Apply(getSmUsersResult =&gt; getSmUsersResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSmUsersResult> InvokeAsync(GetSmUsersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSmUsersResult>("meraki:networks/getSmUsers:getSmUsers", args ?? new GetSmUsersArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSmUsers.Invoke(new()
        ///     {
        ///         Emails = new[]
        ///         {
        ///             "string",
        ///         },
        ///         Ids = new[]
        ///         {
        ///             "string",
        ///         },
        ///         NetworkId = "string",
        ///         Scopes = new[]
        ///         {
        ///             "string",
        ///         },
        ///         Usernames = new[]
        ///         {
        ///             "string",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSmUsersExample"] = example.Apply(getSmUsersResult =&gt; getSmUsersResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSmUsersResult> Invoke(GetSmUsersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSmUsersResult>("meraki:networks/getSmUsers:getSmUsers", args ?? new GetSmUsersInvokeArgs(), options.WithDefaults());

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
        ///     var example = Meraki.Networks.GetSmUsers.Invoke(new()
        ///     {
        ///         Emails = new[]
        ///         {
        ///             "string",
        ///         },
        ///         Ids = new[]
        ///         {
        ///             "string",
        ///         },
        ///         NetworkId = "string",
        ///         Scopes = new[]
        ///         {
        ///             "string",
        ///         },
        ///         Usernames = new[]
        ///         {
        ///             "string",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["merakiNetworksSmUsersExample"] = example.Apply(getSmUsersResult =&gt; getSmUsersResult.Items),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSmUsersResult> Invoke(GetSmUsersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSmUsersResult>("meraki:networks/getSmUsers:getSmUsers", args ?? new GetSmUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSmUsersArgs : global::Pulumi.InvokeArgs
    {
        [Input("emails")]
        private List<string>? _emails;

        /// <summary>
        /// emails query parameter. Filter users by email(s).
        /// </summary>
        public List<string> Emails
        {
            get => _emails ?? (_emails = new List<string>());
            set => _emails = value;
        }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// ids query parameter. Filter users by id(s).
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public string NetworkId { get; set; } = null!;

        [Input("scopes")]
        private List<string>? _scopes;

        /// <summary>
        /// scope query parameter. Specifiy a scope (one of all, none, withAny, withAll, withoutAny, withoutAll) and a set of tags.
        /// </summary>
        public List<string> Scopes
        {
            get => _scopes ?? (_scopes = new List<string>());
            set => _scopes = value;
        }

        [Input("usernames")]
        private List<string>? _usernames;

        /// <summary>
        /// usernames query parameter. Filter users by username(s).
        /// </summary>
        public List<string> Usernames
        {
            get => _usernames ?? (_usernames = new List<string>());
            set => _usernames = value;
        }

        public GetSmUsersArgs()
        {
        }
        public static new GetSmUsersArgs Empty => new GetSmUsersArgs();
    }

    public sealed class GetSmUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("emails")]
        private InputList<string>? _emails;

        /// <summary>
        /// emails query parameter. Filter users by email(s).
        /// </summary>
        public InputList<string> Emails
        {
            get => _emails ?? (_emails = new InputList<string>());
            set => _emails = value;
        }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// ids query parameter. Filter users by id(s).
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        [Input("networkId", required: true)]
        public Input<string> NetworkId { get; set; } = null!;

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// scope query parameter. Specifiy a scope (one of all, none, withAny, withAll, withoutAny, withoutAll) and a set of tags.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        [Input("usernames")]
        private InputList<string>? _usernames;

        /// <summary>
        /// usernames query parameter. Filter users by username(s).
        /// </summary>
        public InputList<string> Usernames
        {
            get => _usernames ?? (_usernames = new InputList<string>());
            set => _usernames = value;
        }

        public GetSmUsersInvokeArgs()
        {
        }
        public static new GetSmUsersInvokeArgs Empty => new GetSmUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetSmUsersResult
    {
        /// <summary>
        /// emails query parameter. Filter users by email(s).
        /// </summary>
        public readonly ImmutableArray<string> Emails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// ids query parameter. Filter users by id(s).
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// Array of ResponseSmGetNetworkSmUsers
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSmUsersItemResult> Items;
        /// <summary>
        /// networkId path parameter. Network ID
        /// </summary>
        public readonly string NetworkId;
        /// <summary>
        /// scope query parameter. Specifiy a scope (one of all, none, withAny, withAll, withoutAny, withoutAll) and a set of tags.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        /// <summary>
        /// usernames query parameter. Filter users by username(s).
        /// </summary>
        public readonly ImmutableArray<string> Usernames;

        [OutputConstructor]
        private GetSmUsersResult(
            ImmutableArray<string> emails,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetSmUsersItemResult> items,

            string networkId,

            ImmutableArray<string> scopes,

            ImmutableArray<string> usernames)
        {
            Emails = emails;
            Id = id;
            Ids = ids;
            Items = items;
            NetworkId = networkId;
            Scopes = scopes;
            Usernames = usernames;
        }
    }
}
