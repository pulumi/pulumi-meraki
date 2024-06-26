// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.meraki.networks.outputs.ClientsProvisionParametersClient;
import com.pulumi.meraki.networks.outputs.ClientsProvisionParametersPoliciesBySecurityAppliance;
import com.pulumi.meraki.networks.outputs.ClientsProvisionParametersPoliciesBySsid;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientsProvisionParameters {
    /**
     * @return The array of clients to provision
     * 
     */
    private @Nullable List<ClientsProvisionParametersClient> clients;
    /**
     * @return The policy to apply to the specified client. Can be &#39;Group policy&#39;, &#39;Allowed&#39;, &#39;Blocked&#39;, &#39;Per connection&#39; or &#39;Normal&#39;. Required.
     * 
     */
    private @Nullable String devicePolicy;
    /**
     * @return The ID of the desired group policy to apply to the client. Required if &#39;devicePolicy&#39; is set to &#34;Group policy&#34;. Otherwise this is ignored.
     * 
     */
    private @Nullable String groupPolicyId;
    /**
     * @return An object, describing what the policy-connection association is for the security appliance. (Only relevant if the security appliance is actually within the network)
     * 
     */
    private @Nullable ClientsProvisionParametersPoliciesBySecurityAppliance policiesBySecurityAppliance;
    /**
     * @return An object, describing the policy-connection associations for each active SSID within the network. Keys should be the number of enabled SSIDs, mapping to an object describing the client&#39;s policy
     * 
     */
    private @Nullable ClientsProvisionParametersPoliciesBySsid policiesBySsid;

    private ClientsProvisionParameters() {}
    /**
     * @return The array of clients to provision
     * 
     */
    public List<ClientsProvisionParametersClient> clients() {
        return this.clients == null ? List.of() : this.clients;
    }
    /**
     * @return The policy to apply to the specified client. Can be &#39;Group policy&#39;, &#39;Allowed&#39;, &#39;Blocked&#39;, &#39;Per connection&#39; or &#39;Normal&#39;. Required.
     * 
     */
    public Optional<String> devicePolicy() {
        return Optional.ofNullable(this.devicePolicy);
    }
    /**
     * @return The ID of the desired group policy to apply to the client. Required if &#39;devicePolicy&#39; is set to &#34;Group policy&#34;. Otherwise this is ignored.
     * 
     */
    public Optional<String> groupPolicyId() {
        return Optional.ofNullable(this.groupPolicyId);
    }
    /**
     * @return An object, describing what the policy-connection association is for the security appliance. (Only relevant if the security appliance is actually within the network)
     * 
     */
    public Optional<ClientsProvisionParametersPoliciesBySecurityAppliance> policiesBySecurityAppliance() {
        return Optional.ofNullable(this.policiesBySecurityAppliance);
    }
    /**
     * @return An object, describing the policy-connection associations for each active SSID within the network. Keys should be the number of enabled SSIDs, mapping to an object describing the client&#39;s policy
     * 
     */
    public Optional<ClientsProvisionParametersPoliciesBySsid> policiesBySsid() {
        return Optional.ofNullable(this.policiesBySsid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientsProvisionParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ClientsProvisionParametersClient> clients;
        private @Nullable String devicePolicy;
        private @Nullable String groupPolicyId;
        private @Nullable ClientsProvisionParametersPoliciesBySecurityAppliance policiesBySecurityAppliance;
        private @Nullable ClientsProvisionParametersPoliciesBySsid policiesBySsid;
        public Builder() {}
        public Builder(ClientsProvisionParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
    	      this.devicePolicy = defaults.devicePolicy;
    	      this.groupPolicyId = defaults.groupPolicyId;
    	      this.policiesBySecurityAppliance = defaults.policiesBySecurityAppliance;
    	      this.policiesBySsid = defaults.policiesBySsid;
        }

        @CustomType.Setter
        public Builder clients(@Nullable List<ClientsProvisionParametersClient> clients) {

            this.clients = clients;
            return this;
        }
        public Builder clients(ClientsProvisionParametersClient... clients) {
            return clients(List.of(clients));
        }
        @CustomType.Setter
        public Builder devicePolicy(@Nullable String devicePolicy) {

            this.devicePolicy = devicePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder groupPolicyId(@Nullable String groupPolicyId) {

            this.groupPolicyId = groupPolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder policiesBySecurityAppliance(@Nullable ClientsProvisionParametersPoliciesBySecurityAppliance policiesBySecurityAppliance) {

            this.policiesBySecurityAppliance = policiesBySecurityAppliance;
            return this;
        }
        @CustomType.Setter
        public Builder policiesBySsid(@Nullable ClientsProvisionParametersPoliciesBySsid policiesBySsid) {

            this.policiesBySsid = policiesBySsid;
            return this;
        }
        public ClientsProvisionParameters build() {
            final var _resultValue = new ClientsProvisionParameters();
            _resultValue.clients = clients;
            _resultValue.devicePolicy = devicePolicy;
            _resultValue.groupPolicyId = groupPolicyId;
            _resultValue.policiesBySecurityAppliance = policiesBySecurityAppliance;
            _resultValue.policiesBySsid = policiesBySsid;
            return _resultValue;
        }
    }
}
