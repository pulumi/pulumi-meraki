// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devices

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/devices"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := devices.NewSwitchPorts(ctx, "example", &devices.SwitchPortsArgs{
//				AccessPolicyNumber:      pulumi.Int(2),
//				AccessPolicyType:        pulumi.String("Sticky MAC allow list"),
//				AdaptivePolicyGroupId:   pulumi.String("123"),
//				AllowedVlans:            pulumi.String("1,3,5-10"),
//				DaiTrusted:              pulumi.Bool(false),
//				Enabled:                 pulumi.Bool(true),
//				FlexibleStackingEnabled: pulumi.Bool(true),
//				IsolationEnabled:        pulumi.Bool(false),
//				LinkNegotiation:         pulumi.String("Auto negotiate"),
//				MacAllowLists: pulumi.StringArray{
//					pulumi.String("34:56:fe:ce:8e:b0"),
//					pulumi.String("34:56:fe:ce:8e:b1"),
//				},
//				Name:           pulumi.String("My switch port"),
//				PeerSgtCapable: pulumi.Bool(false),
//				PoeEnabled:     pulumi.Bool(true),
//				PortId:         pulumi.String("string"),
//				PortScheduleId: pulumi.String("1234"),
//				Profile: &devices.SwitchPortsProfileArgs{
//					Enabled: pulumi.Bool(false),
//					Id:      pulumi.String("1284392014819"),
//					Iname:   pulumi.String("iname"),
//				},
//				RstpEnabled: pulumi.Bool(true),
//				Serial:      pulumi.String("string"),
//				StickyMacAllowLists: pulumi.StringArray{
//					pulumi.String("34:56:fe:ce:8e:b0"),
//					pulumi.String("34:56:fe:ce:8e:b1"),
//				},
//				StickyMacAllowListLimit: pulumi.Int(5),
//				StormControlEnabled:     pulumi.Bool(true),
//				StpGuard:                pulumi.String("disabled"),
//				Tags: pulumi.StringArray{
//					pulumi.String("tag1"),
//					pulumi.String("tag2"),
//				},
//				Type:      pulumi.String("access"),
//				Udld:      pulumi.String("Alert only"),
//				Vlan:      pulumi.Int(10),
//				VoiceVlan: pulumi.Int(20),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiDevicesSwitchPortsExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:devices/switchPorts:SwitchPorts example "port_id,serial"
// ```
type SwitchPorts struct {
	pulumi.CustomResourceState

	// The number of a custom access policy to configure on the switch port. Only applicable when 'accessPolicyType' is 'Custom access policy'.
	AccessPolicyNumber pulumi.IntOutput `pulumi:"accessPolicyNumber"`
	// The type of the access policy of the switch port. Only applicable to access ports. Can be one of 'Open', 'Custom access policy', 'MAC allow list' or 'Sticky MAC allow list'.
	AccessPolicyType pulumi.StringOutput `pulumi:"accessPolicyType"`
	// The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
	AdaptivePolicyGroupId pulumi.StringOutput `pulumi:"adaptivePolicyGroupId"`
	// The VLANs allowed on the switch port. Only applicable to trunk ports.
	AllowedVlans pulumi.StringOutput `pulumi:"allowedVlans"`
	// If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
	DaiTrusted pulumi.BoolOutput `pulumi:"daiTrusted"`
	// The status of the switch port.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
	FlexibleStackingEnabled pulumi.BoolOutput `pulumi:"flexibleStackingEnabled"`
	// The isolation status of the switch port.
	IsolationEnabled pulumi.BoolOutput `pulumi:"isolationEnabled"`
	// The link speed for the switch port.
	LinkNegotiation pulumi.StringOutput `pulumi:"linkNegotiation"`
	// Available link speeds for the switch port.
	LinkNegotiationCapabilities pulumi.StringArrayOutput `pulumi:"linkNegotiationCapabilities"`
	// Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when 'accessPolicyType' is 'MAC allow list'.
	MacAllowLists pulumi.StringArrayOutput `pulumi:"macAllowLists"`
	// Port mirror
	Mirror SwitchPortsMirrorOutput `pulumi:"mirror"`
	// Expansion module
	Module SwitchPortsModuleOutput `pulumi:"module"`
	// The name of the switch port.
	Name pulumi.StringOutput `pulumi:"name"`
	// If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
	PeerSgtCapable pulumi.BoolOutput `pulumi:"peerSgtCapable"`
	// The PoE status of the switch port.
	PoeEnabled pulumi.BoolOutput `pulumi:"poeEnabled"`
	// The identifier of the switch port.
	PortId pulumi.StringOutput `pulumi:"portId"`
	// The ID of the port schedule. A value of null will clear the port schedule.
	PortScheduleId pulumi.StringOutput `pulumi:"portScheduleId"`
	// Profile attributes
	Profile SwitchPortsProfileOutput `pulumi:"profile"`
	// The rapid spanning tree protocol status.
	RstpEnabled pulumi.BoolOutput `pulumi:"rstpEnabled"`
	// serial path parameter.
	Serial pulumi.StringOutput `pulumi:"serial"`
	// The maximum number of MAC addresses for sticky MAC allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
	StickyMacAllowListLimit pulumi.IntOutput `pulumi:"stickyMacAllowListLimit"`
	// The initial list of MAC addresses for sticky Mac allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
	StickyMacAllowLists pulumi.StringArrayOutput `pulumi:"stickyMacAllowLists"`
	// The storm control status of the switch port.
	StormControlEnabled pulumi.BoolOutput `pulumi:"stormControlEnabled"`
	// The state of the STP guard ('disabled', 'root guard', 'bpdu guard' or 'loop guard').
	StpGuard pulumi.StringOutput `pulumi:"stpGuard"`
	// The list of tags of the switch port.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The type of the switch port ('trunk' or 'access').
	Type pulumi.StringOutput `pulumi:"type"`
	// The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
	Udld pulumi.StringOutput `pulumi:"udld"`
	// The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
	Vlan pulumi.IntOutput `pulumi:"vlan"`
	// The voice VLAN of the switch port. Only applicable to access ports.
	VoiceVlan pulumi.IntOutput `pulumi:"voiceVlan"`
}

