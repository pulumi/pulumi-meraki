// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.organizations.AdminsArgs;
import com.pulumi.meraki.organizations.inputs.AdminsState;
import com.pulumi.meraki.organizations.outputs.AdminsNetwork;
import com.pulumi.meraki.organizations.outputs.AdminsTag;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
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
 * import com.pulumi.meraki.organizations.Admins;
 * import com.pulumi.meraki.organizations.AdminsArgs;
 * import com.pulumi.meraki.organizations.inputs.AdminsNetworkArgs;
 * import com.pulumi.meraki.organizations.inputs.AdminsTagArgs;
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
 *         var example = new Admins("example", AdminsArgs.builder()
 *             .authenticationMethod("Email")
 *             .email("miles{@literal @}meraki.com")
 *             .name("Miles Meraki")
 *             .networks(AdminsNetworkArgs.builder()
 *                 .access("full")
 *                 .id("N_24329156")
 *                 .build())
 *             .orgAccess("none")
 *             .organizationId("string")
 *             .tags(AdminsTagArgs.builder()
 *                 .access("read-only")
 *                 .tag("west")
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiOrganizationsAdminsExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:organizations/admins:Admins example &#34;organization_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:organizations/admins:Admins")
public class Admins extends com.pulumi.resources.CustomResource {
    /**
     * Status of the admin&#39;s account
     * 
     */
    @Export(name="accountStatus", refs={String.class}, tree="[0]")
    private Output<String> accountStatus;

    /**
     * @return Status of the admin&#39;s account
     * 
     */
    public Output<String> accountStatus() {
        return this.accountStatus;
    }
    /**
     * adminId path parameter. Admin ID
     * 
     */
    @Export(name="adminId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> adminId;

    /**
     * @return adminId path parameter. Admin ID
     * 
     */
    public Output<Optional<String>> adminId() {
        return Codegen.optional(this.adminId);
    }
    /**
     * Admin&#39;s authentication method
     * 
     */
    @Export(name="authenticationMethod", refs={String.class}, tree="[0]")
    private Output<String> authenticationMethod;

    /**
     * @return Admin&#39;s authentication method
     * 
     */
    public Output<String> authenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * Admin&#39;s email address
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    /**
     * @return Admin&#39;s email address
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * Indicates whether the admin has an API key
     * 
     */
    @Export(name="hasApiKey", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> hasApiKey;

    /**
     * @return Indicates whether the admin has an API key
     * 
     */
    public Output<Boolean> hasApiKey() {
        return this.hasApiKey;
    }
    /**
     * Time when the admin was last active
     * 
     */
    @Export(name="lastActive", refs={String.class}, tree="[0]")
    private Output<String> lastActive;

    /**
     * @return Time when the admin was last active
     * 
     */
    public Output<String> lastActive() {
        return this.lastActive;
    }
    /**
     * Admin&#39;s username
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Admin&#39;s username
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Admin network access information
     * 
     */
    @Export(name="networks", refs={List.class,AdminsNetwork.class}, tree="[0,1]")
    private Output<List<AdminsNetwork>> networks;

    /**
     * @return Admin network access information
     * 
     */
    public Output<List<AdminsNetwork>> networks() {
        return this.networks;
    }
    /**
     * Admin&#39;s level of access to the organization
     * 
     */
    @Export(name="orgAccess", refs={String.class}, tree="[0]")
    private Output<String> orgAccess;

    /**
     * @return Admin&#39;s level of access to the organization
     * 
     */
    public Output<String> orgAccess() {
        return this.orgAccess;
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
    /**
     * Admin tag information
     * 
     */
    @Export(name="tags", refs={List.class,AdminsTag.class}, tree="[0,1]")
    private Output<List<AdminsTag>> tags;

    /**
     * @return Admin tag information
     * 
     */
    public Output<List<AdminsTag>> tags() {
        return this.tags;
    }
    /**
     * Indicates whether two-factor authentication is enabled
     * 
     */
    @Export(name="twoFactorAuthEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> twoFactorAuthEnabled;

    /**
     * @return Indicates whether two-factor authentication is enabled
     * 
     */
    public Output<Boolean> twoFactorAuthEnabled() {
        return this.twoFactorAuthEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Admins(String name) {
        this(name, AdminsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Admins(String name, AdminsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Admins(String name, AdminsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/admins:Admins", name, args == null ? AdminsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Admins(String name, Output<String> id, @Nullable AdminsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:organizations/admins:Admins", name, state, makeResourceOptions(options, id));
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
    public static Admins get(String name, Output<String> id, @Nullable AdminsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Admins(name, id, state, options);
    }
}