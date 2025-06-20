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
//	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/networks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := networks.NewMqttBrokers(ctx, "example", &networks.MqttBrokersArgs{
//				NetworkId: pulumi.String("string"),
//				Parameters: &networks.MqttBrokersParametersArgs{
//					Authentication: &networks.MqttBrokersParametersAuthenticationArgs{
//						Password: pulumi.String("*****"),
//						Username: pulumi.String("milesmeraki"),
//					},
//					Host: pulumi.String("1.2.3.4"),
//					Name: pulumi.String("MQTT_Broker_1"),
//					Port: pulumi.Int(443),
//					Security: &networks.MqttBrokersParametersSecurityArgs{
//						Mode: pulumi.String("tls"),
//						Tls: &networks.MqttBrokersParametersSecurityTlsArgs{
//							CaCertificate:   pulumi.String("*****"),
//							VerifyHostnames: pulumi.Bool(true),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksMqttBrokersExample", example)
//			return nil
//		})
//	}
//
// ```
type MqttBrokers struct {
	pulumi.CustomResourceState

	Item MqttBrokersItemOutput `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringOutput         `pulumi:"networkId"`
	Parameters MqttBrokersParametersOutput `pulumi:"parameters"`
}

// NewMqttBrokers registers a new resource with the given unique name, arguments, and options.
func NewMqttBrokers(ctx *pulumi.Context,
	name string, args *MqttBrokersArgs, opts ...pulumi.ResourceOption) (*MqttBrokers, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	if args.Parameters == nil {
		return nil, errors.New("invalid value for required argument 'Parameters'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MqttBrokers
	err := ctx.RegisterResource("meraki:networks/mqttBrokers:MqttBrokers", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMqttBrokers gets an existing MqttBrokers resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMqttBrokers(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MqttBrokersState, opts ...pulumi.ResourceOption) (*MqttBrokers, error) {
	var resource MqttBrokers
	err := ctx.ReadResource("meraki:networks/mqttBrokers:MqttBrokers", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MqttBrokers resources.
type mqttBrokersState struct {
	Item *MqttBrokersItem `pulumi:"item"`
	// networkId path parameter. Network ID
	NetworkId  *string                `pulumi:"networkId"`
	Parameters *MqttBrokersParameters `pulumi:"parameters"`
}

type MqttBrokersState struct {
	Item MqttBrokersItemPtrInput
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringPtrInput
	Parameters MqttBrokersParametersPtrInput
}

func (MqttBrokersState) ElementType() reflect.Type {
	return reflect.TypeOf((*mqttBrokersState)(nil)).Elem()
}

type mqttBrokersArgs struct {
	// networkId path parameter. Network ID
	NetworkId  string                `pulumi:"networkId"`
	Parameters MqttBrokersParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a MqttBrokers resource.
type MqttBrokersArgs struct {
	// networkId path parameter. Network ID
	NetworkId  pulumi.StringInput
	Parameters MqttBrokersParametersInput
}

func (MqttBrokersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mqttBrokersArgs)(nil)).Elem()
}

type MqttBrokersInput interface {
	pulumi.Input

	ToMqttBrokersOutput() MqttBrokersOutput
	ToMqttBrokersOutputWithContext(ctx context.Context) MqttBrokersOutput
}

func (*MqttBrokers) ElementType() reflect.Type {
	return reflect.TypeOf((**MqttBrokers)(nil)).Elem()
}

func (i *MqttBrokers) ToMqttBrokersOutput() MqttBrokersOutput {
	return i.ToMqttBrokersOutputWithContext(context.Background())
}

func (i *MqttBrokers) ToMqttBrokersOutputWithContext(ctx context.Context) MqttBrokersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MqttBrokersOutput)
}

// MqttBrokersArrayInput is an input type that accepts MqttBrokersArray and MqttBrokersArrayOutput values.
// You can construct a concrete instance of `MqttBrokersArrayInput` via:
//
//	MqttBrokersArray{ MqttBrokersArgs{...} }
type MqttBrokersArrayInput interface {
	pulumi.Input

	ToMqttBrokersArrayOutput() MqttBrokersArrayOutput
	ToMqttBrokersArrayOutputWithContext(context.Context) MqttBrokersArrayOutput
}

type MqttBrokersArray []MqttBrokersInput

func (MqttBrokersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MqttBrokers)(nil)).Elem()
}

func (i MqttBrokersArray) ToMqttBrokersArrayOutput() MqttBrokersArrayOutput {
	return i.ToMqttBrokersArrayOutputWithContext(context.Background())
}

func (i MqttBrokersArray) ToMqttBrokersArrayOutputWithContext(ctx context.Context) MqttBrokersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MqttBrokersArrayOutput)
}

// MqttBrokersMapInput is an input type that accepts MqttBrokersMap and MqttBrokersMapOutput values.
// You can construct a concrete instance of `MqttBrokersMapInput` via:
//
//	MqttBrokersMap{ "key": MqttBrokersArgs{...} }
type MqttBrokersMapInput interface {
	pulumi.Input

	ToMqttBrokersMapOutput() MqttBrokersMapOutput
	ToMqttBrokersMapOutputWithContext(context.Context) MqttBrokersMapOutput
}

type MqttBrokersMap map[string]MqttBrokersInput

func (MqttBrokersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MqttBrokers)(nil)).Elem()
}

func (i MqttBrokersMap) ToMqttBrokersMapOutput() MqttBrokersMapOutput {
	return i.ToMqttBrokersMapOutputWithContext(context.Background())
}

func (i MqttBrokersMap) ToMqttBrokersMapOutputWithContext(ctx context.Context) MqttBrokersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MqttBrokersMapOutput)
}

type MqttBrokersOutput struct{ *pulumi.OutputState }

func (MqttBrokersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MqttBrokers)(nil)).Elem()
}

func (o MqttBrokersOutput) ToMqttBrokersOutput() MqttBrokersOutput {
	return o
}

func (o MqttBrokersOutput) ToMqttBrokersOutputWithContext(ctx context.Context) MqttBrokersOutput {
	return o
}

func (o MqttBrokersOutput) Item() MqttBrokersItemOutput {
	return o.ApplyT(func(v *MqttBrokers) MqttBrokersItemOutput { return v.Item }).(MqttBrokersItemOutput)
}

// networkId path parameter. Network ID
func (o MqttBrokersOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *MqttBrokers) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

func (o MqttBrokersOutput) Parameters() MqttBrokersParametersOutput {
	return o.ApplyT(func(v *MqttBrokers) MqttBrokersParametersOutput { return v.Parameters }).(MqttBrokersParametersOutput)
}

type MqttBrokersArrayOutput struct{ *pulumi.OutputState }

func (MqttBrokersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MqttBrokers)(nil)).Elem()
}

func (o MqttBrokersArrayOutput) ToMqttBrokersArrayOutput() MqttBrokersArrayOutput {
	return o
}

func (o MqttBrokersArrayOutput) ToMqttBrokersArrayOutputWithContext(ctx context.Context) MqttBrokersArrayOutput {
	return o
}

func (o MqttBrokersArrayOutput) Index(i pulumi.IntInput) MqttBrokersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MqttBrokers {
		return vs[0].([]*MqttBrokers)[vs[1].(int)]
	}).(MqttBrokersOutput)
}

type MqttBrokersMapOutput struct{ *pulumi.OutputState }

func (MqttBrokersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MqttBrokers)(nil)).Elem()
}

func (o MqttBrokersMapOutput) ToMqttBrokersMapOutput() MqttBrokersMapOutput {
	return o
}

func (o MqttBrokersMapOutput) ToMqttBrokersMapOutputWithContext(ctx context.Context) MqttBrokersMapOutput {
	return o
}

func (o MqttBrokersMapOutput) MapIndex(k pulumi.StringInput) MqttBrokersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MqttBrokers {
		return vs[0].(map[string]*MqttBrokers)[vs[1].(string)]
	}).(MqttBrokersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MqttBrokersInput)(nil)).Elem(), &MqttBrokers{})
	pulumi.RegisterInputType(reflect.TypeOf((*MqttBrokersArrayInput)(nil)).Elem(), MqttBrokersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MqttBrokersMapInput)(nil)).Elem(), MqttBrokersMap{})
	pulumi.RegisterOutputType(MqttBrokersOutput{})
	pulumi.RegisterOutputType(MqttBrokersArrayOutput{})
	pulumi.RegisterOutputType(MqttBrokersMapOutput{})
}
