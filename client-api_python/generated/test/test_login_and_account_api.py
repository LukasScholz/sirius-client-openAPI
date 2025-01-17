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
from PySirius.api.login_and_account_api import LoginAndAccountApi  # noqa: E501
from PySirius.rest import ApiException


class TestLoginAndAccountApi(unittest.TestCase):
    """LoginAndAccountApi unit test stubs"""

    def setUp(self):
        self.api = LoginAndAccountApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_account_info(self):
        """Test case for get_account_info

        Get information about the account currently logged in.  # noqa: E501
        """
        pass

    def test_get_sign_up_url(self):
        """Test case for get_sign_up_url

        Get SignUp URL (For signUp via web browser)  # noqa: E501
        """
        pass

    def test_get_subscriptions(self):
        """Test case for get_subscriptions

        Get available subscriptions of the account currently logged in.  # noqa: E501
        """
        pass

    def test_is_logged_in(self):
        """Test case for is_logged_in

        Check if a user is logged in.  # noqa: E501
        """
        pass

    def test_login(self):
        """Test case for login

        Login into SIRIUS web services.  # noqa: E501
        """
        pass

    def test_logout(self):
        """Test case for logout

        Logout from SIRIUS web services.  # noqa: E501
        """
        pass

    def test_sign_up(self):
        """Test case for sign_up

        Open SignUp window in system browser and return signUp link.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
