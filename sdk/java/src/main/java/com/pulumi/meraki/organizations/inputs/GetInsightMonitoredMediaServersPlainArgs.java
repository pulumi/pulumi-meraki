// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInsightMonitoredMediaServersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInsightMonitoredMediaServersPlainArgs Empty = new GetInsightMonitoredMediaServersPlainArgs();

    /**
     * monitoredMediaServerId path parameter. Monitored media server ID
     * 
     */
    @Import(name="monitoredMediaServerId")
    private @Nullable String monitoredMediaServerId;

    /**
     * @return monitoredMediaServerId path parameter. Monitored media server ID
     * 
     */
    public Optional<String> monitoredMediaServerId() {
        return Optional.ofNullable(this.monitoredMediaServerId);
    }

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    private GetInsightMonitoredMediaServersPlainArgs() {}

    private GetInsightMonitoredMediaServersPlainArgs(GetInsightMonitoredMediaServersPlainArgs $) {
        this.monitoredMediaServerId = $.monitoredMediaServerId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInsightMonitoredMediaServersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInsightMonitoredMediaServersPlainArgs $;

        public Builder() {
            $ = new GetInsightMonitoredMediaServersPlainArgs();
        }

        public Builder(GetInsightMonitoredMediaServersPlainArgs defaults) {
            $ = new GetInsightMonitoredMediaServersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monitoredMediaServerId monitoredMediaServerId path parameter. Monitored media server ID
         * 
         * @return builder
         * 
         */
        public Builder monitoredMediaServerId(@Nullable String monitoredMediaServerId) {
            $.monitoredMediaServerId = monitoredMediaServerId;
            return this;
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetInsightMonitoredMediaServersPlainArgs build() {
            return $;
        }
    }

}
