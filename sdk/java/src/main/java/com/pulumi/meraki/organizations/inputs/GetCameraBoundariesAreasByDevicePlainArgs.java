// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCameraBoundariesAreasByDevicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCameraBoundariesAreasByDevicePlainArgs Empty = new GetCameraBoundariesAreasByDevicePlainArgs();

    /**
     * organizationId path parameter. Organization ID
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return organizationId path parameter. Organization ID
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
     * 
     */
    @Import(name="serials")
    private @Nullable List<String> serials;

    /**
     * @return serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
     * 
     */
    public Optional<List<String>> serials() {
        return Optional.ofNullable(this.serials);
    }

    private GetCameraBoundariesAreasByDevicePlainArgs() {}

    private GetCameraBoundariesAreasByDevicePlainArgs(GetCameraBoundariesAreasByDevicePlainArgs $) {
        this.organizationId = $.organizationId;
        this.serials = $.serials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCameraBoundariesAreasByDevicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCameraBoundariesAreasByDevicePlainArgs $;

        public Builder() {
            $ = new GetCameraBoundariesAreasByDevicePlainArgs();
        }

        public Builder(GetCameraBoundariesAreasByDevicePlainArgs defaults) {
            $ = new GetCameraBoundariesAreasByDevicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId organizationId path parameter. Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param serials serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable List<String> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials serials query parameter. A list of serial numbers. The returned cameras will be filtered to only include these serials.
         * 
         * @return builder
         * 
         */
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }

        public GetCameraBoundariesAreasByDevicePlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetCameraBoundariesAreasByDevicePlainArgs", "organizationId");
            }
            return $;
        }
    }

}