// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplianceWarmSpareItemWan2 {
    private String ip;
    private String subnet;

    private GetApplianceWarmSpareItemWan2() {}
    public String ip() {
        return this.ip;
    }
    public String subnet() {
        return this.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceWarmSpareItemWan2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ip;
        private String subnet;
        public Builder() {}
        public Builder(GetApplianceWarmSpareItemWan2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.subnet = defaults.subnet;
        }

        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetApplianceWarmSpareItemWan2", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder subnet(String subnet) {
            if (subnet == null) {
              throw new MissingRequiredPropertyException("GetApplianceWarmSpareItemWan2", "subnet");
            }
            this.subnet = subnet;
            return this;
        }
        public GetApplianceWarmSpareItemWan2 build() {
            final var _resultValue = new GetApplianceWarmSpareItemWan2();
            _resultValue.ip = ip;
            _resultValue.subnet = subnet;
            return _resultValue;
        }
    }
}