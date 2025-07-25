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
//			example, err := networks.NewSmDevicesUnenroll(ctx, "example", &networks.SmDevicesUnenrollArgs{
//				DeviceId:  pulumi.String("string"),
//				NetworkId: pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSmDevicesUnenrollExample", example)
//			return nil
//		})
//	}
//
// ```
type SmDevicesUnenroll struct {
	pulumi.CustomResourceState

	// deviceId path parameter. Device ID
	DeviceId pulumi.StringOutput         `pulumi:"deviceId"`
	Item     SmDevicesUnenrollItemOutput `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
}

// NewSmDevicesUnenroll registers a new resource with the given unique name, arguments, and options.
func NewSmDevicesUnenroll(ctx *pulumi.Context,
	name string, args *SmDevicesUnenrollArgs, opts ...pulumi.ResourceOption) (*SmDevicesUnenroll, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeviceId == nil {
		return nil, errors.New("invalid value for required argument 'DeviceId'")
	}
	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SmDevicesUnenroll
	err := ctx.RegisterResource("meraki:networks/smDevicesUnenroll:SmDevicesUnenroll", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSmDevicesUnenroll gets an existing SmDevicesUnenroll resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSmDevicesUnenroll(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SmDevicesUnenrollState, opts ...pulumi.ResourceOption) (*SmDevicesUnenroll, error) {
	var resource SmDevicesUnenroll
	err := ctx.ReadResource("meraki:networks/smDevicesUnenroll:SmDevicesUnenroll", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SmDevicesUnenroll resources.
type smDevicesUnenrollState struct {
	// deviceId path parameter. Device ID
	DeviceId *string                `pulumi:"deviceId"`
	Item     *SmDevicesUnenrollItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

type SmDevicesUnenrollState struct {
	// deviceId path parameter. Device ID
	DeviceId pulumi.StringPtrInput
	Item     SmDevicesUnenrollItemPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
}

func (SmDevicesUnenrollState) ElementType() reflect.Type {
	return reflect.TypeOf((*smDevicesUnenrollState)(nil)).Elem()
}

type smDevicesUnenrollArgs struct {
	// deviceId path parameter. Device ID
	DeviceId string `pulumi:"deviceId"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// The set of arguments for constructing a SmDevicesUnenroll resource.
type SmDevicesUnenrollArgs struct {
	// deviceId path parameter. Device ID
	DeviceId pulumi.StringInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
}

func (SmDevicesUnenrollArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*smDevicesUnenrollArgs)(nil)).Elem()
}

type SmDevicesUnenrollInput interface {
	pulumi.Input

	ToSmDevicesUnenrollOutput() SmDevicesUnenrollOutput
	ToSmDevicesUnenrollOutputWithContext(ctx context.Context) SmDevicesUnenrollOutput
}

func (*SmDevicesUnenroll) ElementType() reflect.Type {
	return reflect.TypeOf((**SmDevicesUnenroll)(nil)).Elem()
}

func (i *SmDevicesUnenroll) ToSmDevicesUnenrollOutput() SmDevicesUnenrollOutput {
	return i.ToSmDevicesUnenrollOutputWithContext(context.Background())
}

func (i *SmDevicesUnenroll) ToSmDevicesUnenrollOutputWithContext(ctx context.Context) SmDevicesUnenrollOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesUnenrollOutput)
}

// SmDevicesUnenrollArrayInput is an input type that accepts SmDevicesUnenrollArray and SmDevicesUnenrollArrayOutput values.
// You can construct a concrete instance of `SmDevicesUnenrollArrayInput` via:
//
//	SmDevicesUnenrollArray{ SmDevicesUnenrollArgs{...} }
type SmDevicesUnenrollArrayInput interface {
	pulumi.Input

	ToSmDevicesUnenrollArrayOutput() SmDevicesUnenrollArrayOutput
	ToSmDevicesUnenrollArrayOutputWithContext(context.Context) SmDevicesUnenrollArrayOutput
}

type SmDevicesUnenrollArray []SmDevicesUnenrollInput

func (SmDevicesUnenrollArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmDevicesUnenroll)(nil)).Elem()
}

func (i SmDevicesUnenrollArray) ToSmDevicesUnenrollArrayOutput() SmDevicesUnenrollArrayOutput {
	return i.ToSmDevicesUnenrollArrayOutputWithContext(context.Background())
}

func (i SmDevicesUnenrollArray) ToSmDevicesUnenrollArrayOutputWithContext(ctx context.Context) SmDevicesUnenrollArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesUnenrollArrayOutput)
}

