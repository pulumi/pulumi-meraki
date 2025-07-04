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
// ### 1
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
//			example, err := networks.NewApplianceFirewallL7FirewallRules(ctx, "example", &networks.ApplianceFirewallL7FirewallRulesArgs{
//				NetworkId: pulumi.String("string"),
//				Rules: networks.ApplianceFirewallL7FirewallRulesRuleArray{
//					&networks.ApplianceFirewallL7FirewallRulesRuleArgs{
//						Policy: pulumi.String("deny"),
//						Type:   pulumi.String("host"),
//						Value:  pulumi.String("google.com"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksApplianceFirewallL7FirewallRulesExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/applianceFirewallL7FirewallRules:ApplianceFirewallL7FirewallRules example "network_id"
// ```
type ApplianceFirewallL7FirewallRules struct {
	pulumi.CustomResourceState

	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// An ordered array of the MX L7 firewall rules
	Rules ApplianceFirewallL7FirewallRulesRuleArrayOutput `pulumi:"rules"`
	// An ordered array of the MX L7 firewall rules
	RulesResponses ApplianceFirewallL7FirewallRulesRulesResponseArrayOutput `pulumi:"rulesResponses"`
}

// NewApplianceFirewallL7FirewallRules registers a new resource with the given unique name, arguments, and options.
func NewApplianceFirewallL7FirewallRules(ctx *pulumi.Context,
	name string, args *ApplianceFirewallL7FirewallRulesArgs, opts ...pulumi.ResourceOption) (*ApplianceFirewallL7FirewallRules, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplianceFirewallL7FirewallRules
	err := ctx.RegisterResource("meraki:networks/applianceFirewallL7FirewallRules:ApplianceFirewallL7FirewallRules", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplianceFirewallL7FirewallRules gets an existing ApplianceFirewallL7FirewallRules resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplianceFirewallL7FirewallRules(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplianceFirewallL7FirewallRulesState, opts ...pulumi.ResourceOption) (*ApplianceFirewallL7FirewallRules, error) {
	var resource ApplianceFirewallL7FirewallRules
	err := ctx.ReadResource("meraki:networks/applianceFirewallL7FirewallRules:ApplianceFirewallL7FirewallRules", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplianceFirewallL7FirewallRules resources.
type applianceFirewallL7FirewallRulesState struct {
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// An ordered array of the MX L7 firewall rules
	Rules []ApplianceFirewallL7FirewallRulesRule `pulumi:"rules"`
	// An ordered array of the MX L7 firewall rules
	RulesResponses []ApplianceFirewallL7FirewallRulesRulesResponse `pulumi:"rulesResponses"`
}

type ApplianceFirewallL7FirewallRulesState struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// An ordered array of the MX L7 firewall rules
	Rules ApplianceFirewallL7FirewallRulesRuleArrayInput
	// An ordered array of the MX L7 firewall rules
	RulesResponses ApplianceFirewallL7FirewallRulesRulesResponseArrayInput
}

func (ApplianceFirewallL7FirewallRulesState) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceFirewallL7FirewallRulesState)(nil)).Elem()
}

type applianceFirewallL7FirewallRulesArgs struct {
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// An ordered array of the MX L7 firewall rules
	Rules []ApplianceFirewallL7FirewallRulesRule `pulumi:"rules"`
}

// The set of arguments for constructing a ApplianceFirewallL7FirewallRules resource.
type ApplianceFirewallL7FirewallRulesArgs struct {
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// An ordered array of the MX L7 firewall rules
	Rules ApplianceFirewallL7FirewallRulesRuleArrayInput
}

func (ApplianceFirewallL7FirewallRulesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceFirewallL7FirewallRulesArgs)(nil)).Elem()
}

type ApplianceFirewallL7FirewallRulesInput interface {
	pulumi.Input

	ToApplianceFirewallL7FirewallRulesOutput() ApplianceFirewallL7FirewallRulesOutput
	ToApplianceFirewallL7FirewallRulesOutputWithContext(ctx context.Context) ApplianceFirewallL7FirewallRulesOutput
}

