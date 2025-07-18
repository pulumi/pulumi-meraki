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
//			example, err := networks.NewCellularGatewayConnectivityMonitoringDestinations(ctx, "example", &networks.CellularGatewayConnectivityMonitoringDestinationsArgs{
//				Destinations: networks.CellularGatewayConnectivityMonitoringDestinationsDestinationArray{
//					&networks.CellularGatewayConnectivityMonitoringDestinationsDestinationArgs{
//						Default:     pulumi.Bool(false),
//						Description: pulumi.String("Google"),
//						Ip:          pulumi.String("8.8.8.8"),
//					},
//				},
//				NetworkId: pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksCellularGatewayConnectivityMonitoringDestinationsExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/cellularGatewayConnectivityMonitoringDestinations:CellularGatewayConnectivityMonitoringDestinations example "network_id"
// ```
type CellularGatewayConnectivityMonitoringDestinations struct {
	pulumi.CustomResourceState

	// The list of connectivity monitoring destinations
	Destinations CellularGatewayConnectivityMonitoringDestinationsDestinationArrayOutput `pulumi:"destinations"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
}

// NewCellularGatewayConnectivityMonitoringDestinations registers a new resource with the given unique name, arguments, and options.
func NewCellularGatewayConnectivityMonitoringDestinations(ctx *pulumi.Context,
	name string, args *CellularGatewayConnectivityMonitoringDestinationsArgs, opts ...pulumi.ResourceOption) (*CellularGatewayConnectivityMonitoringDestinations, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CellularGatewayConnectivityMonitoringDestinations
	err := ctx.RegisterResource("meraki:networks/cellularGatewayConnectivityMonitoringDestinations:CellularGatewayConnectivityMonitoringDestinations", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCellularGatewayConnectivityMonitoringDestinations gets an existing CellularGatewayConnectivityMonitoringDestinations resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCellularGatewayConnectivityMonitoringDestinations(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CellularGatewayConnectivityMonitoringDestinationsState, opts ...pulumi.ResourceOption) (*CellularGatewayConnectivityMonitoringDestinations, error) {
	var resource CellularGatewayConnectivityMonitoringDestinations
	err := ctx.ReadResource("meraki:networks/cellularGatewayConnectivityMonitoringDestinations:CellularGatewayConnectivityMonitoringDestinations", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CellularGatewayConnectivityMonitoringDestinations resources.
type cellularGatewayConnectivityMonitoringDestinationsState struct {
	// The list of connectivity monitoring destinations
	Destinations []CellularGatewayConnectivityMonitoringDestinationsDestination `pulumi:"destinations"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

type CellularGatewayConnectivityMonitoringDestinationsState struct {
	// The list of connectivity monitoring destinations
	Destinations CellularGatewayConnectivityMonitoringDestinationsDestinationArrayInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
}

func (CellularGatewayConnectivityMonitoringDestinationsState) ElementType() reflect.Type {
	return reflect.TypeOf((*cellularGatewayConnectivityMonitoringDestinationsState)(nil)).Elem()
}

type cellularGatewayConnectivityMonitoringDestinationsArgs struct {
	// The list of connectivity monitoring destinations
	Destinations []CellularGatewayConnectivityMonitoringDestinationsDestination `pulumi:"destinations"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// The set of arguments for constructing a CellularGatewayConnectivityMonitoringDestinations resource.
type CellularGatewayConnectivityMonitoringDestinationsArgs struct {
	// The list of connectivity monitoring destinations
	Destinations CellularGatewayConnectivityMonitoringDestinationsDestinationArrayInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
}

func (CellularGatewayConnectivityMonitoringDestinationsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cellularGatewayConnectivityMonitoringDestinationsArgs)(nil)).Elem()
}

type CellularGatewayConnectivityMonitoringDestinationsInput interface {
	pulumi.Input

	ToCellularGatewayConnectivityMonitoringDestinationsOutput() CellularGatewayConnectivityMonitoringDestinationsOutput
	ToCellularGatewayConnectivityMonitoringDestinationsOutputWithContext(ctx context.Context) CellularGatewayConnectivityMonitoringDestinationsOutput
}

func (*CellularGatewayConnectivityMonitoringDestinations) ElementType() reflect.Type {
	return reflect.TypeOf((**CellularGatewayConnectivityMonitoringDestinations)(nil)).Elem()
}

func (i *CellularGatewayConnectivityMonitoringDestinations) ToCellularGatewayConnectivityMonitoringDestinationsOutput() CellularGatewayConnectivityMonitoringDestinationsOutput {
	return i.ToCellularGatewayConnectivityMonitoringDestinationsOutputWithContext(context.Background())
}

func (i *CellularGatewayConnectivityMonitoringDestinations) ToCellularGatewayConnectivityMonitoringDestinationsOutputWithContext(ctx context.Context) CellularGatewayConnectivityMonitoringDestinationsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularGatewayConnectivityMonitoringDestinationsOutput)
}

// CellularGatewayConnectivityMonitoringDestinationsArrayInput is an input type that accepts CellularGatewayConnectivityMonitoringDestinationsArray and CellularGatewayConnectivityMonitoringDestinationsArrayOutput values.
// You can construct a concrete instance of `CellularGatewayConnectivityMonitoringDestinationsArrayInput` via:
//
//	CellularGatewayConnectivityMonitoringDestinationsArray{ CellularGatewayConnectivityMonitoringDestinationsArgs{...} }
type CellularGatewayConnectivityMonitoringDestinationsArrayInput interface {
	pulumi.Input

	ToCellularGatewayConnectivityMonitoringDestinationsArrayOutput() CellularGatewayConnectivityMonitoringDestinationsArrayOutput
	ToCellularGatewayConnectivityMonitoringDestinationsArrayOutputWithContext(context.Context) CellularGatewayConnectivityMonitoringDestinationsArrayOutput
}

type CellularGatewayConnectivityMonitoringDestinationsArray []CellularGatewayConnectivityMonitoringDestinationsInput

func (CellularGatewayConnectivityMonitoringDestinationsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CellularGatewayConnectivityMonitoringDestinations)(nil)).Elem()
}

func (i CellularGatewayConnectivityMonitoringDestinationsArray) ToCellularGatewayConnectivityMonitoringDestinationsArrayOutput() CellularGatewayConnectivityMonitoringDestinationsArrayOutput {
	return i.ToCellularGatewayConnectivityMonitoringDestinationsArrayOutputWithContext(context.Background())
}

func (i CellularGatewayConnectivityMonitoringDestinationsArray) ToCellularGatewayConnectivityMonitoringDestinationsArrayOutputWithContext(ctx context.Context) CellularGatewayConnectivityMonitoringDestinationsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularGatewayConnectivityMonitoringDestinationsArrayOutput)
}

// CellularGatewayConnectivityMonitoringDestinationsMapInput is an input type that accepts CellularGatewayConnectivityMonitoringDestinationsMap and CellularGatewayConnectivityMonitoringDestinationsMapOutput values.
// You can construct a concrete instance of `CellularGatewayConnectivityMonitoringDestinationsMapInput` via:
//
//	CellularGatewayConnectivityMonitoringDestinationsMap{ "key": CellularGatewayConnectivityMonitoringDestinationsArgs{...} }
type CellularGatewayConnectivityMonitoringDestinationsMapInput interface {
	pulumi.Input

	ToCellularGatewayConnectivityMonitoringDestinationsMapOutput() CellularGatewayConnectivityMonitoringDestinationsMapOutput
	ToCellularGatewayConnectivityMonitoringDestinationsMapOutputWithContext(context.Context) CellularGatewayConnectivityMonitoringDestinationsMapOutput
}

type CellularGatewayConnectivityMonitoringDestinationsMap map[string]CellularGatewayConnectivityMonitoringDestinationsInput

func (CellularGatewayConnectivityMonitoringDestinationsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CellularGatewayConnectivityMonitoringDestinations)(nil)).Elem()
}

func (i CellularGatewayConnectivityMonitoringDestinationsMap) ToCellularGatewayConnectivityMonitoringDestinationsMapOutput() CellularGatewayConnectivityMonitoringDestinationsMapOutput {
	return i.ToCellularGatewayConnectivityMonitoringDestinationsMapOutputWithContext(context.Background())
}

func (i CellularGatewayConnectivityMonitoringDestinationsMap) ToCellularGatewayConnectivityMonitoringDestinationsMapOutputWithContext(ctx context.Context) CellularGatewayConnectivityMonitoringDestinationsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CellularGatewayConnectivityMonitoringDestinationsMapOutput)
}

type CellularGatewayConnectivityMonitoringDestinationsOutput struct{ *pulumi.OutputState }

func (CellularGatewayConnectivityMonitoringDestinationsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CellularGatewayConnectivityMonitoringDestinations)(nil)).Elem()
}

func (o CellularGatewayConnectivityMonitoringDestinationsOutput) ToCellularGatewayConnectivityMonitoringDestinationsOutput() CellularGatewayConnectivityMonitoringDestinationsOutput {
	return o
}

func (o CellularGatewayConnectivityMonitoringDestinationsOutput) ToCellularGatewayConnectivityMonitoringDestinationsOutputWithContext(ctx context.Context) CellularGatewayConnectivityMonitoringDestinationsOutput {
	return o
}

// The list of connectivity monitoring destinations
func (o CellularGatewayConnectivityMonitoringDestinationsOutput) Destinations() CellularGatewayConnectivityMonitoringDestinationsDestinationArrayOutput {
	return o.ApplyT(func(v *CellularGatewayConnectivityMonitoringDestinations) CellularGatewayConnectivityMonitoringDestinationsDestinationArrayOutput {
		return v.Destinations
	}).(CellularGatewayConnectivityMonitoringDestinationsDestinationArrayOutput)
}

// networkId path parameter. Network ID
func (o CellularGatewayConnectivityMonitoringDestinationsOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *CellularGatewayConnectivityMonitoringDestinations) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

type CellularGatewayConnectivityMonitoringDestinationsArrayOutput struct{ *pulumi.OutputState }

func (CellularGatewayConnectivityMonitoringDestinationsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CellularGatewayConnectivityMonitoringDestinations)(nil)).Elem()
}

func (o CellularGatewayConnectivityMonitoringDestinationsArrayOutput) ToCellularGatewayConnectivityMonitoringDestinationsArrayOutput() CellularGatewayConnectivityMonitoringDestinationsArrayOutput {
	return o
}

func (o CellularGatewayConnectivityMonitoringDestinationsArrayOutput) ToCellularGatewayConnectivityMonitoringDestinationsArrayOutputWithContext(ctx context.Context) CellularGatewayConnectivityMonitoringDestinationsArrayOutput {
	return o
}

func (o CellularGatewayConnectivityMonitoringDestinationsArrayOutput) Index(i pulumi.IntInput) CellularGatewayConnectivityMonitoringDestinationsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CellularGatewayConnectivityMonitoringDestinations {
		return vs[0].([]*CellularGatewayConnectivityMonitoringDestinations)[vs[1].(int)]
	}).(CellularGatewayConnectivityMonitoringDestinationsOutput)
}

type CellularGatewayConnectivityMonitoringDestinationsMapOutput struct{ *pulumi.OutputState }

func (CellularGatewayConnectivityMonitoringDestinationsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CellularGatewayConnectivityMonitoringDestinations)(nil)).Elem()
}

func (o CellularGatewayConnectivityMonitoringDestinationsMapOutput) ToCellularGatewayConnectivityMonitoringDestinationsMapOutput() CellularGatewayConnectivityMonitoringDestinationsMapOutput {
	return o
}

func (o CellularGatewayConnectivityMonitoringDestinationsMapOutput) ToCellularGatewayConnectivityMonitoringDestinationsMapOutputWithContext(ctx context.Context) CellularGatewayConnectivityMonitoringDestinationsMapOutput {
	return o
}

func (o CellularGatewayConnectivityMonitoringDestinationsMapOutput) MapIndex(k pulumi.StringInput) CellularGatewayConnectivityMonitoringDestinationsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CellularGatewayConnectivityMonitoringDestinations {
		return vs[0].(map[string]*CellularGatewayConnectivityMonitoringDestinations)[vs[1].(string)]
	}).(CellularGatewayConnectivityMonitoringDestinationsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CellularGatewayConnectivityMonitoringDestinationsInput)(nil)).Elem(), &CellularGatewayConnectivityMonitoringDestinations{})
	pulumi.RegisterInputType(reflect.TypeOf((*CellularGatewayConnectivityMonitoringDestinationsArrayInput)(nil)).Elem(), CellularGatewayConnectivityMonitoringDestinationsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CellularGatewayConnectivityMonitoringDestinationsMapInput)(nil)).Elem(), CellularGatewayConnectivityMonitoringDestinationsMap{})
	pulumi.RegisterOutputType(CellularGatewayConnectivityMonitoringDestinationsOutput{})
	pulumi.RegisterOutputType(CellularGatewayConnectivityMonitoringDestinationsArrayOutput{})
	pulumi.RegisterOutputType(CellularGatewayConnectivityMonitoringDestinationsMapOutput{})
}