// NewSwitchPorts registers a new resource with the given unique name, arguments, and options.
func NewSwitchPorts(ctx *pulumi.Context,
	name string, args *SwitchPortsArgs, opts ...pulumi.ResourceOption) (*SwitchPorts, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PortId == nil {
		return nil, errors.New("invalid value for required argument 'PortId'")
	}
	if args.Serial == nil {
		return nil, errors.New("invalid value for required argument 'Serial'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SwitchPorts
	err := ctx.RegisterResource("meraki:devices/switchPorts:SwitchPorts", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSwitchPorts gets an existing SwitchPorts resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSwitchPorts(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SwitchPortsState, opts ...pulumi.ResourceOption) (*SwitchPorts, error) {
	var resource SwitchPorts
	err := ctx.ReadResource("meraki:devices/switchPorts:SwitchPorts", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SwitchPorts resources.
type switchPortsState struct {
	// The number of a custom access policy to configure on the switch port. Only applicable when 'accessPolicyType' is 'Custom access policy'.
	AccessPolicyNumber *int `pulumi:"accessPolicyNumber"`
	// The type of the access policy of the switch port. Only applicable to access ports. Can be one of 'Open', 'Custom access policy', 'MAC allow list' or 'Sticky MAC allow list'.
	AccessPolicyType *string `pulumi:"accessPolicyType"`
	// The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
	AdaptivePolicyGroupId *string `pulumi:"adaptivePolicyGroupId"`
	// The VLANs allowed on the switch port. Only applicable to trunk ports.
	AllowedVlans *string `pulumi:"allowedVlans"`
	// If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
	DaiTrusted *bool `pulumi:"daiTrusted"`
	// The status of the switch port.
	Enabled *bool `pulumi:"enabled"`
	// For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
	FlexibleStackingEnabled *bool `pulumi:"flexibleStackingEnabled"`
	// The isolation status of the switch port.
	IsolationEnabled *bool `pulumi:"isolationEnabled"`
	// The link speed for the switch port.
	LinkNegotiation *string `pulumi:"linkNegotiation"`
	// Available link speeds for the switch port.
	LinkNegotiationCapabilities []string `pulumi:"linkNegotiationCapabilities"`
	// Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when 'accessPolicyType' is 'MAC allow list'.
	MacAllowLists []string `pulumi:"macAllowLists"`
	// Port mirror
	Mirror *SwitchPortsMirror `pulumi:"mirror"`
	// Expansion module
	Module *SwitchPortsModule `pulumi:"module"`
	// The name of the switch port.
	Name *string `pulumi:"name"`
	// If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
	PeerSgtCapable *bool `pulumi:"peerSgtCapable"`
	// The PoE status of the switch port.
	PoeEnabled *bool `pulumi:"poeEnabled"`
	// The identifier of the switch port.
	PortId *string `pulumi:"portId"`
	// The ID of the port schedule. A value of null will clear the port schedule.
	PortScheduleId *string `pulumi:"portScheduleId"`
	// Profile attributes
	Profile *SwitchPortsProfile `pulumi:"profile"`
	// The rapid spanning tree protocol status.
	RstpEnabled *bool `pulumi:"rstpEnabled"`
	// serial path parameter.
	Serial *string `pulumi:"serial"`
	// The maximum number of MAC addresses for sticky MAC allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
	StickyMacAllowListLimit *int `pulumi:"stickyMacAllowListLimit"`
	// The initial list of MAC addresses for sticky Mac allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
	StickyMacAllowLists []string `pulumi:"stickyMacAllowLists"`
	// The storm control status of the switch port.
	StormControlEnabled *bool `pulumi:"stormControlEnabled"`
	// The state of the STP guard ('disabled', 'root guard', 'bpdu guard' or 'loop guard').
	StpGuard *string `pulumi:"stpGuard"`
	// The list of tags of the switch port.
	Tags []string `pulumi:"tags"`
	// The type of the switch port ('trunk' or 'access').
	Type *string `pulumi:"type"`
	// The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
	Udld *string `pulumi:"udld"`
	// The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
	Vlan *int `pulumi:"vlan"`
	// The voice VLAN of the switch port. Only applicable to access ports.
	VoiceVlan *int `pulumi:"voiceVlan"`
}

type SwitchPortsState struct {
	// The number of a custom access policy to configure on the switch port. Only applicable when 'accessPolicyType' is 'Custom access policy'.
	AccessPolicyNumber pulumi.IntPtrInput
	// The type of the access policy of the switch port. Only applicable to access ports. Can be one of 'Open', 'Custom access policy', 'MAC allow list' or 'Sticky MAC allow list'.
	AccessPolicyType pulumi.StringPtrInput
	// The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
	AdaptivePolicyGroupId pulumi.StringPtrInput
	// The VLANs allowed on the switch port. Only applicable to trunk ports.
	AllowedVlans pulumi.StringPtrInput
	// If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
	DaiTrusted pulumi.BoolPtrInput
	// The status of the switch port.
	Enabled pulumi.BoolPtrInput
	// For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
	FlexibleStackingEnabled pulumi.BoolPtrInput
	// The isolation status of the switch port.
	IsolationEnabled pulumi.BoolPtrInput
	// The link speed for the switch port.
	LinkNegotiation pulumi.StringPtrInput
	// Available link speeds for the switch port.
	LinkNegotiationCapabilities pulumi.StringArrayInput
	// Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when 'accessPolicyType' is 'MAC allow list'.
	MacAllowLists pulumi.StringArrayInput
	// Port mirror
	Mirror SwitchPortsMirrorPtrInput
	// Expansion module
	Module SwitchPortsModulePtrInput
	// The name of the switch port.
	Name pulumi.StringPtrInput
	// If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
	PeerSgtCapable pulumi.BoolPtrInput
	// The PoE status of the switch port.
	PoeEnabled pulumi.BoolPtrInput
	// The identifier of the switch port.
	PortId pulumi.StringPtrInput
	// The ID of the port schedule. A value of null will clear the port schedule.
	PortScheduleId pulumi.StringPtrInput
	// Profile attributes
	Profile SwitchPortsProfilePtrInput
	// The rapid spanning tree protocol status.
	RstpEnabled pulumi.BoolPtrInput
	// serial path parameter.
	Serial pulumi.StringPtrInput
	// The maximum number of MAC addresses for sticky MAC allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
	StickyMacAllowListLimit pulumi.IntPtrInput
	// The initial list of MAC addresses for sticky Mac allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
	StickyMacAllowLists pulumi.StringArrayInput
	// The storm control status of the switch port.
	StormControlEnabled pulumi.BoolPtrInput
	// The state of the STP guard ('disabled', 'root guard', 'bpdu guard' or 'loop guard').
	StpGuard pulumi.StringPtrInput
	// The list of tags of the switch port.
	Tags pulumi.StringArrayInput
	// The type of the switch port ('trunk' or 'access').
	Type pulumi.StringPtrInput
	// The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
	Udld pulumi.StringPtrInput
	// The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
	Vlan pulumi.IntPtrInput
	// The voice VLAN of the switch port. Only applicable to access ports.
	VoiceVlan pulumi.IntPtrInput
}

func (SwitchPortsState) ElementType() reflect.Type {
	return reflect.TypeOf((*switchPortsState)(nil)).Elem()
}

type switchPortsArgs struct {
	// The number of a custom access policy to configure on the switch port. Only applicable when 'accessPolicyType' is 'Custom access policy'.
	AccessPolicyNumber *int `pulumi:"accessPolicyNumber"`
	// The type of the access policy of the switch port. Only applicable to access ports. Can be one of 'Open', 'Custom access policy', 'MAC allow list' or 'Sticky MAC allow list'.
	AccessPolicyType *string `pulumi:"accessPolicyType"`
	// The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
	AdaptivePolicyGroupId *string `pulumi:"adaptivePolicyGroupId"`
	// The VLANs allowed on the switch port. Only applicable to trunk ports.
	AllowedVlans *string `pulumi:"allowedVlans"`
	// If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
	DaiTrusted *bool `pulumi:"daiTrusted"`
	// The status of the switch port.
	Enabled *bool `pulumi:"enabled"`
	// For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
	FlexibleStackingEnabled *bool `pulumi:"flexibleStackingEnabled"`
	// The isolation status of the switch port.
	IsolationEnabled *bool `pulumi:"isolationEnabled"`
	// The link speed for the switch port.
	LinkNegotiation *string `pulumi:"linkNegotiation"`
	// Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when 'accessPolicyType' is 'MAC allow list'.
	MacAllowLists []string `pulumi:"macAllowLists"`
	// The name of the switch port.
	Name *string `pulumi:"name"`
	// If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
	PeerSgtCapable *bool `pulumi:"peerSgtCapable"`
	// The PoE status of the switch port.
	PoeEnabled *bool `pulumi:"poeEnabled"`
	// The identifier of the switch port.
	PortId string `pulumi:"portId"`
	// The ID of the port schedule. A value of null will clear the port schedule.
	PortScheduleId *string `pulumi:"portScheduleId"`
	// Profile attributes
	Profile *SwitchPortsProfile `pulumi:"profile"`
	// The rapid spanning tree protocol status.
	RstpEnabled *bool `pulumi:"rstpEnabled"`
	// serial path parameter.
	Serial string `pulumi:"serial"`
	// The maximum number of MAC addresses for sticky MAC allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
	StickyMacAllowListLimit *int `pulumi:"stickyMacAllowListLimit"`
	// The initial list of MAC addresses for sticky Mac allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
	StickyMacAllowLists []string `pulumi:"stickyMacAllowLists"`
	// The storm control status of the switch port.
	StormControlEnabled *bool `pulumi:"stormControlEnabled"`
	// The state of the STP guard ('disabled', 'root guard', 'bpdu guard' or 'loop guard').
	StpGuard *string `pulumi:"stpGuard"`
	// The list of tags of the switch port.
	Tags []string `pulumi:"tags"`
	// The type of the switch port ('trunk' or 'access').
	Type *string `pulumi:"type"`
	// The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
	Udld *string `pulumi:"udld"`
	// The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
	Vlan *int `pulumi:"vlan"`
	// The voice VLAN of the switch port. Only applicable to access ports.
	VoiceVlan *int `pulumi:"voiceVlan"`
}

// The set of arguments for constructing a SwitchPorts resource.
type SwitchPortsArgs struct {
	// The number of a custom access policy to configure on the switch port. Only applicable when 'accessPolicyType' is 'Custom access policy'.
	AccessPolicyNumber pulumi.IntPtrInput
	// The type of the access policy of the switch port. Only applicable to access ports. Can be one of 'Open', 'Custom access policy', 'MAC allow list' or 'Sticky MAC allow list'.
	AccessPolicyType pulumi.StringPtrInput
	// The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
	AdaptivePolicyGroupId pulumi.StringPtrInput
	// The VLANs allowed on the switch port. Only applicable to trunk ports.
	AllowedVlans pulumi.StringPtrInput
	// If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
	DaiTrusted pulumi.BoolPtrInput
	// The status of the switch port.
	Enabled pulumi.BoolPtrInput
	// For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
	FlexibleStackingEnabled pulumi.BoolPtrInput
	// The isolation status of the switch port.
	IsolationEnabled pulumi.BoolPtrInput
	// The link speed for the switch port.
	LinkNegotiation pulumi.StringPtrInput
	// Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when 'accessPolicyType' is 'MAC allow list'.
	MacAllowLists pulumi.StringArrayInput
	// The name of the switch port.
	Name pulumi.StringPtrInput
	// If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
	PeerSgtCapable pulumi.BoolPtrInput
	// The PoE status of the switch port.
	PoeEnabled pulumi.BoolPtrInput
	// The identifier of the switch port.
	PortId pulumi.StringInput
	// The ID of the port schedule. A value of null will clear the port schedule.
	PortScheduleId pulumi.StringPtrInput
	// Profile attributes
	Profile SwitchPortsProfilePtrInput
	// The rapid spanning tree protocol status.
	RstpEnabled pulumi.BoolPtrInput
	// serial path parameter.
	Serial pulumi.StringInput
	// The maximum number of MAC addresses for sticky MAC allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
	StickyMacAllowListLimit pulumi.IntPtrInput
	// The initial list of MAC addresses for sticky Mac allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
	StickyMacAllowLists pulumi.StringArrayInput
	// The storm control status of the switch port.
	StormControlEnabled pulumi.BoolPtrInput
	// The state of the STP guard ('disabled', 'root guard', 'bpdu guard' or 'loop guard').
	StpGuard pulumi.StringPtrInput
	// The list of tags of the switch port.
	Tags pulumi.StringArrayInput
	// The type of the switch port ('trunk' or 'access').
	Type pulumi.StringPtrInput
	// The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
	Udld pulumi.StringPtrInput
	// The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
	Vlan pulumi.IntPtrInput
	// The voice VLAN of the switch port. Only applicable to access ports.
	VoiceVlan pulumi.IntPtrInput
}

func (SwitchPortsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*switchPortsArgs)(nil)).Elem()
}

type SwitchPortsInput interface {
	pulumi.Input

	ToSwitchPortsOutput() SwitchPortsOutput
	ToSwitchPortsOutputWithContext(ctx context.Context) SwitchPortsOutput
}

func (*SwitchPorts) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchPorts)(nil)).Elem()
}

func (i *SwitchPorts) ToSwitchPortsOutput() SwitchPortsOutput {
	return i.ToSwitchPortsOutputWithContext(context.Background())
}

func (i *SwitchPorts) ToSwitchPortsOutputWithContext(ctx context.Context) SwitchPortsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchPortsOutput)
}

