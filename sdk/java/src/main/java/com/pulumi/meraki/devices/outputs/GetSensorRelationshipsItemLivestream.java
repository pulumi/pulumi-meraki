// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetSensorRelationshipsItemLivestreamRelatedDevice;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSensorRelationshipsItemLivestream {
    /**
     * @return An array of the related devices for the role
     * 
     */
    private List<GetSensorRelationshipsItemLivestreamRelatedDevice> relatedDevices;

    private GetSensorRelationshipsItemLivestream() {}
    /**
     * @return An array of the related devices for the role
     * 
     */
    public List<GetSensorRelationshipsItemLivestreamRelatedDevice> relatedDevices() {
        return this.relatedDevices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorRelationshipsItemLivestream defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSensorRelationshipsItemLivestreamRelatedDevice> relatedDevices;
        public Builder() {}
        public Builder(GetSensorRelationshipsItemLivestream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relatedDevices = defaults.relatedDevices;
        }

        @CustomType.Setter
        public Builder relatedDevices(List<GetSensorRelationshipsItemLivestreamRelatedDevice> relatedDevices) {
            if (relatedDevices == null) {
              throw new MissingRequiredPropertyException("GetSensorRelationshipsItemLivestream", "relatedDevices");
            }
            this.relatedDevices = relatedDevices;
            return this;
        }
        public Builder relatedDevices(GetSensorRelationshipsItemLivestreamRelatedDevice... relatedDevices) {
            return relatedDevices(List.of(relatedDevices));
        }
        public GetSensorRelationshipsItemLivestream build() {
            final var _resultValue = new GetSensorRelationshipsItemLivestream();
            _resultValue.relatedDevices = relatedDevices;
            return _resultValue;
        }
    }
}
