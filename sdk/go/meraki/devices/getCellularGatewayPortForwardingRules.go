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
//			example, err := devices.LookupCellularGatewayPortForwardingRules(ctx, &devices.LookupCellularGatewayPortForwardingRulesArgs{
//				Serial: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesCellularGatewayPortForwardingRulesExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupCellularGatewayPortForwardingRules(ctx *pulumi.Context, args *LookupCellularGatewayPortForwardingRulesArgs, opts ...pulumi.InvokeOption) (*LookupCellularGatewayPortForwardingRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCellularGatewayPortForwardingRulesResult
	err := ctx.Invoke("meraki:devices/getCellularGatewayPortForwardingRules:getCellularGatewayPortForwardingRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCellularGatewayPortForwardingRules.
type LookupCellularGatewayPortForwardingRulesArgs struct {
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// A collection of values returned by getCellularGatewayPortForwardingRules.
type LookupCellularGatewayPortForwardingRulesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                                    `pulumi:"id"`
	Item GetCellularGatewayPortForwardingRulesItem `pulumi:"item"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

func LookupCellularGatewayPortForwardingRulesOutput(ctx *pulumi.Context, args LookupCellularGatewayPortForwardingRulesOutputArgs, opts ...pulumi.InvokeOption) LookupCellularGatewayPortForwardingRulesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupCellularGatewayPortForwardingRulesResultOutput, error) {
			args := v.(LookupCellularGatewayPortForwardingRulesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:devices/getCellularGatewayPortForwardingRules:getCellularGatewayPortForwardingRules", args, LookupCellularGatewayPortForwardingRulesResultOutput{}, options).(LookupCellularGatewayPortForwardingRulesResultOutput), nil
		}).(LookupCellularGatewayPortForwardingRulesResultOutput)
}

// A collection of arguments for invoking getCellularGatewayPortForwardingRules.
type LookupCellularGatewayPortForwardingRulesOutputArgs struct {
	// serial path parameter.
	Serial pulumi.StringInput `pulumi:"serial"`
}

func (LookupCellularGatewayPortForwardingRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCellularGatewayPortForwardingRulesArgs)(nil)).Elem()
}

// A collection of values returned by getCellularGatewayPortForwardingRules.
type LookupCellularGatewayPortForwardingRulesResultOutput struct{ *pulumi.OutputState }

func (LookupCellularGatewayPortForwardingRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCellularGatewayPortForwardingRulesResult)(nil)).Elem()
}

func (o LookupCellularGatewayPortForwardingRulesResultOutput) ToLookupCellularGatewayPortForwardingRulesResultOutput() LookupCellularGatewayPortForwardingRulesResultOutput {
	return o
}

func (o LookupCellularGatewayPortForwardingRulesResultOutput) ToLookupCellularGatewayPortForwardingRulesResultOutputWithContext(ctx context.Context) LookupCellularGatewayPortForwardingRulesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCellularGatewayPortForwardingRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularGatewayPortForwardingRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCellularGatewayPortForwardingRulesResultOutput) Item() GetCellularGatewayPortForwardingRulesItemOutput {
	return o.ApplyT(func(v LookupCellularGatewayPortForwardingRulesResult) GetCellularGatewayPortForwardingRulesItem {
		return v.Item
	}).(GetCellularGatewayPortForwardingRulesItemOutput)
}

// serial path parameter.
func (o LookupCellularGatewayPortForwardingRulesResultOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCellularGatewayPortForwardingRulesResult) string { return v.Serial }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCellularGatewayPortForwardingRulesResultOutput{})
}
