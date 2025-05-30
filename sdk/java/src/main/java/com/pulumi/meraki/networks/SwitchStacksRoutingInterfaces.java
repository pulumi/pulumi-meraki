// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.networks.SwitchStacksRoutingInterfacesArgs;
import com.pulumi.meraki.networks.inputs.SwitchStacksRoutingInterfacesState;
import com.pulumi.meraki.networks.outputs.SwitchStacksRoutingInterfacesIpv6;
import com.pulumi.meraki.networks.outputs.SwitchStacksRoutingInterfacesOspfSettings;
import com.pulumi.meraki.networks.outputs.SwitchStacksRoutingInterfacesOspfV3;
import java.lang.Integer;
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
 * $ pulumi import meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces example &#34;interface_id,network_id,switch_stack_id&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces")
public class SwitchStacksRoutingInterfaces extends com.pulumi.resources.CustomResource {
    /**
     * IPv4 default gateway
     * 
     */
    @Export(name="defaultGateway", refs={String.class}, tree="[0]")
    private Output<String> defaultGateway;

    /**
     * @return IPv4 default gateway
     * 
     */
    public Output<String> defaultGateway() {
        return this.defaultGateway;
    }
    /**
     * IPv4 default gateway
     * 
     */
    @Export(name="defaultGatewayResponse", refs={String.class}, tree="[0]")
    private Output<String> defaultGatewayResponse;

    /**
     * @return IPv4 default gateway
     * 
     */
    public Output<String> defaultGatewayResponse() {
        return this.defaultGatewayResponse;
    }
    /**
     * The id
     * 
     */
    @Export(name="interfaceId", refs={String.class}, tree="[0]")
    private Output<String> interfaceId;

    /**
     * @return The id
     * 
     */
    public Output<String> interfaceId() {
        return this.interfaceId;
    }
    /**
     * IPv4 address
     * 
     */
    @Export(name="interfaceIp", refs={String.class}, tree="[0]")
    private Output<String> interfaceIp;

    /**
     * @return IPv4 address
     * 
     */
    public Output<String> interfaceIp() {
        return this.interfaceIp;
    }
    /**
     * IPv6 addressing
     * 
     */
    @Export(name="ipv6", refs={SwitchStacksRoutingInterfacesIpv6.class}, tree="[0]")
    private Output<SwitchStacksRoutingInterfacesIpv6> ipv6;

    /**
     * @return IPv6 addressing
     * 
     */
    public Output<SwitchStacksRoutingInterfacesIpv6> ipv6() {
        return this.ipv6;
    }
    /**
     * Multicast routing status
     * 
     */
    @Export(name="multicastRouting", refs={String.class}, tree="[0]")
    private Output<String> multicastRouting;

    /**
     * @return Multicast routing status
     * 
     */
    public Output<String> multicastRouting() {
        return this.multicastRouting;
    }
    /**
     * The name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * IPv4 OSPF Settings
     * 
     */
    @Export(name="ospfSettings", refs={SwitchStacksRoutingInterfacesOspfSettings.class}, tree="[0]")
    private Output<SwitchStacksRoutingInterfacesOspfSettings> ospfSettings;

    /**
     * @return IPv4 OSPF Settings
     * 
     */
    public Output<SwitchStacksRoutingInterfacesOspfSettings> ospfSettings() {
        return this.ospfSettings;
    }
    /**
     * IPv6 OSPF Settings
     * 
     */
    @Export(name="ospfV3", refs={SwitchStacksRoutingInterfacesOspfV3.class}, tree="[0]")
    private Output<SwitchStacksRoutingInterfacesOspfV3> ospfV3;

    /**
     * @return IPv6 OSPF Settings
     * 
     */
    public Output<SwitchStacksRoutingInterfacesOspfV3> ospfV3() {
        return this.ospfV3;
    }
    /**
     * IPv4 subnet
     * 
     */
    @Export(name="subnet", refs={String.class}, tree="[0]")
    private Output<String> subnet;

    /**
     * @return IPv4 subnet
     * 
     */
    public Output<String> subnet() {
        return this.subnet;
    }
    /**
     * switchStackId path parameter. Switch stack ID
     * 
     */
    @Export(name="switchStackId", refs={String.class}, tree="[0]")
    private Output<String> switchStackId;

    /**
     * @return switchStackId path parameter. Switch stack ID
     * 
     */
    public Output<String> switchStackId() {
        return this.switchStackId;
    }
    /**
     * VLAN id
     * 
     */
    @Export(name="vlanId", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlanId;

    /**
     * @return VLAN id
     * 
     */
    public Output<Integer> vlanId() {
        return this.vlanId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SwitchStacksRoutingInterfaces(java.lang.String name) {
        this(name, SwitchStacksRoutingInterfacesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SwitchStacksRoutingInterfaces(java.lang.String name, SwitchStacksRoutingInterfacesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SwitchStacksRoutingInterfaces(java.lang.String name, SwitchStacksRoutingInterfacesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SwitchStacksRoutingInterfaces(java.lang.String name, Output<java.lang.String> id, @Nullable SwitchStacksRoutingInterfacesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces", name, state, makeResourceOptions(options, id), false);
    }

    private static SwitchStacksRoutingInterfacesArgs makeArgs(SwitchStacksRoutingInterfacesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SwitchStacksRoutingInterfacesArgs.Empty : args;
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
    public static SwitchStacksRoutingInterfaces get(java.lang.String name, Output<java.lang.String> id, @Nullable SwitchStacksRoutingInterfacesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SwitchStacksRoutingInterfaces(name, id, state, options);
    }
}
