// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchStacksRoutingInterfacesDhcpReservedIpRange {
    /**
     * @return The comment for the reserved IP range
     * 
     */
    private @Nullable String comment;
    /**
     * @return The ending IP address of the reserved IP range
     * 
     */
    private @Nullable String end;
    /**
     * @return The starting IP address of the reserved IP range
     * 
     */
    private @Nullable String start;

    private SwitchStacksRoutingInterfacesDhcpReservedIpRange() {}
    /**
     * @return The comment for the reserved IP range
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return The ending IP address of the reserved IP range
     * 
     */
    public Optional<String> end() {
        return Optional.ofNullable(this.end);
    }
    /**
     * @return The starting IP address of the reserved IP range
     * 
     */
    public Optional<String> start() {
        return Optional.ofNullable(this.start);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchStacksRoutingInterfacesDhcpReservedIpRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private @Nullable String end;
        private @Nullable String start;
        public Builder() {}
        public Builder(SwitchStacksRoutingInterfacesDhcpReservedIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder end(@Nullable String end) {

            this.end = end;
            return this;
        }
        @CustomType.Setter
        public Builder start(@Nullable String start) {

            this.start = start;
            return this;
        }
        public SwitchStacksRoutingInterfacesDhcpReservedIpRange build() {
            final var _resultValue = new SwitchStacksRoutingInterfacesDhcpReservedIpRange();
            _resultValue.comment = comment;
            _resultValue.end = end;
            _resultValue.start = start;
            return _resultValue;
        }
    }
}
