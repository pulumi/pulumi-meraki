// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SyslogServersArgs;
import com.pulumi.meraki.networks.inputs.SyslogServersState;
import com.pulumi.meraki.networks.outputs.SyslogServersServer;
import java.lang.String;
import java.util.List;
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
 * import com.pulumi.meraki.networks.SyslogServers;
 * import com.pulumi.meraki.networks.SyslogServersArgs;
 * import com.pulumi.meraki.networks.inputs.SyslogServersServerArgs;
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
 *         var example = new SyslogServers("example", SyslogServersArgs.builder()
 *             .networkId("string")
 *             .servers(SyslogServersServerArgs.builder()
 *                 .host("1.2.3.4")
 *                 .port(443)
 *                 .roles(                
 *                     "Wireless event log",
 *                     "URLs")
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiNetworksSyslogServersExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/syslogServers:SyslogServers example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/syslogServers:SyslogServers")
public class SyslogServers extends com.pulumi.resources.CustomResource {
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
     * List of the syslog servers for this network
     * 
     */
    @Export(name="servers", refs={List.class,SyslogServersServer.class}, tree="[0,1]")
    private Output<List<SyslogServersServer>> servers;

    /**
     * @return List of the syslog servers for this network
     * 
     */
    public Output<List<SyslogServersServer>> servers() {
        return this.servers;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SyslogServers(java.lang.String name) {
        this(name, SyslogServersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SyslogServers(java.lang.String name, SyslogServersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SyslogServers(java.lang.String name, SyslogServersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/syslogServers:SyslogServers", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SyslogServers(java.lang.String name, Output<java.lang.String> id, @Nullable SyslogServersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/syslogServers:SyslogServers", name, state, makeResourceOptions(options, id), false);
    }

    private static SyslogServersArgs makeArgs(SyslogServersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SyslogServersArgs.Empty : args;
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
    public static SyslogServers get(java.lang.String name, Output<java.lang.String> id, @Nullable SyslogServersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SyslogServers(name, id, state, options);
    }
}
