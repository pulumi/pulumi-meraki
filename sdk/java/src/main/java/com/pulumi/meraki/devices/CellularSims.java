// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.devices.CellularSimsArgs;
import com.pulumi.meraki.devices.inputs.CellularSimsState;
import com.pulumi.meraki.devices.outputs.CellularSimsSim;
import com.pulumi.meraki.devices.outputs.CellularSimsSimFailover;
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
 * import com.pulumi.meraki.devices.CellularSims;
 * import com.pulumi.meraki.devices.CellularSimsArgs;
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
 *         var example = new CellularSims("example", CellularSimsArgs.builder()
 *             .serial("string")
 *             .build());
 * 
 *         ctx.export("merakiDevicesCellularSimsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:devices/cellularSims:CellularSims example &#34;serial&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:devices/cellularSims:CellularSims")
public class CellularSims extends com.pulumi.resources.CustomResource {
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
     * SIM Failover settings.
     * 
     */
    @Export(name="simFailover", refs={CellularSimsSimFailover.class}, tree="[0]")
    private Output<CellularSimsSimFailover> simFailover;

    /**
     * @return SIM Failover settings.
     * 
     */
    public Output<CellularSimsSimFailover> simFailover() {
        return this.simFailover;
    }
    /**
     * List of SIMs. If a SIM was previously configured and not specified in this request, it will remain unchanged.
     * 
     */
    @Export(name="sims", refs={List.class,CellularSimsSim.class}, tree="[0,1]")
    private Output<List<CellularSimsSim>> sims;

    /**
     * @return List of SIMs. If a SIM was previously configured and not specified in this request, it will remain unchanged.
     * 
     */
    public Output<List<CellularSimsSim>> sims() {
        return this.sims;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CellularSims(String name) {
        this(name, CellularSimsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CellularSims(String name, CellularSimsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CellularSims(String name, CellularSimsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/cellularSims:CellularSims", name, args == null ? CellularSimsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CellularSims(String name, Output<String> id, @Nullable CellularSimsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/cellularSims:CellularSims", name, state, makeResourceOptions(options, id));
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
    public static CellularSims get(String name, Output<String> id, @Nullable CellularSimsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CellularSims(name, id, state, options);
    }
}