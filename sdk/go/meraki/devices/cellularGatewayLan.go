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
//			example, err := devices.NewCellularGatewayLan(ctx, "example", &devices.CellularGatewayLanArgs{
//				FixedIpAssignments: devices.CellularGatewayLanFixedIpAssignmentArray{
//					&devices.CellularGatewayLanFixedIpAssignmentArgs{
//						Ip:   pulumi.String("192.168.0.10"),
//						Mac:  pulumi.String("0b:00:00:00:00:ac"),
//						Name: pulumi.String("server 1"),
//					},
//				},
//				ReservedIpRanges: devices.CellularGatewayLanReservedIpRangeArray{
//					&devices.CellularGatewayLanReservedIpRangeArgs{
//						Comment: pulumi.String("A reserved IP range"),
//						End:     pulumi.String("192.168.1.1"),
//						Start:   pulumi.String("192.168.1.0"),
//					},
//				},
//				Serial: pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesCellularGatewayLanExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/cellularGatewayLan:CellularGatewayLan example "serial"
// ```
type CellularGatewayLan struct {
	pulumi.CustomResourceState

	// Lan IP of the MG
	DeviceLanIp pulumi.StringOutput `pulumi:"deviceLanIp"`
	// Name of the MG.
	DeviceName pulumi.StringOutput `pulumi:"deviceName"`
	// Subnet configuration of the MG.
	DeviceSubnet pulumi.StringOutput `pulumi:"deviceSubnet"`
	// list of all fixed IP assignments for a single MG
	FixedIpAssignments CellularGatewayLanFixedIpAssignmentArrayOutput `pulumi:"fixedIpAssignments"`
	// list of all reserved IP ranges for a single MG
	ReservedIpRanges CellularGatewayLanReservedIpRangeArrayOutput `pulumi:"reservedIpRanges"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
}

// NewCellularGatewayLan registers a new resource with the given unique name, arguments, and options.
func NewCellularGatewayLan(ctx *pulumi.Context,
	name string, args *CellularGatewayLanArgs, opts ...pulumi.ResourceOption) (*CellularGatewayLan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CellularGatewayLan
	err := ctx.RegisterResource("meraki:devices/cellularGatewayLan:CellularGatewayLan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCellularGatewayLan gets an existing CellularGatewayLan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCellularGatewayLan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CellularGatewayLanState, opts ...pulumi.ResourceOption) (*CellularGatewayLan, error) {
	var resource CellularGatewayLan
	err := ctx.ReadResource("meraki:devices/cellularGatewayLan:CellularGatewayLan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CellularGatewayLan resources.
type cellularGatewayLanState struct {
	// Lan IP of the MG
	DeviceLanIp *string `pulumi:"deviceLanIp"`
	// Name of the MG.
	DeviceName *string `pulumi:"deviceName"`
	// Subnet configuration of the MG.
	DeviceSubnet *string `pulumi:"deviceSubnet"`
	// list of all fixed IP assignments for a single MG
	FixedIpAssignments []CellularGatewayLanFixedIpAssignment `pulumi:"fixedIpAssignments"`
	// list of all reserved IP ranges for a single MG
	ReservedIpRanges []CellularGatewayLanReservedIpRange `pulumi:"reservedIpRanges"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
}

type CellularGatewayLanState struct {
	// Lan IP of the MG
	DeviceLanIp pulumi.StringPtrInput
	// Name of the MG.
	DeviceName pulumi.StringPtrInput
	// Subnet configuration of the MG.
	DeviceSubnet pulumi.StringPtrInput
	// list of all fixed IP assignments for a single MG
	FixedIpAssignments CellularGatewayLanFixedIpAssignmentArrayInput
	// list of all reserved IP ranges for a single MG
	ReservedIpRanges CellularGatewayLanReservedIpRangeArrayInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
}

func (CellularGatewayLanState) ElementType() reflect.Type {
	return reflect.TypeOf((*cellularGatewayLanState)(nil)).Elem()
}

