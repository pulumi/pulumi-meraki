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
//			example, err := networks.LookupNetflow(ctx, &networks.LookupNetflowArgs{
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksNetflowExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupNetflow(ctx *pulumi.Context, args *LookupNetflowArgs, opts ...pulumi.InvokeOption) (*LookupNetflowResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetflowResult
	err := ctx.Invoke("meraki:networks/getNetflow:getNetflow", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetflow.
type LookupNetflowArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getNetflow.
type LookupNetflowResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string         `pulumi:"id"`
	Item GetNetflowItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func LookupNetflowOutput(ctx *pulumi.Context, args LookupNetflowOutputArgs, opts ...pulumi.InvokeOption) LookupNetflowResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupNetflowResultOutput, error) {
			args := v.(LookupNetflowArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getNetflow:getNetflow", args, LookupNetflowResultOutput{}, options).(LookupNetflowResultOutput), nil
		}).(LookupNetflowResultOutput)
}

// A collection of arguments for invoking getNetflow.
type LookupNetflowOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (LookupNetflowOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetflowArgs)(nil)).Elem()
}

// A collection of values returned by getNetflow.
type LookupNetflowResultOutput struct{ *pulumi.OutputState }

func (LookupNetflowResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetflowResult)(nil)).Elem()
}

func (o LookupNetflowResultOutput) ToLookupNetflowResultOutput() LookupNetflowResultOutput {
	return o
}

func (o LookupNetflowResultOutput) ToLookupNetflowResultOutputWithContext(ctx context.Context) LookupNetflowResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetflowResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetflowResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupNetflowResultOutput) Item() GetNetflowItemOutput {
	return o.ApplyT(func(v LookupNetflowResult) GetNetflowItem { return v.Item }).(GetNetflowItemOutput)
}

// networkId path parameter. Network ID
func (o LookupNetflowResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetflowResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetflowResultOutput{})
}
