// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SmDevicesUnenrollArgs;
import com.pulumi.meraki.networks.inputs.SmDevicesUnenrollState;
import com.pulumi.meraki.networks.outputs.SmDevicesUnenrollItem;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ~&gt;Warning: This resource does not represent a real-world entity in Meraki Dashboard, therefore changing or deleting this resource on its own has no immediate effect. Instead, it is a task part of a Meraki Dashboard workflow. It is executed in Meraki without any additional verification. It does not check if it was executed before or if a similar configuration or action
 * already existed previously.
 * 
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
 * import com.pulumi.meraki.networks.SmDevicesUnenroll;
 * import com.pulumi.meraki.networks.SmDevicesUnenrollArgs;
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
 *         var example = new SmDevicesUnenroll("example", SmDevicesUnenrollArgs.builder()
 *             .deviceId("string")
 *             .networkId("string")
 *             .build());
 * 
 *         ctx.export("merakiNetworksSmDevicesUnenrollExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:networks/smDevicesUnenroll:SmDevicesUnenroll")
public class SmDevicesUnenroll extends com.pulumi.resources.CustomResource {
    /**
     * deviceId path parameter. Device ID
     * 
     */
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    /**
     * @return deviceId path parameter. Device ID
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }
    @Export(name="item", refs={SmDevicesUnenrollItem.class}, tree="[0]")
    private Output<SmDevicesUnenrollItem> item;

    public Output<SmDevicesUnenrollItem> item() {
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

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmDevicesUnenroll(java.lang.String name) {
        this(name, SmDevicesUnenrollArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmDevicesUnenroll(java.lang.String name, SmDevicesUnenrollArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmDevicesUnenroll(java.lang.String name, SmDevicesUnenrollArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smDevicesUnenroll:SmDevicesUnenroll", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SmDevicesUnenroll(java.lang.String name, Output<java.lang.String> id, @Nullable SmDevicesUnenrollState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/smDevicesUnenroll:SmDevicesUnenroll", name, state, makeResourceOptions(options, id), false);
    }

    private static SmDevicesUnenrollArgs makeArgs(SmDevicesUnenrollArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SmDevicesUnenrollArgs.Empty : args;
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
    public static SmDevicesUnenroll get(java.lang.String name, Output<java.lang.String> id, @Nullable SmDevicesUnenrollState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmDevicesUnenroll(name, id, state, options);
    }
}
