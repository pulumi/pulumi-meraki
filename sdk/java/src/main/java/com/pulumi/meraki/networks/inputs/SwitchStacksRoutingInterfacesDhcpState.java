// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs;
import com.pulumi.meraki.networks.inputs.SwitchStacksRoutingInterfacesDhcpFixedIpAssignmentArgs;
import com.pulumi.meraki.networks.inputs.SwitchStacksRoutingInterfacesDhcpReservedIpRangeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchStacksRoutingInterfacesDhcpState extends com.pulumi.resources.ResourceArgs {

    public static final SwitchStacksRoutingInterfacesDhcpState Empty = new SwitchStacksRoutingInterfacesDhcpState();

    /**
     * The PXE boot server file name for the DHCP server running on the switch stack interface
     * 
     */
    @Import(name="bootFileName")
    private @Nullable Output<String> bootFileName;

    /**
     * @return The PXE boot server file name for the DHCP server running on the switch stack interface
     * 
     */
    public Optional<Output<String>> bootFileName() {
        return Optional.ofNullable(this.bootFileName);
    }

    /**
     * The PXE boot server IP for the DHCP server running on the switch stack interface
     * 
     */
    @Import(name="bootNextServer")
    private @Nullable Output<String> bootNextServer;

    /**
     * @return The PXE boot server IP for the DHCP server running on the switch stack interface
     * 
     */
    public Optional<Output<String>> bootNextServer() {
        return Optional.ofNullable(this.bootNextServer);
    }

    /**
     * Enable DHCP boot options to provide PXE boot options configs for the dhcp server running on the switch stack interface
     * 
     */
    @Import(name="bootOptionsEnabled")
    private @Nullable Output<Boolean> bootOptionsEnabled;

    /**
     * @return Enable DHCP boot options to provide PXE boot options configs for the dhcp server running on the switch stack interface
     * 
     */
    public Optional<Output<Boolean>> bootOptionsEnabled() {
        return Optional.ofNullable(this.bootOptionsEnabled);
    }

    /**
     * The DHCP lease time config for the dhcp server running on the switch stack interface (&#39;30 minutes&#39;, &#39;1 hour&#39;, &#39;4 hours&#39;, &#39;12 hours&#39;, &#39;1 day&#39; or &#39;1 week&#39;)
     * 
     */
    @Import(name="dhcpLeaseTime")
    private @Nullable Output<String> dhcpLeaseTime;

    /**
     * @return The DHCP lease time config for the dhcp server running on the switch stack interface (&#39;30 minutes&#39;, &#39;1 hour&#39;, &#39;4 hours&#39;, &#39;12 hours&#39;, &#39;1 day&#39; or &#39;1 week&#39;)
     * 
     */
    public Optional<Output<String>> dhcpLeaseTime() {
        return Optional.ofNullable(this.dhcpLeaseTime);
    }

    /**
     * The DHCP mode options for the switch stack interface (&#39;dhcpDisabled&#39;, &#39;dhcpRelay&#39; or &#39;dhcpServer&#39;)
     * 
     */
    @Import(name="dhcpMode")
    private @Nullable Output<String> dhcpMode;

    /**
     * @return The DHCP mode options for the switch stack interface (&#39;dhcpDisabled&#39;, &#39;dhcpRelay&#39; or &#39;dhcpServer&#39;)
     * 
     */
    public Optional<Output<String>> dhcpMode() {
        return Optional.ofNullable(this.dhcpMode);
    }

    /**
     * Array of DHCP options consisting of code, type and value for the DHCP server running on the switch stack interface
     * 
     */
    @Import(name="dhcpOptions")
    private @Nullable Output<List<SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs>> dhcpOptions;

    /**
     * @return Array of DHCP options consisting of code, type and value for the DHCP server running on the switch stack interface
     * 
     */
    public Optional<Output<List<SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs>>> dhcpOptions() {
        return Optional.ofNullable(this.dhcpOptions);
    }

    /**
     * The DHCP relay server IPs to which DHCP packets would get relayed for the switch stack interface
     * 
     */
    @Import(name="dhcpRelayServerIps")
    private @Nullable Output<List<String>> dhcpRelayServerIps;

    /**
     * @return The DHCP relay server IPs to which DHCP packets would get relayed for the switch stack interface
     * 
     */
    public Optional<Output<List<String>>> dhcpRelayServerIps() {
        return Optional.ofNullable(this.dhcpRelayServerIps);
    }

    /**
     * The DHCP name server IPs when DHCP name server option is &#39;custom&#39;
     * 
     */
    @Import(name="dnsCustomNameservers")
    private @Nullable Output<List<String>> dnsCustomNameservers;

    /**
     * @return The DHCP name server IPs when DHCP name server option is &#39;custom&#39;
     * 
     */
    public Optional<Output<List<String>>> dnsCustomNameservers() {
        return Optional.ofNullable(this.dnsCustomNameservers);
    }

    /**
     * The DHCP name server option for the dhcp server running on the switch stack interface (&#39;googlePublicDns&#39;, &#39;openDns&#39; or &#39;custom&#39;)
     * 
     */
    @Import(name="dnsNameserversOption")
    private @Nullable Output<String> dnsNameserversOption;

    /**
     * @return The DHCP name server option for the dhcp server running on the switch stack interface (&#39;googlePublicDns&#39;, &#39;openDns&#39; or &#39;custom&#39;)
     * 
     */
    public Optional<Output<String>> dnsNameserversOption() {
        return Optional.ofNullable(this.dnsNameserversOption);
    }

    /**
     * Array of DHCP reserved IP assignments for the DHCP server running on the switch stack interface
     * 
     */
    @Import(name="fixedIpAssignments")
    private @Nullable Output<List<SwitchStacksRoutingInterfacesDhcpFixedIpAssignmentArgs>> fixedIpAssignments;

    /**
     * @return Array of DHCP reserved IP assignments for the DHCP server running on the switch stack interface
     * 
     */
    public Optional<Output<List<SwitchStacksRoutingInterfacesDhcpFixedIpAssignmentArgs>>> fixedIpAssignments() {
        return Optional.ofNullable(this.fixedIpAssignments);
    }

    /**
     * interfaceId path parameter. Interface ID
     * 
     */
    @Import(name="interfaceId")
    private @Nullable Output<String> interfaceId;

    /**
     * @return interfaceId path parameter. Interface ID
     * 
     */
    public Optional<Output<String>> interfaceId() {
        return Optional.ofNullable(this.interfaceId);
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
     * Array of DHCP reserved IP assignments for the DHCP server running on the switch stack interface
     * 
     */
    @Import(name="reservedIpRanges")
    private @Nullable Output<List<SwitchStacksRoutingInterfacesDhcpReservedIpRangeArgs>> reservedIpRanges;

    /**
     * @return Array of DHCP reserved IP assignments for the DHCP server running on the switch stack interface
     * 
     */
    public Optional<Output<List<SwitchStacksRoutingInterfacesDhcpReservedIpRangeArgs>>> reservedIpRanges() {
        return Optional.ofNullable(this.reservedIpRanges);
    }

    /**
     * switchStackId path parameter. Switch stack ID
     * 
     */
    @Import(name="switchStackId")
    private @Nullable Output<String> switchStackId;

    /**
     * @return switchStackId path parameter. Switch stack ID
     * 
     */
    public Optional<Output<String>> switchStackId() {
        return Optional.ofNullable(this.switchStackId);
    }

    private SwitchStacksRoutingInterfacesDhcpState() {}

    private SwitchStacksRoutingInterfacesDhcpState(SwitchStacksRoutingInterfacesDhcpState $) {
        this.bootFileName = $.bootFileName;
        this.bootNextServer = $.bootNextServer;
        this.bootOptionsEnabled = $.bootOptionsEnabled;
        this.dhcpLeaseTime = $.dhcpLeaseTime;
        this.dhcpMode = $.dhcpMode;
        this.dhcpOptions = $.dhcpOptions;
        this.dhcpRelayServerIps = $.dhcpRelayServerIps;
        this.dnsCustomNameservers = $.dnsCustomNameservers;
        this.dnsNameserversOption = $.dnsNameserversOption;
        this.fixedIpAssignments = $.fixedIpAssignments;
        this.interfaceId = $.interfaceId;
        this.networkId = $.networkId;
        this.reservedIpRanges = $.reservedIpRanges;
        this.switchStackId = $.switchStackId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchStacksRoutingInterfacesDhcpState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchStacksRoutingInterfacesDhcpState $;

        public Builder() {
            $ = new SwitchStacksRoutingInterfacesDhcpState();
        }

        public Builder(SwitchStacksRoutingInterfacesDhcpState defaults) {
            $ = new SwitchStacksRoutingInterfacesDhcpState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bootFileName The PXE boot server file name for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder bootFileName(@Nullable Output<String> bootFileName) {
            $.bootFileName = bootFileName;
            return this;
        }

        /**
         * @param bootFileName The PXE boot server file name for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder bootFileName(String bootFileName) {
            return bootFileName(Output.of(bootFileName));
        }

        /**
         * @param bootNextServer The PXE boot server IP for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder bootNextServer(@Nullable Output<String> bootNextServer) {
            $.bootNextServer = bootNextServer;
            return this;
        }

        /**
         * @param bootNextServer The PXE boot server IP for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder bootNextServer(String bootNextServer) {
            return bootNextServer(Output.of(bootNextServer));
        }

        /**
         * @param bootOptionsEnabled Enable DHCP boot options to provide PXE boot options configs for the dhcp server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder bootOptionsEnabled(@Nullable Output<Boolean> bootOptionsEnabled) {
            $.bootOptionsEnabled = bootOptionsEnabled;
            return this;
        }

        /**
         * @param bootOptionsEnabled Enable DHCP boot options to provide PXE boot options configs for the dhcp server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder bootOptionsEnabled(Boolean bootOptionsEnabled) {
            return bootOptionsEnabled(Output.of(bootOptionsEnabled));
        }

        /**
         * @param dhcpLeaseTime The DHCP lease time config for the dhcp server running on the switch stack interface (&#39;30 minutes&#39;, &#39;1 hour&#39;, &#39;4 hours&#39;, &#39;12 hours&#39;, &#39;1 day&#39; or &#39;1 week&#39;)
         * 
         * @return builder
         * 
         */
        public Builder dhcpLeaseTime(@Nullable Output<String> dhcpLeaseTime) {
            $.dhcpLeaseTime = dhcpLeaseTime;
            return this;
        }

        /**
         * @param dhcpLeaseTime The DHCP lease time config for the dhcp server running on the switch stack interface (&#39;30 minutes&#39;, &#39;1 hour&#39;, &#39;4 hours&#39;, &#39;12 hours&#39;, &#39;1 day&#39; or &#39;1 week&#39;)
         * 
         * @return builder
         * 
         */
        public Builder dhcpLeaseTime(String dhcpLeaseTime) {
            return dhcpLeaseTime(Output.of(dhcpLeaseTime));
        }

        /**
         * @param dhcpMode The DHCP mode options for the switch stack interface (&#39;dhcpDisabled&#39;, &#39;dhcpRelay&#39; or &#39;dhcpServer&#39;)
         * 
         * @return builder
         * 
         */
        public Builder dhcpMode(@Nullable Output<String> dhcpMode) {
            $.dhcpMode = dhcpMode;
            return this;
        }

        /**
         * @param dhcpMode The DHCP mode options for the switch stack interface (&#39;dhcpDisabled&#39;, &#39;dhcpRelay&#39; or &#39;dhcpServer&#39;)
         * 
         * @return builder
         * 
         */
        public Builder dhcpMode(String dhcpMode) {
            return dhcpMode(Output.of(dhcpMode));
        }

        /**
         * @param dhcpOptions Array of DHCP options consisting of code, type and value for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptions(@Nullable Output<List<SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs>> dhcpOptions) {
            $.dhcpOptions = dhcpOptions;
            return this;
        }

        /**
         * @param dhcpOptions Array of DHCP options consisting of code, type and value for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptions(List<SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs> dhcpOptions) {
            return dhcpOptions(Output.of(dhcpOptions));
        }

        /**
         * @param dhcpOptions Array of DHCP options consisting of code, type and value for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptions(SwitchStacksRoutingInterfacesDhcpDhcpOptionArgs... dhcpOptions) {
            return dhcpOptions(List.of(dhcpOptions));
        }

        /**
         * @param dhcpRelayServerIps The DHCP relay server IPs to which DHCP packets would get relayed for the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder dhcpRelayServerIps(@Nullable Output<List<String>> dhcpRelayServerIps) {
            $.dhcpRelayServerIps = dhcpRelayServerIps;
            return this;
        }

        /**
         * @param dhcpRelayServerIps The DHCP relay server IPs to which DHCP packets would get relayed for the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder dhcpRelayServerIps(List<String> dhcpRelayServerIps) {
            return dhcpRelayServerIps(Output.of(dhcpRelayServerIps));
        }

        /**
         * @param dhcpRelayServerIps The DHCP relay server IPs to which DHCP packets would get relayed for the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder dhcpRelayServerIps(String... dhcpRelayServerIps) {
            return dhcpRelayServerIps(List.of(dhcpRelayServerIps));
        }

        /**
         * @param dnsCustomNameservers The DHCP name server IPs when DHCP name server option is &#39;custom&#39;
         * 
         * @return builder
         * 
         */
        public Builder dnsCustomNameservers(@Nullable Output<List<String>> dnsCustomNameservers) {
            $.dnsCustomNameservers = dnsCustomNameservers;
            return this;
        }

        /**
         * @param dnsCustomNameservers The DHCP name server IPs when DHCP name server option is &#39;custom&#39;
         * 
         * @return builder
         * 
         */
        public Builder dnsCustomNameservers(List<String> dnsCustomNameservers) {
            return dnsCustomNameservers(Output.of(dnsCustomNameservers));
        }

        /**
         * @param dnsCustomNameservers The DHCP name server IPs when DHCP name server option is &#39;custom&#39;
         * 
         * @return builder
         * 
         */
        public Builder dnsCustomNameservers(String... dnsCustomNameservers) {
            return dnsCustomNameservers(List.of(dnsCustomNameservers));
        }

        /**
         * @param dnsNameserversOption The DHCP name server option for the dhcp server running on the switch stack interface (&#39;googlePublicDns&#39;, &#39;openDns&#39; or &#39;custom&#39;)
         * 
         * @return builder
         * 
         */
        public Builder dnsNameserversOption(@Nullable Output<String> dnsNameserversOption) {
            $.dnsNameserversOption = dnsNameserversOption;
            return this;
        }

        /**
         * @param dnsNameserversOption The DHCP name server option for the dhcp server running on the switch stack interface (&#39;googlePublicDns&#39;, &#39;openDns&#39; or &#39;custom&#39;)
         * 
         * @return builder
         * 
         */
        public Builder dnsNameserversOption(String dnsNameserversOption) {
            return dnsNameserversOption(Output.of(dnsNameserversOption));
        }

        /**
         * @param fixedIpAssignments Array of DHCP reserved IP assignments for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder fixedIpAssignments(@Nullable Output<List<SwitchStacksRoutingInterfacesDhcpFixedIpAssignmentArgs>> fixedIpAssignments) {
            $.fixedIpAssignments = fixedIpAssignments;
            return this;
        }

        /**
         * @param fixedIpAssignments Array of DHCP reserved IP assignments for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder fixedIpAssignments(List<SwitchStacksRoutingInterfacesDhcpFixedIpAssignmentArgs> fixedIpAssignments) {
            return fixedIpAssignments(Output.of(fixedIpAssignments));
        }

        /**
         * @param fixedIpAssignments Array of DHCP reserved IP assignments for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder fixedIpAssignments(SwitchStacksRoutingInterfacesDhcpFixedIpAssignmentArgs... fixedIpAssignments) {
            return fixedIpAssignments(List.of(fixedIpAssignments));
        }

        /**
         * @param interfaceId interfaceId path parameter. Interface ID
         * 
         * @return builder
         * 
         */
        public Builder interfaceId(@Nullable Output<String> interfaceId) {
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
         * @param reservedIpRanges Array of DHCP reserved IP assignments for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRanges(@Nullable Output<List<SwitchStacksRoutingInterfacesDhcpReservedIpRangeArgs>> reservedIpRanges) {
            $.reservedIpRanges = reservedIpRanges;
            return this;
        }

        /**
         * @param reservedIpRanges Array of DHCP reserved IP assignments for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRanges(List<SwitchStacksRoutingInterfacesDhcpReservedIpRangeArgs> reservedIpRanges) {
            return reservedIpRanges(Output.of(reservedIpRanges));
        }

        /**
         * @param reservedIpRanges Array of DHCP reserved IP assignments for the DHCP server running on the switch stack interface
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRanges(SwitchStacksRoutingInterfacesDhcpReservedIpRangeArgs... reservedIpRanges) {
            return reservedIpRanges(List.of(reservedIpRanges));
        }

        /**
         * @param switchStackId switchStackId path parameter. Switch stack ID
         * 
         * @return builder
         * 
         */
        public Builder switchStackId(@Nullable Output<String> switchStackId) {
            $.switchStackId = switchStackId;
            return this;
        }

        /**
         * @param switchStackId switchStackId path parameter. Switch stack ID
         * 
         * @return builder
         * 
         */
        public Builder switchStackId(String switchStackId) {
            return switchStackId(Output.of(switchStackId));
        }

        public SwitchStacksRoutingInterfacesDhcpState build() {
            return $;
        }
    }

}