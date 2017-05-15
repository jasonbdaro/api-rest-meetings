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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecordingSummary
 */

public class RecordingSummary {
  @SerializedName("recordingEntityId")
  private Integer recordingEntityId = null;

  @SerializedName("recordingName")
  private String recordingName = null;

  @SerializedName("meetingGuid")
  private String meetingGuid = null;

  @SerializedName("chapterCount")
  private Integer chapterCount = null;

  @SerializedName("totalSize")
  private Integer totalSize = null;

  @SerializedName("totalDuration")
  private Integer totalDuration = null;

  @SerializedName("lastRecordingDate")
  private String lastRecordingDate = null;

  @SerializedName("aggregatedStatus")
  private String aggregatedStatus = null;

  @SerializedName("recordingThumbnail")
  private String recordingThumbnail = null;

  @SerializedName("created")
  private Integer created = null;

  @SerializedName("isPremiumRecording")
  private Boolean isPremiumRecording = null;

  @SerializedName("showPremiumRecordingTag")
  private Boolean showPremiumRecordingTag = null;

  public RecordingSummary recordingEntityId(Integer recordingEntityId) {
    this.recordingEntityId = recordingEntityId;
    return this;
  }

   /**
   * Get recordingEntityId
   * @return recordingEntityId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRecordingEntityId() {
    return recordingEntityId;
  }

  public void setRecordingEntityId(Integer recordingEntityId) {
    this.recordingEntityId = recordingEntityId;
  }

  public RecordingSummary recordingName(String recordingName) {
    this.recordingName = recordingName;
    return this;
  }

   /**
   * Get recordingName
   * @return recordingName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecordingName() {
    return recordingName;
  }

  public void setRecordingName(String recordingName) {
    this.recordingName = recordingName;
  }

  public RecordingSummary meetingGuid(String meetingGuid) {
    this.meetingGuid = meetingGuid;
    return this;
  }

   /**
   * Get meetingGuid
   * @return meetingGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingGuid() {
    return meetingGuid;
  }

  public void setMeetingGuid(String meetingGuid) {
    this.meetingGuid = meetingGuid;
  }

  public RecordingSummary chapterCount(Integer chapterCount) {
    this.chapterCount = chapterCount;
    return this;
  }

   /**
   * Get chapterCount
   * @return chapterCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getChapterCount() {
    return chapterCount;
  }

  public void setChapterCount(Integer chapterCount) {
    this.chapterCount = chapterCount;
  }

  public RecordingSummary totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

   /**
   * Get totalSize
   * @return totalSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }

  public RecordingSummary totalDuration(Integer totalDuration) {
    this.totalDuration = totalDuration;
    return this;
  }

   /**
   * Get totalDuration
   * @return totalDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalDuration() {
    return totalDuration;
  }

  public void setTotalDuration(Integer totalDuration) {
    this.totalDuration = totalDuration;
  }

  public RecordingSummary lastRecordingDate(String lastRecordingDate) {
    this.lastRecordingDate = lastRecordingDate;
    return this;
  }

   /**
   * Get lastRecordingDate
   * @return lastRecordingDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastRecordingDate() {
    return lastRecordingDate;
  }

  public void setLastRecordingDate(String lastRecordingDate) {
    this.lastRecordingDate = lastRecordingDate;
  }

  public RecordingSummary aggregatedStatus(String aggregatedStatus) {
    this.aggregatedStatus = aggregatedStatus;
    return this;
  }

   /**
   * Get aggregatedStatus
   * @return aggregatedStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAggregatedStatus() {
    return aggregatedStatus;
  }

  public void setAggregatedStatus(String aggregatedStatus) {
    this.aggregatedStatus = aggregatedStatus;
  }

  public RecordingSummary recordingThumbnail(String recordingThumbnail) {
    this.recordingThumbnail = recordingThumbnail;
    return this;
  }

   /**
   * Get recordingThumbnail
   * @return recordingThumbnail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecordingThumbnail() {
    return recordingThumbnail;
  }

  public void setRecordingThumbnail(String recordingThumbnail) {
    this.recordingThumbnail = recordingThumbnail;
  }

  public RecordingSummary created(Integer created) {
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

  public RecordingSummary isPremiumRecording(Boolean isPremiumRecording) {
    this.isPremiumRecording = isPremiumRecording;
    return this;
  }

   /**
   * Get isPremiumRecording
   * @return isPremiumRecording
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsPremiumRecording() {
    return isPremiumRecording;
  }

  public void setIsPremiumRecording(Boolean isPremiumRecording) {
    this.isPremiumRecording = isPremiumRecording;
  }

  public RecordingSummary showPremiumRecordingTag(Boolean showPremiumRecordingTag) {
    this.showPremiumRecordingTag = showPremiumRecordingTag;
    return this;
  }

   /**
   * Get showPremiumRecordingTag
   * @return showPremiumRecordingTag
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getShowPremiumRecordingTag() {
    return showPremiumRecordingTag;
  }

  public void setShowPremiumRecordingTag(Boolean showPremiumRecordingTag) {
    this.showPremiumRecordingTag = showPremiumRecordingTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingSummary recordingSummary = (RecordingSummary) o;
    return Objects.equals(this.recordingEntityId, recordingSummary.recordingEntityId) &&
        Objects.equals(this.recordingName, recordingSummary.recordingName) &&
        Objects.equals(this.meetingGuid, recordingSummary.meetingGuid) &&
        Objects.equals(this.chapterCount, recordingSummary.chapterCount) &&
        Objects.equals(this.totalSize, recordingSummary.totalSize) &&
        Objects.equals(this.totalDuration, recordingSummary.totalDuration) &&
        Objects.equals(this.lastRecordingDate, recordingSummary.lastRecordingDate) &&
        Objects.equals(this.aggregatedStatus, recordingSummary.aggregatedStatus) &&
        Objects.equals(this.recordingThumbnail, recordingSummary.recordingThumbnail) &&
        Objects.equals(this.created, recordingSummary.created) &&
        Objects.equals(this.isPremiumRecording, recordingSummary.isPremiumRecording) &&
        Objects.equals(this.showPremiumRecordingTag, recordingSummary.showPremiumRecordingTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingEntityId, recordingName, meetingGuid, chapterCount, totalSize, totalDuration, lastRecordingDate, aggregatedStatus, recordingThumbnail, created, isPremiumRecording, showPremiumRecordingTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingSummary {\n");
    
    sb.append("    recordingEntityId: ").append(toIndentedString(recordingEntityId)).append("\n");
    sb.append("    recordingName: ").append(toIndentedString(recordingName)).append("\n");
    sb.append("    meetingGuid: ").append(toIndentedString(meetingGuid)).append("\n");
    sb.append("    chapterCount: ").append(toIndentedString(chapterCount)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
    sb.append("    lastRecordingDate: ").append(toIndentedString(lastRecordingDate)).append("\n");
    sb.append("    aggregatedStatus: ").append(toIndentedString(aggregatedStatus)).append("\n");
    sb.append("    recordingThumbnail: ").append(toIndentedString(recordingThumbnail)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    isPremiumRecording: ").append(toIndentedString(isPremiumRecording)).append("\n");
    sb.append("    showPremiumRecordingTag: ").append(toIndentedString(showPremiumRecordingTag)).append("\n");
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

