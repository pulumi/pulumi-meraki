// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 */
export function getInventoryDevices(args?: GetInventoryDevicesArgs, opts?: pulumi.InvokeOptions): Promise<GetInventoryDevicesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("meraki:organizations/getInventoryDevices:getInventoryDevices", {
        "endingBefore": args.endingBefore,
        "macs": args.macs,
        "models": args.models,
        "networkIds": args.networkIds,
        "orderNumbers": args.orderNumbers,
        "organizationId": args.organizationId,
        "perPage": args.perPage,
        "productTypes": args.productTypes,
        "search": args.search,
        "serial": args.serial,
        "serials": args.serials,
        "startingAfter": args.startingAfter,
        "tags": args.tags,
        "tagsFilterType": args.tagsFilterType,
        "usedState": args.usedState,
    }, opts);
}

/**
 * A collection of arguments for invoking getInventoryDevices.
 */
export interface GetInventoryDevicesArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: string;
    /**
     * macs query parameter. Search for devices in inventory based on mac addresses.
     */
    macs?: string[];
    /**
     * models query parameter. Search for devices in inventory based on model.
     */
    models?: string[];
    /**
     * networkIds query parameter. Search for devices in inventory based on network ids. Use explicit 'null' value to get available devices only.
     */
    networkIds?: string[];
    /**
     * orderNumbers query parameter. Search for devices in inventory based on order numbers.
     */
    orderNumbers?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: number;
    /**
     * productTypes query parameter. Filter devices by product type. Accepted values are appliance, camera, cellularGateway, sensor, switch, systemsManager, and wireless.
     */
    productTypes?: string[];
    /**
     * search query parameter. Search for devices in inventory based on serial number, mac address, or model.
     */
    search?: string;
    /**
     * serial path parameter.
     */
    serial?: string;
    /**
     * serials query parameter. Search for devices in inventory based on serials.
     */
    serials?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: string;
    /**
     * tags query parameter. Filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
     */
    tags?: string[];
    /**
     * tagsFilterType query parameter. To use with 'tags' parameter, to filter devices which contain ANY or ALL given tags. Accepted values are 'withAnyTags' or 'withAllTags', default is 'withAnyTags'.
     */
    tagsFilterType?: string;
    /**
     * usedState query parameter. Filter results by used or unused inventory. Accepted values are 'used' or 'unused'.
     */
    usedState?: string;
}

/**
 * A collection of values returned by getInventoryDevices.
 */
export interface GetInventoryDevicesResult {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly endingBefore?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly item: outputs.organizations.GetInventoryDevicesItem;
    /**
     * Array of ResponseOrganizationsGetOrganizationInventoryDevices
     */
    readonly items: outputs.organizations.GetInventoryDevicesItem[];
    /**
     * macs query parameter. Search for devices in inventory based on mac addresses.
     */
    readonly macs?: string[];
    /**
     * models query parameter. Search for devices in inventory based on model.
     */
    readonly models?: string[];
    /**
     * networkIds query parameter. Search for devices in inventory based on network ids. Use explicit 'null' value to get available devices only.
     */
    readonly networkIds?: string[];
    /**
     * orderNumbers query parameter. Search for devices in inventory based on order numbers.
     */
    readonly orderNumbers?: string[];
    /**
     * organizationId path parameter. Organization ID
     */
    readonly organizationId?: string;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    readonly perPage?: number;
    /**
     * productTypes query parameter. Filter devices by product type. Accepted values are appliance, camera, cellularGateway, sensor, switch, systemsManager, and wireless.
     */
    readonly productTypes?: string[];
    /**
     * search query parameter. Search for devices in inventory based on serial number, mac address, or model.
     */
    readonly search?: string;
    /**
     * serial path parameter.
     */
    readonly serial?: string;
    /**
     * serials query parameter. Search for devices in inventory based on serials.
     */
    readonly serials?: string[];
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    readonly startingAfter?: string;
    /**
     * tags query parameter. Filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
     */
    readonly tags?: string[];
    /**
     * tagsFilterType query parameter. To use with 'tags' parameter, to filter devices which contain ANY or ALL given tags. Accepted values are 'withAnyTags' or 'withAllTags', default is 'withAnyTags'.
     */
    readonly tagsFilterType?: string;
    /**
     * usedState query parameter. Filter results by used or unused inventory. Accepted values are 'used' or 'unused'.
     */
    readonly usedState?: string;
}
/**
 * ## Example Usage
 */
export function getInventoryDevicesOutput(args?: GetInventoryDevicesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInventoryDevicesResult> {
    return pulumi.output(args).apply((a: any) => getInventoryDevices(a, opts))
}

/**
 * A collection of arguments for invoking getInventoryDevices.
 */
export interface GetInventoryDevicesOutputArgs {
    /**
     * endingBefore query parameter. A token used by the server to indicate the end of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    endingBefore?: pulumi.Input<string>;
    /**
     * macs query parameter. Search for devices in inventory based on mac addresses.
     */
    macs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * models query parameter. Search for devices in inventory based on model.
     */
    models?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * networkIds query parameter. Search for devices in inventory based on network ids. Use explicit 'null' value to get available devices only.
     */
    networkIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * orderNumbers query parameter. Search for devices in inventory based on order numbers.
     */
    orderNumbers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * organizationId path parameter. Organization ID
     */
    organizationId?: pulumi.Input<string>;
    /**
     * perPage query parameter. The number of entries per page returned. Acceptable range is 3 1000. Default is 1000.
     */
    perPage?: pulumi.Input<number>;
    /**
     * productTypes query parameter. Filter devices by product type. Accepted values are appliance, camera, cellularGateway, sensor, switch, systemsManager, and wireless.
     */
    productTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * search query parameter. Search for devices in inventory based on serial number, mac address, or model.
     */
    search?: pulumi.Input<string>;
    /**
     * serial path parameter.
     */
    serial?: pulumi.Input<string>;
    /**
     * serials query parameter. Search for devices in inventory based on serials.
     */
    serials?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * startingAfter query parameter. A token used by the server to indicate the start of the page. Often this is a timestamp or an ID but it is not limited to those. This parameter should not be defined by client applications. The link for the first, last, prev, or next page in the HTTP Link header should define it.
     */
    startingAfter?: pulumi.Input<string>;
    /**
     * tags query parameter. Filter devices by tags. The filtering is case-sensitive. If tags are included, 'tagsFilterType' should also be included (see below).
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * tagsFilterType query parameter. To use with 'tags' parameter, to filter devices which contain ANY or ALL given tags. Accepted values are 'withAnyTags' or 'withAllTags', default is 'withAnyTags'.
     */
    tagsFilterType?: pulumi.Input<string>;
    /**
     * usedState query parameter. Filter results by used or unused inventory. Accepted values are 'used' or 'unused'.
     */
    usedState?: pulumi.Input<string>;
}