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
//			example, err := networks.GetSmProfiles(ctx, &networks.GetSmProfilesArgs{
//				NetworkId: "string",
//				PayloadTypes: []string{
//					"string",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSmProfilesExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSmProfiles(ctx *pulumi.Context, args *GetSmProfilesArgs, opts ...pulumi.InvokeOption) (*GetSmProfilesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSmProfilesResult
	err := ctx.Invoke("meraki:networks/getSmProfiles:getSmProfiles", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSmProfiles.
type GetSmProfilesArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// payloadTypes query parameter. Filter by payload types
	PayloadTypes []string `pulumi:"payloadTypes"`
}

// A collection of values returned by getSmProfiles.
type GetSmProfilesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseSmGetNetworkSmProfiles
	Items []GetSmProfilesItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// payloadTypes query parameter. Filter by payload types
	PayloadTypes []string `pulumi:"payloadTypes"`
}

func GetSmProfilesOutput(ctx *pulumi.Context, args GetSmProfilesOutputArgs, opts ...pulumi.InvokeOption) GetSmProfilesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSmProfilesResultOutput, error) {
			args := v.(GetSmProfilesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getSmProfiles:getSmProfiles", args, GetSmProfilesResultOutput{}, options).(GetSmProfilesResultOutput), nil
		}).(GetSmProfilesResultOutput)
}

// A collection of arguments for invoking getSmProfiles.
type GetSmProfilesOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// payloadTypes query parameter. Filter by payload types
	PayloadTypes pulumi.StringArrayInput `pulumi:"payloadTypes"`
}

func (GetSmProfilesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmProfilesArgs)(nil)).Elem()
}

// A collection of values returned by getSmProfiles.
type GetSmProfilesResultOutput struct{ *pulumi.OutputState }

func (GetSmProfilesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmProfilesResult)(nil)).Elem()
}

func (o GetSmProfilesResultOutput) ToGetSmProfilesResultOutput() GetSmProfilesResultOutput {
	return o
}

func (o GetSmProfilesResultOutput) ToGetSmProfilesResultOutputWithContext(ctx context.Context) GetSmProfilesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSmProfilesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmProfilesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseSmGetNetworkSmProfiles
func (o GetSmProfilesResultOutput) Items() GetSmProfilesItemArrayOutput {
	return o.ApplyT(func(v GetSmProfilesResult) []GetSmProfilesItem { return v.Items }).(GetSmProfilesItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetSmProfilesResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmProfilesResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// payloadTypes query parameter. Filter by payload types
func (o GetSmProfilesResultOutput) PayloadTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSmProfilesResult) []string { return v.PayloadTypes }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSmProfilesResultOutput{})
}
