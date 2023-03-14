/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * The version of the OpenAPI document: v0.9 on SIRIUS 5.6.4-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.Canopus;
import JSirius.model.FingerprintPrediction;
import JSirius.model.Sirius;
import JSirius.model.StructureDbSearch;
import JSirius.model.Zodiac;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import JSirius.JSON;

/**
 * Object to submit a job to be executed by SIRIUS
 */
@ApiModel(description = "Object to submit a job to be executed by SIRIUS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-14T16:23:17.741856Z[Etc/UTC]")
public class JobSubmission {
  public static final String SERIALIZED_NAME_COMPOUND_IDS = "compoundIds";
  @SerializedName(SERIALIZED_NAME_COMPOUND_IDS)
  private List<String> compoundIds = null;

  public static final String SERIALIZED_NAME_FALLBACK_ADDUCTS = "fallbackAdducts";
  @SerializedName(SERIALIZED_NAME_FALLBACK_ADDUCTS)
  private List<String> fallbackAdducts = null;

  public static final String SERIALIZED_NAME_ENFORCED_ADDUCTS = "enforcedAdducts";
  @SerializedName(SERIALIZED_NAME_ENFORCED_ADDUCTS)
  private List<String> enforcedAdducts = null;

  public static final String SERIALIZED_NAME_DETECTABLE_ADDUCTS = "detectableAdducts";
  @SerializedName(SERIALIZED_NAME_DETECTABLE_ADDUCTS)
  private List<String> detectableAdducts = null;

  public static final String SERIALIZED_NAME_RECOMPUTE = "recompute";
  @SerializedName(SERIALIZED_NAME_RECOMPUTE)
  private Boolean recompute;

  public static final String SERIALIZED_NAME_FORMULA_ID_PARAS = "formulaIdParas";
  @SerializedName(SERIALIZED_NAME_FORMULA_ID_PARAS)
  private Sirius formulaIdParas;

  public static final String SERIALIZED_NAME_ZODIAC_PARAS = "zodiacParas";
  @SerializedName(SERIALIZED_NAME_ZODIAC_PARAS)
  private Zodiac zodiacParas;

