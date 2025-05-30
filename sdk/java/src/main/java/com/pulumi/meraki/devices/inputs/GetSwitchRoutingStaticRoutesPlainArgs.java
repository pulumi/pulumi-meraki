// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSwitchRoutingStaticRoutesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchRoutingStaticRoutesPlainArgs Empty = new GetSwitchRoutingStaticRoutesPlainArgs();

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial")
    private @Nullable String serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * staticRouteId path parameter. Static route ID
     * 
     */
    @Import(name="staticRouteId")
    private @Nullable String staticRouteId;

    /**
     * @return staticRouteId path parameter. Static route ID
     * 
     */
    public Optional<String> staticRouteId() {
        return Optional.ofNullable(this.staticRouteId);
    }

    private GetSwitchRoutingStaticRoutesPlainArgs() {}

    private GetSwitchRoutingStaticRoutesPlainArgs(GetSwitchRoutingStaticRoutesPlainArgs $) {
        this.serial = $.serial;
        this.staticRouteId = $.staticRouteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchRoutingStaticRoutesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchRoutingStaticRoutesPlainArgs $;

        public Builder() {
            $ = new GetSwitchRoutingStaticRoutesPlainArgs();
        }

        public Builder(GetSwitchRoutingStaticRoutesPlainArgs defaults) {
            $ = new GetSwitchRoutingStaticRoutesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable String serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param staticRouteId staticRouteId path parameter. Static route ID
         * 
         * @return builder
         * 
         */
        public Builder staticRouteId(@Nullable String staticRouteId) {
            $.staticRouteId = staticRouteId;
            return this;
        }

        public GetSwitchRoutingStaticRoutesPlainArgs build() {
            return $;
        }
    }

}
