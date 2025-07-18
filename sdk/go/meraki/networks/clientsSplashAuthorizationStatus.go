// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/clientsSplashAuthorizationStatus:ClientsSplashAuthorizationStatus example "client_id,network_id"
// ```
type ClientsSplashAuthorizationStatus struct {
	pulumi.CustomResourceState

	// clientId path parameter. Client ID
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// The target SSIDs. Each SSID must be enabled and must have Click-through splash enabled. For each SSID where isAuthorized is true, the expiration time will automatically be set according to the SSID's splash frequency. Not all networks support configuring all SSIDs
	Ssids ClientsSplashAuthorizationStatusSsidsOutput `pulumi:"ssids"`
}

// NewClientsSplashAuthorizationStatus registers a new resource with the given unique name, arguments, and options.
func NewClientsSplashAuthorizationStatus(ctx *pulumi.Context,
	name string, args *ClientsSplashAuthorizationStatusArgs, opts ...pulumi.ResourceOption) (*ClientsSplashAuthorizationStatus, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClientId == nil {
		return nil, errors.New("invalid value for required argument 'ClientId'")
	}
	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClientsSplashAuthorizationStatus
	err := ctx.RegisterResource("meraki:networks/clientsSplashAuthorizationStatus:ClientsSplashAuthorizationStatus", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClientsSplashAuthorizationStatus gets an existing ClientsSplashAuthorizationStatus resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClientsSplashAuthorizationStatus(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClientsSplashAuthorizationStatusState, opts ...pulumi.ResourceOption) (*ClientsSplashAuthorizationStatus, error) {
	var resource ClientsSplashAuthorizationStatus
	err := ctx.ReadResource("meraki:networks/clientsSplashAuthorizationStatus:ClientsSplashAuthorizationStatus", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClientsSplashAuthorizationStatus resources.
type clientsSplashAuthorizationStatusState struct {
	// clientId path parameter. Client ID
	ClientId *string `pulumi:"clientId"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// The target SSIDs. Each SSID must be enabled and must have Click-through splash enabled. For each SSID where isAuthorized is true, the expiration time will automatically be set according to the SSID's splash frequency. Not all networks support configuring all SSIDs
	Ssids *ClientsSplashAuthorizationStatusSsids `pulumi:"ssids"`
}

type ClientsSplashAuthorizationStatusState struct {
	// clientId path parameter. Client ID
	ClientId pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// The target SSIDs. Each SSID must be enabled and must have Click-through splash enabled. For each SSID where isAuthorized is true, the expiration time will automatically be set according to the SSID's splash frequency. Not all networks support configuring all SSIDs
	Ssids ClientsSplashAuthorizationStatusSsidsPtrInput
}

func (ClientsSplashAuthorizationStatusState) ElementType() reflect.Type {
	return reflect.TypeOf((*clientsSplashAuthorizationStatusState)(nil)).Elem()
}

type clientsSplashAuthorizationStatusArgs struct {
	// clientId path parameter. Client ID
	ClientId string `pulumi:"clientId"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// The target SSIDs. Each SSID must be enabled and must have Click-through splash enabled. For each SSID where isAuthorized is true, the expiration time will automatically be set according to the SSID's splash frequency. Not all networks support configuring all SSIDs
	Ssids *ClientsSplashAuthorizationStatusSsids `pulumi:"ssids"`
}

// The set of arguments for constructing a ClientsSplashAuthorizationStatus resource.
type ClientsSplashAuthorizationStatusArgs struct {
	// clientId path parameter. Client ID
	ClientId pulumi.StringInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// The target SSIDs. Each SSID must be enabled and must have Click-through splash enabled. For each SSID where isAuthorized is true, the expiration time will automatically be set according to the SSID's splash frequency. Not all networks support configuring all SSIDs
	Ssids ClientsSplashAuthorizationStatusSsidsPtrInput
}

func (ClientsSplashAuthorizationStatusArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clientsSplashAuthorizationStatusArgs)(nil)).Elem()
}

type ClientsSplashAuthorizationStatusInput interface {
	pulumi.Input

	ToClientsSplashAuthorizationStatusOutput() ClientsSplashAuthorizationStatusOutput
	ToClientsSplashAuthorizationStatusOutputWithContext(ctx context.Context) ClientsSplashAuthorizationStatusOutput
}

func (*ClientsSplashAuthorizationStatus) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientsSplashAuthorizationStatus)(nil)).Elem()
}

