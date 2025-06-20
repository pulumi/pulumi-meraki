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

// ~>Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
// already existed previously.
type LicensesMove struct {
	pulumi.CustomResourceState

	Item LicensesMoveItemOutput `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput          `pulumi:"organizationId"`
	Parameters     LicensesMoveParametersOutput `pulumi:"parameters"`
}

// NewLicensesMove registers a new resource with the given unique name, arguments, and options.
func NewLicensesMove(ctx *pulumi.Context,
	name string, args *LicensesMoveArgs, opts ...pulumi.ResourceOption) (*LicensesMove, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	if args.Parameters == nil {
		return nil, errors.New("invalid value for required argument 'Parameters'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LicensesMove
	err := ctx.RegisterResource("meraki:organizations/licensesMove:LicensesMove", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLicensesMove gets an existing LicensesMove resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLicensesMove(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LicensesMoveState, opts ...pulumi.ResourceOption) (*LicensesMove, error) {
	var resource LicensesMove
	err := ctx.ReadResource("meraki:organizations/licensesMove:LicensesMove", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LicensesMove resources.
type licensesMoveState struct {
	Item *LicensesMoveItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId *string                 `pulumi:"organizationId"`
	Parameters     *LicensesMoveParameters `pulumi:"parameters"`
}

type LicensesMoveState struct {
	Item LicensesMoveItemPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
	Parameters     LicensesMoveParametersPtrInput
}

func (LicensesMoveState) ElementType() reflect.Type {
	return reflect.TypeOf((*licensesMoveState)(nil)).Elem()
}

type licensesMoveArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string                 `pulumi:"organizationId"`
	Parameters     LicensesMoveParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a LicensesMove resource.
type LicensesMoveArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
	Parameters     LicensesMoveParametersInput
}

func (LicensesMoveArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*licensesMoveArgs)(nil)).Elem()
}

type LicensesMoveInput interface {
	pulumi.Input

	ToLicensesMoveOutput() LicensesMoveOutput
	ToLicensesMoveOutputWithContext(ctx context.Context) LicensesMoveOutput
}

func (*LicensesMove) ElementType() reflect.Type {
	return reflect.TypeOf((**LicensesMove)(nil)).Elem()
}

func (i *LicensesMove) ToLicensesMoveOutput() LicensesMoveOutput {
	return i.ToLicensesMoveOutputWithContext(context.Background())
}

func (i *LicensesMove) ToLicensesMoveOutputWithContext(ctx context.Context) LicensesMoveOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicensesMoveOutput)
}

// LicensesMoveArrayInput is an input type that accepts LicensesMoveArray and LicensesMoveArrayOutput values.
// You can construct a concrete instance of `LicensesMoveArrayInput` via:
//
//	LicensesMoveArray{ LicensesMoveArgs{...} }
type LicensesMoveArrayInput interface {
	pulumi.Input

	ToLicensesMoveArrayOutput() LicensesMoveArrayOutput
	ToLicensesMoveArrayOutputWithContext(context.Context) LicensesMoveArrayOutput
}

type LicensesMoveArray []LicensesMoveInput

func (LicensesMoveArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LicensesMove)(nil)).Elem()
}

func (i LicensesMoveArray) ToLicensesMoveArrayOutput() LicensesMoveArrayOutput {
	return i.ToLicensesMoveArrayOutputWithContext(context.Background())
}

func (i LicensesMoveArray) ToLicensesMoveArrayOutputWithContext(ctx context.Context) LicensesMoveArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicensesMoveArrayOutput)
}

// LicensesMoveMapInput is an input type that accepts LicensesMoveMap and LicensesMoveMapOutput values.
// You can construct a concrete instance of `LicensesMoveMapInput` via:
//
//	LicensesMoveMap{ "key": LicensesMoveArgs{...} }
type LicensesMoveMapInput interface {
	pulumi.Input

	ToLicensesMoveMapOutput() LicensesMoveMapOutput
	ToLicensesMoveMapOutputWithContext(context.Context) LicensesMoveMapOutput
}

type LicensesMoveMap map[string]LicensesMoveInput

func (LicensesMoveMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LicensesMove)(nil)).Elem()
}

func (i LicensesMoveMap) ToLicensesMoveMapOutput() LicensesMoveMapOutput {
	return i.ToLicensesMoveMapOutputWithContext(context.Background())
}

func (i LicensesMoveMap) ToLicensesMoveMapOutputWithContext(ctx context.Context) LicensesMoveMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicensesMoveMapOutput)
}

type LicensesMoveOutput struct{ *pulumi.OutputState }

func (LicensesMoveOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LicensesMove)(nil)).Elem()
}

func (o LicensesMoveOutput) ToLicensesMoveOutput() LicensesMoveOutput {
	return o
}

func (o LicensesMoveOutput) ToLicensesMoveOutputWithContext(ctx context.Context) LicensesMoveOutput {
	return o
}

func (o LicensesMoveOutput) Item() LicensesMoveItemOutput {
	return o.ApplyT(func(v *LicensesMove) LicensesMoveItemOutput { return v.Item }).(LicensesMoveItemOutput)
}

// organizationId path parameter. Organization ID
func (o LicensesMoveOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *LicensesMove) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

func (o LicensesMoveOutput) Parameters() LicensesMoveParametersOutput {
	return o.ApplyT(func(v *LicensesMove) LicensesMoveParametersOutput { return v.Parameters }).(LicensesMoveParametersOutput)
}

type LicensesMoveArrayOutput struct{ *pulumi.OutputState }

func (LicensesMoveArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LicensesMove)(nil)).Elem()
}

func (o LicensesMoveArrayOutput) ToLicensesMoveArrayOutput() LicensesMoveArrayOutput {
	return o
}

func (o LicensesMoveArrayOutput) ToLicensesMoveArrayOutputWithContext(ctx context.Context) LicensesMoveArrayOutput {
	return o
}

func (o LicensesMoveArrayOutput) Index(i pulumi.IntInput) LicensesMoveOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LicensesMove {
		return vs[0].([]*LicensesMove)[vs[1].(int)]
	}).(LicensesMoveOutput)
}

type LicensesMoveMapOutput struct{ *pulumi.OutputState }

func (LicensesMoveMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LicensesMove)(nil)).Elem()
}

func (o LicensesMoveMapOutput) ToLicensesMoveMapOutput() LicensesMoveMapOutput {
	return o
}

func (o LicensesMoveMapOutput) ToLicensesMoveMapOutputWithContext(ctx context.Context) LicensesMoveMapOutput {
	return o
}

func (o LicensesMoveMapOutput) MapIndex(k pulumi.StringInput) LicensesMoveOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LicensesMove {
		return vs[0].(map[string]*LicensesMove)[vs[1].(string)]
	}).(LicensesMoveOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LicensesMoveInput)(nil)).Elem(), &LicensesMove{})
	pulumi.RegisterInputType(reflect.TypeOf((*LicensesMoveArrayInput)(nil)).Elem(), LicensesMoveArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LicensesMoveMapInput)(nil)).Elem(), LicensesMoveMap{})
	pulumi.RegisterOutputType(LicensesMoveOutput{})
	pulumi.RegisterOutputType(LicensesMoveArrayOutput{})
	pulumi.RegisterOutputType(LicensesMoveMapOutput{})
}
