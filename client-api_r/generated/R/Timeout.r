# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Timeout Class
#'
#' @field numberOfSecondsPerDecomposition 
#' @field numberOfSecondsPerInstance 
#' @field identifier 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Timeout <- R6::R6Class(
  'Timeout',
  public = list(
    `numberOfSecondsPerDecomposition` = NULL,
    `numberOfSecondsPerInstance` = NULL,
    `identifier` = NULL,
    initialize = function(`numberOfSecondsPerDecomposition`, `numberOfSecondsPerInstance`, `identifier`){
      if (!missing(`numberOfSecondsPerDecomposition`)) {
        stopifnot(is.numeric(`numberOfSecondsPerDecomposition`), length(`numberOfSecondsPerDecomposition`) == 1)
        self$`numberOfSecondsPerDecomposition` <- `numberOfSecondsPerDecomposition`
      }
      if (!missing(`numberOfSecondsPerInstance`)) {
        stopifnot(is.numeric(`numberOfSecondsPerInstance`), length(`numberOfSecondsPerInstance`) == 1)
        self$`numberOfSecondsPerInstance` <- `numberOfSecondsPerInstance`
      }
      if (!missing(`identifier`)) {
        stopifnot(is.character(`identifier`), length(`identifier`) == 1)
        self$`identifier` <- `identifier`
      }
    },
    toJSON = function() {
      TimeoutObject <- list()
      if (!is.null(self$`numberOfSecondsPerDecomposition`)) {
        TimeoutObject[['numberOfSecondsPerDecomposition']] <- self$`numberOfSecondsPerDecomposition`
      }
      if (!is.null(self$`numberOfSecondsPerInstance`)) {
        TimeoutObject[['numberOfSecondsPerInstance']] <- self$`numberOfSecondsPerInstance`
      }
      if (!is.null(self$`identifier`)) {
        TimeoutObject[['identifier']] <- self$`identifier`
      }

      TimeoutObject
    },
    fromJSON = function(TimeoutJson) {
      TimeoutObject <- jsonlite::fromJSON(TimeoutJson)
      if (!is.null(TimeoutObject$`numberOfSecondsPerDecomposition`)) {
        self$`numberOfSecondsPerDecomposition` <- TimeoutObject$`numberOfSecondsPerDecomposition`
      }
      if (!is.null(TimeoutObject$`numberOfSecondsPerInstance`)) {
        self$`numberOfSecondsPerInstance` <- TimeoutObject$`numberOfSecondsPerInstance`
      }
      if (!is.null(TimeoutObject$`identifier`)) {
        self$`identifier` <- TimeoutObject$`identifier`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "numberOfSecondsPerDecomposition": %d,
           "numberOfSecondsPerInstance": %d,
           "identifier": %s
        }',
        self$`numberOfSecondsPerDecomposition`,
        self$`numberOfSecondsPerInstance`,
        self$`identifier`
      )
    },
    fromJSONString = function(TimeoutJson) {
      TimeoutObject <- jsonlite::fromJSON(TimeoutJson)
      self$`numberOfSecondsPerDecomposition` <- TimeoutObject$`numberOfSecondsPerDecomposition`
      self$`numberOfSecondsPerInstance` <- TimeoutObject$`numberOfSecondsPerInstance`
      self$`identifier` <- TimeoutObject$`identifier`
    }
  )
)