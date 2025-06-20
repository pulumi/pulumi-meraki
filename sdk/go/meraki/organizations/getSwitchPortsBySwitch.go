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
//			example, err := organizations.GetSwitchPortsBySwitch(ctx, &organizations.GetSwitchPortsBySwitchArgs{
//				ConfigurationUpdatedAfter: pulumi.StringRef("string"),
//				EndingBefore:              pulumi.StringRef("string"),
//				Mac:                       pulumi.StringRef("string"),
//				Macs: []string{
//					"string",
//				},
//				Name: pulumi.StringRef("string"),
//				NetworkIds: []string{
//					"string",
//				},
//				OrganizationId: "string",
//				PerPage:        pulumi.IntRef(1),
//				PortProfileIds: []string{
//					"string",
//				},
//				Serial: pulumi.StringRef("string"),
//				Serials: []string{
//					"string",
//				},
//				StartingAfter: pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsSwitchPortsBySwitchExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetSwitchPortsBySwitch(ctx *pulumi.Context, args *GetSwitchPortsBySwitchArgs, opts ...pulumi.InvokeOption) (*GetSwitchPortsBySwitchResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSwitchPortsBySwitchResult
	err := ctx.Invoke("meraki:organizations/getSwitchPortsBySwitch:getSwitchPortsBySwitch", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSwitchPortsBySwitch.
type GetSwitchPortsBySwitchArgs struct {
	// configurationUpdatedAfter query parameter. Optional parameter to filter results by switches where the configuration has been updated after the given timestamp.
	ConfigurationUpdatedAfter *string `pulumi:"configurationUpdatedAfter"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// mac query parameter. Optional parameter to filter switchports belonging to switches by MAC address. All returned switches will have a MAC address that contains the search term or is an exact match.
	Mac *string `pulumi:"mac"`
	// macs query parameter. Optional parameter to filter switchports by one or more MAC addresses belonging to devices. All switchports returned belong to MAC addresses of switches that are an exact match.
	Macs []string `pulumi:"macs"`
	// name query parameter. Optional parameter to filter switchports belonging to switches by name. All returned switches will have a name that contains the search term or is an exact match.
	Name *string `pulumi:"name"`
	// networkIds query parameter. Optional parameter to filter switchports by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 50. Default is 50.
	PerPage *int `pulumi:"perPage"`
	// portProfileIds query parameter. Optional parameter to filter switchports belonging to the specified port profiles.
	PortProfileIds []string `pulumi:"portProfileIds"`
	// serial query parameter. Optional parameter to filter switchports belonging to switches by serial number. All returned switches will have a serial number that contains the search term or is an exact match.
	Serial *string `pulumi:"serial"`
	// serials query parameter. Optional parameter to filter switchports belonging to switches with one or more serial numbers. All switchports returned belong to serial numbers of switches that are an exact match.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

// A collection of values returned by getSwitchPortsBySwitch.
type GetSwitchPortsBySwitchResult struct {
	// configurationUpdatedAfter query parameter. Optional parameter to filter results by switches where the configuration has been updated after the given timestamp.
	ConfigurationUpdatedAfter *string `pulumi:"configurationUpdatedAfter"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseSwitchGetOrganizationSwitchPortsBySwitch
	Items []GetSwitchPortsBySwitchItem `pulumi:"items"`
	// mac query parameter. Optional parameter to filter switchports belonging to switches by MAC address. All returned switches will have a MAC address that contains the search term or is an exact match.
	Mac *string `pulumi:"mac"`
	// macs query parameter. Optional parameter to filter switchports by one or more MAC addresses belonging to devices. All switchports returned belong to MAC addresses of switches that are an exact match.
	Macs []string `pulumi:"macs"`
	// name query parameter. Optional parameter to filter switchports belonging to switches by name. All returned switches will have a name that contains the search term or is an exact match.
	Name *string `pulumi:"name"`
	// networkIds query parameter. Optional parameter to filter switchports by network.
	NetworkIds []string `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 50. Default is 50.
	PerPage *int `pulumi:"perPage"`
	// portProfileIds query parameter. Optional parameter to filter switchports belonging to the specified port profiles.
	PortProfileIds []string `pulumi:"portProfileIds"`
	// serial query parameter. Optional parameter to filter switchports belonging to switches by serial number. All returned switches will have a serial number that contains the search term or is an exact match.
	Serial *string `pulumi:"serial"`
	// serials query parameter. Optional parameter to filter switchports belonging to switches with one or more serial numbers. All switchports returned belong to serial numbers of switches that are an exact match.
	Serials []string `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

func GetSwitchPortsBySwitchOutput(ctx *pulumi.Context, args GetSwitchPortsBySwitchOutputArgs, opts ...pulumi.InvokeOption) GetSwitchPortsBySwitchResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSwitchPortsBySwitchResultOutput, error) {
			args := v.(GetSwitchPortsBySwitchArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:organizations/getSwitchPortsBySwitch:getSwitchPortsBySwitch", args, GetSwitchPortsBySwitchResultOutput{}, options).(GetSwitchPortsBySwitchResultOutput), nil
		}).(GetSwitchPortsBySwitchResultOutput)
}

