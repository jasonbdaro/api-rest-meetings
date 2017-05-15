/*
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\"). ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bluejeans.api.rest.onvideo.model;

import java.util.Objects;
import com.bluejeans.api.rest.onvideo.model.ContentContentProperties;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Content
 */

public class Content {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("contentDescription")
  private String contentDescription = null;

  @SerializedName("contentUrl")
  private String contentUrl = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("contentLocation")
  private String contentLocation = null;

  @SerializedName("created")
  private Integer created = null;

  @SerializedName("modified")
  private Integer modified = null;

  @SerializedName("contentStatus")
  private String contentStatus = null;

  @SerializedName("contentName")
  private String contentName = null;

  @SerializedName("contentCategory")
  private String contentCategory = null;

  @SerializedName("contentSize")
  private Integer contentSize = null;

  @SerializedName("contentDuration")
  private Integer contentDuration = null;

  @SerializedName("contentProperties")
  private ContentContentProperties contentProperties = null;

  public Content id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Content contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Content contentDescription(String contentDescription) {
    this.contentDescription = contentDescription;
    return this;
  }

   /**
   * Get contentDescription
   * @return contentDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentDescription() {
    return contentDescription;
  }

  public void setContentDescription(String contentDescription) {
    this.contentDescription = contentDescription;
  }

  public Content contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

   /**
   * Get contentUrl
   * @return contentUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public Content userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Content contentLocation(String contentLocation) {
    this.contentLocation = contentLocation;
    return this;
  }

   /**
   * Get contentLocation
   * @return contentLocation
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentLocation() {
    return contentLocation;
  }

  public void setContentLocation(String contentLocation) {
    this.contentLocation = contentLocation;
  }

  public Content created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public Content modified(Integer modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getModified() {
    return modified;
  }

  public void setModified(Integer modified) {
    this.modified = modified;
  }

  public Content contentStatus(String contentStatus) {
    this.contentStatus = contentStatus;
    return this;
  }

   /**
   * Get contentStatus
   * @return contentStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentStatus() {
    return contentStatus;
  }

  public void setContentStatus(String contentStatus) {
    this.contentStatus = contentStatus;
  }

  public Content contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Content contentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
    return this;
  }

   /**
   * Get contentCategory
   * @return contentCategory
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentCategory() {
    return contentCategory;
  }

  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
  }

  public Content contentSize(Integer contentSize) {
    this.contentSize = contentSize;
    return this;
  }

   /**
   * Get contentSize
   * @return contentSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getContentSize() {
    return contentSize;
  }

  public void setContentSize(Integer contentSize) {
    this.contentSize = contentSize;
  }

  public Content contentDuration(Integer contentDuration) {
    this.contentDuration = contentDuration;
    return this;
  }

   /**
   * Get contentDuration
   * @return contentDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getContentDuration() {
    return contentDuration;
  }

  public void setContentDuration(Integer contentDuration) {
    this.contentDuration = contentDuration;
  }

  public Content contentProperties(ContentContentProperties contentProperties) {
    this.contentProperties = contentProperties;
    return this;
  }

   /**
   * Get contentProperties
   * @return contentProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContentContentProperties getContentProperties() {
    return contentProperties;
  }

  public void setContentProperties(ContentContentProperties contentProperties) {
    this.contentProperties = contentProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Content content = (Content) o;
    return Objects.equals(this.id, content.id) &&
        Objects.equals(this.contentType, content.contentType) &&
        Objects.equals(this.contentDescription, content.contentDescription) &&
        Objects.equals(this.contentUrl, content.contentUrl) &&
        Objects.equals(this.userId, content.userId) &&
        Objects.equals(this.contentLocation, content.contentLocation) &&
        Objects.equals(this.created, content.created) &&
        Objects.equals(this.modified, content.modified) &&
        Objects.equals(this.contentStatus, content.contentStatus) &&
        Objects.equals(this.contentName, content.contentName) &&
        Objects.equals(this.contentCategory, content.contentCategory) &&
        Objects.equals(this.contentSize, content.contentSize) &&
        Objects.equals(this.contentDuration, content.contentDuration) &&
        Objects.equals(this.contentProperties, content.contentProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contentType, contentDescription, contentUrl, userId, contentLocation, created, modified, contentStatus, contentName, contentCategory, contentSize, contentDuration, contentProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentDescription: ").append(toIndentedString(contentDescription)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    contentLocation: ").append(toIndentedString(contentLocation)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    contentStatus: ").append(toIndentedString(contentStatus)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentCategory: ").append(toIndentedString(contentCategory)).append("\n");
    sb.append("    contentSize: ").append(toIndentedString(contentSize)).append("\n");
    sb.append("    contentDuration: ").append(toIndentedString(contentDuration)).append("\n");
    sb.append("    contentProperties: ").append(toIndentedString(contentProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