// SwitchPortsArrayInput is an input type that accepts SwitchPortsArray and SwitchPortsArrayOutput values.
// You can construct a concrete instance of `SwitchPortsArrayInput` via:
//
//	SwitchPortsArray{ SwitchPortsArgs{...} }
type SwitchPortsArrayInput interface {
	pulumi.Input

	ToSwitchPortsArrayOutput() SwitchPortsArrayOutput
	ToSwitchPortsArrayOutputWithContext(context.Context) SwitchPortsArrayOutput
}

type SwitchPortsArray []SwitchPortsInput

func (SwitchPortsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchPorts)(nil)).Elem()
}

func (i SwitchPortsArray) ToSwitchPortsArrayOutput() SwitchPortsArrayOutput {
	return i.ToSwitchPortsArrayOutputWithContext(context.Background())
}

func (i SwitchPortsArray) ToSwitchPortsArrayOutputWithContext(ctx context.Context) SwitchPortsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchPortsArrayOutput)
}

// SwitchPortsMapInput is an input type that accepts SwitchPortsMap and SwitchPortsMapOutput values.
// You can construct a concrete instance of `SwitchPortsMapInput` via:
//
//	SwitchPortsMap{ "key": SwitchPortsArgs{...} }
type SwitchPortsMapInput interface {
	pulumi.Input

	ToSwitchPortsMapOutput() SwitchPortsMapOutput
	ToSwitchPortsMapOutputWithContext(context.Context) SwitchPortsMapOutput
}

