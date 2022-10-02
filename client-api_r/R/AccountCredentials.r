# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' AccountCredentials Class
#'
#' @field username 
#' @field password 
#' @field refreshToken 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AccountCredentials <- R6::R6Class(
  'AccountCredentials',
  public = list(
    `username` = NULL,
    `password` = NULL,
    `refreshToken` = NULL,
    initialize = function(`username`, `password`, `refreshToken`){
      if (!missing(`username`)) {
        stopifnot(is.character(`username`), length(`username`) == 1)
        self$`username` <- `username`
      }
      if (!missing(`password`)) {
        stopifnot(is.character(`password`), length(`password`) == 1)
        self$`password` <- `password`
      }
      if (!missing(`refreshToken`)) {
        stopifnot(is.character(`refreshToken`), length(`refreshToken`) == 1)
        self$`refreshToken` <- `refreshToken`
      }
    },
    toJSON = function() {
      AccountCredentialsObject <- list()
      if (!is.null(self$`username`)) {
        AccountCredentialsObject[['username']] <- self$`username`
      }
      if (!is.null(self$`password`)) {
        AccountCredentialsObject[['password']] <- self$`password`
      }
      if (!is.null(self$`refreshToken`)) {
        AccountCredentialsObject[['refreshToken']] <- self$`refreshToken`
      }

      AccountCredentialsObject
    },
    fromJSON = function(AccountCredentialsJson) {
      AccountCredentialsObject <- jsonlite::fromJSON(AccountCredentialsJson)
      if (!is.null(AccountCredentialsObject$`username`)) {
        self$`username` <- AccountCredentialsObject$`username`
      }
      if (!is.null(AccountCredentialsObject$`password`)) {
        self$`password` <- AccountCredentialsObject$`password`
      }
      if (!is.null(AccountCredentialsObject$`refreshToken`)) {
        self$`refreshToken` <- AccountCredentialsObject$`refreshToken`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "username": %s,
           "password": %s,
           "refreshToken": %s
        }',
        self$`username`,
        self$`password`,
        self$`refreshToken`
      )
    },
    fromJSONString = function(AccountCredentialsJson) {
      AccountCredentialsObject <- jsonlite::fromJSON(AccountCredentialsJson)
      self$`username` <- AccountCredentialsObject$`username`
      self$`password` <- AccountCredentialsObject$`password`
      self$`refreshToken` <- AccountCredentialsObject$`refreshToken`
    }
  )
)
