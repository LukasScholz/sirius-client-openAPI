/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * The version of the OpenAPI document: v0.9 on SIRIUS 5.6.3-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.Deviation;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T10:35:06.123516Z[Etc/UTC]")
public class FormulaCandidate {
  public static final String SERIALIZED_NAME_SIRIUS_SCORE = "siriusScore";
  @SerializedName(SERIALIZED_NAME_SIRIUS_SCORE)
  private Double siriusScore;

  public static final String SERIALIZED_NAME_ISOTOPE_SCORE = "isotopeScore";
  @SerializedName(SERIALIZED_NAME_ISOTOPE_SCORE)
  private Double isotopeScore;

  public static final String SERIALIZED_NAME_TREE_SCORE = "treeScore";
  @SerializedName(SERIALIZED_NAME_TREE_SCORE)
  private Double treeScore;

  public static final String SERIALIZED_NAME_ZODIAC_SCORE = "zodiacScore";
  @SerializedName(SERIALIZED_NAME_ZODIAC_SCORE)
  private Double zodiacScore;

  public static final String SERIALIZED_NAME_MOLECULAR_FORMULA = "molecularFormula";
  @SerializedName(SERIALIZED_NAME_MOLECULAR_FORMULA)
  private String molecularFormula;

  public static final String SERIALIZED_NAME_ADDUCT = "adduct";
  @SerializedName(SERIALIZED_NAME_ADDUCT)
  private String adduct;

  public static final String SERIALIZED_NAME_NUM_OFEXPLAINED_PEAKS = "numOfexplainedPeaks";
  @SerializedName(SERIALIZED_NAME_NUM_OFEXPLAINED_PEAKS)
  private Integer numOfexplainedPeaks;

  public static final String SERIALIZED_NAME_NUM_OFEXPLAINABLE_PEAKS = "numOfexplainablePeaks";
  @SerializedName(SERIALIZED_NAME_NUM_OFEXPLAINABLE_PEAKS)
  private Integer numOfexplainablePeaks;

  public static final String SERIALIZED_NAME_TOTAL_EXPLAINED_INTENSITY = "totalExplainedIntensity";
  @SerializedName(SERIALIZED_NAME_TOTAL_EXPLAINED_INTENSITY)
  private Double totalExplainedIntensity;

  public static final String SERIALIZED_NAME_MEDIAN_MASS_DEVIATION = "medianMassDeviation";
  @SerializedName(SERIALIZED_NAME_MEDIAN_MASS_DEVIATION)
  private Deviation medianMassDeviation;

  public FormulaCandidate() {
  }

  public FormulaCandidate siriusScore(Double siriusScore) {
    
    this.siriusScore = siriusScore;
    return this;
  }

