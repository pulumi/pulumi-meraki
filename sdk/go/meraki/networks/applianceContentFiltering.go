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
//			example, err := networks.NewApplianceContentFiltering(ctx, "example", &networks.ApplianceContentFilteringArgs{
//				AllowedUrlPatterns: pulumi.StringArray{
//					pulumi.String("http://www.example.org"),
//					pulumi.String("http://help.com.au"),
//				},
//				BlockedUrlCategories: pulumi.StringArray{
//					pulumi.String("meraki:contentFiltering/category/1"),
//					pulumi.String("meraki:contentFiltering/category/7"),
//				},
//				BlockedUrlPatterns: pulumi.StringArray{
//					pulumi.String("http://www.example.com"),
//					pulumi.String("http://www.betting.com"),
//				},
//				NetworkId:           pulumi.String("string"),
//				UrlCategoryListSize: pulumi.String("topSites"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("merakiNetworksApplianceContentFilteringExample", example)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import meraki:networks/applianceContentFiltering:ApplianceContentFiltering example "network_id"
// ```
type ApplianceContentFiltering struct {
	pulumi.CustomResourceState

	// A list of URL patterns that are allowed
	AllowedUrlPatterns pulumi.StringArrayOutput `pulumi:"allowedUrlPatterns"`
	// A list of URL categories to block
	BlockedUrlCategories          pulumi.StringArrayOutput                                         `pulumi:"blockedUrlCategories"`
	BlockedUrlCategoriesResponses ApplianceContentFilteringBlockedUrlCategoriesResponseArrayOutput `pulumi:"blockedUrlCategoriesResponses"`
	// A list of URL patterns that are blocked
	BlockedUrlPatterns pulumi.StringArrayOutput `pulumi:"blockedUrlPatterns"`
	// networkId path parameter. Network ID
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// URL category list size which is either 'topSites' or 'fullList'
	UrlCategoryListSize pulumi.StringPtrOutput `pulumi:"urlCategoryListSize"`
}

// NewApplianceContentFiltering registers a new resource with the given unique name, arguments, and options.
func NewApplianceContentFiltering(ctx *pulumi.Context,
	name string, args *ApplianceContentFilteringArgs, opts ...pulumi.ResourceOption) (*ApplianceContentFiltering, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplianceContentFiltering
	err := ctx.RegisterResource("meraki:networks/applianceContentFiltering:ApplianceContentFiltering", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplianceContentFiltering gets an existing ApplianceContentFiltering resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplianceContentFiltering(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplianceContentFilteringState, opts ...pulumi.ResourceOption) (*ApplianceContentFiltering, error) {
	var resource ApplianceContentFiltering
	err := ctx.ReadResource("meraki:networks/applianceContentFiltering:ApplianceContentFiltering", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplianceContentFiltering resources.
type applianceContentFilteringState struct {
	// A list of URL patterns that are allowed
	AllowedUrlPatterns []string `pulumi:"allowedUrlPatterns"`
	// A list of URL categories to block
	BlockedUrlCategories          []string                                                `pulumi:"blockedUrlCategories"`
	BlockedUrlCategoriesResponses []ApplianceContentFilteringBlockedUrlCategoriesResponse `pulumi:"blockedUrlCategoriesResponses"`
	// A list of URL patterns that are blocked
	BlockedUrlPatterns []string `pulumi:"blockedUrlPatterns"`
	// networkId path parameter. Network ID
	NetworkId *string `pulumi:"networkId"`
	// URL category list size which is either 'topSites' or 'fullList'
	UrlCategoryListSize *string `pulumi:"urlCategoryListSize"`
}

type ApplianceContentFilteringState struct {
	// A list of URL patterns that are allowed
	AllowedUrlPatterns pulumi.StringArrayInput
	// A list of URL categories to block
	BlockedUrlCategories          pulumi.StringArrayInput
	BlockedUrlCategoriesResponses ApplianceContentFilteringBlockedUrlCategoriesResponseArrayInput
	// A list of URL patterns that are blocked
	BlockedUrlPatterns pulumi.StringArrayInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringPtrInput
	// URL category list size which is either 'topSites' or 'fullList'
	UrlCategoryListSize pulumi.StringPtrInput
}

func (ApplianceContentFilteringState) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceContentFilteringState)(nil)).Elem()
}

type applianceContentFilteringArgs struct {
	// A list of URL patterns that are allowed
	AllowedUrlPatterns []string `pulumi:"allowedUrlPatterns"`
	// A list of URL categories to block
	BlockedUrlCategories []string `pulumi:"blockedUrlCategories"`
	// A list of URL patterns that are blocked
	BlockedUrlPatterns []string `pulumi:"blockedUrlPatterns"`
	// networkId path parameter. Network ID
	NetworkId string `pulumi:"networkId"`
	// URL category list size which is either 'topSites' or 'fullList'
	UrlCategoryListSize *string `pulumi:"urlCategoryListSize"`
}

// The set of arguments for constructing a ApplianceContentFiltering resource.
type ApplianceContentFilteringArgs struct {
	// A list of URL patterns that are allowed
	AllowedUrlPatterns pulumi.StringArrayInput
	// A list of URL categories to block
	BlockedUrlCategories pulumi.StringArrayInput
	// A list of URL patterns that are blocked
	BlockedUrlPatterns pulumi.StringArrayInput
	// networkId path parameter. Network ID
	NetworkId pulumi.StringInput
	// URL category list size which is either 'topSites' or 'fullList'
	UrlCategoryListSize pulumi.StringPtrInput
}

func (ApplianceContentFilteringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applianceContentFilteringArgs)(nil)).Elem()
}

