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
//			example, err := organizations.GetSensorReadingsHistory(ctx, &organizations.GetSensorReadingsHistoryArgs{
//				EndingBefore: pulumi.StringRef("string"),
//				Metrics: []string{
//					"string",
//				},
//				NetworkIds: []string{
//					"string",
//				},
//				OrganizationId: "string",
//				PerPage:        pulumi.IntRef(1),
//				Serials: []string{
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
//			ctx.Export("merakiOrganizationsSensorReadingsHistoryExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSensorReadingsHistory(ctx *pulumi.Context, args *GetSensorReadingsHistoryArgs, opts ...pulumi.InvokeOption) (*GetSensorReadingsHistoryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSensorReadingsHistoryResult
	err := ctx.Invoke("meraki:organizations/getSensorReadingsHistory:getSensorReadingsHistory", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSensorReadingsHistory.
type GetSensorReadingsHistoryArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// metrics query parameter. Types of sensor readings to retrieve. If no metrics are supplied, all available types of readings will be retrieved. Allowed values are apparentPower, battery, button, co2, current, door, downstreamPower, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, remoteLockoutSwitch, temperature, tvoc, voltage, and water.
	Metrics []string `pulumi:"metrics"`
	// networkIds query parameter. Optional parameter to filter readings by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// serials query parameter. Optional parameter to filter readings by sensor.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days and 6 hours from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
	Timespan *float64 `pulumi:"timespan"`
}

// A collection of values returned by getSensorReadingsHistory.
type GetSensorReadingsHistoryResult struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseSensorGetOrganizationSensorReadingsHistory
	Items []GetSensorReadingsHistoryItem `pulumi:"items"`
	// metrics query parameter. Types of sensor readings to retrieve. If no metrics are supplied, all available types of readings will be retrieved. Allowed values are apparentPower, battery, button, co2, current, door, downstreamPower, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, remoteLockoutSwitch, temperature, tvoc, voltage, and water.
	Metrics []string `pulumi:"metrics"`
	// networkIds query parameter. Optional parameter to filter readings by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// serials query parameter. Optional parameter to filter readings by sensor.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days and 6 hours from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
	Timespan *float64 `pulumi:"timespan"`
}

func GetSensorReadingsHistoryOutput(ctx *pulumi.Context, args GetSensorReadingsHistoryOutputArgs, opts ...pulumi.InvokeOption) GetSensorReadingsHistoryResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSensorReadingsHistoryResultOutput, error) {
			args := v.(GetSensorReadingsHistoryArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:organizations/getSensorReadingsHistory:getSensorReadingsHistory", args, GetSensorReadingsHistoryResultOutput{}, options).(GetSensorReadingsHistoryResultOutput), nil
		}).(GetSensorReadingsHistoryResultOutput)
}

// A collection of arguments for invoking getSensorReadingsHistory.
type GetSensorReadingsHistoryOutputArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// metrics query parameter. Types of sensor readings to retrieve. If no metrics are supplied, all available types of readings will be retrieved. Allowed values are apparentPower, battery, button, co2, current, door, downstreamPower, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, remoteLockoutSwitch, temperature, tvoc, voltage, and water.
	Metrics pulumi.StringArrayInput `pulumi:"metrics"`
	// networkIds query parameter. Optional parameter to filter readings by network.
	NetworkIds pulumi.StringArrayInput `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// serials query parameter. Optional parameter to filter readings by sensor.
	Serials pulumi.StringArrayInput `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days and 6 hours from today.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
}

func (GetSensorReadingsHistoryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSensorReadingsHistoryArgs)(nil)).Elem()
}

// A collection of values returned by getSensorReadingsHistory.
type GetSensorReadingsHistoryResultOutput struct{ *pulumi.OutputState }

func (GetSensorReadingsHistoryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSensorReadingsHistoryResult)(nil)).Elem()
}

func (o GetSensorReadingsHistoryResultOutput) ToGetSensorReadingsHistoryResultOutput() GetSensorReadingsHistoryResultOutput {
	return o
}

func (o GetSensorReadingsHistoryResultOutput) ToGetSensorReadingsHistoryResultOutputWithContext(ctx context.Context) GetSensorReadingsHistoryResultOutput {
	return o
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetSensorReadingsHistoryResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSensorReadingsHistoryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseSensorGetOrganizationSensorReadingsHistory
func (o GetSensorReadingsHistoryResultOutput) Items() GetSensorReadingsHistoryItemArrayOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) []GetSensorReadingsHistoryItem { return v.Items }).(GetSensorReadingsHistoryItemArrayOutput)
}

// metrics query parameter. Types of sensor readings to retrieve. If no metrics are supplied, all available types of readings will be retrieved. Allowed values are apparentPower, battery, button, co2, current, door, downstreamPower, frequency, humidity, indoorAirQuality, noise, pm25, powerFactor, realPower, remoteLockoutSwitch, temperature, tvoc, voltage, and water.
func (o GetSensorReadingsHistoryResultOutput) Metrics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) []string { return v.Metrics }).(pulumi.StringArrayOutput)
}

// networkIds query parameter. Optional parameter to filter readings by network.
func (o GetSensorReadingsHistoryResultOutput) NetworkIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) []string { return v.NetworkIds }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetSensorReadingsHistoryResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o GetSensorReadingsHistoryResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// serials query parameter. Optional parameter to filter readings by sensor.
func (o GetSensorReadingsHistoryResultOutput) Serials() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) []string { return v.Serials }).(pulumi.StringArrayOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetSensorReadingsHistoryResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 365 days and 6 hours from today.
func (o GetSensorReadingsHistoryResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 7 days after t0.
func (o GetSensorReadingsHistoryResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 7 days. The default is 2 hours.
func (o GetSensorReadingsHistoryResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetSensorReadingsHistoryResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSensorReadingsHistoryResultOutput{})
}
