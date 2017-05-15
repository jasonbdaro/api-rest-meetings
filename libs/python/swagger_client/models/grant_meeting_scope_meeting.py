# coding: utf-8

"""
    BlueJeans onVideo REST API

    _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\"). ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 

    OpenAPI spec version: 1.0.0
    Contact: brandon@bluejeans.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class GrantMeetingScopeMeeting(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id=None, leader_id=None, meeting_numeric_id=None, meeting_uri=None, is_moderator=None, endpoint_uri_set=None, meeting_id=None):
        """
        GrantMeetingScopeMeeting - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'int',
            'leader_id': 'int',
            'meeting_numeric_id': 'str',
            'meeting_uri': 'str',
            'is_moderator': 'bool',
            'endpoint_uri_set': 'list[object]',
            'meeting_id': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'leader_id': 'leaderId',
            'meeting_numeric_id': 'meetingNumericId',
            'meeting_uri': 'meetingUri',
            'is_moderator': 'isModerator',
            'endpoint_uri_set': 'endpointUriSet',
            'meeting_id': 'meetingId'
        }

        self._id = id
        self._leader_id = leader_id
        self._meeting_numeric_id = meeting_numeric_id
        self._meeting_uri = meeting_uri
        self._is_moderator = is_moderator
        self._endpoint_uri_set = endpoint_uri_set
        self._meeting_id = meeting_id

    @property
    def id(self):
        """
        Gets the id of this GrantMeetingScopeMeeting.

        :return: The id of this GrantMeetingScopeMeeting.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this GrantMeetingScopeMeeting.

        :param id: The id of this GrantMeetingScopeMeeting.
        :type: int
        """

        self._id = id

    @property
    def leader_id(self):
        """
        Gets the leader_id of this GrantMeetingScopeMeeting.

        :return: The leader_id of this GrantMeetingScopeMeeting.
        :rtype: int
        """
        return self._leader_id

    @leader_id.setter
    def leader_id(self, leader_id):
        """
        Sets the leader_id of this GrantMeetingScopeMeeting.

        :param leader_id: The leader_id of this GrantMeetingScopeMeeting.
        :type: int
        """

        self._leader_id = leader_id

    @property
    def meeting_numeric_id(self):
        """
        Gets the meeting_numeric_id of this GrantMeetingScopeMeeting.

        :return: The meeting_numeric_id of this GrantMeetingScopeMeeting.
        :rtype: str
        """
        return self._meeting_numeric_id

    @meeting_numeric_id.setter
    def meeting_numeric_id(self, meeting_numeric_id):
        """
        Sets the meeting_numeric_id of this GrantMeetingScopeMeeting.

        :param meeting_numeric_id: The meeting_numeric_id of this GrantMeetingScopeMeeting.
        :type: str
        """

        self._meeting_numeric_id = meeting_numeric_id

    @property
    def meeting_uri(self):
        """
        Gets the meeting_uri of this GrantMeetingScopeMeeting.

        :return: The meeting_uri of this GrantMeetingScopeMeeting.
        :rtype: str
        """
        return self._meeting_uri

    @meeting_uri.setter
    def meeting_uri(self, meeting_uri):
        """
        Sets the meeting_uri of this GrantMeetingScopeMeeting.

        :param meeting_uri: The meeting_uri of this GrantMeetingScopeMeeting.
        :type: str
        """

        self._meeting_uri = meeting_uri

    @property
    def is_moderator(self):
        """
        Gets the is_moderator of this GrantMeetingScopeMeeting.

        :return: The is_moderator of this GrantMeetingScopeMeeting.
        :rtype: bool
        """
        return self._is_moderator

    @is_moderator.setter
    def is_moderator(self, is_moderator):
        """
        Sets the is_moderator of this GrantMeetingScopeMeeting.

        :param is_moderator: The is_moderator of this GrantMeetingScopeMeeting.
        :type: bool
        """

        self._is_moderator = is_moderator

    @property
    def endpoint_uri_set(self):
        """
        Gets the endpoint_uri_set of this GrantMeetingScopeMeeting.

        :return: The endpoint_uri_set of this GrantMeetingScopeMeeting.
        :rtype: list[object]
        """
        return self._endpoint_uri_set

    @endpoint_uri_set.setter
    def endpoint_uri_set(self, endpoint_uri_set):
        """
        Sets the endpoint_uri_set of this GrantMeetingScopeMeeting.

        :param endpoint_uri_set: The endpoint_uri_set of this GrantMeetingScopeMeeting.
        :type: list[object]
        """

        self._endpoint_uri_set = endpoint_uri_set

    @property
    def meeting_id(self):
        """
        Gets the meeting_id of this GrantMeetingScopeMeeting.

        :return: The meeting_id of this GrantMeetingScopeMeeting.
        :rtype: str
        """
        return self._meeting_id

    @meeting_id.setter
    def meeting_id(self, meeting_id):
        """
        Sets the meeting_id of this GrantMeetingScopeMeeting.

        :param meeting_id: The meeting_id of this GrantMeetingScopeMeeting.
        :type: str
        """

        self._meeting_id = meeting_id

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, GrantMeetingScopeMeeting):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
