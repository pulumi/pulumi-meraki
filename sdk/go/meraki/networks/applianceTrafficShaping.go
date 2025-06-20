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
// $ pulumi import meraki:networks/applianceTrafficShaping:ApplianceTrafficShaping example "network_id"
// ```
type ApplianceTrafficShaping struct {
	pulumi.CustomResourceState

	// Global per-client bandwidth limit
	GlobalBandwidthLimits ApplianceTrafficShapingGlobalBandwidthLimitsOutput `pulumi:"globalBandwidthLimits"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
}

// NewApplianceTrafficShaping registers a new resource with the given unique name, arguments, and options.
func NewApplianceTrafficShaping(ctx *pulumi.Context,
	name string, args *ApplianceTrafficShapingArgs, opts ...pulumi.ResourceOption) (*ApplianceTrafficShaping, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplianceTrafficShaping
	err := ctx.RegisterResource("meraki:networks/applianceTrafficShaping:ApplianceTrafficShaping", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplianceTrafficShaping gets an existing ApplianceTrafficShaping resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplianceTrafficShaping(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplianceTrafficShapingState, opts ...pulumi.ResourceOption) (*ApplianceTrafficShaping, error) {
	var resource ApplianceTrafficShaping
	err := ctx.ReadResource("meraki:networks/applianceTrafficShaping:ApplianceTrafficShaping", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplianceTrafficShaping resources.
type applianceTrafficShapingState struct {
	// Global per-client bandwidth limit
	GlobalBandwidthLimits *ApplianceTrafficShapingGlobalBandwidthLimits `pulumi:"globalBandwidthLimits"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
}

type ApplianceTrafficShapingState struct {
	// Global per-client bandwidth limit
	GlobalBandwidthLimits ApplianceTrafficShapingGlobalBandwidthLimitsPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
}

func (ApplianceTrafficShapingState) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceTrafficShapingState)(nil)).Elem()
}

