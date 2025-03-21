// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.CellularGatewayConnectivityMonitoringDestinationsArgs;
import com.pulumi.meraki.networks.inputs.CellularGatewayConnectivityMonitoringDestinationsState;
import com.pulumi.meraki.networks.outputs.CellularGatewayConnectivityMonitoringDestinationsDestination;
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
 * import com.pulumi.meraki.networks.CellularGatewayConnectivityMonitoringDestinations;
 * import com.pulumi.meraki.networks.CellularGatewayConnectivityMonitoringDestinationsArgs;
 * import com.pulumi.meraki.networks.inputs.CellularGatewayConnectivityMonitoringDestinationsDestinationArgs;
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
 *         var example = new CellularGatewayConnectivityMonitoringDestinations("example", CellularGatewayConnectivityMonitoringDestinationsArgs.builder()
 *             .destinations(CellularGatewayConnectivityMonitoringDestinationsDestinationArgs.builder()
 *                 .default_(false)
 *                 .description("Google")
 *                 .ip("8.8.8.8")
 *                 .build())
 *             .networkId("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksCellularGatewayConnectivityMonitoringDestinationsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/cellularGatewayConnectivityMonitoringDestinations:CellularGatewayConnectivityMonitoringDestinations example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/cellularGatewayConnectivityMonitoringDestinations:CellularGatewayConnectivityMonitoringDestinations")
public class CellularGatewayConnectivityMonitoringDestinations extends com.pulumi.resources.CustomResource {
    /**
     * The list of connectivity monitoring destinations
     * 
     */
    @Export(name="destinations", refs={List.class,CellularGatewayConnectivityMonitoringDestinationsDestination.class}, tree="[0,1]")
    private Output<List<CellularGatewayConnectivityMonitoringDestinationsDestination>> destinations;

    /**
     * @return The list of connectivity monitoring destinations
     * 
     */
    public Output<List<CellularGatewayConnectivityMonitoringDestinationsDestination>> destinations() {
        return this.destinations;
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
    public CellularGatewayConnectivityMonitoringDestinations(java.lang.String name) {
        this(name, CellularGatewayConnectivityMonitoringDestinationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CellularGatewayConnectivityMonitoringDestinations(java.lang.String name, CellularGatewayConnectivityMonitoringDestinationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CellularGatewayConnectivityMonitoringDestinations(java.lang.String name, CellularGatewayConnectivityMonitoringDestinationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/cellularGatewayConnectivityMonitoringDestinations:CellularGatewayConnectivityMonitoringDestinations", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CellularGatewayConnectivityMonitoringDestinations(java.lang.String name, Output<java.lang.String> id, @Nullable CellularGatewayConnectivityMonitoringDestinationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/cellularGatewayConnectivityMonitoringDestinations:CellularGatewayConnectivityMonitoringDestinations", name, state, makeResourceOptions(options, id), false);
    }

    private static CellularGatewayConnectivityMonitoringDestinationsArgs makeArgs(CellularGatewayConnectivityMonitoringDestinationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CellularGatewayConnectivityMonitoringDestinationsArgs.Empty : args;
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
    public static CellularGatewayConnectivityMonitoringDestinations get(java.lang.String name, Output<java.lang.String> id, @Nullable CellularGatewayConnectivityMonitoringDestinationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CellularGatewayConnectivityMonitoringDestinations(name, id, state, options);
    }
}
