// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networks

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-meraki/sdk/go/meraki/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "meraki:networks/alertsSettings:AlertsSettings":
		r = &AlertsSettings{}
	case "meraki:networks/applianceConnectivityMonitoringDestinations:ApplianceConnectivityMonitoringDestinations":
		r = &ApplianceConnectivityMonitoringDestinations{}
	case "meraki:networks/applianceContentFiltering:ApplianceContentFiltering":
		r = &ApplianceContentFiltering{}
	case "meraki:networks/applianceFirewallCellularFirewallRules:ApplianceFirewallCellularFirewallRules":
		r = &ApplianceFirewallCellularFirewallRules{}
	case "meraki:networks/applianceFirewallFirewalledServices:ApplianceFirewallFirewalledServices":
		r = &ApplianceFirewallFirewalledServices{}
	case "meraki:networks/applianceFirewallInboundFirewallRules:ApplianceFirewallInboundFirewallRules":
		r = &ApplianceFirewallInboundFirewallRules{}
	case "meraki:networks/applianceFirewallL3FirewallRules:ApplianceFirewallL3FirewallRules":
		r = &ApplianceFirewallL3FirewallRules{}
	case "meraki:networks/applianceFirewallL7FirewallRules:ApplianceFirewallL7FirewallRules":
		r = &ApplianceFirewallL7FirewallRules{}
	case "meraki:networks/applianceFirewallOneToManyNatRules:ApplianceFirewallOneToManyNatRules":
		r = &ApplianceFirewallOneToManyNatRules{}
	case "meraki:networks/applianceFirewallOneToOneNatRules:ApplianceFirewallOneToOneNatRules":
		r = &ApplianceFirewallOneToOneNatRules{}
	case "meraki:networks/applianceFirewallPortForwardingRules:ApplianceFirewallPortForwardingRules":
		r = &ApplianceFirewallPortForwardingRules{}
	case "meraki:networks/applianceFirewallSettings:ApplianceFirewallSettings":
		r = &ApplianceFirewallSettings{}
	case "meraki:networks/appliancePorts:AppliancePorts":
		r = &AppliancePorts{}
	case "meraki:networks/appliancePrefixesDelegatedStatics:AppliancePrefixesDelegatedStatics":
		r = &AppliancePrefixesDelegatedStatics{}
	case "meraki:networks/applianceRfProfiles:ApplianceRfProfiles":
		r = &ApplianceRfProfiles{}
	case "meraki:networks/applianceSecurityIntrusion:ApplianceSecurityIntrusion":
		r = &ApplianceSecurityIntrusion{}
	case "meraki:networks/applianceSecurityMalware:ApplianceSecurityMalware":
		r = &ApplianceSecurityMalware{}
	case "meraki:networks/applianceSettings:ApplianceSettings":
		r = &ApplianceSettings{}
	case "meraki:networks/applianceSingleLan:ApplianceSingleLan":
		r = &ApplianceSingleLan{}
	case "meraki:networks/applianceSsids:ApplianceSsids":
		r = &ApplianceSsids{}
	case "meraki:networks/applianceTrafficShaping:ApplianceTrafficShaping":
		r = &ApplianceTrafficShaping{}
	case "meraki:networks/applianceTrafficShapingCustomPerformanceClasses:ApplianceTrafficShapingCustomPerformanceClasses":
		r = &ApplianceTrafficShapingCustomPerformanceClasses{}
	case "meraki:networks/applianceTrafficShapingRules:ApplianceTrafficShapingRules":
		r = &ApplianceTrafficShapingRules{}
	case "meraki:networks/applianceTrafficShapingUplinkBandwidth:ApplianceTrafficShapingUplinkBandwidth":
		r = &ApplianceTrafficShapingUplinkBandwidth{}
	case "meraki:networks/applianceTrafficShapingUplinkSelection:ApplianceTrafficShapingUplinkSelection":
		r = &ApplianceTrafficShapingUplinkSelection{}
	case "meraki:networks/applianceTrafficShapingVpnExclusions:ApplianceTrafficShapingVpnExclusions":
		r = &ApplianceTrafficShapingVpnExclusions{}
	case "meraki:networks/applianceVlans:ApplianceVlans":
		r = &ApplianceVlans{}
	case "meraki:networks/applianceVlansSettings:ApplianceVlansSettings":
		r = &ApplianceVlansSettings{}
	case "meraki:networks/applianceVpnBgp:ApplianceVpnBgp":
		r = &ApplianceVpnBgp{}
	case "meraki:networks/applianceVpnSiteToSiteVpn:ApplianceVpnSiteToSiteVpn":
		r = &ApplianceVpnSiteToSiteVpn{}
	case "meraki:networks/applianceWarmSpare:ApplianceWarmSpare":
		r = &ApplianceWarmSpare{}
	case "meraki:networks/applianceWarmSpareSwap:ApplianceWarmSpareSwap":
		r = &ApplianceWarmSpareSwap{}
	case "meraki:networks/base:base":
		r = &Base{}
	case "meraki:networks/bind:Bind":
		r = &Bind{}
	case "meraki:networks/cameraQualityRetentionProfiles:CameraQualityRetentionProfiles":
		r = &CameraQualityRetentionProfiles{}
	case "meraki:networks/cameraWirelessProfiles:CameraWirelessProfiles":
		r = &CameraWirelessProfiles{}
	case "meraki:networks/cellularGatewayConnectivityMonitoringDestinations:CellularGatewayConnectivityMonitoringDestinations":
		r = &CellularGatewayConnectivityMonitoringDestinations{}
	case "meraki:networks/cellularGatewayDhcp:CellularGatewayDhcp":
		r = &CellularGatewayDhcp{}
	case "meraki:networks/cellularGatewaySubnetPool:CellularGatewaySubnetPool":
		r = &CellularGatewaySubnetPool{}
	case "meraki:networks/cellularGatewayUplink:CellularGatewayUplink":
		r = &CellularGatewayUplink{}
	case "meraki:networks/clientsPolicy:ClientsPolicy":
		r = &ClientsPolicy{}
	case "meraki:networks/clientsProvision:ClientsProvision":
		r = &ClientsProvision{}
	case "meraki:networks/clientsSplashAuthorizationStatus:ClientsSplashAuthorizationStatus":
		r = &ClientsSplashAuthorizationStatus{}
	case "meraki:networks/devicesClaim:DevicesClaim":
		r = &DevicesClaim{}
	case "meraki:networks/devicesClaimVmx:DevicesClaimVmx":
		r = &DevicesClaimVmx{}
	case "meraki:networks/devicesRemove:DevicesRemove":
		r = &DevicesRemove{}
	case "meraki:networks/firmwareUpgrades:FirmwareUpgrades":
		r = &FirmwareUpgrades{}
	case "meraki:networks/firmwareUpgradesRollbacks:FirmwareUpgradesRollbacks":
		r = &FirmwareUpgradesRollbacks{}
	case "meraki:networks/firmwareUpgradesStagedEvents:FirmwareUpgradesStagedEvents":
		r = &FirmwareUpgradesStagedEvents{}
	case "meraki:networks/firmwareUpgradesStagedEventsDefer:FirmwareUpgradesStagedEventsDefer":
		r = &FirmwareUpgradesStagedEventsDefer{}
	case "meraki:networks/firmwareUpgradesStagedEventsRollbacks:FirmwareUpgradesStagedEventsRollbacks":
		r = &FirmwareUpgradesStagedEventsRollbacks{}
	case "meraki:networks/firmwareUpgradesStagedGroups:FirmwareUpgradesStagedGroups":
		r = &FirmwareUpgradesStagedGroups{}
	case "meraki:networks/firmwareUpgradesStagedStages:FirmwareUpgradesStagedStages":
		r = &FirmwareUpgradesStagedStages{}
	case "meraki:networks/floorPlans:FloorPlans":
		r = &FloorPlans{}
	case "meraki:networks/groupPolicies:GroupPolicies":
		r = &GroupPolicies{}
	case "meraki:networks/merakiAuthUsers:MerakiAuthUsers":
		r = &MerakiAuthUsers{}
	case "meraki:networks/mqttBrokers:MqttBrokers":
		r = &MqttBrokers{}
	case "meraki:networks/netflow:Netflow":
		r = &Netflow{}
	case "meraki:networks/piiRequestsDelete:PiiRequestsDelete":
		r = &PiiRequestsDelete{}
	case "meraki:networks/sensorAlertsProfiles:SensorAlertsProfiles":
		r = &SensorAlertsProfiles{}
	case "meraki:networks/sensorMqttBrokers:SensorMqttBrokers":
		r = &SensorMqttBrokers{}
	case "meraki:networks/settings:Settings":
		r = &Settings{}
	case "meraki:networks/smBypassActivationLockAttempts:SmBypassActivationLockAttempts":
		r = &SmBypassActivationLockAttempts{}
	case "meraki:networks/smDevicesCheckin:SmDevicesCheckin":
		r = &SmDevicesCheckin{}
	case "meraki:networks/smDevicesFields:SmDevicesFields":
		r = &SmDevicesFields{}
	case "meraki:networks/smDevicesInstallApps:SmDevicesInstallApps":
		r = &SmDevicesInstallApps{}
	case "meraki:networks/smDevicesLock:SmDevicesLock":
		r = &SmDevicesLock{}
	case "meraki:networks/smDevicesModifyTags:SmDevicesModifyTags":
		r = &SmDevicesModifyTags{}
	case "meraki:networks/smDevicesMove:SmDevicesMove":
		r = &SmDevicesMove{}
	case "meraki:networks/smDevicesReboot:SmDevicesReboot":
		r = &SmDevicesReboot{}
	case "meraki:networks/smDevicesRefreshDetails:SmDevicesRefreshDetails":
		r = &SmDevicesRefreshDetails{}
	case "meraki:networks/smDevicesShutdown:SmDevicesShutdown":
		r = &SmDevicesShutdown{}
	case "meraki:networks/smDevicesUnenroll:SmDevicesUnenroll":
		r = &SmDevicesUnenroll{}
	case "meraki:networks/smDevicesUninstallApps:SmDevicesUninstallApps":
		r = &SmDevicesUninstallApps{}
	case "meraki:networks/smDevicesWipe:SmDevicesWipe":
		r = &SmDevicesWipe{}
	case "meraki:networks/smTargetGroups:SmTargetGroups":
		r = &SmTargetGroups{}
	case "meraki:networks/smUserAccessDevicesDelete:SmUserAccessDevicesDelete":
		r = &SmUserAccessDevicesDelete{}
	case "meraki:networks/snmp:Snmp":
		r = &Snmp{}
	case "meraki:networks/split:Split":
		r = &Split{}
	case "meraki:networks/switchAccessControlLists:SwitchAccessControlLists":
		r = &SwitchAccessControlLists{}
	case "meraki:networks/switchAccessPolicies:SwitchAccessPolicies":
		r = &SwitchAccessPolicies{}
	case "meraki:networks/switchAlternateManagementInterface:SwitchAlternateManagementInterface":
		r = &SwitchAlternateManagementInterface{}
	case "meraki:networks/switchDhcpServerPolicy:SwitchDhcpServerPolicy":
		r = &SwitchDhcpServerPolicy{}
	case "meraki:networks/switchDhcpServerPolicyArpInspectionTrustedServers:SwitchDhcpServerPolicyArpInspectionTrustedServers":
		r = &SwitchDhcpServerPolicyArpInspectionTrustedServers{}
	case "meraki:networks/switchDscpToCosMappings:SwitchDscpToCosMappings":
		r = &SwitchDscpToCosMappings{}
	case "meraki:networks/switchLinkAggregations:SwitchLinkAggregations":
		r = &SwitchLinkAggregations{}
	case "meraki:networks/switchMtu:SwitchMtu":
		r = &SwitchMtu{}
	case "meraki:networks/switchPortSchedules:SwitchPortSchedules":
		r = &SwitchPortSchedules{}
	case "meraki:networks/switchQosRulesOrder:SwitchQosRulesOrder":
		r = &SwitchQosRulesOrder{}
	case "meraki:networks/switchRoutingMulticast:SwitchRoutingMulticast":
		r = &SwitchRoutingMulticast{}
	case "meraki:networks/switchRoutingMulticastRendezvousPoints:SwitchRoutingMulticastRendezvousPoints":
		r = &SwitchRoutingMulticastRendezvousPoints{}
	case "meraki:networks/switchRoutingOspf:SwitchRoutingOspf":
		r = &SwitchRoutingOspf{}
	case "meraki:networks/switchSettings:SwitchSettings":
		r = &SwitchSettings{}
	case "meraki:networks/switchStacks:SwitchStacks":
		r = &SwitchStacks{}
	case "meraki:networks/switchStacksAdd:SwitchStacksAdd":
		r = &SwitchStacksAdd{}
	case "meraki:networks/switchStacksRemove:SwitchStacksRemove":
		r = &SwitchStacksRemove{}
	case "meraki:networks/switchStacksRoutingInterfaces:SwitchStacksRoutingInterfaces":
		r = &SwitchStacksRoutingInterfaces{}
	case "meraki:networks/switchStacksRoutingInterfacesDhcp:SwitchStacksRoutingInterfacesDhcp":
		r = &SwitchStacksRoutingInterfacesDhcp{}
	case "meraki:networks/switchStacksRoutingStaticRoutes:SwitchStacksRoutingStaticRoutes":
		r = &SwitchStacksRoutingStaticRoutes{}
	case "meraki:networks/switchStormControl:SwitchStormControl":
		r = &SwitchStormControl{}
	case "meraki:networks/switchStp:SwitchStp":
		r = &SwitchStp{}
	case "meraki:networks/syslogServers:SyslogServers":
		r = &SyslogServers{}
	case "meraki:networks/trafficAnalysis:TrafficAnalysis":
		r = &TrafficAnalysis{}
	case "meraki:networks/unbind:Unbind":
		r = &Unbind{}
	case "meraki:networks/vlanProfiles:VlanProfiles":
		r = &VlanProfiles{}
	case "meraki:networks/vlanProfilesAssignmentsReassign:VlanProfilesAssignmentsReassign":
		r = &VlanProfilesAssignmentsReassign{}
	case "meraki:networks/webhooksHttpServers:WebhooksHttpServers":
		r = &WebhooksHttpServers{}
	case "meraki:networks/webhooksPayloadTemplates:WebhooksPayloadTemplates":
		r = &WebhooksPayloadTemplates{}
	case "meraki:networks/wirelessAlternateManagementInterface:WirelessAlternateManagementInterface":
		r = &WirelessAlternateManagementInterface{}
	case "meraki:networks/wirelessBilling:WirelessBilling":
		r = &WirelessBilling{}
	case "meraki:networks/wirelessBluetoothSettings:WirelessBluetoothSettings":
		r = &WirelessBluetoothSettings{}
	case "meraki:networks/wirelessEthernetPortsProfiles:WirelessEthernetPortsProfiles":
		r = &WirelessEthernetPortsProfiles{}
	case "meraki:networks/wirelessEthernetPortsProfilesAssign:WirelessEthernetPortsProfilesAssign":
		r = &WirelessEthernetPortsProfilesAssign{}
	case "meraki:networks/wirelessEthernetPortsProfilesSetDefault:WirelessEthernetPortsProfilesSetDefault":
		r = &WirelessEthernetPortsProfilesSetDefault{}
	case "meraki:networks/wirelessRfProfiles:WirelessRfProfiles":
		r = &WirelessRfProfiles{}
	case "meraki:networks/wirelessSettings:WirelessSettings":
		r = &WirelessSettings{}
	case "meraki:networks/wirelessSsids:WirelessSsids":
		r = &WirelessSsids{}
	case "meraki:networks/wirelessSsidsBonjourForwarding:WirelessSsidsBonjourForwarding":
		r = &WirelessSsidsBonjourForwarding{}
	case "meraki:networks/wirelessSsidsDeviceTypeGroupPolicies:WirelessSsidsDeviceTypeGroupPolicies":
		r = &WirelessSsidsDeviceTypeGroupPolicies{}
	case "meraki:networks/wirelessSsidsEapOverride:WirelessSsidsEapOverride":
		r = &WirelessSsidsEapOverride{}
	case "meraki:networks/wirelessSsidsFirewallL3FirewallRules:WirelessSsidsFirewallL3FirewallRules":
		r = &WirelessSsidsFirewallL3FirewallRules{}
	case "meraki:networks/wirelessSsidsFirewallL7FirewallRules:WirelessSsidsFirewallL7FirewallRules":
		r = &WirelessSsidsFirewallL7FirewallRules{}
	case "meraki:networks/wirelessSsidsHotspot20:WirelessSsidsHotspot20":
		r = &WirelessSsidsHotspot20{}
	case "meraki:networks/wirelessSsidsIdentityPsks:WirelessSsidsIdentityPsks":
		r = &WirelessSsidsIdentityPsks{}
	case "meraki:networks/wirelessSsidsSchedules:WirelessSsidsSchedules":
		r = &WirelessSsidsSchedules{}
	case "meraki:networks/wirelessSsidsSplashSettings:WirelessSsidsSplashSettings":
		r = &WirelessSsidsSplashSettings{}
	case "meraki:networks/wirelessSsidsTrafficShapingRules:WirelessSsidsTrafficShapingRules":
		r = &WirelessSsidsTrafficShapingRules{}
	case "meraki:networks/wirelessSsidsVpn:WirelessSsidsVpn":
		r = &WirelessSsidsVpn{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/alertsSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceConnectivityMonitoringDestinations",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceContentFiltering",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceFirewallCellularFirewallRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceFirewallFirewalledServices",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceFirewallInboundFirewallRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceFirewallL3FirewallRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceFirewallL7FirewallRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceFirewallOneToManyNatRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceFirewallOneToOneNatRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceFirewallPortForwardingRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceFirewallSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/appliancePorts",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/appliancePrefixesDelegatedStatics",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceRfProfiles",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceSecurityIntrusion",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceSecurityMalware",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceSingleLan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceSsids",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceTrafficShaping",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceTrafficShapingCustomPerformanceClasses",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceTrafficShapingRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceTrafficShapingUplinkBandwidth",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceTrafficShapingUplinkSelection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceTrafficShapingVpnExclusions",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceVlans",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceVlansSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceVpnBgp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceVpnSiteToSiteVpn",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceWarmSpare",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/applianceWarmSpareSwap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/base",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/bind",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/cameraQualityRetentionProfiles",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/cameraWirelessProfiles",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/cellularGatewayConnectivityMonitoringDestinations",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/cellularGatewayDhcp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/cellularGatewaySubnetPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/cellularGatewayUplink",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/clientsPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/clientsProvision",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/clientsSplashAuthorizationStatus",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/devicesClaim",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/devicesClaimVmx",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/devicesRemove",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/firmwareUpgrades",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/firmwareUpgradesRollbacks",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/firmwareUpgradesStagedEvents",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/firmwareUpgradesStagedEventsDefer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/firmwareUpgradesStagedEventsRollbacks",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/firmwareUpgradesStagedGroups",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/firmwareUpgradesStagedStages",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/floorPlans",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/groupPolicies",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/merakiAuthUsers",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/mqttBrokers",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/netflow",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/piiRequestsDelete",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/sensorAlertsProfiles",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/sensorMqttBrokers",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/settings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smBypassActivationLockAttempts",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesCheckin",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesFields",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesInstallApps",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesLock",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesModifyTags",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesMove",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesReboot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesRefreshDetails",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesShutdown",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesUnenroll",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesUninstallApps",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smDevicesWipe",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smTargetGroups",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/smUserAccessDevicesDelete",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/snmp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/split",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchAccessControlLists",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchAccessPolicies",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchAlternateManagementInterface",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchDhcpServerPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchDhcpServerPolicyArpInspectionTrustedServers",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchDscpToCosMappings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchLinkAggregations",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchMtu",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchPortSchedules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchQosRulesOrder",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchRoutingMulticast",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchRoutingMulticastRendezvousPoints",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchRoutingOspf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchStacks",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchStacksAdd",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchStacksRemove",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchStacksRoutingInterfaces",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchStacksRoutingInterfacesDhcp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchStacksRoutingStaticRoutes",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchStormControl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/switchStp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/syslogServers",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/trafficAnalysis",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/unbind",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/vlanProfiles",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/vlanProfilesAssignmentsReassign",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/webhooksHttpServers",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/webhooksPayloadTemplates",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessAlternateManagementInterface",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessBilling",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessBluetoothSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessEthernetPortsProfiles",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessEthernetPortsProfilesAssign",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessEthernetPortsProfilesSetDefault",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessRfProfiles",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsids",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsBonjourForwarding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsDeviceTypeGroupPolicies",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsEapOverride",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsFirewallL3FirewallRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsFirewallL7FirewallRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsHotspot20",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsIdentityPsks",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsSchedules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsSplashSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsTrafficShapingRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"meraki",
		"networks/wirelessSsidsVpn",
		&module{version},
	)
}
