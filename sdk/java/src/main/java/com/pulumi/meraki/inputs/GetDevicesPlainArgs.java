// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDevicesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDevicesPlainArgs Empty = new GetDevicesPlainArgs();

    /**
     * configurationUpdatedAfter query parameter. Filter results by whether or not the device&#39;s configuration has been updated after the given timestamp
     * 
     */
    @Import(name="configurationUpdatedAfter")
    private @Nullable String configurationUpdatedAfter;

    /**
     * @return configurationUpdatedAfter query parameter. Filter results by whether or not the device&#39;s configuration has been updated after the given timestamp
     * 
     */
    public Optional<String> configurationUpdatedAfter() {
        return Optional.ofNullable(this.configurationUpdatedAfter);
    }

    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="endingBefore")
    private @Nullable String endingBefore;

    /**
     * @return endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> endingBefore() {
        return Optional.ofNullable(this.endingBefore);
    }

    /**
     * mac query parameter. Optional parameter to filter devices by MAC address. All returned devices will have a MAC address that contains the search term or is an exact match.
     * 
     */
    @Import(name="mac")
    private @Nullable String mac;

    /**
     * @return mac query parameter. Optional parameter to filter devices by MAC address. All returned devices will have a MAC address that contains the search term or is an exact match.
     * 
     */
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }

    /**
     * macs query parameter. Optional parameter to filter devices by one or more MAC addresses. All returned devices will have a MAC address that is an exact match.
     * 
     */
    @Import(name="macs")
    private @Nullable List<String> macs;

    /**
     * @return macs query parameter. Optional parameter to filter devices by one or more MAC addresses. All returned devices will have a MAC address that is an exact match.
     * 
     */
    public Optional<List<String>> macs() {
        return Optional.ofNullable(this.macs);
    }

    /**
     * model query parameter. Optional parameter to filter devices by model. All returned devices will have a model that contains the search term or is an exact match.
     * 
     */
    @Import(name="model")
    private @Nullable String model;

    /**
     * @return model query parameter. Optional parameter to filter devices by model. All returned devices will have a model that contains the search term or is an exact match.
     * 
     */
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }

    /**
     * models query parameter. Optional parameter to filter devices by one or more models. All returned devices will have a model that is an exact match.
     * 
     */
    @Import(name="models")
    private @Nullable List<String> models;

    /**
     * @return models query parameter. Optional parameter to filter devices by one or more models. All returned devices will have a model that is an exact match.
     * 
     */
    public Optional<List<String>> models() {
        return Optional.ofNullable(this.models);
    }

    /**
     * name query parameter. Optional parameter to filter devices by name. All returned devices will have a name that contains the search term or is an exact match.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return name query parameter. Optional parameter to filter devices by name. All returned devices will have a name that contains the search term or is an exact match.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * networkIds query parameter. Optional parameter to filter devices by network.
     * 
     */
    @Import(name="networkIds")
    private @Nullable List<String> networkIds;

    /**
     * @return networkIds query parameter. Optional parameter to filter devices by network.
     * 
     */
    public Optional<List<String>> networkIds() {
        return Optional.ofNullable(this.networkIds);
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

    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    @Import(name="perPage")
    private @Nullable Integer perPage;

    /**
     * @return perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     * 
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(this.perPage);
    }

    /**
     * productTypes query parameter. Optional parameter to filter devices by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
     * 
     */
    @Import(name="productTypes")
    private @Nullable List<String> productTypes;

    /**
     * @return productTypes query parameter. Optional parameter to filter devices by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
     * 
     */
    public Optional<List<String>> productTypes() {
        return Optional.ofNullable(this.productTypes);
    }

    /**
     * sensorAlertProfileIds query parameter. Optional parameter to filter devices by the alert profiles that are bound to them. Only applies to sensor devices.
     * 
     */
    @Import(name="sensorAlertProfileIds")
    private @Nullable List<String> sensorAlertProfileIds;

    /**
     * @return sensorAlertProfileIds query parameter. Optional parameter to filter devices by the alert profiles that are bound to them. Only applies to sensor devices.
     * 
     */
    public Optional<List<String>> sensorAlertProfileIds() {
        return Optional.ofNullable(this.sensorAlertProfileIds);
    }

    /**
     * sensorMetrics query parameter. Optional parameter to filter devices by the metrics that they provide. Only applies to sensor devices.
     * 
     */
    @Import(name="sensorMetrics")
    private @Nullable List<String> sensorMetrics;

    /**
     * @return sensorMetrics query parameter. Optional parameter to filter devices by the metrics that they provide. Only applies to sensor devices.
     * 
     */
    public Optional<List<String>> sensorMetrics() {
        return Optional.ofNullable(this.sensorMetrics);
    }

    /**
     * serial query parameter. Optional parameter to filter devices by serial number. All returned devices will have a serial number that contains the search term or is an exact match.
     * 
     */
    @Import(name="serial")
    private @Nullable String serial;

    /**
     * @return serial query parameter. Optional parameter to filter devices by serial number. All returned devices will have a serial number that contains the search term or is an exact match.
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * serials query parameter. Optional parameter to filter devices by one or more serial numbers. All returned devices will have a serial number that is an exact match.
     * 
     */
    @Import(name="serials")
    private @Nullable List<String> serials;

    /**
     * @return serials query parameter. Optional parameter to filter devices by one or more serial numbers. All returned devices will have a serial number that is an exact match.
     * 
     */
    public Optional<List<String>> serials() {
        return Optional.ofNullable(this.serials);
    }

    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    @Import(name="startingAfter")
    private @Nullable String startingAfter;

    /**
     * @return startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     * 
     */
    public Optional<String> startingAfter() {
        return Optional.ofNullable(this.startingAfter);
    }

    /**
     * tags query parameter. Optional parameter to filter devices by tags.
     * 
     */
    @Import(name="tags")
    private @Nullable List<String> tags;

    /**
     * @return tags query parameter. Optional parameter to filter devices by tags.
     * 
     */
    public Optional<List<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * tagsFilterType query parameter. Optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
     * 
     */
    @Import(name="tagsFilterType")
    private @Nullable String tagsFilterType;

    /**
     * @return tagsFilterType query parameter. Optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
     * 
     */
    public Optional<String> tagsFilterType() {
        return Optional.ofNullable(this.tagsFilterType);
    }

    private GetDevicesPlainArgs() {}

    private GetDevicesPlainArgs(GetDevicesPlainArgs $) {
        this.configurationUpdatedAfter = $.configurationUpdatedAfter;
        this.endingBefore = $.endingBefore;
        this.mac = $.mac;
        this.macs = $.macs;
        this.model = $.model;
        this.models = $.models;
        this.name = $.name;
        this.networkIds = $.networkIds;
        this.organizationId = $.organizationId;
        this.perPage = $.perPage;
        this.productTypes = $.productTypes;
        this.sensorAlertProfileIds = $.sensorAlertProfileIds;
        this.sensorMetrics = $.sensorMetrics;
        this.serial = $.serial;
        this.serials = $.serials;
        this.startingAfter = $.startingAfter;
        this.tags = $.tags;
        this.tagsFilterType = $.tagsFilterType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicesPlainArgs $;

        public Builder() {
            $ = new GetDevicesPlainArgs();
        }

        public Builder(GetDevicesPlainArgs defaults) {
            $ = new GetDevicesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationUpdatedAfter configurationUpdatedAfter query parameter. Filter results by whether or not the device&#39;s configuration has been updated after the given timestamp
         * 
         * @return builder
         * 
         */
        public Builder configurationUpdatedAfter(@Nullable String configurationUpdatedAfter) {
            $.configurationUpdatedAfter = configurationUpdatedAfter;
            return this;
        }

        /**
         * @param endingBefore endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder endingBefore(@Nullable String endingBefore) {
            $.endingBefore = endingBefore;
            return this;
        }

        /**
         * @param mac mac query parameter. Optional parameter to filter devices by MAC address. All returned devices will have a MAC address that contains the search term or is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable String mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param macs macs query parameter. Optional parameter to filter devices by one or more MAC addresses. All returned devices will have a MAC address that is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder macs(@Nullable List<String> macs) {
            $.macs = macs;
            return this;
        }

        /**
         * @param macs macs query parameter. Optional parameter to filter devices by one or more MAC addresses. All returned devices will have a MAC address that is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder macs(String... macs) {
            return macs(List.of(macs));
        }

        /**
         * @param model model query parameter. Optional parameter to filter devices by model. All returned devices will have a model that contains the search term or is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable String model) {
            $.model = model;
            return this;
        }

        /**
         * @param models models query parameter. Optional parameter to filter devices by one or more models. All returned devices will have a model that is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder models(@Nullable List<String> models) {
            $.models = models;
            return this;
        }

        /**
         * @param models models query parameter. Optional parameter to filter devices by one or more models. All returned devices will have a model that is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder models(String... models) {
            return models(List.of(models));
        }

        /**
         * @param name name query parameter. Optional parameter to filter devices by name. All returned devices will have a name that contains the search term or is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param networkIds networkIds query parameter. Optional parameter to filter devices by network.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(@Nullable List<String> networkIds) {
            $.networkIds = networkIds;
            return this;
        }

        /**
         * @param networkIds networkIds query parameter. Optional parameter to filter devices by network.
         * 
         * @return builder
         * 
         */
        public Builder networkIds(String... networkIds) {
            return networkIds(List.of(networkIds));
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

        /**
         * @param perPage perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
         * 
         * @return builder
         * 
         */
        public Builder perPage(@Nullable Integer perPage) {
            $.perPage = perPage;
            return this;
        }

        /**
         * @param productTypes productTypes query parameter. Optional parameter to filter devices by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
         * 
         * @return builder
         * 
         */
        public Builder productTypes(@Nullable List<String> productTypes) {
            $.productTypes = productTypes;
            return this;
        }

        /**
         * @param productTypes productTypes query parameter. Optional parameter to filter devices by product type. Valid types are wireless, appliance, switch, systemsManager, camera, cellularGateway, and sensor.
         * 
         * @return builder
         * 
         */
        public Builder productTypes(String... productTypes) {
            return productTypes(List.of(productTypes));
        }

        /**
         * @param sensorAlertProfileIds sensorAlertProfileIds query parameter. Optional parameter to filter devices by the alert profiles that are bound to them. Only applies to sensor devices.
         * 
         * @return builder
         * 
         */
        public Builder sensorAlertProfileIds(@Nullable List<String> sensorAlertProfileIds) {
            $.sensorAlertProfileIds = sensorAlertProfileIds;
            return this;
        }

        /**
         * @param sensorAlertProfileIds sensorAlertProfileIds query parameter. Optional parameter to filter devices by the alert profiles that are bound to them. Only applies to sensor devices.
         * 
         * @return builder
         * 
         */
        public Builder sensorAlertProfileIds(String... sensorAlertProfileIds) {
            return sensorAlertProfileIds(List.of(sensorAlertProfileIds));
        }

        /**
         * @param sensorMetrics sensorMetrics query parameter. Optional parameter to filter devices by the metrics that they provide. Only applies to sensor devices.
         * 
         * @return builder
         * 
         */
        public Builder sensorMetrics(@Nullable List<String> sensorMetrics) {
            $.sensorMetrics = sensorMetrics;
            return this;
        }

        /**
         * @param sensorMetrics sensorMetrics query parameter. Optional parameter to filter devices by the metrics that they provide. Only applies to sensor devices.
         * 
         * @return builder
         * 
         */
        public Builder sensorMetrics(String... sensorMetrics) {
            return sensorMetrics(List.of(sensorMetrics));
        }

        /**
         * @param serial serial query parameter. Optional parameter to filter devices by serial number. All returned devices will have a serial number that contains the search term or is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable String serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serials serials query parameter. Optional parameter to filter devices by one or more serial numbers. All returned devices will have a serial number that is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder serials(@Nullable List<String> serials) {
            $.serials = serials;
            return this;
        }

        /**
         * @param serials serials query parameter. Optional parameter to filter devices by one or more serial numbers. All returned devices will have a serial number that is an exact match.
         * 
         * @return builder
         * 
         */
        public Builder serials(String... serials) {
            return serials(List.of(serials));
        }

        /**
         * @param startingAfter startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
         * 
         * @return builder
         * 
         */
        public Builder startingAfter(@Nullable String startingAfter) {
            $.startingAfter = startingAfter;
            return this;
        }

        /**
         * @param tags tags query parameter. Optional parameter to filter devices by tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags tags query parameter. Optional parameter to filter devices by tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param tagsFilterType tagsFilterType query parameter. Optional parameter of value &#39;withAnyTags&#39; or &#39;withAllTags&#39; to indicate whether to return networks which contain ANY or ALL of the included tags. If no type is included, &#39;withAnyTags&#39; will be selected.
         * 
         * @return builder
         * 
         */
        public Builder tagsFilterType(@Nullable String tagsFilterType) {
            $.tagsFilterType = tagsFilterType;
            return this;
        }

        public GetDevicesPlainArgs build() {
            return $;
        }
    }

}
