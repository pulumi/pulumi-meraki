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
//			example, err := networks.NewTrafficAnalysis(ctx, "example", &networks.TrafficAnalysisArgs{
//				CustomPieChartItems: networks.TrafficAnalysisCustomPieChartItemArray{
//					&networks.TrafficAnalysisCustomPieChartItemArgs{
//						Name:  pulumi.String("Item from hostname"),
//						Type:  pulumi.String("host"),
//						Value: pulumi.String("example.com"),
//					},
//				},
//				Mode:      pulumi.String("disabled"),
//				NetworkId: pulumi.String("string"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksTrafficAnalysisExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/trafficAnalysis:TrafficAnalysis example "network_id"
// ```
type TrafficAnalysis struct {
	pulumi.CustomResourceState

	// The list of items that make up the custom pie chart for traffic reporting.
	CustomPieChartItems TrafficAnalysisCustomPieChartItemArrayOutput `pulumi:"customPieChartItems"`
	// The traffic analysis mode for the network. Can be one of 'disabled' (do not collect traffic types),
	// 'basic' (collect generic traffic categories), or 'detailed' (collect destination hostnames).
	Mode pulumi.StringOutput `pulumi:"mode"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
}

// NewTrafficAnalysis registers a new resource with the given unique name, arguments, and options.
func NewTrafficAnalysis(ctx *pulumi.Context,
	name string, args *TrafficAnalysisArgs, opts ...pulumi.ResourceOption) (*TrafficAnalysis, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TrafficAnalysis
	err := ctx.RegisterResource("meraki:networks/trafficAnalysis:TrafficAnalysis", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTrafficAnalysis gets an existing TrafficAnalysis resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTrafficAnalysis(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TrafficAnalysisState, opts ...pulumi.ResourceOption) (*TrafficAnalysis, error) {
	var resource TrafficAnalysis
	err := ctx.ReadResource("meraki:networks/trafficAnalysis:TrafficAnalysis", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TrafficAnalysis resources.
type trafficAnalysisState struct {
	// The list of items that make up the custom pie chart for traffic reporting.
	CustomPieChartItems []TrafficAnalysisCustomPieChartItem `pulumi:"customPieChartItems"`
	// The traffic analysis mode for the network. Can be one of 'disabled' (do not collect traffic types),
	// 'basic' (collect generic traffic categories), or 'detailed' (collect destination hostnames).
	Mode *string `pulumi:"mode"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

type TrafficAnalysisState struct {
	// The list of items that make up the custom pie chart for traffic reporting.
	CustomPieChartItems TrafficAnalysisCustomPieChartItemArrayInput
	// The traffic analysis mode for the network. Can be one of 'disabled' (do not collect traffic types),
	// 'basic' (collect generic traffic categories), or 'detailed' (collect destination hostnames).
	Mode pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
}

func (TrafficAnalysisState) ElementType() reflect.Type {
	return reflect.TypeOf((*trafficAnalysisState)(nil)).Elem()
}

type trafficAnalysisArgs struct {
	// The list of items that make up the custom pie chart for traffic reporting.
	CustomPieChartItems []TrafficAnalysisCustomPieChartItem `pulumi:"customPieChartItems"`
	// The traffic analysis mode for the network. Can be one of 'disabled' (do not collect traffic types),
	// 'basic' (collect generic traffic categories), or 'detailed' (collect destination hostnames).
	Mode *string `pulumi:"mode"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// The set of arguments for constructing a TrafficAnalysis resource.
type TrafficAnalysisArgs struct {
	// The list of items that make up the custom pie chart for traffic reporting.
	CustomPieChartItems TrafficAnalysisCustomPieChartItemArrayInput
	// The traffic analysis mode for the network. Can be one of 'disabled' (do not collect traffic types),
	// 'basic' (collect generic traffic categories), or 'detailed' (collect destination hostnames).
	Mode pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
}

func (TrafficAnalysisArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*trafficAnalysisArgs)(nil)).Elem()
}

type TrafficAnalysisInput interface {
	pulumi.Input

	ToTrafficAnalysisOutput() TrafficAnalysisOutput
	ToTrafficAnalysisOutputWithContext(ctx context.Context) TrafficAnalysisOutput
}

func (*TrafficAnalysis) ElementType() reflect.Type {
	return reflect.TypeOf((**TrafficAnalysis)(nil)).Elem()
}

func (i *TrafficAnalysis) ToTrafficAnalysisOutput() TrafficAnalysisOutput {
	return i.ToTrafficAnalysisOutputWithContext(context.Background())
}

func (i *TrafficAnalysis) ToTrafficAnalysisOutputWithContext(ctx context.Context) TrafficAnalysisOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficAnalysisOutput)
}

// TrafficAnalysisArrayInput is an input type that accepts TrafficAnalysisArray and TrafficAnalysisArrayOutput values.
// You can construct a concrete instance of `TrafficAnalysisArrayInput` via:
//
//	TrafficAnalysisArray{ TrafficAnalysisArgs{...} }
type TrafficAnalysisArrayInput interface {
	pulumi.Input

	ToTrafficAnalysisArrayOutput() TrafficAnalysisArrayOutput
	ToTrafficAnalysisArrayOutputWithContext(context.Context) TrafficAnalysisArrayOutput
}

type TrafficAnalysisArray []TrafficAnalysisInput

func (TrafficAnalysisArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrafficAnalysis)(nil)).Elem()
}

func (i TrafficAnalysisArray) ToTrafficAnalysisArrayOutput() TrafficAnalysisArrayOutput {
	return i.ToTrafficAnalysisArrayOutputWithContext(context.Background())
}

func (i TrafficAnalysisArray) ToTrafficAnalysisArrayOutputWithContext(ctx context.Context) TrafficAnalysisArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficAnalysisArrayOutput)
}

// TrafficAnalysisMapInput is an input type that accepts TrafficAnalysisMap and TrafficAnalysisMapOutput values.
// You can construct a concrete instance of `TrafficAnalysisMapInput` via:
//
//	TrafficAnalysisMap{ "key": TrafficAnalysisArgs{...} }
type TrafficAnalysisMapInput interface {
	pulumi.Input

	ToTrafficAnalysisMapOutput() TrafficAnalysisMapOutput
	ToTrafficAnalysisMapOutputWithContext(context.Context) TrafficAnalysisMapOutput
}

type TrafficAnalysisMap map[string]TrafficAnalysisInput

func (TrafficAnalysisMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrafficAnalysis)(nil)).Elem()
}

func (i TrafficAnalysisMap) ToTrafficAnalysisMapOutput() TrafficAnalysisMapOutput {
	return i.ToTrafficAnalysisMapOutputWithContext(context.Background())
}

func (i TrafficAnalysisMap) ToTrafficAnalysisMapOutputWithContext(ctx context.Context) TrafficAnalysisMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficAnalysisMapOutput)
}

type TrafficAnalysisOutput struct{ *pulumi.OutputState }

func (TrafficAnalysisOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TrafficAnalysis)(nil)).Elem()
}

func (o TrafficAnalysisOutput) ToTrafficAnalysisOutput() TrafficAnalysisOutput {
	return o
}

func (o TrafficAnalysisOutput) ToTrafficAnalysisOutputWithContext(ctx context.Context) TrafficAnalysisOutput {
	return o
}

// The list of items that make up the custom pie chart for traffic reporting.
func (o TrafficAnalysisOutput) CustomPieChartItems() TrafficAnalysisCustomPieChartItemArrayOutput {
	return o.ApplyT(func(v *TrafficAnalysis) TrafficAnalysisCustomPieChartItemArrayOutput { return v.CustomPieChartItems }).(TrafficAnalysisCustomPieChartItemArrayOutput)
}

// The traffic analysis mode for the network. Can be one of 'disabled' (do not collect traffic types),
// 'basic' (collect generic traffic categories), or 'detailed' (collect destination hostnames).
func (o TrafficAnalysisOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficAnalysis) pulumi.StringOutput { return v.Mode }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o TrafficAnalysisOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficAnalysis) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

type TrafficAnalysisArrayOutput struct{ *pulumi.OutputState }

func (TrafficAnalysisArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrafficAnalysis)(nil)).Elem()
}

func (o TrafficAnalysisArrayOutput) ToTrafficAnalysisArrayOutput() TrafficAnalysisArrayOutput {
	return o
}

func (o TrafficAnalysisArrayOutput) ToTrafficAnalysisArrayOutputWithContext(ctx context.Context) TrafficAnalysisArrayOutput {
	return o
}

func (o TrafficAnalysisArrayOutput) Index(i pulumi.IntInput) TrafficAnalysisOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TrafficAnalysis {
		return vs[0].([]*TrafficAnalysis)[vs[1].(int)]
	}).(TrafficAnalysisOutput)
}

type TrafficAnalysisMapOutput struct{ *pulumi.OutputState }

func (TrafficAnalysisMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrafficAnalysis)(nil)).Elem()
}

func (o TrafficAnalysisMapOutput) ToTrafficAnalysisMapOutput() TrafficAnalysisMapOutput {
	return o
}

func (o TrafficAnalysisMapOutput) ToTrafficAnalysisMapOutputWithContext(ctx context.Context) TrafficAnalysisMapOutput {
	return o
}

func (o TrafficAnalysisMapOutput) MapIndex(k pulumi.StringInput) TrafficAnalysisOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TrafficAnalysis {
		return vs[0].(map[string]*TrafficAnalysis)[vs[1].(string)]
	}).(TrafficAnalysisOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficAnalysisInput)(nil)).Elem(), &TrafficAnalysis{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficAnalysisArrayInput)(nil)).Elem(), TrafficAnalysisArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficAnalysisMapInput)(nil)).Elem(), TrafficAnalysisMap{})
	pulumi.RegisterOutputType(TrafficAnalysisOutput{})
	pulumi.RegisterOutputType(TrafficAnalysisArrayOutput{})
	pulumi.RegisterOutputType(TrafficAnalysisMapOutput{})
}
