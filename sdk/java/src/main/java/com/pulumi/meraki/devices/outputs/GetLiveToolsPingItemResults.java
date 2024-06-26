// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.devices.outputs.GetLiveToolsPingItemResultsLatencies;
import com.pulumi.meraki.devices.outputs.GetLiveToolsPingItemResultsLoss;
import com.pulumi.meraki.devices.outputs.GetLiveToolsPingItemResultsReply;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLiveToolsPingItemResults {
    /**
     * @return Packet latency stats
     * 
     */
    private GetLiveToolsPingItemResultsLatencies latencies;
    /**
     * @return Lost packets
     * 
     */
    private GetLiveToolsPingItemResultsLoss loss;
    /**
     * @return Number of packets received
     * 
     */
    private Integer received;
    /**
     * @return Received packets
     * 
     */
    private List<GetLiveToolsPingItemResultsReply> replies;
    /**
     * @return Number of packets sent
     * 
     */
    private Integer sent;

    private GetLiveToolsPingItemResults() {}
    /**
     * @return Packet latency stats
     * 
     */
    public GetLiveToolsPingItemResultsLatencies latencies() {
        return this.latencies;
    }
    /**
     * @return Lost packets
     * 
     */
    public GetLiveToolsPingItemResultsLoss loss() {
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
    public List<GetLiveToolsPingItemResultsReply> replies() {
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

    public static Builder builder(GetLiveToolsPingItemResults defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetLiveToolsPingItemResultsLatencies latencies;
        private GetLiveToolsPingItemResultsLoss loss;
        private Integer received;
        private List<GetLiveToolsPingItemResultsReply> replies;
        private Integer sent;
        public Builder() {}
        public Builder(GetLiveToolsPingItemResults defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latencies = defaults.latencies;
    	      this.loss = defaults.loss;
    	      this.received = defaults.received;
    	      this.replies = defaults.replies;
    	      this.sent = defaults.sent;
        }

        @CustomType.Setter
        public Builder latencies(GetLiveToolsPingItemResultsLatencies latencies) {
            if (latencies == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingItemResults", "latencies");
            }
            this.latencies = latencies;
            return this;
        }
        @CustomType.Setter
        public Builder loss(GetLiveToolsPingItemResultsLoss loss) {
            if (loss == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingItemResults", "loss");
            }
            this.loss = loss;
            return this;
        }
        @CustomType.Setter
        public Builder received(Integer received) {
            if (received == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingItemResults", "received");
            }
            this.received = received;
            return this;
        }
        @CustomType.Setter
        public Builder replies(List<GetLiveToolsPingItemResultsReply> replies) {
            if (replies == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingItemResults", "replies");
            }
            this.replies = replies;
            return this;
        }
        public Builder replies(GetLiveToolsPingItemResultsReply... replies) {
            return replies(List.of(replies));
        }
        @CustomType.Setter
        public Builder sent(Integer sent) {
            if (sent == null) {
              throw new MissingRequiredPropertyException("GetLiveToolsPingItemResults", "sent");
            }
            this.sent = sent;
            return this;
        }
        public GetLiveToolsPingItemResults build() {
            final var _resultValue = new GetLiveToolsPingItemResults();
            _resultValue.latencies = latencies;
            _resultValue.loss = loss;
            _resultValue.received = received;
            _resultValue.replies = replies;
            _resultValue.sent = sent;
            return _resultValue;
        }
    }
}
