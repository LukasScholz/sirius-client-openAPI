# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class Timeout(object):
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
        'number_of_seconds_per_decomposition': 'int',
        'number_of_seconds_per_instance': 'int',
        'identifier': 'str'
    }

    attribute_map = {
        'number_of_seconds_per_decomposition': 'numberOfSecondsPerDecomposition',
        'number_of_seconds_per_instance': 'numberOfSecondsPerInstance',
        'identifier': 'identifier'
    }

    def __init__(self, number_of_seconds_per_decomposition=None, number_of_seconds_per_instance=None, identifier=None):  # noqa: E501
        """Timeout - a model defined in Swagger"""  # noqa: E501
        self._number_of_seconds_per_decomposition = None
        self._number_of_seconds_per_instance = None
        self._identifier = None
        self.discriminator = None
        if number_of_seconds_per_decomposition is not None:
            self.number_of_seconds_per_decomposition = number_of_seconds_per_decomposition
        if number_of_seconds_per_instance is not None:
            self.number_of_seconds_per_instance = number_of_seconds_per_instance
        if identifier is not None:
            self.identifier = identifier

    @property
    def number_of_seconds_per_decomposition(self):
        """Gets the number_of_seconds_per_decomposition of this Timeout.  # noqa: E501


        :return: The number_of_seconds_per_decomposition of this Timeout.  # noqa: E501
        :rtype: int
        """
        return self._number_of_seconds_per_decomposition

    @number_of_seconds_per_decomposition.setter
    def number_of_seconds_per_decomposition(self, number_of_seconds_per_decomposition):
        """Sets the number_of_seconds_per_decomposition of this Timeout.


        :param number_of_seconds_per_decomposition: The number_of_seconds_per_decomposition of this Timeout.  # noqa: E501
        :type: int
        """

        self._number_of_seconds_per_decomposition = number_of_seconds_per_decomposition

    @property
    def number_of_seconds_per_instance(self):
        """Gets the number_of_seconds_per_instance of this Timeout.  # noqa: E501


        :return: The number_of_seconds_per_instance of this Timeout.  # noqa: E501
        :rtype: int
        """
        return self._number_of_seconds_per_instance

    @number_of_seconds_per_instance.setter
    def number_of_seconds_per_instance(self, number_of_seconds_per_instance):
        """Sets the number_of_seconds_per_instance of this Timeout.


        :param number_of_seconds_per_instance: The number_of_seconds_per_instance of this Timeout.  # noqa: E501
        :type: int
        """

        self._number_of_seconds_per_instance = number_of_seconds_per_instance

    @property
    def identifier(self):
        """Gets the identifier of this Timeout.  # noqa: E501


        :return: The identifier of this Timeout.  # noqa: E501
        :rtype: str
        """
        return self._identifier

    @identifier.setter
    def identifier(self, identifier):
        """Sets the identifier of this Timeout.


        :param identifier: The identifier of this Timeout.  # noqa: E501
        :type: str
        """

        self._identifier = identifier

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
        if issubclass(Timeout, dict):
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
        if not isinstance(other, Timeout):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
