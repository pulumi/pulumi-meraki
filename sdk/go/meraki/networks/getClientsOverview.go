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
//			example, err := networks.GetClientsOverview(ctx, &networks.GetClientsOverviewArgs{
//				NetworkId:  "string",
//				Resolution: pulumi.IntRef(1),
//				T0:         pulumi.StringRef("string"),
//				T1:         pulumi.StringRef("string"),
//				Timespan:   pulumi.Float64Ref(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksClientsOverviewExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetClientsOverview(ctx *pulumi.Context, args *GetClientsOverviewArgs, opts ...pulumi.InvokeOption) (*GetClientsOverviewResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetClientsOverviewResult
	err := ctx.Invoke("meraki:networks/getClientsOverview:getClientsOverview", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClientsOverview.
type GetClientsOverviewArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 7200, 86400, 604800, 2592000. The default is 604800.
	Resolution *int `pulumi:"resolution"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
	Timespan *float64 `pulumi:"timespan"`
}

// A collection of values returned by getClientsOverview.
type GetClientsOverviewResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                 `pulumi:"id"`
	Item GetClientsOverviewItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 7200, 86400, 604800, 2592000. The default is 604800.
	Resolution *int `pulumi:"resolution"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
	Timespan *float64 `pulumi:"timespan"`
}

func GetClientsOverviewOutput(ctx *pulumi.Context, args GetClientsOverviewOutputArgs, opts ...pulumi.InvokeOption) GetClientsOverviewResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetClientsOverviewResultOutput, error) {
			args := v.(GetClientsOverviewArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getClientsOverview:getClientsOverview", args, GetClientsOverviewResultOutput{}, options).(GetClientsOverviewResultOutput), nil
		}).(GetClientsOverviewResultOutput)
}

// A collection of arguments for invoking getClientsOverview.
type GetClientsOverviewOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 7200, 86400, 604800, 2592000. The default is 604800.
	Resolution pulumi.IntPtrInput `pulumi:"resolution"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
}

func (GetClientsOverviewOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClientsOverviewArgs)(nil)).Elem()
}

// A collection of values returned by getClientsOverview.
type GetClientsOverviewResultOutput struct{ *pulumi.OutputState }

func (GetClientsOverviewResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClientsOverviewResult)(nil)).Elem()
}

func (o GetClientsOverviewResultOutput) ToGetClientsOverviewResultOutput() GetClientsOverviewResultOutput {
	return o
}

func (o GetClientsOverviewResultOutput) ToGetClientsOverviewResultOutputWithContext(ctx context.Context) GetClientsOverviewResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetClientsOverviewResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetClientsOverviewResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetClientsOverviewResultOutput) Item() GetClientsOverviewItemOutput {
	return o.ApplyT(func(v GetClientsOverviewResult) GetClientsOverviewItem { return v.Item }).(GetClientsOverviewItemOutput)
}

// networkId path parameter. Network ID
func (o GetClientsOverviewResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetClientsOverviewResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 7200, 86400, 604800, 2592000. The default is 604800.
func (o GetClientsOverviewResultOutput) Resolution() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetClientsOverviewResult) *int { return v.Resolution }).(pulumi.IntPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
func (o GetClientsOverviewResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClientsOverviewResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
func (o GetClientsOverviewResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClientsOverviewResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 1 day.
func (o GetClientsOverviewResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetClientsOverviewResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetClientsOverviewResultOutput{})
}
