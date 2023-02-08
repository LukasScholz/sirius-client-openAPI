# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import time
import unittest
import os
import shutil
from PySirius import PySiriusAPI
from PySirius.rest import ApiException


address = "http://localhost"
port = 8080
api = PySiriusAPI(address=address, port=port)
api_instance = api.get_FormulaResultsApi()


psid = api.get_ProjectSpacesApi().create_project_space("temp9","temp_9")
ps_name = "temp9"
project_id = ps_name
path_to_demo_data = "/home/runner/work/sirius-client-openAPI/sirius-client-openAPI/.updater/examples"
#Basic workflow to get results from
api.get_CompoundsApi().import_compounds([path_to_demo_data+"/ms/Bicuculline.ms", path_to_demo_data+"/ms/Kaempferol.ms" ], ps_name)
fallback_adducts = ["[M+H]+","[M]+,[M+K]+","[M+Na]+","[M+H-H2O]+","[M+Na2-H]+","[M+2K-H]+","[M+NH4]+","[M+H3O]+","[M+MeOH+H]+"]
detectable_adducts = ["[M+H]+","[M]+,[M+K]+","[M+Na]+","[M+H-H2O]+","[M+Na2-H]+","[M+2K-H]+","[M+NH4]+","[M+H3O]+","[M+MeOH+H]+"]
formula_id_paras = api.get_models().Sirius(True)
time.sleep(2)
job = api.get_models().JobSubmission([api.get_CompoundsApi().get_compounds(ps_name)[0].id, api.get_CompoundsApi().get_compounds(ps_name)[1].id], fallback_adducts, None, detectable_adducts, True, formula_id_paras)
time.sleep(2)
job_id = api.get_ComputationsApi().start_job(job, ps_name)
# wait max 30 secs
for i in range(6):
    time.sleep(5)
    resp = api.get_ComputationsApi().get_job(project_id, job_id.id)
    if resp.progress.state == "DONE":
        break
compound_id = api.get_CompoundsApi().get_compounds(ps_name)[0].id
formula_id = api_instance.get_formula_ids(ps_name, compound_id)

class TestFormulaResultsApi(unittest.TestCase):
    """FormulaResultsApi unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def test_get_best_matching_canopus_predictions(self):
        api_instance.get_best_matching_canopus_predictions(project_id, compound_id, formula_id)

    def test_get_canopus_predictions(self):
        api_instance.get_canopus_predictions(project_id, compound_id, formula_id)

    def test_get_fingerprint_prediction(self):
        api_instance.get_fingerprint_prediction(project_id, compound_id, formula_id)

    def test_get_formula_ids(self):
        """Already done in setup"""
        self.assertTrue(True)

    def test_get_formula_result(self):
        api_instance.get_formula_result(project_id, compound_id, formula_id)

    def test_get_frag_tree(self):
        api_instance.get_frag_tree(project_id, compound_id, formula_id)

    def test_get_simulated_isotope_pattern(self):
        api_instance.get_simulated_isotope_pattern(project_id, compound_id, formula_id)

    def test_get_structure_candidates(self):
        api_instance.get_structure_candidates(project_id, compound_id, formula_id)

    def test_get_top_structure_candidate(self):
        api_instance.get_top_structure_candidate(project_id, compound_id)


if __name__ == '__main__':
    unittest.main()
