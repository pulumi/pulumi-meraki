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

// ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
// already existed previously.
//
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
//			example, err := networks.NewDevicesClaim(ctx, "example", &networks.DevicesClaimArgs{
//				NetworkId: pulumi.String("string"),
//				Parameters: &networks.DevicesClaimParametersArgs{
//					Serials: pulumi.StringArray{
//						pulumi.String("Q234-ABCD-0001"),
//						pulumi.String("Q234-ABCD-0002"),
//						pulumi.String("Q234-ABCD-0003"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksDevicesClaimExample", example)
//			return nil
//		})
//	}
//
// ```
type DevicesClaim struct {
	pulumi.CustomResourceState

	Item DevicesClaimItemOutput `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringOutput          `pulumi:"networkId"`
	Parameters DevicesClaimParametersOutput `pulumi:"parameters"`
}

// NewDevicesClaim registers a new resource with the given unique name, arguments, and options.
func NewDevicesClaim(ctx *pulumi.Context,
	name string, args *DevicesClaimArgs, opts ...pulumi.ResourceOption) (*DevicesClaim, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	if args.Parameters == nil {
		return nil, errors.New("invalid value for required argument 'Parameters'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DevicesClaim
	err := ctx.RegisterResource("meraki:networks/devicesClaim:DevicesClaim", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDevicesClaim gets an existing DevicesClaim resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDevicesClaim(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DevicesClaimState, opts ...pulumi.ResourceOption) (*DevicesClaim, error) {
	var resource DevicesClaim
	err := ctx.ReadResource("meraki:networks/devicesClaim:DevicesClaim", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DevicesClaim resources.
type devicesClaimState struct {
	Item *DevicesClaimItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  *string                 `pulumi:"networkId"`
	Parameters *DevicesClaimParameters `pulumi:"parameters"`
}

type DevicesClaimState struct {
	Item DevicesClaimItemPtrInput
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringPtrInput
	Parameters DevicesClaimParametersPtrInput
}

func (DevicesClaimState) ElementType() reflect.Type {
	return reflect.TypeOf((*devicesClaimState)(nil)).Elem()
}

type devicesClaimArgs struct {
	// networkId path parameter. Network ID
	NetworkId  string                 `pulumi:"networkId"`
	Parameters DevicesClaimParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a DevicesClaim resource.
type DevicesClaimArgs struct {
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringInput
	Parameters DevicesClaimParametersInput
}

func (DevicesClaimArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*devicesClaimArgs)(nil)).Elem()
}

type DevicesClaimInput interface {
	pulumi.Input

	ToDevicesClaimOutput() DevicesClaimOutput
	ToDevicesClaimOutputWithContext(ctx context.Context) DevicesClaimOutput
}

func (*DevicesClaim) ElementType() reflect.Type {
	return reflect.TypeOf((**DevicesClaim)(nil)).Elem()
}

func (i *DevicesClaim) ToDevicesClaimOutput() DevicesClaimOutput {
	return i.ToDevicesClaimOutputWithContext(context.Background())
}

func (i *DevicesClaim) ToDevicesClaimOutputWithContext(ctx context.Context) DevicesClaimOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicesClaimOutput)
}

// DevicesClaimArrayInput is an input type that accepts DevicesClaimArray and DevicesClaimArrayOutput values.
// You can construct a concrete instance of `DevicesClaimArrayInput` via:
//
//	DevicesClaimArray{ DevicesClaimArgs{...} }
type DevicesClaimArrayInput interface {
	pulumi.Input

	ToDevicesClaimArrayOutput() DevicesClaimArrayOutput
	ToDevicesClaimArrayOutputWithContext(context.Context) DevicesClaimArrayOutput
}

type DevicesClaimArray []DevicesClaimInput

func (DevicesClaimArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DevicesClaim)(nil)).Elem()
}

func (i DevicesClaimArray) ToDevicesClaimArrayOutput() DevicesClaimArrayOutput {
	return i.ToDevicesClaimArrayOutputWithContext(context.Background())
}

func (i DevicesClaimArray) ToDevicesClaimArrayOutputWithContext(ctx context.Context) DevicesClaimArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicesClaimArrayOutput)
}

// DevicesClaimMapInput is an input type that accepts DevicesClaimMap and DevicesClaimMapOutput values.
// You can construct a concrete instance of `DevicesClaimMapInput` via:
//
//	DevicesClaimMap{ "key": DevicesClaimArgs{...} }
type DevicesClaimMapInput interface {
	pulumi.Input

	ToDevicesClaimMapOutput() DevicesClaimMapOutput
	ToDevicesClaimMapOutputWithContext(context.Context) DevicesClaimMapOutput
}

type DevicesClaimMap map[string]DevicesClaimInput

func (DevicesClaimMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DevicesClaim)(nil)).Elem()
}

func (i DevicesClaimMap) ToDevicesClaimMapOutput() DevicesClaimMapOutput {
	return i.ToDevicesClaimMapOutputWithContext(context.Background())
}

func (i DevicesClaimMap) ToDevicesClaimMapOutputWithContext(ctx context.Context) DevicesClaimMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicesClaimMapOutput)
}

type DevicesClaimOutput struct{ *pulumi.OutputState }

func (DevicesClaimOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DevicesClaim)(nil)).Elem()
}

func (o DevicesClaimOutput) ToDevicesClaimOutput() DevicesClaimOutput {
	return o
}

func (o DevicesClaimOutput) ToDevicesClaimOutputWithContext(ctx context.Context) DevicesClaimOutput {
	return o
}

func (o DevicesClaimOutput) Item() DevicesClaimItemOutput {
	return o.ApplyT(func(v *DevicesClaim) DevicesClaimItemOutput { return v.Item }).(DevicesClaimItemOutput)
}

// networkId path parameter. Network ID
func (o DevicesClaimOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *DevicesClaim) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

func (o DevicesClaimOutput) Parameters() DevicesClaimParametersOutput {
	return o.ApplyT(func(v *DevicesClaim) DevicesClaimParametersOutput { return v.Parameters }).(DevicesClaimParametersOutput)
}

type DevicesClaimArrayOutput struct{ *pulumi.OutputState }

func (DevicesClaimArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DevicesClaim)(nil)).Elem()
}

func (o DevicesClaimArrayOutput) ToDevicesClaimArrayOutput() DevicesClaimArrayOutput {
	return o
}

func (o DevicesClaimArrayOutput) ToDevicesClaimArrayOutputWithContext(ctx context.Context) DevicesClaimArrayOutput {
	return o
}

func (o DevicesClaimArrayOutput) Index(i pulumi.IntInput) DevicesClaimOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DevicesClaim {
		return vs[0].([]*DevicesClaim)[vs[1].(int)]
	}).(DevicesClaimOutput)
}

type DevicesClaimMapOutput struct{ *pulumi.OutputState }

func (DevicesClaimMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DevicesClaim)(nil)).Elem()
}

func (o DevicesClaimMapOutput) ToDevicesClaimMapOutput() DevicesClaimMapOutput {
	return o
}

func (o DevicesClaimMapOutput) ToDevicesClaimMapOutputWithContext(ctx context.Context) DevicesClaimMapOutput {
	return o
}

func (o DevicesClaimMapOutput) MapIndex(k pulumi.StringInput) DevicesClaimOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DevicesClaim {
		return vs[0].(map[string]*DevicesClaim)[vs[1].(string)]
	}).(DevicesClaimOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DevicesClaimInput)(nil)).Elem(), &DevicesClaim{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevicesClaimArrayInput)(nil)).Elem(), DevicesClaimArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevicesClaimMapInput)(nil)).Elem(), DevicesClaimMap{})
	pulumi.RegisterOutputType(DevicesClaimOutput{})
	pulumi.RegisterOutputType(DevicesClaimArrayOutput{})
	pulumi.RegisterOutputType(DevicesClaimMapOutput{})
}
