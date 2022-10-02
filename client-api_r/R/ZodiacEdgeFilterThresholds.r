# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' ZodiacEdgeFilterThresholds Class
#'
#' @field thresholdFilter 
#' @field minLocalCandidates 
#' @field minLocalConnections 
#' @field identifier 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ZodiacEdgeFilterThresholds <- R6::R6Class(
  'ZodiacEdgeFilterThresholds',
  public = list(
    `thresholdFilter` = NULL,
    `minLocalCandidates` = NULL,
    `minLocalConnections` = NULL,
    `identifier` = NULL,
    initialize = function(`thresholdFilter`, `minLocalCandidates`, `minLocalConnections`, `identifier`){
      if (!missing(`thresholdFilter`)) {
        stopifnot(is.numeric(`thresholdFilter`), length(`thresholdFilter`) == 1)
        self$`thresholdFilter` <- `thresholdFilter`
      }
      if (!missing(`minLocalCandidates`)) {
        stopifnot(is.numeric(`minLocalCandidates`), length(`minLocalCandidates`) == 1)
        self$`minLocalCandidates` <- `minLocalCandidates`
      }
      if (!missing(`minLocalConnections`)) {
        stopifnot(is.numeric(`minLocalConnections`), length(`minLocalConnections`) == 1)
        self$`minLocalConnections` <- `minLocalConnections`
      }
      if (!missing(`identifier`)) {
        stopifnot(is.character(`identifier`), length(`identifier`) == 1)
        self$`identifier` <- `identifier`
      }
    },
    toJSON = function() {
      ZodiacEdgeFilterThresholdsObject <- list()
      if (!is.null(self$`thresholdFilter`)) {
        ZodiacEdgeFilterThresholdsObject[['thresholdFilter']] <- self$`thresholdFilter`
      }
      if (!is.null(self$`minLocalCandidates`)) {
        ZodiacEdgeFilterThresholdsObject[['minLocalCandidates']] <- self$`minLocalCandidates`
      }
      if (!is.null(self$`minLocalConnections`)) {
        ZodiacEdgeFilterThresholdsObject[['minLocalConnections']] <- self$`minLocalConnections`
      }
      if (!is.null(self$`identifier`)) {
        ZodiacEdgeFilterThresholdsObject[['identifier']] <- self$`identifier`
      }

      ZodiacEdgeFilterThresholdsObject
    },
    fromJSON = function(ZodiacEdgeFilterThresholdsJson) {
      ZodiacEdgeFilterThresholdsObject <- jsonlite::fromJSON(ZodiacEdgeFilterThresholdsJson)
      if (!is.null(ZodiacEdgeFilterThresholdsObject$`thresholdFilter`)) {
        self$`thresholdFilter` <- ZodiacEdgeFilterThresholdsObject$`thresholdFilter`
      }
      if (!is.null(ZodiacEdgeFilterThresholdsObject$`minLocalCandidates`)) {
        self$`minLocalCandidates` <- ZodiacEdgeFilterThresholdsObject$`minLocalCandidates`
      }
      if (!is.null(ZodiacEdgeFilterThresholdsObject$`minLocalConnections`)) {
        self$`minLocalConnections` <- ZodiacEdgeFilterThresholdsObject$`minLocalConnections`
      }
      if (!is.null(ZodiacEdgeFilterThresholdsObject$`identifier`)) {
        self$`identifier` <- ZodiacEdgeFilterThresholdsObject$`identifier`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "thresholdFilter": %d,
           "minLocalCandidates": %d,
           "minLocalConnections": %d,
           "identifier": %s
        }',
        self$`thresholdFilter`,
        self$`minLocalCandidates`,
        self$`minLocalConnections`,
        self$`identifier`
      )
    },
    fromJSONString = function(ZodiacEdgeFilterThresholdsJson) {
      ZodiacEdgeFilterThresholdsObject <- jsonlite::fromJSON(ZodiacEdgeFilterThresholdsJson)
      self$`thresholdFilter` <- ZodiacEdgeFilterThresholdsObject$`thresholdFilter`
      self$`minLocalCandidates` <- ZodiacEdgeFilterThresholdsObject$`minLocalCandidates`
      self$`minLocalConnections` <- ZodiacEdgeFilterThresholdsObject$`minLocalConnections`
      self$`identifier` <- ZodiacEdgeFilterThresholdsObject$`identifier`
    }
  )
)
