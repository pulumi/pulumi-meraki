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
//			example, err := organizations.GetDevices(ctx, &organizations.GetDevicesArgs{
//				ConfigurationUpdatedAfter: pulumi.StringRef("string"),
//				EndingBefore:              pulumi.StringRef("string"),
//				Mac:                       pulumi.StringRef("string"),
//				Macs: []string{
//					"string",
//				},
//				Model: pulumi.StringRef("string"),
//				Models: []string{
//					"string",
//				},
//				Name: pulumi.StringRef("string"),
//				NetworkIds: []string{
//					"string",
//				},
//				OrganizationId: "string",
//				PerPage:        pulumi.IntRef(1),
//				ProductTypes: []string{
//					"string",
//				},
//				SensorAlertProfileIds: []string{
//					"string",
//				},
//				SensorMetrics: []string{
//					"string",
//				},
//				Serial: pulumi.StringRef("string"),
//				Serials: []string{
//					"string",
//				},
//				StartingAfter: pulumi.StringRef("string"),
//				Tags: []string{
//					"string",
//				},
//				TagsFilterType: pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsDevicesExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetDevices(ctx *pulumi.Context, args *GetDevicesArgs, opts ...pulumi.InvokeOption) (*GetDevicesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDevicesResult
	err := ctx.Invoke("meraki:organizations/getDevices:getDevices", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDevices.
type GetDevicesArgs struct {
	// configurationUpdatedAfter query parameter. Filter results by whether or not the device's configuration has been updated after the given timestamp
	ConfigurationUpdatedAfter *string `pulumi:"configurationUpdatedAfter"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// mac query parameter. Optional parameter to filter devices by MAC address. All returned devices will have a MAC address that contains the search term or is an exact match.
	Mac *string `pulumi:"mac"`
	// macs query parameter. Optional parameter to filter devices by one or more MAC addresses. All returned devices will have a MAC address that is an exact match.
	Macs []string `pulumi:"macs"`
	// model query parameter. Optional parameter to filter devices by model. All returned devices will have a model that contains the search term or is an exact match.
	Model *string `pulumi:"model"`
	// models query parameter. Optional parameter to filter devices by one or more models. All returned devices will have a model that is an exact match.
	Models []string `pulumi:"models"`
	// name query parameter. Optional parameter to filter devices by name. All returned devices will have a name that contains the search term or is an exact match.
	Name *string `pulumi:"name"`
	// networkIds query parameter. Optional parameter to filter devices by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter devices by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
	ProductTypes []string `pulumi:"productTypes"`
	// sensorAlertProfileIds query parameter. Optional parameter to filter devices by the alert profiles that are bound to them. Only applies to sensor devices.
	SensorAlertProfileIds []string `pulumi:"sensorAlertProfileIds"`
	// sensorMetrics query parameter. Optional parameter to filter devices by the metrics that they provide. Only applies to sensor devices.
	SensorMetrics []string `pulumi:"sensorMetrics"`
	// serial query parameter. Optional parameter to filter devices by serial number. All returned devices will have a serial number that contains the search term or is an exact match.
	Serial *string `pulumi:"serial"`
	// serials query parameter. Optional parameter to filter devices by one or more serial numbers. All returned devices will have a serial number that is an exact match.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// tags query parameter. Optional parameter to filter devices by tags.
	Tags []string `pulumi:"tags"`
	// tagsFilterType query parameter. Optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
	TagsFilterType *string `pulumi:"tagsFilterType"`
}

// A collection of values returned by getDevices.
type GetDevicesResult struct {
	// configurationUpdatedAfter query parameter. Filter results by whether or not the device's configuration has been updated after the given timestamp
	ConfigurationUpdatedAfter *string `pulumi:"configurationUpdatedAfter"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseOrganizationsGetOrganizationDevices
	Items []GetDevicesItem `pulumi:"items"`
	// mac query parameter. Optional parameter to filter devices by MAC address. All returned devices will have a MAC address that contains the search term or is an exact match.
	Mac *string `pulumi:"mac"`
	// macs query parameter. Optional parameter to filter devices by one or more MAC addresses. All returned devices will have a MAC address that is an exact match.
	Macs []string `pulumi:"macs"`
	// model query parameter. Optional parameter to filter devices by model. All returned devices will have a model that contains the search term or is an exact match.
	Model *string `pulumi:"model"`
	// models query parameter. Optional parameter to filter devices by one or more models. All returned devices will have a model that is an exact match.
	Models []string `pulumi:"models"`
	// name query parameter. Optional parameter to filter devices by name. All returned devices will have a name that contains the search term or is an exact match.
	Name *string `pulumi:"name"`
	// networkIds query parameter. Optional parameter to filter devices by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter devices by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
	ProductTypes []string `pulumi:"productTypes"`
	// sensorAlertProfileIds query parameter. Optional parameter to filter devices by the alert profiles that are bound to them. Only applies to sensor devices.
	SensorAlertProfileIds []string `pulumi:"sensorAlertProfileIds"`
	// sensorMetrics query parameter. Optional parameter to filter devices by the metrics that they provide. Only applies to sensor devices.
	SensorMetrics []string `pulumi:"sensorMetrics"`
	// serial query parameter. Optional parameter to filter devices by serial number. All returned devices will have a serial number that contains the search term or is an exact match.
	Serial *string `pulumi:"serial"`
	// serials query parameter. Optional parameter to filter devices by one or more serial numbers. All returned devices will have a serial number that is an exact match.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// tags query parameter. Optional parameter to filter devices by tags.
	Tags []string `pulumi:"tags"`
	// tagsFilterType query parameter. Optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
	TagsFilterType *string `pulumi:"tagsFilterType"`
}

func GetDevicesOutput(ctx *pulumi.Context, args GetDevicesOutputArgs, opts ...pulumi.InvokeOption) GetDevicesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDevicesResultOutput, error) {
			args := v.(GetDevicesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:organizations/getDevices:getDevices", args, GetDevicesResultOutput{}, options).(GetDevicesResultOutput), nil
		}).(GetDevicesResultOutput)
}

