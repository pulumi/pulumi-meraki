// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import meraki:networks/wirelessSsidsSplashSettings:WirelessSsidsSplashSettings example "network_id,number"
 * ```
 */
export class WirelessSsidsSplashSettings extends pulumi.CustomResource {
    /**
     * Get an existing WirelessSsidsSplashSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WirelessSsidsSplashSettingsState, opts?: pulumi.CustomResourceOptions): WirelessSsidsSplashSettings {
        return new WirelessSsidsSplashSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'meraki:networks/wirelessSsidsSplashSettings:WirelessSsidsSplashSettings';

    /**
     * Returns true if the given object is an instance of WirelessSsidsSplashSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WirelessSsidsSplashSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WirelessSsidsSplashSettings.__pulumiType;
    }

    /**
     * Whether or not to allow simultaneous logins from different devices.
     */
    public readonly allowSimultaneousLogins!: pulumi.Output<boolean>;
    /**
     * Details associated with billing splash
     */
    public readonly billing!: pulumi.Output<outputs.networks.WirelessSsidsSplashSettingsBilling>;
    /**
     * How restricted allowing traffic should be. If true, all traffic types are blocked until the splash page is acknowledged. If false, all non-HTTP traffic is allowed before the splash page is acknowledged.
     */
    public readonly blockAllTrafficBeforeSignOn!: pulumi.Output<boolean>;
    /**
     * How login attempts should be handled when the controller is unreachable.
     */
    public readonly controllerDisconnectionBehavior!: pulumi.Output<string>;
    /**
     * Details associated with guest sponsored splash
     */
    public readonly guestSponsorship!: pulumi.Output<outputs.networks.WirelessSsidsSplashSettingsGuestSponsorship>;
    /**
     * networkId path parameter. Network ID
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * number path parameter.
     */
    public readonly number!: pulumi.Output<string>;
    /**
     * The custom redirect URL where the users will go after the splash page.
     */
    public readonly redirectUrl!: pulumi.Output<string>;
    /**
     * Self-registration for splash with Meraki authentication.
     */
    public /*out*/ readonly selfRegistration!: pulumi.Output<outputs.networks.WirelessSsidsSplashSettingsSelfRegistration>;
    /**
     * Systems Manager sentry enrollment splash settings.
     */
    public readonly sentryEnrollment!: pulumi.Output<outputs.networks.WirelessSsidsSplashSettingsSentryEnrollment>;
    /**
     * The image used in the splash page.
     */
    public readonly splashImage!: pulumi.Output<outputs.networks.WirelessSsidsSplashSettingsSplashImage>;
    /**
     * The logo used in the splash page.
     */
    public readonly splashLogo!: pulumi.Output<outputs.networks.WirelessSsidsSplashSettingsSplashLogo>;
    /**
     * The type of splash page for this SSID
     */
    public /*out*/ readonly splashPage!: pulumi.Output<string>;
    /**
     * The prepaid front image used in the splash page.
     */
    public readonly splashPrepaidFront!: pulumi.Output<outputs.networks.WirelessSsidsSplashSettingsSplashPrepaidFront>;
    /**
     * Splash timeout in minutes.
     */
    public readonly splashTimeout!: pulumi.Output<number>;
    /**
     * The custom splash URL of the click-through splash page.
     */
    public readonly splashUrl!: pulumi.Output<string>;
    /**
     * SSID number
     */
    public /*out*/ readonly ssidNumber!: pulumi.Output<number>;
    /**
     * The id of the selected splash theme.
     */
    public readonly themeId!: pulumi.Output<string>;
    /**
     * The Boolean indicating whether the the user will be redirected to the custom redirect URL after the splash page.
     */
    public readonly useRedirectUrl!: pulumi.Output<boolean>;
    /**
     * Boolean indicating whether the users will be redirected to the custom splash url
     */
    public readonly useSplashUrl!: pulumi.Output<boolean>;
    /**
     * The welcome message for the users on the splash page.
     */
    public readonly welcomeMessage!: pulumi.Output<string>;

    /**
     * Create a WirelessSsidsSplashSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WirelessSsidsSplashSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WirelessSsidsSplashSettingsArgs | WirelessSsidsSplashSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WirelessSsidsSplashSettingsState | undefined;
            resourceInputs["allowSimultaneousLogins"] = state ? state.allowSimultaneousLogins : undefined;
            resourceInputs["billing"] = state ? state.billing : undefined;
            resourceInputs["blockAllTrafficBeforeSignOn"] = state ? state.blockAllTrafficBeforeSignOn : undefined;
            resourceInputs["controllerDisconnectionBehavior"] = state ? state.controllerDisconnectionBehavior : undefined;
            resourceInputs["guestSponsorship"] = state ? state.guestSponsorship : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["number"] = state ? state.number : undefined;
            resourceInputs["redirectUrl"] = state ? state.redirectUrl : undefined;
            resourceInputs["selfRegistration"] = state ? state.selfRegistration : undefined;
            resourceInputs["sentryEnrollment"] = state ? state.sentryEnrollment : undefined;
            resourceInputs["splashImage"] = state ? state.splashImage : undefined;
            resourceInputs["splashLogo"] = state ? state.splashLogo : undefined;
            resourceInputs["splashPage"] = state ? state.splashPage : undefined;
            resourceInputs["splashPrepaidFront"] = state ? state.splashPrepaidFront : undefined;
            resourceInputs["splashTimeout"] = state ? state.splashTimeout : undefined;
            resourceInputs["splashUrl"] = state ? state.splashUrl : undefined;
            resourceInputs["ssidNumber"] = state ? state.ssidNumber : undefined;
            resourceInputs["themeId"] = state ? state.themeId : undefined;
            resourceInputs["useRedirectUrl"] = state ? state.useRedirectUrl : undefined;
            resourceInputs["useSplashUrl"] = state ? state.useSplashUrl : undefined;
            resourceInputs["welcomeMessage"] = state ? state.welcomeMessage : undefined;
        } else {
            const args = argsOrState as WirelessSsidsSplashSettingsArgs | undefined;
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            if ((!args || args.number === undefined) && !opts.urn) {
                throw new Error("Missing required property 'number'");
            }
            resourceInputs["allowSimultaneousLogins"] = args ? args.allowSimultaneousLogins : undefined;
            resourceInputs["billing"] = args ? args.billing : undefined;
            resourceInputs["blockAllTrafficBeforeSignOn"] = args ? args.blockAllTrafficBeforeSignOn : undefined;
            resourceInputs["controllerDisconnectionBehavior"] = args ? args.controllerDisconnectionBehavior : undefined;
            resourceInputs["guestSponsorship"] = args ? args.guestSponsorship : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["number"] = args ? args.number : undefined;
            resourceInputs["redirectUrl"] = args ? args.redirectUrl : undefined;
            resourceInputs["sentryEnrollment"] = args ? args.sentryEnrollment : undefined;
            resourceInputs["splashImage"] = args ? args.splashImage : undefined;
            resourceInputs["splashLogo"] = args ? args.splashLogo : undefined;
            resourceInputs["splashPrepaidFront"] = args ? args.splashPrepaidFront : undefined;
            resourceInputs["splashTimeout"] = args ? args.splashTimeout : undefined;
            resourceInputs["splashUrl"] = args ? args.splashUrl : undefined;
            resourceInputs["themeId"] = args ? args.themeId : undefined;
            resourceInputs["useRedirectUrl"] = args ? args.useRedirectUrl : undefined;
            resourceInputs["useSplashUrl"] = args ? args.useSplashUrl : undefined;
            resourceInputs["welcomeMessage"] = args ? args.welcomeMessage : undefined;
            resourceInputs["selfRegistration"] = undefined /*out*/;
            resourceInputs["splashPage"] = undefined /*out*/;
            resourceInputs["ssidNumber"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WirelessSsidsSplashSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WirelessSsidsSplashSettings resources.
 */
export interface WirelessSsidsSplashSettingsState {
    /**
     * Whether or not to allow simultaneous logins from different devices.
     */
    allowSimultaneousLogins?: pulumi.Input<boolean>;
    /**
     * Details associated with billing splash
     */
    billing?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsBilling>;
    /**
     * How restricted allowing traffic should be. If true, all traffic types are blocked until the splash page is acknowledged. If false, all non-HTTP traffic is allowed before the splash page is acknowledged.
     */
    blockAllTrafficBeforeSignOn?: pulumi.Input<boolean>;
    /**
     * How login attempts should be handled when the controller is unreachable.
     */
    controllerDisconnectionBehavior?: pulumi.Input<string>;
    /**
     * Details associated with guest sponsored splash
     */
    guestSponsorship?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsGuestSponsorship>;
    /**
     * networkId path parameter. Network ID
     */
    networkId?: pulumi.Input<string>;
    /**
     * number path parameter.
     */
    number?: pulumi.Input<string>;
    /**
     * The custom redirect URL where the users will go after the splash page.
     */
    redirectUrl?: pulumi.Input<string>;
    /**
     * Self-registration for splash with Meraki authentication.
     */
    selfRegistration?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsSelfRegistration>;
    /**
     * Systems Manager sentry enrollment splash settings.
     */
    sentryEnrollment?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsSentryEnrollment>;
    /**
     * The image used in the splash page.
     */
    splashImage?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsSplashImage>;
    /**
     * The logo used in the splash page.
     */
    splashLogo?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsSplashLogo>;
    /**
     * The type of splash page for this SSID
     */
    splashPage?: pulumi.Input<string>;
    /**
     * The prepaid front image used in the splash page.
     */
    splashPrepaidFront?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsSplashPrepaidFront>;
    /**
     * Splash timeout in minutes.
     */
    splashTimeout?: pulumi.Input<number>;
    /**
     * The custom splash URL of the click-through splash page.
     */
    splashUrl?: pulumi.Input<string>;
    /**
     * SSID number
     */
    ssidNumber?: pulumi.Input<number>;
    /**
     * The id of the selected splash theme.
     */
    themeId?: pulumi.Input<string>;
    /**
     * The Boolean indicating whether the the user will be redirected to the custom redirect URL after the splash page.
     */
    useRedirectUrl?: pulumi.Input<boolean>;
    /**
     * Boolean indicating whether the users will be redirected to the custom splash url
     */
    useSplashUrl?: pulumi.Input<boolean>;
    /**
     * The welcome message for the users on the splash page.
     */
    welcomeMessage?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WirelessSsidsSplashSettings resource.
 */
export interface WirelessSsidsSplashSettingsArgs {
    /**
     * Whether or not to allow simultaneous logins from different devices.
     */
    allowSimultaneousLogins?: pulumi.Input<boolean>;
    /**
     * Details associated with billing splash
     */
    billing?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsBilling>;
    /**
     * How restricted allowing traffic should be. If true, all traffic types are blocked until the splash page is acknowledged. If false, all non-HTTP traffic is allowed before the splash page is acknowledged.
     */
    blockAllTrafficBeforeSignOn?: pulumi.Input<boolean>;
    /**
     * How login attempts should be handled when the controller is unreachable.
     */
    controllerDisconnectionBehavior?: pulumi.Input<string>;
    /**
     * Details associated with guest sponsored splash
     */
    guestSponsorship?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsGuestSponsorship>;
    /**
     * networkId path parameter. Network ID
     */
    networkId: pulumi.Input<string>;
    /**
     * number path parameter.
     */
    number: pulumi.Input<string>;
    /**
     * The custom redirect URL where the users will go after the splash page.
     */
    redirectUrl?: pulumi.Input<string>;
    /**
     * Systems Manager sentry enrollment splash settings.
     */
    sentryEnrollment?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsSentryEnrollment>;
    /**
     * The image used in the splash page.
     */
    splashImage?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsSplashImage>;
    /**
     * The logo used in the splash page.
     */
    splashLogo?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsSplashLogo>;
    /**
     * The prepaid front image used in the splash page.
     */
    splashPrepaidFront?: pulumi.Input<inputs.networks.WirelessSsidsSplashSettingsSplashPrepaidFront>;
    /**
     * Splash timeout in minutes.
     */
    splashTimeout?: pulumi.Input<number>;
    /**
     * The custom splash URL of the click-through splash page.
     */
    splashUrl?: pulumi.Input<string>;
    /**
     * The id of the selected splash theme.
     */
    themeId?: pulumi.Input<string>;
    /**
     * The Boolean indicating whether the the user will be redirected to the custom redirect URL after the splash page.
     */
    useRedirectUrl?: pulumi.Input<boolean>;
    /**
     * Boolean indicating whether the users will be redirected to the custom splash url
     */
    useSplashUrl?: pulumi.Input<boolean>;
    /**
     * The welcome message for the users on the splash page.
     */
    welcomeMessage?: pulumi.Input<string>;
}