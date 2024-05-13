// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package provider

import (
	"context"
	"fmt"
	"path"
	"strings"

	_ "embed"

	"terraform-provider-meraki/meraki"

	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-meraki/provider/pkg/version"
)

//go:embed cmd/pulumi-resource-meraki/bridge-metadata.json
var bridgeMetadata []byte

const (
	mainPkg = "meraki"

	mainMod = "index"
)

func makeResource(mod string, res string) tokens.Type {
	mod = strings.ToLower(mod)
	return tfbridge.MakeResource(mainPkg, mod, res)
}

type computeIDFunc = func(ctx context.Context, state resource.PropertyMap) (resource.ID, error)

func computeIDField(field resource.PropertyKey) computeIDFunc {
	return func(ctx context.Context, state resource.PropertyMap) (resource.ID, error) {
		fieldValue, ok := state[field]
		if !ok {
			return "", fmt.Errorf("id: could not find required property '%s'", field)
		}

		// ComputeID is only called during when preview=false, so we don't need to
		// deal with computed properties.

		if fieldValue.IsSecret() || (fieldValue.IsOutput() && fieldValue.OutputValue().Secret) {
			msg := fmt.Sprintf("Setting non-secret resource ID as '%s' (which is secret)", field)
			tfbridge.GetLogger(ctx).Warn(msg)
			if fieldValue.IsSecret() {
				fieldValue = fieldValue.SecretValue().Element
			} else {
				fieldValue = fieldValue.OutputValue().Element
			}
		}

		if !fieldValue.IsString() {
			return "", fmt.Errorf("expected '%s' to be of type string, found %s",
				field, fieldValue.TypeString())
		}

		return resource.ID(fieldValue.StringValue()), nil
	}
}
func delegateIDField(field resource.PropertyKey) computeIDFunc {
	return tfbridge.DelegateIDField(field, "meraki", "https://github.com/pulumi/pulumi-meraki")
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := pf.ShimProvider(meraki.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "meraki",
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "Meraki",
		// The default publisher for all packages is Pulumi.
		// Change this to your personal name (or a company name) that you
		// would like to be shown in the Pulumi Registry if this package is published
		// there.
		Publisher: "pulumi",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL: "https://raw.githubusercontent.com/pulumi/pulumi-meraki/main/docs/meraki.png",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/
		PluginDownloadURL: "github://api.github.com/pulumi/pulumi-meraki",
		Description:       "A Pulumi package for creating and managing Meraki resources",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords: []string{
			"pulumi",
			"meraki",
			"category/network",
		},
		License:    "Apache-2.0",
		Homepage:   "https://github.com/pulumi/pulumi-meraki",
		Repository: "https://github.com/pulumi/pulumi-meraki",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		Version:           version.Version,
		GitHubOrg:         "cisco-open",
		MetadataInfo:      tfbridge.NewProviderMetadata(bridgeMetadata),
		TFProviderVersion: "0.2.0",
		UpstreamRepoPath:  "./upstream",
		//nolint:lll
		Resources: map[string]*tfbridge.ResourceInfo{

			"meraki_administered_licensing_subscription_subscriptions_bind":               {ComputeID: computeIDField("subscription_id")},
			"meraki_administered_licensing_subscription_subscriptions_claim":              {ComputeID: computeIDField("subscription_id")},
			"meraki_administered_licensing_subscription_subscriptions_claim_key_validate": {ComputeID: computeIDField("subscription_id")},

			"meraki_devices": {
				Tok:       makeResource("devices", "base"),
				ComputeID: delegateIDField("serial"),
			},
			"meraki_devices_appliance_radio_settings":                     {ComputeID: computeIDField("serial")},
			"meraki_devices_appliance_uplinks_settings":                   {ComputeID: computeIDField("serial")},
			"meraki_devices_appliance_vmx_authentication_token":           {ComputeID: computeIDField("serial")},
			"meraki_devices_blink_leds":                                   {ComputeID: computeIDField("serial")},
			"meraki_devices_camera_custom_analytics":                      {ComputeID: computeIDField("serial")},
			"meraki_devices_camera_generate_snapshot":                     {ComputeID: computeIDField("serial")},
			"meraki_devices_camera_quality_and_retention":                 {ComputeID: computeIDField("serial")},
			"meraki_devices_camera_sense":                                 {ComputeID: computeIDField("serial")},
			"meraki_devices_camera_video_settings":                        {ComputeID: computeIDField("serial")},
			"meraki_devices_camera_wireless_profiles":                     {ComputeID: computeIDField("serial")},
			"meraki_devices_cellular_gateway_lan":                         {ComputeID: computeIDField("serial")},
			"meraki_devices_cellular_gateway_port_forwarding_rules":       {ComputeID: computeIDField("serial")},
			"meraki_devices_cellular_sims":                                {ComputeID: computeIDField("serial")},
			"meraki_devices_live_tools_arp_table":                         {ComputeID: computeIDField("serial")},
			"meraki_devices_live_tools_cable":                             {ComputeID: computeIDField("serial")},
			"meraki_devices_live_tools_ping":                              {ComputeID: computeIDField("serial")},
			"meraki_devices_live_tools_ping_device":                       {ComputeID: computeIDField("serial")},
			"meraki_devices_live_tools_throughput_test":                   {ComputeID: computeIDField("serial")},
			"meraki_devices_live_tools_wake_on_lan":                       {ComputeID: computeIDField("serial")},
			"meraki_devices_management_interface":                         {ComputeID: computeIDField("serial")},
			"meraki_devices_sensor_relationships":                         {ComputeID: computeIDField("serial")},
			"meraki_devices_switch_ports":                                 {ComputeID: computeIDField("serial")},
			"meraki_devices_switch_ports_cycle":                           {ComputeID: computeIDField("serial")},
			"meraki_devices_switch_routing_interfaces":                    {ComputeID: computeIDField("serial")},
			"meraki_devices_switch_routing_interfaces_dhcp":               {ComputeID: computeIDField("serial")},
			"meraki_devices_switch_routing_static_routes":                 {ComputeID: computeIDField("serial")},
			"meraki_devices_switch_warm_spare":                            {ComputeID: computeIDField("serial")},
			"meraki_devices_wireless_alternate_management_interface_ipv6": {ComputeID: computeIDField("serial")},
			"meraki_devices_wireless_bluetooth_settings":                  {ComputeID: computeIDField("serial")},
			"meraki_devices_wireless_radio_settings":                      {ComputeID: computeIDField("serial")},

			"meraki_networks": {
				Tok:       makeResource("networks", "base"),
				ComputeID: computeIDField("network_id"),
			},
			"meraki_networks_alerts_settings":                                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_connectivity_monitoring_destinations":           {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_content_filtering":                              {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_firewall_cellular_firewall_rules":               {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_firewall_firewalled_services":                   {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_firewall_inbound_firewall_rules":                {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_firewall_l3_firewall_rules":                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_firewall_l7_firewall_rules":                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_firewall_one_to_many_nat_rules":                 {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_firewall_one_to_one_nat_rules":                  {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_firewall_port_forwarding_rules":                 {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_firewall_settings":                              {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_ports":                                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_prefixes_delegated_statics":                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_rf_profiles":                                    {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_security_intrusion":                             {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_security_malware":                               {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_settings":                                       {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_single_lan":                                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_ssids":                                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_traffic_shaping":                                {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_traffic_shaping_custom_performance_classes":     {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_traffic_shaping_rules":                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_traffic_shaping_uplink_bandwidth":               {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_traffic_shaping_uplink_selection":               {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_traffic_shaping_vpn_exclusions":                 {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_vlans":                                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_vlans_settings":                                 {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_vpn_bgp":                                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_vpn_site_to_site_vpn":                           {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_warm_spare":                                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_appliance_warm_spare_swap":                                {ComputeID: computeIDField("network_id")},
			"meraki_networks_bind":                                                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_camera_quality_retention_profiles":                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_camera_wireless_profiles":                                 {ComputeID: computeIDField("network_id")},
			"meraki_networks_cellular_gateway_connectivity_monitoring_destinations":    {ComputeID: computeIDField("network_id")},
			"meraki_networks_cellular_gateway_dhcp":                                    {ComputeID: computeIDField("network_id")},
			"meraki_networks_cellular_gateway_subnet_pool":                             {ComputeID: computeIDField("network_id")},
			"meraki_networks_cellular_gateway_uplink":                                  {ComputeID: computeIDField("network_id")},
			"meraki_networks_clients_policy":                                           {ComputeID: computeIDField("network_id")},
			"meraki_networks_clients_provision":                                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_clients_splash_authorization_status":                      {ComputeID: computeIDField("network_id")},
			"meraki_networks_devices_claim":                                            {ComputeID: computeIDField("network_id")},
			"meraki_networks_devices_claim_vmx":                                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_devices_remove":                                           {ComputeID: computeIDField("network_id")},
			"meraki_networks_firmware_upgrades":                                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_firmware_upgrades_rollbacks":                              {ComputeID: computeIDField("network_id")},
			"meraki_networks_firmware_upgrades_staged_events":                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_firmware_upgrades_staged_events_defer":                    {ComputeID: computeIDField("network_id")},
			"meraki_networks_firmware_upgrades_staged_events_rollbacks":                {ComputeID: computeIDField("network_id")},
			"meraki_networks_firmware_upgrades_staged_groups":                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_firmware_upgrades_staged_stages":                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_floor_plans":                                              {ComputeID: computeIDField("network_id")},
			"meraki_networks_group_policies":                                           {ComputeID: computeIDField("network_id")},
			"meraki_networks_meraki_auth_users":                                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_mqtt_brokers":                                             {ComputeID: computeIDField("network_id")},
			"meraki_networks_netflow":                                                  {ComputeID: computeIDField("network_id")},
			"meraki_networks_pii_requests_delete":                                      {ComputeID: computeIDField("network_id")},
			"meraki_networks_sensor_alerts_profiles":                                   {ComputeID: computeIDField("network_id")},
			"meraki_networks_sensor_mqtt_brokers":                                      {ComputeID: computeIDField("network_id")},
			"meraki_networks_settings":                                                 {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_bypass_activation_lock_attempts":                       {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_checkin":                                       {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_fields":                                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_install_apps":                                  {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_lock":                                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_modify_tags":                                   {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_move":                                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_reboot":                                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_refresh_details":                               {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_shutdown":                                      {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_unenroll":                                      {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_uninstall_apps":                                {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_devices_wipe":                                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_target_groups":                                         {ComputeID: computeIDField("network_id")},
			"meraki_networks_sm_user_access_devices_delete":                            {ComputeID: computeIDField("network_id")},
			"meraki_networks_snmp":                                                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_split":                                                    {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_access_control_lists":                              {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_access_policies":                                   {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_alternate_management_interface":                    {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_dhcp_server_policy":                                {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_dhcp_server_policy_arp_inspection_trusted_servers": {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_dscp_to_cos_mappings":                              {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_link_aggregations":                                 {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_mtu":                                               {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_port_schedules":                                    {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_qos_rules_order":                                   {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_routing_multicast":                                 {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_routing_multicast_rendezvous_points":               {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_routing_ospf":                                      {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_settings":                                          {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_stacks":                                            {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_stacks_add":                                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_stacks_remove":                                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_stacks_routing_interfaces":                         {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_stacks_routing_interfaces_dhcp":                    {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_stacks_routing_static_routes":                      {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_storm_control":                                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_switch_stp":                                               {ComputeID: computeIDField("network_id")},
			"meraki_networks_syslog_servers":                                           {ComputeID: computeIDField("network_id")},
			"meraki_networks_traffic_analysis":                                         {ComputeID: computeIDField("network_id")},
			"meraki_networks_unbind":                                                   {ComputeID: computeIDField("network_id")},
			"meraki_networks_vlan_profiles":                                            {ComputeID: computeIDField("network_id")},
			"meraki_networks_vlan_profiles_assignments_reassign":                       {ComputeID: computeIDField("network_id")},
			"meraki_networks_webhooks_http_servers":                                    {ComputeID: computeIDField("network_id")},
			"meraki_networks_webhooks_payload_templates":                               {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_alternate_management_interface":                  {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_billing":                                         {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_bluetooth_settings":                              {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ethernet_ports_profiles":                         {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ethernet_ports_profiles_assign":                  {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ethernet_ports_profiles_set_default":             {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_rf_profiles":                                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_settings":                                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids":                                           {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_bonjour_forwarding":                        {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_device_type_group_policies":                {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_eap_override":                              {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_firewall_l3_firewall_rules":                {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_firewall_l7_firewall_rules":                {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_hotspot20":                                 {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_identity_psks":                             {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_schedules":                                 {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_splash_settings":                           {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_traffic_shaping_rules":                     {ComputeID: computeIDField("network_id")},
			"meraki_networks_wireless_ssids_vpn":                                       {ComputeID: computeIDField("network_id")},

			"meraki_organizations": {
				Tok:       makeResource("organizations", "base"),
				ComputeID: computeIDField("organization_id"),
			},
			"meraki_organizations_action_batches":                                      {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_adaptive_policy_acls":                                {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_adaptive_policy_groups":                              {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_adaptive_policy_policies":                            {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_adaptive_policy_settings":                            {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_admins":                                              {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_alerts_profiles":                                     {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_appliance_security_intrusion":                        {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_appliance_vpn_third_party_vpnpeers":                  {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_appliance_vpn_vpn_firewall_rules":                    {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_branding_policies":                                   {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_branding_policies_priorities":                        {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_camera_custom_analytics_artifacts":                   {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_camera_roles":                                        {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_claim":                                               {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_clone":                                               {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_config_templates":                                    {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_config_templates_switch_profiles_ports":              {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_early_access_features_opt_ins":                       {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_insight_monitored_media_servers":                     {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_inventory_claim":                                     {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_inventory_onboarding_cloud_monitoring_export_events": {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_inventory_onboarding_cloud_monitoring_imports":       {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_inventory_onboarding_cloud_monitoring_prepare":       {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_inventory_release":                                   {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_licenses":                                            {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_licenses_assign_seats":                               {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_licenses_move":                                       {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_licenses_move_seats":                                 {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_licenses_renew_seats":                                {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_licensing_coterm_licenses_move":                      {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_login_security":                                      {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_networks_combine":                                    {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_policy_objects":                                      {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_policy_objects_groups":                               {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_saml":                                                {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_saml_idps":                                           {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_saml_roles":                                          {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_sm_admins_roles":                                     {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_sm_sentry_policies_assignments":                      {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_snmp":                                                {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_switch_devices_clone":                                {ComputeID: computeIDField("organization_id")},
			"meraki_organizations_users":                                               {ComputeID: computeIDField("organization_id")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Map each data source in the Terraform provider to a Pulumi function.
			//
			// "aws_ami": {
			//	Tok: makeDataSource(mainMod, "aws_ami"),
			// },
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@pulumi/meraki",

			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			PackageName: "pulumi_meraki",

			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},

			PyProject: struct{ Enabled bool }{true},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", "meraki"),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				"meraki",
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RootNamespace: "Pulumi",

			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "com.pulumi",
		},
	}

	prov.MustComputeTokens(tks.KnownModules("meraki_", mainMod, []string{
		"administered_",
		"devices_",
		"networks_",
		"organizations_",
	}, tks.MakeStandard(mainPkg)))
	prov.SetAutonaming(255, "-")
	prov.MustApplyAutoAliases()

	return prov
}
