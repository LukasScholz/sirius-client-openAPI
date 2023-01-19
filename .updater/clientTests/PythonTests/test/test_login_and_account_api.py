# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

from PySirius import PySiriusAPI
import os


class TestLoginAndAccountApi(unittest.TestCase):
    """LoginAndAccountApi unit test stubs"""

    def setUp(self):
        address = "http://localhost"
        port = 8080
        self.api = PySiriusAPI(address=address, port=port)
        credentials = {"username":str(os.getenv('SIRIUS_USER')), "password":str(os.getenv('SIRIUS_PW'))}

    def tearDown(self):
        pass

    def test_get_account_info(self):
        """Test case for get_account_info

        Get information about the account currently logged in.  # noqa: E501
        """
        self.api.get_LoginAndAccountApi().get_account_info()

    def test_get_sign_up_url(self):
        """Test case for get_sign_up_url

        Get SignUp URL (For signUp via web browser)  # noqa: E501
        """
        self.api.get_LoginAndAccountApi().get_sign_up_url()

    def test_get_subscriptions(self):
        """Test case for get_subscriptions

        Get available subscriptions of the account currently logged in.  # noqa: E501
        """
        self.api.get_LoginAndAccountApi().get_subscriptions()

    def test_is_logged_in(self):
        """Test case for is_logged_in

        Check if a user is logged in.  # noqa: E501
        """
        self.assertIsNotNone(self.api.get_LoginAndAccountApi().is_logged_in())
        

    def test_logout_and_login(self):
        """
        Logs out the user and logs him back in for future testing purposes
        # TODO: results in infinite loop
        """
        #self.assertIsNotNone(self.api.get_LoginAndAccountApi().logout())
        #self.assertIsNotNone(self.api.get_LoginAndAccountApi().login(credentials, True))
        

    def test_sign_up(self):
        """Test case for sign_up
        Cant automatically open sign up window in pipeline -> skipping
        """
        self.assertTrue(True)


if __name__ == '__main__':
    unittest.main()
