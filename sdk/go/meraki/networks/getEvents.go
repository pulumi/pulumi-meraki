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
//			example, err := networks.GetEvents(ctx, &networks.GetEventsArgs{
//				ClientIp:     pulumi.StringRef("string"),
//				ClientMac:    pulumi.StringRef("string"),
//				ClientName:   pulumi.StringRef("string"),
//				DeviceMac:    pulumi.StringRef("string"),
//				DeviceName:   pulumi.StringRef("string"),
//				DeviceSerial: pulumi.StringRef("string"),
//				EndingBefore: pulumi.StringRef("string"),
//				ExcludedEventTypes: []string{
//					"string",
//				},
//				IncludedEventTypes: []string{
//					"string",
//				},
//				NetworkId:     "string",
//				PerPage:       pulumi.IntRef(1),
//				ProductType:   pulumi.StringRef("string"),
//				SmDeviceMac:   pulumi.StringRef("string"),
//				SmDeviceName:  pulumi.StringRef("string"),
//				StartingAfter: pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksEventsExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetEvents(ctx *pulumi.Context, args *GetEventsArgs, opts ...pulumi.InvokeOption) (*GetEventsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEventsResult
	err := ctx.Invoke("meraki:networks/getEvents:getEvents", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEvents.
type GetEventsArgs struct {
	// clientIp query parameter. The IP of the client which the list of events will be filtered with. Only supported for track-by-IP networks.
	ClientIp *string `pulumi:"clientIp"`
	// clientMac query parameter. The MAC address of the client which the list of events will be filtered with. Only supported for track-by-MAC networks.
	ClientMac *string `pulumi:"clientMac"`
	// clientName query parameter. The name, or partial name, of the client which the list of events will be filtered with
	ClientName *string `pulumi:"clientName"`
	// deviceMac query parameter. The MAC address of the Meraki device which the list of events will be filtered with
	DeviceMac *string `pulumi:"deviceMac"`
	// deviceName query parameter. The name of the Meraki device which the list of events will be filtered with
	DeviceName *string `pulumi:"deviceName"`
	// deviceSerial query parameter. The serial of the Meraki device which the list of events will be filtered with
	DeviceSerial *string `pulumi:"deviceSerial"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// excludedEventTypes query parameter. A list of event types. The returned events will be filtered to exclude events with these types.
	ExcludedEventTypes []string `pulumi:"excludedEventTypes"`
	// includedEventTypes query parameter. A list of event types. The returned events will be filtered to only include events with these types.
	IncludedEventTypes []string `pulumi:"includedEventTypes"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 10.
	PerPage *int `pulumi:"perPage"`
	// productType query parameter. The product type to fetch events for. This parameter is required for networks with multiple device types. Valid types are wireless, appliance, switch, systemsManager, camera, and cellularGateway
	ProductType *string `pulumi:"productType"`
	// smDeviceMac query parameter. The MAC address of the Systems Manager device which the list of events will be filtered with
	SmDeviceMac *string `pulumi:"smDeviceMac"`
	// smDeviceName query parameter. The name of the Systems Manager device which the list of events will be filtered with
	SmDeviceName *string `pulumi:"smDeviceName"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

// A collection of values returned by getEvents.
type GetEventsResult struct {
	// clientIp query parameter. The IP of the client which the list of events will be filtered with. Only supported for track-by-IP networks.
	ClientIp *string `pulumi:"clientIp"`
	// clientMac query parameter. The MAC address of the client which the list of events will be filtered with. Only supported for track-by-MAC networks.
	ClientMac *string `pulumi:"clientMac"`
	// clientName query parameter. The name, or partial name, of the client which the list of events will be filtered with
	ClientName *string `pulumi:"clientName"`
	// deviceMac query parameter. The MAC address of the Meraki device which the list of events will be filtered with
	DeviceMac *string `pulumi:"deviceMac"`
	// deviceName query parameter. The name of the Meraki device which the list of events will be filtered with
	DeviceName *string `pulumi:"deviceName"`
	// deviceSerial query parameter. The serial of the Meraki device which the list of events will be filtered with
	DeviceSerial *string `pulumi:"deviceSerial"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// excludedEventTypes query parameter. A list of event types. The returned events will be filtered to exclude events with these types.
	ExcludedEventTypes []string `pulumi:"excludedEventTypes"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// includedEventTypes query parameter. A list of event types. The returned events will be filtered to only include events with these types.
	IncludedEventTypes []string      `pulumi:"includedEventTypes"`
	Item               GetEventsItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 10.
	PerPage *int `pulumi:"perPage"`
	// productType query parameter. The product type to fetch events for. This parameter is required for networks with multiple device types. Valid types are wireless, appliance, switch, systemsManager, camera, and cellularGateway
	ProductType *string `pulumi:"productType"`
	// smDeviceMac query parameter. The MAC address of the Systems Manager device which the list of events will be filtered with
	SmDeviceMac *string `pulumi:"smDeviceMac"`
	// smDeviceName query parameter. The name of the Systems Manager device which the list of events will be filtered with
	SmDeviceName *string `pulumi:"smDeviceName"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

func GetEventsOutput(ctx *pulumi.Context, args GetEventsOutputArgs, opts ...pulumi.InvokeOption) GetEventsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetEventsResultOutput, error) {
			args := v.(GetEventsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getEvents:getEvents", args, GetEventsResultOutput{}, options).(GetEventsResultOutput), nil
		}).(GetEventsResultOutput)
}

