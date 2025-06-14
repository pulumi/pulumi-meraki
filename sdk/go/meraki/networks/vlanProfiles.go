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
// $ pulumi import meraki:networks/vlanProfiles:VlanProfiles example "iname,network_id"
// ```
type VlanProfiles struct {
	pulumi.CustomResourceState

	// IName of the VLAN profile
	Iname pulumi.StringOutput `pulumi:"iname"`
	// Boolean indicating the default VLAN Profile for any device that does not have a profile explicitly assigned
	IsDefault pulumi.BoolOutput `pulumi:"isDefault"`
	// Name of the profile, string length must be from 1 to 255 characters
	Name pulumi.StringOutput `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// An array of named VLANs
	VlanGroups VlanProfilesVlanGroupArrayOutput `pulumi:"vlanGroups"`
	// An array of named VLANs
	VlanNames VlanProfilesVlanNameArrayOutput `pulumi:"vlanNames"`
}

// NewVlanProfiles registers a new resource with the given unique name, arguments, and options.
func NewVlanProfiles(ctx *pulumi.Context,
	name string, args *VlanProfilesArgs, opts ...pulumi.ResourceOption) (*VlanProfiles, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Iname == nil {
		return nil, errors.New("invalid value for required argument 'Iname'")
	}
	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VlanProfiles
	err := ctx.RegisterResource("meraki:networks/vlanProfiles:VlanProfiles", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVlanProfiles gets an existing VlanProfiles resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVlanProfiles(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VlanProfilesState, opts ...pulumi.ResourceOption) (*VlanProfiles, error) {
	var resource VlanProfiles
	err := ctx.ReadResource("meraki:networks/vlanProfiles:VlanProfiles", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VlanProfiles resources.
type vlanProfilesState struct {
	// IName of the VLAN profile
	Iname *string `pulumi:"iname"`
	// Boolean indicating the default VLAN Profile for any device that does not have a profile explicitly assigned
	IsDefault *bool `pulumi:"isDefault"`
	// Name of the profile, string length must be from 1 to 255 characters
	Name *string `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// An array of named VLANs
	VlanGroups []VlanProfilesVlanGroup `pulumi:"vlanGroups"`
	// An array of named VLANs
	VlanNames []VlanProfilesVlanName `pulumi:"vlanNames"`
}

type VlanProfilesState struct {
	// IName of the VLAN profile
	Iname pulumi.StringPtrInput
	// Boolean indicating the default VLAN Profile for any device that does not have a profile explicitly assigned
	IsDefault pulumi.BoolPtrInput
	// Name of the profile, string length must be from 1 to 255 characters
	Name pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// An array of named VLANs
	VlanGroups VlanProfilesVlanGroupArrayInput
	// An array of named VLANs
	VlanNames VlanProfilesVlanNameArrayInput
}

func (VlanProfilesState) ElementType() reflect.Type {
	return reflect.TypeOf((*vlanProfilesState)(nil)).Elem()
}

