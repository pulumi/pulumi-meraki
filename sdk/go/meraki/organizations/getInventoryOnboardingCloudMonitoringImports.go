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
//			example, err := organizations.LookupInventoryOnboardingCloudMonitoringImports(ctx, &organizations.LookupInventoryOnboardingCloudMonitoringImportsArgs{
//				ImportIds: []string{
//					"string",
//				},
//				OrganizationId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsInventoryOnboardingCloudMonitoringImportsExample", example.Items)
//			return nil
//		})
//	}
//
// ```
func LookupInventoryOnboardingCloudMonitoringImports(ctx *pulumi.Context, args *LookupInventoryOnboardingCloudMonitoringImportsArgs, opts ...pulumi.InvokeOption) (*LookupInventoryOnboardingCloudMonitoringImportsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupInventoryOnboardingCloudMonitoringImportsResult
	err := ctx.Invoke("meraki:organizations/getInventoryOnboardingCloudMonitoringImports:getInventoryOnboardingCloudMonitoringImports", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInventoryOnboardingCloudMonitoringImports.
type LookupInventoryOnboardingCloudMonitoringImportsArgs struct {
	// importIds query parameter. import ids from an imports
	ImportIds []string `pulumi:"importIds"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

// A collection of values returned by getInventoryOnboardingCloudMonitoringImports.
type LookupInventoryOnboardingCloudMonitoringImportsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// importIds query parameter. import ids from an imports
	ImportIds []string `pulumi:"importIds"`
	// Array of ResponseOrganizationsGetOrganizationInventoryOnboardingCloudMonitoringImports
	Items []GetInventoryOnboardingCloudMonitoringImportsItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

func LookupInventoryOnboardingCloudMonitoringImportsOutput(ctx *pulumi.Context, args LookupInventoryOnboardingCloudMonitoringImportsOutputArgs, opts ...pulumi.InvokeOption) LookupInventoryOnboardingCloudMonitoringImportsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupInventoryOnboardingCloudMonitoringImportsResultOutput, error) {
			args := v.(LookupInventoryOnboardingCloudMonitoringImportsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:organizations/getInventoryOnboardingCloudMonitoringImports:getInventoryOnboardingCloudMonitoringImports", args, LookupInventoryOnboardingCloudMonitoringImportsResultOutput{}, options).(LookupInventoryOnboardingCloudMonitoringImportsResultOutput), nil
		}).(LookupInventoryOnboardingCloudMonitoringImportsResultOutput)
}

// A collection of arguments for invoking getInventoryOnboardingCloudMonitoringImports.
type LookupInventoryOnboardingCloudMonitoringImportsOutputArgs struct {
	// importIds query parameter. import ids from an imports
	ImportIds pulumi.StringArrayInput `pulumi:"importIds"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
}

func (LookupInventoryOnboardingCloudMonitoringImportsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInventoryOnboardingCloudMonitoringImportsArgs)(nil)).Elem()
}

// A collection of values returned by getInventoryOnboardingCloudMonitoringImports.
type LookupInventoryOnboardingCloudMonitoringImportsResultOutput struct{ *pulumi.OutputState }

func (LookupInventoryOnboardingCloudMonitoringImportsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInventoryOnboardingCloudMonitoringImportsResult)(nil)).Elem()
}

func (o LookupInventoryOnboardingCloudMonitoringImportsResultOutput) ToLookupInventoryOnboardingCloudMonitoringImportsResultOutput() LookupInventoryOnboardingCloudMonitoringImportsResultOutput {
	return o
}

func (o LookupInventoryOnboardingCloudMonitoringImportsResultOutput) ToLookupInventoryOnboardingCloudMonitoringImportsResultOutputWithContext(ctx context.Context) LookupInventoryOnboardingCloudMonitoringImportsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupInventoryOnboardingCloudMonitoringImportsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInventoryOnboardingCloudMonitoringImportsResult) string { return v.Id }).(pulumi.StringOutput)
}

// importIds query parameter. import ids from an imports
func (o LookupInventoryOnboardingCloudMonitoringImportsResultOutput) ImportIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupInventoryOnboardingCloudMonitoringImportsResult) []string { return v.ImportIds }).(pulumi.StringArrayOutput)
}

// Array of ResponseOrganizationsGetOrganizationInventoryOnboardingCloudMonitoringImports
func (o LookupInventoryOnboardingCloudMonitoringImportsResultOutput) Items() GetInventoryOnboardingCloudMonitoringImportsItemArrayOutput {
	return o.ApplyT(func(v LookupInventoryOnboardingCloudMonitoringImportsResult) []GetInventoryOnboardingCloudMonitoringImportsItem {
		return v.Items
	}).(GetInventoryOnboardingCloudMonitoringImportsItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o LookupInventoryOnboardingCloudMonitoringImportsResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInventoryOnboardingCloudMonitoringImportsResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInventoryOnboardingCloudMonitoringImportsResultOutput{})
}
