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
//			example, err := organizations.LookupApplianceVpnVpnFirewallRules(ctx, &organizations.LookupApplianceVpnVpnFirewallRulesArgs{
//				OrganizationId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsApplianceVpnVpnFirewallRulesExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupApplianceVpnVpnFirewallRules(ctx *pulumi.Context, args *LookupApplianceVpnVpnFirewallRulesArgs, opts ...pulumi.InvokeOption) (*LookupApplianceVpnVpnFirewallRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplianceVpnVpnFirewallRulesResult
	err := ctx.Invoke("meraki:organizations/getApplianceVpnVpnFirewallRules:getApplianceVpnVpnFirewallRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplianceVpnVpnFirewallRules.
type LookupApplianceVpnVpnFirewallRulesArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

// A collection of values returned by getApplianceVpnVpnFirewallRules.
type LookupApplianceVpnVpnFirewallRulesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                              `pulumi:"id"`
	Item GetApplianceVpnVpnFirewallRulesItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
}

func LookupApplianceVpnVpnFirewallRulesOutput(ctx *pulumi.Context, args LookupApplianceVpnVpnFirewallRulesOutputArgs, opts ...pulumi.InvokeOption) LookupApplianceVpnVpnFirewallRulesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupApplianceVpnVpnFirewallRulesResultOutput, error) {
			args := v.(LookupApplianceVpnVpnFirewallRulesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:organizations/getApplianceVpnVpnFirewallRules:getApplianceVpnVpnFirewallRules", args, LookupApplianceVpnVpnFirewallRulesResultOutput{}, options).(LookupApplianceVpnVpnFirewallRulesResultOutput), nil
		}).(LookupApplianceVpnVpnFirewallRulesResultOutput)
}

// A collection of arguments for invoking getApplianceVpnVpnFirewallRules.
type LookupApplianceVpnVpnFirewallRulesOutputArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
}

func (LookupApplianceVpnVpnFirewallRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceVpnVpnFirewallRulesArgs)(nil)).Elem()
}

// A collection of values returned by getApplianceVpnVpnFirewallRules.
type LookupApplianceVpnVpnFirewallRulesResultOutput struct{ *pulumi.OutputState }

func (LookupApplianceVpnVpnFirewallRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceVpnVpnFirewallRulesResult)(nil)).Elem()
}

func (o LookupApplianceVpnVpnFirewallRulesResultOutput) ToLookupApplianceVpnVpnFirewallRulesResultOutput() LookupApplianceVpnVpnFirewallRulesResultOutput {
	return o
}

func (o LookupApplianceVpnVpnFirewallRulesResultOutput) ToLookupApplianceVpnVpnFirewallRulesResultOutputWithContext(ctx context.Context) LookupApplianceVpnVpnFirewallRulesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApplianceVpnVpnFirewallRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceVpnVpnFirewallRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupApplianceVpnVpnFirewallRulesResultOutput) Item() GetApplianceVpnVpnFirewallRulesItemOutput {
	return o.ApplyT(func(v LookupApplianceVpnVpnFirewallRulesResult) GetApplianceVpnVpnFirewallRulesItem { return v.Item }).(GetApplianceVpnVpnFirewallRulesItemOutput)
}

// organizationId path parameter. Organization ID
func (o LookupApplianceVpnVpnFirewallRulesResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceVpnVpnFirewallRulesResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplianceVpnVpnFirewallRulesResultOutput{})
}
