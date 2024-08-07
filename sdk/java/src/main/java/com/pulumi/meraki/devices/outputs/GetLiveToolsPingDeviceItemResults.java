// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetLiveToolsPingDeviceItemResultsLatencies;
import com.pulumi.meraki.devices.outputs.GetLiveToolsPingDeviceItemResultsLoss;
import com.pulumi.meraki.devices.outputs.GetLiveToolsPingDeviceItemResultsReply;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLiveToolsPingDeviceItemResults {
    /**
     * @return Packet latency stats
     * 
     */
    private GetLiveToolsPingDeviceItemResultsLatencies latencies;
    /**
     * @return Lost packets
     * 
     */
    private GetLiveToolsPingDeviceItemResultsLoss loss;
    /**
     * @return Number of packets received
     * 
     */
    private Integer received;
    /**
     * @return Received packets
     * 
     */
    private List<GetLiveToolsPingDeviceItemResultsReply> replies;
    /**
     * @return Number of packets sent
     * 
     */
    private Integer sent;

    private GetLiveToolsPingDeviceItemResults() {}
    /**
     * @return Packet latency stats
     * 
     */
    public GetLiveToolsPingDeviceItemResultsLatencies latencies() {
        return this.latencies;
    }
    /**
     * @return Lost packets
     * 
     */
    public GetLiveToolsPingDeviceItemResultsLoss loss() {
        return this.loss;
    }
    /**
     * @return Number of packets received
     * 
     */
    public Integer received() {
        return this.received;
    }
    /**
     * @return Received packets
     * 
     */
    public List<GetLiveToolsPingDeviceItemResultsReply> replies() {
        return this.replies;
    }
    /**
     * @return Number of packets sent
     * 
     */
    public Integer sent() {
        return this.sent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveToolsPingDeviceItemResults defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetLiveToolsPingDeviceItemResultsLatencies latencies;
        private GetLiveToolsPingDeviceItemResultsLoss loss;
        private Integer received;
        private List<GetLiveToolsPingDeviceItemResultsReply> replies;
        private Integer sent;
        public Builder() {}
        public Builder(GetLiveToolsPingDeviceItemResults defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latencies = defaults.latencies;
    	      this.loss = defaults.loss;
    	      this.received = defaults.received;
    	      this.replies = defaults.replies;
    	      this.sent = defaults.sent;
        }

        @CustomType.Setter
        public Builder latencies(GetLiveToolsPingDeviceItemResultsLatencies latencies) {
            if (latencies == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItemResults", "latencies");
            }
            this.latencies = latencies;
            return this;
        }
        @CustomType.Setter
        public Builder loss(GetLiveToolsPingDeviceItemResultsLoss loss) {
            if (loss == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItemResults", "loss");
            }
            this.loss = loss;
            return this;
        }
        @CustomType.Setter
        public Builder received(Integer received) {
            if (received == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItemResults", "received");
            }
            this.received = received;
            return this;
        }
        @CustomType.Setter
        public Builder replies(List<GetLiveToolsPingDeviceItemResultsReply> replies) {
            if (replies == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItemResults", "replies");
            }
            this.replies = replies;
            return this;
        }
        public Builder replies(GetLiveToolsPingDeviceItemResultsReply... replies) {
            return replies(List.of(replies));
        }
        @CustomType.Setter
        public Builder sent(Integer sent) {
            if (sent == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingDeviceItemResults", "sent");
            }
            this.sent = sent;
            return this;
        }
        public GetLiveToolsPingDeviceItemResults build() {
            final var _resultValue = new GetLiveToolsPingDeviceItemResults();
            _resultValue.latencies = latencies;
            _resultValue.loss = loss;
            _resultValue.received = received;
            _resultValue.replies = replies;
            _resultValue.sent = sent;
            return _resultValue;
        }
    }
}