func (*ApplianceFirewallL7FirewallRules) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceFirewallL7FirewallRules)(nil)).Elem()
}

func (i *ApplianceFirewallL7FirewallRules) ToApplianceFirewallL7FirewallRulesOutput() ApplianceFirewallL7FirewallRulesOutput {
	return i.ToApplianceFirewallL7FirewallRulesOutputWithContext(context.Background())
}

func (i *ApplianceFirewallL7FirewallRules) ToApplianceFirewallL7FirewallRulesOutputWithContext(ctx context.Context) ApplianceFirewallL7FirewallRulesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceFirewallL7FirewallRulesOutput)
}

// ApplianceFirewallL7FirewallRulesArrayInput is an input type that accepts ApplianceFirewallL7FirewallRulesArray and ApplianceFirewallL7FirewallRulesArrayOutput values.
// You can construct a concrete instance of `ApplianceFirewallL7FirewallRulesArrayInput` via:
//
//	ApplianceFirewallL7FirewallRulesArray{ ApplianceFirewallL7FirewallRulesArgs{...} }
type ApplianceFirewallL7FirewallRulesArrayInput interface {
	pulumi.Input

	ToApplianceFirewallL7FirewallRulesArrayOutput() ApplianceFirewallL7FirewallRulesArrayOutput
	ToApplianceFirewallL7FirewallRulesArrayOutputWithContext(context.Context) ApplianceFirewallL7FirewallRulesArrayOutput
}

type ApplianceFirewallL7FirewallRulesArray []ApplianceFirewallL7FirewallRulesInput

func (ApplianceFirewallL7FirewallRulesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceFirewallL7FirewallRules)(nil)).Elem()
}

func (i ApplianceFirewallL7FirewallRulesArray) ToApplianceFirewallL7FirewallRulesArrayOutput() ApplianceFirewallL7FirewallRulesArrayOutput {
	return i.ToApplianceFirewallL7FirewallRulesArrayOutputWithContext(context.Background())
}

func (i ApplianceFirewallL7FirewallRulesArray) ToApplianceFirewallL7FirewallRulesArrayOutputWithContext(ctx context.Context) ApplianceFirewallL7FirewallRulesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceFirewallL7FirewallRulesArrayOutput)
}

// ApplianceFirewallL7FirewallRulesMapInput is an input type that accepts ApplianceFirewallL7FirewallRulesMap and ApplianceFirewallL7FirewallRulesMapOutput values.
// You can construct a concrete instance of `ApplianceFirewallL7FirewallRulesMapInput` via:
//
//	ApplianceFirewallL7FirewallRulesMap{ "key": ApplianceFirewallL7FirewallRulesArgs{...} }
type ApplianceFirewallL7FirewallRulesMapInput interface {
	pulumi.Input

	ToApplianceFirewallL7FirewallRulesMapOutput() ApplianceFirewallL7FirewallRulesMapOutput
	ToApplianceFirewallL7FirewallRulesMapOutputWithContext(context.Context) ApplianceFirewallL7FirewallRulesMapOutput
}

type ApplianceFirewallL7FirewallRulesMap map[string]ApplianceFirewallL7FirewallRulesInput

func (ApplianceFirewallL7FirewallRulesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceFirewallL7FirewallRules)(nil)).Elem()
}

func (i ApplianceFirewallL7FirewallRulesMap) ToApplianceFirewallL7FirewallRulesMapOutput() ApplianceFirewallL7FirewallRulesMapOutput {
	return i.ToApplianceFirewallL7FirewallRulesMapOutputWithContext(context.Background())
}

func (i ApplianceFirewallL7FirewallRulesMap) ToApplianceFirewallL7FirewallRulesMapOutputWithContext(ctx context.Context) ApplianceFirewallL7FirewallRulesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceFirewallL7FirewallRulesMapOutput)
}

type ApplianceFirewallL7FirewallRulesOutput struct{ *pulumi.OutputState }

func (ApplianceFirewallL7FirewallRulesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceFirewallL7FirewallRules)(nil)).Elem()
}

func (o ApplianceFirewallL7FirewallRulesOutput) ToApplianceFirewallL7FirewallRulesOutput() ApplianceFirewallL7FirewallRulesOutput {
	return o
}

