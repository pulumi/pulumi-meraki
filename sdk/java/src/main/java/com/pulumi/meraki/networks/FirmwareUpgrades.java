// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.FirmwareUpgradesArgs;
import com.pulumi.meraki.networks.inputs.FirmwareUpgradesState;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesProducts;
import com.pulumi.meraki.networks.outputs.FirmwareUpgradesUpgradeWindow;
import java.lang.String;
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
 * $ pulumi import meraki:networks/firmwareUpgrades:FirmwareUpgrades example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/firmwareUpgrades:FirmwareUpgrades")
public class FirmwareUpgrades extends com.pulumi.resources.CustomResource {
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
    @Export(name="products", refs={FirmwareUpgradesProducts.class}, tree="[0]")
    private Output<FirmwareUpgradesProducts> products;

    /**
     * @return The network devices to be updated
     * 
     */
    public Output<FirmwareUpgradesProducts> products() {
        return this.products;
    }
    /**
     * The timezone for the network
     * 
     */
    @Export(name="timezone", refs={String.class}, tree="[0]")
    private Output<String> timezone;

    /**
     * @return The timezone for the network
     * 
     */
    public Output<String> timezone() {
        return this.timezone;
    }
    /**
     * Upgrade window for devices in network
     * 
     */
    @Export(name="upgradeWindow", refs={FirmwareUpgradesUpgradeWindow.class}, tree="[0]")
    private Output<FirmwareUpgradesUpgradeWindow> upgradeWindow;

    /**
     * @return Upgrade window for devices in network
     * 
     */
    public Output<FirmwareUpgradesUpgradeWindow> upgradeWindow() {
        return this.upgradeWindow;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirmwareUpgrades(java.lang.String name) {
        this(name, FirmwareUpgradesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirmwareUpgrades(java.lang.String name, FirmwareUpgradesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirmwareUpgrades(java.lang.String name, FirmwareUpgradesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/firmwareUpgrades:FirmwareUpgrades", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FirmwareUpgrades(java.lang.String name, Output<java.lang.String> id, @Nullable FirmwareUpgradesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/firmwareUpgrades:FirmwareUpgrades", name, state, makeResourceOptions(options, id), false);
    }

    private static FirmwareUpgradesArgs makeArgs(FirmwareUpgradesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FirmwareUpgradesArgs.Empty : args;
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
    public static FirmwareUpgrades get(java.lang.String name, Output<java.lang.String> id, @Nullable FirmwareUpgradesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirmwareUpgrades(name, id, state, options);
    }
}
