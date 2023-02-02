# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest
import os
import shutil
from PySirius import PySiriusAPI
from PySirius.rest import ApiException


address = "http://localhost"
port = 8080
api = PySiriusAPI(address=address, port=port)
data = "/home/runner/work/sirius-client-openAPI/sirius-client-openAPI/.updater/examples/ms/Kaempferol.ms"


class TestComputationsApi(unittest.TestCase):
    """ComputationsApi unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def test_delete_job(self):
        os.makedirs("temp_3")
        psid = api.get_ProjectSpacesApi().create_project_space("temp3","temp_3")
        jobid = api.get_CompoundsApi().import_compounds(psid[1], data)
        api.get_ComputationsApi().delete_job("temp1",jobid)

    def test_delete_job_config(self):
        api_instance = api.get_ComputationsApi()
        pid_dir = api.get_ProjectSpacesApi().create_project_space("computations2", "computationsDir2")
        sub = api.get_models().JobSubmission(canopus_paras = api.get_models().Canopus(enabled=False))
        api_instance.post_job_config("canopusConfig", sub)
        api_instance.get_job_config("canopusConfig")
        api_instance.delete_job_config("canopusConfig")
        pass

    def test_get_default_job_config(self):
        """Test case for get_default_job_config

        Request default job configuration  # noqa: E501
        """
        pass

    def test_get_job(self):
        """Test case for get_job

        Get job information and its current state and progress (if available).  # noqa: E501
        """
        pass

    def test_get_job_config(self):
        """Already done in setup"""
        self.assertTrue(True)
        pass

    def test_get_job_configs(self):
        """Test case for get_job_configs

        Request all available job configurations  # noqa: E501
        """
        pass

    def test_get_jobs(self):
        """Test case for get_jobs

        Get job information and its current state and progress (if available).  # noqa: E501
        """
        pass

    def test_post_job_config(self):
        """Already done in setup"""
        self.assertTrue(True)
        pass

    def test_start_job(self):
        """Test case for start_job

        Start computation for given compounds and with given parameters.  # noqa: E501
        """
        pass

    def test_start_job_from_config(self):
        """Test case for start_job_from_config

        Start computation for given compounds and with parameters from a stored job-config.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
