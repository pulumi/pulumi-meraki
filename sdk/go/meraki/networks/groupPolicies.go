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
// $ pulumi import meraki:networks/groupPolicies:GroupPolicies example "group_policy_id,network_id"
// ```
type GroupPolicies struct {
	pulumi.CustomResourceState

	// The bandwidth settings for clients bound to your group policy.
	Bandwidth GroupPoliciesBandwidthOutput `pulumi:"bandwidth"`
	// The Bonjour settings for your group policy. Only valid if your network has a wireless configuration.
	BonjourForwarding GroupPoliciesBonjourForwardingOutput `pulumi:"bonjourForwarding"`
	// The content filtering settings for your group policy
	ContentFiltering GroupPoliciesContentFilteringOutput `pulumi:"contentFiltering"`
	// The firewall and traffic shaping rules and settings for your policy.
	FirewallAndTrafficShaping GroupPoliciesFirewallAndTrafficShapingOutput `pulumi:"firewallAndTrafficShaping"`
	// The ID of the group policy
	GroupPolicyId pulumi.StringOutput `pulumi:"groupPolicyId"`
	// The name for your group policy. Required.
	Name pulumi.StringOutput `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// The schedule for the group policy. Schedules are applied to days of the week.
	Scheduling GroupPoliciesSchedulingOutput `pulumi:"scheduling"`
	// Whether clients bound to your policy will bypass splash authorization or behave according to the network's rules. Can be one of 'network default' or 'bypass'. Only available if your network has a wireless configuration.
	SplashAuthSettings pulumi.StringOutput `pulumi:"splashAuthSettings"`
	// The VLAN tagging settings for your group policy. Only available if your network has a wireless configuration.
	VlanTagging GroupPoliciesVlanTaggingOutput `pulumi:"vlanTagging"`
}

// NewGroupPolicies registers a new resource with the given unique name, arguments, and options.
func NewGroupPolicies(ctx *pulumi.Context,
	name string, args *GroupPoliciesArgs, opts ...pulumi.ResourceOption) (*GroupPolicies, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GroupPolicies
	err := ctx.RegisterResource("meraki:networks/groupPolicies:GroupPolicies", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroupPolicies gets an existing GroupPolicies resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroupPolicies(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupPoliciesState, opts ...pulumi.ResourceOption) (*GroupPolicies, error) {
	var resource GroupPolicies
	err := ctx.ReadResource("meraki:networks/groupPolicies:GroupPolicies", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GroupPolicies resources.
type groupPoliciesState struct {
	// The bandwidth settings for clients bound to your group policy.
	Bandwidth *GroupPoliciesBandwidth `pulumi:"bandwidth"`
	// The Bonjour settings for your group policy. Only valid if your network has a wireless configuration.
	BonjourForwarding *GroupPoliciesBonjourForwarding `pulumi:"bonjourForwarding"`
	// The content filtering settings for your group policy
	ContentFiltering *GroupPoliciesContentFiltering `pulumi:"contentFiltering"`
	// The firewall and traffic shaping rules and settings for your policy.
	FirewallAndTrafficShaping *GroupPoliciesFirewallAndTrafficShaping `pulumi:"firewallAndTrafficShaping"`
	// The ID of the group policy
	GroupPolicyId *string `pulumi:"groupPolicyId"`
	// The name for your group policy. Required.
	Name *string `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// The schedule for the group policy. Schedules are applied to days of the week.
	Scheduling *GroupPoliciesScheduling `pulumi:"scheduling"`
	// Whether clients bound to your policy will bypass splash authorization or behave according to the network's rules. Can be one of 'network default' or 'bypass'. Only available if your network has a wireless configuration.
	SplashAuthSettings *string `pulumi:"splashAuthSettings"`
	// The VLAN tagging settings for your group policy. Only available if your network has a wireless configuration.
	VlanTagging *GroupPoliciesVlanTagging `pulumi:"vlanTagging"`
}

