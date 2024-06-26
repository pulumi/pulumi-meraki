// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemSchedulingFriday;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemSchedulingMonday;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemSchedulingSaturday;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemSchedulingSunday;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemSchedulingThursday;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemSchedulingTuesday;
import com.pulumi.meraki.networks.outputs.GetGroupPoliciesItemSchedulingWednesday;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetGroupPoliciesItemScheduling {
    /**
     * @return Whether scheduling is enabled (true) or disabled (false). Defaults to false. If true, the schedule objects for each day of the week (monday - sunday) are parsed.
     * 
     */
    private Boolean enabled;
    /**
     * @return The schedule object for Friday.
     * 
     */
    private GetGroupPoliciesItemSchedulingFriday friday;
    /**
     * @return The schedule object for Monday.
     * 
     */
    private GetGroupPoliciesItemSchedulingMonday monday;
    /**
     * @return The schedule object for Saturday.
     * 
     */
    private GetGroupPoliciesItemSchedulingSaturday saturday;
    /**
     * @return The schedule object for Sunday.
     * 
     */
    private GetGroupPoliciesItemSchedulingSunday sunday;
    /**
     * @return The schedule object for Thursday.
     * 
     */
    private GetGroupPoliciesItemSchedulingThursday thursday;
    /**
     * @return The schedule object for Tuesday.
     * 
     */
    private GetGroupPoliciesItemSchedulingTuesday tuesday;
    /**
     * @return The schedule object for Wednesday.
     * 
     */
    private GetGroupPoliciesItemSchedulingWednesday wednesday;

    private GetGroupPoliciesItemScheduling() {}
    /**
     * @return Whether scheduling is enabled (true) or disabled (false). Defaults to false. If true, the schedule objects for each day of the week (monday - sunday) are parsed.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The schedule object for Friday.
     * 
     */
    public GetGroupPoliciesItemSchedulingFriday friday() {
        return this.friday;
    }
    /**
     * @return The schedule object for Monday.
     * 
     */
    public GetGroupPoliciesItemSchedulingMonday monday() {
        return this.monday;
    }
    /**
     * @return The schedule object for Saturday.
     * 
     */
    public GetGroupPoliciesItemSchedulingSaturday saturday() {
        return this.saturday;
    }
    /**
     * @return The schedule object for Sunday.
     * 
     */
    public GetGroupPoliciesItemSchedulingSunday sunday() {
        return this.sunday;
    }
    /**
     * @return The schedule object for Thursday.
     * 
     */
    public GetGroupPoliciesItemSchedulingThursday thursday() {
        return this.thursday;
    }
    /**
     * @return The schedule object for Tuesday.
     * 
     */
    public GetGroupPoliciesItemSchedulingTuesday tuesday() {
        return this.tuesday;
    }
    /**
     * @return The schedule object for Wednesday.
     * 
     */
    public GetGroupPoliciesItemSchedulingWednesday wednesday() {
        return this.wednesday;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupPoliciesItemScheduling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private GetGroupPoliciesItemSchedulingFriday friday;
        private GetGroupPoliciesItemSchedulingMonday monday;
        private GetGroupPoliciesItemSchedulingSaturday saturday;
        private GetGroupPoliciesItemSchedulingSunday sunday;
        private GetGroupPoliciesItemSchedulingThursday thursday;
        private GetGroupPoliciesItemSchedulingTuesday tuesday;
        private GetGroupPoliciesItemSchedulingWednesday wednesday;
        public Builder() {}
        public Builder(GetGroupPoliciesItemScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.friday = defaults.friday;
    	      this.monday = defaults.monday;
    	      this.saturday = defaults.saturday;
    	      this.sunday = defaults.sunday;
    	      this.thursday = defaults.thursday;
    	      this.tuesday = defaults.tuesday;
    	      this.wednesday = defaults.wednesday;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemScheduling", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder friday(GetGroupPoliciesItemSchedulingFriday friday) {
            if (friday == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemScheduling", "friday");
            }
            this.friday = friday;
            return this;
        }
        @CustomType.Setter
        public Builder monday(GetGroupPoliciesItemSchedulingMonday monday) {
            if (monday == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemScheduling", "monday");
            }
            this.monday = monday;
            return this;
        }
        @CustomType.Setter
        public Builder saturday(GetGroupPoliciesItemSchedulingSaturday saturday) {
            if (saturday == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemScheduling", "saturday");
            }
            this.saturday = saturday;
            return this;
        }
        @CustomType.Setter
        public Builder sunday(GetGroupPoliciesItemSchedulingSunday sunday) {
            if (sunday == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemScheduling", "sunday");
            }
            this.sunday = sunday;
            return this;
        }
        @CustomType.Setter
        public Builder thursday(GetGroupPoliciesItemSchedulingThursday thursday) {
            if (thursday == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemScheduling", "thursday");
            }
            this.thursday = thursday;
            return this;
        }
        @CustomType.Setter
        public Builder tuesday(GetGroupPoliciesItemSchedulingTuesday tuesday) {
            if (tuesday == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemScheduling", "tuesday");
            }
            this.tuesday = tuesday;
            return this;
        }
        @CustomType.Setter
        public Builder wednesday(GetGroupPoliciesItemSchedulingWednesday wednesday) {
            if (wednesday == null) {
              throw new MissingRequiredPropertyException("GetGroupPoliciesItemScheduling", "wednesday");
            }
            this.wednesday = wednesday;
            return this;
        }
        public GetGroupPoliciesItemScheduling build() {
            final var _resultValue = new GetGroupPoliciesItemScheduling();
            _resultValue.enabled = enabled;
            _resultValue.friday = friday;
            _resultValue.monday = monday;
            _resultValue.saturday = saturday;
            _resultValue.sunday = sunday;
            _resultValue.thursday = thursday;
            _resultValue.tuesday = tuesday;
            _resultValue.wednesday = wednesday;
            return _resultValue;
        }
    }
}
