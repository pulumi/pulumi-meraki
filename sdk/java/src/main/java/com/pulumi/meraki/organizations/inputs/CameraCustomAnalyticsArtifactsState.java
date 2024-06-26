// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.organizations.inputs.CameraCustomAnalyticsArtifactsStatusArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CameraCustomAnalyticsArtifactsState extends com.pulumi.resources.ResourceArgs {

    public static final CameraCustomAnalyticsArtifactsState Empty = new CameraCustomAnalyticsArtifactsState();

    /**
     * Custom analytics artifact ID
     * 
     */
    @Import(name="artifactId")
    private @Nullable Output<String> artifactId;

    /**
     * @return Custom analytics artifact ID
     * 
     */
    public Optional<Output<String>> artifactId() {
        return Optional.ofNullable(this.artifactId);
    }

    /**
     * Custom analytics artifact name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Custom analytics artifact name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Organization ID
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return Organization ID
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * Custom analytics artifact status
     * 
     */
    @Import(name="status")
    private @Nullable Output<CameraCustomAnalyticsArtifactsStatusArgs> status;

    /**
     * @return Custom analytics artifact status
     * 
     */
    public Optional<Output<CameraCustomAnalyticsArtifactsStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    private CameraCustomAnalyticsArtifactsState() {}

    private CameraCustomAnalyticsArtifactsState(CameraCustomAnalyticsArtifactsState $) {
        this.artifactId = $.artifactId;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CameraCustomAnalyticsArtifactsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CameraCustomAnalyticsArtifactsState $;

        public Builder() {
            $ = new CameraCustomAnalyticsArtifactsState();
        }

        public Builder(CameraCustomAnalyticsArtifactsState defaults) {
            $ = new CameraCustomAnalyticsArtifactsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactId Custom analytics artifact ID
         * 
         * @return builder
         * 
         */
        public Builder artifactId(@Nullable Output<String> artifactId) {
            $.artifactId = artifactId;
            return this;
        }

        /**
         * @param artifactId Custom analytics artifact ID
         * 
         * @return builder
         * 
         */
        public Builder artifactId(String artifactId) {
            return artifactId(Output.of(artifactId));
        }

        /**
         * @param name Custom analytics artifact name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Custom analytics artifact name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId Organization ID
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param status Custom analytics artifact status
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<CameraCustomAnalyticsArtifactsStatusArgs> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Custom analytics artifact status
         * 
         * @return builder
         * 
         */
        public Builder status(CameraCustomAnalyticsArtifactsStatusArgs status) {
            return status(Output.of(status));
        }

        public CameraCustomAnalyticsArtifactsState build() {
            return $;
        }
    }

}
