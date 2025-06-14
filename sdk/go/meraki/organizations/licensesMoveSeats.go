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
type LicensesMoveSeats struct {
	pulumi.CustomResourceState

	Item LicensesMoveSeatsItemOutput `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput               `pulumi:"organizationId"`
	Parameters     LicensesMoveSeatsParametersOutput `pulumi:"parameters"`
}

// NewLicensesMoveSeats registers a new resource with the given unique name, arguments, and options.
func NewLicensesMoveSeats(ctx *pulumi.Context,
	name string, args *LicensesMoveSeatsArgs, opts ...pulumi.ResourceOption) (*LicensesMoveSeats, error) {
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
	var resource LicensesMoveSeats
	err := ctx.RegisterResource("meraki:organizations/licensesMoveSeats:LicensesMoveSeats", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLicensesMoveSeats gets an existing LicensesMoveSeats resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLicensesMoveSeats(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LicensesMoveSeatsState, opts ...pulumi.ResourceOption) (*LicensesMoveSeats, error) {
	var resource LicensesMoveSeats
	err := ctx.ReadResource("meraki:organizations/licensesMoveSeats:LicensesMoveSeats", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LicensesMoveSeats resources.
type licensesMoveSeatsState struct {
	Item *LicensesMoveSeatsItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId *string                      `pulumi:"organizationId"`
	Parameters     *LicensesMoveSeatsParameters `pulumi:"parameters"`
}

type LicensesMoveSeatsState struct {
	Item LicensesMoveSeatsItemPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
	Parameters     LicensesMoveSeatsParametersPtrInput
}

func (LicensesMoveSeatsState) ElementType() reflect.Type {
	return reflect.TypeOf((*licensesMoveSeatsState)(nil)).Elem()
}

type licensesMoveSeatsArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string                      `pulumi:"organizationId"`
	Parameters     LicensesMoveSeatsParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a LicensesMoveSeats resource.
type LicensesMoveSeatsArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
	Parameters     LicensesMoveSeatsParametersInput
}

func (LicensesMoveSeatsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*licensesMoveSeatsArgs)(nil)).Elem()
}

type LicensesMoveSeatsInput interface {
	pulumi.Input

	ToLicensesMoveSeatsOutput() LicensesMoveSeatsOutput
	ToLicensesMoveSeatsOutputWithContext(ctx context.Context) LicensesMoveSeatsOutput
}

func (*LicensesMoveSeats) ElementType() reflect.Type {
	return reflect.TypeOf((**LicensesMoveSeats)(nil)).Elem()
}

func (i *LicensesMoveSeats) ToLicensesMoveSeatsOutput() LicensesMoveSeatsOutput {
	return i.ToLicensesMoveSeatsOutputWithContext(context.Background())
}

func (i *LicensesMoveSeats) ToLicensesMoveSeatsOutputWithContext(ctx context.Context) LicensesMoveSeatsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicensesMoveSeatsOutput)
}

// LicensesMoveSeatsArrayInput is an input type that accepts LicensesMoveSeatsArray and LicensesMoveSeatsArrayOutput values.
// You can construct a concrete instance of `LicensesMoveSeatsArrayInput` via:
//
//	LicensesMoveSeatsArray{ LicensesMoveSeatsArgs{...} }
type LicensesMoveSeatsArrayInput interface {
	pulumi.Input

	ToLicensesMoveSeatsArrayOutput() LicensesMoveSeatsArrayOutput
	ToLicensesMoveSeatsArrayOutputWithContext(context.Context) LicensesMoveSeatsArrayOutput
}

type LicensesMoveSeatsArray []LicensesMoveSeatsInput

func (LicensesMoveSeatsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LicensesMoveSeats)(nil)).Elem()
}

func (i LicensesMoveSeatsArray) ToLicensesMoveSeatsArrayOutput() LicensesMoveSeatsArrayOutput {
	return i.ToLicensesMoveSeatsArrayOutputWithContext(context.Background())
}

func (i LicensesMoveSeatsArray) ToLicensesMoveSeatsArrayOutputWithContext(ctx context.Context) LicensesMoveSeatsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicensesMoveSeatsArrayOutput)
}

// LicensesMoveSeatsMapInput is an input type that accepts LicensesMoveSeatsMap and LicensesMoveSeatsMapOutput values.
// You can construct a concrete instance of `LicensesMoveSeatsMapInput` via:
//
//	LicensesMoveSeatsMap{ "key": LicensesMoveSeatsArgs{...} }
type LicensesMoveSeatsMapInput interface {
	pulumi.Input

	ToLicensesMoveSeatsMapOutput() LicensesMoveSeatsMapOutput
	ToLicensesMoveSeatsMapOutputWithContext(context.Context) LicensesMoveSeatsMapOutput
}

type LicensesMoveSeatsMap map[string]LicensesMoveSeatsInput

func (LicensesMoveSeatsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LicensesMoveSeats)(nil)).Elem()
}

func (i LicensesMoveSeatsMap) ToLicensesMoveSeatsMapOutput() LicensesMoveSeatsMapOutput {
	return i.ToLicensesMoveSeatsMapOutputWithContext(context.Background())
}

func (i LicensesMoveSeatsMap) ToLicensesMoveSeatsMapOutputWithContext(ctx context.Context) LicensesMoveSeatsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicensesMoveSeatsMapOutput)
}

type LicensesMoveSeatsOutput struct{ *pulumi.OutputState }

func (LicensesMoveSeatsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LicensesMoveSeats)(nil)).Elem()
}

func (o LicensesMoveSeatsOutput) ToLicensesMoveSeatsOutput() LicensesMoveSeatsOutput {
	return o
}

func (o LicensesMoveSeatsOutput) ToLicensesMoveSeatsOutputWithContext(ctx context.Context) LicensesMoveSeatsOutput {
	return o
}

func (o LicensesMoveSeatsOutput) Item() LicensesMoveSeatsItemOutput {
	return o.ApplyT(func(v *LicensesMoveSeats) LicensesMoveSeatsItemOutput { return v.Item }).(LicensesMoveSeatsItemOutput)
}

// organizationId path parameter. Organization ID
func (o LicensesMoveSeatsOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *LicensesMoveSeats) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

func (o LicensesMoveSeatsOutput) Parameters() LicensesMoveSeatsParametersOutput {
	return o.ApplyT(func(v *LicensesMoveSeats) LicensesMoveSeatsParametersOutput { return v.Parameters }).(LicensesMoveSeatsParametersOutput)
}

type LicensesMoveSeatsArrayOutput struct{ *pulumi.OutputState }

func (LicensesMoveSeatsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LicensesMoveSeats)(nil)).Elem()
}

func (o LicensesMoveSeatsArrayOutput) ToLicensesMoveSeatsArrayOutput() LicensesMoveSeatsArrayOutput {
	return o
}

func (o LicensesMoveSeatsArrayOutput) ToLicensesMoveSeatsArrayOutputWithContext(ctx context.Context) LicensesMoveSeatsArrayOutput {
	return o
}

func (o LicensesMoveSeatsArrayOutput) Index(i pulumi.IntInput) LicensesMoveSeatsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LicensesMoveSeats {
		return vs[0].([]*LicensesMoveSeats)[vs[1].(int)]
	}).(LicensesMoveSeatsOutput)
}

type LicensesMoveSeatsMapOutput struct{ *pulumi.OutputState }

func (LicensesMoveSeatsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LicensesMoveSeats)(nil)).Elem()
}

func (o LicensesMoveSeatsMapOutput) ToLicensesMoveSeatsMapOutput() LicensesMoveSeatsMapOutput {
	return o
}

func (o LicensesMoveSeatsMapOutput) ToLicensesMoveSeatsMapOutputWithContext(ctx context.Context) LicensesMoveSeatsMapOutput {
	return o
}

func (o LicensesMoveSeatsMapOutput) MapIndex(k pulumi.StringInput) LicensesMoveSeatsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LicensesMoveSeats {
		return vs[0].(map[string]*LicensesMoveSeats)[vs[1].(string)]
	}).(LicensesMoveSeatsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LicensesMoveSeatsInput)(nil)).Elem(), &LicensesMoveSeats{})
	pulumi.RegisterInputType(reflect.TypeOf((*LicensesMoveSeatsArrayInput)(nil)).Elem(), LicensesMoveSeatsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LicensesMoveSeatsMapInput)(nil)).Elem(), LicensesMoveSeatsMap{})
	pulumi.RegisterOutputType(LicensesMoveSeatsOutput{})
	pulumi.RegisterOutputType(LicensesMoveSeatsArrayOutput{})
	pulumi.RegisterOutputType(LicensesMoveSeatsMapOutput{})
}
