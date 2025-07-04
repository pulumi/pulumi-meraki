// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devices

import (
	"context"
	"reflect"

	"errors"
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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/devices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := devices.NewSwitchWarmSpare(ctx, "example", &devices.SwitchWarmSpareArgs{
//				Enabled:     pulumi.Bool(true),
//				Serial:      pulumi.String("string"),
//				SpareSerial: pulumi.String("Q234-ABCD-0002"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesSwitchWarmSpareExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/switchWarmSpare:SwitchWarmSpare example "serial"
// ```
type SwitchWarmSpare struct {
	pulumi.CustomResourceState

	// Enable or disable warm spare for a switch
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Serial number of the primary switch
	PrimarySerial pulumi.StringOutput `pulumi:"primarySerial"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
	// Serial number of the warm spare switch
	SpareSerial pulumi.StringOutput `pulumi:"spareSerial"`
}

// NewSwitchWarmSpare registers a new resource with the given unique name, arguments, and options.
func NewSwitchWarmSpare(ctx *pulumi.Context,
	name string, args *SwitchWarmSpareArgs, opts ...pulumi.ResourceOption) (*SwitchWarmSpare, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchWarmSpare
	err := ctx.RegisterResource("meraki:devices/switchWarmSpare:SwitchWarmSpare", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchWarmSpare gets an existing SwitchWarmSpare resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchWarmSpare(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchWarmSpareState, opts ...pulumi.ResourceOption) (*SwitchWarmSpare, error) {
	var resource SwitchWarmSpare
	err := ctx.ReadResource("meraki:devices/switchWarmSpare:SwitchWarmSpare", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchWarmSpare resources.
type switchWarmSpareState struct {
	// Enable or disable warm spare for a switch
	Enabled *bool `pulumi:"enabled"`
	// Serial number of the primary switch
	PrimarySerial *string `pulumi:"primarySerial"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
	// Serial number of the warm spare switch
	SpareSerial *string `pulumi:"spareSerial"`
}

type SwitchWarmSpareState struct {
	// Enable or disable warm spare for a switch
	Enabled pulumi.BoolPtrInput
	// Serial number of the primary switch
	PrimarySerial pulumi.StringPtrInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
	// Serial number of the warm spare switch
	SpareSerial pulumi.StringPtrInput
}

func (SwitchWarmSpareState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchWarmSpareState)(nil)).Elem()
}

type switchWarmSpareArgs struct {
	// Enable or disable warm spare for a switch
	Enabled *bool `pulumi:"enabled"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
	// Serial number of the warm spare switch
	SpareSerial *string `pulumi:"spareSerial"`
}

// The set of arguments for constructing a SwitchWarmSpare resource.
type SwitchWarmSpareArgs struct {
	// Enable or disable warm spare for a switch
	Enabled pulumi.BoolPtrInput
	// serial path parameter.
	Serial pulumi.StringInput
	// Serial number of the warm spare switch
	SpareSerial pulumi.StringPtrInput
}

func (SwitchWarmSpareArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchWarmSpareArgs)(nil)).Elem()
}

type SwitchWarmSpareInput interface {
	pulumi.Input

	ToSwitchWarmSpareOutput() SwitchWarmSpareOutput
	ToSwitchWarmSpareOutputWithContext(ctx context.Context) SwitchWarmSpareOutput
}

func (*SwitchWarmSpare) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchWarmSpare)(nil)).Elem()
}

func (i *SwitchWarmSpare) ToSwitchWarmSpareOutput() SwitchWarmSpareOutput {
	return i.ToSwitchWarmSpareOutputWithContext(context.Background())
}

func (i *SwitchWarmSpare) ToSwitchWarmSpareOutputWithContext(ctx context.Context) SwitchWarmSpareOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchWarmSpareOutput)
}

// SwitchWarmSpareArrayInput is an input type that accepts SwitchWarmSpareArray and SwitchWarmSpareArrayOutput values.
// You can construct a concrete instance of `SwitchWarmSpareArrayInput` via:
//
//	SwitchWarmSpareArray{ SwitchWarmSpareArgs{...} }
type SwitchWarmSpareArrayInput interface {
	pulumi.Input

	ToSwitchWarmSpareArrayOutput() SwitchWarmSpareArrayOutput
	ToSwitchWarmSpareArrayOutputWithContext(context.Context) SwitchWarmSpareArrayOutput
}

type SwitchWarmSpareArray []SwitchWarmSpareInput

func (SwitchWarmSpareArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchWarmSpare)(nil)).Elem()
}

func (i SwitchWarmSpareArray) ToSwitchWarmSpareArrayOutput() SwitchWarmSpareArrayOutput {
	return i.ToSwitchWarmSpareArrayOutputWithContext(context.Background())
}

func (i SwitchWarmSpareArray) ToSwitchWarmSpareArrayOutputWithContext(ctx context.Context) SwitchWarmSpareArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchWarmSpareArrayOutput)
}

// SwitchWarmSpareMapInput is an input type that accepts SwitchWarmSpareMap and SwitchWarmSpareMapOutput values.
// You can construct a concrete instance of `SwitchWarmSpareMapInput` via:
//
//	SwitchWarmSpareMap{ "key": SwitchWarmSpareArgs{...} }
type SwitchWarmSpareMapInput interface {
	pulumi.Input

	ToSwitchWarmSpareMapOutput() SwitchWarmSpareMapOutput
	ToSwitchWarmSpareMapOutputWithContext(context.Context) SwitchWarmSpareMapOutput
}

type SwitchWarmSpareMap map[string]SwitchWarmSpareInput

func (SwitchWarmSpareMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchWarmSpare)(nil)).Elem()
}

func (i SwitchWarmSpareMap) ToSwitchWarmSpareMapOutput() SwitchWarmSpareMapOutput {
	return i.ToSwitchWarmSpareMapOutputWithContext(context.Background())
}

func (i SwitchWarmSpareMap) ToSwitchWarmSpareMapOutputWithContext(ctx context.Context) SwitchWarmSpareMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchWarmSpareMapOutput)
}

type SwitchWarmSpareOutput struct{ *pulumi.OutputState }

func (SwitchWarmSpareOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchWarmSpare)(nil)).Elem()
}

func (o SwitchWarmSpareOutput) ToSwitchWarmSpareOutput() SwitchWarmSpareOutput {
	return o
}

func (o SwitchWarmSpareOutput) ToSwitchWarmSpareOutputWithContext(ctx context.Context) SwitchWarmSpareOutput {
	return o
}

// Enable or disable warm spare for a switch
func (o SwitchWarmSpareOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchWarmSpare) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Serial number of the primary switch
func (o SwitchWarmSpareOutput) PrimarySerial() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchWarmSpare) pulumi.StringOutput { return v.PrimarySerial }).(pulumi.StringOutput)
}

// serial path parameter.
func (o SwitchWarmSpareOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchWarmSpare) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

// Serial number of the warm spare switch
func (o SwitchWarmSpareOutput) SpareSerial() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchWarmSpare) pulumi.StringOutput { return v.SpareSerial }).(pulumi.StringOutput)
}

type SwitchWarmSpareArrayOutput struct{ *pulumi.OutputState }

func (SwitchWarmSpareArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchWarmSpare)(nil)).Elem()
}

func (o SwitchWarmSpareArrayOutput) ToSwitchWarmSpareArrayOutput() SwitchWarmSpareArrayOutput {
	return o
}

func (o SwitchWarmSpareArrayOutput) ToSwitchWarmSpareArrayOutputWithContext(ctx context.Context) SwitchWarmSpareArrayOutput {
	return o
}

func (o SwitchWarmSpareArrayOutput) Index(i pulumi.IntInput) SwitchWarmSpareOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchWarmSpare {
		return vs[0].([]*SwitchWarmSpare)[vs[1].(int)]
	}).(SwitchWarmSpareOutput)
}

type SwitchWarmSpareMapOutput struct{ *pulumi.OutputState }

func (SwitchWarmSpareMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchWarmSpare)(nil)).Elem()
}

func (o SwitchWarmSpareMapOutput) ToSwitchWarmSpareMapOutput() SwitchWarmSpareMapOutput {
	return o
}

func (o SwitchWarmSpareMapOutput) ToSwitchWarmSpareMapOutputWithContext(ctx context.Context) SwitchWarmSpareMapOutput {
	return o
}

func (o SwitchWarmSpareMapOutput) MapIndex(k pulumi.StringInput) SwitchWarmSpareOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchWarmSpare {
		return vs[0].(map[string]*SwitchWarmSpare)[vs[1].(string)]
	}).(SwitchWarmSpareOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchWarmSpareInput)(nil)).Elem(), &SwitchWarmSpare{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchWarmSpareArrayInput)(nil)).Elem(), SwitchWarmSpareArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchWarmSpareMapInput)(nil)).Elem(), SwitchWarmSpareMap{})
	pulumi.RegisterOutputType(SwitchWarmSpareOutput{})
	pulumi.RegisterOutputType(SwitchWarmSpareArrayOutput{})
	pulumi.RegisterOutputType(SwitchWarmSpareMapOutput{})
}
