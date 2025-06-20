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
// $ pulumi import meraki:networks/applianceFirewallOneToOneNatRules:ApplianceFirewallOneToOneNatRules example "network_id"
// ```
type ApplianceFirewallOneToOneNatRules struct {
	pulumi.CustomResourceState

	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// An array of 1:1 nat rules
	Rules ApplianceFirewallOneToOneNatRulesRuleArrayOutput `pulumi:"rules"`
}

// NewApplianceFirewallOneToOneNatRules registers a new resource with the given unique name, arguments, and options.
func NewApplianceFirewallOneToOneNatRules(ctx *pulumi.Context,
	name string, args *ApplianceFirewallOneToOneNatRulesArgs, opts ...pulumi.ResourceOption) (*ApplianceFirewallOneToOneNatRules, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplianceFirewallOneToOneNatRules
	err := ctx.RegisterResource("meraki:networks/applianceFirewallOneToOneNatRules:ApplianceFirewallOneToOneNatRules", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplianceFirewallOneToOneNatRules gets an existing ApplianceFirewallOneToOneNatRules resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplianceFirewallOneToOneNatRules(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplianceFirewallOneToOneNatRulesState, opts ...pulumi.ResourceOption) (*ApplianceFirewallOneToOneNatRules, error) {
	var resource ApplianceFirewallOneToOneNatRules
	err := ctx.ReadResource("meraki:networks/applianceFirewallOneToOneNatRules:ApplianceFirewallOneToOneNatRules", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplianceFirewallOneToOneNatRules resources.
type applianceFirewallOneToOneNatRulesState struct {
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// An array of 1:1 nat rules
	Rules []ApplianceFirewallOneToOneNatRulesRule `pulumi:"rules"`
}

type ApplianceFirewallOneToOneNatRulesState struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// An array of 1:1 nat rules
	Rules ApplianceFirewallOneToOneNatRulesRuleArrayInput
}

func (ApplianceFirewallOneToOneNatRulesState) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceFirewallOneToOneNatRulesState)(nil)).Elem()
}

type applianceFirewallOneToOneNatRulesArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// An array of 1:1 nat rules
	Rules []ApplianceFirewallOneToOneNatRulesRule `pulumi:"rules"`
}

// The set of arguments for constructing a ApplianceFirewallOneToOneNatRules resource.
type ApplianceFirewallOneToOneNatRulesArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// An array of 1:1 nat rules
	Rules ApplianceFirewallOneToOneNatRulesRuleArrayInput
}

func (ApplianceFirewallOneToOneNatRulesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceFirewallOneToOneNatRulesArgs)(nil)).Elem()
}

type ApplianceFirewallOneToOneNatRulesInput interface {
	pulumi.Input

	ToApplianceFirewallOneToOneNatRulesOutput() ApplianceFirewallOneToOneNatRulesOutput
	ToApplianceFirewallOneToOneNatRulesOutputWithContext(ctx context.Context) ApplianceFirewallOneToOneNatRulesOutput
}

func (*ApplianceFirewallOneToOneNatRules) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceFirewallOneToOneNatRules)(nil)).Elem()
}

func (i *ApplianceFirewallOneToOneNatRules) ToApplianceFirewallOneToOneNatRulesOutput() ApplianceFirewallOneToOneNatRulesOutput {
	return i.ToApplianceFirewallOneToOneNatRulesOutputWithContext(context.Background())
}

func (i *ApplianceFirewallOneToOneNatRules) ToApplianceFirewallOneToOneNatRulesOutputWithContext(ctx context.Context) ApplianceFirewallOneToOneNatRulesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceFirewallOneToOneNatRulesOutput)
}

// ApplianceFirewallOneToOneNatRulesArrayInput is an input type that accepts ApplianceFirewallOneToOneNatRulesArray and ApplianceFirewallOneToOneNatRulesArrayOutput values.
// You can construct a concrete instance of `ApplianceFirewallOneToOneNatRulesArrayInput` via:
//
//	ApplianceFirewallOneToOneNatRulesArray{ ApplianceFirewallOneToOneNatRulesArgs{...} }
type ApplianceFirewallOneToOneNatRulesArrayInput interface {
	pulumi.Input

	ToApplianceFirewallOneToOneNatRulesArrayOutput() ApplianceFirewallOneToOneNatRulesArrayOutput
	ToApplianceFirewallOneToOneNatRulesArrayOutputWithContext(context.Context) ApplianceFirewallOneToOneNatRulesArrayOutput
}

type ApplianceFirewallOneToOneNatRulesArray []ApplianceFirewallOneToOneNatRulesInput

func (ApplianceFirewallOneToOneNatRulesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceFirewallOneToOneNatRules)(nil)).Elem()
}

func (i ApplianceFirewallOneToOneNatRulesArray) ToApplianceFirewallOneToOneNatRulesArrayOutput() ApplianceFirewallOneToOneNatRulesArrayOutput {
	return i.ToApplianceFirewallOneToOneNatRulesArrayOutputWithContext(context.Background())
}

func (i ApplianceFirewallOneToOneNatRulesArray) ToApplianceFirewallOneToOneNatRulesArrayOutputWithContext(ctx context.Context) ApplianceFirewallOneToOneNatRulesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceFirewallOneToOneNatRulesArrayOutput)
}

