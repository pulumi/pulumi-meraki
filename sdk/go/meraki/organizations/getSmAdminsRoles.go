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
//			example, err := organizations.LookupSmAdminsRoles(ctx, &organizations.LookupSmAdminsRolesArgs{
//				EndingBefore:   pulumi.StringRef("string"),
//				OrganizationId: pulumi.StringRef("string"),
//				PerPage:        pulumi.IntRef(1),
//				StartingAfter:  pulumi.StringRef("string"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsSmAdminsRolesExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupSmAdminsRoles(ctx *pulumi.Context, args *LookupSmAdminsRolesArgs, opts ...pulumi.InvokeOption) (*LookupSmAdminsRolesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSmAdminsRolesResult
	err := ctx.Invoke("meraki:organizations/getSmAdminsRoles:getSmAdminsRoles", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSmAdminsRoles.
type LookupSmAdminsRolesArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
	PerPage *int `pulumi:"perPage"`
	// roleId path parameter. Role ID
	RoleId *string `pulumi:"roleId"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

// A collection of values returned by getSmAdminsRoles.
type LookupSmAdminsRolesResult struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore *string `pulumi:"endingBefore"`
	// The provider-assigned unique ID for this managed resource.
	Id   string               `pulumi:"id"`
	Item GetSmAdminsRolesItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
	PerPage *int `pulumi:"perPage"`
	// roleId path parameter. Role ID
	RoleId *string `pulumi:"roleId"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter *string `pulumi:"startingAfter"`
}

func LookupSmAdminsRolesOutput(ctx *pulumi.Context, args LookupSmAdminsRolesOutputArgs, opts ...pulumi.InvokeOption) LookupSmAdminsRolesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSmAdminsRolesResultOutput, error) {
			args := v.(LookupSmAdminsRolesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:organizations/getSmAdminsRoles:getSmAdminsRoles", args, LookupSmAdminsRolesResultOutput{}, options).(LookupSmAdminsRolesResultOutput), nil
		}).(LookupSmAdminsRolesResultOutput)
}

// A collection of arguments for invoking getSmAdminsRoles.
type LookupSmAdminsRolesOutputArgs struct {
	// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	EndingBefore pulumi.StringPtrInput `pulumi:"endingBefore"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput `pulumi:"organizationId"`
	// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
	PerPage pulumi.IntPtrInput `pulumi:"perPage"`
	// roleId path parameter. Role ID
	RoleId pulumi.StringPtrInput `pulumi:"roleId"`
	// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
	StartingAfter pulumi.StringPtrInput `pulumi:"startingAfter"`
}

func (LookupSmAdminsRolesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSmAdminsRolesArgs)(nil)).Elem()
}

// A collection of values returned by getSmAdminsRoles.
type LookupSmAdminsRolesResultOutput struct{ *pulumi.OutputState }

func (LookupSmAdminsRolesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSmAdminsRolesResult)(nil)).Elem()
}

func (o LookupSmAdminsRolesResultOutput) ToLookupSmAdminsRolesResultOutput() LookupSmAdminsRolesResultOutput {
	return o
}

func (o LookupSmAdminsRolesResultOutput) ToLookupSmAdminsRolesResultOutputWithContext(ctx context.Context) LookupSmAdminsRolesResultOutput {
	return o
}

// endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o LookupSmAdminsRolesResultOutput) EndingBefore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSmAdminsRolesResult) *string { return v.EndingBefore }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSmAdminsRolesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSmAdminsRolesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSmAdminsRolesResultOutput) Item() GetSmAdminsRolesItemOutput {
	return o.ApplyT(func(v LookupSmAdminsRolesResult) GetSmAdminsRolesItem { return v.Item }).(GetSmAdminsRolesItemOutput)
}

// organizationId path parameter. Organization ID
func (o LookupSmAdminsRolesResultOutput) OrganizationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSmAdminsRolesResult) *string { return v.OrganizationId }).(pulumi.StringPtrOutput)
}

// perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 50.
func (o LookupSmAdminsRolesResultOutput) PerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupSmAdminsRolesResult) *int { return v.PerPage }).(pulumi.IntPtrOutput)
}

// roleId path parameter. Role ID
func (o LookupSmAdminsRolesResultOutput) RoleId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSmAdminsRolesResult) *string { return v.RoleId }).(pulumi.StringPtrOutput)
}

// startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
func (o LookupSmAdminsRolesResultOutput) StartingAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSmAdminsRolesResult) *string { return v.StartingAfter }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSmAdminsRolesResultOutput{})
}
