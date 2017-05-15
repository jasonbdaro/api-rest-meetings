/**
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\"). ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BlueJeansOnVideoRestApi);
  }
}(this, function(expect, BlueJeansOnVideoRestApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AnalyticsEndpointDistributionDistribution', function() {
    it('should create an instance of AnalyticsEndpointDistributionDistribution', function() {
      // uncomment below and update the code to test AnalyticsEndpointDistributionDistribution
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be.a(BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution);
    });

    it('should have the property google (base name: "Google")', function() {
      // uncomment below and update the code to test the property google
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property telepresence (base name: "Telepresence")', function() {
      // uncomment below and update the code to test the property telepresence
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property lync (base name: "Lync")', function() {
      // uncomment below and update the code to test the property lync
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property iOS (base name: "iOS")', function() {
      // uncomment below and update the code to test the property iOS
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property h323 (base name: "H323")', function() {
      // uncomment below and update the code to test the property h323
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property interCall (base name: "InterCall")', function() {
      // uncomment below and update the code to test the property interCall
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property jabber (base name: "Jabber")', function() {
      // uncomment below and update the code to test the property jabber
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property android (base name: "Android")', function() {
      // uncomment below and update the code to test the property android
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property skype (base name: "Skype")', function() {
      // uncomment below and update the code to test the property skype
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property ISDN (base name: "ISDN")', function() {
      // uncomment below and update the code to test the property ISDN
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property PSTN (base name: "PSTN")', function() {
      // uncomment below and update the code to test the property PSTN
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property level3 (base name: "Level3")', function() {
      // uncomment below and update the code to test the property level3
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property SIP (base name: "SIP")', function() {
      // uncomment below and update the code to test the property SIP
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property blueJeansApp (base name: "BlueJeansApp")', function() {
      // uncomment below and update the code to test the property blueJeansApp
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property browser (base name: "Browser")', function() {
      // uncomment below and update the code to test the property browser
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

    it('should have the property webRTC (base name: "WebRTC")', function() {
      // uncomment below and update the code to test the property webRTC
      //var instane = new BlueJeansOnVideoRestApi.AnalyticsEndpointDistributionDistribution();
      //expect(instance).to.be();
    });

  });

}));