type SwitchPortsMap map[string]SwitchPortsInput

func (SwitchPortsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchPorts)(nil)).Elem()
}

func (i SwitchPortsMap) ToSwitchPortsMapOutput() SwitchPortsMapOutput {
	return i.ToSwitchPortsMapOutputWithContext(context.Background())
}

func (i SwitchPortsMap) ToSwitchPortsMapOutputWithContext(ctx context.Context) SwitchPortsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SwitchPortsMapOutput)
}

type SwitchPortsOutput struct{ *pulumi.OutputState }

func (SwitchPortsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SwitchPorts)(nil)).Elem()
}

func (o SwitchPortsOutput) ToSwitchPortsOutput() SwitchPortsOutput {
	return o
}

func (o SwitchPortsOutput) ToSwitchPortsOutputWithContext(ctx context.Context) SwitchPortsOutput {
	return o
}

// The number of a custom access policy to configure on the switch port. Only applicable when 'accessPolicyType' is 'Custom access policy'.
func (o SwitchPortsOutput) AccessPolicyNumber() pulumi.IntOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.IntOutput { return v.AccessPolicyNumber }).(pulumi.IntOutput)
}

// The type of the access policy of the switch port. Only applicable to access ports. Can be one of 'Open', 'Custom access policy', 'MAC allow list' or 'Sticky MAC allow list'.
func (o SwitchPortsOutput) AccessPolicyType() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.AccessPolicyType }).(pulumi.StringOutput)
}

