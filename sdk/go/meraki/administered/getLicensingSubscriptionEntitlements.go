// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package administered

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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/administered"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := administered.GetLicensingSubscriptionEntitlements(ctx, &administered.GetLicensingSubscriptionEntitlementsArgs{
//				Skuses: []string{
//					"string",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiAdministeredLicensingSubscriptionEntitlementsExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func GetLicensingSubscriptionEntitlements(ctx *pulumi.Context, args *GetLicensingSubscriptionEntitlementsArgs, opts ...pulumi.InvokeOption) (*GetLicensingSubscriptionEntitlementsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLicensingSubscriptionEntitlementsResult
	err := ctx.Invoke("meraki:administered/getLicensingSubscriptionEntitlements:getLicensingSubscriptionEntitlements", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLicensingSubscriptionEntitlements.
type GetLicensingSubscriptionEntitlementsArgs struct {
	// skus query parameter. Filter to entitlements with the specified SKUs
	Skuses []string `pulumi:"skuses"`
}

// A collection of values returned by getLicensingSubscriptionEntitlements.
type GetLicensingSubscriptionEntitlementsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                                   `pulumi:"id"`
	Item GetLicensingSubscriptionEntitlementsItem `pulumi:"item"`
	// skus query parameter. Filter to entitlements with the specified SKUs
	Skuses []string `pulumi:"skuses"`
}

func GetLicensingSubscriptionEntitlementsOutput(ctx *pulumi.Context, args GetLicensingSubscriptionEntitlementsOutputArgs, opts ...pulumi.InvokeOption) GetLicensingSubscriptionEntitlementsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetLicensingSubscriptionEntitlementsResultOutput, error) {
			args := v.(GetLicensingSubscriptionEntitlementsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:administered/getLicensingSubscriptionEntitlements:getLicensingSubscriptionEntitlements", args, GetLicensingSubscriptionEntitlementsResultOutput{}, options).(GetLicensingSubscriptionEntitlementsResultOutput), nil
		}).(GetLicensingSubscriptionEntitlementsResultOutput)
}

// A collection of arguments for invoking getLicensingSubscriptionEntitlements.
type GetLicensingSubscriptionEntitlementsOutputArgs struct {
	// skus query parameter. Filter to entitlements with the specified SKUs
	Skuses pulumi.StringArrayInput `pulumi:"skuses"`
}

func (GetLicensingSubscriptionEntitlementsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLicensingSubscriptionEntitlementsArgs)(nil)).Elem()
}

// A collection of values returned by getLicensingSubscriptionEntitlements.
type GetLicensingSubscriptionEntitlementsResultOutput struct{ *pulumi.OutputState }

func (GetLicensingSubscriptionEntitlementsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLicensingSubscriptionEntitlementsResult)(nil)).Elem()
}

func (o GetLicensingSubscriptionEntitlementsResultOutput) ToGetLicensingSubscriptionEntitlementsResultOutput() GetLicensingSubscriptionEntitlementsResultOutput {
	return o
}

func (o GetLicensingSubscriptionEntitlementsResultOutput) ToGetLicensingSubscriptionEntitlementsResultOutputWithContext(ctx context.Context) GetLicensingSubscriptionEntitlementsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetLicensingSubscriptionEntitlementsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLicensingSubscriptionEntitlementsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetLicensingSubscriptionEntitlementsResultOutput) Item() GetLicensingSubscriptionEntitlementsItemOutput {
	return o.ApplyT(func(v GetLicensingSubscriptionEntitlementsResult) GetLicensingSubscriptionEntitlementsItem {
		return v.Item
	}).(GetLicensingSubscriptionEntitlementsItemOutput)
}

// skus query parameter. Filter to entitlements with the specified SKUs
func (o GetLicensingSubscriptionEntitlementsResultOutput) Skuses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLicensingSubscriptionEntitlementsResult) []string { return v.Skuses }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLicensingSubscriptionEntitlementsResultOutput{})
}
