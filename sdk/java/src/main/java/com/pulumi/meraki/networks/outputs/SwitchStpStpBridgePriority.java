// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchStpStpBridgePriority {
    /**
     * @return List of stack IDs
     * 
     */
    private @Nullable List<String> stacks;
    /**
     * @return STP priority for switch, stacks, or switch profiles
     * 
     */
    private @Nullable Integer stpPriority;
    /**
     * @return List of switch profile IDs
     * 
     */
    private @Nullable List<String> switchProfiles;
    /**
     * @return List of switch serial numbers
     * 
     */
    private @Nullable List<String> switches;

    private SwitchStpStpBridgePriority() {}
    /**
     * @return List of stack IDs
     * 
     */
    public List<String> stacks() {
        return this.stacks == null ? List.of() : this.stacks;
    }
    /**
     * @return STP priority for switch, stacks, or switch profiles
     * 
     */
    public Optional<Integer> stpPriority() {
        return Optional.ofNullable(this.stpPriority);
    }
    /**
     * @return List of switch profile IDs
     * 
     */
    public List<String> switchProfiles() {
        return this.switchProfiles == null ? List.of() : this.switchProfiles;
    }
    /**
     * @return List of switch serial numbers
     * 
     */
    public List<String> switches() {
        return this.switches == null ? List.of() : this.switches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchStpStpBridgePriority defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> stacks;
        private @Nullable Integer stpPriority;
        private @Nullable List<String> switchProfiles;
        private @Nullable List<String> switches;
        public Builder() {}
        public Builder(SwitchStpStpBridgePriority defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stacks = defaults.stacks;
    	      this.stpPriority = defaults.stpPriority;
    	      this.switchProfiles = defaults.switchProfiles;
    	      this.switches = defaults.switches;
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
        public Builder stpPriority(@Nullable Integer stpPriority) {

            this.stpPriority = stpPriority;
            return this;
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
        public SwitchStpStpBridgePriority build() {
            final var _resultValue = new SwitchStpStpBridgePriority();
            _resultValue.stacks = stacks;
            _resultValue.stpPriority = stpPriority;
            _resultValue.switchProfiles = switchProfiles;
            _resultValue.switches = switches;
            return _resultValue;
        }
    }
}