func (o ApplianceFirewallL7FirewallRulesOutput) ToApplianceFirewallL7FirewallRulesOutputWithContext(ctx context.Context) ApplianceFirewallL7FirewallRulesOutput {
	return o
}

// networkId path parameter. Network ID
func (o ApplianceFirewallL7FirewallRulesOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceFirewallL7FirewallRules) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// An ordered array of the MX L7 firewall rules
func (o ApplianceFirewallL7FirewallRulesOutput) Rules() ApplianceFirewallL7FirewallRulesRuleArrayOutput {
	return o.ApplyT(func(v *ApplianceFirewallL7FirewallRules) ApplianceFirewallL7FirewallRulesRuleArrayOutput {
		return v.Rules
	}).(ApplianceFirewallL7FirewallRulesRuleArrayOutput)
}

// An ordered array of the MX L7 firewall rules
func (o ApplianceFirewallL7FirewallRulesOutput) RulesResponses() ApplianceFirewallL7FirewallRulesRulesResponseArrayOutput {
	return o.ApplyT(func(v *ApplianceFirewallL7FirewallRules) ApplianceFirewallL7FirewallRulesRulesResponseArrayOutput {
		return v.RulesResponses
	}).(ApplianceFirewallL7FirewallRulesRulesResponseArrayOutput)
}

type ApplianceFirewallL7FirewallRulesArrayOutput struct{ *pulumi.OutputState }

func (ApplianceFirewallL7FirewallRulesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceFirewallL7FirewallRules)(nil)).Elem()
}

func (o ApplianceFirewallL7FirewallRulesArrayOutput) ToApplianceFirewallL7FirewallRulesArrayOutput() ApplianceFirewallL7FirewallRulesArrayOutput {
	return o
}

func (o ApplianceFirewallL7FirewallRulesArrayOutput) ToApplianceFirewallL7FirewallRulesArrayOutputWithContext(ctx context.Context) ApplianceFirewallL7FirewallRulesArrayOutput {
	return o
}

func (o ApplianceFirewallL7FirewallRulesArrayOutput) Index(i pulumi.IntInput) ApplianceFirewallL7FirewallRulesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplianceFirewallL7FirewallRules {
		return vs[0].([]*ApplianceFirewallL7FirewallRules)[vs[1].(int)]
	}).(ApplianceFirewallL7FirewallRulesOutput)
}

type ApplianceFirewallL7FirewallRulesMapOutput struct{ *pulumi.OutputState }

func (ApplianceFirewallL7FirewallRulesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceFirewallL7FirewallRules)(nil)).Elem()
}

func (o ApplianceFirewallL7FirewallRulesMapOutput) ToApplianceFirewallL7FirewallRulesMapOutput() ApplianceFirewallL7FirewallRulesMapOutput {
	return o
}

func (o ApplianceFirewallL7FirewallRulesMapOutput) ToApplianceFirewallL7FirewallRulesMapOutputWithContext(ctx context.Context) ApplianceFirewallL7FirewallRulesMapOutput {
	return o
}

func (o ApplianceFirewallL7FirewallRulesMapOutput) MapIndex(k pulumi.StringInput) ApplianceFirewallL7FirewallRulesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplianceFirewallL7FirewallRules {
		return vs[0].(map[string]*ApplianceFirewallL7FirewallRules)[vs[1].(string)]
	}).(ApplianceFirewallL7FirewallRulesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceFirewallL7FirewallRulesInput)(nil)).Elem(), &ApplianceFirewallL7FirewallRules{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceFirewallL7FirewallRulesArrayInput)(nil)).Elem(), ApplianceFirewallL7FirewallRulesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceFirewallL7FirewallRulesMapInput)(nil)).Elem(), ApplianceFirewallL7FirewallRulesMap{})
	pulumi.RegisterOutputType(ApplianceFirewallL7FirewallRulesOutput{})
	pulumi.RegisterOutputType(ApplianceFirewallL7FirewallRulesArrayOutput{})
	pulumi.RegisterOutputType(ApplianceFirewallL7FirewallRulesMapOutput{})
}
