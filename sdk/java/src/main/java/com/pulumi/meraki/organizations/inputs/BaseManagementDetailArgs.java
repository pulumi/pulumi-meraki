// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BaseManagementDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final BaseManagementDetailArgs Empty = new BaseManagementDetailArgs();

    /**
     * Name of management data
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of management data
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Value of management data
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of management data
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private BaseManagementDetailArgs() {}

    private BaseManagementDetailArgs(BaseManagementDetailArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaseManagementDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaseManagementDetailArgs $;

        public Builder() {
            $ = new BaseManagementDetailArgs();
        }

        public Builder(BaseManagementDetailArgs defaults) {
            $ = new BaseManagementDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of management data
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of management data
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Value of management data
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of management data
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public BaseManagementDetailArgs build() {
            return $;
        }
    }

}
