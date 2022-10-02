# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class AccountCredentials(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'username': 'str',
        'password': 'str',
        'refresh_token': 'str'
    }

    attribute_map = {
        'username': 'username',
        'password': 'password',
        'refresh_token': 'refreshToken'
    }

    def __init__(self, username=None, password=None, refresh_token=None):  # noqa: E501
        """AccountCredentials - a model defined in Swagger"""  # noqa: E501
        self._username = None
        self._password = None
        self._refresh_token = None
        self.discriminator = None
        if username is not None:
            self.username = username
        if password is not None:
            self.password = password
        if refresh_token is not None:
            self.refresh_token = refresh_token

    @property
    def username(self):
        """Gets the username of this AccountCredentials.  # noqa: E501


        :return: The username of this AccountCredentials.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this AccountCredentials.


        :param username: The username of this AccountCredentials.  # noqa: E501
        :type: str
        """

        self._username = username

    @property
    def password(self):
        """Gets the password of this AccountCredentials.  # noqa: E501


        :return: The password of this AccountCredentials.  # noqa: E501
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this AccountCredentials.


        :param password: The password of this AccountCredentials.  # noqa: E501
        :type: str
        """

        self._password = password

    @property
    def refresh_token(self):
        """Gets the refresh_token of this AccountCredentials.  # noqa: E501


        :return: The refresh_token of this AccountCredentials.  # noqa: E501
        :rtype: str
        """
        return self._refresh_token

    @refresh_token.setter
    def refresh_token(self, refresh_token):
        """Sets the refresh_token of this AccountCredentials.


        :param refresh_token: The refresh_token of this AccountCredentials.  # noqa: E501
        :type: str
        """

        self._refresh_token = refresh_token

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
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
        if issubclass(AccountCredentials, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, AccountCredentials):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
