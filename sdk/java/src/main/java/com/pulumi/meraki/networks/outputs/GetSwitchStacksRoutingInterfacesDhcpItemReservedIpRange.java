// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRange {
    /**
     * @return The comment for the reserved IP range
     * 
     */
    private String comment;
    /**
     * @return The ending IP address of the reserved IP range
     * 
     */
    private String end;
    /**
     * @return The starting IP address of the reserved IP range
     * 
     */
    private String start;

    private GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRange() {}
    /**
     * @return The comment for the reserved IP range
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return The ending IP address of the reserved IP range
     * 
     */
    public String end() {
        return this.end;
    }
    /**
     * @return The starting IP address of the reserved IP range
     * 
     */
    public String start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String end;
        private String start;
        public Builder() {}
        public Builder(GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRange", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder end(String end) {
            if (end == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRange", "end");
            }
            this.end = end;
            return this;
        }
        @CustomType.Setter
        public Builder start(String start) {
            if (start == null) {
              throw new MissingRequiredPropertyException("GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRange", "start");
            }
            this.start = start;
            return this;
        }
        public GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRange build() {
            final var _resultValue = new GetSwitchStacksRoutingInterfacesDhcpItemReservedIpRange();
            _resultValue.comment = comment;
            _resultValue.end = end;
            _resultValue.start = start;
            return _resultValue;
        }
    }
}
