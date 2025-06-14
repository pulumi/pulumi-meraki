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
//			example, err := organizations.GetLicensingCotermLicenses(ctx, &organizations.GetLicensingCotermLicensesArgs{
//				EndingBefore:   pulumi.StringRef("string"),
//				Expired:        pulumi.BoolRef(false),
//				Invalidated:    pulumi.BoolRef(false),
//				OrganizationId: "string",
//				PerPage:        pulumi.IntRef(1),
//				StartingAfter:  pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsLicensingCotermLicensesExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func GetLicensingCotermLicenses(ctx *pulumi.Context, args *GetLicensingCotermLicensesArgs, opts ...pulumi.InvokeOption) (*GetLicensingCotermLicensesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLicensingCotermLicensesResult
	err := ctx.Invoke("meraki:organizations/getLicensingCotermLicenses:getLicensingCotermLicenses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLicensingCotermLicenses.
type GetLicensingCotermLicensesArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// expired query parameter. Filter for licenses that are expired
	Expired *bool `pulumi:"expired"`
	// invalidated query parameter. Filter for licenses that are invalidated
	Invalidated *bool `pulumi:"invalidated"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

// A collection of values returned by getLicensingCotermLicenses.
type GetLicensingCotermLicensesResult struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// expired query parameter. Filter for licenses that are expired
	Expired *bool `pulumi:"expired"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// invalidated query parameter. Filter for licenses that are invalidated
	Invalidated *bool `pulumi:"invalidated"`
	// Array of ResponseLicensingGetOrganizationLicensingCotermLicenses
	Items []GetLicensingCotermLicensesItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage *int `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

func GetLicensingCotermLicensesOutput(ctx *pulumi.Context, args GetLicensingCotermLicensesOutputArgs, opts ...pulumi.InvokeOption) GetLicensingCotermLicensesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetLicensingCotermLicensesResultOutput, error) {
			args := v.(GetLicensingCotermLicensesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:organizations/getLicensingCotermLicenses:getLicensingCotermLicenses", args, GetLicensingCotermLicensesResultOutput{}, options).(GetLicensingCotermLicensesResultOutput), nil
		}).(GetLicensingCotermLicensesResultOutput)
}

// A collection of arguments for invoking getLicensingCotermLicenses.
type GetLicensingCotermLicensesOutputArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// expired query parameter. Filter for licenses that are expired
	Expired pulumi.BoolPtrInput `pulumi:"expired"`
	// invalidated query parameter. Filter for licenses that are invalidated
	Invalidated pulumi.BoolPtrInput `pulumi:"invalidated"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
}

func (GetLicensingCotermLicensesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLicensingCotermLicensesArgs)(nil)).Elem()
}

// A collection of values returned by getLicensingCotermLicenses.
type GetLicensingCotermLicensesResultOutput struct{ *pulumi.OutputState }

func (GetLicensingCotermLicensesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLicensingCotermLicensesResult)(nil)).Elem()
}

func (o GetLicensingCotermLicensesResultOutput) ToGetLicensingCotermLicensesResultOutput() GetLicensingCotermLicensesResultOutput {
	return o
}

func (o GetLicensingCotermLicensesResultOutput) ToGetLicensingCotermLicensesResultOutputWithContext(ctx context.Context) GetLicensingCotermLicensesResultOutput {
	return o
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetLicensingCotermLicensesResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLicensingCotermLicensesResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// expired query parameter. Filter for licenses that are expired
func (o GetLicensingCotermLicensesResultOutput) Expired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetLicensingCotermLicensesResult) *bool { return v.Expired }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetLicensingCotermLicensesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicensingCotermLicensesResult) string { return v.Id }).(pulumi.StringOutput)
}

// invalidated query parameter. Filter for licenses that are invalidated
func (o GetLicensingCotermLicensesResultOutput) Invalidated() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetLicensingCotermLicensesResult) *bool { return v.Invalidated }).(pulumi.BoolPtrOutput)
}

// Array of ResponseLicensingGetOrganizationLicensingCotermLicenses
func (o GetLicensingCotermLicensesResultOutput) Items() GetLicensingCotermLicensesItemArrayOutput {
	return o.ApplyT(func(v GetLicensingCotermLicensesResult) []GetLicensingCotermLicensesItem { return v.Items }).(GetLicensingCotermLicensesItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o GetLicensingCotermLicensesResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicensingCotermLicensesResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
func (o GetLicensingCotermLicensesResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetLicensingCotermLicensesResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o GetLicensingCotermLicensesResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLicensingCotermLicensesResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLicensingCotermLicensesResultOutput{})
}
