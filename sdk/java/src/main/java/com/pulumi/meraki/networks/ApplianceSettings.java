// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.ApplianceSettingsArgs;
import com.pulumi.meraki.networks.inputs.ApplianceSettingsState;
import com.pulumi.meraki.networks.outputs.ApplianceSettingsDynamicDns;
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
 * import com.pulumi.meraki.networks.ApplianceSettings;
 * import com.pulumi.meraki.networks.ApplianceSettingsArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceSettingsDynamicDnsArgs;
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
 *         var example = new ApplianceSettings("example", ApplianceSettingsArgs.builder()
 *             .clientTrackingMethod("MAC address")
 *             .deploymentMode("routed")
 *             .dynamicDns(ApplianceSettingsDynamicDnsArgs.builder()
 *                 .enabled(true)
 *                 .prefix("test")
 *                 .build())
 *             .networkId("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksApplianceSettingsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/applianceSettings:ApplianceSettings example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/applianceSettings:ApplianceSettings")
public class ApplianceSettings extends com.pulumi.resources.CustomResource {
    /**
     * Client tracking method of a network
     * 
     */
    @Export(name="clientTrackingMethod", refs={String.class}, tree="[0]")
    private Output<String> clientTrackingMethod;

    /**
     * @return Client tracking method of a network
     * 
     */
    public Output<String> clientTrackingMethod() {
        return this.clientTrackingMethod;
    }
    /**
     * Deployment mode of a network
     * 
     */
    @Export(name="deploymentMode", refs={String.class}, tree="[0]")
    private Output<String> deploymentMode;

    /**
     * @return Deployment mode of a network
     * 
     */
    public Output<String> deploymentMode() {
        return this.deploymentMode;
    }
    /**
     * Dynamic DNS settings for a network
     * 
     */
    @Export(name="dynamicDns", refs={ApplianceSettingsDynamicDns.class}, tree="[0]")
    private Output<ApplianceSettingsDynamicDns> dynamicDns;

    /**
     * @return Dynamic DNS settings for a network
     * 
     */
    public Output<ApplianceSettingsDynamicDns> dynamicDns() {
        return this.dynamicDns;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplianceSettings(String name) {
        this(name, ApplianceSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceSettings(String name, ApplianceSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceSettings(String name, ApplianceSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceSettings:ApplianceSettings", name, args == null ? ApplianceSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceSettings(String name, Output<String> id, @Nullable ApplianceSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceSettings:ApplianceSettings", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static ApplianceSettings get(String name, Output<String> id, @Nullable ApplianceSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceSettings(name, id, state, options);
    }
}