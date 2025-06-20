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
//			example, err := networks.GetTrafficShapingApplicationCategories(ctx, &networks.GetTrafficShapingApplicationCategoriesArgs{
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksTrafficShapingApplicationCategoriesExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetTrafficShapingApplicationCategories(ctx *pulumi.Context, args *GetTrafficShapingApplicationCategoriesArgs, opts ...pulumi.InvokeOption) (*GetTrafficShapingApplicationCategoriesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTrafficShapingApplicationCategoriesResult
	err := ctx.Invoke("meraki:networks/getTrafficShapingApplicationCategories:getTrafficShapingApplicationCategories", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTrafficShapingApplicationCategories.
type GetTrafficShapingApplicationCategoriesArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getTrafficShapingApplicationCategories.
type GetTrafficShapingApplicationCategoriesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                                     `pulumi:"id"`
	Item GetTrafficShapingApplicationCategoriesItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func GetTrafficShapingApplicationCategoriesOutput(ctx *pulumi.Context, args GetTrafficShapingApplicationCategoriesOutputArgs, opts ...pulumi.InvokeOption) GetTrafficShapingApplicationCategoriesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetTrafficShapingApplicationCategoriesResultOutput, error) {
			args := v.(GetTrafficShapingApplicationCategoriesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getTrafficShapingApplicationCategories:getTrafficShapingApplicationCategories", args, GetTrafficShapingApplicationCategoriesResultOutput{}, options).(GetTrafficShapingApplicationCategoriesResultOutput), nil
		}).(GetTrafficShapingApplicationCategoriesResultOutput)
}

// A collection of arguments for invoking getTrafficShapingApplicationCategories.
type GetTrafficShapingApplicationCategoriesOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (GetTrafficShapingApplicationCategoriesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrafficShapingApplicationCategoriesArgs)(nil)).Elem()
}

// A collection of values returned by getTrafficShapingApplicationCategories.
type GetTrafficShapingApplicationCategoriesResultOutput struct{ *pulumi.OutputState }

func (GetTrafficShapingApplicationCategoriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrafficShapingApplicationCategoriesResult)(nil)).Elem()
}

func (o GetTrafficShapingApplicationCategoriesResultOutput) ToGetTrafficShapingApplicationCategoriesResultOutput() GetTrafficShapingApplicationCategoriesResultOutput {
	return o
}

func (o GetTrafficShapingApplicationCategoriesResultOutput) ToGetTrafficShapingApplicationCategoriesResultOutputWithContext(ctx context.Context) GetTrafficShapingApplicationCategoriesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTrafficShapingApplicationCategoriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTrafficShapingApplicationCategoriesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTrafficShapingApplicationCategoriesResultOutput) Item() GetTrafficShapingApplicationCategoriesItemOutput {
	return o.ApplyT(func(v GetTrafficShapingApplicationCategoriesResult) GetTrafficShapingApplicationCategoriesItem {
		return v.Item
	}).(GetTrafficShapingApplicationCategoriesItemOutput)
}

// networkId path parameter. Network ID
func (o GetTrafficShapingApplicationCategoriesResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTrafficShapingApplicationCategoriesResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTrafficShapingApplicationCategoriesResultOutput{})
}
