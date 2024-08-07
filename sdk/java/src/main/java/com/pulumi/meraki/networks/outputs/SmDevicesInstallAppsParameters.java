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
public final class SmDevicesInstallAppsParameters {
    /**
     * @return ids of applications to be installed
     * 
     */
    private @Nullable List<String> appIds;
    /**
     * @return By default, installation of an app which is believed to already be present on the device will be skipped. If you&#39;d like to force the installation of the app, set this parameter to true.
     * 
     */
    private @Nullable Boolean force;

    private SmDevicesInstallAppsParameters() {}
    /**
     * @return ids of applications to be installed
     * 
     */
    public List<String> appIds() {
        return this.appIds == null ? List.of() : this.appIds;
    }
    /**
     * @return By default, installation of an app which is believed to already be present on the device will be skipped. If you&#39;d like to force the installation of the app, set this parameter to true.
     * 
     */
    public Optional<Boolean> force() {
        return Optional.ofNullable(this.force);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmDevicesInstallAppsParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> appIds;
        private @Nullable Boolean force;
        public Builder() {}
        public Builder(SmDevicesInstallAppsParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appIds = defaults.appIds;
    	      this.force = defaults.force;
        }

        @CustomType.Setter
        public Builder appIds(@Nullable List<String> appIds) {

            this.appIds = appIds;
            return this;
        }
        public Builder appIds(String... appIds) {
            return appIds(List.of(appIds));
        }
        @CustomType.Setter
        public Builder force(@Nullable Boolean force) {

            this.force = force;
            return this;
        }
        public SmDevicesInstallAppsParameters build() {
            final var _resultValue = new SmDevicesInstallAppsParameters();
            _resultValue.appIds = appIds;
            _resultValue.force = force;
            return _resultValue;
        }
    }
}
