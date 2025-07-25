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
// $ pulumi import meraki:networks/applianceTrafficShapingRules:ApplianceTrafficShapingRules example "network_id"
// ```
type ApplianceTrafficShapingRules struct {
	pulumi.CustomResourceState

	// Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
	DefaultRulesEnabled pulumi.BoolOutput `pulumi:"defaultRulesEnabled"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// An array of traffic shaping rules. Rules are applied in the order that
	// they are specified in. An empty list (or null) means no rules. Note that
	// you are allowed a maximum of 8 rules.
	Rules ApplianceTrafficShapingRulesRuleArrayOutput `pulumi:"rules"`
}

// NewApplianceTrafficShapingRules registers a new resource with the given unique name, arguments, and options.
func NewApplianceTrafficShapingRules(ctx *pulumi.Context,
	name string, args *ApplianceTrafficShapingRulesArgs, opts ...pulumi.ResourceOption) (*ApplianceTrafficShapingRules, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplianceTrafficShapingRules
	err := ctx.RegisterResource("meraki:networks/applianceTrafficShapingRules:ApplianceTrafficShapingRules", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplianceTrafficShapingRules gets an existing ApplianceTrafficShapingRules resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplianceTrafficShapingRules(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplianceTrafficShapingRulesState, opts ...pulumi.ResourceOption) (*ApplianceTrafficShapingRules, error) {
	var resource ApplianceTrafficShapingRules
	err := ctx.ReadResource("meraki:networks/applianceTrafficShapingRules:ApplianceTrafficShapingRules", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplianceTrafficShapingRules resources.
type applianceTrafficShapingRulesState struct {
	// Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
	DefaultRulesEnabled *bool `pulumi:"defaultRulesEnabled"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// An array of traffic shaping rules. Rules are applied in the order that
	// they are specified in. An empty list (or null) means no rules. Note that
	// you are allowed a maximum of 8 rules.
	Rules []ApplianceTrafficShapingRulesRule `pulumi:"rules"`
}

type ApplianceTrafficShapingRulesState struct {
	// Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
	DefaultRulesEnabled pulumi.BoolPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// An array of traffic shaping rules. Rules are applied in the order that
	// they are specified in. An empty list (or null) means no rules. Note that
	// you are allowed a maximum of 8 rules.
	Rules ApplianceTrafficShapingRulesRuleArrayInput
}

func (ApplianceTrafficShapingRulesState) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceTrafficShapingRulesState)(nil)).Elem()
}

