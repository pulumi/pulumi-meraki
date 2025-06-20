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
//			example, err := organizations.GetApiRequestsOverviewResponseCodesByInterval(ctx, &organizations.GetApiRequestsOverviewResponseCodesByIntervalArgs{
//				AdminIds: []string{
//					"string",
//				},
//				Interval: pulumi.IntRef(1),
//				OperationIds: []string{
//					"string",
//				},
//				OrganizationId: "string",
//				SourceIps: []string{
//					"string",
//				},
//				T0:        pulumi.StringRef("string"),
//				T1:        pulumi.StringRef("string"),
//				Timespan:  pulumi.Float64Ref(1),
//				UserAgent: pulumi.StringRef("string"),
//				Version:   pulumi.IntRef(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsApiRequestsOverviewResponseCodesByIntervalExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetApiRequestsOverviewResponseCodesByInterval(ctx *pulumi.Context, args *GetApiRequestsOverviewResponseCodesByIntervalArgs, opts ...pulumi.InvokeOption) (*GetApiRequestsOverviewResponseCodesByIntervalResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetApiRequestsOverviewResponseCodesByIntervalResult
	err := ctx.Invoke("meraki:organizations/getApiRequestsOverviewResponseCodesByInterval:getApiRequestsOverviewResponseCodesByInterval", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApiRequestsOverviewResponseCodesByInterval.
type GetApiRequestsOverviewResponseCodesByIntervalArgs struct {
	// adminIds query parameter. Filter by admin ID of user that made the API request
	AdminIds []string `pulumi:"adminIds"`
	// interval query parameter. The time interval in seconds for returned data. The valid intervals are: 120, 3600, 14400, 21600. The default is 21600. Interval is calculated if time params are provided.
	Interval *int `pulumi:"interval"`
	// operationIds query parameter. Filter by operation ID of the endpoint
	OperationIds []string `pulumi:"operationIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// sourceIps query parameter. Filter by source IP that made the API request
	SourceIps []string `pulumi:"sourceIps"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days. If interval is provided, the timespan will be autocalculated.
	Timespan *float64 `pulumi:"timespan"`
	// userAgent query parameter. Filter by user agent string for API request. This will filter by a complete or partial match.
	UserAgent *string `pulumi:"userAgent"`
	// version query parameter. Filter by API version of the endpoint. Allowable values are: [0, 1]
	Version *int `pulumi:"version"`
}

// A collection of values returned by getApiRequestsOverviewResponseCodesByInterval.
type GetApiRequestsOverviewResponseCodesByIntervalResult struct {
	// adminIds query parameter. Filter by admin ID of user that made the API request
	AdminIds []string `pulumi:"adminIds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// interval query parameter. The time interval in seconds for returned data. The valid intervals are: 120, 3600, 14400, 21600. The default is 21600. Interval is calculated if time params are provided.
	Interval *int `pulumi:"interval"`
	// Array of ResponseOrganizationsGetOrganizationApiRequestsOverviewResponseCodesByInterval
	Items []GetApiRequestsOverviewResponseCodesByIntervalItem `pulumi:"items"`
	// operationIds query parameter. Filter by operation ID of the endpoint
	OperationIds []string `pulumi:"operationIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// sourceIps query parameter. Filter by source IP that made the API request
	SourceIps []string `pulumi:"sourceIps"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 *string `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 *string `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days. If interval is provided, the timespan will be autocalculated.
	Timespan *float64 `pulumi:"timespan"`
	// userAgent query parameter. Filter by user agent string for API request. This will filter by a complete or partial match.
	UserAgent *string `pulumi:"userAgent"`
	// version query parameter. Filter by API version of the endpoint. Allowable values are: [0, 1]
	Version *int `pulumi:"version"`
}

func GetApiRequestsOverviewResponseCodesByIntervalOutput(ctx *pulumi.Context, args GetApiRequestsOverviewResponseCodesByIntervalOutputArgs, opts ...pulumi.InvokeOption) GetApiRequestsOverviewResponseCodesByIntervalResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetApiRequestsOverviewResponseCodesByIntervalResultOutput, error) {
			args := v.(GetApiRequestsOverviewResponseCodesByIntervalArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:organizations/getApiRequestsOverviewResponseCodesByInterval:getApiRequestsOverviewResponseCodesByInterval", args, GetApiRequestsOverviewResponseCodesByIntervalResultOutput{}, options).(GetApiRequestsOverviewResponseCodesByIntervalResultOutput), nil
		}).(GetApiRequestsOverviewResponseCodesByIntervalResultOutput)
}

// A collection of arguments for invoking getApiRequestsOverviewResponseCodesByInterval.
type GetApiRequestsOverviewResponseCodesByIntervalOutputArgs struct {
	// adminIds query parameter. Filter by admin ID of user that made the API request
	AdminIds pulumi.StringArrayInput `pulumi:"adminIds"`
	// interval query parameter. The time interval in seconds for returned data. The valid intervals are: 120, 3600, 14400, 21600. The default is 21600. Interval is calculated if time params are provided.
	Interval pulumi.IntPtrInput `pulumi:"interval"`
	// operationIds query parameter. Filter by operation ID of the endpoint
	OperationIds pulumi.StringArrayInput `pulumi:"operationIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// sourceIps query parameter. Filter by source IP that made the API request
	SourceIps pulumi.StringArrayInput `pulumi:"sourceIps"`
	// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
	T0 pulumi.StringPtrInput `pulumi:"t0"`
	// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
	T1 pulumi.StringPtrInput `pulumi:"t1"`
	// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days. If interval is provided, the timespan will be autocalculated.
	Timespan pulumi.Float64PtrInput `pulumi:"timespan"`
	// userAgent query parameter. Filter by user agent string for API request. This will filter by a complete or partial match.
	UserAgent pulumi.StringPtrInput `pulumi:"userAgent"`
	// version query parameter. Filter by API version of the endpoint. Allowable values are: [0, 1]
	Version pulumi.IntPtrInput `pulumi:"version"`
}

func (GetApiRequestsOverviewResponseCodesByIntervalOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApiRequestsOverviewResponseCodesByIntervalArgs)(nil)).Elem()
}

