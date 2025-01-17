# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import PySirius
from PySirius.api.compounds_api import CompoundsApi  # noqa: E501
from PySirius.rest import ApiException


class TestCompoundsApi(unittest.TestCase):
    """CompoundsApi unit test stubs"""

    def setUp(self):
        self.api = CompoundsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_delete_compound(self):
        """Test case for delete_compound

        Delete compound/feature with the given identifier from the specified project-space.  # noqa: E501
        """
        pass

    def test_get_compound(self):
        """Test case for get_compound

        Get compound/feature with the given identifier from the specified project-space.  # noqa: E501
        """
        pass

    def test_get_compounds(self):
        """Test case for get_compounds

        Get all available compounds/features in the given project-space.  # noqa: E501
        """
        pass

    def test_import_compounds(self):
        """Test case for import_compounds

        Import ms/ms data in given format from local filesystem into the specified project-space  # noqa: E501
        """
        pass

    def test_import_compounds_from_string(self):
        """Test case for import_compounds_from_string

        Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
