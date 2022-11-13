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


class JobSubmission(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Object to submit a job to be executed by SIRIUS
    """


    class MetaOapg:
        
        class properties:
            
            
            class compoundIds(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    items = schemas.StrSchema
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, str, ]], typing.List[typing.Union[MetaOapg.items, str, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'compoundIds':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            
            
            class fallbackAdducts(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    items = schemas.StrSchema
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, str, ]], typing.List[typing.Union[MetaOapg.items, str, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'fallbackAdducts':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            
            
            class enforcedAdducts(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    items = schemas.StrSchema
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, str, ]], typing.List[typing.Union[MetaOapg.items, str, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'enforcedAdducts':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            
            
            class detectableAdducts(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    items = schemas.StrSchema
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, str, ]], typing.List[typing.Union[MetaOapg.items, str, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'detectableAdducts':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            recompute = schemas.BoolSchema
        
            @staticmethod
            def formulaIdParas() -> typing.Type['Sirius']:
                return Sirius
        
            @staticmethod
            def zodiacParas() -> typing.Type['Zodiac']:
                return Zodiac
        
            @staticmethod
            def fingerprintPredictionParas() -> typing.Type['FingerprintPrediction']:
                return FingerprintPrediction
        
            @staticmethod
            def structureDbSearchParas() -> typing.Type['StructureDbSearch']:
                return StructureDbSearch
        
            @staticmethod
            def canopusParas() -> typing.Type['Canopus']:
                return Canopus
            
            
            class configMap(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    additional_properties = schemas.StrSchema
                
                def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additional_properties, str, ],
                ) -> 'configMap':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            __annotations__ = {
                "compoundIds": compoundIds,
                "fallbackAdducts": fallbackAdducts,
                "enforcedAdducts": enforcedAdducts,
                "detectableAdducts": detectableAdducts,
                "recompute": recompute,
                "formulaIdParas": formulaIdParas,
                "zodiacParas": zodiacParas,
                "fingerprintPredictionParas": fingerprintPredictionParas,
                "structureDbSearchParas": structureDbSearchParas,
                "canopusParas": canopusParas,
                "configMap": configMap,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["compoundIds"]) -> MetaOapg.properties.compoundIds: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["fallbackAdducts"]) -> MetaOapg.properties.fallbackAdducts: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enforcedAdducts"]) -> MetaOapg.properties.enforcedAdducts: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["detectableAdducts"]) -> MetaOapg.properties.detectableAdducts: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["recompute"]) -> MetaOapg.properties.recompute: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["formulaIdParas"]) -> 'Sirius': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["zodiacParas"]) -> 'Zodiac': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["fingerprintPredictionParas"]) -> 'FingerprintPrediction': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["structureDbSearchParas"]) -> 'StructureDbSearch': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["canopusParas"]) -> 'Canopus': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["configMap"]) -> MetaOapg.properties.configMap: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["compoundIds", "fallbackAdducts", "enforcedAdducts", "detectableAdducts", "recompute", "formulaIdParas", "zodiacParas", "fingerprintPredictionParas", "structureDbSearchParas", "canopusParas", "configMap", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["compoundIds"]) -> typing.Union[MetaOapg.properties.compoundIds, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["fallbackAdducts"]) -> typing.Union[MetaOapg.properties.fallbackAdducts, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["enforcedAdducts"]) -> typing.Union[MetaOapg.properties.enforcedAdducts, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["detectableAdducts"]) -> typing.Union[MetaOapg.properties.detectableAdducts, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["recompute"]) -> typing.Union[MetaOapg.properties.recompute, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["formulaIdParas"]) -> typing.Union['Sirius', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["zodiacParas"]) -> typing.Union['Zodiac', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["fingerprintPredictionParas"]) -> typing.Union['FingerprintPrediction', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["structureDbSearchParas"]) -> typing.Union['StructureDbSearch', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["canopusParas"]) -> typing.Union['Canopus', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["configMap"]) -> typing.Union[MetaOapg.properties.configMap, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["compoundIds", "fallbackAdducts", "enforcedAdducts", "detectableAdducts", "recompute", "formulaIdParas", "zodiacParas", "fingerprintPredictionParas", "structureDbSearchParas", "canopusParas", "configMap", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        compoundIds: typing.Union[MetaOapg.properties.compoundIds, list, tuple, schemas.Unset] = schemas.unset,
        fallbackAdducts: typing.Union[MetaOapg.properties.fallbackAdducts, list, tuple, schemas.Unset] = schemas.unset,
        enforcedAdducts: typing.Union[MetaOapg.properties.enforcedAdducts, list, tuple, schemas.Unset] = schemas.unset,
        detectableAdducts: typing.Union[MetaOapg.properties.detectableAdducts, list, tuple, schemas.Unset] = schemas.unset,
        recompute: typing.Union[MetaOapg.properties.recompute, bool, schemas.Unset] = schemas.unset,
        formulaIdParas: typing.Union['Sirius', schemas.Unset] = schemas.unset,
        zodiacParas: typing.Union['Zodiac', schemas.Unset] = schemas.unset,
        fingerprintPredictionParas: typing.Union['FingerprintPrediction', schemas.Unset] = schemas.unset,
        structureDbSearchParas: typing.Union['StructureDbSearch', schemas.Unset] = schemas.unset,
        canopusParas: typing.Union['Canopus', schemas.Unset] = schemas.unset,
        configMap: typing.Union[MetaOapg.properties.configMap, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'JobSubmission':
        return super().__new__(
            cls,
            *args,
            compoundIds=compoundIds,
            fallbackAdducts=fallbackAdducts,
            enforcedAdducts=enforcedAdducts,
            detectableAdducts=detectableAdducts,
            recompute=recompute,
            formulaIdParas=formulaIdParas,
            zodiacParas=zodiacParas,
            fingerprintPredictionParas=fingerprintPredictionParas,
            structureDbSearchParas=structureDbSearchParas,
            canopusParas=canopusParas,
            configMap=configMap,
            _configuration=_configuration,
            **kwargs,
        )

from PySirius.model.canopus import Canopus
from PySirius.model.fingerprint_prediction import FingerprintPrediction
from PySirius.model.sirius import Sirius
from PySirius.model.structure_db_search import StructureDbSearch
from PySirius.model.zodiac import Zodiac
