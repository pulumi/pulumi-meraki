// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetLicensesOverviewItemStatesActive;
import com.pulumi.meraki.organizations.outputs.GetLicensesOverviewItemStatesExpired;
import com.pulumi.meraki.organizations.outputs.GetLicensesOverviewItemStatesExpiring;
import com.pulumi.meraki.organizations.outputs.GetLicensesOverviewItemStatesRecentlyQueued;
import com.pulumi.meraki.organizations.outputs.GetLicensesOverviewItemStatesUnused;
import com.pulumi.meraki.organizations.outputs.GetLicensesOverviewItemStatesUnusedActive;
import java.util.Objects;

@CustomType
public final class GetLicensesOverviewItemStates {
    /**
     * @return Data for active licenses
     * 
     */
    private GetLicensesOverviewItemStatesActive active;
    /**
     * @return Data for expired licenses
     * 
     */
    private GetLicensesOverviewItemStatesExpired expired;
    /**
     * @return Data for expiring licenses
     * 
     */
    private GetLicensesOverviewItemStatesExpiring expiring;
    /**
     * @return Data for recently queued licenses
     * 
     */
    private GetLicensesOverviewItemStatesRecentlyQueued recentlyQueued;
    /**
     * @return Data for unused licenses
     * 
     */
    private GetLicensesOverviewItemStatesUnused unused;
    /**
     * @return Data for unused, active licenses
     * 
     */
    private GetLicensesOverviewItemStatesUnusedActive unusedActive;

    private GetLicensesOverviewItemStates() {}
    /**
     * @return Data for active licenses
     * 
     */
    public GetLicensesOverviewItemStatesActive active() {
        return this.active;
    }
    /**
     * @return Data for expired licenses
     * 
     */
    public GetLicensesOverviewItemStatesExpired expired() {
        return this.expired;
    }
    /**
     * @return Data for expiring licenses
     * 
     */
    public GetLicensesOverviewItemStatesExpiring expiring() {
        return this.expiring;
    }
    /**
     * @return Data for recently queued licenses
     * 
     */
    public GetLicensesOverviewItemStatesRecentlyQueued recentlyQueued() {
        return this.recentlyQueued;
    }
    /**
     * @return Data for unused licenses
     * 
     */
    public GetLicensesOverviewItemStatesUnused unused() {
        return this.unused;
    }
    /**
     * @return Data for unused, active licenses
     * 
     */
    public GetLicensesOverviewItemStatesUnusedActive unusedActive() {
        return this.unusedActive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensesOverviewItemStates defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetLicensesOverviewItemStatesActive active;
        private GetLicensesOverviewItemStatesExpired expired;
        private GetLicensesOverviewItemStatesExpiring expiring;
        private GetLicensesOverviewItemStatesRecentlyQueued recentlyQueued;
        private GetLicensesOverviewItemStatesUnused unused;
        private GetLicensesOverviewItemStatesUnusedActive unusedActive;
        public Builder() {}
        public Builder(GetLicensesOverviewItemStates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.expired = defaults.expired;
    	      this.expiring = defaults.expiring;
    	      this.recentlyQueued = defaults.recentlyQueued;
    	      this.unused = defaults.unused;
    	      this.unusedActive = defaults.unusedActive;
        }

        @CustomType.Setter
        public Builder active(GetLicensesOverviewItemStatesActive active) {
            if (active == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStates", "active");
            }
            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder expired(GetLicensesOverviewItemStatesExpired expired) {
            if (expired == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStates", "expired");
            }
            this.expired = expired;
            return this;
        }
        @CustomType.Setter
        public Builder expiring(GetLicensesOverviewItemStatesExpiring expiring) {
            if (expiring == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStates", "expiring");
            }
            this.expiring = expiring;
            return this;
        }
        @CustomType.Setter
        public Builder recentlyQueued(GetLicensesOverviewItemStatesRecentlyQueued recentlyQueued) {
            if (recentlyQueued == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStates", "recentlyQueued");
            }
            this.recentlyQueued = recentlyQueued;
            return this;
        }
        @CustomType.Setter
        public Builder unused(GetLicensesOverviewItemStatesUnused unused) {
            if (unused == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStates", "unused");
            }
            this.unused = unused;
            return this;
        }
        @CustomType.Setter
        public Builder unusedActive(GetLicensesOverviewItemStatesUnusedActive unusedActive) {
            if (unusedActive == null) {
              throw new MissingRequiredPropertyException("GetLicensesOverviewItemStates", "unusedActive");
            }
            this.unusedActive = unusedActive;
            return this;
        }
        public GetLicensesOverviewItemStates build() {
            final var _resultValue = new GetLicensesOverviewItemStates();
            _resultValue.active = active;
            _resultValue.expired = expired;
            _resultValue.expiring = expiring;
            _resultValue.recentlyQueued = recentlyQueued;
            _resultValue.unused = unused;
            _resultValue.unusedActive = unusedActive;
            return _resultValue;
        }
    }
}