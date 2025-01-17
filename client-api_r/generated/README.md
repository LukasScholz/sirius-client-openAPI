# R API client for Rsirius

REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project. By using the [OpenAPI spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: v0.9 on SIRIUS 5.6.4-SNAPSHOT
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.RClientCodegen

## Installation

### Prerequisites

Install the dependencies

```R
install.packages("jsonlite")
install.packages("httr")
install.packages("base64enc")
```

### Build the package

```sh
git clone https://github.com/GIT_USER_ID/GIT_REPO_ID
cd GIT_REPO_ID
R CMD build .
R CMD check Rsirius_1.0.0.tar.gz --no-manual
R CMD INSTALL --preclean Rsirius_1.0.0.tar.gz
```

### Install the package

```R
install.packages("Rsirius")
```

To install directly from Github, use `devtools`:
```R
install.packages("devtools")
library(devtools)
install_github("GIT_USER_ID/GIT_REPO_ID")
```

To install the package from a local file:
```R
install.packages("Rsirius_1.0.0.tar.gz", repos = NULL, type = "source")
```

### Usage

```R
library(Rsirius)
```

### Reformat code

To reformat code using [styler](https://styler.r-lib.org/index.html), please run the following in the R console:

```R
install.packages("remotes")
remotes::install_github("r-lib/styler@v1.7.0.9003")
library("styler")
style_dir()
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompoundsApi* | [**DeleteCompound**](docs/CompoundsApi.md#DeleteCompound) | **DELETE** /api/projects/{projectId}/compounds/{cid} | Delete compound/feature with the given identifier from the specified project-space.
*CompoundsApi* | [**GetCompound**](docs/CompoundsApi.md#GetCompound) | **GET** /api/projects/{projectId}/compounds/{cid} | Get compound/feature with the given identifier from the specified project-space.
*CompoundsApi* | [**GetCompounds**](docs/CompoundsApi.md#GetCompounds) | **GET** /api/projects/{projectId}/compounds | Get all available compounds/features in the given project-space.
*CompoundsApi* | [**ImportCompounds**](docs/CompoundsApi.md#ImportCompounds) | **POST** /api/projects/{projectId}/compounds | Import ms/ms data in given format from local filesystem into the specified project-space
*CompoundsApi* | [**ImportCompoundsFromString**](docs/CompoundsApi.md#ImportCompoundsFromString) | **POST** /api/projects/{projectId}/compounds/import-from-string | Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)
*ComputationsApi* | [**DeleteJob**](docs/ComputationsApi.md#DeleteJob) | **DELETE** /api/projects/{projectId}/jobs/{jobId} | Delete job.
*ComputationsApi* | [**DeleteJobConfig**](docs/ComputationsApi.md#DeleteJobConfig) | **DELETE** /api/job-configs/{name} | Delete job configuration with given name.
*ComputationsApi* | [**GetDefaultJobConfig**](docs/ComputationsApi.md#GetDefaultJobConfig) | **GET** /api/default-job-config | Request default job configuration
*ComputationsApi* | [**GetJob**](docs/ComputationsApi.md#GetJob) | **GET** /api/projects/{projectId}/jobs/{jobId} | Get job information and its current state and progress (if available).
*ComputationsApi* | [**GetJobConfig**](docs/ComputationsApi.md#GetJobConfig) | **GET** /api/job-configs/{name} | Request job configuration with given name.
*ComputationsApi* | [**GetJobConfigs**](docs/ComputationsApi.md#GetJobConfigs) | **GET** /api/job-configs | Request all available job configurations
*ComputationsApi* | [**GetJobs**](docs/ComputationsApi.md#GetJobs) | **GET** /api/projects/{projectId}/jobs | Get job information and its current state and progress (if available).
*ComputationsApi* | [**PostJobConfig**](docs/ComputationsApi.md#PostJobConfig) | **POST** /api/job-configs/{name} | Add new job configuration with given name.
*ComputationsApi* | [**StartJob**](docs/ComputationsApi.md#StartJob) | **POST** /api/projects/{projectId}/jobs | Start computation for given compounds and with given parameters.
*ComputationsApi* | [**StartJobFromConfig**](docs/ComputationsApi.md#StartJobFromConfig) | **POST** /api/projects/{projectId}/jobs-from-config | Start computation for given compounds and with parameters from a stored job-config.
*FormulaResultsApi* | [**GetBestMatchingCanopusPredictions**](docs/FormulaResultsApi.md#GetBestMatchingCanopusPredictions) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/best-canopus-predictions | Best matching compound classes,  Set of the highest scoring compound classes CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology,
*FormulaResultsApi* | [**GetCanopusPredictions**](docs/FormulaResultsApi.md#GetCanopusPredictions) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/canopus-predictions | All predicted compound classes (CANOPUS) from ClassyFire and NPC and their probabilities,
*FormulaResultsApi* | [**GetFingerprintPrediction**](docs/FormulaResultsApi.md#GetFingerprintPrediction) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/fingerprint | Returns predicted fingerprint (CSI:FingerID) for the given formula result identifier  This fingerprint is used to perfom structure database search and predict compound classes.
*FormulaResultsApi* | [**GetFormulaIds**](docs/FormulaResultsApi.md#GetFormulaIds) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas | List of all FormulaResultContainers available for this compound/feature with minimal information.
*FormulaResultsApi* | [**GetFormulaResult**](docs/FormulaResultsApi.md#GetFormulaResult) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId} | FormulaResultContainers for the given 'formulaId' with minimal information.
*FormulaResultsApi* | [**GetFragTree**](docs/FormulaResultsApi.md#GetFragTree) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/tree | Returns fragmentation tree (SIRIUS) for the given formula result identifier  This tree is used to rank formula candidates (treeScore).
*FormulaResultsApi* | [**GetSimulatedIsotopePattern**](docs/FormulaResultsApi.md#GetSimulatedIsotopePattern) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/isotope-pattern | Returns simulated isotope pattern (SIRIUS) for the given formula result identifier.
*FormulaResultsApi* | [**GetStructureCandidates**](docs/FormulaResultsApi.md#GetStructureCandidates) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/structures | List of StructureCandidates the given 'formulaId' with minimal information.
*FormulaResultsApi* | [**GetTopStructureCandidate**](docs/FormulaResultsApi.md#GetTopStructureCandidate) | **GET** /api/projects/{projectId}/compounds/{compoundId}/top-structure | Best Scoring StructureCandidate over all molecular formular resutls that belong to the specified  compound/feature (compoundId).
*GraphicalUserInterfaceApi* | [**ApplyToGui**](docs/GraphicalUserInterfaceApi.md#ApplyToGui) | **PATCH** /api/projects/{projectId}/gui | Apply given changes to the running GUI instance.
*GraphicalUserInterfaceApi* | [**CloseGui**](docs/GraphicalUserInterfaceApi.md#CloseGui) | **DELETE** /api/projects/{projectId}/gui | Close GUI instance of given project-space if available.
*GraphicalUserInterfaceApi* | [**OpenGui**](docs/GraphicalUserInterfaceApi.md#OpenGui) | **POST** /api/projects/{projectId}/gui | Open GUI instance on specified project-space and bring the GUI window to foreground.
*LoginAndAccountApi* | [**GetAccountInfo**](docs/LoginAndAccountApi.md#GetAccountInfo) | **GET** /api/account/ | Get information about the account currently logged in.
*LoginAndAccountApi* | [**GetSignUpURL**](docs/LoginAndAccountApi.md#GetSignUpURL) | **GET** /api/account/signUpURL | Get SignUp URL (For signUp via web browser)
*LoginAndAccountApi* | [**GetSubscriptions**](docs/LoginAndAccountApi.md#GetSubscriptions) | **GET** /api/account/subscriptions | Get available subscriptions of the account currently logged in.
*LoginAndAccountApi* | [**IsLoggedIn**](docs/LoginAndAccountApi.md#IsLoggedIn) | **GET** /api/account/isLoggedIn | Check if a user is logged in.
*LoginAndAccountApi* | [**Login**](docs/LoginAndAccountApi.md#Login) | **POST** /api/account/login | Login into SIRIUS web services.
*LoginAndAccountApi* | [**Logout**](docs/LoginAndAccountApi.md#Logout) | **POST** /api/account/logout | Logout from SIRIUS web services.
*LoginAndAccountApi* | [**SignUp**](docs/LoginAndAccountApi.md#SignUp) | **GET** /api/account/signUp | Open SignUp window in system browser and return signUp link.
*ProjectSpacesApi* | [**CloseProjectSpace**](docs/ProjectSpacesApi.md#CloseProjectSpace) | **DELETE** /api/projects/{projectId} | Close project-space and remove it from application.
*ProjectSpacesApi* | [**CreateProjectSpace**](docs/ProjectSpacesApi.md#CreateProjectSpace) | **POST** /api/projects/{projectId} | Create and open a new project-space at given location and make it accessible via the given projectId.
*ProjectSpacesApi* | [**GetProjectSpace**](docs/ProjectSpacesApi.md#GetProjectSpace) | **GET** /api/projects/{projectId} | Get project space info by its projectId.
*ProjectSpacesApi* | [**GetProjectSpaces**](docs/ProjectSpacesApi.md#GetProjectSpaces) | **GET** /api/projects | List all opened project spaces.
*ProjectSpacesApi* | [**OpenProjectSpace**](docs/ProjectSpacesApi.md#OpenProjectSpace) | **PUT** /api/projects/{projectId} | Open an existing project-space and make it accessible via the given projectId.
*VersionInfoControllerApi* | [**GetVersionInfo**](docs/VersionInfoControllerApi.md#GetVersionInfo) | **GET** /api/version.json | 


## Documentation for Models

 - [AccountCredentials](docs/AccountCredentials.md)
 - [AccountInfo](docs/AccountInfo.md)
 - [AnnotatedPeak](docs/AnnotatedPeak.md)
 - [AnnotatedSpectrum](docs/AnnotatedSpectrum.md)
 - [Canopus](docs/Canopus.md)
 - [CanopusPredictions](docs/CanopusPredictions.md)
 - [CollisionEnergy](docs/CollisionEnergy.md)
 - [CompoundAnnotation](docs/CompoundAnnotation.md)
 - [CompoundClass](docs/CompoundClass.md)
 - [CompoundClasses](docs/CompoundClasses.md)
 - [CompoundId](docs/CompoundId.md)
 - [DBLink](docs/DBLink.md)
 - [Deviation](docs/Deviation.md)
 - [FingerprintPrediction](docs/FingerprintPrediction.md)
 - [FormulaCandidate](docs/FormulaCandidate.md)
 - [FormulaResultContainer](docs/FormulaResultContainer.md)
 - [FragmentNode](docs/FragmentNode.md)
 - [FragmentationTree](docs/FragmentationTree.md)
 - [GuiParameters](docs/GuiParameters.md)
 - [JobId](docs/JobId.md)
 - [JobProgress](docs/JobProgress.md)
 - [JobSubmission](docs/JobSubmission.md)
 - [LossEdge](docs/LossEdge.md)
 - [MsData](docs/MsData.md)
 - [ProjectSpaceId](docs/ProjectSpaceId.md)
 - [ResultOverview](docs/ResultOverview.md)
 - [Sirius](docs/Sirius.md)
 - [StructureCandidate](docs/StructureCandidate.md)
 - [StructureDbSearch](docs/StructureDbSearch.md)
 - [Subscription](docs/Subscription.md)
 - [Timeout](docs/Timeout.md)
 - [UseHeuristic](docs/UseHeuristic.md)
 - [Zodiac](docs/Zodiac.md)
 - [ZodiacEdgeFilterThresholds](docs/ZodiacEdgeFilterThresholds.md)
 - [ZodiacEpochs](docs/ZodiacEpochs.md)
 - [ZodiacNumberOfConsideredCandidatesAt300Mz](docs/ZodiacNumberOfConsideredCandidatesAt300Mz.md)
 - [ZodiacNumberOfConsideredCandidatesAt800Mz](docs/ZodiacNumberOfConsideredCandidatesAt800Mz.md)
 - [ZodiacRunInTwoSteps](docs/ZodiacRunInTwoSteps.md)


## Documentation for Authorization

 All endpoints do not require authorization.


