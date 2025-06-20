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
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/switchRoutingInterfaces:SwitchRoutingInterfaces example "interface_id,serial"
// ```
type SwitchRoutingInterfaces struct {
	pulumi.CustomResourceState

	// IPv4 default gateway
	DefaultGateway pulumi.StringOutput `pulumi:"defaultGateway"`
	// The id
	InterfaceId pulumi.StringOutput `pulumi:"interfaceId"`
	// IPv4 address
	InterfaceIp pulumi.StringOutput `pulumi:"interfaceIp"`
	// IPv6 addressing
	Ipv6 SwitchRoutingInterfacesIpv6Output `pulumi:"ipv6"`
	// Multicast routing status
	MulticastRouting pulumi.StringOutput `pulumi:"multicastRouting"`
	// The name
	Name pulumi.StringOutput `pulumi:"name"`
	// IPv4 OSPF Settings
	OspfSettings SwitchRoutingInterfacesOspfSettingsOutput `pulumi:"ospfSettings"`
	// IPv6 OSPF Settings
	OspfV3 SwitchRoutingInterfacesOspfV3Output `pulumi:"ospfV3"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
	// IPv4 subnet
	Subnet pulumi.StringOutput `pulumi:"subnet"`
	// VLAN id
	VlanId pulumi.IntOutput `pulumi:"vlanId"`
}

// NewSwitchRoutingInterfaces registers a new resource with the given unique name, arguments, and options.
func NewSwitchRoutingInterfaces(ctx *pulumi.Context,
	name string, args *SwitchRoutingInterfacesArgs, opts ...pulumi.ResourceOption) (*SwitchRoutingInterfaces, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchRoutingInterfaces
	err := ctx.RegisterResource("meraki:devices/switchRoutingInterfaces:SwitchRoutingInterfaces", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchRoutingInterfaces gets an existing SwitchRoutingInterfaces resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchRoutingInterfaces(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchRoutingInterfacesState, opts ...pulumi.ResourceOption) (*SwitchRoutingInterfaces, error) {
	var resource SwitchRoutingInterfaces
	err := ctx.ReadResource("meraki:devices/switchRoutingInterfaces:SwitchRoutingInterfaces", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchRoutingInterfaces resources.
type switchRoutingInterfacesState struct {
	// IPv4 default gateway
	DefaultGateway *string `pulumi:"defaultGateway"`
	// The id
	InterfaceId *string `pulumi:"interfaceId"`
	// IPv4 address
	InterfaceIp *string `pulumi:"interfaceIp"`
	// IPv6 addressing
	Ipv6 *SwitchRoutingInterfacesIpv6 `pulumi:"ipv6"`
	// Multicast routing status
	MulticastRouting *string `pulumi:"multicastRouting"`
	// The name
	Name *string `pulumi:"name"`
	// IPv4 OSPF Settings
	OspfSettings *SwitchRoutingInterfacesOspfSettings `pulumi:"ospfSettings"`
	// IPv6 OSPF Settings
	OspfV3 *SwitchRoutingInterfacesOspfV3 `pulumi:"ospfV3"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
	// IPv4 subnet
	Subnet *string `pulumi:"subnet"`
	// VLAN id
	VlanId *int `pulumi:"vlanId"`
}

type SwitchRoutingInterfacesState struct {
	// IPv4 default gateway
	DefaultGateway pulumi.StringPtrInput
	// The id
	InterfaceId pulumi.StringPtrInput
	// IPv4 address
	InterfaceIp pulumi.StringPtrInput
	// IPv6 addressing
	Ipv6 SwitchRoutingInterfacesIpv6PtrInput
	// Multicast routing status
	MulticastRouting pulumi.StringPtrInput
	// The name
	Name pulumi.StringPtrInput
	// IPv4 OSPF Settings
	OspfSettings SwitchRoutingInterfacesOspfSettingsPtrInput
	// IPv6 OSPF Settings
	OspfV3 SwitchRoutingInterfacesOspfV3PtrInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
	// IPv4 subnet
	Subnet pulumi.StringPtrInput
	// VLAN id
	VlanId pulumi.IntPtrInput
}

func (SwitchRoutingInterfacesState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchRoutingInterfacesState)(nil)).Elem()
}

