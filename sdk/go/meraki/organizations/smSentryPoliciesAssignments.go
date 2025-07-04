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
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := organizations.NewSmSentryPoliciesAssignments(ctx, "example", &organizations.SmSentryPoliciesAssignmentsArgs{
//				OrganizationId: pulumi.String("string"),
//				Parameters: &organizations.SmSentryPoliciesAssignmentsParametersArgs{
//					Items: organizations.SmSentryPoliciesAssignmentsParametersItemArray{
//						&organizations.SmSentryPoliciesAssignmentsParametersItemArgs{
//							NetworkId: pulumi.String("N_24329156"),
//							Policies: organizations.SmSentryPoliciesAssignmentsParametersItemPolicyArray{
//								&organizations.SmSentryPoliciesAssignmentsParametersItemPolicyArgs{
//									GroupPolicyId: pulumi.String("1284392014819"),
//									PolicyId:      pulumi.String("1284392014819"),
//									Scope:         pulumi.String("withAny"),
//									SmNetworkId:   pulumi.String("N_24329156"),
//									Tags: pulumi.StringArray{
//										pulumi.String("tag1"),
//										pulumi.String("tag2"),
//									},
//								},
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsSmSentryPoliciesAssignmentsExample", example)
//			return nil
//		})
//	}
//
// ```
type SmSentryPoliciesAssignments struct {
	pulumi.CustomResourceState

	Item SmSentryPoliciesAssignmentsItemOutput `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput                         `pulumi:"organizationId"`
	Parameters     SmSentryPoliciesAssignmentsParametersOutput `pulumi:"parameters"`
}

// NewSmSentryPoliciesAssignments registers a new resource with the given unique name, arguments, and options.
func NewSmSentryPoliciesAssignments(ctx *pulumi.Context,
	name string, args *SmSentryPoliciesAssignmentsArgs, opts ...pulumi.ResourceOption) (*SmSentryPoliciesAssignments, error) {
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
	var resource SmSentryPoliciesAssignments
	err := ctx.RegisterResource("meraki:organizations/smSentryPoliciesAssignments:SmSentryPoliciesAssignments", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSmSentryPoliciesAssignments gets an existing SmSentryPoliciesAssignments resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSmSentryPoliciesAssignments(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SmSentryPoliciesAssignmentsState, opts ...pulumi.ResourceOption) (*SmSentryPoliciesAssignments, error) {
	var resource SmSentryPoliciesAssignments
	err := ctx.ReadResource("meraki:organizations/smSentryPoliciesAssignments:SmSentryPoliciesAssignments", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SmSentryPoliciesAssignments resources.
type smSentryPoliciesAssignmentsState struct {
	Item *SmSentryPoliciesAssignmentsItem `pulumi:"item"`
	// organizationId path parameter. Organization ID
	OrganizationId *string                                `pulumi:"organizationId"`
	Parameters     *SmSentryPoliciesAssignmentsParameters `pulumi:"parameters"`
}

type SmSentryPoliciesAssignmentsState struct {
	Item SmSentryPoliciesAssignmentsItemPtrInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
	Parameters     SmSentryPoliciesAssignmentsParametersPtrInput
}

func (SmSentryPoliciesAssignmentsState) ElementType() reflect.Type {
	return reflect.TypeOf((*smSentryPoliciesAssignmentsState)(nil)).Elem()
}

type smSentryPoliciesAssignmentsArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string                                `pulumi:"organizationId"`
	Parameters     SmSentryPoliciesAssignmentsParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a SmSentryPoliciesAssignments resource.
type SmSentryPoliciesAssignmentsArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
	Parameters     SmSentryPoliciesAssignmentsParametersInput
}

func (SmSentryPoliciesAssignmentsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*smSentryPoliciesAssignmentsArgs)(nil)).Elem()
}

type SmSentryPoliciesAssignmentsInput interface {
	pulumi.Input

	ToSmSentryPoliciesAssignmentsOutput() SmSentryPoliciesAssignmentsOutput
	ToSmSentryPoliciesAssignmentsOutputWithContext(ctx context.Context) SmSentryPoliciesAssignmentsOutput
}

func (*SmSentryPoliciesAssignments) ElementType() reflect.Type {
	return reflect.TypeOf((**SmSentryPoliciesAssignments)(nil)).Elem()
}

func (i *SmSentryPoliciesAssignments) ToSmSentryPoliciesAssignmentsOutput() SmSentryPoliciesAssignmentsOutput {
	return i.ToSmSentryPoliciesAssignmentsOutputWithContext(context.Background())
}

func (i *SmSentryPoliciesAssignments) ToSmSentryPoliciesAssignmentsOutputWithContext(ctx context.Context) SmSentryPoliciesAssignmentsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmSentryPoliciesAssignmentsOutput)
}

// SmSentryPoliciesAssignmentsArrayInput is an input type that accepts SmSentryPoliciesAssignmentsArray and SmSentryPoliciesAssignmentsArrayOutput values.
// You can construct a concrete instance of `SmSentryPoliciesAssignmentsArrayInput` via:
//
//	SmSentryPoliciesAssignmentsArray{ SmSentryPoliciesAssignmentsArgs{...} }
type SmSentryPoliciesAssignmentsArrayInput interface {
	pulumi.Input

	ToSmSentryPoliciesAssignmentsArrayOutput() SmSentryPoliciesAssignmentsArrayOutput
	ToSmSentryPoliciesAssignmentsArrayOutputWithContext(context.Context) SmSentryPoliciesAssignmentsArrayOutput
}

type SmSentryPoliciesAssignmentsArray []SmSentryPoliciesAssignmentsInput

func (SmSentryPoliciesAssignmentsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmSentryPoliciesAssignments)(nil)).Elem()
}

func (i SmSentryPoliciesAssignmentsArray) ToSmSentryPoliciesAssignmentsArrayOutput() SmSentryPoliciesAssignmentsArrayOutput {
	return i.ToSmSentryPoliciesAssignmentsArrayOutputWithContext(context.Background())
}

func (i SmSentryPoliciesAssignmentsArray) ToSmSentryPoliciesAssignmentsArrayOutputWithContext(ctx context.Context) SmSentryPoliciesAssignmentsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmSentryPoliciesAssignmentsArrayOutput)
}

// SmSentryPoliciesAssignmentsMapInput is an input type that accepts SmSentryPoliciesAssignmentsMap and SmSentryPoliciesAssignmentsMapOutput values.
// You can construct a concrete instance of `SmSentryPoliciesAssignmentsMapInput` via:
//
//	SmSentryPoliciesAssignmentsMap{ "key": SmSentryPoliciesAssignmentsArgs{...} }
type SmSentryPoliciesAssignmentsMapInput interface {
	pulumi.Input

	ToSmSentryPoliciesAssignmentsMapOutput() SmSentryPoliciesAssignmentsMapOutput
	ToSmSentryPoliciesAssignmentsMapOutputWithContext(context.Context) SmSentryPoliciesAssignmentsMapOutput
}

type SmSentryPoliciesAssignmentsMap map[string]SmSentryPoliciesAssignmentsInput

func (SmSentryPoliciesAssignmentsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmSentryPoliciesAssignments)(nil)).Elem()
}

func (i SmSentryPoliciesAssignmentsMap) ToSmSentryPoliciesAssignmentsMapOutput() SmSentryPoliciesAssignmentsMapOutput {
	return i.ToSmSentryPoliciesAssignmentsMapOutputWithContext(context.Background())
}

func (i SmSentryPoliciesAssignmentsMap) ToSmSentryPoliciesAssignmentsMapOutputWithContext(ctx context.Context) SmSentryPoliciesAssignmentsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmSentryPoliciesAssignmentsMapOutput)
}

type SmSentryPoliciesAssignmentsOutput struct{ *pulumi.OutputState }

func (SmSentryPoliciesAssignmentsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SmSentryPoliciesAssignments)(nil)).Elem()
}

func (o SmSentryPoliciesAssignmentsOutput) ToSmSentryPoliciesAssignmentsOutput() SmSentryPoliciesAssignmentsOutput {
	return o
}

func (o SmSentryPoliciesAssignmentsOutput) ToSmSentryPoliciesAssignmentsOutputWithContext(ctx context.Context) SmSentryPoliciesAssignmentsOutput {
	return o
}

func (o SmSentryPoliciesAssignmentsOutput) Item() SmSentryPoliciesAssignmentsItemOutput {
	return o.ApplyT(func(v *SmSentryPoliciesAssignments) SmSentryPoliciesAssignmentsItemOutput { return v.Item }).(SmSentryPoliciesAssignmentsItemOutput)
}

// organizationId path parameter. Organization ID
func (o SmSentryPoliciesAssignmentsOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *SmSentryPoliciesAssignments) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

func (o SmSentryPoliciesAssignmentsOutput) Parameters() SmSentryPoliciesAssignmentsParametersOutput {
	return o.ApplyT(func(v *SmSentryPoliciesAssignments) SmSentryPoliciesAssignmentsParametersOutput { return v.Parameters }).(SmSentryPoliciesAssignmentsParametersOutput)
}

type SmSentryPoliciesAssignmentsArrayOutput struct{ *pulumi.OutputState }

func (SmSentryPoliciesAssignmentsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmSentryPoliciesAssignments)(nil)).Elem()
}

func (o SmSentryPoliciesAssignmentsArrayOutput) ToSmSentryPoliciesAssignmentsArrayOutput() SmSentryPoliciesAssignmentsArrayOutput {
	return o
}

func (o SmSentryPoliciesAssignmentsArrayOutput) ToSmSentryPoliciesAssignmentsArrayOutputWithContext(ctx context.Context) SmSentryPoliciesAssignmentsArrayOutput {
	return o
}

func (o SmSentryPoliciesAssignmentsArrayOutput) Index(i pulumi.IntInput) SmSentryPoliciesAssignmentsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SmSentryPoliciesAssignments {
		return vs[0].([]*SmSentryPoliciesAssignments)[vs[1].(int)]
	}).(SmSentryPoliciesAssignmentsOutput)
}

type SmSentryPoliciesAssignmentsMapOutput struct{ *pulumi.OutputState }

func (SmSentryPoliciesAssignmentsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmSentryPoliciesAssignments)(nil)).Elem()
}

func (o SmSentryPoliciesAssignmentsMapOutput) ToSmSentryPoliciesAssignmentsMapOutput() SmSentryPoliciesAssignmentsMapOutput {
	return o
}

func (o SmSentryPoliciesAssignmentsMapOutput) ToSmSentryPoliciesAssignmentsMapOutputWithContext(ctx context.Context) SmSentryPoliciesAssignmentsMapOutput {
	return o
}

func (o SmSentryPoliciesAssignmentsMapOutput) MapIndex(k pulumi.StringInput) SmSentryPoliciesAssignmentsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SmSentryPoliciesAssignments {
		return vs[0].(map[string]*SmSentryPoliciesAssignments)[vs[1].(string)]
	}).(SmSentryPoliciesAssignmentsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SmSentryPoliciesAssignmentsInput)(nil)).Elem(), &SmSentryPoliciesAssignments{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmSentryPoliciesAssignmentsArrayInput)(nil)).Elem(), SmSentryPoliciesAssignmentsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmSentryPoliciesAssignmentsMapInput)(nil)).Elem(), SmSentryPoliciesAssignmentsMap{})
	pulumi.RegisterOutputType(SmSentryPoliciesAssignmentsOutput{})
	pulumi.RegisterOutputType(SmSentryPoliciesAssignmentsArrayOutput{})
	pulumi.RegisterOutputType(SmSentryPoliciesAssignmentsMapOutput{})
}
