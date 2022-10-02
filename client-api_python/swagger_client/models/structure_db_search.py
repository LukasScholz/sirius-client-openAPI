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

class StructureDbSearch(object):
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
        'enabled': 'bool',
        'structure_search_d_bs': 'list[str]',
        'tag_lipids': 'bool'
    }

    attribute_map = {
        'enabled': 'enabled',
        'structure_search_d_bs': 'structureSearchDBs',
        'tag_lipids': 'tagLipids'
    }

    def __init__(self, enabled=None, structure_search_d_bs=None, tag_lipids=None):  # noqa: E501
        """StructureDbSearch - a model defined in Swagger"""  # noqa: E501
        self._enabled = None
        self._structure_search_d_bs = None
        self._tag_lipids = None
        self.discriminator = None
        if enabled is not None:
            self.enabled = enabled
        if structure_search_d_bs is not None:
            self.structure_search_d_bs = structure_search_d_bs
        if tag_lipids is not None:
            self.tag_lipids = tag_lipids

    @property
    def enabled(self):
        """Gets the enabled of this StructureDbSearch.  # noqa: E501

        tags whether the tool is enabled  # noqa: E501

        :return: The enabled of this StructureDbSearch.  # noqa: E501
        :rtype: bool
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this StructureDbSearch.

        tags whether the tool is enabled  # noqa: E501

        :param enabled: The enabled of this StructureDbSearch.  # noqa: E501
        :type: bool
        """

        self._enabled = enabled

    @property
    def structure_search_d_bs(self):
        """Gets the structure_search_d_bs of this StructureDbSearch.  # noqa: E501

        Structure databases to search in  # noqa: E501

        :return: The structure_search_d_bs of this StructureDbSearch.  # noqa: E501
        :rtype: list[str]
        """
        return self._structure_search_d_bs

    @structure_search_d_bs.setter
    def structure_search_d_bs(self, structure_search_d_bs):
        """Sets the structure_search_d_bs of this StructureDbSearch.

        Structure databases to search in  # noqa: E501

        :param structure_search_d_bs: The structure_search_d_bs of this StructureDbSearch.  # noqa: E501
        :type: list[str]
        """
        allowed_values = ["ALL", "ALL_BUT_INSILICO", "PUBCHEM", "MESH", "HMDB", "KNAPSACK", "CHEBI", "PUBMED", "BIO", "KEGG", "HSDB", "MACONDA", "METACYC", "GNPS", "ZINCBIO", "TRAIN", "UNDP", "YMDB", "PLANTCYC", "NORMAN", "ADDITIONAL", "SUPERNATURAL", "COCONUT", "PUBCHEMANNOTATIONBIO", "PUBCHEMANNOTATIONDRUG", "PUBCHEMANNOTATIONSAFETYANDTOXIC", "PUBCHEMANNOTATIONFOOD", "LIPID", "KEGGMINE", "ECOCYCMINE", "YMDBMINE"]  # noqa: E501
        if not set(structure_search_d_bs).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `structure_search_d_bs` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(structure_search_d_bs) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._structure_search_d_bs = structure_search_d_bs

    @property
    def tag_lipids(self):
        """Gets the tag_lipids of this StructureDbSearch.  # noqa: E501

        Candidates matching the lipid class estimated by El Gordo will be tagged.  The lipid class will only be available if El Gordo predicts that the MS/MS is a lipid spectrum.  If this parameter is set to 'false' El Gordo will still be executed and e.g. improve the fragmentation  tree, but the matching structure candidates will not be tagged if they match lipid class.  # noqa: E501

        :return: The tag_lipids of this StructureDbSearch.  # noqa: E501
        :rtype: bool
        """
        return self._tag_lipids

    @tag_lipids.setter
    def tag_lipids(self, tag_lipids):
        """Sets the tag_lipids of this StructureDbSearch.

        Candidates matching the lipid class estimated by El Gordo will be tagged.  The lipid class will only be available if El Gordo predicts that the MS/MS is a lipid spectrum.  If this parameter is set to 'false' El Gordo will still be executed and e.g. improve the fragmentation  tree, but the matching structure candidates will not be tagged if they match lipid class.  # noqa: E501

        :param tag_lipids: The tag_lipids of this StructureDbSearch.  # noqa: E501
        :type: bool
        """

        self._tag_lipids = tag_lipids

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
        if issubclass(StructureDbSearch, dict):
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
        if not isinstance(other, StructureDbSearch):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
