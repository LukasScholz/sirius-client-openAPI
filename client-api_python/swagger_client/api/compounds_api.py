# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class CompoundsApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_compound(self, project_id, cid, **kwargs):  # noqa: E501
        """Delete compound/feature with the given identifier from the specified project-space.  # noqa: E501

        Delete compound/feature with the given identifier from the specified project-space.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_compound(project_id, cid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str project_id: project-space to delete from. (required)
        :param str cid: identifier of compound to delete. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_compound_with_http_info(project_id, cid, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_compound_with_http_info(project_id, cid, **kwargs)  # noqa: E501
            return data

    def delete_compound_with_http_info(self, project_id, cid, **kwargs):  # noqa: E501
        """Delete compound/feature with the given identifier from the specified project-space.  # noqa: E501

        Delete compound/feature with the given identifier from the specified project-space.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_compound_with_http_info(project_id, cid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str project_id: project-space to delete from. (required)
        :param str cid: identifier of compound to delete. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['project_id', 'cid']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_compound" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'project_id' is set
        if ('project_id' not in params or
                params['project_id'] is None):
            raise ValueError("Missing the required parameter `project_id` when calling `delete_compound`")  # noqa: E501
        # verify the required parameter 'cid' is set
        if ('cid' not in params or
                params['cid'] is None):
            raise ValueError("Missing the required parameter `cid` when calling `delete_compound`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'project_id' in params:
            path_params['projectId'] = params['project_id']  # noqa: E501
        if 'cid' in params:
            path_params['cid'] = params['cid']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/api/projects/{projectId}/compounds/{cid}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_compound(self, project_id, cid, **kwargs):  # noqa: E501
        """Get compound/feature with the given identifier from the specified project-space.  # noqa: E501

        Get compound/feature with the given identifier from the specified project-space.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_compound(project_id, cid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str project_id: project-space to read from. (required)
        :param str cid: identifier of compound to access. (required)
        :param bool top_annotation: include the top annotation of this feature into the output (if available).
        :param bool ms_data: include corresponding source data (MS and MS/MS) into the output.
        :return: CompoundId
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_compound_with_http_info(project_id, cid, **kwargs)  # noqa: E501
        else:
            (data) = self.get_compound_with_http_info(project_id, cid, **kwargs)  # noqa: E501
            return data

    def get_compound_with_http_info(self, project_id, cid, **kwargs):  # noqa: E501
        """Get compound/feature with the given identifier from the specified project-space.  # noqa: E501

        Get compound/feature with the given identifier from the specified project-space.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_compound_with_http_info(project_id, cid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str project_id: project-space to read from. (required)
        :param str cid: identifier of compound to access. (required)
        :param bool top_annotation: include the top annotation of this feature into the output (if available).
        :param bool ms_data: include corresponding source data (MS and MS/MS) into the output.
        :return: CompoundId
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['project_id', 'cid', 'top_annotation', 'ms_data']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_compound" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'project_id' is set
        if ('project_id' not in params or
                params['project_id'] is None):
            raise ValueError("Missing the required parameter `project_id` when calling `get_compound`")  # noqa: E501
        # verify the required parameter 'cid' is set
        if ('cid' not in params or
                params['cid'] is None):
            raise ValueError("Missing the required parameter `cid` when calling `get_compound`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'project_id' in params:
            path_params['projectId'] = params['project_id']  # noqa: E501
        if 'cid' in params:
            path_params['cid'] = params['cid']  # noqa: E501

        query_params = []
        if 'top_annotation' in params:
            query_params.append(('topAnnotation', params['top_annotation']))  # noqa: E501
        if 'ms_data' in params:
            query_params.append(('msData', params['ms_data']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/api/projects/{projectId}/compounds/{cid}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='CompoundId',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_compounds(self, project_id, **kwargs):  # noqa: E501
        """Get all available compounds/features in the given project-space.  # noqa: E501

        Get all available compounds/features in the given project-space.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_compounds(project_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str project_id: project-space to read from. (required)
        :param bool top_annotation: include the top annotation of this feature into the output (if available).
        :param bool ms_data: include corresponding source data (MS and MS/MS) into the output.
        :return: list[CompoundId]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_compounds_with_http_info(project_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_compounds_with_http_info(project_id, **kwargs)  # noqa: E501
            return data

    def get_compounds_with_http_info(self, project_id, **kwargs):  # noqa: E501
        """Get all available compounds/features in the given project-space.  # noqa: E501

        Get all available compounds/features in the given project-space.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_compounds_with_http_info(project_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str project_id: project-space to read from. (required)
        :param bool top_annotation: include the top annotation of this feature into the output (if available).
        :param bool ms_data: include corresponding source data (MS and MS/MS) into the output.
        :return: list[CompoundId]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['project_id', 'top_annotation', 'ms_data']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_compounds" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'project_id' is set
        if ('project_id' not in params or
                params['project_id'] is None):
            raise ValueError("Missing the required parameter `project_id` when calling `get_compounds`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'project_id' in params:
            path_params['projectId'] = params['project_id']  # noqa: E501

        query_params = []
        if 'top_annotation' in params:
            query_params.append(('topAnnotation', params['top_annotation']))  # noqa: E501
        if 'ms_data' in params:
            query_params.append(('msData', params['ms_data']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/api/projects/{projectId}/compounds', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[CompoundId]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def import_compounds(self, body, project_id, **kwargs):  # noqa: E501
        """Import ms/ms data in given format from local filesystem into the specified project-space  # noqa: E501

        Import ms/ms data in given format from local filesystem into the specified project-space.  The import will run in a background job  Possible formats (ms, mgf, cef, msp, mzML, mzXML, project-space)  <p>  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.import_compounds(body, project_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[str] body: List of file and directory paths to import (required)
        :param str project_id: project-space to import into. (required)
        :param bool align_lcms_runs: If true, multiple LCMS Runs (mzML, mzXML) will be aligned during import/feature finding
        :param bool allow_ms1_only_data:
        :param bool ignore_formulas:
        :return: JobId
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.import_compounds_with_http_info(body, project_id, **kwargs)  # noqa: E501
        else:
            (data) = self.import_compounds_with_http_info(body, project_id, **kwargs)  # noqa: E501
            return data

    def import_compounds_with_http_info(self, body, project_id, **kwargs):  # noqa: E501
        """Import ms/ms data in given format from local filesystem into the specified project-space  # noqa: E501

        Import ms/ms data in given format from local filesystem into the specified project-space.  The import will run in a background job  Possible formats (ms, mgf, cef, msp, mzML, mzXML, project-space)  <p>  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.import_compounds_with_http_info(body, project_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[str] body: List of file and directory paths to import (required)
        :param str project_id: project-space to import into. (required)
        :param bool align_lcms_runs: If true, multiple LCMS Runs (mzML, mzXML) will be aligned during import/feature finding
        :param bool allow_ms1_only_data:
        :param bool ignore_formulas:
        :return: JobId
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'project_id', 'align_lcms_runs', 'allow_ms1_only_data', 'ignore_formulas']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method import_compounds" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `import_compounds`")  # noqa: E501
        # verify the required parameter 'project_id' is set
        if ('project_id' not in params or
                params['project_id'] is None):
            raise ValueError("Missing the required parameter `project_id` when calling `import_compounds`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'project_id' in params:
            path_params['projectId'] = params['project_id']  # noqa: E501

        query_params = []
        if 'align_lcms_runs' in params:
            query_params.append(('alignLCMSRuns', params['align_lcms_runs']))  # noqa: E501
        if 'allow_ms1_only_data' in params:
            query_params.append(('allowMs1OnlyData', params['allow_ms1_only_data']))  # noqa: E501
        if 'ignore_formulas' in params:
            query_params.append(('ignoreFormulas', params['ignore_formulas']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/api/projects/{projectId}/compounds', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='JobId',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def import_compounds_from_string(self, body, format, project_id, **kwargs):  # noqa: E501
        """Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)  # noqa: E501

        Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.import_compounds_from_string(body, format, project_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str body: data content in specified format (required)
        :param str format: data format specified by the usual file extension of the format (without [.]) (required)
        :param str project_id: project-space to import into. (required)
        :param str source_name: name that specifies the data source. Can e.g. be a file path or just a name.
        :return: list[CompoundId]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.import_compounds_from_string_with_http_info(body, format, project_id, **kwargs)  # noqa: E501
        else:
            (data) = self.import_compounds_from_string_with_http_info(body, format, project_id, **kwargs)  # noqa: E501
            return data

    def import_compounds_from_string_with_http_info(self, body, format, project_id, **kwargs):  # noqa: E501
        """Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)  # noqa: E501

        Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.import_compounds_from_string_with_http_info(body, format, project_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str body: data content in specified format (required)
        :param str format: data format specified by the usual file extension of the format (without [.]) (required)
        :param str project_id: project-space to import into. (required)
        :param str source_name: name that specifies the data source. Can e.g. be a file path or just a name.
        :return: list[CompoundId]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'format', 'project_id', 'source_name']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method import_compounds_from_string" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `import_compounds_from_string`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `import_compounds_from_string`")  # noqa: E501
        # verify the required parameter 'project_id' is set
        if ('project_id' not in params or
                params['project_id'] is None):
            raise ValueError("Missing the required parameter `project_id` when calling `import_compounds_from_string`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'project_id' in params:
            path_params['projectId'] = params['project_id']  # noqa: E501

        query_params = []
        if 'format' in params:
            query_params.append(('format', params['format']))  # noqa: E501
        if 'source_name' in params:
            query_params.append(('sourceName', params['source_name']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['text/plain'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/api/projects/{projectId}/compounds/import-from-string', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[CompoundId]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
