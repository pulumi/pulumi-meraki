// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetSensorAlertsOverviewByMetricItemCountsNoise;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSensorAlertsOverviewByMetricItemCounts {
    /**
     * @return Number of sensor alerts that occurred due to apparent power readings
     * 
     */
    private Integer apparentPower;
    /**
     * @return Number of sensors that are currently alerting due to CO2 readings
     * 
     */
    private Integer co2;
    /**
     * @return Number of sensor alerts that occurred due to electrical current readings
     * 
     */
    private Integer current;
    /**
     * @return Number of sensor alerts that occurred due to an open door
     * 
     */
    private Integer door;
    /**
     * @return Number of sensor alerts that occurred due to frequency readings
     * 
     */
    private Integer frequency;
    /**
     * @return Number of sensor alerts that occurred due to humidity readings
     * 
     */
    private Integer humidity;
    /**
     * @return Number of sensor alerts that occurred due to indoor air quality readings
     * 
     */
    private Integer indoorAirQuality;
    /**
     * @return Object containing the number of sensor alerts that occurred due to noise readings
     * 
     */
    private GetSensorAlertsOverviewByMetricItemCountsNoise noise;
    /**
     * @return Number of sensor alerts that occurred due to PM2.5 readings
     * 
     */
    private Integer pm25;
    /**
     * @return Number of sensor alerts that occurred due to power factor readings
     * 
     */
    private Integer powerFactor;
    /**
     * @return Number of sensor alerts that occurred due to real power readings
     * 
     */
    private Integer realPower;
    /**
     * @return Number of sensor alerts that occurred due to temperature readings
     * 
     */
    private Integer temperature;
    /**
     * @return Number of sensor alerts that occurred due to TVOC readings
     * 
     */
    private Integer tvoc;
    /**
     * @return Number of sensor alerts that occurred due to upstream power outages
     * 
     */
    private Integer upstreamPower;
    /**
     * @return Number of sensor alerts that occurred due to voltage readings
     * 
     */
    private Integer voltage;
    /**
     * @return Number of sensor alerts that occurred due to the presence of water
     * 
     */
    private Integer water;

    private GetSensorAlertsOverviewByMetricItemCounts() {}
    /**
     * @return Number of sensor alerts that occurred due to apparent power readings
     * 
     */
    public Integer apparentPower() {
        return this.apparentPower;
    }
    /**
     * @return Number of sensors that are currently alerting due to CO2 readings
     * 
     */
    public Integer co2() {
        return this.co2;
    }
    /**
     * @return Number of sensor alerts that occurred due to electrical current readings
     * 
     */
    public Integer current() {
        return this.current;
    }
    /**
     * @return Number of sensor alerts that occurred due to an open door
     * 
     */
    public Integer door() {
        return this.door;
    }
    /**
     * @return Number of sensor alerts that occurred due to frequency readings
     * 
     */
    public Integer frequency() {
        return this.frequency;
    }
    /**
     * @return Number of sensor alerts that occurred due to humidity readings
     * 
     */
    public Integer humidity() {
        return this.humidity;
    }
    /**
     * @return Number of sensor alerts that occurred due to indoor air quality readings
     * 
     */
    public Integer indoorAirQuality() {
        return this.indoorAirQuality;
    }
    /**
     * @return Object containing the number of sensor alerts that occurred due to noise readings
     * 
     */
    public GetSensorAlertsOverviewByMetricItemCountsNoise noise() {
        return this.noise;
    }
    /**
     * @return Number of sensor alerts that occurred due to PM2.5 readings
     * 
     */
    public Integer pm25() {
        return this.pm25;
    }
    /**
     * @return Number of sensor alerts that occurred due to power factor readings
     * 
     */
    public Integer powerFactor() {
        return this.powerFactor;
    }
    /**
     * @return Number of sensor alerts that occurred due to real power readings
     * 
     */
    public Integer realPower() {
        return this.realPower;
    }
    /**
     * @return Number of sensor alerts that occurred due to temperature readings
     * 
     */
    public Integer temperature() {
        return this.temperature;
    }
    /**
     * @return Number of sensor alerts that occurred due to TVOC readings
     * 
     */
    public Integer tvoc() {
        return this.tvoc;
    }
    /**
     * @return Number of sensor alerts that occurred due to upstream power outages
     * 
     */
    public Integer upstreamPower() {
        return this.upstreamPower;
    }
    /**
     * @return Number of sensor alerts that occurred due to voltage readings
     * 
     */
    public Integer voltage() {
        return this.voltage;
    }
    /**
     * @return Number of sensor alerts that occurred due to the presence of water
     * 
     */
    public Integer water() {
        return this.water;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorAlertsOverviewByMetricItemCounts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer apparentPower;
        private Integer co2;
        private Integer current;
        private Integer door;
        private Integer frequency;
        private Integer humidity;
        private Integer indoorAirQuality;
        private GetSensorAlertsOverviewByMetricItemCountsNoise noise;
        private Integer pm25;
        private Integer powerFactor;
        private Integer realPower;
        private Integer temperature;
        private Integer tvoc;
        private Integer upstreamPower;
        private Integer voltage;
        private Integer water;
        public Builder() {}
        public Builder(GetSensorAlertsOverviewByMetricItemCounts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apparentPower = defaults.apparentPower;
    	      this.co2 = defaults.co2;
    	      this.current = defaults.current;
    	      this.door = defaults.door;
    	      this.frequency = defaults.frequency;
    	      this.humidity = defaults.humidity;
    	      this.indoorAirQuality = defaults.indoorAirQuality;
    	      this.noise = defaults.noise;
    	      this.pm25 = defaults.pm25;
    	      this.powerFactor = defaults.powerFactor;
    	      this.realPower = defaults.realPower;
    	      this.temperature = defaults.temperature;
    	      this.tvoc = defaults.tvoc;
    	      this.upstreamPower = defaults.upstreamPower;
    	      this.voltage = defaults.voltage;
    	      this.water = defaults.water;
        }

        @CustomType.Setter
        public Builder apparentPower(Integer apparentPower) {
            if (apparentPower == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "apparentPower");
            }
            this.apparentPower = apparentPower;
            return this;
        }
        @CustomType.Setter
        public Builder co2(Integer co2) {
            if (co2 == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "co2");
            }
            this.co2 = co2;
            return this;
        }
        @CustomType.Setter
        public Builder current(Integer current) {
            if (current == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "current");
            }
            this.current = current;
            return this;
        }
        @CustomType.Setter
        public Builder door(Integer door) {
            if (door == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "door");
            }
            this.door = door;
            return this;
        }
        @CustomType.Setter
        public Builder frequency(Integer frequency) {
            if (frequency == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "frequency");
            }
            this.frequency = frequency;
            return this;
        }
        @CustomType.Setter
        public Builder humidity(Integer humidity) {
            if (humidity == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "humidity");
            }
            this.humidity = humidity;
            return this;
        }
        @CustomType.Setter
        public Builder indoorAirQuality(Integer indoorAirQuality) {
            if (indoorAirQuality == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "indoorAirQuality");
            }
            this.indoorAirQuality = indoorAirQuality;
            return this;
        }
        @CustomType.Setter
        public Builder noise(GetSensorAlertsOverviewByMetricItemCountsNoise noise) {
            if (noise == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "noise");
            }
            this.noise = noise;
            return this;
        }
        @CustomType.Setter
        public Builder pm25(Integer pm25) {
            if (pm25 == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "pm25");
            }
            this.pm25 = pm25;
            return this;
        }
        @CustomType.Setter
        public Builder powerFactor(Integer powerFactor) {
            if (powerFactor == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "powerFactor");
            }
            this.powerFactor = powerFactor;
            return this;
        }
        @CustomType.Setter
        public Builder realPower(Integer realPower) {
            if (realPower == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "realPower");
            }
            this.realPower = realPower;
            return this;
        }
        @CustomType.Setter
        public Builder temperature(Integer temperature) {
            if (temperature == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "temperature");
            }
            this.temperature = temperature;
            return this;
        }
        @CustomType.Setter
        public Builder tvoc(Integer tvoc) {
            if (tvoc == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "tvoc");
            }
            this.tvoc = tvoc;
            return this;
        }
        @CustomType.Setter
        public Builder upstreamPower(Integer upstreamPower) {
            if (upstreamPower == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "upstreamPower");
            }
            this.upstreamPower = upstreamPower;
            return this;
        }
        @CustomType.Setter
        public Builder voltage(Integer voltage) {
            if (voltage == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "voltage");
            }
            this.voltage = voltage;
            return this;
        }
        @CustomType.Setter
        public Builder water(Integer water) {
            if (water == null) {
              throw new MissingRequiredPropertyException("GetSensorAlertsOverviewByMetricItemCounts", "water");
            }
            this.water = water;
            return this;
        }
        public GetSensorAlertsOverviewByMetricItemCounts build() {
            final var _resultValue = new GetSensorAlertsOverviewByMetricItemCounts();
            _resultValue.apparentPower = apparentPower;
            _resultValue.co2 = co2;
            _resultValue.current = current;
            _resultValue.door = door;
            _resultValue.frequency = frequency;
            _resultValue.humidity = humidity;
            _resultValue.indoorAirQuality = indoorAirQuality;
            _resultValue.noise = noise;
            _resultValue.pm25 = pm25;
            _resultValue.powerFactor = powerFactor;
            _resultValue.realPower = realPower;
            _resultValue.temperature = temperature;
            _resultValue.tvoc = tvoc;
            _resultValue.upstreamPower = upstreamPower;
            _resultValue.voltage = voltage;
            _resultValue.water = water;
            return _resultValue;
        }
    }
}