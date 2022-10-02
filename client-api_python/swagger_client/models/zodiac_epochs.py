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

class ZodiacEpochs(object):
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
        'iterations': 'int',
        'burn_in_period': 'int',
        'number_of_markov_chains': 'int',
        'identifier': 'str'
    }

    attribute_map = {
        'iterations': 'iterations',
        'burn_in_period': 'burnInPeriod',
        'number_of_markov_chains': 'numberOfMarkovChains',
        'identifier': 'identifier'
    }

    def __init__(self, iterations=None, burn_in_period=None, number_of_markov_chains=None, identifier=None):  # noqa: E501
        """ZodiacEpochs - a model defined in Swagger"""  # noqa: E501
        self._iterations = None
        self._burn_in_period = None
        self._number_of_markov_chains = None
        self._identifier = None
        self.discriminator = None
        if iterations is not None:
            self.iterations = iterations
        if burn_in_period is not None:
            self.burn_in_period = burn_in_period
        if number_of_markov_chains is not None:
            self.number_of_markov_chains = number_of_markov_chains
        if identifier is not None:
            self.identifier = identifier

    @property
    def iterations(self):
        """Gets the iterations of this ZodiacEpochs.  # noqa: E501


        :return: The iterations of this ZodiacEpochs.  # noqa: E501
        :rtype: int
        """
        return self._iterations

    @iterations.setter
    def iterations(self, iterations):
        """Sets the iterations of this ZodiacEpochs.


        :param iterations: The iterations of this ZodiacEpochs.  # noqa: E501
        :type: int
        """

        self._iterations = iterations

    @property
    def burn_in_period(self):
        """Gets the burn_in_period of this ZodiacEpochs.  # noqa: E501


        :return: The burn_in_period of this ZodiacEpochs.  # noqa: E501
        :rtype: int
        """
        return self._burn_in_period

    @burn_in_period.setter
    def burn_in_period(self, burn_in_period):
        """Sets the burn_in_period of this ZodiacEpochs.


        :param burn_in_period: The burn_in_period of this ZodiacEpochs.  # noqa: E501
        :type: int
        """

        self._burn_in_period = burn_in_period

    @property
    def number_of_markov_chains(self):
        """Gets the number_of_markov_chains of this ZodiacEpochs.  # noqa: E501


        :return: The number_of_markov_chains of this ZodiacEpochs.  # noqa: E501
        :rtype: int
        """
        return self._number_of_markov_chains

    @number_of_markov_chains.setter
    def number_of_markov_chains(self, number_of_markov_chains):
        """Sets the number_of_markov_chains of this ZodiacEpochs.


        :param number_of_markov_chains: The number_of_markov_chains of this ZodiacEpochs.  # noqa: E501
        :type: int
        """

        self._number_of_markov_chains = number_of_markov_chains

    @property
    def identifier(self):
        """Gets the identifier of this ZodiacEpochs.  # noqa: E501


        :return: The identifier of this ZodiacEpochs.  # noqa: E501
        :rtype: str
        """
        return self._identifier

    @identifier.setter
    def identifier(self, identifier):
        """Sets the identifier of this ZodiacEpochs.


        :param identifier: The identifier of this ZodiacEpochs.  # noqa: E501
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
        if issubclass(ZodiacEpochs, dict):
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
        if not isinstance(other, ZodiacEpochs):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
