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


package com.bluejeans.api.rest.onvideo.api;

import com.bluejeans.api.rest.onvideo.ApiException;
import com.bluejeans.api.rest.onvideo.model.EnterpriseUserList;
import com.bluejeans.api.rest.onvideo.model.Error;
import com.bluejeans.api.rest.onvideo.model.User;
import com.bluejeans.api.rest.onvideo.model.UserId;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnterpriseApi
 */
@Ignore
public class EnterpriseApiTest {

    private final EnterpriseApi api = new EnterpriseApi();

    
    /**
     * Create Enterprise User
     *
     * This endpoint allows adding a user to an existing enterprise. Requires enterprise admin access level.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        Integer enterpriseId = null;
        User user = null;
        Boolean forcePasswordChange = null;
        Boolean sendVerificationMail = null;
        UserId response = api.createUser(enterpriseId, user, forcePasswordChange, sendVerificationMail);

        // TODO: test validations
    }
    
    /**
     * List Enterprise Users
     *
     * This endpoint allows listing the users that are associated with an enterprise account. Requires enterprise admin access level.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUsersTest() throws ApiException {
        Integer enterpriseId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String emailId = null;
        EnterpriseUserList response = api.listUsers(enterpriseId, pageSize, pageNumber, emailId);

        // TODO: test validations
    }
    
    /**
     * Remove Enterprise User
     *
     * This endpoint allows removing a user from an enterprise; it does not delete the user. Requires enterprise admin access level.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserTest() throws ApiException {
        Integer enterpriseId = null;
        Integer userId = null;
        api.removeUser(enterpriseId, userId);

        // TODO: test validations
    }
    
}
