// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.ApplianceTrafficShapingUplinkSelectionArgs;
import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionState;
import com.pulumi.meraki.networks.outputs.ApplianceTrafficShapingUplinkSelectionFailoverAndFailback;
import com.pulumi.meraki.networks.outputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreference;
import com.pulumi.meraki.networks.outputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreference;
import java.lang.Boolean;
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
 * import com.pulumi.meraki.networks.ApplianceTrafficShapingUplinkSelection;
 * import com.pulumi.meraki.networks.ApplianceTrafficShapingUplinkSelectionArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackImmediateArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs;
 * import com.pulumi.meraki.networks.inputs.ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs;
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
 *         var example = new ApplianceTrafficShapingUplinkSelection("example", ApplianceTrafficShapingUplinkSelectionArgs.builder()
 *             .activeActiveAutoVpnEnabled(true)
 *             .defaultUplink("wan1")
 *             .failoverAndFailback(ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackArgs.builder()
 *                 .immediate(ApplianceTrafficShapingUplinkSelectionFailoverAndFailbackImmediateArgs.builder()
 *                     .enabled(true)
 *                     .build())
 *                 .build())
 *             .loadBalancingEnabled(true)
 *             .networkId("string")
 *             .vpnTrafficUplinkPreferences(ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreferenceArgs.builder()
 *                 .fail_over_criterion("poorPerformance")
 *                 .performance_class(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .preferred_uplink("bestForVoIP")
 *                 .traffic_filters(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .build())
 *             .wanTrafficUplinkPreferences(ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreferenceArgs.builder()
 *                 .preferred_uplink("wan1")
 *                 .traffic_filters(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .build())
 *             .build());
 * 
 *         ctx.export("merakiNetworksApplianceTrafficShapingUplinkSelectionExample", example);
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import meraki:networks/applianceTrafficShapingUplinkSelection:ApplianceTrafficShapingUplinkSelection example &#34;network_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/applianceTrafficShapingUplinkSelection:ApplianceTrafficShapingUplinkSelection")
public class ApplianceTrafficShapingUplinkSelection extends com.pulumi.resources.CustomResource {
    /**
     * Whether active-active AutoVPN is enabled
     * 
     */
    @Export(name="activeActiveAutoVpnEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> activeActiveAutoVpnEnabled;

    /**
     * @return Whether active-active AutoVPN is enabled
     * 
     */
    public Output<Boolean> activeActiveAutoVpnEnabled() {
        return this.activeActiveAutoVpnEnabled;
    }
    /**
     * The default uplink. Must be one of: &#39;wan1&#39; or &#39;wan2&#39;
     * 
     */
    @Export(name="defaultUplink", refs={String.class}, tree="[0]")
    private Output<String> defaultUplink;

    /**
     * @return The default uplink. Must be one of: &#39;wan1&#39; or &#39;wan2&#39;
     * 
     */
    public Output<String> defaultUplink() {
        return this.defaultUplink;
    }
    /**
     * WAN failover and failback
     * 
     */
    @Export(name="failoverAndFailback", refs={ApplianceTrafficShapingUplinkSelectionFailoverAndFailback.class}, tree="[0]")
    private Output<ApplianceTrafficShapingUplinkSelectionFailoverAndFailback> failoverAndFailback;

    /**
     * @return WAN failover and failback
     * 
     */
    public Output<ApplianceTrafficShapingUplinkSelectionFailoverAndFailback> failoverAndFailback() {
        return this.failoverAndFailback;
    }
    /**
     * Whether load balancing is enabled
     * 
     */
    @Export(name="loadBalancingEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> loadBalancingEnabled;

    /**
     * @return Whether load balancing is enabled
     * 
     */
    public Output<Boolean> loadBalancingEnabled() {
        return this.loadBalancingEnabled;
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
     * Uplink preference rules for VPN traffic
     * 
     */
    @Export(name="vpnTrafficUplinkPreferences", refs={List.class,ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreference.class}, tree="[0,1]")
    private Output<List<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreference>> vpnTrafficUplinkPreferences;

    /**
     * @return Uplink preference rules for VPN traffic
     * 
     */
    public Output<List<ApplianceTrafficShapingUplinkSelectionVpnTrafficUplinkPreference>> vpnTrafficUplinkPreferences() {
        return this.vpnTrafficUplinkPreferences;
    }
    /**
     * Uplink preference rules for WAN traffic
     * 
     */
    @Export(name="wanTrafficUplinkPreferences", refs={List.class,ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreference.class}, tree="[0,1]")
    private Output<List<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreference>> wanTrafficUplinkPreferences;

    /**
     * @return Uplink preference rules for WAN traffic
     * 
     */
    public Output<List<ApplianceTrafficShapingUplinkSelectionWanTrafficUplinkPreference>> wanTrafficUplinkPreferences() {
        return this.wanTrafficUplinkPreferences;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplianceTrafficShapingUplinkSelection(String name) {
        this(name, ApplianceTrafficShapingUplinkSelectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplianceTrafficShapingUplinkSelection(String name, ApplianceTrafficShapingUplinkSelectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplianceTrafficShapingUplinkSelection(String name, ApplianceTrafficShapingUplinkSelectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceTrafficShapingUplinkSelection:ApplianceTrafficShapingUplinkSelection", name, args == null ? ApplianceTrafficShapingUplinkSelectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplianceTrafficShapingUplinkSelection(String name, Output<String> id, @Nullable ApplianceTrafficShapingUplinkSelectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/applianceTrafficShapingUplinkSelection:ApplianceTrafficShapingUplinkSelection", name, state, makeResourceOptions(options, id));
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
    public static ApplianceTrafficShapingUplinkSelection get(String name, Output<String> id, @Nullable ApplianceTrafficShapingUplinkSelectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplianceTrafficShapingUplinkSelection(name, id, state, options);
    }
}