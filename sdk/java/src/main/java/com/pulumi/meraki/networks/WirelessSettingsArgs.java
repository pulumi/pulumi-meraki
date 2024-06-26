// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.inputs.WirelessSettingsNamedVlansArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WirelessSettingsArgs Empty = new WirelessSettingsArgs();

    /**
     * Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
     * 
     */
    @Import(name="ipv6BridgeEnabled")
    private @Nullable Output<Boolean> ipv6BridgeEnabled;

    /**
     * @return Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
     * 
     */
    public Optional<Output<Boolean>> ipv6BridgeEnabled() {
        return Optional.ofNullable(this.ipv6BridgeEnabled);
    }

    /**
     * Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
     * 
     */
    @Import(name="ledLightsOn")
    private @Nullable Output<Boolean> ledLightsOn;

    /**
     * @return Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
     * 
     */
    public Optional<Output<Boolean>> ledLightsOn() {
        return Optional.ofNullable(this.ledLightsOn);
    }

    /**
     * Toggle for enabling or disabling location analytics for your network
     * 
     */
    @Import(name="locationAnalyticsEnabled")
    private @Nullable Output<Boolean> locationAnalyticsEnabled;

    /**
     * @return Toggle for enabling or disabling location analytics for your network
     * 
     */
    public Optional<Output<Boolean>> locationAnalyticsEnabled() {
        return Optional.ofNullable(this.locationAnalyticsEnabled);
    }

    /**
     * Toggle for enabling or disabling meshing in a network
     * 
     */
    @Import(name="meshingEnabled")
    private @Nullable Output<Boolean> meshingEnabled;

    /**
     * @return Toggle for enabling or disabling meshing in a network
     * 
     */
    public Optional<Output<Boolean>> meshingEnabled() {
        return Optional.ofNullable(this.meshingEnabled);
    }

    /**
     * Named VLAN settings for wireless networks.
     * 
     */
    @Import(name="namedVlans")
    private @Nullable Output<WirelessSettingsNamedVlansArgs> namedVlans;

    /**
     * @return Named VLAN settings for wireless networks.
     * 
     */
    public Optional<Output<WirelessSettingsNamedVlansArgs>> namedVlans() {
        return Optional.ofNullable(this.namedVlans);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId", required=true)
    private Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }

    /**
     * The upgrade strategy to apply to the network. Must be one of &#39;minimizeUpgradeTime&#39; or &#39;minimizeClientDowntime&#39;. Requires firmware version MR 26.8 or higher&#39;
     * 
     */
    @Import(name="upgradestrategy")
    private @Nullable Output<String> upgradestrategy;

    /**
     * @return The upgrade strategy to apply to the network. Must be one of &#39;minimizeUpgradeTime&#39; or &#39;minimizeClientDowntime&#39;. Requires firmware version MR 26.8 or higher&#39;
     * 
     */
    public Optional<Output<String>> upgradestrategy() {
        return Optional.ofNullable(this.upgradestrategy);
    }

    private WirelessSettingsArgs() {}

    private WirelessSettingsArgs(WirelessSettingsArgs $) {
        this.ipv6BridgeEnabled = $.ipv6BridgeEnabled;
        this.ledLightsOn = $.ledLightsOn;
        this.locationAnalyticsEnabled = $.locationAnalyticsEnabled;
        this.meshingEnabled = $.meshingEnabled;
        this.namedVlans = $.namedVlans;
        this.networkId = $.networkId;
        this.upgradestrategy = $.upgradestrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WirelessSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WirelessSettingsArgs $;

        public Builder() {
            $ = new WirelessSettingsArgs();
        }

        public Builder(WirelessSettingsArgs defaults) {
            $ = new WirelessSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipv6BridgeEnabled Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
         * 
         * @return builder
         * 
         */
        public Builder ipv6BridgeEnabled(@Nullable Output<Boolean> ipv6BridgeEnabled) {
            $.ipv6BridgeEnabled = ipv6BridgeEnabled;
            return this;
        }

        /**
         * @param ipv6BridgeEnabled Toggle for enabling or disabling IPv6 bridging in a network (Note: if enabled, SSIDs must also be configured to use bridge mode)
         * 
         * @return builder
         * 
         */
        public Builder ipv6BridgeEnabled(Boolean ipv6BridgeEnabled) {
            return ipv6BridgeEnabled(Output.of(ipv6BridgeEnabled));
        }

        /**
         * @param ledLightsOn Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
         * 
         * @return builder
         * 
         */
        public Builder ledLightsOn(@Nullable Output<Boolean> ledLightsOn) {
            $.ledLightsOn = ledLightsOn;
            return this;
        }

        /**
         * @param ledLightsOn Toggle for enabling or disabling LED lights on all APs in the network (making them run dark)
         * 
         * @return builder
         * 
         */
        public Builder ledLightsOn(Boolean ledLightsOn) {
            return ledLightsOn(Output.of(ledLightsOn));
        }

        /**
         * @param locationAnalyticsEnabled Toggle for enabling or disabling location analytics for your network
         * 
         * @return builder
         * 
         */
        public Builder locationAnalyticsEnabled(@Nullable Output<Boolean> locationAnalyticsEnabled) {
            $.locationAnalyticsEnabled = locationAnalyticsEnabled;
            return this;
        }

        /**
         * @param locationAnalyticsEnabled Toggle for enabling or disabling location analytics for your network
         * 
         * @return builder
         * 
         */
        public Builder locationAnalyticsEnabled(Boolean locationAnalyticsEnabled) {
            return locationAnalyticsEnabled(Output.of(locationAnalyticsEnabled));
        }

        /**
         * @param meshingEnabled Toggle for enabling or disabling meshing in a network
         * 
         * @return builder
         * 
         */
        public Builder meshingEnabled(@Nullable Output<Boolean> meshingEnabled) {
            $.meshingEnabled = meshingEnabled;
            return this;
        }

        /**
         * @param meshingEnabled Toggle for enabling or disabling meshing in a network
         * 
         * @return builder
         * 
         */
        public Builder meshingEnabled(Boolean meshingEnabled) {
            return meshingEnabled(Output.of(meshingEnabled));
        }

        /**
         * @param namedVlans Named VLAN settings for wireless networks.
         * 
         * @return builder
         * 
         */
        public Builder namedVlans(@Nullable Output<WirelessSettingsNamedVlansArgs> namedVlans) {
            $.namedVlans = namedVlans;
            return this;
        }

        /**
         * @param namedVlans Named VLAN settings for wireless networks.
         * 
         * @return builder
         * 
         */
        public Builder namedVlans(WirelessSettingsNamedVlansArgs namedVlans) {
            return namedVlans(Output.of(namedVlans));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(Output<String> networkId) {
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
         * @param upgradestrategy The upgrade strategy to apply to the network. Must be one of &#39;minimizeUpgradeTime&#39; or &#39;minimizeClientDowntime&#39;. Requires firmware version MR 26.8 or higher&#39;
         * 
         * @return builder
         * 
         */
        public Builder upgradestrategy(@Nullable Output<String> upgradestrategy) {
            $.upgradestrategy = upgradestrategy;
            return this;
        }

        /**
         * @param upgradestrategy The upgrade strategy to apply to the network. Must be one of &#39;minimizeUpgradeTime&#39; or &#39;minimizeClientDowntime&#39;. Requires firmware version MR 26.8 or higher&#39;
         * 
         * @return builder
         * 
         */
        public Builder upgradestrategy(String upgradestrategy) {
            return upgradestrategy(Output.of(upgradestrategy));
        }

        public WirelessSettingsArgs build() {
            if ($.networkId == null) {
                throw new MissingRequiredPropertyException("WirelessSettingsArgs", "networkId");
            }
            return $;
        }
    }

}
