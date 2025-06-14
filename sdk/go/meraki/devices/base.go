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
//			example, err := devices.Newbase(ctx, "example", &devices.baseArgs{
//				Lat:    pulumi.Float64(37.4180951010362),
//				Lng:    pulumi.Float64(-122.098531723022),
//				Name:   pulumi.String("My AP"),
//				Serial: pulumi.String("string"),
//				Tags: pulumi.StringArray{
//					pulumi.String("recently-added"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/base:base example "organization_id,serial"
// ```
type Base struct {
	pulumi.CustomResourceState

	// Physical address of the device
	Address pulumi.StringOutput `pulumi:"address"`
	// Additional device information
	Details BaseDetailArrayOutput `pulumi:"details"`
	// Firmware version of the device
	Firmware pulumi.StringOutput `pulumi:"firmware"`
	// The floor plan to associate to this device. null disassociates the device from the floorplan.
	FloorPlanId pulumi.StringOutput `pulumi:"floorPlanId"`
	// IMEI of the device, if applicable
	Imei pulumi.StringOutput `pulumi:"imei"`
	// LAN IP address of the device
	LanIp pulumi.StringOutput `pulumi:"lanIp"`
	// Latitude of the device
	Lat pulumi.Float64Output `pulumi:"lat"`
	// Longitude of the device
	Lng pulumi.Float64Output `pulumi:"lng"`
	// MAC address of the device
	Mac pulumi.StringOutput `pulumi:"mac"`
	// Model of the device
	Model pulumi.StringOutput `pulumi:"model"`
	// Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
	MoveMapMarker pulumi.BoolOutput `pulumi:"moveMapMarker"`
	// Name of the device
	Name pulumi.StringOutput `pulumi:"name"`
	// ID of the network the device belongs to
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// Notes for the device, limited to 255 characters
	Notes pulumi.StringOutput `pulumi:"notes"`
	// Product type of the device
	ProductType pulumi.StringOutput `pulumi:"productType"`
	// Serial number of the device
	Serial pulumi.StringOutput `pulumi:"serial"`
	// The ID of a switch template to bind to the device (for available switch templates, see the 'Switch Templates' endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
	SwitchProfileId pulumi.StringOutput `pulumi:"switchProfileId"`
	// List of tags assigned to the device
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewBase registers a new resource with the given unique name, arguments, and options.
func NewBase(ctx *pulumi.Context,
	name string, args *BaseArgs, opts ...pulumi.ResourceOption) (*Base, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Base
	err := ctx.RegisterResource("meraki:devices/base:base", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBase gets an existing Base resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BaseState, opts ...pulumi.ResourceOption) (*Base, error) {
	var resource Base
	err := ctx.ReadResource("meraki:devices/base:base", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Base resources.
type baseState struct {
	// Physical address of the device
	Address *string `pulumi:"address"`
	// Additional device information
	Details []BaseDetail `pulumi:"details"`
	// Firmware version of the device
	Firmware *string `pulumi:"firmware"`
	// The floor plan to associate to this device. null disassociates the device from the floorplan.
	FloorPlanId *string `pulumi:"floorPlanId"`
	// IMEI of the device, if applicable
	Imei *string `pulumi:"imei"`
	// LAN IP address of the device
	LanIp *string `pulumi:"lanIp"`
	// Latitude of the device
	Lat *float64 `pulumi:"lat"`
	// Longitude of the device
	Lng *float64 `pulumi:"lng"`
	// MAC address of the device
	Mac *string `pulumi:"mac"`
	// Model of the device
	Model *string `pulumi:"model"`
	// Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
	MoveMapMarker *bool `pulumi:"moveMapMarker"`
	// Name of the device
	Name *string `pulumi:"name"`
	// ID of the network the device belongs to
	NetworkId *string `pulumi:"networkId"`
	// Notes for the device, limited to 255 characters
	Notes *string `pulumi:"notes"`
	// Product type of the device
	ProductType *string `pulumi:"productType"`
	// Serial number of the device
	Serial *string `pulumi:"serial"`
	// The ID of a switch template to bind to the device (for available switch templates, see the 'Switch Templates' endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
	SwitchProfileId *string `pulumi:"switchProfileId"`
	// List of tags assigned to the device
	Tags []string `pulumi:"tags"`
}

type BaseState struct {
	// Physical address of the device
	Address pulumi.StringPtrInput
	// Additional device information
	Details BaseDetailArrayInput
	// Firmware version of the device
	Firmware pulumi.StringPtrInput
	// The floor plan to associate to this device. null disassociates the device from the floorplan.
	FloorPlanId pulumi.StringPtrInput
	// IMEI of the device, if applicable
	Imei pulumi.StringPtrInput
	// LAN IP address of the device
	LanIp pulumi.StringPtrInput
	// Latitude of the device
	Lat pulumi.Float64PtrInput
	// Longitude of the device
	Lng pulumi.Float64PtrInput
	// MAC address of the device
	Mac pulumi.StringPtrInput
	// Model of the device
	Model pulumi.StringPtrInput
	// Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
	MoveMapMarker pulumi.BoolPtrInput
	// Name of the device
	Name pulumi.StringPtrInput
	// ID of the network the device belongs to
	NetworkId pulumi.StringPtrInput
	// Notes for the device, limited to 255 characters
	Notes pulumi.StringPtrInput
	// Product type of the device
	ProductType pulumi.StringPtrInput
	// Serial number of the device
	Serial pulumi.StringPtrInput
	// The ID of a switch template to bind to the device (for available switch templates, see the 'Switch Templates' endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
	SwitchProfileId pulumi.StringPtrInput
	// List of tags assigned to the device
	Tags pulumi.StringArrayInput
}

func (BaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*baseState)(nil)).Elem()
}

type baseArgs struct {
	// Physical address of the device
	Address *string `pulumi:"address"`
	// The floor plan to associate to this device. null disassociates the device from the floorplan.
	FloorPlanId *string `pulumi:"floorPlanId"`
	// Latitude of the device
	Lat *float64 `pulumi:"lat"`
	// Longitude of the device
	Lng *float64 `pulumi:"lng"`
	// Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
	MoveMapMarker *bool `pulumi:"moveMapMarker"`
	// Name of the device
	Name *string `pulumi:"name"`
	// Notes for the device, limited to 255 characters
	Notes *string `pulumi:"notes"`
	// Serial number of the device
	Serial string `pulumi:"serial"`
	// The ID of a switch template to bind to the device (for available switch templates, see the 'Switch Templates' endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
	SwitchProfileId *string `pulumi:"switchProfileId"`
	// List of tags assigned to the device
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a Base resource.
type BaseArgs struct {
	// Physical address of the device
	Address pulumi.StringPtrInput
	// The floor plan to associate to this device. null disassociates the device from the floorplan.
	FloorPlanId pulumi.StringPtrInput
	// Latitude of the device
	Lat pulumi.Float64PtrInput
	// Longitude of the device
	Lng pulumi.Float64PtrInput
	// Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
	MoveMapMarker pulumi.BoolPtrInput
	// Name of the device
	Name pulumi.StringPtrInput
	// Notes for the device, limited to 255 characters
	Notes pulumi.StringPtrInput
	// Serial number of the device
	Serial pulumi.StringInput
	// The ID of a switch template to bind to the device (for available switch templates, see the 'Switch Templates' endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
	SwitchProfileId pulumi.StringPtrInput
	// List of tags assigned to the device
	Tags pulumi.StringArrayInput
}

func (BaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*baseArgs)(nil)).Elem()
}

type BaseInput interface {
	pulumi.Input

	ToBaseOutput() BaseOutput
	ToBaseOutputWithContext(ctx context.Context) BaseOutput
}

func (*Base) ElementType() reflect.Type {
	return reflect.TypeOf((**Base)(nil)).Elem()
}

func (i *Base) ToBaseOutput() BaseOutput {
	return i.ToBaseOutputWithContext(context.Background())
}

func (i *Base) ToBaseOutputWithContext(ctx context.Context) BaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BaseOutput)
}

