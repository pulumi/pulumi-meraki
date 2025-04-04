// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.CloneArgs;
import com.pulumi.meraki.organizations.inputs.CloneState;
import com.pulumi.meraki.organizations.outputs.CloneItem;
import com.pulumi.meraki.organizations.outputs.CloneParameters;
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
 * import com.pulumi.meraki.organizations.Clone;
 * import com.pulumi.meraki.organizations.CloneArgs;
 * import com.pulumi.meraki.organizations.inputs.CloneParametersArgs;
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
 *         var example = new Clone("example", CloneArgs.builder()
 *             .organizationId("string")
 *             .parameters(CloneParametersArgs.builder()
 *                 .name("My organization")
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsCloneExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="meraki:organizations/clone:Clone")
public class Clone extends com.pulumi.resources.CustomResource {
    @Export(name="item", refs={CloneItem.class}, tree="[0]")
    private Output<CloneItem> item;

    public Output<CloneItem> item() {
        return this.item;
    }
    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    @Export(name="parameters", refs={CloneParameters.class}, tree="[0]")
    private Output<CloneParameters> parameters;

    public Output<CloneParameters> parameters() {
        return this.parameters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Clone(java.lang.String name) {
        this(name, CloneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Clone(java.lang.String name, CloneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Clone(java.lang.String name, CloneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/clone:Clone", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Clone(java.lang.String name, Output<java.lang.String> id, @Nullable CloneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/clone:Clone", name, state, makeResourceOptions(options, id), false);
    }

    private static CloneArgs makeArgs(CloneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CloneArgs.Empty : args;
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
    public static Clone get(java.lang.String name, Output<java.lang.String> id, @Nullable CloneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Clone(name, id, state, options);
    }
}
