# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    The version of the OpenAPI document: v0.9 on SIRIUS 5.6.3-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from PySirius import schemas  # noqa: F401


class JobProgress(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Progress information of a computation job that has already been submitted to SIRIUS.
 if  currentProgress == maxProgress job is finished and should change to state done soon.
 if a job is DONE all results can be accessed via the Project-Spaces api.
    """


    class MetaOapg:
        
        class properties:
            indeterminate = schemas.BoolSchema
            
            
            class state(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "WAITING": "WAITING",
                        "READY": "READY",
                        "QUEUED": "QUEUED",
                        "SUBMITTED": "SUBMITTED",
                        "RUNNING": "RUNNING",
                        "CANCELED": "CANCELED",
                        "FAILED": "FAILED",
                        "DONE": "DONE",
                    }
                
                @schemas.classproperty
                def WAITING(cls):
                    return cls("WAITING")
                
                @schemas.classproperty
                def READY(cls):
                    return cls("READY")
                
                @schemas.classproperty
                def QUEUED(cls):
                    return cls("QUEUED")
                
                @schemas.classproperty
                def SUBMITTED(cls):
                    return cls("SUBMITTED")
                
                @schemas.classproperty
                def RUNNING(cls):
                    return cls("RUNNING")
                
                @schemas.classproperty
                def CANCELED(cls):
                    return cls("CANCELED")
                
                @schemas.classproperty
                def FAILED(cls):
                    return cls("FAILED")
                
                @schemas.classproperty
                def DONE(cls):
                    return cls("DONE")
            currentProgress = schemas.Int64Schema
            maxProgress = schemas.Int64Schema
            message = schemas.StrSchema
            errorMessage = schemas.StrSchema
            __annotations__ = {
                "indeterminate": indeterminate,
                "state": state,
                "currentProgress": currentProgress,
                "maxProgress": maxProgress,
                "message": message,
                "errorMessage": errorMessage,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["indeterminate"]) -> MetaOapg.properties.indeterminate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["state"]) -> MetaOapg.properties.state: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currentProgress"]) -> MetaOapg.properties.currentProgress: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["maxProgress"]) -> MetaOapg.properties.maxProgress: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["message"]) -> MetaOapg.properties.message: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["errorMessage"]) -> MetaOapg.properties.errorMessage: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["indeterminate", "state", "currentProgress", "maxProgress", "message", "errorMessage", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["indeterminate"]) -> typing.Union[MetaOapg.properties.indeterminate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["state"]) -> typing.Union[MetaOapg.properties.state, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currentProgress"]) -> typing.Union[MetaOapg.properties.currentProgress, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["maxProgress"]) -> typing.Union[MetaOapg.properties.maxProgress, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["message"]) -> typing.Union[MetaOapg.properties.message, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["errorMessage"]) -> typing.Union[MetaOapg.properties.errorMessage, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["indeterminate", "state", "currentProgress", "maxProgress", "message", "errorMessage", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        indeterminate: typing.Union[MetaOapg.properties.indeterminate, bool, schemas.Unset] = schemas.unset,
        state: typing.Union[MetaOapg.properties.state, str, schemas.Unset] = schemas.unset,
        currentProgress: typing.Union[MetaOapg.properties.currentProgress, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        maxProgress: typing.Union[MetaOapg.properties.maxProgress, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        message: typing.Union[MetaOapg.properties.message, str, schemas.Unset] = schemas.unset,
        errorMessage: typing.Union[MetaOapg.properties.errorMessage, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'JobProgress':
        return super().__new__(
            cls,
            *args,
            indeterminate=indeterminate,
            state=state,
            currentProgress=currentProgress,
            maxProgress=maxProgress,
            message=message,
            errorMessage=errorMessage,
            _configuration=_configuration,
            **kwargs,
        )
