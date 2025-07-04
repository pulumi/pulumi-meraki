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
//			example, err := networks.NewCellularGatewayDhcp(ctx, "example", &networks.CellularGatewayDhcpArgs{
//				DhcpLeaseTime: pulumi.String("1 hour"),
//				DnsCustomNameservers: pulumi.StringArray{
//					pulumi.String("172.16.2.111"),
//					pulumi.String("172.16.2.30"),
//				},
//				DnsNameservers: pulumi.String("custom"),
//				NetworkId:      pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksCellularGatewayDhcpExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/cellularGatewayDhcp:CellularGatewayDhcp example "network_id"
// ```
type CellularGatewayDhcp struct {
	pulumi.CustomResourceState

	// DHCP Lease time for all MG in the network.
	DhcpLeaseTime pulumi.StringOutput `pulumi:"dhcpLeaseTime"`
	// List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
	DnsCustomNameservers pulumi.StringArrayOutput `pulumi:"dnsCustomNameservers"`
	// DNS name servers mode for all MG in the network.
	DnsNameservers pulumi.StringOutput `pulumi:"dnsNameservers"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
}

// NewCellularGatewayDhcp registers a new resource with the given unique name, arguments, and options.
func NewCellularGatewayDhcp(ctx *pulumi.Context,
	name string, args *CellularGatewayDhcpArgs, opts ...pulumi.ResourceOption) (*CellularGatewayDhcp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CellularGatewayDhcp
	err := ctx.RegisterResource("meraki:networks/cellularGatewayDhcp:CellularGatewayDhcp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCellularGatewayDhcp gets an existing CellularGatewayDhcp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCellularGatewayDhcp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CellularGatewayDhcpState, opts ...pulumi.ResourceOption) (*CellularGatewayDhcp, error) {
	var resource CellularGatewayDhcp
	err := ctx.ReadResource("meraki:networks/cellularGatewayDhcp:CellularGatewayDhcp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CellularGatewayDhcp resources.
type cellularGatewayDhcpState struct {
	// DHCP Lease time for all MG in the network.
	DhcpLeaseTime *string `pulumi:"dhcpLeaseTime"`
	// List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
	DnsCustomNameservers []string `pulumi:"dnsCustomNameservers"`
	// DNS name servers mode for all MG in the network.
	DnsNameservers *string `pulumi:"dnsNameservers"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

type CellularGatewayDhcpState struct {
	// DHCP Lease time for all MG in the network.
	DhcpLeaseTime pulumi.StringPtrInput
	// List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
	DnsCustomNameservers pulumi.StringArrayInput
	// DNS name servers mode for all MG in the network.
	DnsNameservers pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
}

func (CellularGatewayDhcpState) ElementType() reflect.Type {
	return reflect.TypeOf((*cellularGatewayDhcpState)(nil)).Elem()
}

type cellularGatewayDhcpArgs struct {
	// DHCP Lease time for all MG in the network.
	DhcpLeaseTime *string `pulumi:"dhcpLeaseTime"`
	// List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
	DnsCustomNameservers []string `pulumi:"dnsCustomNameservers"`
	// DNS name servers mode for all MG in the network.
	DnsNameservers *string `pulumi:"dnsNameservers"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// The set of arguments for constructing a CellularGatewayDhcp resource.
type CellularGatewayDhcpArgs struct {
	// DHCP Lease time for all MG in the network.
	DhcpLeaseTime pulumi.StringPtrInput
	// List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
	DnsCustomNameservers pulumi.StringArrayInput
	// DNS name servers mode for all MG in the network.
	DnsNameservers pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
}

func (CellularGatewayDhcpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cellularGatewayDhcpArgs)(nil)).Elem()
}

type CellularGatewayDhcpInput interface {
	pulumi.Input

	ToCellularGatewayDhcpOutput() CellularGatewayDhcpOutput
	ToCellularGatewayDhcpOutputWithContext(ctx context.Context) CellularGatewayDhcpOutput
}

func (*CellularGatewayDhcp) ElementType() reflect.Type {
	return reflect.TypeOf((**CellularGatewayDhcp)(nil)).Elem()
}

func (i *CellularGatewayDhcp) ToCellularGatewayDhcpOutput() CellularGatewayDhcpOutput {
	return i.ToCellularGatewayDhcpOutputWithContext(context.Background())
}

func (i *CellularGatewayDhcp) ToCellularGatewayDhcpOutputWithContext(ctx context.Context) CellularGatewayDhcpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularGatewayDhcpOutput)
}

// CellularGatewayDhcpArrayInput is an input type that accepts CellularGatewayDhcpArray and CellularGatewayDhcpArrayOutput values.
// You can construct a concrete instance of `CellularGatewayDhcpArrayInput` via:
//
//	CellularGatewayDhcpArray{ CellularGatewayDhcpArgs{...} }
type CellularGatewayDhcpArrayInput interface {
	pulumi.Input

	ToCellularGatewayDhcpArrayOutput() CellularGatewayDhcpArrayOutput
	ToCellularGatewayDhcpArrayOutputWithContext(context.Context) CellularGatewayDhcpArrayOutput
}

type CellularGatewayDhcpArray []CellularGatewayDhcpInput

func (CellularGatewayDhcpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CellularGatewayDhcp)(nil)).Elem()
}

func (i CellularGatewayDhcpArray) ToCellularGatewayDhcpArrayOutput() CellularGatewayDhcpArrayOutput {
	return i.ToCellularGatewayDhcpArrayOutputWithContext(context.Background())
}

func (i CellularGatewayDhcpArray) ToCellularGatewayDhcpArrayOutputWithContext(ctx context.Context) CellularGatewayDhcpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularGatewayDhcpArrayOutput)
}

// CellularGatewayDhcpMapInput is an input type that accepts CellularGatewayDhcpMap and CellularGatewayDhcpMapOutput values.
// You can construct a concrete instance of `CellularGatewayDhcpMapInput` via:
//
//	CellularGatewayDhcpMap{ "key": CellularGatewayDhcpArgs{...} }
type CellularGatewayDhcpMapInput interface {
	pulumi.Input

	ToCellularGatewayDhcpMapOutput() CellularGatewayDhcpMapOutput
	ToCellularGatewayDhcpMapOutputWithContext(context.Context) CellularGatewayDhcpMapOutput
}

type CellularGatewayDhcpMap map[string]CellularGatewayDhcpInput

func (CellularGatewayDhcpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CellularGatewayDhcp)(nil)).Elem()
}

func (i CellularGatewayDhcpMap) ToCellularGatewayDhcpMapOutput() CellularGatewayDhcpMapOutput {
	return i.ToCellularGatewayDhcpMapOutputWithContext(context.Background())
}

func (i CellularGatewayDhcpMap) ToCellularGatewayDhcpMapOutputWithContext(ctx context.Context) CellularGatewayDhcpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularGatewayDhcpMapOutput)
}

type CellularGatewayDhcpOutput struct{ *pulumi.OutputState }

func (CellularGatewayDhcpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CellularGatewayDhcp)(nil)).Elem()
}

func (o CellularGatewayDhcpOutput) ToCellularGatewayDhcpOutput() CellularGatewayDhcpOutput {
	return o
}

func (o CellularGatewayDhcpOutput) ToCellularGatewayDhcpOutputWithContext(ctx context.Context) CellularGatewayDhcpOutput {
	return o
}

// DHCP Lease time for all MG in the network.
func (o CellularGatewayDhcpOutput) DhcpLeaseTime() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularGatewayDhcp) pulumi.StringOutput { return v.DhcpLeaseTime }).(pulumi.StringOutput)
}

// List of fixed IPs representing the the DNS Name servers when the mode is 'custom'.
func (o CellularGatewayDhcpOutput) DnsCustomNameservers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CellularGatewayDhcp) pulumi.StringArrayOutput { return v.DnsCustomNameservers }).(pulumi.StringArrayOutput)
}

// DNS name servers mode for all MG in the network.
func (o CellularGatewayDhcpOutput) DnsNameservers() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularGatewayDhcp) pulumi.StringOutput { return v.DnsNameservers }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o CellularGatewayDhcpOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularGatewayDhcp) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

type CellularGatewayDhcpArrayOutput struct{ *pulumi.OutputState }

func (CellularGatewayDhcpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CellularGatewayDhcp)(nil)).Elem()
}

func (o CellularGatewayDhcpArrayOutput) ToCellularGatewayDhcpArrayOutput() CellularGatewayDhcpArrayOutput {
	return o
}

func (o CellularGatewayDhcpArrayOutput) ToCellularGatewayDhcpArrayOutputWithContext(ctx context.Context) CellularGatewayDhcpArrayOutput {
	return o
}

func (o CellularGatewayDhcpArrayOutput) Index(i pulumi.IntInput) CellularGatewayDhcpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CellularGatewayDhcp {
		return vs[0].([]*CellularGatewayDhcp)[vs[1].(int)]
	}).(CellularGatewayDhcpOutput)
}

type CellularGatewayDhcpMapOutput struct{ *pulumi.OutputState }

func (CellularGatewayDhcpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CellularGatewayDhcp)(nil)).Elem()
}

func (o CellularGatewayDhcpMapOutput) ToCellularGatewayDhcpMapOutput() CellularGatewayDhcpMapOutput {
	return o
}

func (o CellularGatewayDhcpMapOutput) ToCellularGatewayDhcpMapOutputWithContext(ctx context.Context) CellularGatewayDhcpMapOutput {
	return o
}

func (o CellularGatewayDhcpMapOutput) MapIndex(k pulumi.StringInput) CellularGatewayDhcpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CellularGatewayDhcp {
		return vs[0].(map[string]*CellularGatewayDhcp)[vs[1].(string)]
	}).(CellularGatewayDhcpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CellularGatewayDhcpInput)(nil)).Elem(), &CellularGatewayDhcp{})
	pulumi.RegisterInputType(reflect.TypeOf((*CellularGatewayDhcpArrayInput)(nil)).Elem(), CellularGatewayDhcpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CellularGatewayDhcpMapInput)(nil)).Elem(), CellularGatewayDhcpMap{})
	pulumi.RegisterOutputType(CellularGatewayDhcpOutput{})
	pulumi.RegisterOutputType(CellularGatewayDhcpArrayOutput{})
	pulumi.RegisterOutputType(CellularGatewayDhcpMapOutput{})
}
