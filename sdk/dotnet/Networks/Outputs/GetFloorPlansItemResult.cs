// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Networks.Outputs
{

    [OutputType]
    public sealed class GetFloorPlansItemResult
    {
        /// <summary>
        /// The longitude and latitude of the bottom left corner of your floor plan.
        /// </summary>
        public readonly Outputs.GetFloorPlansItemBottomLeftCornerResult BottomLeftCorner;
        /// <summary>
        /// The longitude and latitude of the bottom right corner of your floor plan.
        /// </summary>
        public readonly Outputs.GetFloorPlansItemBottomRightCornerResult BottomRightCorner;
        /// <summary>
        /// The longitude and latitude of the center of your floor plan. The 'center' or two adjacent corners (e.g. 'topLeftCorner' and 'bottomLeftCorner') must be specified. If 'center' is specified, the floor plan is placed over that point with no rotation. If two adjacent corners are specified, the floor plan is rotated to line up with the two specified points. The aspect ratio of the floor plan's image is preserved regardless of which corners/center are specified. (This means if that more than two corners are specified, only two corners may be used to preserve the floor plan's aspect ratio.). No two points can have the same latitude, longitude pair.
        /// </summary>
        public readonly Outputs.GetFloorPlansItemCenterResult Center;
        /// <summary>
        /// List of devices for the floorplan
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFloorPlansItemDeviceResult> Devices;
        /// <summary>
        /// Floor plan ID
        /// </summary>
        public readonly string FloorPlanId;
        /// <summary>
        /// The height of your floor plan.
        /// </summary>
        public readonly double Height;
        /// <summary>
        /// The format type of the image.
        /// </summary>
        public readonly string ImageExtension;
        /// <summary>
        /// The file contents (a base 64 encoded string) of your new image. Supported formats are PNG, GIF, and JPG. Note that all images are saved as PNG files, regardless of the format they are uploaded in. If you upload a new image, and you do NOT specify any new geolocation fields ('center, 'topLeftCorner', etc), the floor plan will be recentered with no rotation in order to maintain the aspect ratio of your new image.
        /// </summary>
        public readonly string ImageMd5;
        /// <summary>
        /// The url link for the floor plan image.
        /// </summary>
        public readonly string ImageUrl;
        /// <summary>
        /// The time the image url link will expire.
        /// </summary>
        public readonly string ImageUrlExpiresAt;
        /// <summary>
        /// The name of your floor plan.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The longitude and latitude of the top left corner of your floor plan.
        /// </summary>
        public readonly Outputs.GetFloorPlansItemTopLeftCornerResult TopLeftCorner;
        /// <summary>
        /// The longitude and latitude of the top right corner of your floor plan.
        /// </summary>
        public readonly Outputs.GetFloorPlansItemTopRightCornerResult TopRightCorner;
        /// <summary>
        /// The width of your floor plan.
        /// </summary>
        public readonly double Width;

        [OutputConstructor]
        private GetFloorPlansItemResult(
            Outputs.GetFloorPlansItemBottomLeftCornerResult bottomLeftCorner,

            Outputs.GetFloorPlansItemBottomRightCornerResult bottomRightCorner,

            Outputs.GetFloorPlansItemCenterResult center,

            ImmutableArray<Outputs.GetFloorPlansItemDeviceResult> devices,

            string floorPlanId,

            double height,

            string imageExtension,

            string imageMd5,

            string imageUrl,

            string imageUrlExpiresAt,

            string name,

            Outputs.GetFloorPlansItemTopLeftCornerResult topLeftCorner,

            Outputs.GetFloorPlansItemTopRightCornerResult topRightCorner,

            double width)
        {
            BottomLeftCorner = bottomLeftCorner;
            BottomRightCorner = bottomRightCorner;
            Center = center;
            Devices = devices;
            FloorPlanId = floorPlanId;
            Height = height;
            ImageExtension = imageExtension;
            ImageMd5 = imageMd5;
            ImageUrl = imageUrl;
            ImageUrlExpiresAt = imageUrlExpiresAt;
            Name = name;
            TopLeftCorner = topLeftCorner;
            TopRightCorner = topRightCorner;
            Width = width;
        }
    }
}
