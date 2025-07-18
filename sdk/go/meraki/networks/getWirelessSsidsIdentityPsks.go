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
func LookupWirelessSsidsIdentityPsks(ctx *pulumi.Context, args *LookupWirelessSsidsIdentityPsksArgs, opts ...pulumi.InvokeOption) (*LookupWirelessSsidsIdentityPsksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWirelessSsidsIdentityPsksResult
	err := ctx.Invoke("meraki:networks/getWirelessSsidsIdentityPsks:getWirelessSsidsIdentityPsks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWirelessSsidsIdentityPsks.
type LookupWirelessSsidsIdentityPsksArgs struct {
	// identityPskId path parameter. Identity psk ID
	IdentityPskId *string `pulumi:"identityPskId"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// number path parameter.
	Number *string `pulumi:"number"`
}

// A collection of values returned by getWirelessSsidsIdentityPsks.
type LookupWirelessSsidsIdentityPsksResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// identityPskId path parameter. Identity psk ID
	IdentityPskId *string                          `pulumi:"identityPskId"`
	Item          GetWirelessSsidsIdentityPsksItem `pulumi:"item"`
	// Array of ResponseWirelessGetNetworkWirelessSsidIdentityPsks
	Items []GetWirelessSsidsIdentityPsksItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// number path parameter.
	Number *string `pulumi:"number"`
}

func LookupWirelessSsidsIdentityPsksOutput(ctx *pulumi.Context, args LookupWirelessSsidsIdentityPsksOutputArgs, opts ...pulumi.InvokeOption) LookupWirelessSsidsIdentityPsksResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupWirelessSsidsIdentityPsksResultOutput, error) {
			args := v.(LookupWirelessSsidsIdentityPsksArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getWirelessSsidsIdentityPsks:getWirelessSsidsIdentityPsks", args, LookupWirelessSsidsIdentityPsksResultOutput{}, options).(LookupWirelessSsidsIdentityPsksResultOutput), nil
		}).(LookupWirelessSsidsIdentityPsksResultOutput)
}

// A collection of arguments for invoking getWirelessSsidsIdentityPsks.
type LookupWirelessSsidsIdentityPsksOutputArgs struct {
	// identityPskId path parameter. Identity psk ID
	IdentityPskId pulumi.StringPtrInput `pulumi:"identityPskId"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput `pulumi:"networkId"`
	// number path parameter.
	Number pulumi.StringPtrInput `pulumi:"number"`
}

func (LookupWirelessSsidsIdentityPsksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsIdentityPsksArgs)(nil)).Elem()
}

// A collection of values returned by getWirelessSsidsIdentityPsks.
type LookupWirelessSsidsIdentityPsksResultOutput struct{ *pulumi.OutputState }

func (LookupWirelessSsidsIdentityPsksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWirelessSsidsIdentityPsksResult)(nil)).Elem()
}

func (o LookupWirelessSsidsIdentityPsksResultOutput) ToLookupWirelessSsidsIdentityPsksResultOutput() LookupWirelessSsidsIdentityPsksResultOutput {
	return o
}

func (o LookupWirelessSsidsIdentityPsksResultOutput) ToLookupWirelessSsidsIdentityPsksResultOutputWithContext(ctx context.Context) LookupWirelessSsidsIdentityPsksResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWirelessSsidsIdentityPsksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWirelessSsidsIdentityPsksResult) string { return v.Id }).(pulumi.StringOutput)
}

// identityPskId path parameter. Identity psk ID
func (o LookupWirelessSsidsIdentityPsksResultOutput) IdentityPskId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupWirelessSsidsIdentityPsksResult) *string { return v.IdentityPskId }).(pulumi.StringPtrOutput)
}

func (o LookupWirelessSsidsIdentityPsksResultOutput) Item() GetWirelessSsidsIdentityPsksItemOutput {
	return o.ApplyT(func(v LookupWirelessSsidsIdentityPsksResult) GetWirelessSsidsIdentityPsksItem { return v.Item }).(GetWirelessSsidsIdentityPsksItemOutput)
}

// Array of ResponseWirelessGetNetworkWirelessSsidIdentityPsks
func (o LookupWirelessSsidsIdentityPsksResultOutput) Items() GetWirelessSsidsIdentityPsksItemArrayOutput {
	return o.ApplyT(func(v LookupWirelessSsidsIdentityPsksResult) []GetWirelessSsidsIdentityPsksItem { return v.Items }).(GetWirelessSsidsIdentityPsksItemArrayOutput)
}

// networkId path parameter. Network ID
func (o LookupWirelessSsidsIdentityPsksResultOutput) NetworkId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupWirelessSsidsIdentityPsksResult) *string { return v.NetworkId }).(pulumi.StringPtrOutput)
}

// number path parameter.
func (o LookupWirelessSsidsIdentityPsksResultOutput) Number() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupWirelessSsidsIdentityPsksResult) *string { return v.Number }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWirelessSsidsIdentityPsksResultOutput{})
}
