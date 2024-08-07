// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.meraki.networks.inputs.FloorPlansBottomLeftCornerArgs;
import com.pulumi.meraki.networks.inputs.FloorPlansBottomRightCornerArgs;
import com.pulumi.meraki.networks.inputs.FloorPlansCenterArgs;
import com.pulumi.meraki.networks.inputs.FloorPlansDeviceArgs;
import com.pulumi.meraki.networks.inputs.FloorPlansTopLeftCornerArgs;
import com.pulumi.meraki.networks.inputs.FloorPlansTopRightCornerArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FloorPlansState extends com.pulumi.resources.ResourceArgs {

    public static final FloorPlansState Empty = new FloorPlansState();

    /**
     * The longitude and latitude of the bottom left corner of your floor plan.
     * 
     */
    @Import(name="bottomLeftCorner")
    private @Nullable Output<FloorPlansBottomLeftCornerArgs> bottomLeftCorner;

    /**
     * @return The longitude and latitude of the bottom left corner of your floor plan.
     * 
     */
    public Optional<Output<FloorPlansBottomLeftCornerArgs>> bottomLeftCorner() {
        return Optional.ofNullable(this.bottomLeftCorner);
    }

    /**
     * The longitude and latitude of the bottom right corner of your floor plan.
     * 
     */
    @Import(name="bottomRightCorner")
    private @Nullable Output<FloorPlansBottomRightCornerArgs> bottomRightCorner;

    /**
     * @return The longitude and latitude of the bottom right corner of your floor plan.
     * 
     */
    public Optional<Output<FloorPlansBottomRightCornerArgs>> bottomRightCorner() {
        return Optional.ofNullable(this.bottomRightCorner);
    }

    /**
     * The longitude and latitude of the center of your floor plan. The &#39;center&#39; or two adjacent corners (e.g. &#39;topLeftCorner&#39; and &#39;bottomLeftCorner&#39;) must be specified. If &#39;center&#39; is specified, the floor plan is placed over that point with no rotation. If two adjacent corners are specified, the floor plan is rotated to line up with the two specified points. The aspect ratio of the floor plan&#39;s image is preserved regardless of which corners/center are specified. (This means if that more than two corners are specified, only two corners may be used to preserve the floor plan&#39;s aspect ratio.). No two points can have the same latitude, longitude pair.
     * 
     */
    @Import(name="center")
    private @Nullable Output<FloorPlansCenterArgs> center;

    /**
     * @return The longitude and latitude of the center of your floor plan. The &#39;center&#39; or two adjacent corners (e.g. &#39;topLeftCorner&#39; and &#39;bottomLeftCorner&#39;) must be specified. If &#39;center&#39; is specified, the floor plan is placed over that point with no rotation. If two adjacent corners are specified, the floor plan is rotated to line up with the two specified points. The aspect ratio of the floor plan&#39;s image is preserved regardless of which corners/center are specified. (This means if that more than two corners are specified, only two corners may be used to preserve the floor plan&#39;s aspect ratio.). No two points can have the same latitude, longitude pair.
     * 
     */
    public Optional<Output<FloorPlansCenterArgs>> center() {
        return Optional.ofNullable(this.center);
    }

    /**
     * List of devices for the floorplan
     * 
     */
    @Import(name="devices")
    private @Nullable Output<List<FloorPlansDeviceArgs>> devices;

    /**
     * @return List of devices for the floorplan
     * 
     */
    public Optional<Output<List<FloorPlansDeviceArgs>>> devices() {
        return Optional.ofNullable(this.devices);
    }

    /**
     * Floor plan ID
     * 
     */
    @Import(name="floorPlanId")
    private @Nullable Output<String> floorPlanId;

    /**
     * @return Floor plan ID
     * 
     */
    public Optional<Output<String>> floorPlanId() {
        return Optional.ofNullable(this.floorPlanId);
    }

    /**
     * The height of your floor plan.
     * 
     */
    @Import(name="height")
    private @Nullable Output<Double> height;

    /**
     * @return The height of your floor plan.
     * 
     */
    public Optional<Output<Double>> height() {
        return Optional.ofNullable(this.height);
    }

    /**
     * The file contents (a base 64 encoded string) of your image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in.
     * 
     */
    @Import(name="imageContents")
    private @Nullable Output<String> imageContents;

    /**
     * @return The file contents (a base 64 encoded string) of your image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in.
     * 
     */
    public Optional<Output<String>> imageContents() {
        return Optional.ofNullable(this.imageContents);
    }

    /**
     * The format type of the image.
     * 
     */
    @Import(name="imageExtension")
    private @Nullable Output<String> imageExtension;

    /**
     * @return The format type of the image.
     * 
     */
    public Optional<Output<String>> imageExtension() {
        return Optional.ofNullable(this.imageExtension);
    }

    /**
     * The file contents (a base 64 encoded string) of your new image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in. If you upload a new image, and you do NOT specify any new geolocation fields (&#39;center, &#39;topLeftCorner&#39;, etc), the floor plan will be recentered with no rotation in order to maintain the aspect ratio of your new image.
     * 
     */
    @Import(name="imageMd5")
    private @Nullable Output<String> imageMd5;

    /**
     * @return The file contents (a base 64 encoded string) of your new image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in. If you upload a new image, and you do NOT specify any new geolocation fields (&#39;center, &#39;topLeftCorner&#39;, etc), the floor plan will be recentered with no rotation in order to maintain the aspect ratio of your new image.
     * 
     */
    public Optional<Output<String>> imageMd5() {
        return Optional.ofNullable(this.imageMd5);
    }

    /**
     * The url link for the floor plan image.
     * 
     */
    @Import(name="imageUrl")
    private @Nullable Output<String> imageUrl;

    /**
     * @return The url link for the floor plan image.
     * 
     */
    public Optional<Output<String>> imageUrl() {
        return Optional.ofNullable(this.imageUrl);
    }

    /**
     * The time the image url link will expire.
     * 
     */
    @Import(name="imageUrlExpiresAt")
    private @Nullable Output<String> imageUrlExpiresAt;

    /**
     * @return The time the image url link will expire.
     * 
     */
    public Optional<Output<String>> imageUrlExpiresAt() {
        return Optional.ofNullable(this.imageUrlExpiresAt);
    }

    /**
     * The name of your floor plan.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of your floor plan.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * networkId path parameter. Network ID
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return networkId path parameter. Network ID
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * The longitude and latitude of the top left corner of your floor plan.
     * 
     */
    @Import(name="topLeftCorner")
    private @Nullable Output<FloorPlansTopLeftCornerArgs> topLeftCorner;

    /**
     * @return The longitude and latitude of the top left corner of your floor plan.
     * 
     */
    public Optional<Output<FloorPlansTopLeftCornerArgs>> topLeftCorner() {
        return Optional.ofNullable(this.topLeftCorner);
    }

    /**
     * The longitude and latitude of the top right corner of your floor plan.
     * 
     */
    @Import(name="topRightCorner")
    private @Nullable Output<FloorPlansTopRightCornerArgs> topRightCorner;

    /**
     * @return The longitude and latitude of the top right corner of your floor plan.
     * 
     */
    public Optional<Output<FloorPlansTopRightCornerArgs>> topRightCorner() {
        return Optional.ofNullable(this.topRightCorner);
    }

    /**
     * The width of your floor plan.
     * 
     */
    @Import(name="width")
    private @Nullable Output<Double> width;

    /**
     * @return The width of your floor plan.
     * 
     */
    public Optional<Output<Double>> width() {
        return Optional.ofNullable(this.width);
    }

    private FloorPlansState() {}

    private FloorPlansState(FloorPlansState $) {
        this.bottomLeftCorner = $.bottomLeftCorner;
        this.bottomRightCorner = $.bottomRightCorner;
        this.center = $.center;
        this.devices = $.devices;
        this.floorPlanId = $.floorPlanId;
        this.height = $.height;
        this.imageContents = $.imageContents;
        this.imageExtension = $.imageExtension;
        this.imageMd5 = $.imageMd5;
        this.imageUrl = $.imageUrl;
        this.imageUrlExpiresAt = $.imageUrlExpiresAt;
        this.name = $.name;
        this.networkId = $.networkId;
        this.topLeftCorner = $.topLeftCorner;
        this.topRightCorner = $.topRightCorner;
        this.width = $.width;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FloorPlansState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FloorPlansState $;

        public Builder() {
            $ = new FloorPlansState();
        }

        public Builder(FloorPlansState defaults) {
            $ = new FloorPlansState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bottomLeftCorner The longitude and latitude of the bottom left corner of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder bottomLeftCorner(@Nullable Output<FloorPlansBottomLeftCornerArgs> bottomLeftCorner) {
            $.bottomLeftCorner = bottomLeftCorner;
            return this;
        }

        /**
         * @param bottomLeftCorner The longitude and latitude of the bottom left corner of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder bottomLeftCorner(FloorPlansBottomLeftCornerArgs bottomLeftCorner) {
            return bottomLeftCorner(Output.of(bottomLeftCorner));
        }

        /**
         * @param bottomRightCorner The longitude and latitude of the bottom right corner of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder bottomRightCorner(@Nullable Output<FloorPlansBottomRightCornerArgs> bottomRightCorner) {
            $.bottomRightCorner = bottomRightCorner;
            return this;
        }

        /**
         * @param bottomRightCorner The longitude and latitude of the bottom right corner of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder bottomRightCorner(FloorPlansBottomRightCornerArgs bottomRightCorner) {
            return bottomRightCorner(Output.of(bottomRightCorner));
        }

        /**
         * @param center The longitude and latitude of the center of your floor plan. The &#39;center&#39; or two adjacent corners (e.g. &#39;topLeftCorner&#39; and &#39;bottomLeftCorner&#39;) must be specified. If &#39;center&#39; is specified, the floor plan is placed over that point with no rotation. If two adjacent corners are specified, the floor plan is rotated to line up with the two specified points. The aspect ratio of the floor plan&#39;s image is preserved regardless of which corners/center are specified. (This means if that more than two corners are specified, only two corners may be used to preserve the floor plan&#39;s aspect ratio.). No two points can have the same latitude, longitude pair.
         * 
         * @return builder
         * 
         */
        public Builder center(@Nullable Output<FloorPlansCenterArgs> center) {
            $.center = center;
            return this;
        }

        /**
         * @param center The longitude and latitude of the center of your floor plan. The &#39;center&#39; or two adjacent corners (e.g. &#39;topLeftCorner&#39; and &#39;bottomLeftCorner&#39;) must be specified. If &#39;center&#39; is specified, the floor plan is placed over that point with no rotation. If two adjacent corners are specified, the floor plan is rotated to line up with the two specified points. The aspect ratio of the floor plan&#39;s image is preserved regardless of which corners/center are specified. (This means if that more than two corners are specified, only two corners may be used to preserve the floor plan&#39;s aspect ratio.). No two points can have the same latitude, longitude pair.
         * 
         * @return builder
         * 
         */
        public Builder center(FloorPlansCenterArgs center) {
            return center(Output.of(center));
        }

        /**
         * @param devices List of devices for the floorplan
         * 
         * @return builder
         * 
         */
        public Builder devices(@Nullable Output<List<FloorPlansDeviceArgs>> devices) {
            $.devices = devices;
            return this;
        }

        /**
         * @param devices List of devices for the floorplan
         * 
         * @return builder
         * 
         */
        public Builder devices(List<FloorPlansDeviceArgs> devices) {
            return devices(Output.of(devices));
        }

        /**
         * @param devices List of devices for the floorplan
         * 
         * @return builder
         * 
         */
        public Builder devices(FloorPlansDeviceArgs... devices) {
            return devices(List.of(devices));
        }

        /**
         * @param floorPlanId Floor plan ID
         * 
         * @return builder
         * 
         */
        public Builder floorPlanId(@Nullable Output<String> floorPlanId) {
            $.floorPlanId = floorPlanId;
            return this;
        }

        /**
         * @param floorPlanId Floor plan ID
         * 
         * @return builder
         * 
         */
        public Builder floorPlanId(String floorPlanId) {
            return floorPlanId(Output.of(floorPlanId));
        }

        /**
         * @param height The height of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder height(@Nullable Output<Double> height) {
            $.height = height;
            return this;
        }

        /**
         * @param height The height of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder height(Double height) {
            return height(Output.of(height));
        }

        /**
         * @param imageContents The file contents (a base 64 encoded string) of your image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in.
         * 
         * @return builder
         * 
         */
        public Builder imageContents(@Nullable Output<String> imageContents) {
            $.imageContents = imageContents;
            return this;
        }

        /**
         * @param imageContents The file contents (a base 64 encoded string) of your image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in.
         * 
         * @return builder
         * 
         */
        public Builder imageContents(String imageContents) {
            return imageContents(Output.of(imageContents));
        }

        /**
         * @param imageExtension The format type of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageExtension(@Nullable Output<String> imageExtension) {
            $.imageExtension = imageExtension;
            return this;
        }

        /**
         * @param imageExtension The format type of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageExtension(String imageExtension) {
            return imageExtension(Output.of(imageExtension));
        }

        /**
         * @param imageMd5 The file contents (a base 64 encoded string) of your new image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in. If you upload a new image, and you do NOT specify any new geolocation fields (&#39;center, &#39;topLeftCorner&#39;, etc), the floor plan will be recentered with no rotation in order to maintain the aspect ratio of your new image.
         * 
         * @return builder
         * 
         */
        public Builder imageMd5(@Nullable Output<String> imageMd5) {
            $.imageMd5 = imageMd5;
            return this;
        }

        /**
         * @param imageMd5 The file contents (a base 64 encoded string) of your new image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in. If you upload a new image, and you do NOT specify any new geolocation fields (&#39;center, &#39;topLeftCorner&#39;, etc), the floor plan will be recentered with no rotation in order to maintain the aspect ratio of your new image.
         * 
         * @return builder
         * 
         */
        public Builder imageMd5(String imageMd5) {
            return imageMd5(Output.of(imageMd5));
        }

        /**
         * @param imageUrl The url link for the floor plan image.
         * 
         * @return builder
         * 
         */
        public Builder imageUrl(@Nullable Output<String> imageUrl) {
            $.imageUrl = imageUrl;
            return this;
        }

        /**
         * @param imageUrl The url link for the floor plan image.
         * 
         * @return builder
         * 
         */
        public Builder imageUrl(String imageUrl) {
            return imageUrl(Output.of(imageUrl));
        }

        /**
         * @param imageUrlExpiresAt The time the image url link will expire.
         * 
         * @return builder
         * 
         */
        public Builder imageUrlExpiresAt(@Nullable Output<String> imageUrlExpiresAt) {
            $.imageUrlExpiresAt = imageUrlExpiresAt;
            return this;
        }

        /**
         * @param imageUrlExpiresAt The time the image url link will expire.
         * 
         * @return builder
         * 
         */
        public Builder imageUrlExpiresAt(String imageUrlExpiresAt) {
            return imageUrlExpiresAt(Output.of(imageUrlExpiresAt));
        }

        /**
         * @param name The name of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId networkId path parameter. Network ID
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param topLeftCorner The longitude and latitude of the top left corner of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder topLeftCorner(@Nullable Output<FloorPlansTopLeftCornerArgs> topLeftCorner) {
            $.topLeftCorner = topLeftCorner;
            return this;
        }

        /**
         * @param topLeftCorner The longitude and latitude of the top left corner of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder topLeftCorner(FloorPlansTopLeftCornerArgs topLeftCorner) {
            return topLeftCorner(Output.of(topLeftCorner));
        }

        /**
         * @param topRightCorner The longitude and latitude of the top right corner of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder topRightCorner(@Nullable Output<FloorPlansTopRightCornerArgs> topRightCorner) {
            $.topRightCorner = topRightCorner;
            return this;
        }

        /**
         * @param topRightCorner The longitude and latitude of the top right corner of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder topRightCorner(FloorPlansTopRightCornerArgs topRightCorner) {
            return topRightCorner(Output.of(topRightCorner));
        }

        /**
         * @param width The width of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder width(@Nullable Output<Double> width) {
            $.width = width;
            return this;
        }

        /**
         * @param width The width of your floor plan.
         * 
         * @return builder
         * 
         */
        public Builder width(Double width) {
            return width(Output.of(width));
        }

        public FloorPlansState build() {
            return $;
        }
    }

}
