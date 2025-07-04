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
//			example, err := networks.LookupApplianceSettings(ctx, &networks.LookupApplianceSettingsArgs{
//				NetworkId: "string",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksApplianceSettingsExample", example.Item)
//			return nil
//		})
//	}
//
// ```
func LookupApplianceSettings(ctx *pulumi.Context, args *LookupApplianceSettingsArgs, opts ...pulumi.InvokeOption) (*LookupApplianceSettingsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplianceSettingsResult
	err := ctx.Invoke("meraki:networks/getApplianceSettings:getApplianceSettings", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplianceSettings.
type LookupApplianceSettingsArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// A collection of values returned by getApplianceSettings.
type LookupApplianceSettingsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string                   `pulumi:"id"`
	Item GetApplianceSettingsItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

func LookupApplianceSettingsOutput(ctx *pulumi.Context, args LookupApplianceSettingsOutputArgs, opts ...pulumi.InvokeOption) LookupApplianceSettingsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupApplianceSettingsResultOutput, error) {
			args := v.(LookupApplianceSettingsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getApplianceSettings:getApplianceSettings", args, LookupApplianceSettingsResultOutput{}, options).(LookupApplianceSettingsResultOutput), nil
		}).(LookupApplianceSettingsResultOutput)
}

// A collection of arguments for invoking getApplianceSettings.
type LookupApplianceSettingsOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput `pulumi:"networkId"`
}

func (LookupApplianceSettingsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceSettingsArgs)(nil)).Elem()
}

// A collection of values returned by getApplianceSettings.
type LookupApplianceSettingsResultOutput struct{ *pulumi.OutputState }

func (LookupApplianceSettingsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplianceSettingsResult)(nil)).Elem()
}

func (o LookupApplianceSettingsResultOutput) ToLookupApplianceSettingsResultOutput() LookupApplianceSettingsResultOutput {
	return o
}

func (o LookupApplianceSettingsResultOutput) ToLookupApplianceSettingsResultOutputWithContext(ctx context.Context) LookupApplianceSettingsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApplianceSettingsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceSettingsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupApplianceSettingsResultOutput) Item() GetApplianceSettingsItemOutput {
	return o.ApplyT(func(v LookupApplianceSettingsResult) GetApplianceSettingsItem { return v.Item }).(GetApplianceSettingsItemOutput)
}

// networkId path parameter. Network ID
func (o LookupApplianceSettingsResultOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplianceSettingsResult) string { return v.NetworkId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplianceSettingsResultOutput{})
}
