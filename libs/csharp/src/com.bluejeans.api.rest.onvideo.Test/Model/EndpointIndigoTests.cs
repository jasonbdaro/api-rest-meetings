/* 
 * BlueJeans onVideo REST API
 *
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\"). ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using com.bluejeans.api.rest.onvideo.Api;
using com.bluejeans.api.rest.onvideo.Model;
using com.bluejeans.api.rest.onvideo.Client;
using System.Reflection;

namespace com.bluejeans.api.rest.onvideo.Test
{
    /// <summary>
    ///  Class for testing EndpointIndigo
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class EndpointIndigoTests
    {
        // TODO uncomment below to declare an instance variable for EndpointIndigo
        //private EndpointIndigo instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of EndpointIndigo
            //instance = new EndpointIndigo();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of EndpointIndigo
        /// </summary>
        [Test]
        public void EndpointIndigoInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" EndpointIndigo
            //Assert.IsInstanceOfType<EndpointIndigo> (instance, "variable 'instance' is a EndpointIndigo");
        }

        /// <summary>
        /// Test the property 'Id'
        /// </summary>
        [Test]
        public void IdTest()
        {
            // TODO unit test for the property 'Id'
        }
        /// <summary>
        /// Test the property 'Callguid'
        /// </summary>
        [Test]
        public void CallguidTest()
        {
            // TODO unit test for the property 'Callguid'
        }
        /// <summary>
        /// Test the property 'Name'
        /// </summary>
        [Test]
        public void NameTest()
        {
            // TODO unit test for the property 'Name'
        }
        /// <summary>
        /// Test the property 'Endpoint'
        /// </summary>
        [Test]
        public void EndpointTest()
        {
            // TODO unit test for the property 'Endpoint'
        }
        /// <summary>
        /// Test the property 'Vendor'
        /// </summary>
        [Test]
        public void VendorTest()
        {
            // TODO unit test for the property 'Vendor'
        }
        /// <summary>
        /// Test the property 'Version'
        /// </summary>
        [Test]
        public void VersionTest()
        {
            // TODO unit test for the property 'Version'
        }
        /// <summary>
        /// Test the property 'UniqId'
        /// </summary>
        [Test]
        public void UniqIdTest()
        {
            // TODO unit test for the property 'UniqId'
        }
        /// <summary>
        /// Test the property 'RemoteAddress'
        /// </summary>
        [Test]
        public void RemoteAddressTest()
        {
            // TODO unit test for the property 'RemoteAddress'
        }
        /// <summary>
        /// Test the property 'Leader'
        /// </summary>
        [Test]
        public void LeaderTest()
        {
            // TODO unit test for the property 'Leader'
        }
        /// <summary>
        /// Test the property 'SecureCall'
        /// </summary>
        [Test]
        public void SecureCallTest()
        {
            // TODO unit test for the property 'SecureCall'
        }
        /// <summary>
        /// Test the property 'NatDetected'
        /// </summary>
        [Test]
        public void NatDetectedTest()
        {
            // TODO unit test for the property 'NatDetected'
        }
        /// <summary>
        /// Test the property 'Proxy'
        /// </summary>
        [Test]
        public void ProxyTest()
        {
            // TODO unit test for the property 'Proxy'
        }
        /// <summary>
        /// Test the property 'RoiDistance'
        /// </summary>
        [Test]
        public void RoiDistanceTest()
        {
            // TODO unit test for the property 'RoiDistance'
        }
        /// <summary>
        /// Test the property 'Mpls'
        /// </summary>
        [Test]
        public void MplsTest()
        {
            // TODO unit test for the property 'Mpls'
        }
        /// <summary>
        /// Test the property 'VideoShare'
        /// </summary>
        [Test]
        public void VideoShareTest()
        {
            // TODO unit test for the property 'VideoShare'
        }
        /// <summary>
        /// Test the property 'Recording'
        /// </summary>
        [Test]
        public void RecordingTest()
        {
            // TODO unit test for the property 'Recording'
        }
        /// <summary>
        /// Test the property 'CreationTime'
        /// </summary>
        [Test]
        public void CreationTimeTest()
        {
            // TODO unit test for the property 'CreationTime'
        }
        /// <summary>
        /// Test the property 'MeetingJoinTime'
        /// </summary>
        [Test]
        public void MeetingJoinTimeTest()
        {
            // TODO unit test for the property 'MeetingJoinTime'
        }
        /// <summary>
        /// Test the property 'MeetingLeaveTime'
        /// </summary>
        [Test]
        public void MeetingLeaveTimeTest()
        {
            // TODO unit test for the property 'MeetingLeaveTime'
        }
        /// <summary>
        /// Test the property 'DidNumber'
        /// </summary>
        [Test]
        public void DidNumberTest()
        {
            // TODO unit test for the property 'DidNumber'
        }
        /// <summary>
        /// Test the property 'Location'
        /// </summary>
        [Test]
        public void LocationTest()
        {
            // TODO unit test for the property 'Location'
        }
        /// <summary>
        /// Test the property 'SummaryStats'
        /// </summary>
        [Test]
        public void SummaryStatsTest()
        {
            // TODO unit test for the property 'SummaryStats'
        }
        /// <summary>
        /// Test the property 'EndpointAttributes1'
        /// </summary>
        [Test]
        public void EndpointAttributes1Test()
        {
            // TODO unit test for the property 'EndpointAttributes1'
        }
        /// <summary>
        /// Test the property 'Traceroute'
        /// </summary>
        [Test]
        public void TracerouteTest()
        {
            // TODO unit test for the property 'Traceroute'
        }
        /// <summary>
        /// Test the property 'MhtaskStopped'
        /// </summary>
        [Test]
        public void MhtaskStoppedTest()
        {
            // TODO unit test for the property 'MhtaskStopped'
        }

    }

}
