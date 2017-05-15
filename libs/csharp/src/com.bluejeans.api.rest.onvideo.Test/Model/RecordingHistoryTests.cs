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
    ///  Class for testing RecordingHistory
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class RecordingHistoryTests
    {
        // TODO uncomment below to declare an instance variable for RecordingHistory
        //private RecordingHistory instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of RecordingHistory
            //instance = new RecordingHistory();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of RecordingHistory
        /// </summary>
        [Test]
        public void RecordingHistoryInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" RecordingHistory
            //Assert.IsInstanceOfType<RecordingHistory> (instance, "variable 'instance' is a RecordingHistory");
        }

        /// <summary>
        /// Test the property 'ChapterId'
        /// </summary>
        [Test]
        public void ChapterIdTest()
        {
            // TODO unit test for the property 'ChapterId'
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
        /// Test the property 'StartTimeOffset'
        /// </summary>
        [Test]
        public void StartTimeOffsetTest()
        {
            // TODO unit test for the property 'StartTimeOffset'
        }
        /// <summary>
        /// Test the property 'EndTimeOffset'
        /// </summary>
        [Test]
        public void EndTimeOffsetTest()
        {
            // TODO unit test for the property 'EndTimeOffset'
        }
        /// <summary>
        /// Test the property 'ChapterName'
        /// </summary>
        [Test]
        public void ChapterNameTest()
        {
            // TODO unit test for the property 'ChapterName'
        }
        /// <summary>
        /// Test the property 'TotalSize'
        /// </summary>
        [Test]
        public void TotalSizeTest()
        {
            // TODO unit test for the property 'TotalSize'
        }
        /// <summary>
        /// Test the property 'CompositeContentId'
        /// </summary>
        [Test]
        public void CompositeContentIdTest()
        {
            // TODO unit test for the property 'CompositeContentId'
        }
        /// <summary>
        /// Test the property 'CompositeContentStatus'
        /// </summary>
        [Test]
        public void CompositeContentStatusTest()
        {
            // TODO unit test for the property 'CompositeContentStatus'
        }
        /// <summary>
        /// Test the property 'ParentRecordingId'
        /// </summary>
        [Test]
        public void ParentRecordingIdTest()
        {
            // TODO unit test for the property 'ParentRecordingId'
        }
        /// <summary>
        /// Test the property 'ViewCount'
        /// </summary>
        [Test]
        public void ViewCountTest()
        {
            // TODO unit test for the property 'ViewCount'
        }
        /// <summary>
        /// Test the property 'RecordingSessions'
        /// </summary>
        [Test]
        public void RecordingSessionsTest()
        {
            // TODO unit test for the property 'RecordingSessions'
        }

    }

}
