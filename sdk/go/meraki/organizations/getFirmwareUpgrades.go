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
//			example, err := organizations.GetFirmwareUpgrades(ctx, &organizations.GetFirmwareUpgradesArgs{
//				EndingBefore:   pulumi.StringRef("string"),
//				OrganizationId: "string",
//				PerPage:        pulumi.IntRef(1),
//				ProductTypes: []string{
//					"string",
//				},
//				StartingAfter: pulumi.StringRef("string"),
//				Statuses: []string{
//					"string",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsFirmwareUpgradesExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetFirmwareUpgrades(ctx *pulumi.Context, args *GetFirmwareUpgradesArgs, opts ...pulumi.InvokeOption) (*GetFirmwareUpgradesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFirmwareUpgradesResult
	err := ctx.Invoke("meraki:organizations/getFirmwareUpgrades:getFirmwareUpgrades", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFirmwareUpgrades.
type GetFirmwareUpgradesArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter the upgrade by product type.
	ProductTypes []string `pulumi:"productTypes"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// status query parameter. Optional parameter to filter the upgrade by status.
	Statuses []string `pulumi:"statuses"`
}

// A collection of values returned by getFirmwareUpgrades.
type GetFirmwareUpgradesResult struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Array of ResponseOrganizationsGetOrganizationFirmwareUpgrades
	Items []GetFirmwareUpgradesItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter the upgrade by product type.
	ProductTypes []string `pulumi:"productTypes"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
	// status query parameter. Optional parameter to filter the upgrade by status.
	Statuses []string `pulumi:"statuses"`
}

func GetFirmwareUpgradesOutput(ctx *pulumi.Context, args GetFirmwareUpgradesOutputArgs, opts ...pulumi.InvokeOption) GetFirmwareUpgradesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetFirmwareUpgradesResultOutput, error) {
			args := v.(GetFirmwareUpgradesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:organizations/getFirmwareUpgrades:getFirmwareUpgrades", args, GetFirmwareUpgradesResultOutput{}, options).(GetFirmwareUpgradesResultOutput), nil
		}).(GetFirmwareUpgradesResultOutput)
}

// A collection of arguments for invoking getFirmwareUpgrades.
type GetFirmwareUpgradesOutputArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// productTypes query parameter. Optional parameter to filter the upgrade by product type.
	ProductTypes pulumi.StringArrayInput `pulumi:"productTypes"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
	// status query parameter. Optional parameter to filter the upgrade by status.
	Statuses pulumi.StringArrayInput `pulumi:"statuses"`
}

func (GetFirmwareUpgradesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFirmwareUpgradesArgs)(nil)).Elem()
}

// A collection of values returned by getFirmwareUpgrades.
type GetFirmwareUpgradesResultOutput struct{ *pulumi.OutputState }

func (GetFirmwareUpgradesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFirmwareUpgradesResult)(nil)).Elem()
}

func (o GetFirmwareUpgradesResultOutput) ToGetFirmwareUpgradesResultOutput() GetFirmwareUpgradesResultOutput {
	return o
}

func (o GetFirmwareUpgradesResultOutput) ToGetFirmwareUpgradesResultOutputWithContext(ctx context.Context) GetFirmwareUpgradesResultOutput {
	return o
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetFirmwareUpgradesResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetFirmwareUpgradesResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetFirmwareUpgradesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFirmwareUpgradesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of ResponseOrganizationsGetOrganizationFirmwareUpgrades
func (o GetFirmwareUpgradesResultOutput) Items() GetFirmwareUpgradesItemArrayOutput {
	return o.ApplyT(func(v GetFirmwareUpgradesResult) []GetFirmwareUpgradesItem { return v.Items }).(GetFirmwareUpgradesItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetFirmwareUpgradesResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetFirmwareUpgradesResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o GetFirmwareUpgradesResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetFirmwareUpgradesResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// productTypes query parameter. Optional parameter to filter the upgrade by product type.
func (o GetFirmwareUpgradesResultOutput) ProductTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetFirmwareUpgradesResult) []string { return v.ProductTypes }).(pulumi.StringArrayOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetFirmwareUpgradesResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetFirmwareUpgradesResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

// status query parameter. Optional parameter to filter the upgrade by status.
func (o GetFirmwareUpgradesResultOutput) Statuses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetFirmwareUpgradesResult) []string { return v.Statuses }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFirmwareUpgradesResultOutput{})
}
