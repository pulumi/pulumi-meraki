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
//			example, err := networks.NewSwitchDhcpServerPolicyArpInspectionTrustedServers(ctx, "example", &networks.SwitchDhcpServerPolicyArpInspectionTrustedServersArgs{
//				Ipv4: &networks.SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Args{
//					Address: pulumi.String("1.2.3.4"),
//				},
//				Mac:       pulumi.String("00:11:22:33:44:55"),
//				NetworkId: pulumi.String("string"),
//				Vlan:      pulumi.Int(100),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksSwitchDhcpServerPolicyArpInspectionTrustedServersExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers example "network_id"
// ```
type SwitchDhcpServerPolicyArpInspectionTrustedServers struct {
	pulumi.CustomResourceState

	// IPv4 attributes of the trusted server.
	Ipv4 SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Output `pulumi:"ipv4"`
	// Mac address of the trusted server.
	Mac pulumi.StringOutput `pulumi:"mac"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// ID of the trusted server.
	TrustedServerId pulumi.StringOutput `pulumi:"trustedServerId"`
	// Vlan ID of the trusted server.
	Vlan pulumi.IntOutput `pulumi:"vlan"`
}

// NewSwitchDhcpServerPolicyArpInspectionTrustedServers registers a new resource with the given unique name, arguments, and options.
func NewSwitchDhcpServerPolicyArpInspectionTrustedServers(ctx *pulumi.Context,
	name string, args *SwitchDhcpServerPolicyArpInspectionTrustedServersArgs, opts ...pulumi.ResourceOption) (*SwitchDhcpServerPolicyArpInspectionTrustedServers, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchDhcpServerPolicyArpInspectionTrustedServers
	err := ctx.RegisterResource("meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchDhcpServerPolicyArpInspectionTrustedServers gets an existing SwitchDhcpServerPolicyArpInspectionTrustedServers resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchDhcpServerPolicyArpInspectionTrustedServers(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchDhcpServerPolicyArpInspectionTrustedServersState, opts ...pulumi.ResourceOption) (*SwitchDhcpServerPolicyArpInspectionTrustedServers, error) {
	var resource SwitchDhcpServerPolicyArpInspectionTrustedServers
	err := ctx.ReadResource("meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchDhcpServerPolicyArpInspectionTrustedServers resources.
type switchDhcpServerPolicyArpInspectionTrustedServersState struct {
	// IPv4 attributes of the trusted server.
	Ipv4 *SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4 `pulumi:"ipv4"`
	// Mac address of the trusted server.
	Mac *string `pulumi:"mac"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// ID of the trusted server.
	TrustedServerId *string `pulumi:"trustedServerId"`
	// Vlan ID of the trusted server.
	Vlan *int `pulumi:"vlan"`
}

type SwitchDhcpServerPolicyArpInspectionTrustedServersState struct {
	// IPv4 attributes of the trusted server.
	Ipv4 SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4PtrInput
	// Mac address of the trusted server.
	Mac pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// ID of the trusted server.
	TrustedServerId pulumi.StringPtrInput
	// Vlan ID of the trusted server.
	Vlan pulumi.IntPtrInput
}

func (SwitchDhcpServerPolicyArpInspectionTrustedServersState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchDhcpServerPolicyArpInspectionTrustedServersState)(nil)).Elem()
}