type GroupPoliciesState struct {
	// The bandwidth settings for clients bound to your group policy.
	Bandwidth GroupPoliciesBandwidthPtrInput
	// The Bonjour settings for your group policy. Only valid if your network has a wireless configuration.
	BonjourForwarding GroupPoliciesBonjourForwardingPtrInput
	// The content filtering settings for your group policy
	ContentFiltering GroupPoliciesContentFilteringPtrInput
	// The firewall and traffic shaping rules and settings for your policy.
	FirewallAndTrafficShaping GroupPoliciesFirewallAndTrafficShapingPtrInput
	// The ID of the group policy
	GroupPolicyId pulumi.StringPtrInput
	// The name for your group policy. Required.
	Name pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// The schedule for the group policy. Schedules are applied to days of the week.
	Scheduling GroupPoliciesSchedulingPtrInput
	// Whether clients bound to your policy will bypass splash authorization or behave according to the network's rules. Can be one of 'network default' or 'bypass'. Only available if your network has a wireless configuration.
	SplashAuthSettings pulumi.StringPtrInput
	// The VLAN tagging settings for your group policy. Only available if your network has a wireless configuration.
	VlanTagging GroupPoliciesVlanTaggingPtrInput
}

func (GroupPoliciesState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupPoliciesState)(nil)).Elem()
}

