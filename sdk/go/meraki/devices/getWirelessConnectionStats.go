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
//			example, err := devices.GetWirelessConnectionStats(ctx, &devices.GetWirelessConnectionStatsArgs{
//				ApTag:    pulumi.StringRef("string"),
//				Band:     pulumi.StringRef("string"),
//				Serial:   "string",
//				Ssid:     pulumi.IntRef(1),
//				T0:       pulumi.StringRef("string"),
//				T1:       pulumi.StringRef("string"),
//				Timespan: pulumi.Float64Ref(1),
//				Vlan:     pulumi.IntRef(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesWirelessConnectionStatsExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetWirelessConnectionStats(ctx *pulumi.Context, args *GetWirelessConnectionStatsArgs, opts ...pulumi.InvokeOption) (*GetWirelessConnectionStatsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWirelessConnectionStatsResult
	err := ctx.Invoke("meraki:devices/getWirelessConnectionStats:getWirelessConnectionStats", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessConnectionStats.
type GetWirelessConnectionStatsArgs struct {
	// apTag query parameter. Filter results by AP Tag
	ApTag *string `pulumi:"apTag"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
	Band *string `pulumi:"band"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
	// ssid query parameter. Filter results by SSID
	Ssid *int `pulumi:"ssid"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
	Timespan *float64 `pulumi:"timespan"`
	// vlan query parameter. Filter results by VLAN
	Vlan *int `pulumi:"vlan"`
}

// A collection of values returned by getWirelessConnectionStats.
type GetWirelessConnectionStatsResult struct {
	// apTag query parameter. Filter results by AP Tag
	ApTag *string `pulumi:"apTag"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
	Band *string `pulumi:"band"`
	// The provider-assigned unique ID for this managed resource.
	Id   string                         `pulumi:"id"`
	Item GetWirelessConnectionStatsItem `pulumi:"item"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
	// ssid query parameter. Filter results by SSID
	Ssid *int `pulumi:"ssid"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
	Timespan *float64 `pulumi:"timespan"`
	// vlan query parameter. Filter results by VLAN
	Vlan *int `pulumi:"vlan"`
}

func GetWirelessConnectionStatsOutput(ctx *pulumi.Context, args GetWirelessConnectionStatsOutputArgs, opts ...pulumi.InvokeOption) GetWirelessConnectionStatsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetWirelessConnectionStatsResultOutput, error) {
			args := v.(GetWirelessConnectionStatsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:devices/getWirelessConnectionStats:getWirelessConnectionStats", args, GetWirelessConnectionStatsResultOutput{}, options).(GetWirelessConnectionStatsResultOutput), nil
		}).(GetWirelessConnectionStatsResultOutput)
}

// A collection of arguments for invoking getWirelessConnectionStats.
type GetWirelessConnectionStatsOutputArgs struct {
	// apTag query parameter. Filter results by AP Tag
	ApTag pulumi.StringPtrInput `pulumi:"apTag"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
	Band pulumi.StringPtrInput `pulumi:"band"`
	// serial path parameter.
	Serial pulumi.StringInput `pulumi:"serial"`
	// ssid query parameter. Filter results by SSID
	Ssid pulumi.IntPtrInput `pulumi:"ssid"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
	// vlan query parameter. Filter results by VLAN
	Vlan pulumi.IntPtrInput `pulumi:"vlan"`
}

func (GetWirelessConnectionStatsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessConnectionStatsArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessConnectionStats.
type GetWirelessConnectionStatsResultOutput struct{ *pulumi.OutputState }

func (GetWirelessConnectionStatsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessConnectionStatsResult)(nil)).Elem()
}

func (o GetWirelessConnectionStatsResultOutput) ToGetWirelessConnectionStatsResultOutput() GetWirelessConnectionStatsResultOutput {
	return o
}

func (o GetWirelessConnectionStatsResultOutput) ToGetWirelessConnectionStatsResultOutputWithContext(ctx context.Context) GetWirelessConnectionStatsResultOutput {
	return o
}

// apTag query parameter. Filter results by AP Tag
func (o GetWirelessConnectionStatsResultOutput) ApTag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessConnectionStatsResult) *string { return v.ApTag }).(pulumi.StringPtrOutput)
}

// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
func (o GetWirelessConnectionStatsResultOutput) Band() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessConnectionStatsResult) *string { return v.Band }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWirelessConnectionStatsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessConnectionStatsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetWirelessConnectionStatsResultOutput) Item() GetWirelessConnectionStatsItemOutput {
	return o.ApplyT(func(v GetWirelessConnectionStatsResult) GetWirelessConnectionStatsItem { return v.Item }).(GetWirelessConnectionStatsItemOutput)
}

// serial path parameter.
func (o GetWirelessConnectionStatsResultOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessConnectionStatsResult) string { return v.Serial }).(pulumi.StringOutput)
}

// ssid query parameter. Filter results by SSID
func (o GetWirelessConnectionStatsResultOutput) Ssid() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessConnectionStatsResult) *int { return v.Ssid }).(pulumi.IntPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
func (o GetWirelessConnectionStatsResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessConnectionStatsResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
func (o GetWirelessConnectionStatsResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessConnectionStatsResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
func (o GetWirelessConnectionStatsResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetWirelessConnectionStatsResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

// vlan query parameter. Filter results by VLAN
func (o GetWirelessConnectionStatsResultOutput) Vlan() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessConnectionStatsResult) *int { return v.Vlan }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWirelessConnectionStatsResultOutput{})
}