type switchDhcpServerPolicyArpInspectionTrustedServersArgs struct {
	// IPv4 attributes of the trusted server.
	Ipv4 *SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4 `pulumi:"ipv4"`
	// Mac address of the trusted server.
	Mac *string `pulumi:"mac"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// ID of the trusted server.
	TrustedServerId *string `pulumi:"trustedServerId"`
	// Vlan ID of the trusted server.
	Vlan *int `pulumi:"vlan"`
}

// The set of arguments for constructing a SwitchDhcpServerPolicyArpInspectionTrustedServers resource.
type SwitchDhcpServerPolicyArpInspectionTrustedServersArgs struct {
	// IPv4 attributes of the trusted server.
	Ipv4 SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4PtrInput
	// Mac address of the trusted server.
	Mac pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// ID of the trusted server.
	TrustedServerId pulumi.StringPtrInput
	// Vlan ID of the trusted server.
	Vlan pulumi.IntPtrInput
}

func (SwitchDhcpServerPolicyArpInspectionTrustedServersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchDhcpServerPolicyArpInspectionTrustedServersArgs)(nil)).Elem()
}

type SwitchDhcpServerPolicyArpInspectionTrustedServersInput interface {
	pulumi.Input

	ToSwitchDhcpServerPolicyArpInspectionTrustedServersOutput() SwitchDhcpServerPolicyArpInspectionTrustedServersOutput
	ToSwitchDhcpServerPolicyArpInspectionTrustedServersOutputWithContext(ctx context.Context) SwitchDhcpServerPolicyArpInspectionTrustedServersOutput
}

func (*SwitchDhcpServerPolicyArpInspectionTrustedServers) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchDhcpServerPolicyArpInspectionTrustedServers)(nil)).Elem()
}

func (i *SwitchDhcpServerPolicyArpInspectionTrustedServers) ToSwitchDhcpServerPolicyArpInspectionTrustedServersOutput() SwitchDhcpServerPolicyArpInspectionTrustedServersOutput {
	return i.ToSwitchDhcpServerPolicyArpInspectionTrustedServersOutputWithContext(context.Background())
}

func (i *SwitchDhcpServerPolicyArpInspectionTrustedServers) ToSwitchDhcpServerPolicyArpInspectionTrustedServersOutputWithContext(ctx context.Context) SwitchDhcpServerPolicyArpInspectionTrustedServersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchDhcpServerPolicyArpInspectionTrustedServersOutput)
}

// SwitchDhcpServerPolicyArpInspectionTrustedServersArrayInput is an input type that accepts SwitchDhcpServerPolicyArpInspectionTrustedServersArray and SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput values.
// You can construct a concrete instance of `SwitchDhcpServerPolicyArpInspectionTrustedServersArrayInput` via:
//
//	SwitchDhcpServerPolicyArpInspectionTrustedServersArray{ SwitchDhcpServerPolicyArpInspectionTrustedServersArgs{...} }
type SwitchDhcpServerPolicyArpInspectionTrustedServersArrayInput interface {
	pulumi.Input

	ToSwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput() SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput
	ToSwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutputWithContext(context.Context) SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput
}

type SwitchDhcpServerPolicyArpInspectionTrustedServersArray []SwitchDhcpServerPolicyArpInspectionTrustedServersInput

func (SwitchDhcpServerPolicyArpInspectionTrustedServersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchDhcpServerPolicyArpInspectionTrustedServers)(nil)).Elem()
}

func (i SwitchDhcpServerPolicyArpInspectionTrustedServersArray) ToSwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput() SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput {
	return i.ToSwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutputWithContext(context.Background())
}

func (i SwitchDhcpServerPolicyArpInspectionTrustedServersArray) ToSwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutputWithContext(ctx context.Context) SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput)
}

// SwitchDhcpServerPolicyArpInspectionTrustedServersMapInput is an input type that accepts SwitchDhcpServerPolicyArpInspectionTrustedServersMap and SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput values.
// You can construct a concrete instance of `SwitchDhcpServerPolicyArpInspectionTrustedServersMapInput` via:
//
//	SwitchDhcpServerPolicyArpInspectionTrustedServersMap{ "key": SwitchDhcpServerPolicyArpInspectionTrustedServersArgs{...} }
type SwitchDhcpServerPolicyArpInspectionTrustedServersMapInput interface {
	pulumi.Input

	ToSwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput() SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput
	ToSwitchDhcpServerPolicyArpInspectionTrustedServersMapOutputWithContext(context.Context) SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput
}

type SwitchDhcpServerPolicyArpInspectionTrustedServersMap map[string]SwitchDhcpServerPolicyArpInspectionTrustedServersInput

func (SwitchDhcpServerPolicyArpInspectionTrustedServersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchDhcpServerPolicyArpInspectionTrustedServers)(nil)).Elem()
}

func (i SwitchDhcpServerPolicyArpInspectionTrustedServersMap) ToSwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput() SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput {
	return i.ToSwitchDhcpServerPolicyArpInspectionTrustedServersMapOutputWithContext(context.Background())
}

func (i SwitchDhcpServerPolicyArpInspectionTrustedServersMap) ToSwitchDhcpServerPolicyArpInspectionTrustedServersMapOutputWithContext(ctx context.Context) SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput)
}

type SwitchDhcpServerPolicyArpInspectionTrustedServersOutput struct{ *pulumi.OutputState }

func (SwitchDhcpServerPolicyArpInspectionTrustedServersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchDhcpServerPolicyArpInspectionTrustedServers)(nil)).Elem()
}

func (o SwitchDhcpServerPolicyArpInspectionTrustedServersOutput) ToSwitchDhcpServerPolicyArpInspectionTrustedServersOutput() SwitchDhcpServerPolicyArpInspectionTrustedServersOutput {
	return o
}

func (o SwitchDhcpServerPolicyArpInspectionTrustedServersOutput) ToSwitchDhcpServerPolicyArpInspectionTrustedServersOutputWithContext(ctx context.Context) SwitchDhcpServerPolicyArpInspectionTrustedServersOutput {
	return o
}

// IPv4 attributes of the trusted server.
func (o SwitchDhcpServerPolicyArpInspectionTrustedServersOutput) Ipv4() SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Output {
	return o.ApplyT(func(v *SwitchDhcpServerPolicyArpInspectionTrustedServers) SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Output {
		return v.Ipv4
	}).(SwitchDhcpServerPolicyArpInspectionTrustedServersIpv4Output)
}

// Mac address of the trusted server.
func (o SwitchDhcpServerPolicyArpInspectionTrustedServersOutput) Mac() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchDhcpServerPolicyArpInspectionTrustedServers) pulumi.StringOutput { return v.Mac }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o SwitchDhcpServerPolicyArpInspectionTrustedServersOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchDhcpServerPolicyArpInspectionTrustedServers) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// ID of the trusted server.
func (o SwitchDhcpServerPolicyArpInspectionTrustedServersOutput) TrustedServerId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchDhcpServerPolicyArpInspectionTrustedServers) pulumi.StringOutput {
		return v.TrustedServerId
	}).(pulumi.StringOutput)
}

// Vlan ID of the trusted server.
func (o SwitchDhcpServerPolicyArpInspectionTrustedServersOutput) Vlan() pulumi.IntOutput {
	return o.ApplyT(func(v *SwitchDhcpServerPolicyArpInspectionTrustedServers) pulumi.IntOutput { return v.Vlan }).(pulumi.IntOutput)
}

type SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput struct{ *pulumi.OutputState }

func (SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchDhcpServerPolicyArpInspectionTrustedServers)(nil)).Elem()
}

func (o SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput) ToSwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput() SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput {
	return o
}

func (o SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput) ToSwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutputWithContext(ctx context.Context) SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput {
	return o
}

func (o SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput) Index(i pulumi.IntInput) SwitchDhcpServerPolicyArpInspectionTrustedServersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchDhcpServerPolicyArpInspectionTrustedServers {
		return vs[0].([]*SwitchDhcpServerPolicyArpInspectionTrustedServers)[vs[1].(int)]
	}).(SwitchDhcpServerPolicyArpInspectionTrustedServersOutput)
}

type SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput struct{ *pulumi.OutputState }

func (SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchDhcpServerPolicyArpInspectionTrustedServers)(nil)).Elem()
}

func (o SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput) ToSwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput() SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput {
	return o
}

func (o SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput) ToSwitchDhcpServerPolicyArpInspectionTrustedServersMapOutputWithContext(ctx context.Context) SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput {
	return o
}

func (o SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput) MapIndex(k pulumi.StringInput) SwitchDhcpServerPolicyArpInspectionTrustedServersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchDhcpServerPolicyArpInspectionTrustedServers {
		return vs[0].(map[string]*SwitchDhcpServerPolicyArpInspectionTrustedServers)[vs[1].(string)]
	}).(SwitchDhcpServerPolicyArpInspectionTrustedServersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchDhcpServerPolicyArpInspectionTrustedServersInput)(nil)).Elem(), &SwitchDhcpServerPolicyArpInspectionTrustedServers{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchDhcpServerPolicyArpInspectionTrustedServersArrayInput)(nil)).Elem(), SwitchDhcpServerPolicyArpInspectionTrustedServersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchDhcpServerPolicyArpInspectionTrustedServersMapInput)(nil)).Elem(), SwitchDhcpServerPolicyArpInspectionTrustedServersMap{})
	pulumi.RegisterOutputType(SwitchDhcpServerPolicyArpInspectionTrustedServersOutput{})
	pulumi.RegisterOutputType(SwitchDhcpServerPolicyArpInspectionTrustedServersArrayOutput{})
	pulumi.RegisterOutputType(SwitchDhcpServerPolicyArpInspectionTrustedServersMapOutput{})
}
