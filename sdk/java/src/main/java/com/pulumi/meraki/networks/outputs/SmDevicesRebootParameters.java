// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SmDevicesRebootParameters {
    /**
     * @return The ids of the endpoints to be rebooted.
     * 
     */
    private @Nullable List<String> ids;
    /**
     * @return The KextPaths of the endpoints to be rebooted. Available for macOS 11+
     * 
     */
    private @Nullable List<String> kextPaths;
    /**
     * @return Whether or not to notify the user before rebooting the endpoint. Available for macOS 11.3+
     * 
     */
    private @Nullable Boolean notifyUser;
    /**
     * @return Whether or not to rebuild the kernel cache when rebooting the endpoint. Available for macOS 11+
     * 
     */
    private @Nullable Boolean rebuildKernelCache;
    /**
     * @return Whether or not the request requires network tethering. Available for macOS and supervised iOS or tvOS
     * 
     */
    private @Nullable Boolean requestRequiresNetworkTether;
    /**
     * @return The scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags of the endpoints to be rebooted.
     * 
     */
    private @Nullable List<String> scopes;
    /**
     * @return The serials of the endpoints to be rebooted.
     * 
     */
    private @Nullable List<String> serials;
    /**
     * @return The wifiMacs of the endpoints to be rebooted.
     * 
     */
    private @Nullable List<String> wifiMacs;

    private SmDevicesRebootParameters() {}
    /**
     * @return The ids of the endpoints to be rebooted.
     * 
     */
    public List<String> ids() {
        return this.ids == null ? List.of() : this.ids;
    }
    /**
     * @return The KextPaths of the endpoints to be rebooted. Available for macOS 11+
     * 
     */
    public List<String> kextPaths() {
        return this.kextPaths == null ? List.of() : this.kextPaths;
    }
    /**
     * @return Whether or not to notify the user before rebooting the endpoint. Available for macOS 11.3+
     * 
     */
    public Optional<Boolean> notifyUser() {
        return Optional.ofNullable(this.notifyUser);
    }
    /**
     * @return Whether or not to rebuild the kernel cache when rebooting the endpoint. Available for macOS 11+
     * 
     */
    public Optional<Boolean> rebuildKernelCache() {
        return Optional.ofNullable(this.rebuildKernelCache);
    }
    /**
     * @return Whether or not the request requires network tethering. Available for macOS and supervised iOS or tvOS
     * 
     */
    public Optional<Boolean> requestRequiresNetworkTether() {
        return Optional.ofNullable(this.requestRequiresNetworkTether);
    }
    /**
     * @return The scope (one of all, none, withAny, withAll, withoutAny, or withoutAll) and a set of tags of the endpoints to be rebooted.
     * 
     */
    public List<String> scopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }
    /**
     * @return The serials of the endpoints to be rebooted.
     * 
     */
    public List<String> serials() {
        return this.serials == null ? List.of() : this.serials;
    }
    /**
     * @return The wifiMacs of the endpoints to be rebooted.
     * 
     */
    public List<String> wifiMacs() {
        return this.wifiMacs == null ? List.of() : this.wifiMacs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmDevicesRebootParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> ids;
        private @Nullable List<String> kextPaths;
        private @Nullable Boolean notifyUser;
        private @Nullable Boolean rebuildKernelCache;
        private @Nullable Boolean requestRequiresNetworkTether;
        private @Nullable List<String> scopes;
        private @Nullable List<String> serials;
        private @Nullable List<String> wifiMacs;
        public Builder() {}
        public Builder(SmDevicesRebootParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ids = defaults.ids;
    	      this.kextPaths = defaults.kextPaths;
    	      this.notifyUser = defaults.notifyUser;
    	      this.rebuildKernelCache = defaults.rebuildKernelCache;
    	      this.requestRequiresNetworkTether = defaults.requestRequiresNetworkTether;
    	      this.scopes = defaults.scopes;
    	      this.serials = defaults.serials;
    	      this.wifiMacs = defaults.wifiMacs;
        }

        @CustomType.Setter
        public Builder ids(@Nullable List<String> ids) {

            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder kextPaths(@Nullable List<String> kextPaths) {

            this.kextPaths = kextPaths;
            return this;
        }
        public Builder kextPaths(String... kextPaths) {
            return kextPaths(List.of(kextPaths));
        }
        @CustomType.Setter
        public Builder notifyUser(@Nullable Boolean notifyUser) {

            this.notifyUser = notifyUser;
            return this;
        }
        @CustomType.Setter
        public Builder rebuildKernelCache(@Nullable Boolean rebuildKernelCache) {

            this.rebuildKernelCache = rebuildKernelCache;
            return this;
        }
        @CustomType.Setter
        public Builder requestRequiresNetworkTether(@Nullable Boolean requestRequiresNetworkTether) {

            this.requestRequiresNetworkTether = requestRequiresNetworkTether;
            return this;
        }
        @CustomType.Setter
        public Builder scopes(@Nullable List<String> scopes) {

            this.scopes = scopes;
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        @CustomType.Setter
        public Builder serials(@Nullable List<String> serials) {

            this.serials = serials;
            return this;
        }
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }
        @CustomType.Setter
        public Builder wifiMacs(@Nullable List<String> wifiMacs) {

            this.wifiMacs = wifiMacs;
            return this;
        }
        public Builder wifiMacs(String... wifiMacs) {
            return wifiMacs(List.of(wifiMacs));
        }
        public SmDevicesRebootParameters build() {
            final var _resultValue = new SmDevicesRebootParameters();
            _resultValue.ids = ids;
            _resultValue.kextPaths = kextPaths;
            _resultValue.notifyUser = notifyUser;
            _resultValue.rebuildKernelCache = rebuildKernelCache;
            _resultValue.requestRequiresNetworkTether = requestRequiresNetworkTether;
            _resultValue.scopes = scopes;
            _resultValue.serials = serials;
            _resultValue.wifiMacs = wifiMacs;
            return _resultValue;
        }
    }
}