// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

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
// $ pulumi import meraki:organizations/adaptivePolicyAcls:AdaptivePolicyAcls example "acl_id,organization_id"
// ```
type AdaptivePolicyAcls struct {
	pulumi.CustomResourceState

	// ID of the adaptive policy ACL
	AclId pulumi.StringOutput `pulumi:"aclId"`
	// When the adaptive policy ACL was created
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Description of the adaptive policy ACL
	Description pulumi.StringOutput `pulumi:"description"`
	// IP version of adpative policy ACL
	IpVersion pulumi.StringOutput `pulumi:"ipVersion"`
	// Name of the adaptive policy ACL
	Name pulumi.StringOutput `pulumi:"name"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// An ordered array of the adaptive policy ACL rules
	Rules AdaptivePolicyAclsRuleArrayOutput `pulumi:"rules"`
	// When the adaptive policy ACL was last updated
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewAdaptivePolicyAcls registers a new resource with the given unique name, arguments, and options.
func NewAdaptivePolicyAcls(ctx *pulumi.Context,
	name string, args *AdaptivePolicyAclsArgs, opts ...pulumi.ResourceOption) (*AdaptivePolicyAcls, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AdaptivePolicyAcls
	err := ctx.RegisterResource("meraki:organizations/adaptivePolicyAcls:AdaptivePolicyAcls", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAdaptivePolicyAcls gets an existing AdaptivePolicyAcls resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAdaptivePolicyAcls(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AdaptivePolicyAclsState, opts ...pulumi.ResourceOption) (*AdaptivePolicyAcls, error) {
	var resource AdaptivePolicyAcls
	err := ctx.ReadResource("meraki:organizations/adaptivePolicyAcls:AdaptivePolicyAcls", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AdaptivePolicyAcls resources.
type adaptivePolicyAclsState struct {
	// ID of the adaptive policy ACL
	AclId *string `pulumi:"aclId"`
	// When the adaptive policy ACL was created
	CreatedAt *string `pulumi:"createdAt"`
	// Description of the adaptive policy ACL
	Description *string `pulumi:"description"`
	// IP version of adpative policy ACL
	IpVersion *string `pulumi:"ipVersion"`
	// Name of the adaptive policy ACL
	Name *string `pulumi:"name"`
	// organizationId path parameter. Organization ID
	OrganizationId *string `pulumi:"organizationId"`
	// An ordered array of the adaptive policy ACL rules
	Rules []AdaptivePolicyAclsRule `pulumi:"rules"`
	// When the adaptive policy ACL was last updated
	UpdatedAt *string `pulumi:"updatedAt"`
}

type AdaptivePolicyAclsState struct {
	// ID of the adaptive policy ACL
	AclId pulumi.StringPtrInput
	// When the adaptive policy ACL was created
	CreatedAt pulumi.StringPtrInput
	// Description of the adaptive policy ACL
	Description pulumi.StringPtrInput
	// IP version of adpative policy ACL
	IpVersion pulumi.StringPtrInput
	// Name of the adaptive policy ACL
	Name pulumi.StringPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
	// An ordered array of the adaptive policy ACL rules
	Rules AdaptivePolicyAclsRuleArrayInput
	// When the adaptive policy ACL was last updated
	UpdatedAt pulumi.StringPtrInput
}

func (AdaptivePolicyAclsState) ElementType() reflect.Type {
	return reflect.TypeOf((*adaptivePolicyAclsState)(nil)).Elem()
}

type adaptivePolicyAclsArgs struct {
	// ID of the adaptive policy ACL
	AclId *string `pulumi:"aclId"`
	// Description of the adaptive policy ACL
	Description *string `pulumi:"description"`
	// IP version of adpative policy ACL
	IpVersion *string `pulumi:"ipVersion"`
	// Name of the adaptive policy ACL
	Name *string `pulumi:"name"`
	// organizationId path parameter. Organization ID
	OrganizationId string `pulumi:"organizationId"`
	// An ordered array of the adaptive policy ACL rules
	Rules []AdaptivePolicyAclsRule `pulumi:"rules"`
}

// The set of arguments for constructing a AdaptivePolicyAcls resource.
type AdaptivePolicyAclsArgs struct {
	// ID of the adaptive policy ACL
	AclId pulumi.StringPtrInput
	// Description of the adaptive policy ACL
	Description pulumi.StringPtrInput
	// IP version of adpative policy ACL
	IpVersion pulumi.StringPtrInput
	// Name of the adaptive policy ACL
	Name pulumi.StringPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
	// An ordered array of the adaptive policy ACL rules
	Rules AdaptivePolicyAclsRuleArrayInput
}

func (AdaptivePolicyAclsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*adaptivePolicyAclsArgs)(nil)).Elem()
}

type AdaptivePolicyAclsInput interface {
	pulumi.Input

	ToAdaptivePolicyAclsOutput() AdaptivePolicyAclsOutput
	ToAdaptivePolicyAclsOutputWithContext(ctx context.Context) AdaptivePolicyAclsOutput
}

func (*AdaptivePolicyAcls) ElementType() reflect.Type {
	return reflect.TypeOf((**AdaptivePolicyAcls)(nil)).Elem()
}

func (i *AdaptivePolicyAcls) ToAdaptivePolicyAclsOutput() AdaptivePolicyAclsOutput {
	return i.ToAdaptivePolicyAclsOutputWithContext(context.Background())
}

func (i *AdaptivePolicyAcls) ToAdaptivePolicyAclsOutputWithContext(ctx context.Context) AdaptivePolicyAclsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdaptivePolicyAclsOutput)
}

// AdaptivePolicyAclsArrayInput is an input type that accepts AdaptivePolicyAclsArray and AdaptivePolicyAclsArrayOutput values.
// You can construct a concrete instance of `AdaptivePolicyAclsArrayInput` via:
//
//	AdaptivePolicyAclsArray{ AdaptivePolicyAclsArgs{...} }
type AdaptivePolicyAclsArrayInput interface {
	pulumi.Input

	ToAdaptivePolicyAclsArrayOutput() AdaptivePolicyAclsArrayOutput
	ToAdaptivePolicyAclsArrayOutputWithContext(context.Context) AdaptivePolicyAclsArrayOutput
}

type AdaptivePolicyAclsArray []AdaptivePolicyAclsInput

func (AdaptivePolicyAclsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AdaptivePolicyAcls)(nil)).Elem()
}

func (i AdaptivePolicyAclsArray) ToAdaptivePolicyAclsArrayOutput() AdaptivePolicyAclsArrayOutput {
	return i.ToAdaptivePolicyAclsArrayOutputWithContext(context.Background())
}

func (i AdaptivePolicyAclsArray) ToAdaptivePolicyAclsArrayOutputWithContext(ctx context.Context) AdaptivePolicyAclsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdaptivePolicyAclsArrayOutput)
}

// AdaptivePolicyAclsMapInput is an input type that accepts AdaptivePolicyAclsMap and AdaptivePolicyAclsMapOutput values.
// You can construct a concrete instance of `AdaptivePolicyAclsMapInput` via:
//
//	AdaptivePolicyAclsMap{ "key": AdaptivePolicyAclsArgs{...} }
type AdaptivePolicyAclsMapInput interface {
	pulumi.Input

	ToAdaptivePolicyAclsMapOutput() AdaptivePolicyAclsMapOutput
	ToAdaptivePolicyAclsMapOutputWithContext(context.Context) AdaptivePolicyAclsMapOutput
}

type AdaptivePolicyAclsMap map[string]AdaptivePolicyAclsInput

func (AdaptivePolicyAclsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AdaptivePolicyAcls)(nil)).Elem()
}

func (i AdaptivePolicyAclsMap) ToAdaptivePolicyAclsMapOutput() AdaptivePolicyAclsMapOutput {
	return i.ToAdaptivePolicyAclsMapOutputWithContext(context.Background())
}

func (i AdaptivePolicyAclsMap) ToAdaptivePolicyAclsMapOutputWithContext(ctx context.Context) AdaptivePolicyAclsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AdaptivePolicyAclsMapOutput)
}

type AdaptivePolicyAclsOutput struct{ *pulumi.OutputState }

func (AdaptivePolicyAclsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AdaptivePolicyAcls)(nil)).Elem()
}

func (o AdaptivePolicyAclsOutput) ToAdaptivePolicyAclsOutput() AdaptivePolicyAclsOutput {
	return o
}

func (o AdaptivePolicyAclsOutput) ToAdaptivePolicyAclsOutputWithContext(ctx context.Context) AdaptivePolicyAclsOutput {
	return o
}

// ID of the adaptive policy ACL
func (o AdaptivePolicyAclsOutput) AclId() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyAcls) pulumi.StringOutput { return v.AclId }).(pulumi.StringOutput)
}

// When the adaptive policy ACL was created
func (o AdaptivePolicyAclsOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyAcls) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Description of the adaptive policy ACL
func (o AdaptivePolicyAclsOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyAcls) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// IP version of adpative policy ACL
func (o AdaptivePolicyAclsOutput) IpVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyAcls) pulumi.StringOutput { return v.IpVersion }).(pulumi.StringOutput)
}

// Name of the adaptive policy ACL
func (o AdaptivePolicyAclsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyAcls) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// organizationId path parameter. Organization ID
func (o AdaptivePolicyAclsOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyAcls) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// An ordered array of the adaptive policy ACL rules
func (o AdaptivePolicyAclsOutput) Rules() AdaptivePolicyAclsRuleArrayOutput {
	return o.ApplyT(func(v *AdaptivePolicyAcls) AdaptivePolicyAclsRuleArrayOutput { return v.Rules }).(AdaptivePolicyAclsRuleArrayOutput)
}

// When the adaptive policy ACL was last updated
func (o AdaptivePolicyAclsOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AdaptivePolicyAcls) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type AdaptivePolicyAclsArrayOutput struct{ *pulumi.OutputState }

func (AdaptivePolicyAclsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AdaptivePolicyAcls)(nil)).Elem()
}

func (o AdaptivePolicyAclsArrayOutput) ToAdaptivePolicyAclsArrayOutput() AdaptivePolicyAclsArrayOutput {
	return o
}

func (o AdaptivePolicyAclsArrayOutput) ToAdaptivePolicyAclsArrayOutputWithContext(ctx context.Context) AdaptivePolicyAclsArrayOutput {
	return o
}

func (o AdaptivePolicyAclsArrayOutput) Index(i pulumi.IntInput) AdaptivePolicyAclsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AdaptivePolicyAcls {
		return vs[0].([]*AdaptivePolicyAcls)[vs[1].(int)]
	}).(AdaptivePolicyAclsOutput)
}

type AdaptivePolicyAclsMapOutput struct{ *pulumi.OutputState }

func (AdaptivePolicyAclsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AdaptivePolicyAcls)(nil)).Elem()
}

func (o AdaptivePolicyAclsMapOutput) ToAdaptivePolicyAclsMapOutput() AdaptivePolicyAclsMapOutput {
	return o
}

func (o AdaptivePolicyAclsMapOutput) ToAdaptivePolicyAclsMapOutputWithContext(ctx context.Context) AdaptivePolicyAclsMapOutput {
	return o
}

func (o AdaptivePolicyAclsMapOutput) MapIndex(k pulumi.StringInput) AdaptivePolicyAclsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AdaptivePolicyAcls {
		return vs[0].(map[string]*AdaptivePolicyAcls)[vs[1].(string)]
	}).(AdaptivePolicyAclsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AdaptivePolicyAclsInput)(nil)).Elem(), &AdaptivePolicyAcls{})
	pulumi.RegisterInputType(reflect.TypeOf((*AdaptivePolicyAclsArrayInput)(nil)).Elem(), AdaptivePolicyAclsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AdaptivePolicyAclsMapInput)(nil)).Elem(), AdaptivePolicyAclsMap{})
	pulumi.RegisterOutputType(AdaptivePolicyAclsOutput{})
	pulumi.RegisterOutputType(AdaptivePolicyAclsArrayOutput{})
	pulumi.RegisterOutputType(AdaptivePolicyAclsMapOutput{})
}
