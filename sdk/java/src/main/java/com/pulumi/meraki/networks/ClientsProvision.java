// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.ClientsProvisionArgs;
import com.pulumi.meraki.networks.inputs.ClientsProvisionState;
import com.pulumi.meraki.networks.outputs.ClientsProvisionItem;
import com.pulumi.meraki.networks.outputs.ClientsProvisionParameters;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:networks/clientsProvision:ClientsProvision")
public class ClientsProvision extends com.pulumi.resources.CustomResource {
    @Export(name="item", refs={ClientsProvisionItem.class}, tree="[0]")
    private Output<ClientsProvisionItem> item;

    public Output<ClientsProvisionItem> item() {
        return this.item;
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
    @Export(name="parameters", refs={ClientsProvisionParameters.class}, tree="[0]")
    private Output<ClientsProvisionParameters> parameters;

    public Output<ClientsProvisionParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientsProvision(java.lang.String name) {
        this(name, ClientsProvisionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientsProvision(java.lang.String name, ClientsProvisionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientsProvision(java.lang.String name, ClientsProvisionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/clientsProvision:ClientsProvision", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ClientsProvision(java.lang.String name, Output<java.lang.String> id, @Nullable ClientsProvisionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/clientsProvision:ClientsProvision", name, state, makeResourceOptions(options, id), false);
    }

    private static ClientsProvisionArgs makeArgs(ClientsProvisionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ClientsProvisionArgs.Empty : args;
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
    public static ClientsProvision get(java.lang.String name, Output<java.lang.String> id, @Nullable ClientsProvisionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClientsProvision(name, id, state, options);
    }
}