type groupPoliciesArgs struct {
	// The bandwidth settings for clients bound to your group policy.
	Bandwidth *GroupPoliciesBandwidth `pulumi:"bandwidth"`
	// The Bonjour settings for your group policy. Only valid if your network has a wireless configuration.
	BonjourForwarding *GroupPoliciesBonjourForwarding `pulumi:"bonjourForwarding"`
	// The content filtering settings for your group policy
	ContentFiltering *GroupPoliciesContentFiltering `pulumi:"contentFiltering"`
	// The firewall and traffic shaping rules and settings for your policy.
	FirewallAndTrafficShaping *GroupPoliciesFirewallAndTrafficShaping `pulumi:"firewallAndTrafficShaping"`
	// The name for your group policy. Required.
	Name *string `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// The schedule for the group policy. Schedules are applied to days of the week.
	Scheduling *GroupPoliciesScheduling `pulumi:"scheduling"`
	// Whether clients bound to your policy will bypass splash authorization or behave according to the network's rules. Can be one of 'network default' or 'bypass'. Only available if your network has a wireless configuration.
	SplashAuthSettings *string `pulumi:"splashAuthSettings"`
	// The VLAN tagging settings for your group policy. Only available if your network has a wireless configuration.
	VlanTagging *GroupPoliciesVlanTagging `pulumi:"vlanTagging"`
}

// The set of arguments for constructing a GroupPolicies resource.
type GroupPoliciesArgs struct {
	// The bandwidth settings for clients bound to your group policy.
	Bandwidth GroupPoliciesBandwidthPtrInput
	// The Bonjour settings for your group policy. Only valid if your network has a wireless configuration.
	BonjourForwarding GroupPoliciesBonjourForwardingPtrInput
	// The content filtering settings for your group policy
	ContentFiltering GroupPoliciesContentFilteringPtrInput
	// The firewall and traffic shaping rules and settings for your policy.
	FirewallAndTrafficShaping GroupPoliciesFirewallAndTrafficShapingPtrInput
	// The name for your group policy. Required.
	Name pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// The schedule for the group policy. Schedules are applied to days of the week.
	Scheduling GroupPoliciesSchedulingPtrInput
	// Whether clients bound to your policy will bypass splash authorization or behave according to the network's rules. Can be one of 'network default' or 'bypass'. Only available if your network has a wireless configuration.
	SplashAuthSettings pulumi.StringPtrInput
	// The VLAN tagging settings for your group policy. Only available if your network has a wireless configuration.
	VlanTagging GroupPoliciesVlanTaggingPtrInput
}

func (GroupPoliciesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupPoliciesArgs)(nil)).Elem()
}

type GroupPoliciesInput interface {
	pulumi.Input

	ToGroupPoliciesOutput() GroupPoliciesOutput
	ToGroupPoliciesOutputWithContext(ctx context.Context) GroupPoliciesOutput
}

func (*GroupPolicies) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupPolicies)(nil)).Elem()
}

func (i *GroupPolicies) ToGroupPoliciesOutput() GroupPoliciesOutput {
	return i.ToGroupPoliciesOutputWithContext(context.Background())
}

func (i *GroupPolicies) ToGroupPoliciesOutputWithContext(ctx context.Context) GroupPoliciesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupPoliciesOutput)
}

// GroupPoliciesArrayInput is an input type that accepts GroupPoliciesArray and GroupPoliciesArrayOutput values.
// You can construct a concrete instance of `GroupPoliciesArrayInput` via:
//
//	GroupPoliciesArray{ GroupPoliciesArgs{...} }
type GroupPoliciesArrayInput interface {
	pulumi.Input

	ToGroupPoliciesArrayOutput() GroupPoliciesArrayOutput
	ToGroupPoliciesArrayOutputWithContext(context.Context) GroupPoliciesArrayOutput
}

type GroupPoliciesArray []GroupPoliciesInput

func (GroupPoliciesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupPolicies)(nil)).Elem()
}

func (i GroupPoliciesArray) ToGroupPoliciesArrayOutput() GroupPoliciesArrayOutput {
	return i.ToGroupPoliciesArrayOutputWithContext(context.Background())
}

func (i GroupPoliciesArray) ToGroupPoliciesArrayOutputWithContext(ctx context.Context) GroupPoliciesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupPoliciesArrayOutput)
}

// GroupPoliciesMapInput is an input type that accepts GroupPoliciesMap and GroupPoliciesMapOutput values.
// You can construct a concrete instance of `GroupPoliciesMapInput` via:
//
//	GroupPoliciesMap{ "key": GroupPoliciesArgs{...} }
type GroupPoliciesMapInput interface {
	pulumi.Input

	ToGroupPoliciesMapOutput() GroupPoliciesMapOutput
	ToGroupPoliciesMapOutputWithContext(context.Context) GroupPoliciesMapOutput
}

type GroupPoliciesMap map[string]GroupPoliciesInput

func (GroupPoliciesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupPolicies)(nil)).Elem()
}

func (i GroupPoliciesMap) ToGroupPoliciesMapOutput() GroupPoliciesMapOutput {
	return i.ToGroupPoliciesMapOutputWithContext(context.Background())
}

func (i GroupPoliciesMap) ToGroupPoliciesMapOutputWithContext(ctx context.Context) GroupPoliciesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupPoliciesMapOutput)
}

type GroupPoliciesOutput struct{ *pulumi.OutputState }

func (GroupPoliciesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupPolicies)(nil)).Elem()
}

func (o GroupPoliciesOutput) ToGroupPoliciesOutput() GroupPoliciesOutput {
	return o
}

func (o GroupPoliciesOutput) ToGroupPoliciesOutputWithContext(ctx context.Context) GroupPoliciesOutput {
	return o
}

// The bandwidth settings for clients bound to your group policy.
func (o GroupPoliciesOutput) Bandwidth() GroupPoliciesBandwidthOutput {
	return o.ApplyT(func(v *GroupPolicies) GroupPoliciesBandwidthOutput { return v.Bandwidth }).(GroupPoliciesBandwidthOutput)
}

// The Bonjour settings for your group policy. Only valid if your network has a wireless configuration.
func (o GroupPoliciesOutput) BonjourForwarding() GroupPoliciesBonjourForwardingOutput {
	return o.ApplyT(func(v *GroupPolicies) GroupPoliciesBonjourForwardingOutput { return v.BonjourForwarding }).(GroupPoliciesBonjourForwardingOutput)
}

// The content filtering settings for your group policy
func (o GroupPoliciesOutput) ContentFiltering() GroupPoliciesContentFilteringOutput {
	return o.ApplyT(func(v *GroupPolicies) GroupPoliciesContentFilteringOutput { return v.ContentFiltering }).(GroupPoliciesContentFilteringOutput)
}

// The firewall and traffic shaping rules and settings for your policy.
func (o GroupPoliciesOutput) FirewallAndTrafficShaping() GroupPoliciesFirewallAndTrafficShapingOutput {
	return o.ApplyT(func(v *GroupPolicies) GroupPoliciesFirewallAndTrafficShapingOutput {
		return v.FirewallAndTrafficShaping
	}).(GroupPoliciesFirewallAndTrafficShapingOutput)
}

// The ID of the group policy
func (o GroupPoliciesOutput) GroupPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupPolicies) pulumi.StringOutput { return v.GroupPolicyId }).(pulumi.StringOutput)
}

// The name for your group policy. Required.
func (o GroupPoliciesOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupPolicies) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o GroupPoliciesOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupPolicies) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// The schedule for the group policy. Schedules are applied to days of the week.
func (o GroupPoliciesOutput) Scheduling() GroupPoliciesSchedulingOutput {
	return o.ApplyT(func(v *GroupPolicies) GroupPoliciesSchedulingOutput { return v.Scheduling }).(GroupPoliciesSchedulingOutput)
}

// Whether clients bound to your policy will bypass splash authorization or behave according to the network's rules. Can be one of 'network default' or 'bypass'. Only available if your network has a wireless configuration.
func (o GroupPoliciesOutput) SplashAuthSettings() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupPolicies) pulumi.StringOutput { return v.SplashAuthSettings }).(pulumi.StringOutput)
}

// The VLAN tagging settings for your group policy. Only available if your network has a wireless configuration.
func (o GroupPoliciesOutput) VlanTagging() GroupPoliciesVlanTaggingOutput {
	return o.ApplyT(func(v *GroupPolicies) GroupPoliciesVlanTaggingOutput { return v.VlanTagging }).(GroupPoliciesVlanTaggingOutput)
}

type GroupPoliciesArrayOutput struct{ *pulumi.OutputState }

func (GroupPoliciesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupPolicies)(nil)).Elem()
}

func (o GroupPoliciesArrayOutput) ToGroupPoliciesArrayOutput() GroupPoliciesArrayOutput {
	return o
}

func (o GroupPoliciesArrayOutput) ToGroupPoliciesArrayOutputWithContext(ctx context.Context) GroupPoliciesArrayOutput {
	return o
}

func (o GroupPoliciesArrayOutput) Index(i pulumi.IntInput) GroupPoliciesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GroupPolicies {
		return vs[0].([]*GroupPolicies)[vs[1].(int)]
	}).(GroupPoliciesOutput)
}

type GroupPoliciesMapOutput struct{ *pulumi.OutputState }

func (GroupPoliciesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupPolicies)(nil)).Elem()
}

func (o GroupPoliciesMapOutput) ToGroupPoliciesMapOutput() GroupPoliciesMapOutput {
	return o
}

func (o GroupPoliciesMapOutput) ToGroupPoliciesMapOutputWithContext(ctx context.Context) GroupPoliciesMapOutput {
	return o
}

func (o GroupPoliciesMapOutput) MapIndex(k pulumi.StringInput) GroupPoliciesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GroupPolicies {
		return vs[0].(map[string]*GroupPolicies)[vs[1].(string)]
	}).(GroupPoliciesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupPoliciesInput)(nil)).Elem(), &GroupPolicies{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupPoliciesArrayInput)(nil)).Elem(), GroupPoliciesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupPoliciesMapInput)(nil)).Elem(), GroupPoliciesMap{})
	pulumi.RegisterOutputType(GroupPoliciesOutput{})
	pulumi.RegisterOutputType(GroupPoliciesArrayOutput{})
	pulumi.RegisterOutputType(GroupPoliciesMapOutput{})
}
