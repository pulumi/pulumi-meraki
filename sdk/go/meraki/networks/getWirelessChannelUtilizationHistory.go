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
//			example, err := networks.GetWirelessChannelUtilizationHistory(ctx, &networks.GetWirelessChannelUtilizationHistoryArgs{
//				ApTag:          pulumi.StringRef("string"),
//				AutoResolution: pulumi.BoolRef(false),
//				Band:           pulumi.StringRef("string"),
//				ClientId:       pulumi.StringRef("string"),
//				DeviceSerial:   pulumi.StringRef("string"),
//				NetworkId:      "string",
//				Resolution:     pulumi.IntRef(1),
//				T0:             pulumi.StringRef("string"),
//				T1:             pulumi.StringRef("string"),
//				Timespan:       pulumi.Float64Ref(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksWirelessChannelUtilizationHistoryExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetWirelessChannelUtilizationHistory(ctx *pulumi.Context, args *GetWirelessChannelUtilizationHistoryArgs, opts ...pulumi.InvokeOption) (*GetWirelessChannelUtilizationHistoryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWirelessChannelUtilizationHistoryResult
	err := ctx.Invoke("meraki:networks/getWirelessChannelUtilizationHistory:getWirelessChannelUtilizationHistory", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessChannelUtilizationHistory.
type GetWirelessChannelUtilizationHistoryArgs struct {
	// apTag query parameter. Filter results by AP tag to return AP channel utilization metrics for devices labeled with the given tag; either :clientId or :deviceSerial must be jointly specified.
	ApTag *string `pulumi:"apTag"`
	// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
	AutoResolution *bool `pulumi:"autoResolution"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6').
	Band *string `pulumi:"band"`
	// clientId query parameter. Filter results by network client to return per-device, per-band AP channel utilization metrics inner joined by the queried client's connection history.
	ClientId *string `pulumi:"clientId"`
	// deviceSerial query parameter. Filter results by device to return AP channel utilization metrics for the queried device; either :band or :clientId must be jointly specified.
	DeviceSerial *string `pulumi:"deviceSerial"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 600, 1200, 3600, 14400, 86400. The default is 86400.
	Resolution *int `pulumi:"resolution"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
	Timespan *float64 `pulumi:"timespan"`
}

// A collection of values returned by getWirelessChannelUtilizationHistory.
type GetWirelessChannelUtilizationHistoryResult struct {
	// apTag query parameter. Filter results by AP tag to return AP channel utilization metrics for devices labeled with the given tag; either :clientId or :deviceSerial must be jointly specified.
	ApTag *string `pulumi:"apTag"`
	// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
	AutoResolution *bool `pulumi:"autoResolution"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6').
	Band *string `pulumi:"band"`
	// clientId query parameter. Filter results by network client to return per-device, per-band AP channel utilization metrics inner joined by the queried client's connection history.
	ClientId *string `pulumi:"clientId"`
	// deviceSerial query parameter. Filter results by device to return AP channel utilization metrics for the queried device; either :band or :clientId must be jointly specified.
	DeviceSerial *string `pulumi:"deviceSerial"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseWirelessGetNetworkWirelessChannelUtilizationHistory
	Items []GetWirelessChannelUtilizationHistoryItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 600, 1200, 3600, 14400, 86400. The default is 86400.
	Resolution *int `pulumi:"resolution"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
	Timespan *float64 `pulumi:"timespan"`
}

func GetWirelessChannelUtilizationHistoryOutput(ctx *pulumi.Context, args GetWirelessChannelUtilizationHistoryOutputArgs, opts ...pulumi.InvokeOption) GetWirelessChannelUtilizationHistoryResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetWirelessChannelUtilizationHistoryResultOutput, error) {
			args := v.(GetWirelessChannelUtilizationHistoryArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getWirelessChannelUtilizationHistory:getWirelessChannelUtilizationHistory", args, GetWirelessChannelUtilizationHistoryResultOutput{}, options).(GetWirelessChannelUtilizationHistoryResultOutput), nil
		}).(GetWirelessChannelUtilizationHistoryResultOutput)
}