// BaseArrayInput is an input type that accepts BaseArray and BaseArrayOutput values.
// You can construct a concrete instance of `BaseArrayInput` via:
//
//	BaseArray{ BaseArgs{...} }
type BaseArrayInput interface {
	pulumi.Input

	ToBaseArrayOutput() BaseArrayOutput
	ToBaseArrayOutputWithContext(context.Context) BaseArrayOutput
}

type BaseArray []BaseInput

func (BaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Base)(nil)).Elem()
}

func (i BaseArray) ToBaseArrayOutput() BaseArrayOutput {
	return i.ToBaseArrayOutputWithContext(context.Background())
}

func (i BaseArray) ToBaseArrayOutputWithContext(ctx context.Context) BaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BaseArrayOutput)
}

// BaseMapInput is an input type that accepts BaseMap and BaseMapOutput values.
// You can construct a concrete instance of `BaseMapInput` via:
//
//	BaseMap{ "key": BaseArgs{...} }
type BaseMapInput interface {
	pulumi.Input

	ToBaseMapOutput() BaseMapOutput
	ToBaseMapOutputWithContext(context.Context) BaseMapOutput
}

type BaseMap map[string]BaseInput

func (BaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Base)(nil)).Elem()
}

func (i BaseMap) ToBaseMapOutput() BaseMapOutput {
	return i.ToBaseMapOutputWithContext(context.Background())
}

