// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := organizations.GetWirelessDevicesPacketLossByNetwork(ctx, &organizations.GetWirelessDevicesPacketLossByNetworkArgs{
//				Bands: []string{
//					"string",
//				},
//				EndingBefore: pulumi.StringRef("string"),
//				NetworkIds: []string{
//					"string",
//				},
//				OrganizationId: "string",
//				PerPage:        pulumi.IntRef(1),
//				Serials: []string{
//					"string",
//				},
//				Ssids: []string{
//					"string",
//				},
//				StartingAfter: pulumi.StringRef("string"),
//				T0:            pulumi.StringRef("string"),
//				T1:            pulumi.StringRef("string"),
//				Timespan:      pulumi.Float64Ref(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsWirelessDevicesPacketLossByNetworkExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetWirelessDevicesPacketLossByNetwork(ctx *pulumi.Context, args *GetWirelessDevicesPacketLossByNetworkArgs, opts ...pulumi.InvokeOption) (*GetWirelessDevicesPacketLossByNetworkResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWirelessDevicesPacketLossByNetworkResult
	err := ctx.Invoke("meraki:organizations/getWirelessDevicesPacketLossByNetwork:getWirelessDevicesPacketLossByNetwork", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessDevicesPacketLossByNetwork.
type GetWirelessDevicesPacketLossByNetworkArgs struct {
	// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
	Bands []string `pulumi:"bands"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// networkIds query parameter. Filter results by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// serials query parameter. Filter results by device.
	Serials []string `pulumi:"serials"`
	// ssids query parameter. Filter results by SSID number.
	Ssids []string `pulumi:"ssids"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
	Timespan *float64 `pulumi:"timespan"`
}

// A collection of values returned by getWirelessDevicesPacketLossByNetwork.
type GetWirelessDevicesPacketLossByNetworkResult struct {
	// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
	Bands []string `pulumi:"bands"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseWirelessGetOrganizationWirelessDevicesPacketLossByNetwork
	Items []GetWirelessDevicesPacketLossByNetworkItem `pulumi:"items"`
	// networkIds query parameter. Filter results by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// serials query parameter. Filter results by device.
	Serials []string `pulumi:"serials"`
	// ssids query parameter. Filter results by SSID number.
	Ssids []string `pulumi:"ssids"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
	Timespan *float64 `pulumi:"timespan"`
}

func GetWirelessDevicesPacketLossByNetworkOutput(ctx *pulumi.Context, args GetWirelessDevicesPacketLossByNetworkOutputArgs, opts ...pulumi.InvokeOption) GetWirelessDevicesPacketLossByNetworkResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetWirelessDevicesPacketLossByNetworkResultOutput, error) {
			args := v.(GetWirelessDevicesPacketLossByNetworkArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:organizations/getWirelessDevicesPacketLossByNetwork:getWirelessDevicesPacketLossByNetwork", args, GetWirelessDevicesPacketLossByNetworkResultOutput{}, options).(GetWirelessDevicesPacketLossByNetworkResultOutput), nil
		}).(GetWirelessDevicesPacketLossByNetworkResultOutput)
}

// A collection of arguments for invoking getWirelessDevicesPacketLossByNetwork.
type GetWirelessDevicesPacketLossByNetworkOutputArgs struct {
	// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
	Bands pulumi.StringArrayInput `pulumi:"bands"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// networkIds query parameter. Filter results by network.
	NetworkIds pulumi.StringArrayInput `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// serials query parameter. Filter results by device.
	Serials pulumi.StringArrayInput `pulumi:"serials"`
	// ssids query parameter. Filter results by SSID number.
	Ssids pulumi.StringArrayInput `pulumi:"ssids"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
}

func (GetWirelessDevicesPacketLossByNetworkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessDevicesPacketLossByNetworkArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessDevicesPacketLossByNetwork.
type GetWirelessDevicesPacketLossByNetworkResultOutput struct{ *pulumi.OutputState }

func (GetWirelessDevicesPacketLossByNetworkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWirelessDevicesPacketLossByNetworkResult)(nil)).Elem()
}

func (o GetWirelessDevicesPacketLossByNetworkResultOutput) ToGetWirelessDevicesPacketLossByNetworkResultOutput() GetWirelessDevicesPacketLossByNetworkResultOutput {
	return o
}

func (o GetWirelessDevicesPacketLossByNetworkResultOutput) ToGetWirelessDevicesPacketLossByNetworkResultOutputWithContext(ctx context.Context) GetWirelessDevicesPacketLossByNetworkResultOutput {
	return o
}

// bands query parameter. Filter results by band. Valid bands are: 2.4, 5, and 6.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) Bands() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) []string { return v.Bands }).(pulumi.StringArrayOutput)
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseWirelessGetOrganizationWirelessDevicesPacketLossByNetwork
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) Items() GetWirelessDevicesPacketLossByNetworkItemArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) []GetWirelessDevicesPacketLossByNetworkItem {
		return v.Items
	}).(GetWirelessDevicesPacketLossByNetworkItemArrayOutput)
}

// networkIds query parameter. Filter results by network.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) NetworkIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) []string { return v.NetworkIds }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// serials query parameter. Filter results by device.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) Serials() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) []string { return v.Serials }).(pulumi.StringArrayOutput)
}

// ssids query parameter. Filter results by SSID number.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) Ssids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) []string { return v.Ssids }).(pulumi.StringArrayOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 90 days from today.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 90 days after t0.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be greater than or equal to 5 minutes and be less than or equal to 90 days. The default is 7 days.
func (o GetWirelessDevicesPacketLossByNetworkResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetWirelessDevicesPacketLossByNetworkResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWirelessDevicesPacketLossByNetworkResultOutput{})
}