// A collection of arguments for invoking getWirelessChannelUtilizationHistory.
type GetWirelessChannelUtilizationHistoryOutputArgs struct {
	// apTag query parameter. Filter results by AP tag to return AP channel utilization metrics for devices labeled with the given tag; either :clientId or :deviceSerial must be jointly specified.
	ApTag pulumi.StringPtrInput `pulumi:"apTag"`
	// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
	AutoResolution pulumi.BoolPtrInput `pulumi:"autoResolution"`
	// band query parameter. Filter results by band (either '2.4', '5' or '6').
	Band pulumi.StringPtrInput `pulumi:"band"`
	// clientId query parameter. Filter results by network client to return per-device, per-band AP channel utilization metrics inner joined by the queried client's connection history.
	ClientId pulumi.StringPtrInput `pulumi:"clientId"`
	// deviceSerial query parameter. Filter results by device to return AP channel utilization metrics for the queried device; either :band or :clientId must be jointly specified.
	DeviceSerial pulumi.StringPtrInput `pulumi:"deviceSerial"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 600, 1200, 3600, 14400, 86400. The default is 86400.
	Resolution pulumi.IntPtrInput `pulumi:"resolution"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
}

func (GetWirelessChannelUtilizationHistoryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessChannelUtilizationHistoryArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessChannelUtilizationHistory.
type GetWirelessChannelUtilizationHistoryResultOutput struct{ *pulumi.OutputState }

func (GetWirelessChannelUtilizationHistoryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessChannelUtilizationHistoryResult)(nil)).Elem()
}

func (o GetWirelessChannelUtilizationHistoryResultOutput) ToGetWirelessChannelUtilizationHistoryResultOutput() GetWirelessChannelUtilizationHistoryResultOutput {
	return o
}

func (o GetWirelessChannelUtilizationHistoryResultOutput) ToGetWirelessChannelUtilizationHistoryResultOutputWithContext(ctx context.Context) GetWirelessChannelUtilizationHistoryResultOutput {
	return o
}

// apTag query parameter. Filter results by AP tag to return AP channel utilization metrics for devices labeled with the given tag; either :clientId or :deviceSerial must be jointly specified.
func (o GetWirelessChannelUtilizationHistoryResultOutput) ApTag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) *string { return v.ApTag }).(pulumi.StringPtrOutput)
}

// autoResolution query parameter. Automatically select a data resolution based on the given timespan; this overrides the value specified by the 'resolution' parameter. The default setting is false.
func (o GetWirelessChannelUtilizationHistoryResultOutput) AutoResolution() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) *bool { return v.AutoResolution }).(pulumi.BoolPtrOutput)
}

// band query parameter. Filter results by band (either '2.4', '5' or '6').
func (o GetWirelessChannelUtilizationHistoryResultOutput) Band() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) *string { return v.Band }).(pulumi.StringPtrOutput)
}

// clientId query parameter. Filter results by network client to return per-device, per-band AP channel utilization metrics inner joined by the queried client's connection history.
func (o GetWirelessChannelUtilizationHistoryResultOutput) ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) *string { return v.ClientId }).(pulumi.StringPtrOutput)
}

// deviceSerial query parameter. Filter results by device to return AP channel utilization metrics for the queried device; either :band or :clientId must be jointly specified.
func (o GetWirelessChannelUtilizationHistoryResultOutput) DeviceSerial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) *string { return v.DeviceSerial }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWirelessChannelUtilizationHistoryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseWirelessGetNetworkWirelessChannelUtilizationHistory
func (o GetWirelessChannelUtilizationHistoryResultOutput) Items() GetWirelessChannelUtilizationHistoryItemArrayOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) []GetWirelessChannelUtilizationHistoryItem {
		return v.Items
	}).(GetWirelessChannelUtilizationHistoryItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetWirelessChannelUtilizationHistoryResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// resolution query parameter. The time resolution in seconds for returned data. The valid resolutions are: 600, 1200, 3600, 14400, 86400. The default is 86400.
func (o GetWirelessChannelUtilizationHistoryResultOutput) Resolution() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) *int { return v.Resolution }).(pulumi.IntPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
func (o GetWirelessChannelUtilizationHistoryResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
func (o GetWirelessChannelUtilizationHistoryResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 7 days.
func (o GetWirelessChannelUtilizationHistoryResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetWirelessChannelUtilizationHistoryResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWirelessChannelUtilizationHistoryResultOutput{})
}