type vlanProfilesArgs struct {
	// IName of the VLAN profile
	Iname string `pulumi:"iname"`
	// Name of the profile, string length must be from 1 to 255 characters
	Name *string `pulumi:"name"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// An array of named VLANs
	VlanGroups []VlanProfilesVlanGroup `pulumi:"vlanGroups"`
	// An array of named VLANs
	VlanNames []VlanProfilesVlanName `pulumi:"vlanNames"`
}

// The set of arguments for constructing a VlanProfiles resource.
type VlanProfilesArgs struct {
	// IName of the VLAN profile
	Iname pulumi.StringInput
	// Name of the profile, string length must be from 1 to 255 characters
	Name pulumi.StringPtrInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// An array of named VLANs
	VlanGroups VlanProfilesVlanGroupArrayInput
	// An array of named VLANs
	VlanNames VlanProfilesVlanNameArrayInput
}

func (VlanProfilesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vlanProfilesArgs)(nil)).Elem()
}

type VlanProfilesInput interface {
	pulumi.Input

	ToVlanProfilesOutput() VlanProfilesOutput
	ToVlanProfilesOutputWithContext(ctx context.Context) VlanProfilesOutput
}

func (*VlanProfiles) ElementType() reflect.Type {
	return reflect.TypeOf((**VlanProfiles)(nil)).Elem()
}

func (i *VlanProfiles) ToVlanProfilesOutput() VlanProfilesOutput {
	return i.ToVlanProfilesOutputWithContext(context.Background())
}

func (i *VlanProfiles) ToVlanProfilesOutputWithContext(ctx context.Context) VlanProfilesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VlanProfilesOutput)
}

// VlanProfilesArrayInput is an input type that accepts VlanProfilesArray and VlanProfilesArrayOutput values.
// You can construct a concrete instance of `VlanProfilesArrayInput` via:
//
//	VlanProfilesArray{ VlanProfilesArgs{...} }
type VlanProfilesArrayInput interface {
	pulumi.Input

	ToVlanProfilesArrayOutput() VlanProfilesArrayOutput
	ToVlanProfilesArrayOutputWithContext(context.Context) VlanProfilesArrayOutput
}

type VlanProfilesArray []VlanProfilesInput

func (VlanProfilesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VlanProfiles)(nil)).Elem()
}

func (i VlanProfilesArray) ToVlanProfilesArrayOutput() VlanProfilesArrayOutput {
	return i.ToVlanProfilesArrayOutputWithContext(context.Background())
}

func (i VlanProfilesArray) ToVlanProfilesArrayOutputWithContext(ctx context.Context) VlanProfilesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VlanProfilesArrayOutput)
}

// VlanProfilesMapInput is an input type that accepts VlanProfilesMap and VlanProfilesMapOutput values.
// You can construct a concrete instance of `VlanProfilesMapInput` via:
//
//	VlanProfilesMap{ "key": VlanProfilesArgs{...} }
type VlanProfilesMapInput interface {
	pulumi.Input

	ToVlanProfilesMapOutput() VlanProfilesMapOutput
	ToVlanProfilesMapOutputWithContext(context.Context) VlanProfilesMapOutput
}

type VlanProfilesMap map[string]VlanProfilesInput

func (VlanProfilesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VlanProfiles)(nil)).Elem()
}

func (i VlanProfilesMap) ToVlanProfilesMapOutput() VlanProfilesMapOutput {
	return i.ToVlanProfilesMapOutputWithContext(context.Background())
}

func (i VlanProfilesMap) ToVlanProfilesMapOutputWithContext(ctx context.Context) VlanProfilesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VlanProfilesMapOutput)
}

type VlanProfilesOutput struct{ *pulumi.OutputState }

func (VlanProfilesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VlanProfiles)(nil)).Elem()
}

func (o VlanProfilesOutput) ToVlanProfilesOutput() VlanProfilesOutput {
	return o
}

func (o VlanProfilesOutput) ToVlanProfilesOutputWithContext(ctx context.Context) VlanProfilesOutput {
	return o
}

// IName of the VLAN profile
func (o VlanProfilesOutput) Iname() pulumi.StringOutput {
	return o.ApplyT(func(v *VlanProfiles) pulumi.StringOutput { return v.Iname }).(pulumi.StringOutput)
}

// Boolean indicating the default VLAN Profile for any device that does not have a profile explicitly assigned
func (o VlanProfilesOutput) IsDefault() pulumi.BoolOutput {
	return o.ApplyT(func(v *VlanProfiles) pulumi.BoolOutput { return v.IsDefault }).(pulumi.BoolOutput)
}

// Name of the profile, string length must be from 1 to 255 characters
func (o VlanProfilesOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VlanProfiles) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// networkId path parameter. Network ID
func (o VlanProfilesOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *VlanProfiles) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// An array of named VLANs
func (o VlanProfilesOutput) VlanGroups() VlanProfilesVlanGroupArrayOutput {
	return o.ApplyT(func(v *VlanProfiles) VlanProfilesVlanGroupArrayOutput { return v.VlanGroups }).(VlanProfilesVlanGroupArrayOutput)
}

// An array of named VLANs
func (o VlanProfilesOutput) VlanNames() VlanProfilesVlanNameArrayOutput {
	return o.ApplyT(func(v *VlanProfiles) VlanProfilesVlanNameArrayOutput { return v.VlanNames }).(VlanProfilesVlanNameArrayOutput)
}

type VlanProfilesArrayOutput struct{ *pulumi.OutputState }

func (VlanProfilesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VlanProfiles)(nil)).Elem()
}

func (o VlanProfilesArrayOutput) ToVlanProfilesArrayOutput() VlanProfilesArrayOutput {
	return o
}

func (o VlanProfilesArrayOutput) ToVlanProfilesArrayOutputWithContext(ctx context.Context) VlanProfilesArrayOutput {
	return o
}

func (o VlanProfilesArrayOutput) Index(i pulumi.IntInput) VlanProfilesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VlanProfiles {
		return vs[0].([]*VlanProfiles)[vs[1].(int)]
	}).(VlanProfilesOutput)
}

type VlanProfilesMapOutput struct{ *pulumi.OutputState }

func (VlanProfilesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VlanProfiles)(nil)).Elem()
}

func (o VlanProfilesMapOutput) ToVlanProfilesMapOutput() VlanProfilesMapOutput {
	return o
}

func (o VlanProfilesMapOutput) ToVlanProfilesMapOutputWithContext(ctx context.Context) VlanProfilesMapOutput {
	return o
}

func (o VlanProfilesMapOutput) MapIndex(k pulumi.StringInput) VlanProfilesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VlanProfiles {
		return vs[0].(map[string]*VlanProfiles)[vs[1].(string)]
	}).(VlanProfilesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VlanProfilesInput)(nil)).Elem(), &VlanProfiles{})
	pulumi.RegisterInputType(reflect.TypeOf((*VlanProfilesArrayInput)(nil)).Elem(), VlanProfilesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VlanProfilesMapInput)(nil)).Elem(), VlanProfilesMap{})
	pulumi.RegisterOutputType(VlanProfilesOutput{})
	pulumi.RegisterOutputType(VlanProfilesArrayOutput{})
	pulumi.RegisterOutputType(VlanProfilesMapOutput{})
}