type applianceTrafficShapingRulesArgs struct {
	// Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
	DefaultRulesEnabled *bool `pulumi:"defaultRulesEnabled"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// An array of traffic shaping rules. Rules are applied in the order that
	// they are specified in. An empty list (or null) means no rules. Note that
	// you are allowed a maximum of 8 rules.
	Rules []ApplianceTrafficShapingRulesRule `pulumi:"rules"`
}

// The set of arguments for constructing a ApplianceTrafficShapingRules resource.
type ApplianceTrafficShapingRulesArgs struct {
	// Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
	DefaultRulesEnabled pulumi.BoolPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// An array of traffic shaping rules. Rules are applied in the order that
	// they are specified in. An empty list (or null) means no rules. Note that
	// you are allowed a maximum of 8 rules.
	Rules ApplianceTrafficShapingRulesRuleArrayInput
}

func (ApplianceTrafficShapingRulesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceTrafficShapingRulesArgs)(nil)).Elem()
}

type ApplianceTrafficShapingRulesInput interface {
	pulumi.Input

	ToApplianceTrafficShapingRulesOutput() ApplianceTrafficShapingRulesOutput
	ToApplianceTrafficShapingRulesOutputWithContext(ctx context.Context) ApplianceTrafficShapingRulesOutput
}

func (*ApplianceTrafficShapingRules) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceTrafficShapingRules)(nil)).Elem()
}

func (i *ApplianceTrafficShapingRules) ToApplianceTrafficShapingRulesOutput() ApplianceTrafficShapingRulesOutput {
	return i.ToApplianceTrafficShapingRulesOutputWithContext(context.Background())
}

func (i *ApplianceTrafficShapingRules) ToApplianceTrafficShapingRulesOutputWithContext(ctx context.Context) ApplianceTrafficShapingRulesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceTrafficShapingRulesOutput)
}

// ApplianceTrafficShapingRulesArrayInput is an input type that accepts ApplianceTrafficShapingRulesArray and ApplianceTrafficShapingRulesArrayOutput values.
// You can construct a concrete instance of `ApplianceTrafficShapingRulesArrayInput` via:
//
//	ApplianceTrafficShapingRulesArray{ ApplianceTrafficShapingRulesArgs{...} }
type ApplianceTrafficShapingRulesArrayInput interface {
	pulumi.Input

	ToApplianceTrafficShapingRulesArrayOutput() ApplianceTrafficShapingRulesArrayOutput
	ToApplianceTrafficShapingRulesArrayOutputWithContext(context.Context) ApplianceTrafficShapingRulesArrayOutput
}

type ApplianceTrafficShapingRulesArray []ApplianceTrafficShapingRulesInput

func (ApplianceTrafficShapingRulesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceTrafficShapingRules)(nil)).Elem()
}

func (i ApplianceTrafficShapingRulesArray) ToApplianceTrafficShapingRulesArrayOutput() ApplianceTrafficShapingRulesArrayOutput {
	return i.ToApplianceTrafficShapingRulesArrayOutputWithContext(context.Background())
}

func (i ApplianceTrafficShapingRulesArray) ToApplianceTrafficShapingRulesArrayOutputWithContext(ctx context.Context) ApplianceTrafficShapingRulesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceTrafficShapingRulesArrayOutput)
}

// ApplianceTrafficShapingRulesMapInput is an input type that accepts ApplianceTrafficShapingRulesMap and ApplianceTrafficShapingRulesMapOutput values.
// You can construct a concrete instance of `ApplianceTrafficShapingRulesMapInput` via:
//
//	ApplianceTrafficShapingRulesMap{ "key": ApplianceTrafficShapingRulesArgs{...} }
type ApplianceTrafficShapingRulesMapInput interface {
	pulumi.Input

	ToApplianceTrafficShapingRulesMapOutput() ApplianceTrafficShapingRulesMapOutput
	ToApplianceTrafficShapingRulesMapOutputWithContext(context.Context) ApplianceTrafficShapingRulesMapOutput
}

type ApplianceTrafficShapingRulesMap map[string]ApplianceTrafficShapingRulesInput

func (ApplianceTrafficShapingRulesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceTrafficShapingRules)(nil)).Elem()
}

func (i ApplianceTrafficShapingRulesMap) ToApplianceTrafficShapingRulesMapOutput() ApplianceTrafficShapingRulesMapOutput {
	return i.ToApplianceTrafficShapingRulesMapOutputWithContext(context.Background())
}

func (i ApplianceTrafficShapingRulesMap) ToApplianceTrafficShapingRulesMapOutputWithContext(ctx context.Context) ApplianceTrafficShapingRulesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceTrafficShapingRulesMapOutput)
}

type ApplianceTrafficShapingRulesOutput struct{ *pulumi.OutputState }

func (ApplianceTrafficShapingRulesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceTrafficShapingRules)(nil)).Elem()
}

func (o ApplianceTrafficShapingRulesOutput) ToApplianceTrafficShapingRulesOutput() ApplianceTrafficShapingRulesOutput {
	return o
}

func (o ApplianceTrafficShapingRulesOutput) ToApplianceTrafficShapingRulesOutputWithContext(ctx context.Context) ApplianceTrafficShapingRulesOutput {
	return o
}

// Whether default traffic shaping rules are enabled (true) or disabled (false). There are 4 default rules, which can be seen on your network's traffic shaping page. Note that default rules count against the rule limit of 8.
func (o ApplianceTrafficShapingRulesOutput) DefaultRulesEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *ApplianceTrafficShapingRules) pulumi.BoolOutput { return v.DefaultRulesEnabled }).(pulumi.BoolOutput)
}

// networkId path parameter. Network ID
func (o ApplianceTrafficShapingRulesOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceTrafficShapingRules) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// An array of traffic shaping rules. Rules are applied in the order that
// they are specified in. An empty list (or null) means no rules. Note that
// you are allowed a maximum of 8 rules.
func (o ApplianceTrafficShapingRulesOutput) Rules() ApplianceTrafficShapingRulesRuleArrayOutput {
	return o.ApplyT(func(v *ApplianceTrafficShapingRules) ApplianceTrafficShapingRulesRuleArrayOutput { return v.Rules }).(ApplianceTrafficShapingRulesRuleArrayOutput)
}

type ApplianceTrafficShapingRulesArrayOutput struct{ *pulumi.OutputState }

func (ApplianceTrafficShapingRulesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceTrafficShapingRules)(nil)).Elem()
}

func (o ApplianceTrafficShapingRulesArrayOutput) ToApplianceTrafficShapingRulesArrayOutput() ApplianceTrafficShapingRulesArrayOutput {
	return o
}

func (o ApplianceTrafficShapingRulesArrayOutput) ToApplianceTrafficShapingRulesArrayOutputWithContext(ctx context.Context) ApplianceTrafficShapingRulesArrayOutput {
	return o
}

func (o ApplianceTrafficShapingRulesArrayOutput) Index(i pulumi.IntInput) ApplianceTrafficShapingRulesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplianceTrafficShapingRules {
		return vs[0].([]*ApplianceTrafficShapingRules)[vs[1].(int)]
	}).(ApplianceTrafficShapingRulesOutput)
}

type ApplianceTrafficShapingRulesMapOutput struct{ *pulumi.OutputState }

func (ApplianceTrafficShapingRulesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceTrafficShapingRules)(nil)).Elem()
}

func (o ApplianceTrafficShapingRulesMapOutput) ToApplianceTrafficShapingRulesMapOutput() ApplianceTrafficShapingRulesMapOutput {
	return o
}

func (o ApplianceTrafficShapingRulesMapOutput) ToApplianceTrafficShapingRulesMapOutputWithContext(ctx context.Context) ApplianceTrafficShapingRulesMapOutput {
	return o
}

func (o ApplianceTrafficShapingRulesMapOutput) MapIndex(k pulumi.StringInput) ApplianceTrafficShapingRulesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplianceTrafficShapingRules {
		return vs[0].(map[string]*ApplianceTrafficShapingRules)[vs[1].(string)]
	}).(ApplianceTrafficShapingRulesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceTrafficShapingRulesInput)(nil)).Elem(), &ApplianceTrafficShapingRules{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceTrafficShapingRulesArrayInput)(nil)).Elem(), ApplianceTrafficShapingRulesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceTrafficShapingRulesMapInput)(nil)).Elem(), ApplianceTrafficShapingRulesMap{})
	pulumi.RegisterOutputType(ApplianceTrafficShapingRulesOutput{})
	pulumi.RegisterOutputType(ApplianceTrafficShapingRulesArrayOutput{})
	pulumi.RegisterOutputType(ApplianceTrafficShapingRulesMapOutput{})
}
