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
from PySirius.api.project_spaces_api import ProjectSpacesApi  # noqa: E501
from PySirius.rest import ApiException


class TestProjectSpacesApi(unittest.TestCase):
    """ProjectSpacesApi unit test stubs"""

    def setUp(self):
        self.api = ProjectSpacesApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_close_project_space(self):
        """Test case for close_project_space

        Close project-space and remove it from application.  # noqa: E501
        """
        pass

    def test_create_project_space(self):
        """Test case for create_project_space

        Create and open a new project-space at given location and make it accessible via the given projectId.  # noqa: E501
        """
        pass

    def test_get_project_space(self):
        """Test case for get_project_space

        Get project space info by its projectId.  # noqa: E501
        """
        pass

    def test_get_project_spaces(self):
        """Test case for get_project_spaces

        List all opened project spaces.  # noqa: E501
        """
        pass

    def test_open_project_space(self):
        """Test case for open_project_space

        Open an existing project-space and make it accessible via the given projectId.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
