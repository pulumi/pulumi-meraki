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
public final class SwitchRoutingMulticastOverride {
    /**
     * @return Flood unknown multicast traffic enabled for switches, switch stacks or switch templates
     * 
     */
    private @Nullable Boolean floodUnknownMulticastTrafficEnabled;
    /**
     * @return IGMP snooping enabled for switches, switch stacks or switch templates
     * 
     */
    private @Nullable Boolean igmpSnoopingEnabled;
    /**
     * @return (optional) List of switch stack ids for non-template network
     * 
     */
    private @Nullable List<String> stacks;
    /**
     * @return (optional) List of switch templates ids for template network
     * 
     */
    private @Nullable List<String> switchProfiles;
    /**
     * @return (optional) List of switch serials for non-template network
     * 
     */
    private @Nullable List<String> switches;

    private SwitchRoutingMulticastOverride() {}
    /**
     * @return Flood unknown multicast traffic enabled for switches, switch stacks or switch templates
     * 
     */
    public Optional<Boolean> floodUnknownMulticastTrafficEnabled() {
        return Optional.ofNullable(this.floodUnknownMulticastTrafficEnabled);
    }
    /**
     * @return IGMP snooping enabled for switches, switch stacks or switch templates
     * 
     */
    public Optional<Boolean> igmpSnoopingEnabled() {
        return Optional.ofNullable(this.igmpSnoopingEnabled);
    }
    /**
     * @return (optional) List of switch stack ids for non-template network
     * 
     */
    public List<String> stacks() {
        return this.stacks == null ? List.of() : this.stacks;
    }
    /**
     * @return (optional) List of switch templates ids for template network
     * 
     */
    public List<String> switchProfiles() {
        return this.switchProfiles == null ? List.of() : this.switchProfiles;
    }
    /**
     * @return (optional) List of switch serials for non-template network
     * 
     */
    public List<String> switches() {
        return this.switches == null ? List.of() : this.switches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchRoutingMulticastOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean floodUnknownMulticastTrafficEnabled;
        private @Nullable Boolean igmpSnoopingEnabled;
        private @Nullable List<String> stacks;
        private @Nullable List<String> switchProfiles;
        private @Nullable List<String> switches;
        public Builder() {}
        public Builder(SwitchRoutingMulticastOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.floodUnknownMulticastTrafficEnabled = defaults.floodUnknownMulticastTrafficEnabled;
    	      this.igmpSnoopingEnabled = defaults.igmpSnoopingEnabled;
    	      this.stacks = defaults.stacks;
    	      this.switchProfiles = defaults.switchProfiles;
    	      this.switches = defaults.switches;
        }

        @CustomType.Setter
        public Builder floodUnknownMulticastTrafficEnabled(@Nullable Boolean floodUnknownMulticastTrafficEnabled) {

            this.floodUnknownMulticastTrafficEnabled = floodUnknownMulticastTrafficEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder igmpSnoopingEnabled(@Nullable Boolean igmpSnoopingEnabled) {

            this.igmpSnoopingEnabled = igmpSnoopingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder stacks(@Nullable List<String> stacks) {

            this.stacks = stacks;
            return this;
        }
        public Builder stacks(String... stacks) {
            return stacks(List.of(stacks));
        }
        @CustomType.Setter
        public Builder switchProfiles(@Nullable List<String> switchProfiles) {

            this.switchProfiles = switchProfiles;
            return this;
        }
        public Builder switchProfiles(String... switchProfiles) {
            return switchProfiles(List.of(switchProfiles));
        }
        @CustomType.Setter
        public Builder switches(@Nullable List<String> switches) {

            this.switches = switches;
            return this;
        }
        public Builder switches(String... switches) {
            return switches(List.of(switches));
        }
        public SwitchRoutingMulticastOverride build() {
            final var _resultValue = new SwitchRoutingMulticastOverride();
            _resultValue.floodUnknownMulticastTrafficEnabled = floodUnknownMulticastTrafficEnabled;
            _resultValue.igmpSnoopingEnabled = igmpSnoopingEnabled;
            _resultValue.stacks = stacks;
            _resultValue.switchProfiles = switchProfiles;
            _resultValue.switches = switches;
            return _resultValue;
        }
    }
}
