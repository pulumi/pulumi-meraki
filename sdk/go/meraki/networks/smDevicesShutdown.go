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
type SmDevicesShutdown struct {
	pulumi.CustomResourceState

	Item SmDevicesShutdownItemOutput `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringOutput               `pulumi:"networkId"`
	Parameters SmDevicesShutdownParametersOutput `pulumi:"parameters"`
}

// NewSmDevicesShutdown registers a new resource with the given unique name, arguments, and options.
func NewSmDevicesShutdown(ctx *pulumi.Context,
	name string, args *SmDevicesShutdownArgs, opts ...pulumi.ResourceOption) (*SmDevicesShutdown, error) {
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
	var resource SmDevicesShutdown
	err := ctx.RegisterResource("meraki:networks/smDevicesShutdown:SmDevicesShutdown", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSmDevicesShutdown gets an existing SmDevicesShutdown resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSmDevicesShutdown(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SmDevicesShutdownState, opts ...pulumi.ResourceOption) (*SmDevicesShutdown, error) {
	var resource SmDevicesShutdown
	err := ctx.ReadResource("meraki:networks/smDevicesShutdown:SmDevicesShutdown", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SmDevicesShutdown resources.
type smDevicesShutdownState struct {
	Item *SmDevicesShutdownItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  *string                      `pulumi:"networkId"`
	Parameters *SmDevicesShutdownParameters `pulumi:"parameters"`
}

type SmDevicesShutdownState struct {
	Item SmDevicesShutdownItemPtrInput
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringPtrInput
	Parameters SmDevicesShutdownParametersPtrInput
}

func (SmDevicesShutdownState) ElementType() reflect.Type {
	return reflect.TypeOf((*smDevicesShutdownState)(nil)).Elem()
}

type smDevicesShutdownArgs struct {
	// networkId path parameter. Network ID
	NetworkId  string                      `pulumi:"networkId"`
	Parameters SmDevicesShutdownParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a SmDevicesShutdown resource.
type SmDevicesShutdownArgs struct {
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringInput
	Parameters SmDevicesShutdownParametersInput
}

func (SmDevicesShutdownArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*smDevicesShutdownArgs)(nil)).Elem()
}

type SmDevicesShutdownInput interface {
	pulumi.Input

	ToSmDevicesShutdownOutput() SmDevicesShutdownOutput
	ToSmDevicesShutdownOutputWithContext(ctx context.Context) SmDevicesShutdownOutput
}

func (*SmDevicesShutdown) ElementType() reflect.Type {
	return reflect.TypeOf((**SmDevicesShutdown)(nil)).Elem()
}

func (i *SmDevicesShutdown) ToSmDevicesShutdownOutput() SmDevicesShutdownOutput {
	return i.ToSmDevicesShutdownOutputWithContext(context.Background())
}

func (i *SmDevicesShutdown) ToSmDevicesShutdownOutputWithContext(ctx context.Context) SmDevicesShutdownOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesShutdownOutput)
}

// SmDevicesShutdownArrayInput is an input type that accepts SmDevicesShutdownArray and SmDevicesShutdownArrayOutput values.
// You can construct a concrete instance of `SmDevicesShutdownArrayInput` via:
//
//	SmDevicesShutdownArray{ SmDevicesShutdownArgs{...} }
type SmDevicesShutdownArrayInput interface {
	pulumi.Input

	ToSmDevicesShutdownArrayOutput() SmDevicesShutdownArrayOutput
	ToSmDevicesShutdownArrayOutputWithContext(context.Context) SmDevicesShutdownArrayOutput
}

type SmDevicesShutdownArray []SmDevicesShutdownInput

func (SmDevicesShutdownArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmDevicesShutdown)(nil)).Elem()
}

func (i SmDevicesShutdownArray) ToSmDevicesShutdownArrayOutput() SmDevicesShutdownArrayOutput {
	return i.ToSmDevicesShutdownArrayOutputWithContext(context.Background())
}

func (i SmDevicesShutdownArray) ToSmDevicesShutdownArrayOutputWithContext(ctx context.Context) SmDevicesShutdownArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesShutdownArrayOutput)
}

// SmDevicesShutdownMapInput is an input type that accepts SmDevicesShutdownMap and SmDevicesShutdownMapOutput values.
// You can construct a concrete instance of `SmDevicesShutdownMapInput` via:
//
//	SmDevicesShutdownMap{ "key": SmDevicesShutdownArgs{...} }
type SmDevicesShutdownMapInput interface {
	pulumi.Input

	ToSmDevicesShutdownMapOutput() SmDevicesShutdownMapOutput
	ToSmDevicesShutdownMapOutputWithContext(context.Context) SmDevicesShutdownMapOutput
}

type SmDevicesShutdownMap map[string]SmDevicesShutdownInput

func (SmDevicesShutdownMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmDevicesShutdown)(nil)).Elem()
}

func (i SmDevicesShutdownMap) ToSmDevicesShutdownMapOutput() SmDevicesShutdownMapOutput {
	return i.ToSmDevicesShutdownMapOutputWithContext(context.Background())
}

func (i SmDevicesShutdownMap) ToSmDevicesShutdownMapOutputWithContext(ctx context.Context) SmDevicesShutdownMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmDevicesShutdownMapOutput)
}

type SmDevicesShutdownOutput struct{ *pulumi.OutputState }

func (SmDevicesShutdownOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SmDevicesShutdown)(nil)).Elem()
}

func (o SmDevicesShutdownOutput) ToSmDevicesShutdownOutput() SmDevicesShutdownOutput {
	return o
}

func (o SmDevicesShutdownOutput) ToSmDevicesShutdownOutputWithContext(ctx context.Context) SmDevicesShutdownOutput {
	return o
}

func (o SmDevicesShutdownOutput) Item() SmDevicesShutdownItemOutput {
	return o.ApplyT(func(v *SmDevicesShutdown) SmDevicesShutdownItemOutput { return v.Item }).(SmDevicesShutdownItemOutput)
}

// networkId path parameter. Network ID
func (o SmDevicesShutdownOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SmDevicesShutdown) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

func (o SmDevicesShutdownOutput) Parameters() SmDevicesShutdownParametersOutput {
	return o.ApplyT(func(v *SmDevicesShutdown) SmDevicesShutdownParametersOutput { return v.Parameters }).(SmDevicesShutdownParametersOutput)
}

type SmDevicesShutdownArrayOutput struct{ *pulumi.OutputState }

func (SmDevicesShutdownArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmDevicesShutdown)(nil)).Elem()
}

func (o SmDevicesShutdownArrayOutput) ToSmDevicesShutdownArrayOutput() SmDevicesShutdownArrayOutput {
	return o
}

func (o SmDevicesShutdownArrayOutput) ToSmDevicesShutdownArrayOutputWithContext(ctx context.Context) SmDevicesShutdownArrayOutput {
	return o
}

func (o SmDevicesShutdownArrayOutput) Index(i pulumi.IntInput) SmDevicesShutdownOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SmDevicesShutdown {
		return vs[0].([]*SmDevicesShutdown)[vs[1].(int)]
	}).(SmDevicesShutdownOutput)
}

type SmDevicesShutdownMapOutput struct{ *pulumi.OutputState }

func (SmDevicesShutdownMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmDevicesShutdown)(nil)).Elem()
}

func (o SmDevicesShutdownMapOutput) ToSmDevicesShutdownMapOutput() SmDevicesShutdownMapOutput {
	return o
}

func (o SmDevicesShutdownMapOutput) ToSmDevicesShutdownMapOutputWithContext(ctx context.Context) SmDevicesShutdownMapOutput {
	return o
}

func (o SmDevicesShutdownMapOutput) MapIndex(k pulumi.StringInput) SmDevicesShutdownOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SmDevicesShutdown {
		return vs[0].(map[string]*SmDevicesShutdown)[vs[1].(string)]
	}).(SmDevicesShutdownOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesShutdownInput)(nil)).Elem(), &SmDevicesShutdown{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesShutdownArrayInput)(nil)).Elem(), SmDevicesShutdownArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmDevicesShutdownMapInput)(nil)).Elem(), SmDevicesShutdownMap{})
	pulumi.RegisterOutputType(SmDevicesShutdownOutput{})
	pulumi.RegisterOutputType(SmDevicesShutdownArrayOutput{})
	pulumi.RegisterOutputType(SmDevicesShutdownMapOutput{})
}
