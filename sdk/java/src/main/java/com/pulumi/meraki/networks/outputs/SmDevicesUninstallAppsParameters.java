// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SmDevicesUninstallAppsParameters {
    /**
     * @return ids of applications to be uninstalled
     * 
     */
    private @Nullable List<String> appIds;

    private SmDevicesUninstallAppsParameters() {}
    /**
     * @return ids of applications to be uninstalled
     * 
     */
    public List<String> appIds() {
        return this.appIds == null ? List.of() : this.appIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmDevicesUninstallAppsParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> appIds;
        public Builder() {}
        public Builder(SmDevicesUninstallAppsParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appIds = defaults.appIds;
        }

        @CustomType.Setter
        public Builder appIds(@Nullable List<String> appIds) {

            this.appIds = appIds;
            return this;
        }
        public Builder appIds(String... appIds) {
            return appIds(List.of(appIds));
        }
        public SmDevicesUninstallAppsParameters build() {
            final var _resultValue = new SmDevicesUninstallAppsParameters();
            _resultValue.appIds = appIds;
            return _resultValue;
        }
    }
}