type applianceTrafficShapingArgs struct {
	// Global per-client bandwidth limit
	GlobalBandwidthLimits *ApplianceTrafficShapingGlobalBandwidthLimits `pulumi:"globalBandwidthLimits"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
}

// The set of arguments for constructing a ApplianceTrafficShaping resource.
type ApplianceTrafficShapingArgs struct {
	// Global per-client bandwidth limit
	GlobalBandwidthLimits ApplianceTrafficShapingGlobalBandwidthLimitsPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
}

func (ApplianceTrafficShapingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceTrafficShapingArgs)(nil)).Elem()
}

type ApplianceTrafficShapingInput interface {
	pulumi.Input

	ToApplianceTrafficShapingOutput() ApplianceTrafficShapingOutput
	ToApplianceTrafficShapingOutputWithContext(ctx context.Context) ApplianceTrafficShapingOutput
}

func (*ApplianceTrafficShaping) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceTrafficShaping)(nil)).Elem()
}

func (i *ApplianceTrafficShaping) ToApplianceTrafficShapingOutput() ApplianceTrafficShapingOutput {
	return i.ToApplianceTrafficShapingOutputWithContext(context.Background())
}

func (i *ApplianceTrafficShaping) ToApplianceTrafficShapingOutputWithContext(ctx context.Context) ApplianceTrafficShapingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceTrafficShapingOutput)
}

// ApplianceTrafficShapingArrayInput is an input type that accepts ApplianceTrafficShapingArray and ApplianceTrafficShapingArrayOutput values.
// You can construct a concrete instance of `ApplianceTrafficShapingArrayInput` via:
//
//	ApplianceTrafficShapingArray{ ApplianceTrafficShapingArgs{...} }
type ApplianceTrafficShapingArrayInput interface {
	pulumi.Input

	ToApplianceTrafficShapingArrayOutput() ApplianceTrafficShapingArrayOutput
	ToApplianceTrafficShapingArrayOutputWithContext(context.Context) ApplianceTrafficShapingArrayOutput
}

type ApplianceTrafficShapingArray []ApplianceTrafficShapingInput

func (ApplianceTrafficShapingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceTrafficShaping)(nil)).Elem()
}

func (i ApplianceTrafficShapingArray) ToApplianceTrafficShapingArrayOutput() ApplianceTrafficShapingArrayOutput {
	return i.ToApplianceTrafficShapingArrayOutputWithContext(context.Background())
}

func (i ApplianceTrafficShapingArray) ToApplianceTrafficShapingArrayOutputWithContext(ctx context.Context) ApplianceTrafficShapingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceTrafficShapingArrayOutput)
}

// ApplianceTrafficShapingMapInput is an input type that accepts ApplianceTrafficShapingMap and ApplianceTrafficShapingMapOutput values.
// You can construct a concrete instance of `ApplianceTrafficShapingMapInput` via:
//
//	ApplianceTrafficShapingMap{ "key": ApplianceTrafficShapingArgs{...} }
type ApplianceTrafficShapingMapInput interface {
	pulumi.Input

	ToApplianceTrafficShapingMapOutput() ApplianceTrafficShapingMapOutput
	ToApplianceTrafficShapingMapOutputWithContext(context.Context) ApplianceTrafficShapingMapOutput
}

type ApplianceTrafficShapingMap map[string]ApplianceTrafficShapingInput

func (ApplianceTrafficShapingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceTrafficShaping)(nil)).Elem()
}

func (i ApplianceTrafficShapingMap) ToApplianceTrafficShapingMapOutput() ApplianceTrafficShapingMapOutput {
	return i.ToApplianceTrafficShapingMapOutputWithContext(context.Background())
}

func (i ApplianceTrafficShapingMap) ToApplianceTrafficShapingMapOutputWithContext(ctx context.Context) ApplianceTrafficShapingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceTrafficShapingMapOutput)
}

type ApplianceTrafficShapingOutput struct{ *pulumi.OutputState }

func (ApplianceTrafficShapingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceTrafficShaping)(nil)).Elem()
}

func (o ApplianceTrafficShapingOutput) ToApplianceTrafficShapingOutput() ApplianceTrafficShapingOutput {
	return o
}

func (o ApplianceTrafficShapingOutput) ToApplianceTrafficShapingOutputWithContext(ctx context.Context) ApplianceTrafficShapingOutput {
	return o
}

// Global per-client bandwidth limit
func (o ApplianceTrafficShapingOutput) GlobalBandwidthLimits() ApplianceTrafficShapingGlobalBandwidthLimitsOutput {
	return o.ApplyT(func(v *ApplianceTrafficShaping) ApplianceTrafficShapingGlobalBandwidthLimitsOutput {
		return v.GlobalBandwidthLimits
	}).(ApplianceTrafficShapingGlobalBandwidthLimitsOutput)
}

// networkId path parameter. Network ID
func (o ApplianceTrafficShapingOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceTrafficShaping) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

type ApplianceTrafficShapingArrayOutput struct{ *pulumi.OutputState }

func (ApplianceTrafficShapingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceTrafficShaping)(nil)).Elem()
}

func (o ApplianceTrafficShapingArrayOutput) ToApplianceTrafficShapingArrayOutput() ApplianceTrafficShapingArrayOutput {
	return o
}

func (o ApplianceTrafficShapingArrayOutput) ToApplianceTrafficShapingArrayOutputWithContext(ctx context.Context) ApplianceTrafficShapingArrayOutput {
	return o
}

func (o ApplianceTrafficShapingArrayOutput) Index(i pulumi.IntInput) ApplianceTrafficShapingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplianceTrafficShaping {
		return vs[0].([]*ApplianceTrafficShaping)[vs[1].(int)]
	}).(ApplianceTrafficShapingOutput)
}

type ApplianceTrafficShapingMapOutput struct{ *pulumi.OutputState }

func (ApplianceTrafficShapingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceTrafficShaping)(nil)).Elem()
}

func (o ApplianceTrafficShapingMapOutput) ToApplianceTrafficShapingMapOutput() ApplianceTrafficShapingMapOutput {
	return o
}

func (o ApplianceTrafficShapingMapOutput) ToApplianceTrafficShapingMapOutputWithContext(ctx context.Context) ApplianceTrafficShapingMapOutput {
	return o
}

func (o ApplianceTrafficShapingMapOutput) MapIndex(k pulumi.StringInput) ApplianceTrafficShapingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplianceTrafficShaping {
		return vs[0].(map[string]*ApplianceTrafficShaping)[vs[1].(string)]
	}).(ApplianceTrafficShapingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceTrafficShapingInput)(nil)).Elem(), &ApplianceTrafficShaping{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceTrafficShapingArrayInput)(nil)).Elem(), ApplianceTrafficShapingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceTrafficShapingMapInput)(nil)).Elem(), ApplianceTrafficShapingMap{})
	pulumi.RegisterOutputType(ApplianceTrafficShapingOutput{})
	pulumi.RegisterOutputType(ApplianceTrafficShapingArrayOutput{})
	pulumi.RegisterOutputType(ApplianceTrafficShapingMapOutput{})
}
