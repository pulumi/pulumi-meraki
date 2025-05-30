// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.WirelessSsidsDeviceTypeGroupPoliciesArgs;
import com.pulumi.meraki.networks.inputs.WirelessSsidsDeviceTypeGroupPoliciesState;
import com.pulumi.meraki.networks.outputs.WirelessSsidsDeviceTypeGroupPoliciesDeviceTypePolicy;
import java.lang.Boolean;
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
 * $ pulumi import meraki:networks/wirelessSsidsDeviceTypeGroupPolicies:WirelessSsidsDeviceTypeGroupPolicies example &#34;network_id,number&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/wirelessSsidsDeviceTypeGroupPolicies:WirelessSsidsDeviceTypeGroupPolicies")
public class WirelessSsidsDeviceTypeGroupPolicies extends com.pulumi.resources.CustomResource {
    /**
     * List of device type policies.
     * 
     */
    @Export(name="deviceTypePolicies", refs={List.class,WirelessSsidsDeviceTypeGroupPoliciesDeviceTypePolicy.class}, tree="[0,1]")
    private Output<List<WirelessSsidsDeviceTypeGroupPoliciesDeviceTypePolicy>> deviceTypePolicies;

    /**
     * @return List of device type policies.
     * 
     */
    public Output<List<WirelessSsidsDeviceTypeGroupPoliciesDeviceTypePolicy>> deviceTypePolicies() {
        return this.deviceTypePolicies;
    }
    /**
     * If true, the SSID device type group policies are enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return If true, the SSID device type group policies are enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
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
     * number path parameter.
     * 
     */
    @Export(name="number", refs={String.class}, tree="[0]")
    private Output<String> number;

    /**
     * @return number path parameter.
     * 
     */
    public Output<String> number() {
        return this.number;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WirelessSsidsDeviceTypeGroupPolicies(java.lang.String name) {
        this(name, WirelessSsidsDeviceTypeGroupPoliciesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WirelessSsidsDeviceTypeGroupPolicies(java.lang.String name, WirelessSsidsDeviceTypeGroupPoliciesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WirelessSsidsDeviceTypeGroupPolicies(java.lang.String name, WirelessSsidsDeviceTypeGroupPoliciesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/wirelessSsidsDeviceTypeGroupPolicies:WirelessSsidsDeviceTypeGroupPolicies", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WirelessSsidsDeviceTypeGroupPolicies(java.lang.String name, Output<java.lang.String> id, @Nullable WirelessSsidsDeviceTypeGroupPoliciesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/wirelessSsidsDeviceTypeGroupPolicies:WirelessSsidsDeviceTypeGroupPolicies", name, state, makeResourceOptions(options, id), false);
    }

    private static WirelessSsidsDeviceTypeGroupPoliciesArgs makeArgs(WirelessSsidsDeviceTypeGroupPoliciesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WirelessSsidsDeviceTypeGroupPoliciesArgs.Empty : args;
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
    public static WirelessSsidsDeviceTypeGroupPolicies get(java.lang.String name, Output<java.lang.String> id, @Nullable WirelessSsidsDeviceTypeGroupPoliciesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WirelessSsidsDeviceTypeGroupPolicies(name, id, state, options);
    }
}
