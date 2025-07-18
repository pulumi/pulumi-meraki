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
//			example, err := networks.GetSmDevicesWlanLists(ctx, &networks.GetSmDevicesWlanListsArgs{
//				DeviceId:  "string",
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSmDevicesWlanListsExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSmDevicesWlanLists(ctx *pulumi.Context, args *GetSmDevicesWlanListsArgs, opts ...pulumi.InvokeOption) (*GetSmDevicesWlanListsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSmDevicesWlanListsResult
	err := ctx.Invoke("meraki:networks/getSmDevicesWlanLists:getSmDevicesWlanLists", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSmDevicesWlanLists.
type GetSmDevicesWlanListsArgs struct {
	// deviceId path parameter. Device ID
	DeviceId string `pulumi:"deviceId"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getSmDevicesWlanLists.
type GetSmDevicesWlanListsResult struct {
	// deviceId path parameter. Device ID
	DeviceId string `pulumi:"deviceId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseSmGetNetworkSmDeviceWlanLists
	Items []GetSmDevicesWlanListsItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func GetSmDevicesWlanListsOutput(ctx *pulumi.Context, args GetSmDevicesWlanListsOutputArgs, opts ...pulumi.InvokeOption) GetSmDevicesWlanListsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSmDevicesWlanListsResultOutput, error) {
			args := v.(GetSmDevicesWlanListsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getSmDevicesWlanLists:getSmDevicesWlanLists", args, GetSmDevicesWlanListsResultOutput{}, options).(GetSmDevicesWlanListsResultOutput), nil
		}).(GetSmDevicesWlanListsResultOutput)
}

// A collection of arguments for invoking getSmDevicesWlanLists.
type GetSmDevicesWlanListsOutputArgs struct {
	// deviceId path parameter. Device ID
	DeviceId pulumi.StringInput `pulumi:"deviceId"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (GetSmDevicesWlanListsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmDevicesWlanListsArgs)(nil)).Elem()
}

// A collection of values returned by getSmDevicesWlanLists.
type GetSmDevicesWlanListsResultOutput struct{ *pulumi.OutputState }

func (GetSmDevicesWlanListsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmDevicesWlanListsResult)(nil)).Elem()
}

func (o GetSmDevicesWlanListsResultOutput) ToGetSmDevicesWlanListsResultOutput() GetSmDevicesWlanListsResultOutput {
	return o
}

func (o GetSmDevicesWlanListsResultOutput) ToGetSmDevicesWlanListsResultOutputWithContext(ctx context.Context) GetSmDevicesWlanListsResultOutput {
	return o
}

// deviceId path parameter. Device ID
func (o GetSmDevicesWlanListsResultOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesWlanListsResult) string { return v.DeviceId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSmDevicesWlanListsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesWlanListsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseSmGetNetworkSmDeviceWlanLists
func (o GetSmDevicesWlanListsResultOutput) Items() GetSmDevicesWlanListsItemArrayOutput {
	return o.ApplyT(func(v GetSmDevicesWlanListsResult) []GetSmDevicesWlanListsItem { return v.Items }).(GetSmDevicesWlanListsItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetSmDevicesWlanListsResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesWlanListsResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSmDevicesWlanListsResultOutput{})
}
