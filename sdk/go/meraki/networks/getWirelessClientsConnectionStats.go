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
//			example, err := networks.GetWirelessClientsConnectionStats(ctx, &networks.GetWirelessClientsConnectionStatsArgs{
//				ApTag:     pulumi.StringRef("string"),
//				Band:      pulumi.StringRef("string"),
//				ClientId:  "string",
//				NetworkId: "string",
//				Ssid:      pulumi.IntRef(1),
//				T0:        pulumi.StringRef("string"),
//				T1:        pulumi.StringRef("string"),
//				Timespan:  pulumi.Float64Ref(1),
//				Vlan:      pulumi.IntRef(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksWirelessClientsConnectionStatsExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetWirelessClientsConnectionStats(ctx *pulumi.Context, args *GetWirelessClientsConnectionStatsArgs, opts ...pulumi.InvokeOption) (*GetWirelessClientsConnectionStatsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWirelessClientsConnectionStatsResult
	err := ctx.Invoke("meraki:networks/getWirelessClientsConnectionStats:getWirelessClientsConnectionStats", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessClientsConnectionStats.
type GetWirelessClientsConnectionStatsArgs struct {
	// apTag query parameter. Filter results by AP Tag
	ApTag *string `pulumi:"apTag"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
	Band *string `pulumi:"band"`
	// clientId path parameter. Client ID
	ClientId string `pulumi:"clientId"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
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

// A collection of values returned by getWirelessClientsConnectionStats.
type GetWirelessClientsConnectionStatsResult struct {
	// apTag query parameter. Filter results by AP Tag
	ApTag *string `pulumi:"apTag"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
	Band *string `pulumi:"band"`
	// clientId path parameter. Client ID
	ClientId string `pulumi:"clientId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string                                `pulumi:"id"`
	Item GetWirelessClientsConnectionStatsItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
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

func GetWirelessClientsConnectionStatsOutput(ctx *pulumi.Context, args GetWirelessClientsConnectionStatsOutputArgs, opts ...pulumi.InvokeOption) GetWirelessClientsConnectionStatsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetWirelessClientsConnectionStatsResultOutput, error) {
			args := v.(GetWirelessClientsConnectionStatsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getWirelessClientsConnectionStats:getWirelessClientsConnectionStats", args, GetWirelessClientsConnectionStatsResultOutput{}, options).(GetWirelessClientsConnectionStatsResultOutput), nil
		}).(GetWirelessClientsConnectionStatsResultOutput)
}

// A collection of arguments for invoking getWirelessClientsConnectionStats.
type GetWirelessClientsConnectionStatsOutputArgs struct {
	// apTag query parameter. Filter results by AP Tag
	ApTag pulumi.StringPtrInput `pulumi:"apTag"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
	Band pulumi.StringPtrInput `pulumi:"band"`
	// clientId path parameter. Client ID
	ClientId pulumi.StringInput `pulumi:"clientId"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
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

func (GetWirelessClientsConnectionStatsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessClientsConnectionStatsArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessClientsConnectionStats.
type GetWirelessClientsConnectionStatsResultOutput struct{ *pulumi.OutputState }

func (GetWirelessClientsConnectionStatsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessClientsConnectionStatsResult)(nil)).Elem()
}

func (o GetWirelessClientsConnectionStatsResultOutput) ToGetWirelessClientsConnectionStatsResultOutput() GetWirelessClientsConnectionStatsResultOutput {
	return o
}

func (o GetWirelessClientsConnectionStatsResultOutput) ToGetWirelessClientsConnectionStatsResultOutputWithContext(ctx context.Context) GetWirelessClientsConnectionStatsResultOutput {
	return o
}

// apTag query parameter. Filter results by AP Tag
func (o GetWirelessClientsConnectionStatsResultOutput) ApTag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) *string { return v.ApTag }).(pulumi.StringPtrOutput)
}

// band query parameter. Filter results by band (either '2.4', '5' or '6'). Note that data prior to February 2020 will not have band information.
func (o GetWirelessClientsConnectionStatsResultOutput) Band() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) *string { return v.Band }).(pulumi.StringPtrOutput)
}

// clientId path parameter. Client ID
func (o GetWirelessClientsConnectionStatsResultOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) string { return v.ClientId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWirelessClientsConnectionStatsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetWirelessClientsConnectionStatsResultOutput) Item() GetWirelessClientsConnectionStatsItemOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) GetWirelessClientsConnectionStatsItem { return v.Item }).(GetWirelessClientsConnectionStatsItemOutput)
}

// networkId path parameter. Network ID
func (o GetWirelessClientsConnectionStatsResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// ssid query parameter. Filter results by SSID
func (o GetWirelessClientsConnectionStatsResultOutput) Ssid() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) *int { return v.Ssid }).(pulumi.IntPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 180 days from today.
func (o GetWirelessClientsConnectionStatsResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
func (o GetWirelessClientsConnectionStatsResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days.
func (o GetWirelessClientsConnectionStatsResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

// vlan query parameter. Filter results by VLAN
func (o GetWirelessClientsConnectionStatsResultOutput) Vlan() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessClientsConnectionStatsResult) *int { return v.Vlan }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWirelessClientsConnectionStatsResultOutput{})
}