  public static final String SERIALIZED_NAME_FINGERPRINT_PREDICTION_PARAS = "fingerprintPredictionParas";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT_PREDICTION_PARAS)
  private FingerprintPrediction fingerprintPredictionParas;

  public static final String SERIALIZED_NAME_STRUCTURE_DB_SEARCH_PARAS = "structureDbSearchParas";
  @SerializedName(SERIALIZED_NAME_STRUCTURE_DB_SEARCH_PARAS)
  private StructureDbSearch structureDbSearchParas;

  public static final String SERIALIZED_NAME_CANOPUS_PARAS = "canopusParas";
  @SerializedName(SERIALIZED_NAME_CANOPUS_PARAS)
  private Canopus canopusParas;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private Map<String, String> configMap = null;

  public JobSubmission() {
  }

  public JobSubmission compoundIds(List<String> compoundIds) {
    
    this.compoundIds = compoundIds;
    return this;
  }

  public JobSubmission addCompoundIdsItem(String compoundIdsItem) {
    if (this.compoundIds == null) {
      this.compoundIds = new ArrayList<>();
    }
    this.compoundIds.add(compoundIdsItem);
    return this;
  }

   /**
   * Compounds that should be the input for this Job
   * @return compoundIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Compounds that should be the input for this Job")

  public List<String> getCompoundIds() {
    return compoundIds;
  }


  public void setCompoundIds(List<String> compoundIds) {
    this.compoundIds = compoundIds;
  }


  public JobSubmission fallbackAdducts(List<String> fallbackAdducts) {
    
    this.fallbackAdducts = fallbackAdducts;
    return this;
  }

  public JobSubmission addFallbackAdductsItem(String fallbackAdductsItem) {
    if (this.fallbackAdducts == null) {
      this.fallbackAdducts = new ArrayList<>();
    }
    this.fallbackAdducts.add(fallbackAdductsItem);
    return this;
  }

   /**
   * Describes how to deal with Adducts: Fallback adducts are considered if the auto detection did not find any indication for an ion mode.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-
   * @return fallbackAdducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes how to deal with Adducts: Fallback adducts are considered if the auto detection did not find any indication for an ion mode.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-")

  public List<String> getFallbackAdducts() {
    return fallbackAdducts;
  }


  public void setFallbackAdducts(List<String> fallbackAdducts) {
    this.fallbackAdducts = fallbackAdducts;
  }


  public JobSubmission enforcedAdducts(List<String> enforcedAdducts) {
    
    this.enforcedAdducts = enforcedAdducts;
    return this;
  }

  public JobSubmission addEnforcedAdductsItem(String enforcedAdductsItem) {
    if (this.enforcedAdducts == null) {
      this.enforcedAdducts = new ArrayList<>();
    }
    this.enforcedAdducts.add(enforcedAdductsItem);
    return this;
  }

   /**
   * Describes how to deal with Adducts:  Enforced adducts that are always considered.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-
   * @return enforcedAdducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes how to deal with Adducts:  Enforced adducts that are always considered.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-")

  public List<String> getEnforcedAdducts() {
    return enforcedAdducts;
  }


  public void setEnforcedAdducts(List<String> enforcedAdducts) {
    this.enforcedAdducts = enforcedAdducts;
  }


  public JobSubmission detectableAdducts(List<String> detectableAdducts) {
    
    this.detectableAdducts = detectableAdducts;
    return this;
  }

  public JobSubmission addDetectableAdductsItem(String detectableAdductsItem) {
    if (this.detectableAdducts == null) {
      this.detectableAdducts = new ArrayList<>();
    }
    this.detectableAdducts.add(detectableAdductsItem);
    return this;
  }

   /**
   * Describes how to deal with Adducts: Detectable adducts which are only considered if there is an indication in the MS1 scan (e.g. correct mass delta).  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-
   * @return detectableAdducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes how to deal with Adducts: Detectable adducts which are only considered if there is an indication in the MS1 scan (e.g. correct mass delta).  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-")

  public List<String> getDetectableAdducts() {
    return detectableAdducts;
  }


  public void setDetectableAdducts(List<String> detectableAdducts) {
    this.detectableAdducts = detectableAdducts;
  }


  public JobSubmission recompute(Boolean recompute) {
    
    this.recompute = recompute;
    return this;
  }

   /**
   * Indicate if already existing result for a tool to be executed should be overwritten or not.
   * @return recompute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicate if already existing result for a tool to be executed should be overwritten or not.")

  public Boolean getRecompute() {
    return recompute;
  }


  public void setRecompute(Boolean recompute) {
    this.recompute = recompute;
  }


  public JobSubmission formulaIdParas(Sirius formulaIdParas) {
    
    this.formulaIdParas = formulaIdParas;
    return this;
  }

   /**
   * Get formulaIdParas
   * @return formulaIdParas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Sirius getFormulaIdParas() {
    return formulaIdParas;
  }


  public void setFormulaIdParas(Sirius formulaIdParas) {
    this.formulaIdParas = formulaIdParas;
  }


  public JobSubmission zodiacParas(Zodiac zodiacParas) {
    
    this.zodiacParas = zodiacParas;
    return this;
  }

   /**
   * Get zodiacParas
   * @return zodiacParas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Zodiac getZodiacParas() {
    return zodiacParas;
  }


  public void setZodiacParas(Zodiac zodiacParas) {
    this.zodiacParas = zodiacParas;
  }


  public JobSubmission fingerprintPredictionParas(FingerprintPrediction fingerprintPredictionParas) {
    
    this.fingerprintPredictionParas = fingerprintPredictionParas;
    return this;
  }

   /**
   * Get fingerprintPredictionParas
   * @return fingerprintPredictionParas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FingerprintPrediction getFingerprintPredictionParas() {
    return fingerprintPredictionParas;
  }


  public void setFingerprintPredictionParas(FingerprintPrediction fingerprintPredictionParas) {
    this.fingerprintPredictionParas = fingerprintPredictionParas;
  }


  public JobSubmission structureDbSearchParas(StructureDbSearch structureDbSearchParas) {
    
    this.structureDbSearchParas = structureDbSearchParas;
    return this;
  }

   /**
   * Get structureDbSearchParas
   * @return structureDbSearchParas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StructureDbSearch getStructureDbSearchParas() {
    return structureDbSearchParas;
  }


  public void setStructureDbSearchParas(StructureDbSearch structureDbSearchParas) {
    this.structureDbSearchParas = structureDbSearchParas;
  }


  public JobSubmission canopusParas(Canopus canopusParas) {
    
    this.canopusParas = canopusParas;
    return this;
  }

   /**
   * Get canopusParas
   * @return canopusParas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Canopus getCanopusParas() {
    return canopusParas;
  }


  public void setCanopusParas(Canopus canopusParas) {
    this.canopusParas = canopusParas;
  }


  public JobSubmission configMap(Map<String, String> configMap) {
    
    this.configMap = configMap;
    return this;
  }

  public JobSubmission putConfigMapItem(String key, String configMapItem) {
    if (this.configMap == null) {
      this.configMap = new HashMap<>();
    }
    this.configMap.put(key, configMapItem);
    return this;
  }

   /**
   * As an alternative to the object based parameters, this map allows to store key value pairs  of ALL SIRIUS parameters. All possible parameters can be retrieved from SIRIUS via the respective endpoint.
   * @return configMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "As an alternative to the object based parameters, this map allows to store key value pairs  of ALL SIRIUS parameters. All possible parameters can be retrieved from SIRIUS via the respective endpoint.")

  public Map<String, String> getConfigMap() {
    return configMap;
  }


  public void setConfigMap(Map<String, String> configMap) {
    this.configMap = configMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobSubmission jobSubmission = (JobSubmission) o;
    return Objects.equals(this.compoundIds, jobSubmission.compoundIds) &&
        Objects.equals(this.fallbackAdducts, jobSubmission.fallbackAdducts) &&
        Objects.equals(this.enforcedAdducts, jobSubmission.enforcedAdducts) &&
        Objects.equals(this.detectableAdducts, jobSubmission.detectableAdducts) &&
        Objects.equals(this.recompute, jobSubmission.recompute) &&
        Objects.equals(this.formulaIdParas, jobSubmission.formulaIdParas) &&
        Objects.equals(this.zodiacParas, jobSubmission.zodiacParas) &&
        Objects.equals(this.fingerprintPredictionParas, jobSubmission.fingerprintPredictionParas) &&
        Objects.equals(this.structureDbSearchParas, jobSubmission.structureDbSearchParas) &&
        Objects.equals(this.canopusParas, jobSubmission.canopusParas) &&
        Objects.equals(this.configMap, jobSubmission.configMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compoundIds, fallbackAdducts, enforcedAdducts, detectableAdducts, recompute, formulaIdParas, zodiacParas, fingerprintPredictionParas, structureDbSearchParas, canopusParas, configMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobSubmission {\n");
    sb.append("    compoundIds: ").append(toIndentedString(compoundIds)).append("\n");
    sb.append("    fallbackAdducts: ").append(toIndentedString(fallbackAdducts)).append("\n");
    sb.append("    enforcedAdducts: ").append(toIndentedString(enforcedAdducts)).append("\n");
    sb.append("    detectableAdducts: ").append(toIndentedString(detectableAdducts)).append("\n");
    sb.append("    recompute: ").append(toIndentedString(recompute)).append("\n");
    sb.append("    formulaIdParas: ").append(toIndentedString(formulaIdParas)).append("\n");
    sb.append("    zodiacParas: ").append(toIndentedString(zodiacParas)).append("\n");
    sb.append("    fingerprintPredictionParas: ").append(toIndentedString(fingerprintPredictionParas)).append("\n");
    sb.append("    structureDbSearchParas: ").append(toIndentedString(structureDbSearchParas)).append("\n");
    sb.append("    canopusParas: ").append(toIndentedString(canopusParas)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("compoundIds");
    openapiFields.add("fallbackAdducts");
    openapiFields.add("enforcedAdducts");
    openapiFields.add("detectableAdducts");
    openapiFields.add("recompute");
    openapiFields.add("formulaIdParas");
    openapiFields.add("zodiacParas");
    openapiFields.add("fingerprintPredictionParas");
    openapiFields.add("structureDbSearchParas");
    openapiFields.add("canopusParas");
    openapiFields.add("configMap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobSubmission
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobSubmission.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobSubmission is not found in the empty JSON string", JobSubmission.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobSubmission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobSubmission` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("compoundIds") != null && !jsonObj.get("compoundIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `compoundIds` to be an array in the JSON string but got `%s`", jsonObj.get("compoundIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fallbackAdducts") != null && !jsonObj.get("fallbackAdducts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackAdducts` to be an array in the JSON string but got `%s`", jsonObj.get("fallbackAdducts").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("enforcedAdducts") != null && !jsonObj.get("enforcedAdducts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enforcedAdducts` to be an array in the JSON string but got `%s`", jsonObj.get("enforcedAdducts").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("detectableAdducts") != null && !jsonObj.get("detectableAdducts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `detectableAdducts` to be an array in the JSON string but got `%s`", jsonObj.get("detectableAdducts").toString()));
      }
      // validate the optional field `formulaIdParas`
      if (jsonObj.get("formulaIdParas") != null && !jsonObj.get("formulaIdParas").isJsonNull()) {
        Sirius.validateJsonObject(jsonObj.getAsJsonObject("formulaIdParas"));
      }
      // validate the optional field `zodiacParas`
      if (jsonObj.get("zodiacParas") != null && !jsonObj.get("zodiacParas").isJsonNull()) {
        Zodiac.validateJsonObject(jsonObj.getAsJsonObject("zodiacParas"));
      }
      // validate the optional field `fingerprintPredictionParas`
      if (jsonObj.get("fingerprintPredictionParas") != null && !jsonObj.get("fingerprintPredictionParas").isJsonNull()) {
        FingerprintPrediction.validateJsonObject(jsonObj.getAsJsonObject("fingerprintPredictionParas"));
      }
      // validate the optional field `structureDbSearchParas`
      if (jsonObj.get("structureDbSearchParas") != null && !jsonObj.get("structureDbSearchParas").isJsonNull()) {
        StructureDbSearch.validateJsonObject(jsonObj.getAsJsonObject("structureDbSearchParas"));
      }
      // validate the optional field `canopusParas`
      if (jsonObj.get("canopusParas") != null && !jsonObj.get("canopusParas").isJsonNull()) {
        Canopus.validateJsonObject(jsonObj.getAsJsonObject("canopusParas"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobSubmission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobSubmission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobSubmission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobSubmission.class));

       return (TypeAdapter<T>) new TypeAdapter<JobSubmission>() {
           @Override
           public void write(JsonWriter out, JobSubmission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobSubmission read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobSubmission given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobSubmission
  * @throws IOException if the JSON string is invalid with respect to JobSubmission
  */
  public static JobSubmission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobSubmission.class);
  }

 /**
  * Convert an instance of JobSubmission to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