func (i *ClientsSplashAuthorizationStatus) ToClientsSplashAuthorizationStatusOutput() ClientsSplashAuthorizationStatusOutput {
	return i.ToClientsSplashAuthorizationStatusOutputWithContext(context.Background())
}

func (i *ClientsSplashAuthorizationStatus) ToClientsSplashAuthorizationStatusOutputWithContext(ctx context.Context) ClientsSplashAuthorizationStatusOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientsSplashAuthorizationStatusOutput)
}

// ClientsSplashAuthorizationStatusArrayInput is an input type that accepts ClientsSplashAuthorizationStatusArray and ClientsSplashAuthorizationStatusArrayOutput values.
// You can construct a concrete instance of `ClientsSplashAuthorizationStatusArrayInput` via:
//
//	ClientsSplashAuthorizationStatusArray{ ClientsSplashAuthorizationStatusArgs{...} }
type ClientsSplashAuthorizationStatusArrayInput interface {
	pulumi.Input

	ToClientsSplashAuthorizationStatusArrayOutput() ClientsSplashAuthorizationStatusArrayOutput
	ToClientsSplashAuthorizationStatusArrayOutputWithContext(context.Context) ClientsSplashAuthorizationStatusArrayOutput
}

type ClientsSplashAuthorizationStatusArray []ClientsSplashAuthorizationStatusInput

func (ClientsSplashAuthorizationStatusArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientsSplashAuthorizationStatus)(nil)).Elem()
}

func (i ClientsSplashAuthorizationStatusArray) ToClientsSplashAuthorizationStatusArrayOutput() ClientsSplashAuthorizationStatusArrayOutput {
	return i.ToClientsSplashAuthorizationStatusArrayOutputWithContext(context.Background())
}

func (i ClientsSplashAuthorizationStatusArray) ToClientsSplashAuthorizationStatusArrayOutputWithContext(ctx context.Context) ClientsSplashAuthorizationStatusArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientsSplashAuthorizationStatusArrayOutput)
}

// ClientsSplashAuthorizationStatusMapInput is an input type that accepts ClientsSplashAuthorizationStatusMap and ClientsSplashAuthorizationStatusMapOutput values.
// You can construct a concrete instance of `ClientsSplashAuthorizationStatusMapInput` via:
//
//	ClientsSplashAuthorizationStatusMap{ "key": ClientsSplashAuthorizationStatusArgs{...} }
type ClientsSplashAuthorizationStatusMapInput interface {
	pulumi.Input

	ToClientsSplashAuthorizationStatusMapOutput() ClientsSplashAuthorizationStatusMapOutput
	ToClientsSplashAuthorizationStatusMapOutputWithContext(context.Context) ClientsSplashAuthorizationStatusMapOutput
}

type ClientsSplashAuthorizationStatusMap map[string]ClientsSplashAuthorizationStatusInput

func (ClientsSplashAuthorizationStatusMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientsSplashAuthorizationStatus)(nil)).Elem()
}

func (i ClientsSplashAuthorizationStatusMap) ToClientsSplashAuthorizationStatusMapOutput() ClientsSplashAuthorizationStatusMapOutput {
	return i.ToClientsSplashAuthorizationStatusMapOutputWithContext(context.Background())
}

func (i ClientsSplashAuthorizationStatusMap) ToClientsSplashAuthorizationStatusMapOutputWithContext(ctx context.Context) ClientsSplashAuthorizationStatusMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientsSplashAuthorizationStatusMapOutput)
}

type ClientsSplashAuthorizationStatusOutput struct{ *pulumi.OutputState }

func (ClientsSplashAuthorizationStatusOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientsSplashAuthorizationStatus)(nil)).Elem()
}

func (o ClientsSplashAuthorizationStatusOutput) ToClientsSplashAuthorizationStatusOutput() ClientsSplashAuthorizationStatusOutput {
	return o
}

func (o ClientsSplashAuthorizationStatusOutput) ToClientsSplashAuthorizationStatusOutputWithContext(ctx context.Context) ClientsSplashAuthorizationStatusOutput {
	return o
}

// clientId path parameter. Client ID
func (o ClientsSplashAuthorizationStatusOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientsSplashAuthorizationStatus) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o ClientsSplashAuthorizationStatusOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientsSplashAuthorizationStatus) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// The target SSIDs. Each SSID must be enabled and must have Click-through splash enabled. For each SSID where isAuthorized is true, the expiration time will automatically be set according to the SSID's splash frequency. Not all networks support configuring all SSIDs
func (o ClientsSplashAuthorizationStatusOutput) Ssids() ClientsSplashAuthorizationStatusSsidsOutput {
	return o.ApplyT(func(v *ClientsSplashAuthorizationStatus) ClientsSplashAuthorizationStatusSsidsOutput { return v.Ssids }).(ClientsSplashAuthorizationStatusSsidsOutput)
}

type ClientsSplashAuthorizationStatusArrayOutput struct{ *pulumi.OutputState }

func (ClientsSplashAuthorizationStatusArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientsSplashAuthorizationStatus)(nil)).Elem()
}

func (o ClientsSplashAuthorizationStatusArrayOutput) ToClientsSplashAuthorizationStatusArrayOutput() ClientsSplashAuthorizationStatusArrayOutput {
	return o
}

func (o ClientsSplashAuthorizationStatusArrayOutput) ToClientsSplashAuthorizationStatusArrayOutputWithContext(ctx context.Context) ClientsSplashAuthorizationStatusArrayOutput {
	return o
}

func (o ClientsSplashAuthorizationStatusArrayOutput) Index(i pulumi.IntInput) ClientsSplashAuthorizationStatusOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClientsSplashAuthorizationStatus {
		return vs[0].([]*ClientsSplashAuthorizationStatus)[vs[1].(int)]
	}).(ClientsSplashAuthorizationStatusOutput)
}

type ClientsSplashAuthorizationStatusMapOutput struct{ *pulumi.OutputState }

func (ClientsSplashAuthorizationStatusMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientsSplashAuthorizationStatus)(nil)).Elem()
}

func (o ClientsSplashAuthorizationStatusMapOutput) ToClientsSplashAuthorizationStatusMapOutput() ClientsSplashAuthorizationStatusMapOutput {
	return o
}

func (o ClientsSplashAuthorizationStatusMapOutput) ToClientsSplashAuthorizationStatusMapOutputWithContext(ctx context.Context) ClientsSplashAuthorizationStatusMapOutput {
	return o
}

func (o ClientsSplashAuthorizationStatusMapOutput) MapIndex(k pulumi.StringInput) ClientsSplashAuthorizationStatusOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClientsSplashAuthorizationStatus {
		return vs[0].(map[string]*ClientsSplashAuthorizationStatus)[vs[1].(string)]
	}).(ClientsSplashAuthorizationStatusOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClientsSplashAuthorizationStatusInput)(nil)).Elem(), &ClientsSplashAuthorizationStatus{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientsSplashAuthorizationStatusArrayInput)(nil)).Elem(), ClientsSplashAuthorizationStatusArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientsSplashAuthorizationStatusMapInput)(nil)).Elem(), ClientsSplashAuthorizationStatusMap{})
	pulumi.RegisterOutputType(ClientsSplashAuthorizationStatusOutput{})
	pulumi.RegisterOutputType(ClientsSplashAuthorizationStatusArrayOutput{})
	pulumi.RegisterOutputType(ClientsSplashAuthorizationStatusMapOutput{})
}
