/* 
 * BlueJeans onVideo REST API
 *
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\"). ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace com.bluejeans.api.rest.onvideo.Model
{
    /// <summary>
    /// Application
    /// </summary>
    [DataContract]
    public partial class Application :  IEquatable<Application>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Application" /> class.
        /// </summary>
        /// <param name="Description">A summary of the client application..</param>
        /// <param name="AppName">The name of the client application..</param>
        /// <param name="AppLogoUrl">A URL of an image that will be displayed to users during authorization..</param>
        /// <param name="RedirectUrls">RedirectUrls.</param>
        /// <param name="UserId">The user ID of the owner of the client application..</param>
        public Application(string Description = default(string), string AppName = default(string), string AppLogoUrl = default(string), List<string> RedirectUrls = default(List<string>), string UserId = default(string))
        {
            this.Description = Description;
            this.AppName = AppName;
            this.AppLogoUrl = AppLogoUrl;
            this.RedirectUrls = RedirectUrls;
            this.UserId = UserId;
        }
        
        /// <summary>
        /// A summary of the client application.
        /// </summary>
        /// <value>A summary of the client application.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }
        /// <summary>
        /// The name of the client application.
        /// </summary>
        /// <value>The name of the client application.</value>
        [DataMember(Name="appName", EmitDefaultValue=false)]
        public string AppName { get; set; }
        /// <summary>
        /// A URL of an image that will be displayed to users during authorization.
        /// </summary>
        /// <value>A URL of an image that will be displayed to users during authorization.</value>
        [DataMember(Name="appLogoUrl", EmitDefaultValue=false)]
        public string AppLogoUrl { get; set; }
        /// <summary>
        /// Gets or Sets RedirectUrls
        /// </summary>
        [DataMember(Name="redirectUrls", EmitDefaultValue=false)]
        public List<string> RedirectUrls { get; set; }
        /// <summary>
        /// The user ID of the owner of the client application.
        /// </summary>
        /// <value>The user ID of the owner of the client application.</value>
        [DataMember(Name="userId", EmitDefaultValue=false)]
        public string UserId { get; set; }
        /// <summary>
        /// The client ID will be generated on creation of the application. Normally, a 32 character hexidecimal numeric string.
        /// </summary>
        /// <value>The client ID will be generated on creation of the application. Normally, a 32 character hexidecimal numeric string.</value>
        [DataMember(Name="clientId", EmitDefaultValue=false)]
        public string ClientId { get; private set; }
        /// <summary>
        /// The client secret will be generated on creation of the application. Retain this value as it will only be revealed one time. If lost, you will need to regenerate.
        /// </summary>
        /// <value>The client secret will be generated on creation of the application. Retain this value as it will only be revealed one time. If lost, you will need to regenerate.</value>
        [DataMember(Name="clientSecret", EmitDefaultValue=false)]
        public string ClientSecret { get; private set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Application {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  AppName: ").Append(AppName).Append("\n");
            sb.Append("  AppLogoUrl: ").Append(AppLogoUrl).Append("\n");
            sb.Append("  RedirectUrls: ").Append(RedirectUrls).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientSecret: ").Append(ClientSecret).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as Application);
        }

        /// <summary>
        /// Returns true if Application instances are equal
        /// </summary>
        /// <param name="other">Instance of Application to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Application other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Description == other.Description ||
                    this.Description != null &&
                    this.Description.Equals(other.Description)
                ) && 
                (
                    this.AppName == other.AppName ||
                    this.AppName != null &&
                    this.AppName.Equals(other.AppName)
                ) && 
                (
                    this.AppLogoUrl == other.AppLogoUrl ||
                    this.AppLogoUrl != null &&
                    this.AppLogoUrl.Equals(other.AppLogoUrl)
                ) && 
                (
                    this.RedirectUrls == other.RedirectUrls ||
                    this.RedirectUrls != null &&
                    this.RedirectUrls.SequenceEqual(other.RedirectUrls)
                ) && 
                (
                    this.UserId == other.UserId ||
                    this.UserId != null &&
                    this.UserId.Equals(other.UserId)
                ) && 
                (
                    this.ClientId == other.ClientId ||
                    this.ClientId != null &&
                    this.ClientId.Equals(other.ClientId)
                ) && 
                (
                    this.ClientSecret == other.ClientSecret ||
                    this.ClientSecret != null &&
                    this.ClientSecret.Equals(other.ClientSecret)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.Description != null)
                    hash = hash * 59 + this.Description.GetHashCode();
                if (this.AppName != null)
                    hash = hash * 59 + this.AppName.GetHashCode();
                if (this.AppLogoUrl != null)
                    hash = hash * 59 + this.AppLogoUrl.GetHashCode();
                if (this.RedirectUrls != null)
                    hash = hash * 59 + this.RedirectUrls.GetHashCode();
                if (this.UserId != null)
                    hash = hash * 59 + this.UserId.GetHashCode();
                if (this.ClientId != null)
                    hash = hash * 59 + this.ClientId.GetHashCode();
                if (this.ClientSecret != null)
                    hash = hash * 59 + this.ClientSecret.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