// The adaptive policy group ID that will be used to tag traffic through this switch port. This ID must pre-exist during the configuration, else needs to be created using adaptivePolicy/groups API. Cannot be applied to a port on a switch bound to profile.
func (o SwitchPortsOutput) AdaptivePolicyGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.AdaptivePolicyGroupId }).(pulumi.StringOutput)
}

// The VLANs allowed on the switch port. Only applicable to trunk ports.
func (o SwitchPortsOutput) AllowedVlans() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.AllowedVlans }).(pulumi.StringOutput)
}

// If true, ARP packets for this port will be considered trusted, and Dynamic ARP Inspection will allow the traffic.
func (o SwitchPortsOutput) DaiTrusted() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.BoolOutput { return v.DaiTrusted }).(pulumi.BoolOutput)
}

// The status of the switch port.
func (o SwitchPortsOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// For supported switches (e.g. MS420/MS425), whether or not the port has flexible stacking enabled.
func (o SwitchPortsOutput) FlexibleStackingEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.BoolOutput { return v.FlexibleStackingEnabled }).(pulumi.BoolOutput)
}

// The isolation status of the switch port.
func (o SwitchPortsOutput) IsolationEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.BoolOutput { return v.IsolationEnabled }).(pulumi.BoolOutput)
}

// The link speed for the switch port.
func (o SwitchPortsOutput) LinkNegotiation() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.LinkNegotiation }).(pulumi.StringOutput)
}

