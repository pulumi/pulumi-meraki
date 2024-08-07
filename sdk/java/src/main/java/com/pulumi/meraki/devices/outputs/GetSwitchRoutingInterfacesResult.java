// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetSwitchRoutingInterfacesItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSwitchRoutingInterfacesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return interfaceId path parameter. Interface ID
     * 
     */
    private @Nullable String interfaceId;
    private GetSwitchRoutingInterfacesItem item;
    /**
     * @return Array of ResponseSwitchGetDeviceSwitchRoutingInterfaces
     * 
     */
    private List<GetSwitchRoutingInterfacesItem> items;
    /**
     * @return serial path parameter.
     * 
     */
    private @Nullable String serial;

    private GetSwitchRoutingInterfacesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return interfaceId path parameter. Interface ID
     * 
     */
    public Optional<String> interfaceId() {
        return Optional.ofNullable(this.interfaceId);
    }
    public GetSwitchRoutingInterfacesItem item() {
        return this.item;
    }
    /**
     * @return Array of ResponseSwitchGetDeviceSwitchRoutingInterfaces
     * 
     */
    public List<GetSwitchRoutingInterfacesItem> items() {
        return this.items;
    }
    /**
     * @return serial path parameter.
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchRoutingInterfacesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String interfaceId;
        private GetSwitchRoutingInterfacesItem item;
        private List<GetSwitchRoutingInterfacesItem> items;
        private @Nullable String serial;
        public Builder() {}
        public Builder(GetSwitchRoutingInterfacesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.interfaceId = defaults.interfaceId;
    	      this.item = defaults.item;
    	      this.items = defaults.items;
    	      this.serial = defaults.serial;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder interfaceId(@Nullable String interfaceId) {

            this.interfaceId = interfaceId;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetSwitchRoutingInterfacesItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetSwitchRoutingInterfacesItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetSwitchRoutingInterfacesResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetSwitchRoutingInterfacesItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder serial(@Nullable String serial) {

            this.serial = serial;
            return this;
        }
        public GetSwitchRoutingInterfacesResult build() {
            final var _resultValue = new GetSwitchRoutingInterfacesResult();
            _resultValue.id = id;
            _resultValue.interfaceId = interfaceId;
            _resultValue.item = item;
            _resultValue.items = items;
            _resultValue.serial = serial;
            return _resultValue;
        }
    }
}
