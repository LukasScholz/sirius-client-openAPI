# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.1
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class CompoundId(object):
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
        'id': 'str',
        'name': 'str',
        'index': 'int',
        'ion_mass': 'float',
        'ion_type': 'str',
        'rt_start_seconds': 'float',
        'rt_end_seconds': 'float',
        'top_annotation': 'CompoundAnnotation',
        'ms_data': 'MsData',
        'computing': 'bool'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'index': 'index',
        'ion_mass': 'ionMass',
        'ion_type': 'ionType',
        'rt_start_seconds': 'rtStartSeconds',
        'rt_end_seconds': 'rtEndSeconds',
        'top_annotation': 'topAnnotation',
        'ms_data': 'msData',
        'computing': 'computing'
    }

    def __init__(self, id=None, name=None, index=None, ion_mass=None, ion_type=None, rt_start_seconds=None, rt_end_seconds=None, top_annotation=None, ms_data=None, computing=None):  # noqa: E501
        """CompoundId - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._name = None
        self._index = None
        self._ion_mass = None
        self._ion_type = None
        self._rt_start_seconds = None
        self._rt_end_seconds = None
        self._top_annotation = None
        self._ms_data = None
        self._computing = None
        self.discriminator = None
        if id is not None:
            self.id = id
        if name is not None:
            self.name = name
        if index is not None:
            self.index = index
        if ion_mass is not None:
            self.ion_mass = ion_mass
        if ion_type is not None:
            self.ion_type = ion_type
        if rt_start_seconds is not None:
            self.rt_start_seconds = rt_start_seconds
        if rt_end_seconds is not None:
            self.rt_end_seconds = rt_end_seconds
        if top_annotation is not None:
            self.top_annotation = top_annotation
        if ms_data is not None:
            self.ms_data = ms_data
        if computing is not None:
            self.computing = computing

    @property
    def id(self):
        """Gets the id of this CompoundId.  # noqa: E501


        :return: The id of this CompoundId.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CompoundId.


        :param id: The id of this CompoundId.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this CompoundId.  # noqa: E501


        :return: The name of this CompoundId.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this CompoundId.


        :param name: The name of this CompoundId.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def index(self):
        """Gets the index of this CompoundId.  # noqa: E501


        :return: The index of this CompoundId.  # noqa: E501
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index):
        """Sets the index of this CompoundId.


        :param index: The index of this CompoundId.  # noqa: E501
        :type: int
        """

        self._index = index

    @property
    def ion_mass(self):
        """Gets the ion_mass of this CompoundId.  # noqa: E501


        :return: The ion_mass of this CompoundId.  # noqa: E501
        :rtype: float
        """
        return self._ion_mass

    @ion_mass.setter
    def ion_mass(self, ion_mass):
        """Sets the ion_mass of this CompoundId.


        :param ion_mass: The ion_mass of this CompoundId.  # noqa: E501
        :type: float
        """

        self._ion_mass = ion_mass

    @property
    def ion_type(self):
        """Gets the ion_type of this CompoundId.  # noqa: E501


        :return: The ion_type of this CompoundId.  # noqa: E501
        :rtype: str
        """
        return self._ion_type

    @ion_type.setter
    def ion_type(self, ion_type):
        """Sets the ion_type of this CompoundId.


        :param ion_type: The ion_type of this CompoundId.  # noqa: E501
        :type: str
        """

        self._ion_type = ion_type

    @property
    def rt_start_seconds(self):
        """Gets the rt_start_seconds of this CompoundId.  # noqa: E501


        :return: The rt_start_seconds of this CompoundId.  # noqa: E501
        :rtype: float
        """
        return self._rt_start_seconds

    @rt_start_seconds.setter
    def rt_start_seconds(self, rt_start_seconds):
        """Sets the rt_start_seconds of this CompoundId.


        :param rt_start_seconds: The rt_start_seconds of this CompoundId.  # noqa: E501
        :type: float
        """

        self._rt_start_seconds = rt_start_seconds

    @property
    def rt_end_seconds(self):
        """Gets the rt_end_seconds of this CompoundId.  # noqa: E501


        :return: The rt_end_seconds of this CompoundId.  # noqa: E501
        :rtype: float
        """
        return self._rt_end_seconds

    @rt_end_seconds.setter
    def rt_end_seconds(self, rt_end_seconds):
        """Sets the rt_end_seconds of this CompoundId.


        :param rt_end_seconds: The rt_end_seconds of this CompoundId.  # noqa: E501
        :type: float
        """

        self._rt_end_seconds = rt_end_seconds

    @property
    def top_annotation(self):
        """Gets the top_annotation of this CompoundId.  # noqa: E501


        :return: The top_annotation of this CompoundId.  # noqa: E501
        :rtype: CompoundAnnotation
        """
        return self._top_annotation

    @top_annotation.setter
    def top_annotation(self, top_annotation):
        """Sets the top_annotation of this CompoundId.


        :param top_annotation: The top_annotation of this CompoundId.  # noqa: E501
        :type: CompoundAnnotation
        """

        self._top_annotation = top_annotation

    @property
    def ms_data(self):
        """Gets the ms_data of this CompoundId.  # noqa: E501


        :return: The ms_data of this CompoundId.  # noqa: E501
        :rtype: MsData
        """
        return self._ms_data

    @ms_data.setter
    def ms_data(self, ms_data):
        """Sets the ms_data of this CompoundId.


        :param ms_data: The ms_data of this CompoundId.  # noqa: E501
        :type: MsData
        """

        self._ms_data = ms_data

    @property
    def computing(self):
        """Gets the computing of this CompoundId.  # noqa: E501


        :return: The computing of this CompoundId.  # noqa: E501
        :rtype: bool
        """
        return self._computing

    @computing.setter
    def computing(self, computing):
        """Sets the computing of this CompoundId.


        :param computing: The computing of this CompoundId.  # noqa: E501
        :type: bool
        """

        self._computing = computing

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
        if issubclass(CompoundId, dict):
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
        if not isinstance(other, CompoundId):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