// Available link speeds for the switch port.
func (o SwitchPortsOutput) LinkNegotiationCapabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringArrayOutput { return v.LinkNegotiationCapabilities }).(pulumi.StringArrayOutput)
}

// Only devices with MAC addresses specified in this list will have access to this port. Up to 20 MAC addresses can be defined. Only applicable when 'accessPolicyType' is 'MAC allow list'.
func (o SwitchPortsOutput) MacAllowLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringArrayOutput { return v.MacAllowLists }).(pulumi.StringArrayOutput)
}

// Port mirror
func (o SwitchPortsOutput) Mirror() SwitchPortsMirrorOutput {
	return o.ApplyT(func(v *SwitchPorts) SwitchPortsMirrorOutput { return v.Mirror }).(SwitchPortsMirrorOutput)
}

// Expansion module
func (o SwitchPortsOutput) Module() SwitchPortsModuleOutput {
	return o.ApplyT(func(v *SwitchPorts) SwitchPortsModuleOutput { return v.Module }).(SwitchPortsModuleOutput)
}

// The name of the switch port.
func (o SwitchPortsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// If true, Peer SGT is enabled for traffic through this switch port. Applicable to trunk port only, not access port. Cannot be applied to a port on a switch bound to profile.
func (o SwitchPortsOutput) PeerSgtCapable() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.BoolOutput { return v.PeerSgtCapable }).(pulumi.BoolOutput)
}

// The PoE status of the switch port.
func (o SwitchPortsOutput) PoeEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.BoolOutput { return v.PoeEnabled }).(pulumi.BoolOutput)
}

// The identifier of the switch port.
func (o SwitchPortsOutput) PortId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.PortId }).(pulumi.StringOutput)
}

