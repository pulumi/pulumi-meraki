// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesItemProductsApplianceAvailableVersion;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesItemProductsApplianceCurrentVersion;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesItemProductsApplianceLastUpgrade;
import com.pulumi.meraki.networks.outputs.GetFirmwareUpgradesItemProductsApplianceNextUpgrade;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFirmwareUpgradesItemProductsAppliance {
    /**
     * @return Firmware versions available for upgrade
     * 
     */
    private List<GetFirmwareUpgradesItemProductsApplianceAvailableVersion> availableVersions;
    /**
     * @return Details of the current version on the device
     * 
     */
    private GetFirmwareUpgradesItemProductsApplianceCurrentVersion currentVersion;
    /**
     * @return Details of the last firmware upgrade on the device
     * 
     */
    private GetFirmwareUpgradesItemProductsApplianceLastUpgrade lastUpgrade;
    /**
     * @return Details of the next firmware upgrade on the device
     * 
     */
    private GetFirmwareUpgradesItemProductsApplianceNextUpgrade nextUpgrade;
    /**
     * @return Whether or not the network wants beta firmware
     * 
     */
    private Boolean participateInNextBetaRelease;

    private GetFirmwareUpgradesItemProductsAppliance() {}
    /**
     * @return Firmware versions available for upgrade
     * 
     */
    public List<GetFirmwareUpgradesItemProductsApplianceAvailableVersion> availableVersions() {
        return this.availableVersions;
    }
    /**
     * @return Details of the current version on the device
     * 
     */
    public GetFirmwareUpgradesItemProductsApplianceCurrentVersion currentVersion() {
        return this.currentVersion;
    }
    /**
     * @return Details of the last firmware upgrade on the device
     * 
     */
    public GetFirmwareUpgradesItemProductsApplianceLastUpgrade lastUpgrade() {
        return this.lastUpgrade;
    }
    /**
     * @return Details of the next firmware upgrade on the device
     * 
     */
    public GetFirmwareUpgradesItemProductsApplianceNextUpgrade nextUpgrade() {
        return this.nextUpgrade;
    }
    /**
     * @return Whether or not the network wants beta firmware
     * 
     */
    public Boolean participateInNextBetaRelease() {
        return this.participateInNextBetaRelease;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirmwareUpgradesItemProductsAppliance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFirmwareUpgradesItemProductsApplianceAvailableVersion> availableVersions;
        private GetFirmwareUpgradesItemProductsApplianceCurrentVersion currentVersion;
        private GetFirmwareUpgradesItemProductsApplianceLastUpgrade lastUpgrade;
        private GetFirmwareUpgradesItemProductsApplianceNextUpgrade nextUpgrade;
        private Boolean participateInNextBetaRelease;
        public Builder() {}
        public Builder(GetFirmwareUpgradesItemProductsAppliance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableVersions = defaults.availableVersions;
    	      this.currentVersion = defaults.currentVersion;
    	      this.lastUpgrade = defaults.lastUpgrade;
    	      this.nextUpgrade = defaults.nextUpgrade;
    	      this.participateInNextBetaRelease = defaults.participateInNextBetaRelease;
        }

        @CustomType.Setter
        public Builder availableVersions(List<GetFirmwareUpgradesItemProductsApplianceAvailableVersion> availableVersions) {
            if (availableVersions == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsAppliance", "availableVersions");
            }
            this.availableVersions = availableVersions;
            return this;
        }
        public Builder availableVersions(GetFirmwareUpgradesItemProductsApplianceAvailableVersion... availableVersions) {
            return availableVersions(List.of(availableVersions));
        }
        @CustomType.Setter
        public Builder currentVersion(GetFirmwareUpgradesItemProductsApplianceCurrentVersion currentVersion) {
            if (currentVersion == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsAppliance", "currentVersion");
            }
            this.currentVersion = currentVersion;
            return this;
        }
        @CustomType.Setter
        public Builder lastUpgrade(GetFirmwareUpgradesItemProductsApplianceLastUpgrade lastUpgrade) {
            if (lastUpgrade == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsAppliance", "lastUpgrade");
            }
            this.lastUpgrade = lastUpgrade;
            return this;
        }
        @CustomType.Setter
        public Builder nextUpgrade(GetFirmwareUpgradesItemProductsApplianceNextUpgrade nextUpgrade) {
            if (nextUpgrade == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsAppliance", "nextUpgrade");
            }
            this.nextUpgrade = nextUpgrade;
            return this;
        }
        @CustomType.Setter
        public Builder participateInNextBetaRelease(Boolean participateInNextBetaRelease) {
            if (participateInNextBetaRelease == null) {
              throw new MissingRequiredPropertyException("GetFirmwareUpgradesItemProductsAppliance", "participateInNextBetaRelease");
            }
            this.participateInNextBetaRelease = participateInNextBetaRelease;
            return this;
        }
        public GetFirmwareUpgradesItemProductsAppliance build() {
            final var _resultValue = new GetFirmwareUpgradesItemProductsAppliance();
            _resultValue.availableVersions = availableVersions;
            _resultValue.currentVersion = currentVersion;
            _resultValue.lastUpgrade = lastUpgrade;
            _resultValue.nextUpgrade = nextUpgrade;
            _resultValue.participateInNextBetaRelease = participateInNextBetaRelease;
            return _resultValue;
        }
    }
}