// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.devices.BaseArgs;
import com.pulumi.meraki.devices.inputs.BaseState;
import com.pulumi.meraki.devices.outputs.BaseDetail;
import java.lang.Boolean;
import java.lang.Double;
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
 * $ pulumi import meraki:devices/base:base example &#34;organization_id,serial&#34;
 * ```
 * 
 */
@ResourceType(type="meraki:devices/base:base")
public class Base extends com.pulumi.resources.CustomResource {
    /**
     * Physical address of the device
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return Physical address of the device
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * Additional device information
     * 
     */
    @Export(name="details", refs={List.class,BaseDetail.class}, tree="[0,1]")
    private Output<List<BaseDetail>> details;

    /**
     * @return Additional device information
     * 
     */
    public Output<List<BaseDetail>> details() {
        return this.details;
    }
    /**
     * Firmware version of the device
     * 
     */
    @Export(name="firmware", refs={String.class}, tree="[0]")
    private Output<String> firmware;

    /**
     * @return Firmware version of the device
     * 
     */
    public Output<String> firmware() {
        return this.firmware;
    }
    /**
     * The floor plan to associate to this device. null disassociates the device from the floorplan.
     * 
     */
    @Export(name="floorPlanId", refs={String.class}, tree="[0]")
    private Output<String> floorPlanId;

    /**
     * @return The floor plan to associate to this device. null disassociates the device from the floorplan.
     * 
     */
    public Output<String> floorPlanId() {
        return this.floorPlanId;
    }
    /**
     * IMEI of the device, if applicable
     * 
     */
    @Export(name="imei", refs={String.class}, tree="[0]")
    private Output<String> imei;

    /**
     * @return IMEI of the device, if applicable
     * 
     */
    public Output<String> imei() {
        return this.imei;
    }
    /**
     * LAN IP address of the device
     * 
     */
    @Export(name="lanIp", refs={String.class}, tree="[0]")
    private Output<String> lanIp;

    /**
     * @return LAN IP address of the device
     * 
     */
    public Output<String> lanIp() {
        return this.lanIp;
    }
    /**
     * Latitude of the device
     * 
     */
    @Export(name="lat", refs={Double.class}, tree="[0]")
    private Output<Double> lat;

    /**
     * @return Latitude of the device
     * 
     */
    public Output<Double> lat() {
        return this.lat;
    }
    /**
     * Longitude of the device
     * 
     */
    @Export(name="lng", refs={Double.class}, tree="[0]")
    private Output<Double> lng;

    /**
     * @return Longitude of the device
     * 
     */
    public Output<Double> lng() {
        return this.lng;
    }
    /**
     * MAC address of the device
     * 
     */
    @Export(name="mac", refs={String.class}, tree="[0]")
    private Output<String> mac;

    /**
     * @return MAC address of the device
     * 
     */
    public Output<String> mac() {
        return this.mac;
    }
    /**
     * Model of the device
     * 
     */
    @Export(name="model", refs={String.class}, tree="[0]")
    private Output<String> model;

    /**
     * @return Model of the device
     * 
     */
    public Output<String> model() {
        return this.model;
    }
    /**
     * Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
     * 
     */
    @Export(name="moveMapMarker", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> moveMapMarker;

    /**
     * @return Whether or not to set the latitude and longitude of a device based on the new address. Only applies when lat and lng are not specified.
     * 
     */
    public Output<Boolean> moveMapMarker() {
        return this.moveMapMarker;
    }
    /**
     * Name of the device
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the device
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * ID of the network the device belongs to
     * 
     */
    @Export(name="networkId", refs={String.class}, tree="[0]")
    private Output<String> networkId;

    /**
     * @return ID of the network the device belongs to
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }
    /**
     * Notes for the device, limited to 255 characters
     * 
     */
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output<String> notes;

    /**
     * @return Notes for the device, limited to 255 characters
     * 
     */
    public Output<String> notes() {
        return this.notes;
    }
    /**
     * Product type of the device
     * 
     */
    @Export(name="productType", refs={String.class}, tree="[0]")
    private Output<String> productType;

    /**
     * @return Product type of the device
     * 
     */
    public Output<String> productType() {
        return this.productType;
    }
    /**
     * Serial number of the device
     * 
     */
    @Export(name="serial", refs={String.class}, tree="[0]")
    private Output<String> serial;

    /**
     * @return Serial number of the device
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }
    /**
     * The ID of a switch template to bind to the device (for available switch templates, see the &#39;Switch Templates&#39; endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
     * 
     */
    @Export(name="switchProfileId", refs={String.class}, tree="[0]")
    private Output<String> switchProfileId;

    /**
     * @return The ID of a switch template to bind to the device (for available switch templates, see the &#39;Switch Templates&#39; endpoint). Use null to unbind the switch device from the current profile. For a device to be bindable to a switch template, it must (1) be a switch, and (2) belong to a network that is bound to a configuration template.
     * 
     */
    public Output<String> switchProfileId() {
        return this.switchProfileId;
    }
    /**
     * List of tags assigned to the device
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return List of tags assigned to the device
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Base(String name) {
        this(name, BaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Base(String name, BaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Base(String name, BaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/base:base", name, args == null ? BaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Base(String name, Output<String> id, @Nullable BaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("meraki:devices/base:base", name, state, makeResourceOptions(options, id));
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
    public static Base get(String name, Output<String> id, @Nullable BaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Base(name, id, state, options);
    }
}