func (i BaseMap) ToBaseMapOutputWithContext(ctx context.Context) BaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BaseMapOutput)
}

type BaseOutput struct{ *pulumi.OutputState }

func (BaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Base)(nil)).Elem()
}

func (o BaseOutput) ToBaseOutput() BaseOutput {
	return o
}

func (o BaseOutput) ToBaseOutputWithContext(ctx context.Context) BaseOutput {
	return o
}

// Physical address of the device
func (o BaseOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Address }).(pulumi.StringOutput)
}

// Additional device information
func (o BaseOutput) Details() BaseDetailArrayOutput {
	return o.ApplyT(func(v *Base) BaseDetailArrayOutput { return v.Details }).(BaseDetailArrayOutput)
}

// Firmware version of the device
func (o BaseOutput) Firmware() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Firmware }).(pulumi.StringOutput)
}

// The floor plan to associate to this device. null disassociates the device from the floorplan.
func (o BaseOutput) FloorPlanId() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.FloorPlanId }).(pulumi.StringOutput)
}

// IMEI of the device, if applicable
func (o BaseOutput) Imei() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Imei }).(pulumi.StringOutput)
}

// LAN IP address of the device
func (o BaseOutput) LanIp() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.LanIp }).(pulumi.StringOutput)
}

// Latitude of the device
func (o BaseOutput) Lat() pulumi.Float64Output {
	return o.ApplyT(func(v *Base) pulumi.Float64Output { return v.Lat }).(pulumi.Float64Output)
}

// Longitude of the device
func (o BaseOutput) Lng() pulumi.Float64Output {
	return o.ApplyT(func(v *Base) pulumi.Float64Output { return v.Lng }).(pulumi.Float64Output)
}

// MAC address of the device
func (o BaseOutput) Mac() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Mac }).(pulumi.StringOutput)
}

// Model of the device
func (o BaseOutput) Model() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Model }).(pulumi.StringOutput)
}

// Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
func (o BaseOutput) MoveMapMarker() pulumi.BoolOutput {
	return o.ApplyT(func(v *Base) pulumi.BoolOutput { return v.MoveMapMarker }).(pulumi.BoolOutput)
}

// Name of the device
func (o BaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ID of the network the device belongs to
func (o BaseOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// Notes for the device, limited to 255 characters
func (o BaseOutput) Notes() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Notes }).(pulumi.StringOutput)
}

// Product type of the device
func (o BaseOutput) ProductType() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.ProductType }).(pulumi.StringOutput)
}

// Serial number of the device
func (o BaseOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

// The ID of a switch template to bind to the device (for available switch templates, see the 'Switch Templates' endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
func (o BaseOutput) SwitchProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.SwitchProfileId }).(pulumi.StringOutput)
}

// List of tags assigned to the device
func (o BaseOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Base) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type BaseArrayOutput struct{ *pulumi.OutputState }

func (BaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Base)(nil)).Elem()
}

func (o BaseArrayOutput) ToBaseArrayOutput() BaseArrayOutput {
	return o
}

func (o BaseArrayOutput) ToBaseArrayOutputWithContext(ctx context.Context) BaseArrayOutput {
	return o
}

func (o BaseArrayOutput) Index(i pulumi.IntInput) BaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Base {
		return vs[0].([]*Base)[vs[1].(int)]
	}).(BaseOutput)
}

type BaseMapOutput struct{ *pulumi.OutputState }

func (BaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Base)(nil)).Elem()
}

func (o BaseMapOutput) ToBaseMapOutput() BaseMapOutput {
	return o
}

func (o BaseMapOutput) ToBaseMapOutputWithContext(ctx context.Context) BaseMapOutput {
	return o
}

func (o BaseMapOutput) MapIndex(k pulumi.StringInput) BaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Base {
		return vs[0].(map[string]*Base)[vs[1].(string)]
	}).(BaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BaseInput)(nil)).Elem(), &Base{})
	pulumi.RegisterInputType(reflect.TypeOf((*BaseArrayInput)(nil)).Elem(), BaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BaseMapInput)(nil)).Elem(), BaseMap{})
	pulumi.RegisterOutputType(BaseOutput{})
	pulumi.RegisterOutputType(BaseArrayOutput{})
	pulumi.RegisterOutputType(BaseMapOutput{})
}
