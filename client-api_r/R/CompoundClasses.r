# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' CompoundClasses Class
#'
#' @field npcPathway 
#' @field npcSuperclass 
#' @field npcClass 
#' @field classyFireMostSpecific 
#' @field classyFireLevel5 
#' @field classyFireClass 
#' @field classyFireSubClass 
#' @field classyFireSuperClass 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CompoundClasses <- R6::R6Class(
  'CompoundClasses',
  public = list(
    `npcPathway` = NULL,
    `npcSuperclass` = NULL,
    `npcClass` = NULL,
    `classyFireMostSpecific` = NULL,
    `classyFireLevel5` = NULL,
    `classyFireClass` = NULL,
    `classyFireSubClass` = NULL,
    `classyFireSuperClass` = NULL,
    initialize = function(`npcPathway`, `npcSuperclass`, `npcClass`, `classyFireMostSpecific`, `classyFireLevel5`, `classyFireClass`, `classyFireSubClass`, `classyFireSuperClass`){
      if (!missing(`npcPathway`)) {
        stopifnot(R6::is.R6(`npcPathway`))
        self$`npcPathway` <- `npcPathway`
      }
      if (!missing(`npcSuperclass`)) {
        stopifnot(R6::is.R6(`npcSuperclass`))
        self$`npcSuperclass` <- `npcSuperclass`
      }
      if (!missing(`npcClass`)) {
        stopifnot(R6::is.R6(`npcClass`))
        self$`npcClass` <- `npcClass`
      }
      if (!missing(`classyFireMostSpecific`)) {
        stopifnot(R6::is.R6(`classyFireMostSpecific`))
        self$`classyFireMostSpecific` <- `classyFireMostSpecific`
      }
      if (!missing(`classyFireLevel5`)) {
        stopifnot(R6::is.R6(`classyFireLevel5`))
        self$`classyFireLevel5` <- `classyFireLevel5`
      }
      if (!missing(`classyFireClass`)) {
        stopifnot(R6::is.R6(`classyFireClass`))
        self$`classyFireClass` <- `classyFireClass`
      }
      if (!missing(`classyFireSubClass`)) {
        stopifnot(R6::is.R6(`classyFireSubClass`))
        self$`classyFireSubClass` <- `classyFireSubClass`
      }
      if (!missing(`classyFireSuperClass`)) {
        stopifnot(R6::is.R6(`classyFireSuperClass`))
        self$`classyFireSuperClass` <- `classyFireSuperClass`
      }
    },
    toJSON = function() {
      CompoundClassesObject <- list()
      if (!is.null(self$`npcPathway`)) {
        CompoundClassesObject[['npcPathway']] <- self$`npcPathway`$toJSON()
      }
      if (!is.null(self$`npcSuperclass`)) {
        CompoundClassesObject[['npcSuperclass']] <- self$`npcSuperclass`$toJSON()
      }
      if (!is.null(self$`npcClass`)) {
        CompoundClassesObject[['npcClass']] <- self$`npcClass`$toJSON()
      }
      if (!is.null(self$`classyFireMostSpecific`)) {
        CompoundClassesObject[['classyFireMostSpecific']] <- self$`classyFireMostSpecific`$toJSON()
      }
      if (!is.null(self$`classyFireLevel5`)) {
        CompoundClassesObject[['classyFireLevel5']] <- self$`classyFireLevel5`$toJSON()
      }
      if (!is.null(self$`classyFireClass`)) {
        CompoundClassesObject[['classyFireClass']] <- self$`classyFireClass`$toJSON()
      }
      if (!is.null(self$`classyFireSubClass`)) {
        CompoundClassesObject[['classyFireSubClass']] <- self$`classyFireSubClass`$toJSON()
      }
      if (!is.null(self$`classyFireSuperClass`)) {
        CompoundClassesObject[['classyFireSuperClass']] <- self$`classyFireSuperClass`$toJSON()
      }

      CompoundClassesObject
    },
    fromJSON = function(CompoundClassesJson) {
      CompoundClassesObject <- jsonlite::fromJSON(CompoundClassesJson)
      if (!is.null(CompoundClassesObject$`npcPathway`)) {
        npcPathwayObject <- CompoundClass$new()
        npcPathwayObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$npcPathway, auto_unbox = TRUE))
        self$`npcPathway` <- npcPathwayObject
      }
      if (!is.null(CompoundClassesObject$`npcSuperclass`)) {
        npcSuperclassObject <- CompoundClass$new()
        npcSuperclassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$npcSuperclass, auto_unbox = TRUE))
        self$`npcSuperclass` <- npcSuperclassObject
      }
      if (!is.null(CompoundClassesObject$`npcClass`)) {
        npcClassObject <- CompoundClass$new()
        npcClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$npcClass, auto_unbox = TRUE))
        self$`npcClass` <- npcClassObject
      }
      if (!is.null(CompoundClassesObject$`classyFireMostSpecific`)) {
        classyFireMostSpecificObject <- CompoundClass$new()
        classyFireMostSpecificObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$classyFireMostSpecific, auto_unbox = TRUE))
        self$`classyFireMostSpecific` <- classyFireMostSpecificObject
      }
      if (!is.null(CompoundClassesObject$`classyFireLevel5`)) {
        classyFireLevel5Object <- CompoundClass$new()
        classyFireLevel5Object$fromJSON(jsonlite::toJSON(CompoundClassesObject$classyFireLevel5, auto_unbox = TRUE))
        self$`classyFireLevel5` <- classyFireLevel5Object
      }
      if (!is.null(CompoundClassesObject$`classyFireClass`)) {
        classyFireClassObject <- CompoundClass$new()
        classyFireClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$classyFireClass, auto_unbox = TRUE))
        self$`classyFireClass` <- classyFireClassObject
      }
      if (!is.null(CompoundClassesObject$`classyFireSubClass`)) {
        classyFireSubClassObject <- CompoundClass$new()
        classyFireSubClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$classyFireSubClass, auto_unbox = TRUE))
        self$`classyFireSubClass` <- classyFireSubClassObject
      }
      if (!is.null(CompoundClassesObject$`classyFireSuperClass`)) {
        classyFireSuperClassObject <- CompoundClass$new()
        classyFireSuperClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$classyFireSuperClass, auto_unbox = TRUE))
        self$`classyFireSuperClass` <- classyFireSuperClassObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "npcPathway": %s,
           "npcSuperclass": %s,
           "npcClass": %s,
           "classyFireMostSpecific": %s,
           "classyFireLevel5": %s,
           "classyFireClass": %s,
           "classyFireSubClass": %s,
           "classyFireSuperClass": %s
        }',
        self$`npcPathway`$toJSON(),
        self$`npcSuperclass`$toJSON(),
        self$`npcClass`$toJSON(),
        self$`classyFireMostSpecific`$toJSON(),
        self$`classyFireLevel5`$toJSON(),
        self$`classyFireClass`$toJSON(),
        self$`classyFireSubClass`$toJSON(),
        self$`classyFireSuperClass`$toJSON()
      )
    },
    fromJSONString = function(CompoundClassesJson) {
      CompoundClassesObject <- jsonlite::fromJSON(CompoundClassesJson)
      CompoundClassObject <- CompoundClass$new()
      self$`npcPathway` <- CompoundClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$npcPathway, auto_unbox = TRUE))
      CompoundClassObject <- CompoundClass$new()
      self$`npcSuperclass` <- CompoundClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$npcSuperclass, auto_unbox = TRUE))
      CompoundClassObject <- CompoundClass$new()
      self$`npcClass` <- CompoundClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$npcClass, auto_unbox = TRUE))
      CompoundClassObject <- CompoundClass$new()
      self$`classyFireMostSpecific` <- CompoundClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$classyFireMostSpecific, auto_unbox = TRUE))
      CompoundClassObject <- CompoundClass$new()
      self$`classyFireLevel5` <- CompoundClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$classyFireLevel5, auto_unbox = TRUE))
      CompoundClassObject <- CompoundClass$new()
      self$`classyFireClass` <- CompoundClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$classyFireClass, auto_unbox = TRUE))
      CompoundClassObject <- CompoundClass$new()
      self$`classyFireSubClass` <- CompoundClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$classyFireSubClass, auto_unbox = TRUE))
      CompoundClassObject <- CompoundClass$new()
      self$`classyFireSuperClass` <- CompoundClassObject$fromJSON(jsonlite::toJSON(CompoundClassesObject$classyFireSuperClass, auto_unbox = TRUE))
    }
  )
)
