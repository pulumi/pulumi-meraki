// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInsightMonitoredMediaServersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInsightMonitoredMediaServersArgs Empty = new GetInsightMonitoredMediaServersArgs();

    /**
     * monitoredMediaServerId path parameter. Monitored media server ID
     * 
     */
    @Import(name="monitoredMediaServerId")
    private @Nullable Output<String> monitoredMediaServerId;

    /**
     * @return monitoredMediaServerId path parameter. Monitored media server ID
     * 
     */
    public Optional<Output<String>> monitoredMediaServerId() {
        return Optional.ofNullable(this.monitoredMediaServerId);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    private GetInsightMonitoredMediaServersArgs() {}

    private GetInsightMonitoredMediaServersArgs(GetInsightMonitoredMediaServersArgs $) {
        this.monitoredMediaServerId = $.monitoredMediaServerId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInsightMonitoredMediaServersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInsightMonitoredMediaServersArgs $;

        public Builder() {
            $ = new GetInsightMonitoredMediaServersArgs();
        }

        public Builder(GetInsightMonitoredMediaServersArgs defaults) {
            $ = new GetInsightMonitoredMediaServersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monitoredMediaServerId monitoredMediaServerId path parameter. Monitored media server ID
         * 
         * @return builder
         * 
         */
        public Builder monitoredMediaServerId(@Nullable Output<String> monitoredMediaServerId) {
            $.monitoredMediaServerId = monitoredMediaServerId;
            return this;
        }

        /**
         * @param monitoredMediaServerId monitoredMediaServerId path parameter. Monitored media server ID
         * 
         * @return builder
         * 
         */
        public Builder monitoredMediaServerId(String monitoredMediaServerId) {
            return monitoredMediaServerId(Output.of(monitoredMediaServerId));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetInsightMonitoredMediaServersArgs build() {
            return $;
        }
    }

}
