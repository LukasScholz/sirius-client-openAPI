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

class LossEdge(object):
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
        'source_fragment': 'FragmentNode',
        'target_fragment': 'FragmentNode',
        'molecular_formula': 'str',
        'score': 'float'
    }

    attribute_map = {
        'source_fragment': 'sourceFragment',
        'target_fragment': 'targetFragment',
        'molecular_formula': 'molecularFormula',
        'score': 'score'
    }

    def __init__(self, source_fragment=None, target_fragment=None, molecular_formula=None, score=None):  # noqa: E501
        """LossEdge - a model defined in Swagger"""  # noqa: E501
        self._source_fragment = None
        self._target_fragment = None
        self._molecular_formula = None
        self._score = None
        self.discriminator = None
        if source_fragment is not None:
            self.source_fragment = source_fragment
        if target_fragment is not None:
            self.target_fragment = target_fragment
        if molecular_formula is not None:
            self.molecular_formula = molecular_formula
        if score is not None:
            self.score = score

    @property
    def source_fragment(self):
        """Gets the source_fragment of this LossEdge.  # noqa: E501


        :return: The source_fragment of this LossEdge.  # noqa: E501
        :rtype: FragmentNode
        """
        return self._source_fragment

    @source_fragment.setter
    def source_fragment(self, source_fragment):
        """Sets the source_fragment of this LossEdge.


        :param source_fragment: The source_fragment of this LossEdge.  # noqa: E501
        :type: FragmentNode
        """

        self._source_fragment = source_fragment

    @property
    def target_fragment(self):
        """Gets the target_fragment of this LossEdge.  # noqa: E501


        :return: The target_fragment of this LossEdge.  # noqa: E501
        :rtype: FragmentNode
        """
        return self._target_fragment

    @target_fragment.setter
    def target_fragment(self, target_fragment):
        """Sets the target_fragment of this LossEdge.


        :param target_fragment: The target_fragment of this LossEdge.  # noqa: E501
        :type: FragmentNode
        """

        self._target_fragment = target_fragment

    @property
    def molecular_formula(self):
        """Gets the molecular_formula of this LossEdge.  # noqa: E501


        :return: The molecular_formula of this LossEdge.  # noqa: E501
        :rtype: str
        """
        return self._molecular_formula

    @molecular_formula.setter
    def molecular_formula(self, molecular_formula):
        """Sets the molecular_formula of this LossEdge.


        :param molecular_formula: The molecular_formula of this LossEdge.  # noqa: E501
        :type: str
        """

        self._molecular_formula = molecular_formula

    @property
    def score(self):
        """Gets the score of this LossEdge.  # noqa: E501


        :return: The score of this LossEdge.  # noqa: E501
        :rtype: float
        """
        return self._score

    @score.setter
    def score(self, score):
        """Sets the score of this LossEdge.


        :param score: The score of this LossEdge.  # noqa: E501
        :type: float
        """

        self._score = score

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
        if issubclass(LossEdge, dict):
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
        if not isinstance(other, LossEdge):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
