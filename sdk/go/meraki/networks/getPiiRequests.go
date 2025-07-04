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
func GetPiiRequests(ctx *pulumi.Context, args *GetPiiRequestsArgs, opts ...pulumi.InvokeOption) (*GetPiiRequestsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPiiRequestsResult
	err := ctx.Invoke("meraki:networks/getPiiRequests:getPiiRequests", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPiiRequests.
type GetPiiRequestsArgs struct {
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// requestId path parameter. Request ID
	RequestId *string `pulumi:"requestId"`
}

// A collection of values returned by getPiiRequests.
type GetPiiRequestsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string             `pulumi:"id"`
	Item GetPiiRequestsItem `pulumi:"item"`
	// Array of ResponseNetworksGetNetworkPiiRequests
	Items []GetPiiRequestsItem `pulumi:"items"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// requestId path parameter. Request ID
	RequestId *string `pulumi:"requestId"`
}

func GetPiiRequestsOutput(ctx *pulumi.Context, args GetPiiRequestsOutputArgs, opts ...pulumi.InvokeOption) GetPiiRequestsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetPiiRequestsResultOutput, error) {
			args := v.(GetPiiRequestsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("meraki:networks/getPiiRequests:getPiiRequests", args, GetPiiRequestsResultOutput{}, options).(GetPiiRequestsResultOutput), nil
		}).(GetPiiRequestsResultOutput)
}

// A collection of arguments for invoking getPiiRequests.
type GetPiiRequestsOutputArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput `pulumi:"networkId"`
	// requestId path parameter. Request ID
	RequestId pulumi.StringPtrInput `pulumi:"requestId"`
}

func (GetPiiRequestsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPiiRequestsArgs)(nil)).Elem()
}

// A collection of values returned by getPiiRequests.
type GetPiiRequestsResultOutput struct{ *pulumi.OutputState }

func (GetPiiRequestsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPiiRequestsResult)(nil)).Elem()
}

func (o GetPiiRequestsResultOutput) ToGetPiiRequestsResultOutput() GetPiiRequestsResultOutput {
	return o
}

func (o GetPiiRequestsResultOutput) ToGetPiiRequestsResultOutputWithContext(ctx context.Context) GetPiiRequestsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPiiRequestsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPiiRequestsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPiiRequestsResultOutput) Item() GetPiiRequestsItemOutput {
	return o.ApplyT(func(v GetPiiRequestsResult) GetPiiRequestsItem { return v.Item }).(GetPiiRequestsItemOutput)
}

// Array of ResponseNetworksGetNetworkPiiRequests
func (o GetPiiRequestsResultOutput) Items() GetPiiRequestsItemArrayOutput {
	return o.ApplyT(func(v GetPiiRequestsResult) []GetPiiRequestsItem { return v.Items }).(GetPiiRequestsItemArrayOutput)
}

// networkId path parameter. Network ID
func (o GetPiiRequestsResultOutput) NetworkId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPiiRequestsResult) *string { return v.NetworkId }).(pulumi.StringPtrOutput)
}

// requestId path parameter. Request ID
func (o GetPiiRequestsResultOutput) RequestId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPiiRequestsResult) *string { return v.RequestId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPiiRequestsResultOutput{})
}
