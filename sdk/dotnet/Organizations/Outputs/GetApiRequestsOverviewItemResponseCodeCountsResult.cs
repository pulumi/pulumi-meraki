// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Meraki.Organizations.Outputs
{

    [OutputType]
    public sealed class GetApiRequestsOverviewItemResponseCodeCountsResult
    {
        /// <summary>
        /// HTTP 200 response code count.
        /// </summary>
        public readonly int Status200;
        /// <summary>
        /// HTTP 201 response code count.
        /// </summary>
        public readonly int Status201;
        /// <summary>
        /// HTTP 202 response code count.
        /// </summary>
        public readonly int Status202;
        /// <summary>
        /// HTTP 203 response code count.
        /// </summary>
        public readonly int Status203;
        /// <summary>
        /// HTTP 204 response code count.
        /// </summary>
        public readonly int Status204;
        /// <summary>
        /// HTTP 205 response code count.
        /// </summary>
        public readonly int Status205;
        /// <summary>
        /// HTTP 206 response code count.
        /// </summary>
        public readonly int Status206;
        /// <summary>
        /// HTTP 207 response code count.
        /// </summary>
        public readonly int Status207;
        /// <summary>
        /// HTTP 208 response code count.
        /// </summary>
        public readonly int Status208;
        /// <summary>
        /// HTTP 226 response code count.
        /// </summary>
        public readonly int Status226;
        /// <summary>
        /// HTTP 300 response code count.
        /// </summary>
        public readonly int Status300;
        /// <summary>
        /// HTTP 301 response code count.
        /// </summary>
        public readonly int Status301;
        /// <summary>
        /// HTTP 302 response code count.
        /// </summary>
        public readonly int Status302;
        /// <summary>
        /// HTTP 303 response code count.
        /// </summary>
        public readonly int Status303;
        /// <summary>
        /// HTTP 304 response code count.
        /// </summary>
        public readonly int Status304;
        /// <summary>
        /// HTTP 305 response code count.
        /// </summary>
        public readonly int Status305;
        /// <summary>
        /// HTTP 306 response code count.
        /// </summary>
        public readonly int Status306;
        /// <summary>
        /// HTTP 307 response code count.
        /// </summary>
        public readonly int Status307;
        /// <summary>
        /// HTTP 308 response code count.
        /// </summary>
        public readonly int Status308;
        /// <summary>
        /// HTTP 400 response code count.
        /// </summary>
        public readonly int Status400;
        /// <summary>
        /// HTTP 401 response code count.
        /// </summary>
        public readonly int Status401;
        /// <summary>
        /// HTTP 402 response code count.
        /// </summary>
        public readonly int Status402;
        /// <summary>
        /// HTTP 403 response code count.
        /// </summary>
        public readonly int Status403;
        /// <summary>
        /// HTTP 404 response code count.
        /// </summary>
        public readonly int Status404;
        /// <summary>
        /// HTTP 405 response code count.
        /// </summary>
        public readonly int Status405;
        /// <summary>
        /// HTTP 406 response code count.
        /// </summary>
        public readonly int Status406;
        /// <summary>
        /// HTTP 407 response code count.
        /// </summary>
        public readonly int Status407;
        /// <summary>
        /// HTTP 408 response code count.
        /// </summary>
        public readonly int Status408;
        /// <summary>
        /// HTTP 409 response code count.
        /// </summary>
        public readonly int Status409;
        /// <summary>
        /// HTTP 410 response code count.
        /// </summary>
        public readonly int Status410;
        /// <summary>
        /// HTTP 411 response code count.
        /// </summary>
        public readonly int Status411;
        /// <summary>
        /// HTTP 412 response code count.
        /// </summary>
        public readonly int Status412;
        /// <summary>
        /// HTTP 413 response code count.
        /// </summary>
        public readonly int Status413;
        /// <summary>
        /// HTTP 414 response code count.
        /// </summary>
        public readonly int Status414;
        /// <summary>
        /// HTTP 415 response code count.
        /// </summary>
        public readonly int Status415;
        /// <summary>
        /// HTTP 416 response code count.
        /// </summary>
        public readonly int Status416;
        /// <summary>
        /// HTTP 417 response code count.
        /// </summary>
        public readonly int Status417;
        /// <summary>
        /// HTTP 421 response code count.
        /// </summary>
        public readonly int Status421;
        /// <summary>
        /// HTTP 422 response code count.
        /// </summary>
        public readonly int Status422;
        /// <summary>
        /// HTTP 423 response code count.
        /// </summary>
        public readonly int Status423;
        /// <summary>
        /// HTTP 424 response code count.
        /// </summary>
        public readonly int Status424;
        /// <summary>
        /// HTTP 425 response code count.
        /// </summary>
        public readonly int Status425;
        /// <summary>
        /// HTTP 426 response code count.
        /// </summary>
        public readonly int Status426;
        /// <summary>
        /// HTTP 428 response code count.
        /// </summary>
        public readonly int Status428;
        /// <summary>
        /// HTTP 429 response code count.
        /// </summary>
        public readonly int Status429;
        /// <summary>
        /// HTTP 431 response code count.
        /// </summary>
        public readonly int Status431;
        /// <summary>
        /// HTTP 451 response code count.
        /// </summary>
        public readonly int Status451;
        /// <summary>
        /// HTTP 500 response code count.
        /// </summary>
        public readonly int Status500;
        /// <summary>
        /// HTTP 501 response code count.
        /// </summary>
        public readonly int Status501;
        /// <summary>
        /// HTTP 502 response code count.
        /// </summary>
        public readonly int Status502;
        /// <summary>
        /// HTTP 503 response code count.
        /// </summary>
        public readonly int Status503;
        /// <summary>
        /// HTTP 504 response code count.
        /// </summary>
        public readonly int Status504;
        /// <summary>
        /// HTTP 505 response code count.
        /// </summary>
        public readonly int Status505;
        /// <summary>
        /// HTTP 506 response code count.
        /// </summary>
        public readonly int Status506;
        /// <summary>
        /// HTTP 507 response code count.
        /// </summary>
        public readonly int Status507;
        /// <summary>
        /// HTTP 508 response code count.
        /// </summary>
        public readonly int Status508;
        /// <summary>
        /// HTTP 509 response code count.
        /// </summary>
        public readonly int Status509;
        /// <summary>
        /// HTTP 510 response code count.
        /// </summary>
        public readonly int Status510;
        /// <summary>
        /// HTTP 511 response code count.
        /// </summary>
        public readonly int Status511;

        [OutputConstructor]
        private GetApiRequestsOverviewItemResponseCodeCountsResult(
            int status200,

            int status201,

            int status202,

            int status203,

            int status204,

            int status205,

            int status206,

            int status207,

            int status208,

            int status226,

            int status300,

            int status301,

            int status302,

            int status303,

            int status304,

            int status305,

            int status306,

            int status307,

            int status308,

            int status400,

            int status401,

            int status402,

            int status403,

            int status404,

            int status405,

            int status406,

            int status407,

            int status408,

            int status409,

            int status410,

            int status411,

            int status412,

            int status413,

            int status414,

            int status415,

            int status416,

            int status417,

            int status421,

            int status422,

            int status423,

            int status424,

            int status425,

            int status426,

            int status428,

            int status429,

            int status431,

            int status451,

            int status500,

            int status501,

            int status502,

            int status503,

            int status504,

            int status505,

            int status506,

            int status507,

            int status508,

            int status509,

            int status510,

            int status511)
        {
            Status200 = status200;
            Status201 = status201;
            Status202 = status202;
            Status203 = status203;
            Status204 = status204;
            Status205 = status205;
            Status206 = status206;
            Status207 = status207;
            Status208 = status208;
            Status226 = status226;
            Status300 = status300;
            Status301 = status301;
            Status302 = status302;
            Status303 = status303;
            Status304 = status304;
            Status305 = status305;
            Status306 = status306;
            Status307 = status307;
            Status308 = status308;
            Status400 = status400;
            Status401 = status401;
            Status402 = status402;
            Status403 = status403;
            Status404 = status404;
            Status405 = status405;
            Status406 = status406;
            Status407 = status407;
            Status408 = status408;
            Status409 = status409;
            Status410 = status410;
            Status411 = status411;
            Status412 = status412;
            Status413 = status413;
            Status414 = status414;
            Status415 = status415;
            Status416 = status416;
            Status417 = status417;
            Status421 = status421;
            Status422 = status422;
            Status423 = status423;
            Status424 = status424;
            Status425 = status425;
            Status426 = status426;
            Status428 = status428;
            Status429 = status429;
            Status431 = status431;
            Status451 = status451;
            Status500 = status500;
            Status501 = status501;
            Status502 = status502;
            Status503 = status503;
            Status504 = status504;
            Status505 = status505;
            Status506 = status506;
            Status507 = status507;
            Status508 = status508;
            Status509 = status509;
            Status510 = status510;
            Status511 = status511;
        }
    }
}
