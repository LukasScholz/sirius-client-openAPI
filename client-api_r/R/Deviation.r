# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Deviation Class
#'
#' @field ppm 
#' @field absolute 
#' @field identifier 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Deviation <- R6::R6Class(
  'Deviation',
  public = list(
    `ppm` = NULL,
    `absolute` = NULL,
    `identifier` = NULL,
    initialize = function(`ppm`, `absolute`, `identifier`){
      if (!missing(`ppm`)) {
        stopifnot(is.numeric(`ppm`), length(`ppm`) == 1)
        self$`ppm` <- `ppm`
      }
      if (!missing(`absolute`)) {
        stopifnot(is.numeric(`absolute`), length(`absolute`) == 1)
        self$`absolute` <- `absolute`
      }
      if (!missing(`identifier`)) {
        stopifnot(is.character(`identifier`), length(`identifier`) == 1)
        self$`identifier` <- `identifier`
      }
    },
    toJSON = function() {
      DeviationObject <- list()
      if (!is.null(self$`ppm`)) {
        DeviationObject[['ppm']] <- self$`ppm`
      }
      if (!is.null(self$`absolute`)) {
        DeviationObject[['absolute']] <- self$`absolute`
      }
      if (!is.null(self$`identifier`)) {
        DeviationObject[['identifier']] <- self$`identifier`
      }

      DeviationObject
    },
    fromJSON = function(DeviationJson) {
      DeviationObject <- jsonlite::fromJSON(DeviationJson)
      if (!is.null(DeviationObject$`ppm`)) {
        self$`ppm` <- DeviationObject$`ppm`
      }
      if (!is.null(DeviationObject$`absolute`)) {
        self$`absolute` <- DeviationObject$`absolute`
      }
      if (!is.null(DeviationObject$`identifier`)) {
        self$`identifier` <- DeviationObject$`identifier`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "ppm": %d,
           "absolute": %d,
           "identifier": %s
        }',
        self$`ppm`,
        self$`absolute`,
        self$`identifier`
      )
    },
    fromJSONString = function(DeviationJson) {
      DeviationObject <- jsonlite::fromJSON(DeviationJson)
      self$`ppm` <- DeviationObject$`ppm`
      self$`absolute` <- DeviationObject$`absolute`
      self$`identifier` <- DeviationObject$`identifier`
    }
  )
)