type cellularGatewayLanArgs struct {
	// list of all fixed IP assignments for a single MG
	FixedIpAssignments []CellularGatewayLanFixedIpAssignment `pulumi:"fixedIpAssignments"`
	// list of all reserved IP ranges for a single MG
	ReservedIpRanges []CellularGatewayLanReservedIpRange `pulumi:"reservedIpRanges"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
}

// The set of arguments for constructing a CellularGatewayLan resource.
type CellularGatewayLanArgs struct {
	// list of all fixed IP assignments for a single MG
	FixedIpAssignments CellularGatewayLanFixedIpAssignmentArrayInput
	// list of all reserved IP ranges for a single MG
	ReservedIpRanges CellularGatewayLanReservedIpRangeArrayInput
	// serial path parameter.
	Serial pulumi.StringInput
}

func (CellularGatewayLanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cellularGatewayLanArgs)(nil)).Elem()
}

type CellularGatewayLanInput interface {
	pulumi.Input

	ToCellularGatewayLanOutput() CellularGatewayLanOutput
	ToCellularGatewayLanOutputWithContext(ctx context.Context) CellularGatewayLanOutput
}

func (*CellularGatewayLan) ElementType() reflect.Type {
	return reflect.TypeOf((**CellularGatewayLan)(nil)).Elem()
}

func (i *CellularGatewayLan) ToCellularGatewayLanOutput() CellularGatewayLanOutput {
	return i.ToCellularGatewayLanOutputWithContext(context.Background())
}

func (i *CellularGatewayLan) ToCellularGatewayLanOutputWithContext(ctx context.Context) CellularGatewayLanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularGatewayLanOutput)
}

// CellularGatewayLanArrayInput is an input type that accepts CellularGatewayLanArray and CellularGatewayLanArrayOutput values.
// You can construct a concrete instance of `CellularGatewayLanArrayInput` via:
//
//	CellularGatewayLanArray{ CellularGatewayLanArgs{...} }
type CellularGatewayLanArrayInput interface {
	pulumi.Input

	ToCellularGatewayLanArrayOutput() CellularGatewayLanArrayOutput
	ToCellularGatewayLanArrayOutputWithContext(context.Context) CellularGatewayLanArrayOutput
}

type CellularGatewayLanArray []CellularGatewayLanInput

func (CellularGatewayLanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CellularGatewayLan)(nil)).Elem()
}

func (i CellularGatewayLanArray) ToCellularGatewayLanArrayOutput() CellularGatewayLanArrayOutput {
	return i.ToCellularGatewayLanArrayOutputWithContext(context.Background())
}

func (i CellularGatewayLanArray) ToCellularGatewayLanArrayOutputWithContext(ctx context.Context) CellularGatewayLanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularGatewayLanArrayOutput)
}

// CellularGatewayLanMapInput is an input type that accepts CellularGatewayLanMap and CellularGatewayLanMapOutput values.
// You can construct a concrete instance of `CellularGatewayLanMapInput` via:
//
//	CellularGatewayLanMap{ "key": CellularGatewayLanArgs{...} }
type CellularGatewayLanMapInput interface {
	pulumi.Input

	ToCellularGatewayLanMapOutput() CellularGatewayLanMapOutput
	ToCellularGatewayLanMapOutputWithContext(context.Context) CellularGatewayLanMapOutput
}

type CellularGatewayLanMap map[string]CellularGatewayLanInput

func (CellularGatewayLanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CellularGatewayLan)(nil)).Elem()
}

func (i CellularGatewayLanMap) ToCellularGatewayLanMapOutput() CellularGatewayLanMapOutput {
	return i.ToCellularGatewayLanMapOutputWithContext(context.Background())
}

func (i CellularGatewayLanMap) ToCellularGatewayLanMapOutputWithContext(ctx context.Context) CellularGatewayLanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularGatewayLanMapOutput)
}

type CellularGatewayLanOutput struct{ *pulumi.OutputState }

func (CellularGatewayLanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CellularGatewayLan)(nil)).Elem()
}

func (o CellularGatewayLanOutput) ToCellularGatewayLanOutput() CellularGatewayLanOutput {
	return o
}

func (o CellularGatewayLanOutput) ToCellularGatewayLanOutputWithContext(ctx context.Context) CellularGatewayLanOutput {
	return o
}

// Lan IP of the MG
func (o CellularGatewayLanOutput) DeviceLanIp() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularGatewayLan) pulumi.StringOutput { return v.DeviceLanIp }).(pulumi.StringOutput)
}

// Name of the MG.
func (o CellularGatewayLanOutput) DeviceName() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularGatewayLan) pulumi.StringOutput { return v.DeviceName }).(pulumi.StringOutput)
}

// Subnet configuration of the MG.
func (o CellularGatewayLanOutput) DeviceSubnet() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularGatewayLan) pulumi.StringOutput { return v.DeviceSubnet }).(pulumi.StringOutput)
}

// list of all fixed IP assignments for a single MG
func (o CellularGatewayLanOutput) FixedIpAssignments() CellularGatewayLanFixedIpAssignmentArrayOutput {
	return o.ApplyT(func(v *CellularGatewayLan) CellularGatewayLanFixedIpAssignmentArrayOutput {
		return v.FixedIpAssignments
	}).(CellularGatewayLanFixedIpAssignmentArrayOutput)
}

// list of all reserved IP ranges for a single MG
func (o CellularGatewayLanOutput) ReservedIpRanges() CellularGatewayLanReservedIpRangeArrayOutput {
	return o.ApplyT(func(v *CellularGatewayLan) CellularGatewayLanReservedIpRangeArrayOutput { return v.ReservedIpRanges }).(CellularGatewayLanReservedIpRangeArrayOutput)
}

// serial path parameter.
func (o CellularGatewayLanOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularGatewayLan) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

type CellularGatewayLanArrayOutput struct{ *pulumi.OutputState }

func (CellularGatewayLanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CellularGatewayLan)(nil)).Elem()
}

func (o CellularGatewayLanArrayOutput) ToCellularGatewayLanArrayOutput() CellularGatewayLanArrayOutput {
	return o
}

func (o CellularGatewayLanArrayOutput) ToCellularGatewayLanArrayOutputWithContext(ctx context.Context) CellularGatewayLanArrayOutput {
	return o
}

func (o CellularGatewayLanArrayOutput) Index(i pulumi.IntInput) CellularGatewayLanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CellularGatewayLan {
		return vs[0].([]*CellularGatewayLan)[vs[1].(int)]
	}).(CellularGatewayLanOutput)
}

type CellularGatewayLanMapOutput struct{ *pulumi.OutputState }

func (CellularGatewayLanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CellularGatewayLan)(nil)).Elem()
}

func (o CellularGatewayLanMapOutput) ToCellularGatewayLanMapOutput() CellularGatewayLanMapOutput {
	return o
}

func (o CellularGatewayLanMapOutput) ToCellularGatewayLanMapOutputWithContext(ctx context.Context) CellularGatewayLanMapOutput {
	return o
}

func (o CellularGatewayLanMapOutput) MapIndex(k pulumi.StringInput) CellularGatewayLanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CellularGatewayLan {
		return vs[0].(map[string]*CellularGatewayLan)[vs[1].(string)]
	}).(CellularGatewayLanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CellularGatewayLanInput)(nil)).Elem(), &CellularGatewayLan{})
	pulumi.RegisterInputType(reflect.TypeOf((*CellularGatewayLanArrayInput)(nil)).Elem(), CellularGatewayLanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CellularGatewayLanMapInput)(nil)).Elem(), CellularGatewayLanMap{})
	pulumi.RegisterOutputType(CellularGatewayLanOutput{})
	pulumi.RegisterOutputType(CellularGatewayLanArrayOutput{})
	pulumi.RegisterOutputType(CellularGatewayLanMapOutput{})
}
