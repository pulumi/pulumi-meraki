// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.FirmwareUpgradesStagedEventsArgs;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesStagedEventsState;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsProducts;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsReason;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesStagedEventsStage;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/firmwareUpgradesStagedEvents:FirmwareUpgradesStagedEvents example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/firmwareUpgradesStagedEvents:FirmwareUpgradesStagedEvents")
public class FirmwareUpgradesStagedEvents extends com.pulumi.resources.CustomResource {
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
     * The network devices to be updated
     * 
     */
    @Export(name="products", refs={FirmwareUpgradesStagedEventsProducts.class}, tree="[0]")
    private Output<FirmwareUpgradesStagedEventsProducts> products;

    /**
     * @return The network devices to be updated
     * 
     */
    public Output<FirmwareUpgradesStagedEventsProducts> products() {
        return this.products;
    }
    /**
     * Reasons for the rollback
     * 
     */
    @Export(name="reasons", refs={List.class,FirmwareUpgradesStagedEventsReason.class}, tree="[0,1]")
    private Output<List<FirmwareUpgradesStagedEventsReason>> reasons;

    /**
     * @return Reasons for the rollback
     * 
     */
    public Output<List<FirmwareUpgradesStagedEventsReason>> reasons() {
        return this.reasons;
    }
    /**
     * The ordered stages in the network
     * 
     */
    @Export(name="stages", refs={List.class,FirmwareUpgradesStagedEventsStage.class}, tree="[0,1]")
    private Output<List<FirmwareUpgradesStagedEventsStage>> stages;

    /**
     * @return The ordered stages in the network
     * 
     */
    public Output<List<FirmwareUpgradesStagedEventsStage>> stages() {
        return this.stages;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirmwareUpgradesStagedEvents(java.lang.String name) {
        this(name, FirmwareUpgradesStagedEventsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirmwareUpgradesStagedEvents(java.lang.String name, FirmwareUpgradesStagedEventsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirmwareUpgradesStagedEvents(java.lang.String name, FirmwareUpgradesStagedEventsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/firmwareUpgradesStagedEvents:FirmwareUpgradesStagedEvents", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FirmwareUpgradesStagedEvents(java.lang.String name, Output<java.lang.String> id, @Nullable FirmwareUpgradesStagedEventsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/firmwareUpgradesStagedEvents:FirmwareUpgradesStagedEvents", name, state, makeResourceOptions(options, id), false);
    }

    private static FirmwareUpgradesStagedEventsArgs makeArgs(FirmwareUpgradesStagedEventsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FirmwareUpgradesStagedEventsArgs.Empty : args;
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
    public static FirmwareUpgradesStagedEvents get(java.lang.String name, Output<java.lang.String> id, @Nullable FirmwareUpgradesStagedEventsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirmwareUpgradesStagedEvents(name, id, state, options);
    }
}
