// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetBluetoothClientsItem;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBluetoothClientsResult {
    /**
     * @return bluetoothClientId path parameter. Bluetooth client ID
     * 
     */
    private String bluetoothClientId;
    /**
     * @return connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
     * 
     */
    private @Nullable Integer connectivityHistoryTimespan;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return includeConnectivityHistory query parameter. Include the connectivity history for this client
     * 
     */
    private @Nullable Boolean includeConnectivityHistory;
    private GetBluetoothClientsItem item;
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    private String networkId;

    private GetBluetoothClientsResult() {}
    /**
     * @return bluetoothClientId path parameter. Bluetooth client ID
     * 
     */
    public String bluetoothClientId() {
        return this.bluetoothClientId;
    }
    /**
     * @return connectivityHistoryTimespan query parameter. The timespan, in seconds, for the connectivityHistory data. By default 1 day, 86400, will be used.
     * 
     */
    public Optional<Integer> connectivityHistoryTimespan() {
        return Optional.ofNullable(this.connectivityHistoryTimespan);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return includeConnectivityHistory query parameter. Include the connectivity history for this client
     * 
     */
    public Optional<Boolean> includeConnectivityHistory() {
        return Optional.ofNullable(this.includeConnectivityHistory);
    }
    public GetBluetoothClientsItem item() {
        return this.item;
    }
    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public String networkId() {
        return this.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBluetoothClientsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bluetoothClientId;
        private @Nullable Integer connectivityHistoryTimespan;
        private String id;
        private @Nullable Boolean includeConnectivityHistory;
        private GetBluetoothClientsItem item;
        private String networkId;
        public Builder() {}
        public Builder(GetBluetoothClientsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bluetoothClientId = defaults.bluetoothClientId;
    	      this.connectivityHistoryTimespan = defaults.connectivityHistoryTimespan;
    	      this.id = defaults.id;
    	      this.includeConnectivityHistory = defaults.includeConnectivityHistory;
    	      this.item = defaults.item;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder bluetoothClientId(String bluetoothClientId) {
            if (bluetoothClientId == null) {
              throw new MissingRequiredPropertyException("GetBluetoothClientsResult", "bluetoothClientId");
            }
            this.bluetoothClientId = bluetoothClientId;
            return this;
        }
        @CustomType.Setter
        public Builder connectivityHistoryTimespan(@Nullable Integer connectivityHistoryTimespan) {

            this.connectivityHistoryTimespan = connectivityHistoryTimespan;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBluetoothClientsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder includeConnectivityHistory(@Nullable Boolean includeConnectivityHistory) {

            this.includeConnectivityHistory = includeConnectivityHistory;
            return this;
        }
        @CustomType.Setter
        public Builder item(GetBluetoothClientsItem item) {
            if (item == null) {
              throw new MissingRequiredPropertyException("GetBluetoothClientsResult", "item");
            }
            this.item = item;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetBluetoothClientsResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        public GetBluetoothClientsResult build() {
            final var _resultValue = new GetBluetoothClientsResult();
            _resultValue.bluetoothClientId = bluetoothClientId;
            _resultValue.connectivityHistoryTimespan = connectivityHistoryTimespan;
            _resultValue.id = id;
            _resultValue.includeConnectivityHistory = includeConnectivityHistory;
            _resultValue.item = item;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}