// The ID of the port schedule. A value of null will clear the port schedule.
func (o SwitchPortsOutput) PortScheduleId() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.PortScheduleId }).(pulumi.StringOutput)
}

// Profile attributes
func (o SwitchPortsOutput) Profile() SwitchPortsProfileOutput {
	return o.ApplyT(func(v *SwitchPorts) SwitchPortsProfileOutput { return v.Profile }).(SwitchPortsProfileOutput)
}

// The rapid spanning tree protocol status.
func (o SwitchPortsOutput) RstpEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.BoolOutput { return v.RstpEnabled }).(pulumi.BoolOutput)
}

// serial path parameter.
func (o SwitchPortsOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

// The maximum number of MAC addresses for sticky MAC allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
func (o SwitchPortsOutput) StickyMacAllowListLimit() pulumi.IntOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.IntOutput { return v.StickyMacAllowListLimit }).(pulumi.IntOutput)
}

// The initial list of MAC addresses for sticky Mac allow list. Only applicable when 'accessPolicyType' is 'Sticky MAC allow list'.
func (o SwitchPortsOutput) StickyMacAllowLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringArrayOutput { return v.StickyMacAllowLists }).(pulumi.StringArrayOutput)
}

// The storm control status of the switch port.
func (o SwitchPortsOutput) StormControlEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.BoolOutput { return v.StormControlEnabled }).(pulumi.BoolOutput)
}

// The state of the STP guard ('disabled', 'root guard', 'bpdu guard' or 'loop guard').
func (o SwitchPortsOutput) StpGuard() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.StpGuard }).(pulumi.StringOutput)
}

// The list of tags of the switch port.
func (o SwitchPortsOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// The type of the switch port ('trunk' or 'access').
func (o SwitchPortsOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The action to take when Unidirectional Link is detected (Alert only, Enforce). Default configuration is Alert only.
func (o SwitchPortsOutput) Udld() pulumi.StringOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.StringOutput { return v.Udld }).(pulumi.StringOutput)
}

// The VLAN of the switch port. For a trunk port, this is the native VLAN. A null value will clear the value set for trunk ports.
func (o SwitchPortsOutput) Vlan() pulumi.IntOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.IntOutput { return v.Vlan }).(pulumi.IntOutput)
}

// The voice VLAN of the switch port. Only applicable to access ports.
func (o SwitchPortsOutput) VoiceVlan() pulumi.IntOutput {
	return o.ApplyT(func(v *SwitchPorts) pulumi.IntOutput { return v.VoiceVlan }).(pulumi.IntOutput)
}

type SwitchPortsArrayOutput struct{ *pulumi.OutputState }

func (SwitchPortsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SwitchPorts)(nil)).Elem()
}

func (o SwitchPortsArrayOutput) ToSwitchPortsArrayOutput() SwitchPortsArrayOutput {
	return o
}

func (o SwitchPortsArrayOutput) ToSwitchPortsArrayOutputWithContext(ctx context.Context) SwitchPortsArrayOutput {
	return o
}

func (o SwitchPortsArrayOutput) Index(i pulumi.IntInput) SwitchPortsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SwitchPorts {
		return vs[0].([]*SwitchPorts)[vs[1].(int)]
	}).(SwitchPortsOutput)
}

type SwitchPortsMapOutput struct{ *pulumi.OutputState }

func (SwitchPortsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SwitchPorts)(nil)).Elem()
}

func (o SwitchPortsMapOutput) ToSwitchPortsMapOutput() SwitchPortsMapOutput {
	return o
}

func (o SwitchPortsMapOutput) ToSwitchPortsMapOutputWithContext(ctx context.Context) SwitchPortsMapOutput {
	return o
}

func (o SwitchPortsMapOutput) MapIndex(k pulumi.StringInput) SwitchPortsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SwitchPorts {
		return vs[0].(map[string]*SwitchPorts)[vs[1].(string)]
	}).(SwitchPortsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchPortsInput)(nil)).Elem(), &SwitchPorts{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchPortsArrayInput)(nil)).Elem(), SwitchPortsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SwitchPortsMapInput)(nil)).Elem(), SwitchPortsMap{})
	pulumi.RegisterOutputType(SwitchPortsOutput{})
	pulumi.RegisterOutputType(SwitchPortsArrayOutput{})
	pulumi.RegisterOutputType(SwitchPortsMapOutput{})
}
