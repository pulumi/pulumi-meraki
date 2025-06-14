// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devices

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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/devices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := devices.LookupCellularGatewayLan(ctx, &devices.LookupCellularGatewayLanArgs{
//				Serial: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesCellularGatewayLanExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupCellularGatewayLan(ctx *pulumi.Context, args *LookupCellularGatewayLanArgs, opts ...pulumi.InvokeOption) (*LookupCellularGatewayLanResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCellularGatewayLanResult
	err := ctx.Invoke("meraki:devices/getCellularGatewayLan:getCellularGatewayLan", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCellularGatewayLan.
type LookupCellularGatewayLanArgs struct {
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// A collection of values returned by getCellularGatewayLan.
type LookupCellularGatewayLanResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                    `pulumi:"id"`
	Item GetCellularGatewayLanItem `pulumi:"item"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

func LookupCellularGatewayLanOutput(ctx *pulumi.Context, args LookupCellularGatewayLanOutputArgs, opts ...pulumi.InvokeOption) LookupCellularGatewayLanResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupCellularGatewayLanResultOutput, error) {
			args := v.(LookupCellularGatewayLanArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:devices/getCellularGatewayLan:getCellularGatewayLan", args, LookupCellularGatewayLanResultOutput{}, options).(LookupCellularGatewayLanResultOutput), nil
		}).(LookupCellularGatewayLanResultOutput)
}

// A collection of arguments for invoking getCellularGatewayLan.
type LookupCellularGatewayLanOutputArgs struct {
	// serial path parameter.
	Serial pulumi.StringInput `pulumi:"serial"`
}

func (LookupCellularGatewayLanOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCellularGatewayLanArgs)(nil)).Elem()
}

// A collection of values returned by getCellularGatewayLan.
type LookupCellularGatewayLanResultOutput struct{ *pulumi.OutputState }

func (LookupCellularGatewayLanResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCellularGatewayLanResult)(nil)).Elem()
}

func (o LookupCellularGatewayLanResultOutput) ToLookupCellularGatewayLanResultOutput() LookupCellularGatewayLanResultOutput {
	return o
}

func (o LookupCellularGatewayLanResultOutput) ToLookupCellularGatewayLanResultOutputWithContext(ctx context.Context) LookupCellularGatewayLanResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCellularGatewayLanResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularGatewayLanResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCellularGatewayLanResultOutput) Item() GetCellularGatewayLanItemOutput {
	return o.ApplyT(func(v LookupCellularGatewayLanResult) GetCellularGatewayLanItem { return v.Item }).(GetCellularGatewayLanItemOutput)
}

// serial path parameter.
func (o LookupCellularGatewayLanResultOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularGatewayLanResult) string { return v.Serial }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCellularGatewayLanResultOutput{})
}
