// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetLiveToolsCableTestArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLiveToolsCableTestArgs Empty = new GetLiveToolsCableTestArgs();

    /**
     * id path parameter.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return id path parameter.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * serial path parameter.
     * 
     */
    @Import(name="serial", required=true)
    private Output<String> serial;

    /**
     * @return serial path parameter.
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }

    private GetLiveToolsCableTestArgs() {}

    private GetLiveToolsCableTestArgs(GetLiveToolsCableTestArgs $) {
        this.id = $.id;
        this.serial = $.serial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLiveToolsCableTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLiveToolsCableTestArgs $;

        public Builder() {
            $ = new GetLiveToolsCableTestArgs();
        }

        public Builder(GetLiveToolsCableTestArgs defaults) {
            $ = new GetLiveToolsCableTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id id path parameter.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id id path parameter.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial serial path parameter.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        public GetLiveToolsCableTestArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetLiveToolsCableTestArgs", "id");
            }
            if ($.serial == null) {
                throw new MissingRequiredPropertyException("GetLiveToolsCableTestArgs", "serial");
            }
            return $;
        }
    }

}