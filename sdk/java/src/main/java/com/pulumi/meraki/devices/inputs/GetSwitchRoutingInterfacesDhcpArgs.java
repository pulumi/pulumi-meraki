// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSwitchRoutingInterfacesDhcpArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchRoutingInterfacesDhcpArgs Empty = new GetSwitchRoutingInterfacesDhcpArgs();

    /**
     * interfaceId path parameter. Interface ID
     * 
     */
    @Import(name="interfaceId", required=true)
    private Output<String> interfaceId;

    /**
     * @return interfaceId path parameter. Interface ID
     * 
     */
    public Output<String> interfaceId() {
        return this.interfaceId;
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial", required=true)
    private Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }

    private GetSwitchRoutingInterfacesDhcpArgs() {}

    private GetSwitchRoutingInterfacesDhcpArgs(GetSwitchRoutingInterfacesDhcpArgs $) {
        this.interfaceId = $.interfaceId;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchRoutingInterfacesDhcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchRoutingInterfacesDhcpArgs $;

        public Builder() {
            $ = new GetSwitchRoutingInterfacesDhcpArgs();
        }

        public Builder(GetSwitchRoutingInterfacesDhcpArgs defaults) {
            $ = new GetSwitchRoutingInterfacesDhcpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interfaceId interfaceId path parameter. Interface ID
         * 
         * @return builder
         * 
         */
        public Builder interfaceId(Output<String> interfaceId) {
            $.interfaceId = interfaceId;
            return this;
        }

        /**
         * @param interfaceId interfaceId path parameter. Interface ID
         * 
         * @return builder
         * 
         */
        public Builder interfaceId(String interfaceId) {
            return interfaceId(Output.of(interfaceId));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        public GetSwitchRoutingInterfacesDhcpArgs build() {
            if ($.interfaceId == null) {
                throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesDhcpArgs", "interfaceId");
            }
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesDhcpArgs", "serial");
            }
            return $;
        }
    }

}
