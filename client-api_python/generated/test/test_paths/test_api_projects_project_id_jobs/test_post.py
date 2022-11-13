# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import PySirius
from PySirius.paths.api_projects_project_id_jobs import post  # noqa: E501
from PySirius import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiProjectsProjectIdJobs(ApiTestMixin, unittest.TestCase):
    """
    ApiProjectsProjectIdJobs unit test stubs
        Start computation for given compounds and with given parameters.  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 202






if __name__ == '__main__':
    unittest.main()