// A collection of arguments for invoking getSwitchPortsBySwitch.
type GetSwitchPortsBySwitchOutputArgs struct {
	// configurationUpdatedAfter query parameter. Optional parameter to filter results by switches where the configuration has been updated after the given timestamp.
	ConfigurationUpdatedAfter pulumi.StringPtrInput `pulumi:"configurationUpdatedAfter"`
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// mac query parameter. Optional parameter to filter switchports belonging to switches by MAC address. All returned switches will have a MAC address that contains the search term or is an exact match.
	Mac pulumi.StringPtrInput `pulumi:"mac"`
	// macs query parameter. Optional parameter to filter switchports by one or more MAC addresses belonging to devices. All switchports returned belong to MAC addresses of switches that are an exact match.
	Macs pulumi.StringArrayInput `pulumi:"macs"`
	// name query parameter. Optional parameter to filter switchports belonging to switches by name. All returned switches will have a name that contains the search term or is an exact match.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// networkIds query parameter. Optional parameter to filter switchports by network.
	NetworkIds pulumi.StringArrayInput `pulumi:"networkIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 50. Default is 50.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// portProfileIds query parameter. Optional parameter to filter switchports belonging to the specified port profiles.
	PortProfileIds pulumi.StringArrayInput `pulumi:"portProfileIds"`
	// serial query parameter. Optional parameter to filter switchports belonging to switches by serial number. All returned switches will have a serial number that contains the search term or is an exact match.
	Serial pulumi.StringPtrInput `pulumi:"serial"`
	// serials query parameter. Optional parameter to filter switchports belonging to switches with one or more serial numbers. All switchports returned belong to serial numbers of switches that are an exact match.
	Serials pulumi.StringArrayInput `pulumi:"serials"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
}

func (GetSwitchPortsBySwitchOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSwitchPortsBySwitchArgs)(nil)).Elem()
}

// A collection of values returned by getSwitchPortsBySwitch.
type GetSwitchPortsBySwitchResultOutput struct{ *pulumi.OutputState }

func (GetSwitchPortsBySwitchResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSwitchPortsBySwitchResult)(nil)).Elem()
}

func (o GetSwitchPortsBySwitchResultOutput) ToGetSwitchPortsBySwitchResultOutput() GetSwitchPortsBySwitchResultOutput {
	return o
}

func (o GetSwitchPortsBySwitchResultOutput) ToGetSwitchPortsBySwitchResultOutputWithContext(ctx context.Context) GetSwitchPortsBySwitchResultOutput {
	return o
}

// configurationUpdatedAfter query parameter. Optional parameter to filter results by switches where the configuration has been updated after the given timestamp.
func (o GetSwitchPortsBySwitchResultOutput) ConfigurationUpdatedAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) *string { return v.ConfigurationUpdatedAfter }).(pulumi.StringPtrOutput)
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetSwitchPortsBySwitchResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSwitchPortsBySwitchResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseSwitchGetOrganizationSwitchPortsBySwitch
func (o GetSwitchPortsBySwitchResultOutput) Items() GetSwitchPortsBySwitchItemArrayOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) []GetSwitchPortsBySwitchItem { return v.Items }).(GetSwitchPortsBySwitchItemArrayOutput)
}

// mac query parameter. Optional parameter to filter switchports belonging to switches by MAC address. All returned switches will have a MAC address that contains the search term or is an exact match.
func (o GetSwitchPortsBySwitchResultOutput) Mac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) *string { return v.Mac }).(pulumi.StringPtrOutput)
}

// macs query parameter. Optional parameter to filter switchports by one or more MAC addresses belonging to devices. All switchports returned belong to MAC addresses of switches that are an exact match.
func (o GetSwitchPortsBySwitchResultOutput) Macs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) []string { return v.Macs }).(pulumi.StringArrayOutput)
}

// name query parameter. Optional parameter to filter switchports belonging to switches by name. All returned switches will have a name that contains the search term or is an exact match.
func (o GetSwitchPortsBySwitchResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// networkIds query parameter. Optional parameter to filter switchports by network.
func (o GetSwitchPortsBySwitchResultOutput) NetworkIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) []string { return v.NetworkIds }).(pulumi.StringArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetSwitchPortsBySwitchResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 50. Default is 50.
func (o GetSwitchPortsBySwitchResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// portProfileIds query parameter. Optional parameter to filter switchports belonging to the specified port profiles.
func (o GetSwitchPortsBySwitchResultOutput) PortProfileIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) []string { return v.PortProfileIds }).(pulumi.StringArrayOutput)
}

// serial query parameter. Optional parameter to filter switchports belonging to switches by serial number. All returned switches will have a serial number that contains the search term or is an exact match.
func (o GetSwitchPortsBySwitchResultOutput) Serial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) *string { return v.Serial }).(pulumi.StringPtrOutput)
}

// serials query parameter. Optional parameter to filter switchports belonging to switches with one or more serial numbers. All switchports returned belong to serial numbers of switches that are an exact match.
func (o GetSwitchPortsBySwitchResultOutput) Serials() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) []string { return v.Serials }).(pulumi.StringArrayOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetSwitchPortsBySwitchResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchPortsBySwitchResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSwitchPortsBySwitchResultOutput{})
}
