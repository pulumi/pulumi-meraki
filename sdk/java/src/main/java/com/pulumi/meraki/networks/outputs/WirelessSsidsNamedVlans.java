// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.WirelessSsidsNamedVlansRadius;
import com.pulumi.meraki.networks.outputs.WirelessSsidsNamedVlansTagging;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WirelessSsidsNamedVlans {
    /**
     * @return RADIUS settings. This param is only valid when authMode is &#39;open-with-radius&#39; and ipAssignmentMode is not &#39;NAT mode&#39;.
     * 
     */
    private @Nullable WirelessSsidsNamedVlansRadius radius;
    /**
     * @return VLAN tagging settings. This param is only valid when ipAssignmentMode is &#39;Bridge mode&#39; or &#39;Layer 3 roaming&#39;.
     * 
     */
    private @Nullable WirelessSsidsNamedVlansTagging tagging;

    private WirelessSsidsNamedVlans() {}
    /**
     * @return RADIUS settings. This param is only valid when authMode is &#39;open-with-radius&#39; and ipAssignmentMode is not &#39;NAT mode&#39;.
     * 
     */
    public Optional<WirelessSsidsNamedVlansRadius> radius() {
        return Optional.ofNullable(this.radius);
    }
    /**
     * @return VLAN tagging settings. This param is only valid when ipAssignmentMode is &#39;Bridge mode&#39; or &#39;Layer 3 roaming&#39;.
     * 
     */
    public Optional<WirelessSsidsNamedVlansTagging> tagging() {
        return Optional.ofNullable(this.tagging);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessSsidsNamedVlans defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WirelessSsidsNamedVlansRadius radius;
        private @Nullable WirelessSsidsNamedVlansTagging tagging;
        public Builder() {}
        public Builder(WirelessSsidsNamedVlans defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.radius = defaults.radius;
    	      this.tagging = defaults.tagging;
        }

        @CustomType.Setter
        public Builder radius(@Nullable WirelessSsidsNamedVlansRadius radius) {

            this.radius = radius;
            return this;
        }
        @CustomType.Setter
        public Builder tagging(@Nullable WirelessSsidsNamedVlansTagging tagging) {

            this.tagging = tagging;
            return this;
        }
        public WirelessSsidsNamedVlans build() {
            final var _resultValue = new WirelessSsidsNamedVlans();
            _resultValue.radius = radius;
            _resultValue.tagging = tagging;
            return _resultValue;
        }
    }
}
