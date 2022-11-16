# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import PySirius
from PySirius.paths.api_projects_project_id_compounds_compound_id_formulas_formula_id_best_canopus_predictions import get  # noqa: E501
from PySirius import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiProjectsProjectIdCompoundsCompoundIdFormulasFormulaIdBestCanopusPredictions(ApiTestMixin, unittest.TestCase):
    """
    ApiProjectsProjectIdCompoundsCompoundIdFormulasFormulaIdBestCanopusPredictions unit test stubs
        Best matching compound classes,  Set of the highest scoring compound classes CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology,  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = get.ApiForget(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200




if __name__ == '__main__':
    unittest.main()