// SmDevicesUnenrollMapInput is an input type that accepts SmDevicesUnenrollMap and SmDevicesUnenrollMapOutput values.
// You can construct a concrete instance of `SmDevicesUnenrollMapInput` via:
//
//	SmDevicesUnenrollMap{ "key": SmDevicesUnenrollArgs{...} }
type SmDevicesUnenrollMapInput interface {
	pulumi.Input

	ToSmDevicesUnenrollMapOutput() SmDevicesUnenrollMapOutput
	ToSmDevicesUnenrollMapOutputWithContext(context.Context) SmDevicesUnenrollMapOutput
}

type SmDevicesUnenrollMap map[string]SmDevicesUnenrollInput

func (SmDevicesUnenrollMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmDevicesUnenroll)(nil)).Elem()
}

func (i SmDevicesUnenrollMap) ToSmDevicesUnenrollMapOutput() SmDevicesUnenrollMapOutput {
	return i.ToSmDevicesUnenrollMapOutputWithContext(context.Background())
}

func (i SmDevicesUnenrollMap) ToSmDevicesUnenrollMapOutputWithContext(ctx context.Context) SmDevicesUnenrollMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesUnenrollMapOutput)
}

type SmDevicesUnenrollOutput struct{ *pulumi.OutputState }

func (SmDevicesUnenrollOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SmDevicesUnenroll)(nil)).Elem()
}

func (o SmDevicesUnenrollOutput) ToSmDevicesUnenrollOutput() SmDevicesUnenrollOutput {
	return o
}

func (o SmDevicesUnenrollOutput) ToSmDevicesUnenrollOutputWithContext(ctx context.Context) SmDevicesUnenrollOutput {
	return o
}

// deviceId path parameter. Device ID
func (o SmDevicesUnenrollOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SmDevicesUnenroll) pulumi.StringOutput { return v.DeviceId }).(pulumi.StringOutput)
}

func (o SmDevicesUnenrollOutput) Item() SmDevicesUnenrollItemOutput {
	return o.ApplyT(func(v *SmDevicesUnenroll) SmDevicesUnenrollItemOutput { return v.Item }).(SmDevicesUnenrollItemOutput)
}

// networkId path parameter. Network ID
func (o SmDevicesUnenrollOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SmDevicesUnenroll) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

type SmDevicesUnenrollArrayOutput struct{ *pulumi.OutputState }

func (SmDevicesUnenrollArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmDevicesUnenroll)(nil)).Elem()
}

func (o SmDevicesUnenrollArrayOutput) ToSmDevicesUnenrollArrayOutput() SmDevicesUnenrollArrayOutput {
	return o
}

func (o SmDevicesUnenrollArrayOutput) ToSmDevicesUnenrollArrayOutputWithContext(ctx context.Context) SmDevicesUnenrollArrayOutput {
	return o
}

func (o SmDevicesUnenrollArrayOutput) Index(i pulumi.IntInput) SmDevicesUnenrollOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SmDevicesUnenroll {
		return vs[0].([]*SmDevicesUnenroll)[vs[1].(int)]
	}).(SmDevicesUnenrollOutput)
}

type SmDevicesUnenrollMapOutput struct{ *pulumi.OutputState }

func (SmDevicesUnenrollMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmDevicesUnenroll)(nil)).Elem()
}

func (o SmDevicesUnenrollMapOutput) ToSmDevicesUnenrollMapOutput() SmDevicesUnenrollMapOutput {
	return o
}

func (o SmDevicesUnenrollMapOutput) ToSmDevicesUnenrollMapOutputWithContext(ctx context.Context) SmDevicesUnenrollMapOutput {
	return o
}

func (o SmDevicesUnenrollMapOutput) MapIndex(k pulumi.StringInput) SmDevicesUnenrollOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SmDevicesUnenroll {
		return vs[0].(map[string]*SmDevicesUnenroll)[vs[1].(string)]
	}).(SmDevicesUnenrollOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesUnenrollInput)(nil)).Elem(), &SmDevicesUnenroll{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesUnenrollArrayInput)(nil)).Elem(), SmDevicesUnenrollArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesUnenrollMapInput)(nil)).Elem(), SmDevicesUnenrollMap{})
	pulumi.RegisterOutputType(SmDevicesUnenrollOutput{})
	pulumi.RegisterOutputType(SmDevicesUnenrollArrayOutput{})
	pulumi.RegisterOutputType(SmDevicesUnenrollMapOutput{})
}