// A collection of values returned by getApiRequestsOverviewResponseCodesByInterval.
type GetApiRequestsOverviewResponseCodesByIntervalResultOutput struct{ *pulumi.OutputState }

func (GetApiRequestsOverviewResponseCodesByIntervalResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApiRequestsOverviewResponseCodesByIntervalResult)(nil)).Elem()
}

func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) ToGetApiRequestsOverviewResponseCodesByIntervalResultOutput() GetApiRequestsOverviewResponseCodesByIntervalResultOutput {
	return o
}

func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) ToGetApiRequestsOverviewResponseCodesByIntervalResultOutputWithContext(ctx context.Context) GetApiRequestsOverviewResponseCodesByIntervalResultOutput {
	return o
}

// adminIds query parameter. Filter by admin ID of user that made the API request
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) AdminIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) []string { return v.AdminIds }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) string { return v.Id }).(pulumi.StringOutput)
}

// interval query parameter. The time interval in seconds for returned data. The valid intervals are: 120, 3600, 14400, 21600. The default is 21600. Interval is calculated if time params are provided.
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) Interval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) *int { return v.Interval }).(pulumi.IntPtrOutput)
}

// Array of ResponseOrganizationsGetOrganizationApiRequestsOverviewResponseCodesByInterval
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) Items() GetApiRequestsOverviewResponseCodesByIntervalItemArrayOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) []GetApiRequestsOverviewResponseCodesByIntervalItem {
		return v.Items
	}).(GetApiRequestsOverviewResponseCodesByIntervalItemArrayOutput)
}

// operationIds query parameter. Filter by operation ID of the endpoint
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) OperationIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) []string { return v.OperationIds }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// sourceIps query parameter. Filter by source IP that made the API request
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) SourceIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) []string { return v.SourceIps }).(pulumi.StringArrayOutput)
}

// t0 query parameter. The beginning of the timespan for the data. The maximum lookback period is 31 days from today.
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) T0() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) *string { return v.T0 }).(pulumi.StringPtrOutput)
}

// t1 query parameter. The end of the timespan for the data. t1 can be a maximum of 31 days after t0.
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) T1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) *string { return v.T1 }).(pulumi.StringPtrOutput)
}

// timespan query parameter. The timespan for which the information will be fetched. If specifying timespan, do not specify parameters t0 and t1. The value must be in seconds and be less than or equal to 31 days. The default is 31 days. If interval is provided, the timespan will be autocalculated.
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) Timespan() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) *float64 { return v.Timespan }).(pulumi.Float64PtrOutput)
}

// userAgent query parameter. Filter by user agent string for API request. This will filter by a complete or partial match.
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) UserAgent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) *string { return v.UserAgent }).(pulumi.StringPtrOutput)
}

// version query parameter. Filter by API version of the endpoint. Allowable values are: [0, 1]
func (o GetApiRequestsOverviewResponseCodesByIntervalResultOutput) Version() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetApiRequestsOverviewResponseCodesByIntervalResult) *int { return v.Version }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetApiRequestsOverviewResponseCodesByIntervalResultOutput{})
}
