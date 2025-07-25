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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/devices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := devices.NewLiveToolsPingDevice(ctx, "example", &devices.LiveToolsPingDeviceArgs{
//				Serial: pulumi.String("string"),
//				Parameters: &devices.LiveToolsPingDeviceParametersArgs{
//					Callback: &devices.LiveToolsPingDeviceParametersCallbackArgs{
//						HttpServer: &devices.LiveToolsPingDeviceParametersCallbackHttpServerArgs{
//							Id: pulumi.String("aHR0cHM6Ly93d3cuZXhhbXBsZS5jb20vd2ViaG9va3M="),
//						},
//						PayloadTemplate: &devices.LiveToolsPingDeviceParametersCallbackPayloadTemplateArgs{
//							Id: pulumi.String("wpt_2100"),
//						},
//						SharedSecret: pulumi.String("secret"),
//						Url:          pulumi.String("https://webhook.site/28efa24e-f830-4d9f-a12b-fbb9e5035031"),
//					},
//					Count: pulumi.Int(3),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesLiveToolsPingDeviceExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/liveToolsPingDevice:LiveToolsPingDevice example "id,serial"
// ```
type LiveToolsPingDevice struct {
	pulumi.CustomResourceState

	Item       LiveToolsPingDeviceItemOutput       `pulumi:"item"`
	Parameters LiveToolsPingDeviceParametersOutput `pulumi:"parameters"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
}

// NewLiveToolsPingDevice registers a new resource with the given unique name, arguments, and options.
func NewLiveToolsPingDevice(ctx *pulumi.Context,
	name string, args *LiveToolsPingDeviceArgs, opts ...pulumi.ResourceOption) (*LiveToolsPingDevice, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Parameters == nil {
		return nil, errors.New("invalid value for required argument 'Parameters'")
	}
	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LiveToolsPingDevice
	err := ctx.RegisterResource("meraki:devices/liveToolsPingDevice:LiveToolsPingDevice", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLiveToolsPingDevice gets an existing LiveToolsPingDevice resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLiveToolsPingDevice(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LiveToolsPingDeviceState, opts ...pulumi.ResourceOption) (*LiveToolsPingDevice, error) {
	var resource LiveToolsPingDevice
	err := ctx.ReadResource("meraki:devices/liveToolsPingDevice:LiveToolsPingDevice", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LiveToolsPingDevice resources.
type liveToolsPingDeviceState struct {
	Item       *LiveToolsPingDeviceItem       `pulumi:"item"`
	Parameters *LiveToolsPingDeviceParameters `pulumi:"parameters"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

type LiveToolsPingDeviceState struct {
	Item       LiveToolsPingDeviceItemPtrInput
	Parameters LiveToolsPingDeviceParametersPtrInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
}

func (LiveToolsPingDeviceState) ElementType() reflect.Type {
	return reflect.TypeOf((*liveToolsPingDeviceState)(nil)).Elem()
}

type liveToolsPingDeviceArgs struct {
	Parameters LiveToolsPingDeviceParameters `pulumi:"parameters"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// The set of arguments for constructing a LiveToolsPingDevice resource.
type LiveToolsPingDeviceArgs struct {
	Parameters LiveToolsPingDeviceParametersInput
	// serial path parameter.
	Serial pulumi.StringInput
}

func (LiveToolsPingDeviceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*liveToolsPingDeviceArgs)(nil)).Elem()
}

type LiveToolsPingDeviceInput interface {
	pulumi.Input

	ToLiveToolsPingDeviceOutput() LiveToolsPingDeviceOutput
	ToLiveToolsPingDeviceOutputWithContext(ctx context.Context) LiveToolsPingDeviceOutput
}

func (*LiveToolsPingDevice) ElementType() reflect.Type {
	return reflect.TypeOf((**LiveToolsPingDevice)(nil)).Elem()
}

func (i *LiveToolsPingDevice) ToLiveToolsPingDeviceOutput() LiveToolsPingDeviceOutput {
	return i.ToLiveToolsPingDeviceOutputWithContext(context.Background())
}

func (i *LiveToolsPingDevice) ToLiveToolsPingDeviceOutputWithContext(ctx context.Context) LiveToolsPingDeviceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LiveToolsPingDeviceOutput)
}

// LiveToolsPingDeviceArrayInput is an input type that accepts LiveToolsPingDeviceArray and LiveToolsPingDeviceArrayOutput values.
// You can construct a concrete instance of `LiveToolsPingDeviceArrayInput` via:
//
//	LiveToolsPingDeviceArray{ LiveToolsPingDeviceArgs{...} }
type LiveToolsPingDeviceArrayInput interface {
	pulumi.Input

	ToLiveToolsPingDeviceArrayOutput() LiveToolsPingDeviceArrayOutput
	ToLiveToolsPingDeviceArrayOutputWithContext(context.Context) LiveToolsPingDeviceArrayOutput
}

type LiveToolsPingDeviceArray []LiveToolsPingDeviceInput

func (LiveToolsPingDeviceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LiveToolsPingDevice)(nil)).Elem()
}

func (i LiveToolsPingDeviceArray) ToLiveToolsPingDeviceArrayOutput() LiveToolsPingDeviceArrayOutput {
	return i.ToLiveToolsPingDeviceArrayOutputWithContext(context.Background())
}

func (i LiveToolsPingDeviceArray) ToLiveToolsPingDeviceArrayOutputWithContext(ctx context.Context) LiveToolsPingDeviceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LiveToolsPingDeviceArrayOutput)
}

// LiveToolsPingDeviceMapInput is an input type that accepts LiveToolsPingDeviceMap and LiveToolsPingDeviceMapOutput values.
// You can construct a concrete instance of `LiveToolsPingDeviceMapInput` via:
//
//	LiveToolsPingDeviceMap{ "key": LiveToolsPingDeviceArgs{...} }
type LiveToolsPingDeviceMapInput interface {
	pulumi.Input

	ToLiveToolsPingDeviceMapOutput() LiveToolsPingDeviceMapOutput
	ToLiveToolsPingDeviceMapOutputWithContext(context.Context) LiveToolsPingDeviceMapOutput
}

type LiveToolsPingDeviceMap map[string]LiveToolsPingDeviceInput

func (LiveToolsPingDeviceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LiveToolsPingDevice)(nil)).Elem()
}

func (i LiveToolsPingDeviceMap) ToLiveToolsPingDeviceMapOutput() LiveToolsPingDeviceMapOutput {
	return i.ToLiveToolsPingDeviceMapOutputWithContext(context.Background())
}

func (i LiveToolsPingDeviceMap) ToLiveToolsPingDeviceMapOutputWithContext(ctx context.Context) LiveToolsPingDeviceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LiveToolsPingDeviceMapOutput)
}

type LiveToolsPingDeviceOutput struct{ *pulumi.OutputState }

func (LiveToolsPingDeviceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LiveToolsPingDevice)(nil)).Elem()
}

func (o LiveToolsPingDeviceOutput) ToLiveToolsPingDeviceOutput() LiveToolsPingDeviceOutput {
	return o
}

func (o LiveToolsPingDeviceOutput) ToLiveToolsPingDeviceOutputWithContext(ctx context.Context) LiveToolsPingDeviceOutput {
	return o
}

func (o LiveToolsPingDeviceOutput) Item() LiveToolsPingDeviceItemOutput {
	return o.ApplyT(func(v *LiveToolsPingDevice) LiveToolsPingDeviceItemOutput { return v.Item }).(LiveToolsPingDeviceItemOutput)
}

func (o LiveToolsPingDeviceOutput) Parameters() LiveToolsPingDeviceParametersOutput {
	return o.ApplyT(func(v *LiveToolsPingDevice) LiveToolsPingDeviceParametersOutput { return v.Parameters }).(LiveToolsPingDeviceParametersOutput)
}

// serial path parameter.
func (o LiveToolsPingDeviceOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *LiveToolsPingDevice) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

type LiveToolsPingDeviceArrayOutput struct{ *pulumi.OutputState }

func (LiveToolsPingDeviceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LiveToolsPingDevice)(nil)).Elem()
}

func (o LiveToolsPingDeviceArrayOutput) ToLiveToolsPingDeviceArrayOutput() LiveToolsPingDeviceArrayOutput {
	return o
}

func (o LiveToolsPingDeviceArrayOutput) ToLiveToolsPingDeviceArrayOutputWithContext(ctx context.Context) LiveToolsPingDeviceArrayOutput {
	return o
}

func (o LiveToolsPingDeviceArrayOutput) Index(i pulumi.IntInput) LiveToolsPingDeviceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LiveToolsPingDevice {
		return vs[0].([]*LiveToolsPingDevice)[vs[1].(int)]
	}).(LiveToolsPingDeviceOutput)
}

type LiveToolsPingDeviceMapOutput struct{ *pulumi.OutputState }

func (LiveToolsPingDeviceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LiveToolsPingDevice)(nil)).Elem()
}

func (o LiveToolsPingDeviceMapOutput) ToLiveToolsPingDeviceMapOutput() LiveToolsPingDeviceMapOutput {
	return o
}

func (o LiveToolsPingDeviceMapOutput) ToLiveToolsPingDeviceMapOutputWithContext(ctx context.Context) LiveToolsPingDeviceMapOutput {
	return o
}

func (o LiveToolsPingDeviceMapOutput) MapIndex(k pulumi.StringInput) LiveToolsPingDeviceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LiveToolsPingDevice {
		return vs[0].(map[string]*LiveToolsPingDevice)[vs[1].(string)]
	}).(LiveToolsPingDeviceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LiveToolsPingDeviceInput)(nil)).Elem(), &LiveToolsPingDevice{})
	pulumi.RegisterInputType(reflect.TypeOf((*LiveToolsPingDeviceArrayInput)(nil)).Elem(), LiveToolsPingDeviceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LiveToolsPingDeviceMapInput)(nil)).Elem(), LiveToolsPingDeviceMap{})
	pulumi.RegisterOutputType(LiveToolsPingDeviceOutput{})
	pulumi.RegisterOutputType(LiveToolsPingDeviceArrayOutput{})
	pulumi.RegisterOutputType(LiveToolsPingDeviceMapOutput{})
}
