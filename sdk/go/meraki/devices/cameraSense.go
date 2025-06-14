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
//			example, err := devices.NewCameraSense(ctx, "example", &devices.CameraSenseArgs{
//				AudioDetection: &devices.CameraSenseAudioDetectionArgs{
//					Enabled: pulumi.Bool(false),
//				},
//				MqttBrokerId: pulumi.String("1234"),
//				SenseEnabled: pulumi.Bool(true),
//				Serial:       pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesCameraSenseExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/cameraSense:CameraSense example "serial"
// ```
type CameraSense struct {
	pulumi.CustomResourceState

	// The details of the audio detection config.
	AudioDetection CameraSenseAudioDetectionOutput `pulumi:"audioDetection"`
	// The ID of the object detection model
	DetectionModelId pulumi.StringOutput `pulumi:"detectionModelId"`
	// The ID of the MQTT broker to be enabled on the camera. A value of null will disable MQTT on the camera
	MqttBrokerId pulumi.StringOutput      `pulumi:"mqttBrokerId"`
	MqttTopics   pulumi.StringArrayOutput `pulumi:"mqttTopics"`
	// Boolean indicating if sense(license) is enabled(true) or disabled(false) on the camera
	SenseEnabled pulumi.BoolOutput `pulumi:"senseEnabled"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
}

// NewCameraSense registers a new resource with the given unique name, arguments, and options.
func NewCameraSense(ctx *pulumi.Context,
	name string, args *CameraSenseArgs, opts ...pulumi.ResourceOption) (*CameraSense, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CameraSense
	err := ctx.RegisterResource("meraki:devices/cameraSense:CameraSense", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCameraSense gets an existing CameraSense resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCameraSense(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CameraSenseState, opts ...pulumi.ResourceOption) (*CameraSense, error) {
	var resource CameraSense
	err := ctx.ReadResource("meraki:devices/cameraSense:CameraSense", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CameraSense resources.
type cameraSenseState struct {
	// The details of the audio detection config.
	AudioDetection *CameraSenseAudioDetection `pulumi:"audioDetection"`
	// The ID of the object detection model
	DetectionModelId *string `pulumi:"detectionModelId"`
	// The ID of the MQTT broker to be enabled on the camera. A value of null will disable MQTT on the camera
	MqttBrokerId *string  `pulumi:"mqttBrokerId"`
	MqttTopics   []string `pulumi:"mqttTopics"`
	// Boolean indicating if sense(license) is enabled(true) or disabled(false) on the camera
	SenseEnabled *bool `pulumi:"senseEnabled"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

type CameraSenseState struct {
	// The details of the audio detection config.
	AudioDetection CameraSenseAudioDetectionPtrInput
	// The ID of the object detection model
	DetectionModelId pulumi.StringPtrInput
	// The ID of the MQTT broker to be enabled on the camera. A value of null will disable MQTT on the camera
	MqttBrokerId pulumi.StringPtrInput
	MqttTopics   pulumi.StringArrayInput
	// Boolean indicating if sense(license) is enabled(true) or disabled(false) on the camera
	SenseEnabled pulumi.BoolPtrInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
}

func (CameraSenseState) ElementType() reflect.Type {
	return reflect.TypeOf((*cameraSenseState)(nil)).Elem()
}

type cameraSenseArgs struct {
	// The details of the audio detection config.
	AudioDetection *CameraSenseAudioDetection `pulumi:"audioDetection"`
	// The ID of the object detection model
	DetectionModelId *string `pulumi:"detectionModelId"`
	// The ID of the MQTT broker to be enabled on the camera. A value of null will disable MQTT on the camera
	MqttBrokerId *string `pulumi:"mqttBrokerId"`
	// Boolean indicating if sense(license) is enabled(true) or disabled(false) on the camera
	SenseEnabled *bool `pulumi:"senseEnabled"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// The set of arguments for constructing a CameraSense resource.
type CameraSenseArgs struct {
	// The details of the audio detection config.
	AudioDetection CameraSenseAudioDetectionPtrInput
	// The ID of the object detection model
	DetectionModelId pulumi.StringPtrInput
	// The ID of the MQTT broker to be enabled on the camera. A value of null will disable MQTT on the camera
	MqttBrokerId pulumi.StringPtrInput
	// Boolean indicating if sense(license) is enabled(true) or disabled(false) on the camera
	SenseEnabled pulumi.BoolPtrInput
	// serial path parameter.
	Serial pulumi.StringInput
}

func (CameraSenseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cameraSenseArgs)(nil)).Elem()
}

type CameraSenseInput interface {
	pulumi.Input

	ToCameraSenseOutput() CameraSenseOutput
	ToCameraSenseOutputWithContext(ctx context.Context) CameraSenseOutput
}

func (*CameraSense) ElementType() reflect.Type {
	return reflect.TypeOf((**CameraSense)(nil)).Elem()
}

func (i *CameraSense) ToCameraSenseOutput() CameraSenseOutput {
	return i.ToCameraSenseOutputWithContext(context.Background())
}

func (i *CameraSense) ToCameraSenseOutputWithContext(ctx context.Context) CameraSenseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CameraSenseOutput)
}

// CameraSenseArrayInput is an input type that accepts CameraSenseArray and CameraSenseArrayOutput values.
// You can construct a concrete instance of `CameraSenseArrayInput` via:
//
//	CameraSenseArray{ CameraSenseArgs{...} }
type CameraSenseArrayInput interface {
	pulumi.Input

	ToCameraSenseArrayOutput() CameraSenseArrayOutput
	ToCameraSenseArrayOutputWithContext(context.Context) CameraSenseArrayOutput
}

type CameraSenseArray []CameraSenseInput

func (CameraSenseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CameraSense)(nil)).Elem()
}

func (i CameraSenseArray) ToCameraSenseArrayOutput() CameraSenseArrayOutput {
	return i.ToCameraSenseArrayOutputWithContext(context.Background())
}

func (i CameraSenseArray) ToCameraSenseArrayOutputWithContext(ctx context.Context) CameraSenseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CameraSenseArrayOutput)
}

// CameraSenseMapInput is an input type that accepts CameraSenseMap and CameraSenseMapOutput values.
// You can construct a concrete instance of `CameraSenseMapInput` via:
//
//	CameraSenseMap{ "key": CameraSenseArgs{...} }
type CameraSenseMapInput interface {
	pulumi.Input

	ToCameraSenseMapOutput() CameraSenseMapOutput
	ToCameraSenseMapOutputWithContext(context.Context) CameraSenseMapOutput
}

type CameraSenseMap map[string]CameraSenseInput

func (CameraSenseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CameraSense)(nil)).Elem()
}

func (i CameraSenseMap) ToCameraSenseMapOutput() CameraSenseMapOutput {
	return i.ToCameraSenseMapOutputWithContext(context.Background())
}

func (i CameraSenseMap) ToCameraSenseMapOutputWithContext(ctx context.Context) CameraSenseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CameraSenseMapOutput)
}

type CameraSenseOutput struct{ *pulumi.OutputState }

func (CameraSenseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CameraSense)(nil)).Elem()
}

func (o CameraSenseOutput) ToCameraSenseOutput() CameraSenseOutput {
	return o
}

func (o CameraSenseOutput) ToCameraSenseOutputWithContext(ctx context.Context) CameraSenseOutput {
	return o
}

// The details of the audio detection config.
func (o CameraSenseOutput) AudioDetection() CameraSenseAudioDetectionOutput {
	return o.ApplyT(func(v *CameraSense) CameraSenseAudioDetectionOutput { return v.AudioDetection }).(CameraSenseAudioDetectionOutput)
}

// The ID of the object detection model
func (o CameraSenseOutput) DetectionModelId() pulumi.StringOutput {
	return o.ApplyT(func(v *CameraSense) pulumi.StringOutput { return v.DetectionModelId }).(pulumi.StringOutput)
}

// The ID of the MQTT broker to be enabled on the camera. A value of null will disable MQTT on the camera
func (o CameraSenseOutput) MqttBrokerId() pulumi.StringOutput {
	return o.ApplyT(func(v *CameraSense) pulumi.StringOutput { return v.MqttBrokerId }).(pulumi.StringOutput)
}

func (o CameraSenseOutput) MqttTopics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CameraSense) pulumi.StringArrayOutput { return v.MqttTopics }).(pulumi.StringArrayOutput)
}

// Boolean indicating if sense(license) is enabled(true) or disabled(false) on the camera
func (o CameraSenseOutput) SenseEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *CameraSense) pulumi.BoolOutput { return v.SenseEnabled }).(pulumi.BoolOutput)
}

// serial path parameter.
func (o CameraSenseOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *CameraSense) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

type CameraSenseArrayOutput struct{ *pulumi.OutputState }

func (CameraSenseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CameraSense)(nil)).Elem()
}

func (o CameraSenseArrayOutput) ToCameraSenseArrayOutput() CameraSenseArrayOutput {
	return o
}

func (o CameraSenseArrayOutput) ToCameraSenseArrayOutputWithContext(ctx context.Context) CameraSenseArrayOutput {
	return o
}

func (o CameraSenseArrayOutput) Index(i pulumi.IntInput) CameraSenseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CameraSense {
		return vs[0].([]*CameraSense)[vs[1].(int)]
	}).(CameraSenseOutput)
}

type CameraSenseMapOutput struct{ *pulumi.OutputState }

func (CameraSenseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CameraSense)(nil)).Elem()
}

func (o CameraSenseMapOutput) ToCameraSenseMapOutput() CameraSenseMapOutput {
	return o
}

func (o CameraSenseMapOutput) ToCameraSenseMapOutputWithContext(ctx context.Context) CameraSenseMapOutput {
	return o
}

func (o CameraSenseMapOutput) MapIndex(k pulumi.StringInput) CameraSenseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CameraSense {
		return vs[0].(map[string]*CameraSense)[vs[1].(string)]
	}).(CameraSenseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CameraSenseInput)(nil)).Elem(), &CameraSense{})
	pulumi.RegisterInputType(reflect.TypeOf((*CameraSenseArrayInput)(nil)).Elem(), CameraSenseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CameraSenseMapInput)(nil)).Elem(), CameraSenseMap{})
	pulumi.RegisterOutputType(CameraSenseOutput{})
	pulumi.RegisterOutputType(CameraSenseArrayOutput{})
	pulumi.RegisterOutputType(CameraSenseMapOutput{})
}
