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
//			example, err := networks.LookupSwitchMtu(ctx, &networks.LookupSwitchMtuArgs{
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSwitchMtuExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupSwitchMtu(ctx *pulumi.Context, args *LookupSwitchMtuArgs, opts ...pulumi.InvokeOption) (*LookupSwitchMtuResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSwitchMtuResult
	err := ctx.Invoke("meraki:networks/getSwitchMtu:getSwitchMtu", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSwitchMtu.
type LookupSwitchMtuArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getSwitchMtu.
type LookupSwitchMtuResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string           `pulumi:"id"`
	Item GetSwitchMtuItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func LookupSwitchMtuOutput(ctx *pulumi.Context, args LookupSwitchMtuOutputArgs, opts ...pulumi.InvokeOption) LookupSwitchMtuResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSwitchMtuResultOutput, error) {
			args := v.(LookupSwitchMtuArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getSwitchMtu:getSwitchMtu", args, LookupSwitchMtuResultOutput{}, options).(LookupSwitchMtuResultOutput), nil
		}).(LookupSwitchMtuResultOutput)
}

// A collection of arguments for invoking getSwitchMtu.
type LookupSwitchMtuOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (LookupSwitchMtuOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchMtuArgs)(nil)).Elem()
}

// A collection of values returned by getSwitchMtu.
type LookupSwitchMtuResultOutput struct{ *pulumi.OutputState }

func (LookupSwitchMtuResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchMtuResult)(nil)).Elem()
}

func (o LookupSwitchMtuResultOutput) ToLookupSwitchMtuResultOutput() LookupSwitchMtuResultOutput {
	return o
}

func (o LookupSwitchMtuResultOutput) ToLookupSwitchMtuResultOutputWithContext(ctx context.Context) LookupSwitchMtuResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSwitchMtuResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSwitchMtuResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSwitchMtuResultOutput) Item() GetSwitchMtuItemOutput {
	return o.ApplyT(func(v LookupSwitchMtuResult) GetSwitchMtuItem { return v.Item }).(GetSwitchMtuItemOutput)
}

// networkId path parameter. Network ID
func (o LookupSwitchMtuResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSwitchMtuResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSwitchMtuResultOutput{})
}
