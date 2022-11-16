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


class Deviation(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class properties:
            ppm = schemas.Float64Schema
            absolute = schemas.Float64Schema
            identifier = schemas.StrSchema
            __annotations__ = {
                "ppm": ppm,
                "absolute": absolute,
                "identifier": identifier,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ppm"]) -> MetaOapg.properties.ppm: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["absolute"]) -> MetaOapg.properties.absolute: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["identifier"]) -> MetaOapg.properties.identifier: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["ppm", "absolute", "identifier", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ppm"]) -> typing.Union[MetaOapg.properties.ppm, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["absolute"]) -> typing.Union[MetaOapg.properties.absolute, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["identifier"]) -> typing.Union[MetaOapg.properties.identifier, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["ppm", "absolute", "identifier", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        ppm: typing.Union[MetaOapg.properties.ppm, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        absolute: typing.Union[MetaOapg.properties.absolute, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        identifier: typing.Union[MetaOapg.properties.identifier, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Deviation':
        return super().__new__(
            cls,
            *args,
            ppm=ppm,
            absolute=absolute,
            identifier=identifier,
            _configuration=_configuration,
            **kwargs,
        )