type switchRoutingInterfacesArgs struct {
	// IPv4 default gateway
	DefaultGateway *string `pulumi:"defaultGateway"`
	// The id
	InterfaceId *string `pulumi:"interfaceId"`
	// IPv4 address
	InterfaceIp *string `pulumi:"interfaceIp"`
	// IPv6 addressing
	Ipv6 *SwitchRoutingInterfacesIpv6 `pulumi:"ipv6"`
	// Multicast routing status
	MulticastRouting *string `pulumi:"multicastRouting"`
	// The name
	Name *string `pulumi:"name"`
	// IPv4 OSPF Settings
	OspfSettings *SwitchRoutingInterfacesOspfSettings `pulumi:"ospfSettings"`
	// IPv6 OSPF Settings
	OspfV3 *SwitchRoutingInterfacesOspfV3 `pulumi:"ospfV3"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
	// IPv4 subnet
	Subnet *string `pulumi:"subnet"`
	// VLAN id
	VlanId *int `pulumi:"vlanId"`
}

// The set of arguments for constructing a SwitchRoutingInterfaces resource.
type SwitchRoutingInterfacesArgs struct {
	// IPv4 default gateway
	DefaultGateway pulumi.StringPtrInput
	// The id
	InterfaceId pulumi.StringPtrInput
	// IPv4 address
	InterfaceIp pulumi.StringPtrInput
	// IPv6 addressing
	Ipv6 SwitchRoutingInterfacesIpv6PtrInput
	// Multicast routing status
	MulticastRouting pulumi.StringPtrInput
	// The name
	Name pulumi.StringPtrInput
	// IPv4 OSPF Settings
	OspfSettings SwitchRoutingInterfacesOspfSettingsPtrInput
	// IPv6 OSPF Settings
	OspfV3 SwitchRoutingInterfacesOspfV3PtrInput
	// serial path parameter.
	Serial pulumi.StringInput
	// IPv4 subnet
	Subnet pulumi.StringPtrInput
	// VLAN id
	VlanId pulumi.IntPtrInput
}

func (SwitchRoutingInterfacesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchRoutingInterfacesArgs)(nil)).Elem()
}

type SwitchRoutingInterfacesInput interface {
	pulumi.Input

	ToSwitchRoutingInterfacesOutput() SwitchRoutingInterfacesOutput
	ToSwitchRoutingInterfacesOutputWithContext(ctx context.Context) SwitchRoutingInterfacesOutput
}

func (*SwitchRoutingInterfaces) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchRoutingInterfaces)(nil)).Elem()
}

func (i *SwitchRoutingInterfaces) ToSwitchRoutingInterfacesOutput() SwitchRoutingInterfacesOutput {
	return i.ToSwitchRoutingInterfacesOutputWithContext(context.Background())
}

func (i *SwitchRoutingInterfaces) ToSwitchRoutingInterfacesOutputWithContext(ctx context.Context) SwitchRoutingInterfacesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchRoutingInterfacesOutput)
}

// SwitchRoutingInterfacesArrayInput is an input type that accepts SwitchRoutingInterfacesArray and SwitchRoutingInterfacesArrayOutput values.
// You can construct a concrete instance of `SwitchRoutingInterfacesArrayInput` via:
//
//	SwitchRoutingInterfacesArray{ SwitchRoutingInterfacesArgs{...} }
type SwitchRoutingInterfacesArrayInput interface {
	pulumi.Input

	ToSwitchRoutingInterfacesArrayOutput() SwitchRoutingInterfacesArrayOutput
	ToSwitchRoutingInterfacesArrayOutputWithContext(context.Context) SwitchRoutingInterfacesArrayOutput
}

type SwitchRoutingInterfacesArray []SwitchRoutingInterfacesInput

func (SwitchRoutingInterfacesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchRoutingInterfaces)(nil)).Elem()
}

func (i SwitchRoutingInterfacesArray) ToSwitchRoutingInterfacesArrayOutput() SwitchRoutingInterfacesArrayOutput {
	return i.ToSwitchRoutingInterfacesArrayOutputWithContext(context.Background())
}

func (i SwitchRoutingInterfacesArray) ToSwitchRoutingInterfacesArrayOutputWithContext(ctx context.Context) SwitchRoutingInterfacesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchRoutingInterfacesArrayOutput)
}

// SwitchRoutingInterfacesMapInput is an input type that accepts SwitchRoutingInterfacesMap and SwitchRoutingInterfacesMapOutput values.
// You can construct a concrete instance of `SwitchRoutingInterfacesMapInput` via:
//
//	SwitchRoutingInterfacesMap{ "key": SwitchRoutingInterfacesArgs{...} }
type SwitchRoutingInterfacesMapInput interface {
	pulumi.Input

	ToSwitchRoutingInterfacesMapOutput() SwitchRoutingInterfacesMapOutput
	ToSwitchRoutingInterfacesMapOutputWithContext(context.Context) SwitchRoutingInterfacesMapOutput
}

type SwitchRoutingInterfacesMap map[string]SwitchRoutingInterfacesInput

func (SwitchRoutingInterfacesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchRoutingInterfaces)(nil)).Elem()
}

func (i SwitchRoutingInterfacesMap) ToSwitchRoutingInterfacesMapOutput() SwitchRoutingInterfacesMapOutput {
	return i.ToSwitchRoutingInterfacesMapOutputWithContext(context.Background())
}

func (i SwitchRoutingInterfacesMap) ToSwitchRoutingInterfacesMapOutputWithContext(ctx context.Context) SwitchRoutingInterfacesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchRoutingInterfacesMapOutput)
}

type SwitchRoutingInterfacesOutput struct{ *pulumi.OutputState }

func (SwitchRoutingInterfacesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchRoutingInterfaces)(nil)).Elem()
}

func (o SwitchRoutingInterfacesOutput) ToSwitchRoutingInterfacesOutput() SwitchRoutingInterfacesOutput {
	return o
}

func (o SwitchRoutingInterfacesOutput) ToSwitchRoutingInterfacesOutputWithContext(ctx context.Context) SwitchRoutingInterfacesOutput {
	return o
}

// IPv4 default gateway
func (o SwitchRoutingInterfacesOutput) DefaultGateway() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) pulumi.StringOutput { return v.DefaultGateway }).(pulumi.StringOutput)
}

// The id
func (o SwitchRoutingInterfacesOutput) InterfaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) pulumi.StringOutput { return v.InterfaceId }).(pulumi.StringOutput)
}

// IPv4 address
func (o SwitchRoutingInterfacesOutput) InterfaceIp() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) pulumi.StringOutput { return v.InterfaceIp }).(pulumi.StringOutput)
}

// IPv6 addressing
func (o SwitchRoutingInterfacesOutput) Ipv6() SwitchRoutingInterfacesIpv6Output {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) SwitchRoutingInterfacesIpv6Output { return v.Ipv6 }).(SwitchRoutingInterfacesIpv6Output)
}

// Multicast routing status
func (o SwitchRoutingInterfacesOutput) MulticastRouting() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) pulumi.StringOutput { return v.MulticastRouting }).(pulumi.StringOutput)
}

// The name
func (o SwitchRoutingInterfacesOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// IPv4 OSPF Settings
func (o SwitchRoutingInterfacesOutput) OspfSettings() SwitchRoutingInterfacesOspfSettingsOutput {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) SwitchRoutingInterfacesOspfSettingsOutput { return v.OspfSettings }).(SwitchRoutingInterfacesOspfSettingsOutput)
}

// IPv6 OSPF Settings
func (o SwitchRoutingInterfacesOutput) OspfV3() SwitchRoutingInterfacesOspfV3Output {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) SwitchRoutingInterfacesOspfV3Output { return v.OspfV3 }).(SwitchRoutingInterfacesOspfV3Output)
}

// serial path parameter.
func (o SwitchRoutingInterfacesOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

// IPv4 subnet
func (o SwitchRoutingInterfacesOutput) Subnet() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) pulumi.StringOutput { return v.Subnet }).(pulumi.StringOutput)
}

// VLAN id
func (o SwitchRoutingInterfacesOutput) VlanId() pulumi.IntOutput {
	return o.ApplyT(func(v *SwitchRoutingInterfaces) pulumi.IntOutput { return v.VlanId }).(pulumi.IntOutput)
}

type SwitchRoutingInterfacesArrayOutput struct{ *pulumi.OutputState }

func (SwitchRoutingInterfacesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchRoutingInterfaces)(nil)).Elem()
}

func (o SwitchRoutingInterfacesArrayOutput) ToSwitchRoutingInterfacesArrayOutput() SwitchRoutingInterfacesArrayOutput {
	return o
}

func (o SwitchRoutingInterfacesArrayOutput) ToSwitchRoutingInterfacesArrayOutputWithContext(ctx context.Context) SwitchRoutingInterfacesArrayOutput {
	return o
}

func (o SwitchRoutingInterfacesArrayOutput) Index(i pulumi.IntInput) SwitchRoutingInterfacesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchRoutingInterfaces {
		return vs[0].([]*SwitchRoutingInterfaces)[vs[1].(int)]
	}).(SwitchRoutingInterfacesOutput)
}

type SwitchRoutingInterfacesMapOutput struct{ *pulumi.OutputState }

func (SwitchRoutingInterfacesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchRoutingInterfaces)(nil)).Elem()
}

func (o SwitchRoutingInterfacesMapOutput) ToSwitchRoutingInterfacesMapOutput() SwitchRoutingInterfacesMapOutput {
	return o
}

func (o SwitchRoutingInterfacesMapOutput) ToSwitchRoutingInterfacesMapOutputWithContext(ctx context.Context) SwitchRoutingInterfacesMapOutput {
	return o
}

func (o SwitchRoutingInterfacesMapOutput) MapIndex(k pulumi.StringInput) SwitchRoutingInterfacesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchRoutingInterfaces {
		return vs[0].(map[string]*SwitchRoutingInterfaces)[vs[1].(string)]
	}).(SwitchRoutingInterfacesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchRoutingInterfacesInput)(nil)).Elem(), &SwitchRoutingInterfaces{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchRoutingInterfacesArrayInput)(nil)).Elem(), SwitchRoutingInterfacesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchRoutingInterfacesMapInput)(nil)).Elem(), SwitchRoutingInterfacesMap{})
	pulumi.RegisterOutputType(SwitchRoutingInterfacesOutput{})
	pulumi.RegisterOutputType(SwitchRoutingInterfacesArrayOutput{})
	pulumi.RegisterOutputType(SwitchRoutingInterfacesMapOutput{})
}
