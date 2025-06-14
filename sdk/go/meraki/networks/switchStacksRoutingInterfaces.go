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
// $ pulumi import meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces example "interface_id,network_id,switch_stack_id"
// ```
type SwitchStacksRoutingInterfaces struct {
	pulumi.CustomResourceState

	// IPv4 default gateway
	DefaultGateway pulumi.StringOutput `pulumi:"defaultGateway"`
	// IPv4 default gateway
	DefaultGatewayResponse pulumi.StringOutput `pulumi:"defaultGatewayResponse"`
	// The id
	InterfaceId pulumi.StringOutput `pulumi:"interfaceId"`
	// IPv4 address
	InterfaceIp pulumi.StringOutput `pulumi:"interfaceIp"`
	// IPv6 addressing
	Ipv6 SwitchStacksRoutingInterfacesIpv6Output `pulumi:"ipv6"`
	// Multicast routing status
	MulticastRouting pulumi.StringOutput `pulumi:"multicastRouting"`
	// The name
	Name pulumi.StringOutput `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// IPv4 OSPF Settings
	OspfSettings SwitchStacksRoutingInterfacesOspfSettingsOutput `pulumi:"ospfSettings"`
	// IPv6 OSPF Settings
	OspfV3 SwitchStacksRoutingInterfacesOspfV3Output `pulumi:"ospfV3"`
	// IPv4 subnet
	Subnet pulumi.StringOutput `pulumi:"subnet"`
	// switchStackId path parameter. Switch stack ID
	SwitchStackId pulumi.StringOutput `pulumi:"switchStackId"`
	// VLAN id
	VlanId pulumi.IntOutput `pulumi:"vlanId"`
}

// NewSwitchStacksRoutingInterfaces registers a new resource with the given unique name, arguments, and options.
func NewSwitchStacksRoutingInterfaces(ctx *pulumi.Context,
	name string, args *SwitchStacksRoutingInterfacesArgs, opts ...pulumi.ResourceOption) (*SwitchStacksRoutingInterfaces, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	if args.SwitchStackId == nil {
		return nil, errors.New("invalid value for required argument 'SwitchStackId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchStacksRoutingInterfaces
	err := ctx.RegisterResource("meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchStacksRoutingInterfaces gets an existing SwitchStacksRoutingInterfaces resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchStacksRoutingInterfaces(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchStacksRoutingInterfacesState, opts ...pulumi.ResourceOption) (*SwitchStacksRoutingInterfaces, error) {
	var resource SwitchStacksRoutingInterfaces
	err := ctx.ReadResource("meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchStacksRoutingInterfaces resources.
type switchStacksRoutingInterfacesState struct {
	// IPv4 default gateway
	DefaultGateway *string `pulumi:"defaultGateway"`
	// IPv4 default gateway
	DefaultGatewayResponse *string `pulumi:"defaultGatewayResponse"`
	// The id
	InterfaceId *string `pulumi:"interfaceId"`
	// IPv4 address
	InterfaceIp *string `pulumi:"interfaceIp"`
	// IPv6 addressing
	Ipv6 *SwitchStacksRoutingInterfacesIpv6 `pulumi:"ipv6"`
	// Multicast routing status
	MulticastRouting *string `pulumi:"multicastRouting"`
	// The name
	Name *string `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// IPv4 OSPF Settings
	OspfSettings *SwitchStacksRoutingInterfacesOspfSettings `pulumi:"ospfSettings"`
	// IPv6 OSPF Settings
	OspfV3 *SwitchStacksRoutingInterfacesOspfV3 `pulumi:"ospfV3"`
	// IPv4 subnet
	Subnet *string `pulumi:"subnet"`
	// switchStackId path parameter. Switch stack ID
	SwitchStackId *string `pulumi:"switchStackId"`
	// VLAN id
	VlanId *int `pulumi:"vlanId"`
}

