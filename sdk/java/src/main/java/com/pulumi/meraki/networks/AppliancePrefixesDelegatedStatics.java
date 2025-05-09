// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.AppliancePrefixesDelegatedStaticsArgs;
import com.pulumi.meraki.networks.inputs.AppliancePrefixesDelegatedStaticsState;
import com.pulumi.meraki.networks.outputs.AppliancePrefixesDelegatedStaticsOrigin;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.meraki.networks.AppliancePrefixesDelegatedStatics;
 * import com.pulumi.meraki.networks.AppliancePrefixesDelegatedStaticsArgs;
 * import com.pulumi.meraki.networks.inputs.AppliancePrefixesDelegatedStaticsOriginArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new AppliancePrefixesDelegatedStatics("example", AppliancePrefixesDelegatedStaticsArgs.builder()
 *             .description("Prefix on WAN 1 of Long Island Office network")
 *             .networkId("string")
 *             .origin(AppliancePrefixesDelegatedStaticsOriginArgs.builder()
 *                 .interfaces("wan1")
 *                 .type("internet")
 *                 .build())
 *             .prefix("2001:db8:3c4d:15::/64")
 *             .build());
 * 
 *         ctx.export("merakiNetworksAppliancePrefixesDelegatedStaticsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/appliancePrefixesDelegatedStatics:AppliancePrefixesDelegatedStatics example &#34;network_id,static_delegated_prefix_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/appliancePrefixesDelegatedStatics:AppliancePrefixesDelegatedStatics")
public class AppliancePrefixesDelegatedStatics extends com.pulumi.resources.CustomResource {
    /**
     * Prefix creation time.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Prefix creation time.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Identifying description for the prefix.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Identifying description for the prefix.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * networkId path parameter. Network ID
     * 
     */
    @Export(name="networkId", refs={String.class}, tree="[0]")
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }
    /**
     * WAN1/WAN2/Independent prefix.
     * 
     */
    @Export(name="origin", refs={AppliancePrefixesDelegatedStaticsOrigin.class}, tree="[0]")
    private Output<AppliancePrefixesDelegatedStaticsOrigin> origin;

    /**
     * @return WAN1/WAN2/Independent prefix.
     * 
     */
    public Output<AppliancePrefixesDelegatedStaticsOrigin> origin() {
        return this.origin;
    }
    /**
     * IPv6 prefix/prefix length.
     * 
     */
    @Export(name="prefix", refs={String.class}, tree="[0]")
    private Output<String> prefix;

    /**
     * @return IPv6 prefix/prefix length.
     * 
     */
    public Output<String> prefix() {
        return this.prefix;
    }
    /**
     * Static delegated prefix id.
     * 
     */
    @Export(name="staticDelegatedPrefixId", refs={String.class}, tree="[0]")
    private Output<String> staticDelegatedPrefixId;

    /**
     * @return Static delegated prefix id.
     * 
     */
    public Output<String> staticDelegatedPrefixId() {
        return this.staticDelegatedPrefixId;
    }
    /**
     * Prefix Updated time.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return Prefix Updated time.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppliancePrefixesDelegatedStatics(java.lang.String name) {
        this(name, AppliancePrefixesDelegatedStaticsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppliancePrefixesDelegatedStatics(java.lang.String name, AppliancePrefixesDelegatedStaticsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppliancePrefixesDelegatedStatics(java.lang.String name, AppliancePrefixesDelegatedStaticsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/appliancePrefixesDelegatedStatics:AppliancePrefixesDelegatedStatics", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppliancePrefixesDelegatedStatics(java.lang.String name, Output<java.lang.String> id, @Nullable AppliancePrefixesDelegatedStaticsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/appliancePrefixesDelegatedStatics:AppliancePrefixesDelegatedStatics", name, state, makeResourceOptions(options, id), false);
    }

    private static AppliancePrefixesDelegatedStaticsArgs makeArgs(AppliancePrefixesDelegatedStaticsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppliancePrefixesDelegatedStaticsArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi/pulumi-meraki")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AppliancePrefixesDelegatedStatics get(java.lang.String name, Output<java.lang.String> id, @Nullable AppliancePrefixesDelegatedStaticsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppliancePrefixesDelegatedStatics(name, id, state, options);
    }
}
