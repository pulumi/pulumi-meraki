// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWirelessSsidsSchedulesItemRange {
    private String endDay;
    private String endTime;
    private String startDay;
    private String startTime;

    private GetWirelessSsidsSchedulesItemRange() {}
    public String endDay() {
        return this.endDay;
    }
    public String endTime() {
        return this.endTime;
    }
    public String startDay() {
        return this.startDay;
    }
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessSsidsSchedulesItemRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endDay;
        private String endTime;
        private String startDay;
        private String startTime;
        public Builder() {}
        public Builder(GetWirelessSsidsSchedulesItemRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDay = defaults.endDay;
    	      this.endTime = defaults.endTime;
    	      this.startDay = defaults.startDay;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder endDay(String endDay) {
            if (endDay == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsSchedulesItemRange", "endDay");
            }
            this.endDay = endDay;
            return this;
        }
        @CustomType.Setter
        public Builder endTime(String endTime) {
            if (endTime == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsSchedulesItemRange", "endTime");
            }
            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder startDay(String startDay) {
            if (startDay == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsSchedulesItemRange", "startDay");
            }
            this.startDay = startDay;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            if (startTime == null) {
              throw new MissingRequiredPropertyException("GetWirelessSsidsSchedulesItemRange", "startTime");
            }
            this.startTime = startTime;
            return this;
        }
        public GetWirelessSsidsSchedulesItemRange build() {
            final var _resultValue = new GetWirelessSsidsSchedulesItemRange();
            _resultValue.endDay = endDay;
            _resultValue.endTime = endTime;
            _resultValue.startDay = startDay;
            _resultValue.startTime = startTime;
            return _resultValue;
        }
    }
}
