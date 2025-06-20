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
//			example, err := networks.GetSmDevicesDeviceCommandLogs(ctx, &networks.GetSmDevicesDeviceCommandLogsArgs{
//				DeviceId:      "string",
//				EndingBefore:  pulumi.StringRef("string"),
//				NetworkId:     "string",
//				PerPage:       pulumi.IntRef(1),
//				StartingAfter: pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSmDevicesDeviceCommandLogsExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSmDevicesDeviceCommandLogs(ctx *pulumi.Context, args *GetSmDevicesDeviceCommandLogsArgs, opts ...pulumi.InvokeOption) (*GetSmDevicesDeviceCommandLogsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSmDevicesDeviceCommandLogsResult
	err := ctx.Invoke("meraki:networks/getSmDevicesDeviceCommandLogs:getSmDevicesDeviceCommandLogs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSmDevicesDeviceCommandLogs.
type GetSmDevicesDeviceCommandLogsArgs struct {
	// deviceId path parameter. Device ID
	DeviceId string `pulumi:"deviceId"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

// A collection of values returned by getSmDevicesDeviceCommandLogs.
type GetSmDevicesDeviceCommandLogsResult struct {
	// deviceId path parameter. Device ID
	DeviceId string `pulumi:"deviceId"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseSmGetNetworkSmDeviceDeviceCommandLogs
	Items []GetSmDevicesDeviceCommandLogsItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

func GetSmDevicesDeviceCommandLogsOutput(ctx *pulumi.Context, args GetSmDevicesDeviceCommandLogsOutputArgs, opts ...pulumi.InvokeOption) GetSmDevicesDeviceCommandLogsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSmDevicesDeviceCommandLogsResultOutput, error) {
			args := v.(GetSmDevicesDeviceCommandLogsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getSmDevicesDeviceCommandLogs:getSmDevicesDeviceCommandLogs", args, GetSmDevicesDeviceCommandLogsResultOutput{}, options).(GetSmDevicesDeviceCommandLogsResultOutput), nil
		}).(GetSmDevicesDeviceCommandLogsResultOutput)
}

// A collection of arguments for invoking getSmDevicesDeviceCommandLogs.
type GetSmDevicesDeviceCommandLogsOutputArgs struct {
	// deviceId path parameter. Device ID
	DeviceId pulumi.StringInput `pulumi:"deviceId"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
}

func (GetSmDevicesDeviceCommandLogsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmDevicesDeviceCommandLogsArgs)(nil)).Elem()
}

// A collection of values returned by getSmDevicesDeviceCommandLogs.
type GetSmDevicesDeviceCommandLogsResultOutput struct{ *pulumi.OutputState }

func (GetSmDevicesDeviceCommandLogsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmDevicesDeviceCommandLogsResult)(nil)).Elem()
}

func (o GetSmDevicesDeviceCommandLogsResultOutput) ToGetSmDevicesDeviceCommandLogsResultOutput() GetSmDevicesDeviceCommandLogsResultOutput {
	return o
}

func (o GetSmDevicesDeviceCommandLogsResultOutput) ToGetSmDevicesDeviceCommandLogsResultOutputWithContext(ctx context.Context) GetSmDevicesDeviceCommandLogsResultOutput {
	return o
}

// deviceId path parameter. Device ID
func (o GetSmDevicesDeviceCommandLogsResultOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceCommandLogsResult) string { return v.DeviceId }).(pulumi.StringOutput)
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetSmDevicesDeviceCommandLogsResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceCommandLogsResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSmDevicesDeviceCommandLogsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceCommandLogsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseSmGetNetworkSmDeviceDeviceCommandLogs
func (o GetSmDevicesDeviceCommandLogsResultOutput) Items() GetSmDevicesDeviceCommandLogsItemArrayOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceCommandLogsResult) []GetSmDevicesDeviceCommandLogsItem { return v.Items }).(GetSmDevicesDeviceCommandLogsItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetSmDevicesDeviceCommandLogsResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceCommandLogsResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o GetSmDevicesDeviceCommandLogsResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceCommandLogsResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetSmDevicesDeviceCommandLogsResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSmDevicesDeviceCommandLogsResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSmDevicesDeviceCommandLogsResultOutput{})
}
