// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplianceVlansDhcpOption {
    /**
     * @return The code for the DHCP option. This should be an integer between 2 and 254.
     * 
     */
    private @Nullable String code;
    /**
     * @return The type for the DHCP option. One of: &#39;text&#39;, &#39;ip&#39;, &#39;hex&#39; or &#39;integer&#39;
     * 
     */
    private @Nullable String type;
    /**
     * @return The value for the DHCP option
     * 
     */
    private @Nullable String value;

    private ApplianceVlansDhcpOption() {}
    /**
     * @return The code for the DHCP option. This should be an integer between 2 and 254.
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return The type for the DHCP option. One of: &#39;text&#39;, &#39;ip&#39;, &#39;hex&#39; or &#39;integer&#39;
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The value for the DHCP option
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceVlansDhcpOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String code;
        private @Nullable String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(ApplianceVlansDhcpOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder code(@Nullable String code) {

            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public ApplianceVlansDhcpOption build() {
            final var _resultValue = new ApplianceVlansDhcpOption();
            _resultValue.code = code;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
