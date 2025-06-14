// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devices

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
func LookupSwitchPorts(ctx *pulumi.Context, args *LookupSwitchPortsArgs, opts ...pulumi.InvokeOption) (*LookupSwitchPortsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSwitchPortsResult
	err := ctx.Invoke("meraki:devices/getSwitchPorts:getSwitchPorts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSwitchPorts.
type LookupSwitchPortsArgs struct {
	// portId path parameter. Port ID
	PortId *string `pulumi:"portId"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

// A collection of values returned by getSwitchPorts.
type LookupSwitchPortsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string             `pulumi:"id"`
	Item GetSwitchPortsItem `pulumi:"item"`
	// Array of ResponseSwitchGetDeviceSwitchPorts
	Items []GetSwitchPortsItem `pulumi:"items"`
	// portId path parameter. Port ID
	PortId *string `pulumi:"portId"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

func LookupSwitchPortsOutput(ctx *pulumi.Context, args LookupSwitchPortsOutputArgs, opts ...pulumi.InvokeOption) LookupSwitchPortsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSwitchPortsResultOutput, error) {
			args := v.(LookupSwitchPortsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:devices/getSwitchPorts:getSwitchPorts", args, LookupSwitchPortsResultOutput{}, options).(LookupSwitchPortsResultOutput), nil
		}).(LookupSwitchPortsResultOutput)
}

// A collection of arguments for invoking getSwitchPorts.
type LookupSwitchPortsOutputArgs struct {
	// portId path parameter. Port ID
	PortId pulumi.StringPtrInput `pulumi:"portId"`
	// serial path parameter.
	Serial pulumi.StringPtrInput `pulumi:"serial"`
}

func (LookupSwitchPortsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchPortsArgs)(nil)).Elem()
}

// A collection of values returned by getSwitchPorts.
type LookupSwitchPortsResultOutput struct{ *pulumi.OutputState }

func (LookupSwitchPortsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSwitchPortsResult)(nil)).Elem()
}

func (o LookupSwitchPortsResultOutput) ToLookupSwitchPortsResultOutput() LookupSwitchPortsResultOutput {
	return o
}

func (o LookupSwitchPortsResultOutput) ToLookupSwitchPortsResultOutputWithContext(ctx context.Context) LookupSwitchPortsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSwitchPortsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSwitchPortsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSwitchPortsResultOutput) Item() GetSwitchPortsItemOutput {
	return o.ApplyT(func(v LookupSwitchPortsResult) GetSwitchPortsItem { return v.Item }).(GetSwitchPortsItemOutput)
}

// Array of ResponseSwitchGetDeviceSwitchPorts
func (o LookupSwitchPortsResultOutput) Items() GetSwitchPortsItemArrayOutput {
	return o.ApplyT(func(v LookupSwitchPortsResult) []GetSwitchPortsItem { return v.Items }).(GetSwitchPortsItemArrayOutput)
}

// portId path parameter. Port ID
func (o LookupSwitchPortsResultOutput) PortId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSwitchPortsResult) *string { return v.PortId }).(pulumi.StringPtrOutput)
}

// serial path parameter.
func (o LookupSwitchPortsResultOutput) Serial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSwitchPortsResult) *string { return v.Serial }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSwitchPortsResultOutput{})
}