// A collection of arguments for invoking getEvents.
type GetEventsOutputArgs struct {
	// clientIp query parameter. The IP of the client which the list of events will be filtered with. Only supported for track-by-IP networks.
	ClientIp pulumi.StringPtrInput `pulumi:"clientIp"`
	// clientMac query parameter. The MAC address of the client which the list of events will be filtered with. Only supported for track-by-MAC networks.
	ClientMac pulumi.StringPtrInput `pulumi:"clientMac"`
	// clientName query parameter. The name, or partial name, of the client which the list of events will be filtered with
	ClientName pulumi.StringPtrInput `pulumi:"clientName"`
	// deviceMac query parameter. The MAC address of the Meraki device which the list of events will be filtered with
	DeviceMac pulumi.StringPtrInput `pulumi:"deviceMac"`
	// deviceName query parameter. The name of the Meraki device which the list of events will be filtered with
	DeviceName pulumi.StringPtrInput `pulumi:"deviceName"`
	// deviceSerial query parameter. The serial of the Meraki device which the list of events will be filtered with
	DeviceSerial pulumi.StringPtrInput `pulumi:"deviceSerial"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// excludedEventTypes query parameter. A list of event types. The returned events will be filtered to exclude events with these types.
	ExcludedEventTypes pulumi.StringArrayInput `pulumi:"excludedEventTypes"`
	// includedEventTypes query parameter. A list of event types. The returned events will be filtered to only include events with these types.
	IncludedEventTypes pulumi.StringArrayInput `pulumi:"includedEventTypes"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 10.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// productType query parameter. The product type to fetch events for. This parameter is required for networks with multiple device types. Valid types are wireless, appliance, switch, systemsManager, camera, and cellularGateway
	ProductType pulumi.StringPtrInput `pulumi:"productType"`
	// smDeviceMac query parameter. The MAC address of the Systems Manager device which the list of events will be filtered with
	SmDeviceMac pulumi.StringPtrInput `pulumi:"smDeviceMac"`
	// smDeviceName query parameter. The name of the Systems Manager device which the list of events will be filtered with
	SmDeviceName pulumi.StringPtrInput `pulumi:"smDeviceName"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
}

func (GetEventsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventsArgs)(nil)).Elem()
}

// A collection of values returned by getEvents.
type GetEventsResultOutput struct{ *pulumi.OutputState }

func (GetEventsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventsResult)(nil)).Elem()
}

func (o GetEventsResultOutput) ToGetEventsResultOutput() GetEventsResultOutput {
	return o
}

func (o GetEventsResultOutput) ToGetEventsResultOutputWithContext(ctx context.Context) GetEventsResultOutput {
	return o
}

// clientIp query parameter. The IP of the client which the list of events will be filtered with. Only supported for track-by-IP networks.
func (o GetEventsResultOutput) ClientIp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.ClientIp }).(pulumi.StringPtrOutput)
}

// clientMac query parameter. The MAC address of the client which the list of events will be filtered with. Only supported for track-by-MAC networks.
func (o GetEventsResultOutput) ClientMac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.ClientMac }).(pulumi.StringPtrOutput)
}

// clientName query parameter. The name, or partial name, of the client which the list of events will be filtered with
func (o GetEventsResultOutput) ClientName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.ClientName }).(pulumi.StringPtrOutput)
}

// deviceMac query parameter. The MAC address of the Meraki device which the list of events will be filtered with
func (o GetEventsResultOutput) DeviceMac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.DeviceMac }).(pulumi.StringPtrOutput)
}

// deviceName query parameter. The name of the Meraki device which the list of events will be filtered with
func (o GetEventsResultOutput) DeviceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.DeviceName }).(pulumi.StringPtrOutput)
}

// deviceSerial query parameter. The serial of the Meraki device which the list of events will be filtered with
func (o GetEventsResultOutput) DeviceSerial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.DeviceSerial }).(pulumi.StringPtrOutput)
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetEventsResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// excludedEventTypes query parameter. A list of event types. The returned events will be filtered to exclude events with these types.
func (o GetEventsResultOutput) ExcludedEventTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEventsResult) []string { return v.ExcludedEventTypes }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEventsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventsResult) string { return v.Id }).(pulumi.StringOutput)
}

// includedEventTypes query parameter. A list of event types. The returned events will be filtered to only include events with these types.
func (o GetEventsResultOutput) IncludedEventTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEventsResult) []string { return v.IncludedEventTypes }).(pulumi.StringArrayOutput)
}

func (o GetEventsResultOutput) Item() GetEventsItemOutput {
	return o.ApplyT(func(v GetEventsResult) GetEventsItem { return v.Item }).(GetEventsItemOutput)
}

// networkId path parameter. Network ID
func (o GetEventsResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventsResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 10.
func (o GetEventsResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// productType query parameter. The product type to fetch events for. This parameter is required for networks with multiple device types. Valid types are wireless, appliance, switch, systemsManager, camera, and cellularGateway
func (o GetEventsResultOutput) ProductType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.ProductType }).(pulumi.StringPtrOutput)
}

// smDeviceMac query parameter. The MAC address of the Systems Manager device which the list of events will be filtered with
func (o GetEventsResultOutput) SmDeviceMac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.SmDeviceMac }).(pulumi.StringPtrOutput)
}

// smDeviceName query parameter. The name of the Systems Manager device which the list of events will be filtered with
func (o GetEventsResultOutput) SmDeviceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.SmDeviceName }).(pulumi.StringPtrOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetEventsResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventsResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEventsResultOutput{})
}
