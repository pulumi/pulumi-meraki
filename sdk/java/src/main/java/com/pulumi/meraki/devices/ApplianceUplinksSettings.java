// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.devices.ApplianceUplinksSettingsArgs;
import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsState;
import com.pulumi.meraki.devices.outputs.ApplianceUplinksSettingsInterfaces;
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
 * import com.pulumi.meraki.devices.ApplianceUplinksSettings;
 * import com.pulumi.meraki.devices.ApplianceUplinksSettingsArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan1Args;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan1PppoeArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan1PppoeAuthenticationArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan1SvisArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv4Args;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv4NameserversArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv6Args;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan1SvisIpv6NameserversArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan1VlanTaggingArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan2Args;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan2PppoeArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan2SvisArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv4Args;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv4NameserversArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv6Args;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan2SvisIpv6NameserversArgs;
 * import com.pulumi.meraki.devices.inputs.ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs;
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
 *         var example = new ApplianceUplinksSettings("example", ApplianceUplinksSettingsArgs.builder()
 *             .interfaces(ApplianceUplinksSettingsInterfacesArgs.builder()
 *                 .wan1(ApplianceUplinksSettingsInterfacesWan1Args.builder()
 *                     .enabled(true)
 *                     .pppoe(ApplianceUplinksSettingsInterfacesWan1PppoeArgs.builder()
 *                         .authentication(ApplianceUplinksSettingsInterfacesWan1PppoeAuthenticationArgs.builder()
 *                             .enabled(true)
 *                             .password("password")
 *                             .username("username")
 *                             .build())
 *                         .enabled(true)
 *                         .build())
 *                     .svis(ApplianceUplinksSettingsInterfacesWan1SvisArgs.builder()
 *                         .ipv4(ApplianceUplinksSettingsInterfacesWan1SvisIpv4Args.builder()
 *                             .address("9.10.11.10/16")
 *                             .assignmentMode("static")
 *                             .gateway("13.14.15.16")
 *                             .nameservers(ApplianceUplinksSettingsInterfacesWan1SvisIpv4NameserversArgs.builder()
 *                                 .addresses("1.2.3.4")
 *                                 .build())
 *                             .build())
 *                         .ipv6(ApplianceUplinksSettingsInterfacesWan1SvisIpv6Args.builder()
 *                             .address("1:2:3::4")
 *                             .assignmentMode("static")
 *                             .gateway("1:2:3::5")
 *                             .nameservers(ApplianceUplinksSettingsInterfacesWan1SvisIpv6NameserversArgs.builder()
 *                                 .addresses(                                
 *                                     "1001:4860:4860::8888",
 *                                     "1001:4860:4860::8844")
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .vlanTagging(ApplianceUplinksSettingsInterfacesWan1VlanTaggingArgs.builder()
 *                         .enabled(true)
 *                         .vlanId(1)
 *                         .build())
 *                     .build())
 *                 .wan2(ApplianceUplinksSettingsInterfacesWan2Args.builder()
 *                     .enabled(true)
 *                     .pppoe(ApplianceUplinksSettingsInterfacesWan2PppoeArgs.builder()
 *                         .authentication(ApplianceUplinksSettingsInterfacesWan2PppoeAuthenticationArgs.builder()
 *                             .enabled(true)
 *                             .password("password")
 *                             .username("username")
 *                             .build())
 *                         .enabled(true)
 *                         .build())
 *                     .svis(ApplianceUplinksSettingsInterfacesWan2SvisArgs.builder()
 *                         .ipv4(ApplianceUplinksSettingsInterfacesWan2SvisIpv4Args.builder()
 *                             .address("9.10.11.10/16")
 *                             .assignmentMode("static")
 *                             .gateway("13.14.15.16")
 *                             .nameservers(ApplianceUplinksSettingsInterfacesWan2SvisIpv4NameserversArgs.builder()
 *                                 .addresses("1.2.3.4")
 *                                 .build())
 *                             .build())
 *                         .ipv6(ApplianceUplinksSettingsInterfacesWan2SvisIpv6Args.builder()
 *                             .address("1:2:3::4")
 *                             .assignmentMode("static")
 *                             .gateway("1:2:3::5")
 *                             .nameservers(ApplianceUplinksSettingsInterfacesWan2SvisIpv6NameserversArgs.builder()
 *                                 .addresses(                                
 *                                     "1001:4860:4860::8888",
 *                                     "1001:4860:4860::8844")
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .vlanTagging(ApplianceUplinksSettingsInterfacesWan2VlanTaggingArgs.builder()
 *                         .enabled(true)
 *                         .vlanId(1)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .serial("string")
 *             .build());
 * 
 *         ctx.export("merakiDevicesApplianceUplinksSettingsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings example &#34;serial&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings")
public class ApplianceUplinksSettings extends com.pulumi.resources.CustomResource {
    /**
     * Interface settings.
     * 
     */
    @Export(name="interfaces", refs={ApplianceUplinksSettingsInterfaces.class}, tree="[0]")
    private Output<ApplianceUplinksSettingsInterfaces> interfaces;

    /**
     * @return Interface settings.
     * 
     */
    public Output<ApplianceUplinksSettingsInterfaces> interfaces() {
        return this.interfaces;
    }
    /**
     * serial path parameter.
     * 
     */
    @Export(name="serial", refs={String.class}, tree="[0]")
    private Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplianceUplinksSettings(java.lang.String name) {
        this(name, ApplianceUplinksSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceUplinksSettings(java.lang.String name, ApplianceUplinksSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceUplinksSettings(java.lang.String name, ApplianceUplinksSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ApplianceUplinksSettings(java.lang.String name, Output<java.lang.String> id, @Nullable ApplianceUplinksSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/applianceUplinksSettings:ApplianceUplinksSettings", name, state, makeResourceOptions(options, id), false);
    }

    private static ApplianceUplinksSettingsArgs makeArgs(ApplianceUplinksSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ApplianceUplinksSettingsArgs.Empty : args;
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
    public static ApplianceUplinksSettings get(java.lang.String name, Output<java.lang.String> id, @Nullable ApplianceUplinksSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceUplinksSettings(name, id, state, options);
    }
}
