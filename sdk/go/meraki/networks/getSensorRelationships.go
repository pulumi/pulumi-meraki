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
//			example, err := networks.GetSensorRelationships(ctx, &networks.GetSensorRelationshipsArgs{
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSensorRelationshipsExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSensorRelationships(ctx *pulumi.Context, args *GetSensorRelationshipsArgs, opts ...pulumi.InvokeOption) (*GetSensorRelationshipsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSensorRelationshipsResult
	err := ctx.Invoke("meraki:networks/getSensorRelationships:getSensorRelationships", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSensorRelationships.
type GetSensorRelationshipsArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getSensorRelationships.
type GetSensorRelationshipsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseSensorGetNetworkSensorRelationships
	Items []GetSensorRelationshipsItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func GetSensorRelationshipsOutput(ctx *pulumi.Context, args GetSensorRelationshipsOutputArgs, opts ...pulumi.InvokeOption) GetSensorRelationshipsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSensorRelationshipsResultOutput, error) {
			args := v.(GetSensorRelationshipsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getSensorRelationships:getSensorRelationships", args, GetSensorRelationshipsResultOutput{}, options).(GetSensorRelationshipsResultOutput), nil
		}).(GetSensorRelationshipsResultOutput)
}

// A collection of arguments for invoking getSensorRelationships.
type GetSensorRelationshipsOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (GetSensorRelationshipsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSensorRelationshipsArgs)(nil)).Elem()
}

// A collection of values returned by getSensorRelationships.
type GetSensorRelationshipsResultOutput struct{ *pulumi.OutputState }

func (GetSensorRelationshipsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSensorRelationshipsResult)(nil)).Elem()
}

func (o GetSensorRelationshipsResultOutput) ToGetSensorRelationshipsResultOutput() GetSensorRelationshipsResultOutput {
	return o
}

func (o GetSensorRelationshipsResultOutput) ToGetSensorRelationshipsResultOutputWithContext(ctx context.Context) GetSensorRelationshipsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSensorRelationshipsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSensorRelationshipsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseSensorGetNetworkSensorRelationships
func (o GetSensorRelationshipsResultOutput) Items() GetSensorRelationshipsItemArrayOutput {
	return o.ApplyT(func(v GetSensorRelationshipsResult) []GetSensorRelationshipsItem { return v.Items }).(GetSensorRelationshipsItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetSensorRelationshipsResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSensorRelationshipsResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSensorRelationshipsResultOutput{})
}
