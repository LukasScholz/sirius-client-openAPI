# coding: utf-8

"""
    Sirius Nightsky Middleware API

    Sirius Nightsky Middleware API  # noqa: E501

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class PySiriusCollisionEnergy(object):
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
        'max_energy': 'float',
        'min_energy': 'float'
    }

    attribute_map = {
        'max_energy': 'maxEnergy',
        'min_energy': 'minEnergy'
    }

    def __init__(self, max_energy=None, min_energy=None):  # noqa: E501
        """PySiriusCollisionEnergy - a model defined in Swagger"""  # noqa: E501
        self._max_energy = None
        self._min_energy = None
        self.discriminator = None
        if max_energy is not None:
            self.max_energy = max_energy
        if min_energy is not None:
            self.min_energy = min_energy

    @property
    def max_energy(self):
        """Gets the max_energy of this PySiriusCollisionEnergy.  # noqa: E501


        :return: The max_energy of this PySiriusCollisionEnergy.  # noqa: E501
        :rtype: float
        """
        return self._max_energy

    @max_energy.setter
    def max_energy(self, max_energy):
        """Sets the max_energy of this PySiriusCollisionEnergy.


        :param max_energy: The max_energy of this PySiriusCollisionEnergy.  # noqa: E501
        :type: float
        """

        self._max_energy = max_energy

    @property
    def min_energy(self):
        """Gets the min_energy of this PySiriusCollisionEnergy.  # noqa: E501


        :return: The min_energy of this PySiriusCollisionEnergy.  # noqa: E501
        :rtype: float
        """
        return self._min_energy

    @min_energy.setter
    def min_energy(self, min_energy):
        """Sets the min_energy of this PySiriusCollisionEnergy.


        :param min_energy: The min_energy of this PySiriusCollisionEnergy.  # noqa: E501
        :type: float
        """

        self._min_energy = min_energy

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
        if issubclass(PySiriusCollisionEnergy, dict):
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
        if not isinstance(other, PySiriusCollisionEnergy):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
