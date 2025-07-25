// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/networks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := networks.GetSmUsers(ctx, &networks.GetSmUsersArgs{
//				Emails: []string{
//					"string",
//				},
//				Ids: []string{
//					"string",
//				},
//				NetworkId: "string",
//				Scopes: []string{
//					"string",
//				},
//				Usernames: []string{
//					"string",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSmUsersExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSmUsers(ctx *pulumi.Context, args *GetSmUsersArgs, opts ...pulumi.InvokeOption) (*GetSmUsersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSmUsersResult
	err := ctx.Invoke("meraki:networks/getSmUsers:getSmUsers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSmUsers.
type GetSmUsersArgs struct {
	// emails query parameter. Filter users by email(s).
	Emails []string `pulumi:"emails"`
	// ids query parameter. Filter users by id(s).
	Ids []string `pulumi:"ids"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// scope query parameter. Specifiy a scope (one of all, none, withAny, withAll, withoutAny, withoutAll) and a set of tags.
	Scopes []string `pulumi:"scopes"`
	// usernames query parameter. Filter users by username(s).
	Usernames []string `pulumi:"usernames"`
}

// A collection of values returned by getSmUsers.
type GetSmUsersResult struct {
	// emails query parameter. Filter users by email(s).
	Emails []string `pulumi:"emails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// ids query parameter. Filter users by id(s).
	Ids []string `pulumi:"ids"`
	// Array of ResponseSmGetNetworkSmUsers
	Items []GetSmUsersItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// scope query parameter. Specifiy a scope (one of all, none, withAny, withAll, withoutAny, withoutAll) and a set of tags.
	Scopes []string `pulumi:"scopes"`
	// usernames query parameter. Filter users by username(s).
	Usernames []string `pulumi:"usernames"`
}

func GetSmUsersOutput(ctx *pulumi.Context, args GetSmUsersOutputArgs, opts ...pulumi.InvokeOption) GetSmUsersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSmUsersResultOutput, error) {
			args := v.(GetSmUsersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getSmUsers:getSmUsers", args, GetSmUsersResultOutput{}, options).(GetSmUsersResultOutput), nil
		}).(GetSmUsersResultOutput)
}

// A collection of arguments for invoking getSmUsers.
type GetSmUsersOutputArgs struct {
	// emails query parameter. Filter users by email(s).
	Emails pulumi.StringArrayInput `pulumi:"emails"`
	// ids query parameter. Filter users by id(s).
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// scope query parameter. Specifiy a scope (one of all, none, withAny, withAll, withoutAny, withoutAll) and a set of tags.
	Scopes pulumi.StringArrayInput `pulumi:"scopes"`
	// usernames query parameter. Filter users by username(s).
	Usernames pulumi.StringArrayInput `pulumi:"usernames"`
}

func (GetSmUsersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmUsersArgs)(nil)).Elem()
}

// A collection of values returned by getSmUsers.
type GetSmUsersResultOutput struct{ *pulumi.OutputState }

func (GetSmUsersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmUsersResult)(nil)).Elem()
}

func (o GetSmUsersResultOutput) ToGetSmUsersResultOutput() GetSmUsersResultOutput {
	return o
}

func (o GetSmUsersResultOutput) ToGetSmUsersResultOutputWithContext(ctx context.Context) GetSmUsersResultOutput {
	return o
}

// emails query parameter. Filter users by email(s).
func (o GetSmUsersResultOutput) Emails() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSmUsersResult) []string { return v.Emails }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSmUsersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmUsersResult) string { return v.Id }).(pulumi.StringOutput)
}

// ids query parameter. Filter users by id(s).
func (o GetSmUsersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSmUsersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// Array of ResponseSmGetNetworkSmUsers
func (o GetSmUsersResultOutput) Items() GetSmUsersItemArrayOutput {
	return o.ApplyT(func(v GetSmUsersResult) []GetSmUsersItem { return v.Items }).(GetSmUsersItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetSmUsersResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmUsersResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// scope query parameter. Specifiy a scope (one of all, none, withAny, withAll, withoutAny, withoutAll) and a set of tags.
func (o GetSmUsersResultOutput) Scopes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSmUsersResult) []string { return v.Scopes }).(pulumi.StringArrayOutput)
}

// usernames query parameter. Filter users by username(s).
func (o GetSmUsersResultOutput) Usernames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSmUsersResult) []string { return v.Usernames }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSmUsersResultOutput{})
}
