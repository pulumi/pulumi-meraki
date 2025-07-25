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
//			example, err := organizations.NewInventoryOnboardingCloudMonitoringPrepare(ctx, "example", &organizations.InventoryOnboardingCloudMonitoringPrepareArgs{
//				OrganizationId: pulumi.String("string"),
//				Parameters: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersArgs{
//					Devices: organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceArray{
//						&organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceArgs{
//							Sudi: pulumi.String(`          "-----BEGIN CERTIFICATE-----
//	        MIIDyTCCArGgAwIBAgIKBBNXOVCGU1YztjANBgkqhkiG9w0BAQsFADAnMQ4wDAYD
//	        VQQKEwVDaXNjbzEVMBMGA1UEAxMMQUNUMiBTVURJIENBMB4XDTIxMDUzMTEzNTUx
//	        NVoXDTI5MDUxNDIwMjU0MVowbTEpMCcGA1UEBRMgUElEOkM5MjAwTC0yNFAtNEcg
//	        U046SkFFMjUyMjBSMksxDjAMBgNVBAoTBUNpc2NvMRgwFgYDVQQLEw9BQ1QtMiBM
//	        aXRlIFNVREkxFjAUBgNVBAMTDUM5MjAwTC0yNFAtNEcwggEiMA0GCSqGSIb3DQEB
//	        AQUAA4IBDwAwggEKAoIBAQDaUPxW76gT5MdoEAt+UrDFiYA9RYh2iHicDViBEyow
//	        TR1TuP36bHh13X3vtGiDsCD88Ci2TZIqd/EDkkc7v9ipUUYVVH+YDrPt2Aukb1PH
//	        D6K0R+KhgEzRo5x54TlU6oWvjUpwNZUwwdhMWIQaUVkMyZBYNy0jGPLO8jwZhyBg
//	        1Fneybr9pwedGbLrAaz+gdEikB8B4a/fvPjVfL5Ngb4QRjFqWuE+X3nLc0kHedep
//	        6nfgpUNXMlStVm5nIXKP6OjmzfCHPYh9L2Ehs1TrSk1ser9Ofx0ZMVL/jBZR2EIj
//	        OZ8tH6KlX2/B2pbSPIO6kD5c4UA8Cf1SbDJCwJ/kI9ihAgMBAAGjgbAwga0wDgYD
//	        VR0PAQH/BAQDAgXgMAwGA1UdEwEB/wQCMAAwHwYDVR0jBBgwFoAUSNjx8cJw1Vu7
//	        fHMJk6+4uDAD+H8wTQYDVR0RBEYwRKBCBgkrBgEEAQkVAgOgNRMzQ2hpcElEPVVV
//	        VUNNaElGcUVFMklFUUVBQWNBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE9MB0GA1Ud
//	        DgQWBBRdhMkFD/z5hokaQeLbaRsp4hkvbzANBgkqhkiG9w0BAQsFAAOCAQEAMtuh
//	        YpBz4xEZ7YdJsLpw67Q0TTJGnTBRpzAeY1urYDoDz8TSx556XG7z3IRzuED5KVSp
//	        OwmH/iZ+tDfYQ3W3ElWTW93871DkuW4WQIfbnoHg/F7bF0DKYVkD3rpZjyz3NhzH
//	        d7cjTdJXQ85bTAOXDuxKH3qewrXxxOGXgh3I6NUq0UwMTWh84lND7Jl+ZAQkYNS2
//	        iHanTZFQBk3ML0NUb7fKDYGRTZRqwQ/upIO4S6LV1cxH/6V0qbMy3sCSHZoMLrW3
//	        0m3M6yKpe5+VZzHZwmWdUf3Ot+zKjhveK5/YNsMIASdvtvymxUizq2Hr1hvR/kPc
//	        p1vuyWxipU8JfzOh/A==
//	        -----END CERTIFICATE-----
//	        "
//
// `),
//
//							Tunnel: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceTunnelArgs{
//								CertificateName: pulumi.String("DeviceSUDI"),
//								LocalInterface:  pulumi.Int(1),
//								LoopbackNumber:  pulumi.Int(1000),
//								Name:            pulumi.String("MERAKI"),
//							},
//							User: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceUserArgs{
//								Username: pulumi.String("Meraki"),
//							},
//							Vty: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyArgs{
//								AccessList: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListArgs{
//									VtyIn: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyInArgs{
//										Name: pulumi.String("MERAKI_IN"),
//									},
//									VtyOut: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAccessListVtyOutArgs{
//										Name: pulumi.String("MERAKI_OUT"),
//									},
//								},
//								Authentication: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationArgs{
//									Group: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthenticationGroupArgs{
//										Name: pulumi.String(""),
//									},
//								},
//								Authorization: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationArgs{
//									Group: &organizations.InventoryOnboardingCloudMonitoringPrepareParametersDeviceVtyAuthorizationGroupArgs{
//										Name: pulumi.String("MERAKI"),
//									},
//								},
//								EndLineNumber:   pulumi.Int(17),
//								RotaryNumber:    pulumi.Int(50),
//								StartLineNumber: pulumi.Int(16),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiOrganizationsInventoryOnboardingCloudMonitoringPrepareExample", example)
//			return nil
//		})
//	}
//
// ```
type InventoryOnboardingCloudMonitoringPrepare struct {
	pulumi.CustomResourceState

	// Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringPrepare
	Items InventoryOnboardingCloudMonitoringPrepareItemArrayOutput `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringOutput                                       `pulumi:"organizationId"`
	Parameters     InventoryOnboardingCloudMonitoringPrepareParametersOutput `pulumi:"parameters"`
}

// NewInventoryOnboardingCloudMonitoringPrepare registers a new resource with the given unique name, arguments, and options.
func NewInventoryOnboardingCloudMonitoringPrepare(ctx *pulumi.Context,
	name string, args *InventoryOnboardingCloudMonitoringPrepareArgs, opts ...pulumi.ResourceOption) (*InventoryOnboardingCloudMonitoringPrepare, error) {
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
	var resource InventoryOnboardingCloudMonitoringPrepare
	err := ctx.RegisterResource("meraki:organizations/inventoryOnboardingCloudMonitoringPrepare:InventoryOnboardingCloudMonitoringPrepare", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInventoryOnboardingCloudMonitoringPrepare gets an existing InventoryOnboardingCloudMonitoringPrepare resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInventoryOnboardingCloudMonitoringPrepare(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InventoryOnboardingCloudMonitoringPrepareState, opts ...pulumi.ResourceOption) (*InventoryOnboardingCloudMonitoringPrepare, error) {
	var resource InventoryOnboardingCloudMonitoringPrepare
	err := ctx.ReadResource("meraki:organizations/inventoryOnboardingCloudMonitoringPrepare:InventoryOnboardingCloudMonitoringPrepare", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InventoryOnboardingCloudMonitoringPrepare resources.
type inventoryOnboardingCloudMonitoringPrepareState struct {
	// Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringPrepare
	Items []InventoryOnboardingCloudMonitoringPrepareItem `pulumi:"items"`
	// organizationId path parameter. Organization ID
	OrganizationId *string                                              `pulumi:"organizationId"`
	Parameters     *InventoryOnboardingCloudMonitoringPrepareParameters `pulumi:"parameters"`
}

type InventoryOnboardingCloudMonitoringPrepareState struct {
	// Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringPrepare
	Items InventoryOnboardingCloudMonitoringPrepareItemArrayInput
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringPtrInput
	Parameters     InventoryOnboardingCloudMonitoringPrepareParametersPtrInput
}

func (InventoryOnboardingCloudMonitoringPrepareState) ElementType() reflect.Type {
	return reflect.TypeOf((*inventoryOnboardingCloudMonitoringPrepareState)(nil)).Elem()
}

type inventoryOnboardingCloudMonitoringPrepareArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId string                                              `pulumi:"organizationId"`
	Parameters     InventoryOnboardingCloudMonitoringPrepareParameters `pulumi:"parameters"`
}

// The set of arguments for constructing a InventoryOnboardingCloudMonitoringPrepare resource.
type InventoryOnboardingCloudMonitoringPrepareArgs struct {
	// organizationId path parameter. Organization ID
	OrganizationId pulumi.StringInput
	Parameters     InventoryOnboardingCloudMonitoringPrepareParametersInput
}

func (InventoryOnboardingCloudMonitoringPrepareArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*inventoryOnboardingCloudMonitoringPrepareArgs)(nil)).Elem()
}

type InventoryOnboardingCloudMonitoringPrepareInput interface {
	pulumi.Input

	ToInventoryOnboardingCloudMonitoringPrepareOutput() InventoryOnboardingCloudMonitoringPrepareOutput
	ToInventoryOnboardingCloudMonitoringPrepareOutputWithContext(ctx context.Context) InventoryOnboardingCloudMonitoringPrepareOutput
}

func (*InventoryOnboardingCloudMonitoringPrepare) ElementType() reflect.Type {
	return reflect.TypeOf((**InventoryOnboardingCloudMonitoringPrepare)(nil)).Elem()
}

func (i *InventoryOnboardingCloudMonitoringPrepare) ToInventoryOnboardingCloudMonitoringPrepareOutput() InventoryOnboardingCloudMonitoringPrepareOutput {
	return i.ToInventoryOnboardingCloudMonitoringPrepareOutputWithContext(context.Background())
}

func (i *InventoryOnboardingCloudMonitoringPrepare) ToInventoryOnboardingCloudMonitoringPrepareOutputWithContext(ctx context.Context) InventoryOnboardingCloudMonitoringPrepareOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InventoryOnboardingCloudMonitoringPrepareOutput)
}

// InventoryOnboardingCloudMonitoringPrepareArrayInput is an input type that accepts InventoryOnboardingCloudMonitoringPrepareArray and InventoryOnboardingCloudMonitoringPrepareArrayOutput values.
// You can construct a concrete instance of `InventoryOnboardingCloudMonitoringPrepareArrayInput` via:
//
//	InventoryOnboardingCloudMonitoringPrepareArray{ InventoryOnboardingCloudMonitoringPrepareArgs{...} }
type InventoryOnboardingCloudMonitoringPrepareArrayInput interface {
	pulumi.Input

	ToInventoryOnboardingCloudMonitoringPrepareArrayOutput() InventoryOnboardingCloudMonitoringPrepareArrayOutput
	ToInventoryOnboardingCloudMonitoringPrepareArrayOutputWithContext(context.Context) InventoryOnboardingCloudMonitoringPrepareArrayOutput
}

type InventoryOnboardingCloudMonitoringPrepareArray []InventoryOnboardingCloudMonitoringPrepareInput

func (InventoryOnboardingCloudMonitoringPrepareArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InventoryOnboardingCloudMonitoringPrepare)(nil)).Elem()
}

func (i InventoryOnboardingCloudMonitoringPrepareArray) ToInventoryOnboardingCloudMonitoringPrepareArrayOutput() InventoryOnboardingCloudMonitoringPrepareArrayOutput {
	return i.ToInventoryOnboardingCloudMonitoringPrepareArrayOutputWithContext(context.Background())
}

func (i InventoryOnboardingCloudMonitoringPrepareArray) ToInventoryOnboardingCloudMonitoringPrepareArrayOutputWithContext(ctx context.Context) InventoryOnboardingCloudMonitoringPrepareArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InventoryOnboardingCloudMonitoringPrepareArrayOutput)
}

// InventoryOnboardingCloudMonitoringPrepareMapInput is an input type that accepts InventoryOnboardingCloudMonitoringPrepareMap and InventoryOnboardingCloudMonitoringPrepareMapOutput values.
// You can construct a concrete instance of `InventoryOnboardingCloudMonitoringPrepareMapInput` via:
//
//	InventoryOnboardingCloudMonitoringPrepareMap{ "key": InventoryOnboardingCloudMonitoringPrepareArgs{...} }
type InventoryOnboardingCloudMonitoringPrepareMapInput interface {
	pulumi.Input

	ToInventoryOnboardingCloudMonitoringPrepareMapOutput() InventoryOnboardingCloudMonitoringPrepareMapOutput
	ToInventoryOnboardingCloudMonitoringPrepareMapOutputWithContext(context.Context) InventoryOnboardingCloudMonitoringPrepareMapOutput
}

type InventoryOnboardingCloudMonitoringPrepareMap map[string]InventoryOnboardingCloudMonitoringPrepareInput

func (InventoryOnboardingCloudMonitoringPrepareMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InventoryOnboardingCloudMonitoringPrepare)(nil)).Elem()
}

func (i InventoryOnboardingCloudMonitoringPrepareMap) ToInventoryOnboardingCloudMonitoringPrepareMapOutput() InventoryOnboardingCloudMonitoringPrepareMapOutput {
	return i.ToInventoryOnboardingCloudMonitoringPrepareMapOutputWithContext(context.Background())
}

func (i InventoryOnboardingCloudMonitoringPrepareMap) ToInventoryOnboardingCloudMonitoringPrepareMapOutputWithContext(ctx context.Context) InventoryOnboardingCloudMonitoringPrepareMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InventoryOnboardingCloudMonitoringPrepareMapOutput)
}

type InventoryOnboardingCloudMonitoringPrepareOutput struct{ *pulumi.OutputState }

func (InventoryOnboardingCloudMonitoringPrepareOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InventoryOnboardingCloudMonitoringPrepare)(nil)).Elem()
}

func (o InventoryOnboardingCloudMonitoringPrepareOutput) ToInventoryOnboardingCloudMonitoringPrepareOutput() InventoryOnboardingCloudMonitoringPrepareOutput {
	return o
}

func (o InventoryOnboardingCloudMonitoringPrepareOutput) ToInventoryOnboardingCloudMonitoringPrepareOutputWithContext(ctx context.Context) InventoryOnboardingCloudMonitoringPrepareOutput {
	return o
}

// Array of ResponseOrganizationsCreateOrganizationInventoryOnboardingCloudMonitoringPrepare
func (o InventoryOnboardingCloudMonitoringPrepareOutput) Items() InventoryOnboardingCloudMonitoringPrepareItemArrayOutput {
	return o.ApplyT(func(v *InventoryOnboardingCloudMonitoringPrepare) InventoryOnboardingCloudMonitoringPrepareItemArrayOutput {
		return v.Items
	}).(InventoryOnboardingCloudMonitoringPrepareItemArrayOutput)
}

// organizationId path parameter. Organization ID
func (o InventoryOnboardingCloudMonitoringPrepareOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *InventoryOnboardingCloudMonitoringPrepare) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

func (o InventoryOnboardingCloudMonitoringPrepareOutput) Parameters() InventoryOnboardingCloudMonitoringPrepareParametersOutput {
	return o.ApplyT(func(v *InventoryOnboardingCloudMonitoringPrepare) InventoryOnboardingCloudMonitoringPrepareParametersOutput {
		return v.Parameters
	}).(InventoryOnboardingCloudMonitoringPrepareParametersOutput)
}

type InventoryOnboardingCloudMonitoringPrepareArrayOutput struct{ *pulumi.OutputState }

func (InventoryOnboardingCloudMonitoringPrepareArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InventoryOnboardingCloudMonitoringPrepare)(nil)).Elem()
}

func (o InventoryOnboardingCloudMonitoringPrepareArrayOutput) ToInventoryOnboardingCloudMonitoringPrepareArrayOutput() InventoryOnboardingCloudMonitoringPrepareArrayOutput {
	return o
}

func (o InventoryOnboardingCloudMonitoringPrepareArrayOutput) ToInventoryOnboardingCloudMonitoringPrepareArrayOutputWithContext(ctx context.Context) InventoryOnboardingCloudMonitoringPrepareArrayOutput {
	return o
}

func (o InventoryOnboardingCloudMonitoringPrepareArrayOutput) Index(i pulumi.IntInput) InventoryOnboardingCloudMonitoringPrepareOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InventoryOnboardingCloudMonitoringPrepare {
		return vs[0].([]*InventoryOnboardingCloudMonitoringPrepare)[vs[1].(int)]
	}).(InventoryOnboardingCloudMonitoringPrepareOutput)
}

type InventoryOnboardingCloudMonitoringPrepareMapOutput struct{ *pulumi.OutputState }

func (InventoryOnboardingCloudMonitoringPrepareMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InventoryOnboardingCloudMonitoringPrepare)(nil)).Elem()
}

func (o InventoryOnboardingCloudMonitoringPrepareMapOutput) ToInventoryOnboardingCloudMonitoringPrepareMapOutput() InventoryOnboardingCloudMonitoringPrepareMapOutput {
	return o
}

func (o InventoryOnboardingCloudMonitoringPrepareMapOutput) ToInventoryOnboardingCloudMonitoringPrepareMapOutputWithContext(ctx context.Context) InventoryOnboardingCloudMonitoringPrepareMapOutput {
	return o
}

func (o InventoryOnboardingCloudMonitoringPrepareMapOutput) MapIndex(k pulumi.StringInput) InventoryOnboardingCloudMonitoringPrepareOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InventoryOnboardingCloudMonitoringPrepare {
		return vs[0].(map[string]*InventoryOnboardingCloudMonitoringPrepare)[vs[1].(string)]
	}).(InventoryOnboardingCloudMonitoringPrepareOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InventoryOnboardingCloudMonitoringPrepareInput)(nil)).Elem(), &InventoryOnboardingCloudMonitoringPrepare{})
	pulumi.RegisterInputType(reflect.TypeOf((*InventoryOnboardingCloudMonitoringPrepareArrayInput)(nil)).Elem(), InventoryOnboardingCloudMonitoringPrepareArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InventoryOnboardingCloudMonitoringPrepareMapInput)(nil)).Elem(), InventoryOnboardingCloudMonitoringPrepareMap{})
	pulumi.RegisterOutputType(InventoryOnboardingCloudMonitoringPrepareOutput{})
	pulumi.RegisterOutputType(InventoryOnboardingCloudMonitoringPrepareArrayOutput{})
	pulumi.RegisterOutputType(InventoryOnboardingCloudMonitoringPrepareMapOutput{})
}
