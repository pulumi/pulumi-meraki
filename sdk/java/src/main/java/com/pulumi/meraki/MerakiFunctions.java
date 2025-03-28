// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.meraki.Utilities;
import com.pulumi.meraki.inputs.GetDevicesArgs;
import com.pulumi.meraki.inputs.GetDevicesPlainArgs;
import com.pulumi.meraki.inputs.GetNetworksArgs;
import com.pulumi.meraki.inputs.GetNetworksPlainArgs;
import com.pulumi.meraki.inputs.GetOrganizationsArgs;
import com.pulumi.meraki.inputs.GetOrganizationsPlainArgs;
import com.pulumi.meraki.outputs.GetDevicesResult;
import com.pulumi.meraki.outputs.GetNetworksResult;
import com.pulumi.meraki.outputs.GetOrganizationsResult;
import java.util.concurrent.CompletableFuture;

public final class MerakiFunctions {
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetDevicesResult> getDevices() {
        return getDevices(GetDevicesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDevicesResult> getDevicesPlain() {
        return getDevicesPlain(GetDevicesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetDevicesResult> getDevices(GetDevicesArgs args) {
        return getDevices(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDevicesResult> getDevicesPlain(GetDevicesPlainArgs args) {
        return getDevicesPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetDevicesResult> getDevices(GetDevicesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("meraki:index/getDevices:getDevices", TypeShape.of(GetDevicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetDevicesResult> getDevices(GetDevicesArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("meraki:index/getDevices:getDevices", TypeShape.of(GetDevicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDevicesResult> getDevicesPlain(GetDevicesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("meraki:index/getDevices:getDevices", TypeShape.of(GetDevicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetNetworksResult> getNetworks() {
        return getNetworks(GetNetworksArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworksResult> getNetworksPlain() {
        return getNetworksPlain(GetNetworksPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetNetworksResult> getNetworks(GetNetworksArgs args) {
        return getNetworks(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworksResult> getNetworksPlain(GetNetworksPlainArgs args) {
        return getNetworksPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetNetworksResult> getNetworks(GetNetworksArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("meraki:index/getNetworks:getNetworks", TypeShape.of(GetNetworksResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetNetworksResult> getNetworks(GetNetworksArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("meraki:index/getNetworks:getNetworks", TypeShape.of(GetNetworksResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworksResult> getNetworksPlain(GetNetworksPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("meraki:index/getNetworks:getNetworks", TypeShape.of(GetNetworksResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetOrganizationsResult> getOrganizations() {
        return getOrganizations(GetOrganizationsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOrganizationsResult> getOrganizationsPlain() {
        return getOrganizationsPlain(GetOrganizationsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetOrganizationsResult> getOrganizations(GetOrganizationsArgs args) {
        return getOrganizations(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOrganizationsResult> getOrganizationsPlain(GetOrganizationsPlainArgs args) {
        return getOrganizationsPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetOrganizationsResult> getOrganizations(GetOrganizationsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("meraki:index/getOrganizations:getOrganizations", TypeShape.of(GetOrganizationsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     */
    public static Output<GetOrganizationsResult> getOrganizations(GetOrganizationsArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("meraki:index/getOrganizations:getOrganizations", TypeShape.of(GetOrganizationsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOrganizationsResult> getOrganizationsPlain(GetOrganizationsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("meraki:index/getOrganizations:getOrganizations", TypeShape.of(GetOrganizationsResult.class), args, Utilities.withVersion(options));
    }
}