type ApplianceContentFilteringInput interface {
	pulumi.Input

	ToApplianceContentFilteringOutput() ApplianceContentFilteringOutput
	ToApplianceContentFilteringOutputWithContext(ctx context.Context) ApplianceContentFilteringOutput
}

func (*ApplianceContentFiltering) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceContentFiltering)(nil)).Elem()
}

func (i *ApplianceContentFiltering) ToApplianceContentFilteringOutput() ApplianceContentFilteringOutput {
	return i.ToApplianceContentFilteringOutputWithContext(context.Background())
}

func (i *ApplianceContentFiltering) ToApplianceContentFilteringOutputWithContext(ctx context.Context) ApplianceContentFilteringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceContentFilteringOutput)
}

// ApplianceContentFilteringArrayInput is an input type that accepts ApplianceContentFilteringArray and ApplianceContentFilteringArrayOutput values.
// You can construct a concrete instance of `ApplianceContentFilteringArrayInput` via:
//
//	ApplianceContentFilteringArray{ ApplianceContentFilteringArgs{...} }
type ApplianceContentFilteringArrayInput interface {
	pulumi.Input

	ToApplianceContentFilteringArrayOutput() ApplianceContentFilteringArrayOutput
	ToApplianceContentFilteringArrayOutputWithContext(context.Context) ApplianceContentFilteringArrayOutput
}

type ApplianceContentFilteringArray []ApplianceContentFilteringInput

func (ApplianceContentFilteringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceContentFiltering)(nil)).Elem()
}

func (i ApplianceContentFilteringArray) ToApplianceContentFilteringArrayOutput() ApplianceContentFilteringArrayOutput {
	return i.ToApplianceContentFilteringArrayOutputWithContext(context.Background())
}

func (i ApplianceContentFilteringArray) ToApplianceContentFilteringArrayOutputWithContext(ctx context.Context) ApplianceContentFilteringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceContentFilteringArrayOutput)
}

// ApplianceContentFilteringMapInput is an input type that accepts ApplianceContentFilteringMap and ApplianceContentFilteringMapOutput values.
// You can construct a concrete instance of `ApplianceContentFilteringMapInput` via:
//
//	ApplianceContentFilteringMap{ "key": ApplianceContentFilteringArgs{...} }
type ApplianceContentFilteringMapInput interface {
	pulumi.Input

	ToApplianceContentFilteringMapOutput() ApplianceContentFilteringMapOutput
	ToApplianceContentFilteringMapOutputWithContext(context.Context) ApplianceContentFilteringMapOutput
}

type ApplianceContentFilteringMap map[string]ApplianceContentFilteringInput

func (ApplianceContentFilteringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceContentFiltering)(nil)).Elem()
}

func (i ApplianceContentFilteringMap) ToApplianceContentFilteringMapOutput() ApplianceContentFilteringMapOutput {
	return i.ToApplianceContentFilteringMapOutputWithContext(context.Background())
}

func (i ApplianceContentFilteringMap) ToApplianceContentFilteringMapOutputWithContext(ctx context.Context) ApplianceContentFilteringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplianceContentFilteringMapOutput)
}

