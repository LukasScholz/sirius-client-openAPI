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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Results that are available for a {@link FormulaResultContainer FormulaResultContainer} represented as boolean or numeric score (if available).  NULL scores indicate that the corresponding result is not available.
 */
@ApiModel(description = "Results that are available for a {@link FormulaResultContainer FormulaResultContainer} represented as boolean or numeric score (if available).  NULL scores indicate that the corresponding result is not available.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-14T15:51:38.278544Z[Etc/UTC]")
public class ResultOverview {
  public static final String SERIALIZED_NAME_SIRIUS_SCORE = "siriusScore";
  @SerializedName(SERIALIZED_NAME_SIRIUS_SCORE)
  private Double siriusScore;

  public static final String SERIALIZED_NAME_ZODIAC_SCORE = "zodiacScore";
  @SerializedName(SERIALIZED_NAME_ZODIAC_SCORE)
  private Double zodiacScore;

  public static final String SERIALIZED_NAME_TOP_C_S_I_SCORE = "topCSIScore";
  @SerializedName(SERIALIZED_NAME_TOP_C_S_I_SCORE)
  private Double topCSIScore;

  public static final String SERIALIZED_NAME_CONFIDENCE_SCORE = "confidenceScore";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_SCORE)
  private Double confidenceScore;

  public static final String SERIALIZED_NAME_CANOPUS_RESULT = "canopusResult";
  @SerializedName(SERIALIZED_NAME_CANOPUS_RESULT)
  private Boolean canopusResult;

  public ResultOverview() {
  }

  public ResultOverview siriusScore(Double siriusScore) {
    
    this.siriusScore = siriusScore;
    return this;
  }

   /**
   * Sirius Score (isotope + tree score) of the formula candidate.  If NULL result is not available
   * @return siriusScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sirius Score (isotope + tree score) of the formula candidate.  If NULL result is not available")

  public Double getSiriusScore() {
    return siriusScore;
  }


  public void setSiriusScore(Double siriusScore) {
    this.siriusScore = siriusScore;
  }


  public ResultOverview zodiacScore(Double zodiacScore) {
    
    this.zodiacScore = zodiacScore;
    return this;
  }

   /**
   * Zodiac Score of the formula candidate.  If NULL result is not available
   * @return zodiacScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zodiac Score of the formula candidate.  If NULL result is not available")

  public Double getZodiacScore() {
    return zodiacScore;
  }


  public void setZodiacScore(Double zodiacScore) {
    this.zodiacScore = zodiacScore;
  }


  public ResultOverview topCSIScore(Double topCSIScore) {
    
    this.topCSIScore = topCSIScore;
    return this;
  }

   /**
   * CSI:FingerID Score of the top ranking structure candidate of the structure database search  performed for this formula candidate.  If NULL structure database result is not available or the structure candidate list is empty.
   * @return topCSIScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSI:FingerID Score of the top ranking structure candidate of the structure database search  performed for this formula candidate.  If NULL structure database result is not available or the structure candidate list is empty.")

  public Double getTopCSIScore() {
    return topCSIScore;
  }


  public void setTopCSIScore(Double topCSIScore) {
    this.topCSIScore = topCSIScore;
  }


  public ResultOverview confidenceScore(Double confidenceScore) {
    
    this.confidenceScore = confidenceScore;
    return this;
  }

   /**
   * Confidence Score of the  IF NULL structure database result not available a structure candidate hit of another formula candidate is  the top ranking structure candidate.
   * @return confidenceScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confidence Score of the  IF NULL structure database result not available a structure candidate hit of another formula candidate is  the top ranking structure candidate.")

  public Double getConfidenceScore() {
    return confidenceScore;
  }


  public void setConfidenceScore(Double confidenceScore) {
    this.confidenceScore = confidenceScore;
  }


  public ResultOverview canopusResult(Boolean canopusResult) {
    
    this.canopusResult = canopusResult;
    return this;
  }

   /**
   * True if Canopus compound class prediction results are available.
   * @return canopusResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if Canopus compound class prediction results are available.")

  public Boolean getCanopusResult() {
    return canopusResult;
  }


  public void setCanopusResult(Boolean canopusResult) {
    this.canopusResult = canopusResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultOverview resultOverview = (ResultOverview) o;
    return Objects.equals(this.siriusScore, resultOverview.siriusScore) &&
        Objects.equals(this.zodiacScore, resultOverview.zodiacScore) &&
        Objects.equals(this.topCSIScore, resultOverview.topCSIScore) &&
        Objects.equals(this.confidenceScore, resultOverview.confidenceScore) &&
        Objects.equals(this.canopusResult, resultOverview.canopusResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siriusScore, zodiacScore, topCSIScore, confidenceScore, canopusResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultOverview {\n");
    sb.append("    siriusScore: ").append(toIndentedString(siriusScore)).append("\n");
    sb.append("    zodiacScore: ").append(toIndentedString(zodiacScore)).append("\n");
    sb.append("    topCSIScore: ").append(toIndentedString(topCSIScore)).append("\n");
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
    sb.append("    canopusResult: ").append(toIndentedString(canopusResult)).append("\n");
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
    openapiFields.add("siriusScore");
    openapiFields.add("zodiacScore");
    openapiFields.add("topCSIScore");
    openapiFields.add("confidenceScore");
    openapiFields.add("canopusResult");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResultOverview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResultOverview.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResultOverview is not found in the empty JSON string", ResultOverview.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResultOverview.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResultOverview` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResultOverview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResultOverview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResultOverview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResultOverview.class));

       return (TypeAdapter<T>) new TypeAdapter<ResultOverview>() {
           @Override
           public void write(JsonWriter out, ResultOverview value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResultOverview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResultOverview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResultOverview
  * @throws IOException if the JSON string is invalid with respect to ResultOverview
  */
  public static ResultOverview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResultOverview.class);
  }

 /**
  * Convert an instance of ResultOverview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

