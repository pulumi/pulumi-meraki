// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWirelessRfProfilesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWirelessRfProfilesArgs Empty = new GetWirelessRfProfilesArgs();

    /**
     * includeTemplateProfiles query parameter. If the network is bound to a template, this parameter controls whether or not the non-basic RF profiles defined on the template should be included in the response alongside the non-basic profiles defined on the bound network. Defaults to false.
     * 
     */
    @Import(name="includeTemplateProfiles")
    private @Nullable Output<Boolean> includeTemplateProfiles;

    /**
     * @return includeTemplateProfiles query parameter. If the network is bound to a template, this parameter controls whether or not the non-basic RF profiles defined on the template should be included in the response alongside the non-basic profiles defined on the bound network. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> includeTemplateProfiles() {
        return Optional.ofNullable(this.includeTemplateProfiles);
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
     * rfProfileId path parameter. Rf profile ID
     * 
     */
    @Import(name="rfProfileId")
    private @Nullable Output<String> rfProfileId;

    /**
     * @return rfProfileId path parameter. Rf profile ID
     * 
     */
    public Optional<Output<String>> rfProfileId() {
        return Optional.ofNullable(this.rfProfileId);
    }

    private GetWirelessRfProfilesArgs() {}

    private GetWirelessRfProfilesArgs(GetWirelessRfProfilesArgs $) {
        this.includeTemplateProfiles = $.includeTemplateProfiles;
        this.networkId = $.networkId;
        this.rfProfileId = $.rfProfileId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWirelessRfProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWirelessRfProfilesArgs $;

        public Builder() {
            $ = new GetWirelessRfProfilesArgs();
        }

        public Builder(GetWirelessRfProfilesArgs defaults) {
            $ = new GetWirelessRfProfilesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeTemplateProfiles includeTemplateProfiles query parameter. If the network is bound to a template, this parameter controls whether or not the non-basic RF profiles defined on the template should be included in the response alongside the non-basic profiles defined on the bound network. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder includeTemplateProfiles(@Nullable Output<Boolean> includeTemplateProfiles) {
            $.includeTemplateProfiles = includeTemplateProfiles;
            return this;
        }

        /**
         * @param includeTemplateProfiles includeTemplateProfiles query parameter. If the network is bound to a template, this parameter controls whether or not the non-basic RF profiles defined on the template should be included in the response alongside the non-basic profiles defined on the bound network. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder includeTemplateProfiles(Boolean includeTemplateProfiles) {
            return includeTemplateProfiles(Output.of(includeTemplateProfiles));
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
         * @param rfProfileId rfProfileId path parameter. Rf profile ID
         * 
         * @return builder
         * 
         */
        public Builder rfProfileId(@Nullable Output<String> rfProfileId) {
            $.rfProfileId = rfProfileId;
            return this;
        }

        /**
         * @param rfProfileId rfProfileId path parameter. Rf profile ID
         * 
         * @return builder
         * 
         */
        public Builder rfProfileId(String rfProfileId) {
            return rfProfileId(Output.of(rfProfileId));
        }

        public GetWirelessRfProfilesArgs build() {
            return $;
        }
    }

}
