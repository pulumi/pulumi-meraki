// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.CameraRolesAppliedOnDeviceArgs;
import com.pulumi.meraki.organizations.inputs.CameraRolesAppliedOnNetworkArgs;
import com.pulumi.meraki.organizations.inputs.CameraRolesAppliedOrgWideArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CameraRolesState extends com.pulumi.resources.ResourceArgs {

    public static final CameraRolesState Empty = new CameraRolesState();

    /**
     * Device tag on which this specified permission is applied.
     * 
     */
    @Import(name="appliedOnDevices")
    private @Nullable Output<List<CameraRolesAppliedOnDeviceArgs>> appliedOnDevices;

    /**
     * @return Device tag on which this specified permission is applied.
     * 
     */
    public Optional<Output<List<CameraRolesAppliedOnDeviceArgs>>> appliedOnDevices() {
        return Optional.ofNullable(this.appliedOnDevices);
    }

    /**
     * Network tag on which this specified permission is applied.
     * 
     */
    @Import(name="appliedOnNetworks")
    private @Nullable Output<List<CameraRolesAppliedOnNetworkArgs>> appliedOnNetworks;

    /**
     * @return Network tag on which this specified permission is applied.
     * 
     */
    public Optional<Output<List<CameraRolesAppliedOnNetworkArgs>>> appliedOnNetworks() {
        return Optional.ofNullable(this.appliedOnNetworks);
    }

    /**
     * Permissions to be applied org wide.
     * 
     */
    @Import(name="appliedOrgWides")
    private @Nullable Output<List<CameraRolesAppliedOrgWideArgs>> appliedOrgWides;

    /**
     * @return Permissions to be applied org wide.
     * 
     */
    public Optional<Output<List<CameraRolesAppliedOrgWideArgs>>> appliedOrgWides() {
        return Optional.ofNullable(this.appliedOrgWides);
    }

    /**
     * The name of the new role. Must be unique. This parameter is required.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the new role. Must be unique. This parameter is required.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * roleId path parameter. Role ID
     * 
     */
    @Import(name="roleId")
    private @Nullable Output<String> roleId;

    /**
     * @return roleId path parameter. Role ID
     * 
     */
    public Optional<Output<String>> roleId() {
        return Optional.ofNullable(this.roleId);
    }

    private CameraRolesState() {}

    private CameraRolesState(CameraRolesState $) {
        this.appliedOnDevices = $.appliedOnDevices;
        this.appliedOnNetworks = $.appliedOnNetworks;
        this.appliedOrgWides = $.appliedOrgWides;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.roleId = $.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CameraRolesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CameraRolesState $;

        public Builder() {
            $ = new CameraRolesState();
        }

        public Builder(CameraRolesState defaults) {
            $ = new CameraRolesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appliedOnDevices Device tag on which this specified permission is applied.
         * 
         * @return builder
         * 
         */
        public Builder appliedOnDevices(@Nullable Output<List<CameraRolesAppliedOnDeviceArgs>> appliedOnDevices) {
            $.appliedOnDevices = appliedOnDevices;
            return this;
        }

        /**
         * @param appliedOnDevices Device tag on which this specified permission is applied.
         * 
         * @return builder
         * 
         */
        public Builder appliedOnDevices(List<CameraRolesAppliedOnDeviceArgs> appliedOnDevices) {
            return appliedOnDevices(Output.of(appliedOnDevices));
        }

        /**
         * @param appliedOnDevices Device tag on which this specified permission is applied.
         * 
         * @return builder
         * 
         */
        public Builder appliedOnDevices(CameraRolesAppliedOnDeviceArgs... appliedOnDevices) {
            return appliedOnDevices(List.of(appliedOnDevices));
        }

        /**
         * @param appliedOnNetworks Network tag on which this specified permission is applied.
         * 
         * @return builder
         * 
         */
        public Builder appliedOnNetworks(@Nullable Output<List<CameraRolesAppliedOnNetworkArgs>> appliedOnNetworks) {
            $.appliedOnNetworks = appliedOnNetworks;
            return this;
        }

        /**
         * @param appliedOnNetworks Network tag on which this specified permission is applied.
         * 
         * @return builder
         * 
         */
        public Builder appliedOnNetworks(List<CameraRolesAppliedOnNetworkArgs> appliedOnNetworks) {
            return appliedOnNetworks(Output.of(appliedOnNetworks));
        }

        /**
         * @param appliedOnNetworks Network tag on which this specified permission is applied.
         * 
         * @return builder
         * 
         */
        public Builder appliedOnNetworks(CameraRolesAppliedOnNetworkArgs... appliedOnNetworks) {
            return appliedOnNetworks(List.of(appliedOnNetworks));
        }

        /**
         * @param appliedOrgWides Permissions to be applied org wide.
         * 
         * @return builder
         * 
         */
        public Builder appliedOrgWides(@Nullable Output<List<CameraRolesAppliedOrgWideArgs>> appliedOrgWides) {
            $.appliedOrgWides = appliedOrgWides;
            return this;
        }

        /**
         * @param appliedOrgWides Permissions to be applied org wide.
         * 
         * @return builder
         * 
         */
        public Builder appliedOrgWides(List<CameraRolesAppliedOrgWideArgs> appliedOrgWides) {
            return appliedOrgWides(Output.of(appliedOrgWides));
        }

        /**
         * @param appliedOrgWides Permissions to be applied org wide.
         * 
         * @return builder
         * 
         */
        public Builder appliedOrgWides(CameraRolesAppliedOrgWideArgs... appliedOrgWides) {
            return appliedOrgWides(List.of(appliedOrgWides));
        }

        /**
         * @param name The name of the new role. Must be unique. This parameter is required.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the new role. Must be unique. This parameter is required.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param roleId roleId path parameter. Role ID
         * 
         * @return builder
         * 
         */
        public Builder roleId(@Nullable Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId roleId path parameter. Role ID
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        public CameraRolesState build() {
            return $;
        }
    }

}
