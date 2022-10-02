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

class CompoundClass(object):
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
        'type': 'str',
        'name': 'str',
        'description': 'str',
        'id': 'int',
        'probability': 'float'
    }

    attribute_map = {
        'type': 'type',
        'name': 'name',
        'description': 'description',
        'id': 'id',
        'probability': 'probability'
    }

    def __init__(self, type=None, name=None, description=None, id=None, probability=None):  # noqa: E501
        """CompoundClass - a model defined in Swagger"""  # noqa: E501
        self._type = None
        self._name = None
        self._description = None
        self._id = None
        self._probability = None
        self.discriminator = None
        if type is not None:
            self.type = type
        if name is not None:
            self.name = name
        if description is not None:
            self.description = description
        if id is not None:
            self.id = id
        if probability is not None:
            self.probability = probability

    @property
    def type(self):
        """Gets the type of this CompoundClass.  # noqa: E501

        Specifies the classification ontology the CompoundClass belongs to.  # noqa: E501

        :return: The type of this CompoundClass.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this CompoundClass.

        Specifies the classification ontology the CompoundClass belongs to.  # noqa: E501

        :param type: The type of this CompoundClass.  # noqa: E501
        :type: str
        """
        allowed_values = ["ClassyFire", "NPC"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"  # noqa: E501
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def name(self):
        """Gets the name of this CompoundClass.  # noqa: E501

        Name of the compound class.  # noqa: E501

        :return: The name of this CompoundClass.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this CompoundClass.

        Name of the compound class.  # noqa: E501

        :param name: The name of this CompoundClass.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def description(self):
        """Gets the description of this CompoundClass.  # noqa: E501

        Description of the compound class.  # noqa: E501

        :return: The description of this CompoundClass.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this CompoundClass.

        Description of the compound class.  # noqa: E501

        :param description: The description of this CompoundClass.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def id(self):
        """Gets the id of this CompoundClass.  # noqa: E501

        Unique id of the class. Might be undefined for certain classification ontologies.  # noqa: E501

        :return: The id of this CompoundClass.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CompoundClass.

        Unique id of the class. Might be undefined for certain classification ontologies.  # noqa: E501

        :param id: The id of this CompoundClass.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def probability(self):
        """Gets the probability of this CompoundClass.  # noqa: E501

        prediction probability  # noqa: E501

        :return: The probability of this CompoundClass.  # noqa: E501
        :rtype: float
        """
        return self._probability

    @probability.setter
    def probability(self, probability):
        """Sets the probability of this CompoundClass.

        prediction probability  # noqa: E501

        :param probability: The probability of this CompoundClass.  # noqa: E501
        :type: float
        """

        self._probability = probability

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
        if issubclass(CompoundClass, dict):
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
        if not isinstance(other, CompoundClass):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
