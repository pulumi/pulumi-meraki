// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs Empty = new SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs();

    /**
     * The code for DHCP option which should be from 2 to 254
     * 
     */
    @Import(name="code")
    private @Nullable Output<String> code;

    /**
     * @return The code for DHCP option which should be from 2 to 254
     * 
     */
    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * The type of the DHCP option which should be one of (&#39;text&#39;, &#39;ip&#39;, &#39;integer&#39; or &#39;hex&#39;)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the DHCP option which should be one of (&#39;text&#39;, &#39;ip&#39;, &#39;integer&#39; or &#39;hex&#39;)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The value of the DHCP option
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the DHCP option
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs() {}

    private SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs(SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs $) {
        this.code = $.code;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs $;

        public Builder() {
            $ = new SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs();
        }

        public Builder(SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs defaults) {
            $ = new SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The code for DHCP option which should be from 2 to 254
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code The code for DHCP option which should be from 2 to 254
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            return code(Output.of(code));
        }

        /**
         * @param type The type of the DHCP option which should be one of (&#39;text&#39;, &#39;ip&#39;, &#39;integer&#39; or &#39;hex&#39;)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the DHCP option which should be one of (&#39;text&#39;, &#39;ip&#39;, &#39;integer&#39; or &#39;hex&#39;)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The value of the DHCP option
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the DHCP option
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs build() {
            return $;
        }
    }

}