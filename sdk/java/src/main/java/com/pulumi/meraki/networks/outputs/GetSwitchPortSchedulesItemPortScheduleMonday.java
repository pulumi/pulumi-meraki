// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchPortSchedulesItemPortScheduleMonday {
    /**
     * @return Whether the schedule is active or inactive
     * 
     */
    private Boolean active;
    /**
     * @return The time, from &#39;00:00&#39; to &#39;24:00&#39;
     * 
     */
    private String from;
    /**
     * @return The time, from &#39;00:00&#39; to &#39;24:00&#39;
     * 
     */
    private String to;

    private GetSwitchPortSchedulesItemPortScheduleMonday() {}
    /**
     * @return Whether the schedule is active or inactive
     * 
     */
    public Boolean active() {
        return this.active;
    }
    /**
     * @return The time, from &#39;00:00&#39; to &#39;24:00&#39;
     * 
     */
    public String from() {
        return this.from;
    }
    /**
     * @return The time, from &#39;00:00&#39; to &#39;24:00&#39;
     * 
     */
    public String to() {
        return this.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchPortSchedulesItemPortScheduleMonday defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean active;
        private String from;
        private String to;
        public Builder() {}
        public Builder(GetSwitchPortSchedulesItemPortScheduleMonday defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder active(Boolean active) {
            if (active == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortSchedulesItemPortScheduleMonday", "active");
            }
            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder from(String from) {
            if (from == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortSchedulesItemPortScheduleMonday", "from");
            }
            this.from = from;
            return this;
        }
        @CustomType.Setter
        public Builder to(String to) {
            if (to == null) {
              throw new MissingRequiredPropertyException("GetSwitchPortSchedulesItemPortScheduleMonday", "to");
            }
            this.to = to;
            return this;
        }
        public GetSwitchPortSchedulesItemPortScheduleMonday build() {
            final var _resultValue = new GetSwitchPortSchedulesItemPortScheduleMonday();
            _resultValue.active = active;
            _resultValue.from = from;
            _resultValue.to = to;
            return _resultValue;
        }
    }
}