type SwitchStacksRoutingInterfacesState struct {
	// IPv4 default gateway
	DefaultGateway pulumi.StringPtrInput
	// IPv4 default gateway
	DefaultGatewayResponse pulumi.StringPtrInput
	// The id
	InterfaceId pulumi.StringPtrInput
	// IPv4 address
	InterfaceIp pulumi.StringPtrInput
	// IPv6 addressing
	Ipv6 SwitchStacksRoutingInterfacesIpv6PtrInput
	// Multicast routing status
	MulticastRouting pulumi.StringPtrInput
	// The name
	Name pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// IPv4 OSPF Settings
	OspfSettings SwitchStacksRoutingInterfacesOspfSettingsPtrInput
	// IPv6 OSPF Settings
	OspfV3 SwitchStacksRoutingInterfacesOspfV3PtrInput
	// IPv4 subnet
	Subnet pulumi.StringPtrInput
	// switchStackId path parameter. Switch stack ID
	SwitchStackId pulumi.StringPtrInput
	// VLAN id
	VlanId pulumi.IntPtrInput
}

func (SwitchStacksRoutingInterfacesState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchStacksRoutingInterfacesState)(nil)).Elem()
}

type switchStacksRoutingInterfacesArgs struct {
	// IPv4 default gateway
	DefaultGateway *string `pulumi:"defaultGateway"`
	// The id
	InterfaceId *string `pulumi:"interfaceId"`
	// IPv4 address
	InterfaceIp *string `pulumi:"interfaceIp"`
	// IPv6 addressing
	Ipv6 *SwitchStacksRoutingInterfacesIpv6 `pulumi:"ipv6"`
	// Multicast routing status
	MulticastRouting *string `pulumi:"multicastRouting"`
	// The name
	Name *string `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// IPv4 OSPF Settings
	OspfSettings *SwitchStacksRoutingInterfacesOspfSettings `pulumi:"ospfSettings"`
	// IPv4 subnet
	Subnet *string `pulumi:"subnet"`
	// switchStackId path parameter. Switch stack ID
	SwitchStackId string `pulumi:"switchStackId"`
	// VLAN id
	VlanId *int `pulumi:"vlanId"`
}

// The set of arguments for constructing a SwitchStacksRoutingInterfaces resource.
type SwitchStacksRoutingInterfacesArgs struct {
	// IPv4 default gateway
	DefaultGateway pulumi.StringPtrInput
	// The id
	InterfaceId pulumi.StringPtrInput
	// IPv4 address
	InterfaceIp pulumi.StringPtrInput
	// IPv6 addressing
	Ipv6 SwitchStacksRoutingInterfacesIpv6PtrInput
	// Multicast routing status
	MulticastRouting pulumi.StringPtrInput
	// The name
	Name pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// IPv4 OSPF Settings
	OspfSettings SwitchStacksRoutingInterfacesOspfSettingsPtrInput
	// IPv4 subnet
	Subnet pulumi.StringPtrInput
	// switchStackId path parameter. Switch stack ID
	SwitchStackId pulumi.StringInput
	// VLAN id
	VlanId pulumi.IntPtrInput
}

func (SwitchStacksRoutingInterfacesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchStacksRoutingInterfacesArgs)(nil)).Elem()
}

type SwitchStacksRoutingInterfacesInput interface {
	pulumi.Input

	ToSwitchStacksRoutingInterfacesOutput() SwitchStacksRoutingInterfacesOutput
	ToSwitchStacksRoutingInterfacesOutputWithContext(ctx context.Context) SwitchStacksRoutingInterfacesOutput
}

func (*SwitchStacksRoutingInterfaces) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchStacksRoutingInterfaces)(nil)).Elem()
}

func (i *SwitchStacksRoutingInterfaces) ToSwitchStacksRoutingInterfacesOutput() SwitchStacksRoutingInterfacesOutput {
	return i.ToSwitchStacksRoutingInterfacesOutputWithContext(context.Background())
}

func (i *SwitchStacksRoutingInterfaces) ToSwitchStacksRoutingInterfacesOutputWithContext(ctx context.Context) SwitchStacksRoutingInterfacesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchStacksRoutingInterfacesOutput)
}

// SwitchStacksRoutingInterfacesArrayInput is an input type that accepts SwitchStacksRoutingInterfacesArray and SwitchStacksRoutingInterfacesArrayOutput values.
// You can construct a concrete instance of `SwitchStacksRoutingInterfacesArrayInput` via:
//
//	SwitchStacksRoutingInterfacesArray{ SwitchStacksRoutingInterfacesArgs{...} }
type SwitchStacksRoutingInterfacesArrayInput interface {
	pulumi.Input

	ToSwitchStacksRoutingInterfacesArrayOutput() SwitchStacksRoutingInterfacesArrayOutput
	ToSwitchStacksRoutingInterfacesArrayOutputWithContext(context.Context) SwitchStacksRoutingInterfacesArrayOutput
}

type SwitchStacksRoutingInterfacesArray []SwitchStacksRoutingInterfacesInput

func (SwitchStacksRoutingInterfacesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchStacksRoutingInterfaces)(nil)).Elem()
}

func (i SwitchStacksRoutingInterfacesArray) ToSwitchStacksRoutingInterfacesArrayOutput() SwitchStacksRoutingInterfacesArrayOutput {
	return i.ToSwitchStacksRoutingInterfacesArrayOutputWithContext(context.Background())
}

func (i SwitchStacksRoutingInterfacesArray) ToSwitchStacksRoutingInterfacesArrayOutputWithContext(ctx context.Context) SwitchStacksRoutingInterfacesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchStacksRoutingInterfacesArrayOutput)
}

// SwitchStacksRoutingInterfacesMapInput is an input type that accepts SwitchStacksRoutingInterfacesMap and SwitchStacksRoutingInterfacesMapOutput values.
// You can construct a concrete instance of `SwitchStacksRoutingInterfacesMapInput` via:
//
//	SwitchStacksRoutingInterfacesMap{ "key": SwitchStacksRoutingInterfacesArgs{...} }
type SwitchStacksRoutingInterfacesMapInput interface {
	pulumi.Input

	ToSwitchStacksRoutingInterfacesMapOutput() SwitchStacksRoutingInterfacesMapOutput
	ToSwitchStacksRoutingInterfacesMapOutputWithContext(context.Context) SwitchStacksRoutingInterfacesMapOutput
}

type SwitchStacksRoutingInterfacesMap map[string]SwitchStacksRoutingInterfacesInput

func (SwitchStacksRoutingInterfacesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchStacksRoutingInterfaces)(nil)).Elem()
}

func (i SwitchStacksRoutingInterfacesMap) ToSwitchStacksRoutingInterfacesMapOutput() SwitchStacksRoutingInterfacesMapOutput {
	return i.ToSwitchStacksRoutingInterfacesMapOutputWithContext(context.Background())
}

func (i SwitchStacksRoutingInterfacesMap) ToSwitchStacksRoutingInterfacesMapOutputWithContext(ctx context.Context) SwitchStacksRoutingInterfacesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchStacksRoutingInterfacesMapOutput)
}

type SwitchStacksRoutingInterfacesOutput struct{ *pulumi.OutputState }

func (SwitchStacksRoutingInterfacesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchStacksRoutingInterfaces)(nil)).Elem()
}

func (o SwitchStacksRoutingInterfacesOutput) ToSwitchStacksRoutingInterfacesOutput() SwitchStacksRoutingInterfacesOutput {
	return o
}

func (o SwitchStacksRoutingInterfacesOutput) ToSwitchStacksRoutingInterfacesOutputWithContext(ctx context.Context) SwitchStacksRoutingInterfacesOutput {
	return o
}

// IPv4 default gateway
func (o SwitchStacksRoutingInterfacesOutput) DefaultGateway() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) pulumi.StringOutput { return v.DefaultGateway }).(pulumi.StringOutput)
}

// IPv4 default gateway
func (o SwitchStacksRoutingInterfacesOutput) DefaultGatewayResponse() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) pulumi.StringOutput { return v.DefaultGatewayResponse }).(pulumi.StringOutput)
}

// The id
func (o SwitchStacksRoutingInterfacesOutput) InterfaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) pulumi.StringOutput { return v.InterfaceId }).(pulumi.StringOutput)
}

// IPv4 address
func (o SwitchStacksRoutingInterfacesOutput) InterfaceIp() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) pulumi.StringOutput { return v.InterfaceIp }).(pulumi.StringOutput)
}

// IPv6 addressing
func (o SwitchStacksRoutingInterfacesOutput) Ipv6() SwitchStacksRoutingInterfacesIpv6Output {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) SwitchStacksRoutingInterfacesIpv6Output { return v.Ipv6 }).(SwitchStacksRoutingInterfacesIpv6Output)
}

// Multicast routing status
func (o SwitchStacksRoutingInterfacesOutput) MulticastRouting() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) pulumi.StringOutput { return v.MulticastRouting }).(pulumi.StringOutput)
}

// The name
func (o SwitchStacksRoutingInterfacesOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o SwitchStacksRoutingInterfacesOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// IPv4 OSPF Settings
func (o SwitchStacksRoutingInterfacesOutput) OspfSettings() SwitchStacksRoutingInterfacesOspfSettingsOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) SwitchStacksRoutingInterfacesOspfSettingsOutput {
		return v.OspfSettings
	}).(SwitchStacksRoutingInterfacesOspfSettingsOutput)
}

// IPv6 OSPF Settings
func (o SwitchStacksRoutingInterfacesOutput) OspfV3() SwitchStacksRoutingInterfacesOspfV3Output {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) SwitchStacksRoutingInterfacesOspfV3Output { return v.OspfV3 }).(SwitchStacksRoutingInterfacesOspfV3Output)
}

// IPv4 subnet
func (o SwitchStacksRoutingInterfacesOutput) Subnet() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) pulumi.StringOutput { return v.Subnet }).(pulumi.StringOutput)
}

// switchStackId path parameter. Switch stack ID
func (o SwitchStacksRoutingInterfacesOutput) SwitchStackId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) pulumi.StringOutput { return v.SwitchStackId }).(pulumi.StringOutput)
}

// VLAN id
func (o SwitchStacksRoutingInterfacesOutput) VlanId() pulumi.IntOutput {
	return o.ApplyT(func(v *SwitchStacksRoutingInterfaces) pulumi.IntOutput { return v.VlanId }).(pulumi.IntOutput)
}

type SwitchStacksRoutingInterfacesArrayOutput struct{ *pulumi.OutputState }

func (SwitchStacksRoutingInterfacesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchStacksRoutingInterfaces)(nil)).Elem()
}

func (o SwitchStacksRoutingInterfacesArrayOutput) ToSwitchStacksRoutingInterfacesArrayOutput() SwitchStacksRoutingInterfacesArrayOutput {
	return o
}

func (o SwitchStacksRoutingInterfacesArrayOutput) ToSwitchStacksRoutingInterfacesArrayOutputWithContext(ctx context.Context) SwitchStacksRoutingInterfacesArrayOutput {
	return o
}

func (o SwitchStacksRoutingInterfacesArrayOutput) Index(i pulumi.IntInput) SwitchStacksRoutingInterfacesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchStacksRoutingInterfaces {
		return vs[0].([]*SwitchStacksRoutingInterfaces)[vs[1].(int)]
	}).(SwitchStacksRoutingInterfacesOutput)
}

type SwitchStacksRoutingInterfacesMapOutput struct{ *pulumi.OutputState }

func (SwitchStacksRoutingInterfacesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchStacksRoutingInterfaces)(nil)).Elem()
}

func (o SwitchStacksRoutingInterfacesMapOutput) ToSwitchStacksRoutingInterfacesMapOutput() SwitchStacksRoutingInterfacesMapOutput {
	return o
}

func (o SwitchStacksRoutingInterfacesMapOutput) ToSwitchStacksRoutingInterfacesMapOutputWithContext(ctx context.Context) SwitchStacksRoutingInterfacesMapOutput {
	return o
}

func (o SwitchStacksRoutingInterfacesMapOutput) MapIndex(k pulumi.StringInput) SwitchStacksRoutingInterfacesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchStacksRoutingInterfaces {
		return vs[0].(map[string]*SwitchStacksRoutingInterfaces)[vs[1].(string)]
	}).(SwitchStacksRoutingInterfacesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchStacksRoutingInterfacesInput)(nil)).Elem(), &SwitchStacksRoutingInterfaces{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchStacksRoutingInterfacesArrayInput)(nil)).Elem(), SwitchStacksRoutingInterfacesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchStacksRoutingInterfacesMapInput)(nil)).Elem(), SwitchStacksRoutingInterfacesMap{})
	pulumi.RegisterOutputType(SwitchStacksRoutingInterfacesOutput{})
	pulumi.RegisterOutputType(SwitchStacksRoutingInterfacesArrayOutput{})
	pulumi.RegisterOutputType(SwitchStacksRoutingInterfacesMapOutput{})
}