// A collection of arguments for invoking getDevices.
type GetDevicesOutputArgs struct {
	// configurationUpdatedAfter query parameter. Filter results by whether or not the device's configuration has been updated after the given timestamp
	ConfigurationUpdatedAfter pulumi.StringPtrInput `pulumi:"configurationUpdatedAfter"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// mac query parameter. Optional parameter to filter devices by MAC address. All returned devices will have a MAC address that contains the search term or is an exact match.
	Mac pulumi.StringPtrInput `pulumi:"mac"`
	// macs query parameter. Optional parameter to filter devices by one or more MAC addresses. All returned devices will have a MAC address that is an exact match.
	Macs pulumi.StringArrayInput `pulumi:"macs"`
	// model query parameter. Optional parameter to filter devices by model. All returned devices will have a model that contains the search term or is an exact match.
	Model pulumi.StringPtrInput `pulumi:"model"`
	// models query parameter. Optional parameter to filter devices by one or more models. All returned devices will have a model that is an exact match.
	Models pulumi.StringArrayInput `pulumi:"models"`
	// name query parameter. Optional parameter to filter devices by name. All returned devices will have a name that contains the search term or is an exact match.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// networkIds query parameter. Optional parameter to filter devices by network.
	NetworkIds pulumi.StringArrayInput `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter devices by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
	ProductTypes pulumi.StringArrayInput `pulumi:"productTypes"`
	// sensorAlertProfileIds query parameter. Optional parameter to filter devices by the alert profiles that are bound to them. Only applies to sensor devices.
	SensorAlertProfileIds pulumi.StringArrayInput `pulumi:"sensorAlertProfileIds"`
	// sensorMetrics query parameter. Optional parameter to filter devices by the metrics that they provide. Only applies to sensor devices.
	SensorMetrics pulumi.StringArrayInput `pulumi:"sensorMetrics"`
	// serial query parameter. Optional parameter to filter devices by serial number. All returned devices will have a serial number that contains the search term or is an exact match.
	Serial pulumi.StringPtrInput `pulumi:"serial"`
	// serials query parameter. Optional parameter to filter devices by one or more serial numbers. All returned devices will have a serial number that is an exact match.
	Serials pulumi.StringArrayInput `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
	// tags query parameter. Optional parameter to filter devices by tags.
	Tags pulumi.StringArrayInput `pulumi:"tags"`
	// tagsFilterType query parameter. Optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
	TagsFilterType pulumi.StringPtrInput `pulumi:"tagsFilterType"`
}

func (GetDevicesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicesArgs)(nil)).Elem()
}

// A collection of values returned by getDevices.
type GetDevicesResultOutput struct{ *pulumi.OutputState }

func (GetDevicesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDevicesResult)(nil)).Elem()
}

func (o GetDevicesResultOutput) ToGetDevicesResultOutput() GetDevicesResultOutput {
	return o
}

func (o GetDevicesResultOutput) ToGetDevicesResultOutputWithContext(ctx context.Context) GetDevicesResultOutput {
	return o
}

// configurationUpdatedAfter query parameter. Filter results by whether or not the device's configuration has been updated after the given timestamp
func (o GetDevicesResultOutput) ConfigurationUpdatedAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.ConfigurationUpdatedAfter }).(pulumi.StringPtrOutput)
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetDevicesResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDevicesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseOrganizationsGetOrganizationDevices
func (o GetDevicesResultOutput) Items() GetDevicesItemArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []GetDevicesItem { return v.Items }).(GetDevicesItemArrayOutput)
}

// mac query parameter. Optional parameter to filter devices by MAC address. All returned devices will have a MAC address that contains the search term or is an exact match.
func (o GetDevicesResultOutput) Mac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.Mac }).(pulumi.StringPtrOutput)
}

// macs query parameter. Optional parameter to filter devices by one or more MAC addresses. All returned devices will have a MAC address that is an exact match.
func (o GetDevicesResultOutput) Macs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []string { return v.Macs }).(pulumi.StringArrayOutput)
}

// model query parameter. Optional parameter to filter devices by model. All returned devices will have a model that contains the search term or is an exact match.
func (o GetDevicesResultOutput) Model() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.Model }).(pulumi.StringPtrOutput)
}

// models query parameter. Optional parameter to filter devices by one or more models. All returned devices will have a model that is an exact match.
func (o GetDevicesResultOutput) Models() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []string { return v.Models }).(pulumi.StringArrayOutput)
}

// name query parameter. Optional parameter to filter devices by name. All returned devices will have a name that contains the search term or is an exact match.
func (o GetDevicesResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// networkIds query parameter. Optional parameter to filter devices by network.
func (o GetDevicesResultOutput) NetworkIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []string { return v.NetworkIds }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetDevicesResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDevicesResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o GetDevicesResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// productTypes query parameter. Optional parameter to filter devices by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
func (o GetDevicesResultOutput) ProductTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []string { return v.ProductTypes }).(pulumi.StringArrayOutput)
}

// sensorAlertProfileIds query parameter. Optional parameter to filter devices by the alert profiles that are bound to them. Only applies to sensor devices.
func (o GetDevicesResultOutput) SensorAlertProfileIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []string { return v.SensorAlertProfileIds }).(pulumi.StringArrayOutput)
}

// sensorMetrics query parameter. Optional parameter to filter devices by the metrics that they provide. Only applies to sensor devices.
func (o GetDevicesResultOutput) SensorMetrics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []string { return v.SensorMetrics }).(pulumi.StringArrayOutput)
}

// serial query parameter. Optional parameter to filter devices by serial number. All returned devices will have a serial number that contains the search term or is an exact match.
func (o GetDevicesResultOutput) Serial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.Serial }).(pulumi.StringPtrOutput)
}

// serials query parameter. Optional parameter to filter devices by one or more serial numbers. All returned devices will have a serial number that is an exact match.
func (o GetDevicesResultOutput) Serials() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []string { return v.Serials }).(pulumi.StringArrayOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetDevicesResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

// tags query parameter. Optional parameter to filter devices by tags.
func (o GetDevicesResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDevicesResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// tagsFilterType query parameter. Optional parameter of value 'withAnyTags' or 'withAllTags' to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, 'withAnyTags' will be selected.
func (o GetDevicesResultOutput) TagsFilterType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDevicesResult) *string { return v.TagsFilterType }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDevicesResultOutput{})
}