type ApplianceContentFilteringOutput struct{ *pulumi.OutputState }

func (ApplianceContentFilteringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplianceContentFiltering)(nil)).Elem()
}

func (o ApplianceContentFilteringOutput) ToApplianceContentFilteringOutput() ApplianceContentFilteringOutput {
	return o
}

func (o ApplianceContentFilteringOutput) ToApplianceContentFilteringOutputWithContext(ctx context.Context) ApplianceContentFilteringOutput {
	return o
}

// A list of URL patterns that are allowed
func (o ApplianceContentFilteringOutput) AllowedUrlPatterns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ApplianceContentFiltering) pulumi.StringArrayOutput { return v.AllowedUrlPatterns }).(pulumi.StringArrayOutput)
}

// A list of URL categories to block
func (o ApplianceContentFilteringOutput) BlockedUrlCategories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ApplianceContentFiltering) pulumi.StringArrayOutput { return v.BlockedUrlCategories }).(pulumi.StringArrayOutput)
}

func (o ApplianceContentFilteringOutput) BlockedUrlCategoriesResponses() ApplianceContentFilteringBlockedUrlCategoriesResponseArrayOutput {
	return o.ApplyT(func(v *ApplianceContentFiltering) ApplianceContentFilteringBlockedUrlCategoriesResponseArrayOutput {
		return v.BlockedUrlCategoriesResponses
	}).(ApplianceContentFilteringBlockedUrlCategoriesResponseArrayOutput)
}

// A list of URL patterns that are blocked
func (o ApplianceContentFilteringOutput) BlockedUrlPatterns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ApplianceContentFiltering) pulumi.StringArrayOutput { return v.BlockedUrlPatterns }).(pulumi.StringArrayOutput)
}

// networkId path parameter. Network ID
func (o ApplianceContentFilteringOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplianceContentFiltering) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// URL category list size which is either 'topSites' or 'fullList'
func (o ApplianceContentFilteringOutput) UrlCategoryListSize() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApplianceContentFiltering) pulumi.StringPtrOutput { return v.UrlCategoryListSize }).(pulumi.StringPtrOutput)
}

type ApplianceContentFilteringArrayOutput struct{ *pulumi.OutputState }

func (ApplianceContentFilteringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplianceContentFiltering)(nil)).Elem()
}

func (o ApplianceContentFilteringArrayOutput) ToApplianceContentFilteringArrayOutput() ApplianceContentFilteringArrayOutput {
	return o
}

func (o ApplianceContentFilteringArrayOutput) ToApplianceContentFilteringArrayOutputWithContext(ctx context.Context) ApplianceContentFilteringArrayOutput {
	return o
}

func (o ApplianceContentFilteringArrayOutput) Index(i pulumi.IntInput) ApplianceContentFilteringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplianceContentFiltering {
		return vs[0].([]*ApplianceContentFiltering)[vs[1].(int)]
	}).(ApplianceContentFilteringOutput)
}

type ApplianceContentFilteringMapOutput struct{ *pulumi.OutputState }

func (ApplianceContentFilteringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplianceContentFiltering)(nil)).Elem()
}

func (o ApplianceContentFilteringMapOutput) ToApplianceContentFilteringMapOutput() ApplianceContentFilteringMapOutput {
	return o
}

func (o ApplianceContentFilteringMapOutput) ToApplianceContentFilteringMapOutputWithContext(ctx context.Context) ApplianceContentFilteringMapOutput {
	return o
}

func (o ApplianceContentFilteringMapOutput) MapIndex(k pulumi.StringInput) ApplianceContentFilteringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplianceContentFiltering {
		return vs[0].(map[string]*ApplianceContentFiltering)[vs[1].(string)]
	}).(ApplianceContentFilteringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceContentFilteringInput)(nil)).Elem(), &ApplianceContentFiltering{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceContentFilteringArrayInput)(nil)).Elem(), ApplianceContentFilteringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplianceContentFilteringMapInput)(nil)).Elem(), ApplianceContentFilteringMap{})
	pulumi.RegisterOutputType(ApplianceContentFilteringOutput{})
	pulumi.RegisterOutputType(ApplianceContentFilteringArrayOutput{})
	pulumi.RegisterOutputType(ApplianceContentFilteringMapOutput{})
}
