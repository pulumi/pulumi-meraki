// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchRoutingMulticastRendezvousPointsState extends com.pulumi.resources.ResourceArgs {

    public static final SwitchRoutingMulticastRendezvousPointsState Empty = new SwitchRoutingMulticastRendezvousPointsState();

    /**
     * The IP address of the interface where the RP needs to be created.
     * 
     */
    @Import(name="interfaceIp")
    private @Nullable Output<String> interfaceIp;

    /**
     * @return The IP address of the interface where the RP needs to be created.
     * 
     */
    public Optional<Output<String>> interfaceIp() {
        return Optional.ofNullable(this.interfaceIp);
    }

    @Import(name="interfaceName")
    private @Nullable Output<String> interfaceName;

    public Optional<Output<String>> interfaceName() {
        return Optional.ofNullable(this.interfaceName);
    }

    /**
     * &#39;Any&#39;, or the IP address of a multicast group
     * 
     */
    @Import(name="multicastGroup")
    private @Nullable Output<String> multicastGroup;

    /**
     * @return &#39;Any&#39;, or the IP address of a multicast group
     * 
     */
    public Optional<Output<String>> multicastGroup() {
        return Optional.ofNullable(this.multicastGroup);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * rendezvousPointId path parameter. Rendezvous point ID
     * 
     */
    @Import(name="rendezvousPointId")
    private @Nullable Output<String> rendezvousPointId;

    /**
     * @return rendezvousPointId path parameter. Rendezvous point ID
     * 
     */
    public Optional<Output<String>> rendezvousPointId() {
        return Optional.ofNullable(this.rendezvousPointId);
    }

    @Import(name="serial")
    private @Nullable Output<String> serial;

    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    private SwitchRoutingMulticastRendezvousPointsState() {}

    private SwitchRoutingMulticastRendezvousPointsState(SwitchRoutingMulticastRendezvousPointsState $) {
        this.interfaceIp = $.interfaceIp;
        this.interfaceName = $.interfaceName;
        this.multicastGroup = $.multicastGroup;
        this.networkId = $.networkId;
        this.rendezvousPointId = $.rendezvousPointId;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchRoutingMulticastRendezvousPointsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchRoutingMulticastRendezvousPointsState $;

        public Builder() {
            $ = new SwitchRoutingMulticastRendezvousPointsState();
        }

        public Builder(SwitchRoutingMulticastRendezvousPointsState defaults) {
            $ = new SwitchRoutingMulticastRendezvousPointsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param interfaceIp The IP address of the interface where the RP needs to be created.
         * 
         * @return builder
         * 
         */
        public Builder interfaceIp(@Nullable Output<String> interfaceIp) {
            $.interfaceIp = interfaceIp;
            return this;
        }

        /**
         * @param interfaceIp The IP address of the interface where the RP needs to be created.
         * 
         * @return builder
         * 
         */
        public Builder interfaceIp(String interfaceIp) {
            return interfaceIp(Output.of(interfaceIp));
        }

        public Builder interfaceName(@Nullable Output<String> interfaceName) {
            $.interfaceName = interfaceName;
            return this;
        }

        public Builder interfaceName(String interfaceName) {
            return interfaceName(Output.of(interfaceName));
        }

        /**
         * @param multicastGroup &#39;Any&#39;, or the IP address of a multicast group
         * 
         * @return builder
         * 
         */
        public Builder multicastGroup(@Nullable Output<String> multicastGroup) {
            $.multicastGroup = multicastGroup;
            return this;
        }

        /**
         * @param multicastGroup &#39;Any&#39;, or the IP address of a multicast group
         * 
         * @return builder
         * 
         */
        public Builder multicastGroup(String multicastGroup) {
            return multicastGroup(Output.of(multicastGroup));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param rendezvousPointId rendezvousPointId path parameter. Rendezvous point ID
         * 
         * @return builder
         * 
         */
        public Builder rendezvousPointId(@Nullable Output<String> rendezvousPointId) {
            $.rendezvousPointId = rendezvousPointId;
            return this;
        }

        /**
         * @param rendezvousPointId rendezvousPointId path parameter. Rendezvous point ID
         * 
         * @return builder
         * 
         */
        public Builder rendezvousPointId(String rendezvousPointId) {
            return rendezvousPointId(Output.of(rendezvousPointId));
        }

        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        public SwitchRoutingMulticastRendezvousPointsState build() {
            return $;
        }
    }

}