   /**
   * Get siriusScore
   * @return siriusScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSiriusScore() {
    return siriusScore;
  }


  public void setSiriusScore(Double siriusScore) {
    this.siriusScore = siriusScore;
  }


  public FormulaCandidate isotopeScore(Double isotopeScore) {
    
    this.isotopeScore = isotopeScore;
    return this;
  }

   /**
   * Get isotopeScore
   * @return isotopeScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIsotopeScore() {
    return isotopeScore;
  }


  public void setIsotopeScore(Double isotopeScore) {
    this.isotopeScore = isotopeScore;
  }


  public FormulaCandidate treeScore(Double treeScore) {
    
    this.treeScore = treeScore;
    return this;
  }

   /**
   * Get treeScore
   * @return treeScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTreeScore() {
    return treeScore;
  }


  public void setTreeScore(Double treeScore) {
    this.treeScore = treeScore;
  }


  public FormulaCandidate zodiacScore(Double zodiacScore) {
    
    this.zodiacScore = zodiacScore;
    return this;
  }

   /**
   * Get zodiacScore
   * @return zodiacScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getZodiacScore() {
    return zodiacScore;
  }


  public void setZodiacScore(Double zodiacScore) {
    this.zodiacScore = zodiacScore;
  }


  public FormulaCandidate molecularFormula(String molecularFormula) {
    
    this.molecularFormula = molecularFormula;
    return this;
  }

   /**
   * Get molecularFormula
   * @return molecularFormula
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMolecularFormula() {
    return molecularFormula;
  }


  public void setMolecularFormula(String molecularFormula) {
    this.molecularFormula = molecularFormula;
  }


  public FormulaCandidate adduct(String adduct) {
    
    this.adduct = adduct;
    return this;
  }

   /**
   * Get adduct
   * @return adduct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdduct() {
    return adduct;
  }


  public void setAdduct(String adduct) {
    this.adduct = adduct;
  }


  public FormulaCandidate numOfexplainedPeaks(Integer numOfexplainedPeaks) {
    
    this.numOfexplainedPeaks = numOfexplainedPeaks;
    return this;
  }

   /**
   * Get numOfexplainedPeaks
   * @return numOfexplainedPeaks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumOfexplainedPeaks() {
    return numOfexplainedPeaks;
  }


  public void setNumOfexplainedPeaks(Integer numOfexplainedPeaks) {
    this.numOfexplainedPeaks = numOfexplainedPeaks;
  }


  public FormulaCandidate numOfexplainablePeaks(Integer numOfexplainablePeaks) {
    
    this.numOfexplainablePeaks = numOfexplainablePeaks;
    return this;
  }

   /**
   * Get numOfexplainablePeaks
   * @return numOfexplainablePeaks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumOfexplainablePeaks() {
    return numOfexplainablePeaks;
  }


  public void setNumOfexplainablePeaks(Integer numOfexplainablePeaks) {
    this.numOfexplainablePeaks = numOfexplainablePeaks;
  }


  public FormulaCandidate totalExplainedIntensity(Double totalExplainedIntensity) {
    
    this.totalExplainedIntensity = totalExplainedIntensity;
    return this;
  }

   /**
   * Get totalExplainedIntensity
   * @return totalExplainedIntensity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTotalExplainedIntensity() {
    return totalExplainedIntensity;
  }


  public void setTotalExplainedIntensity(Double totalExplainedIntensity) {
    this.totalExplainedIntensity = totalExplainedIntensity;
  }


  public FormulaCandidate medianMassDeviation(Deviation medianMassDeviation) {
    
    this.medianMassDeviation = medianMassDeviation;
    return this;
  }

   /**
   * Get medianMassDeviation
   * @return medianMassDeviation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Deviation getMedianMassDeviation() {
    return medianMassDeviation;
  }


  public void setMedianMassDeviation(Deviation medianMassDeviation) {
    this.medianMassDeviation = medianMassDeviation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaCandidate formulaCandidate = (FormulaCandidate) o;
    return Objects.equals(this.siriusScore, formulaCandidate.siriusScore) &&
        Objects.equals(this.isotopeScore, formulaCandidate.isotopeScore) &&
        Objects.equals(this.treeScore, formulaCandidate.treeScore) &&
        Objects.equals(this.zodiacScore, formulaCandidate.zodiacScore) &&
        Objects.equals(this.molecularFormula, formulaCandidate.molecularFormula) &&
        Objects.equals(this.adduct, formulaCandidate.adduct) &&
        Objects.equals(this.numOfexplainedPeaks, formulaCandidate.numOfexplainedPeaks) &&
        Objects.equals(this.numOfexplainablePeaks, formulaCandidate.numOfexplainablePeaks) &&
        Objects.equals(this.totalExplainedIntensity, formulaCandidate.totalExplainedIntensity) &&
        Objects.equals(this.medianMassDeviation, formulaCandidate.medianMassDeviation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siriusScore, isotopeScore, treeScore, zodiacScore, molecularFormula, adduct, numOfexplainedPeaks, numOfexplainablePeaks, totalExplainedIntensity, medianMassDeviation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaCandidate {\n");
    sb.append("    siriusScore: ").append(toIndentedString(siriusScore)).append("\n");
    sb.append("    isotopeScore: ").append(toIndentedString(isotopeScore)).append("\n");
    sb.append("    treeScore: ").append(toIndentedString(treeScore)).append("\n");
    sb.append("    zodiacScore: ").append(toIndentedString(zodiacScore)).append("\n");
    sb.append("    molecularFormula: ").append(toIndentedString(molecularFormula)).append("\n");
    sb.append("    adduct: ").append(toIndentedString(adduct)).append("\n");
    sb.append("    numOfexplainedPeaks: ").append(toIndentedString(numOfexplainedPeaks)).append("\n");
    sb.append("    numOfexplainablePeaks: ").append(toIndentedString(numOfexplainablePeaks)).append("\n");
    sb.append("    totalExplainedIntensity: ").append(toIndentedString(totalExplainedIntensity)).append("\n");
    sb.append("    medianMassDeviation: ").append(toIndentedString(medianMassDeviation)).append("\n");
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
    openapiFields.add("isotopeScore");
    openapiFields.add("treeScore");
    openapiFields.add("zodiacScore");
    openapiFields.add("molecularFormula");
    openapiFields.add("adduct");
    openapiFields.add("numOfexplainedPeaks");
    openapiFields.add("numOfexplainablePeaks");
    openapiFields.add("totalExplainedIntensity");
    openapiFields.add("medianMassDeviation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FormulaCandidate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FormulaCandidate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FormulaCandidate is not found in the empty JSON string", FormulaCandidate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FormulaCandidate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FormulaCandidate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("molecularFormula") != null && !jsonObj.get("molecularFormula").isJsonNull()) && !jsonObj.get("molecularFormula").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `molecularFormula` to be a primitive type in the JSON string but got `%s`", jsonObj.get("molecularFormula").toString()));
      }
      if ((jsonObj.get("adduct") != null && !jsonObj.get("adduct").isJsonNull()) && !jsonObj.get("adduct").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adduct` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adduct").toString()));
      }
      // validate the optional field `medianMassDeviation`
      if (jsonObj.get("medianMassDeviation") != null && !jsonObj.get("medianMassDeviation").isJsonNull()) {
        Deviation.validateJsonObject(jsonObj.getAsJsonObject("medianMassDeviation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FormulaCandidate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FormulaCandidate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FormulaCandidate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FormulaCandidate.class));

       return (TypeAdapter<T>) new TypeAdapter<FormulaCandidate>() {
           @Override
           public void write(JsonWriter out, FormulaCandidate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FormulaCandidate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FormulaCandidate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FormulaCandidate
  * @throws IOException if the JSON string is invalid with respect to FormulaCandidate
  */
  public static FormulaCandidate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FormulaCandidate.class);
  }

 /**
  * Convert an instance of FormulaCandidate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

