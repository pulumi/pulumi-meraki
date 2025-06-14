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
//			example, err := networks.GetSmDevicesCerts(ctx, &networks.GetSmDevicesCertsArgs{
//				DeviceId:  "string",
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSmDevicesCertsExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSmDevicesCerts(ctx *pulumi.Context, args *GetSmDevicesCertsArgs, opts ...pulumi.InvokeOption) (*GetSmDevicesCertsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSmDevicesCertsResult
	err := ctx.Invoke("meraki:networks/getSmDevicesCerts:getSmDevicesCerts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSmDevicesCerts.
type GetSmDevicesCertsArgs struct {
	// deviceId path parameter. Device ID
	DeviceId string `pulumi:"deviceId"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getSmDevicesCerts.
type GetSmDevicesCertsResult struct {
	// deviceId path parameter. Device ID
	DeviceId string `pulumi:"deviceId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseSmGetNetworkSmDeviceCerts
	Items []GetSmDevicesCertsItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func GetSmDevicesCertsOutput(ctx *pulumi.Context, args GetSmDevicesCertsOutputArgs, opts ...pulumi.InvokeOption) GetSmDevicesCertsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSmDevicesCertsResultOutput, error) {
			args := v.(GetSmDevicesCertsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getSmDevicesCerts:getSmDevicesCerts", args, GetSmDevicesCertsResultOutput{}, options).(GetSmDevicesCertsResultOutput), nil
		}).(GetSmDevicesCertsResultOutput)
}

// A collection of arguments for invoking getSmDevicesCerts.
type GetSmDevicesCertsOutputArgs struct {
	// deviceId path parameter. Device ID
	DeviceId pulumi.StringInput `pulumi:"deviceId"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (GetSmDevicesCertsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmDevicesCertsArgs)(nil)).Elem()
}

// A collection of values returned by getSmDevicesCerts.
type GetSmDevicesCertsResultOutput struct{ *pulumi.OutputState }

func (GetSmDevicesCertsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmDevicesCertsResult)(nil)).Elem()
}

func (o GetSmDevicesCertsResultOutput) ToGetSmDevicesCertsResultOutput() GetSmDevicesCertsResultOutput {
	return o
}

func (o GetSmDevicesCertsResultOutput) ToGetSmDevicesCertsResultOutputWithContext(ctx context.Context) GetSmDevicesCertsResultOutput {
	return o
}

// deviceId path parameter. Device ID
func (o GetSmDevicesCertsResultOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesCertsResult) string { return v.DeviceId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSmDevicesCertsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesCertsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseSmGetNetworkSmDeviceCerts
func (o GetSmDevicesCertsResultOutput) Items() GetSmDevicesCertsItemArrayOutput {
	return o.ApplyT(func(v GetSmDevicesCertsResult) []GetSmDevicesCertsItem { return v.Items }).(GetSmDevicesCertsItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetSmDevicesCertsResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmDevicesCertsResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSmDevicesCertsResultOutput{})
}