// ApplianceFirewallOneToOneNatRulesMapInput is an input type that accepts ApplianceFirewallOneToOneNatRulesMap and ApplianceFirewallOneToOneNatRulesMapOutput values.
// You can construct a concrete instance of `ApplianceFirewallOneToOneNatRulesMapInput` via:
//
//	ApplianceFirewallOneToOneNatRulesMap{ "key": ApplianceFirewallOneToOneNatRulesArgs{...} }
type ApplianceFirewallOneToOneNatRulesMapInput interface {
	pulumi.Input

	ToApplianceFirewallOneToOneNatRulesMapOutput() ApplianceFirewallOneToOneNatRulesMapOutput
	ToApplianceFirewallOneToOneNatRulesMapOutputWithContext(context.Context) ApplianceFirewallOneToOneNatRulesMapOutput
}

type ApplianceFirewallOneToOneNatRulesMap map[string]ApplianceFirewallOneToOneNatRulesInput

func (ApplianceFirewallOneToOneNatRulesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceFirewallOneToOneNatRules)(nil)).Elem()
}

func (i ApplianceFirewallOneToOneNatRulesMap) ToApplianceFirewallOneToOneNatRulesMapOutput() ApplianceFirewallOneToOneNatRulesMapOutput {
	return i.ToApplianceFirewallOneToOneNatRulesMapOutputWithContext(context.Background())
}

func (i ApplianceFirewallOneToOneNatRulesMap) ToApplianceFirewallOneToOneNatRulesMapOutputWithContext(ctx context.Context) ApplianceFirewallOneToOneNatRulesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceFirewallOneToOneNatRulesMapOutput)
}

type ApplianceFirewallOneToOneNatRulesOutput struct{ *pulumi.OutputState }

func (ApplianceFirewallOneToOneNatRulesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceFirewallOneToOneNatRules)(nil)).Elem()
}

func (o ApplianceFirewallOneToOneNatRulesOutput) ToApplianceFirewallOneToOneNatRulesOutput() ApplianceFirewallOneToOneNatRulesOutput {
	return o
}

func (o ApplianceFirewallOneToOneNatRulesOutput) ToApplianceFirewallOneToOneNatRulesOutputWithContext(ctx context.Context) ApplianceFirewallOneToOneNatRulesOutput {
	return o
}

// networkId path parameter. Network ID
func (o ApplianceFirewallOneToOneNatRulesOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceFirewallOneToOneNatRules) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// An array of 1:1 nat rules
func (o ApplianceFirewallOneToOneNatRulesOutput) Rules() ApplianceFirewallOneToOneNatRulesRuleArrayOutput {
	return o.ApplyT(func(v *ApplianceFirewallOneToOneNatRules) ApplianceFirewallOneToOneNatRulesRuleArrayOutput {
		return v.Rules
	}).(ApplianceFirewallOneToOneNatRulesRuleArrayOutput)
}

type ApplianceFirewallOneToOneNatRulesArrayOutput struct{ *pulumi.OutputState }

func (ApplianceFirewallOneToOneNatRulesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceFirewallOneToOneNatRules)(nil)).Elem()
}

func (o ApplianceFirewallOneToOneNatRulesArrayOutput) ToApplianceFirewallOneToOneNatRulesArrayOutput() ApplianceFirewallOneToOneNatRulesArrayOutput {
	return o
}

func (o ApplianceFirewallOneToOneNatRulesArrayOutput) ToApplianceFirewallOneToOneNatRulesArrayOutputWithContext(ctx context.Context) ApplianceFirewallOneToOneNatRulesArrayOutput {
	return o
}

func (o ApplianceFirewallOneToOneNatRulesArrayOutput) Index(i pulumi.IntInput) ApplianceFirewallOneToOneNatRulesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplianceFirewallOneToOneNatRules {
		return vs[0].([]*ApplianceFirewallOneToOneNatRules)[vs[1].(int)]
	}).(ApplianceFirewallOneToOneNatRulesOutput)
}

type ApplianceFirewallOneToOneNatRulesMapOutput struct{ *pulumi.OutputState }

func (ApplianceFirewallOneToOneNatRulesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceFirewallOneToOneNatRules)(nil)).Elem()
}

func (o ApplianceFirewallOneToOneNatRulesMapOutput) ToApplianceFirewallOneToOneNatRulesMapOutput() ApplianceFirewallOneToOneNatRulesMapOutput {
	return o
}

func (o ApplianceFirewallOneToOneNatRulesMapOutput) ToApplianceFirewallOneToOneNatRulesMapOutputWithContext(ctx context.Context) ApplianceFirewallOneToOneNatRulesMapOutput {
	return o
}

func (o ApplianceFirewallOneToOneNatRulesMapOutput) MapIndex(k pulumi.StringInput) ApplianceFirewallOneToOneNatRulesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplianceFirewallOneToOneNatRules {
		return vs[0].(map[string]*ApplianceFirewallOneToOneNatRules)[vs[1].(string)]
	}).(ApplianceFirewallOneToOneNatRulesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceFirewallOneToOneNatRulesInput)(nil)).Elem(), &ApplianceFirewallOneToOneNatRules{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceFirewallOneToOneNatRulesArrayInput)(nil)).Elem(), ApplianceFirewallOneToOneNatRulesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceFirewallOneToOneNatRulesMapInput)(nil)).Elem(), ApplianceFirewallOneToOneNatRulesMap{})
	pulumi.RegisterOutputType(ApplianceFirewallOneToOneNatRulesOutput{})
	pulumi.RegisterOutputType(ApplianceFirewallOneToOneNatRulesArrayOutput{})
	pulumi.RegisterOutputType(ApplianceFirewallOneToOneNatRulesMapOutput{})
}
