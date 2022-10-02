/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Results that are available for a {@link FormulaResultContainer FormulaResultContainer} represented as boolean or numeric score (if available).  NULL scores indicate that the corresponding result is not available.
 */
@Schema(description = "Results that are available for a {@link FormulaResultContainer FormulaResultContainer} represented as boolean or numeric score (if available).  NULL scores indicate that the corresponding result is not available.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-02T19:59:36.860367500+02:00[Europe/Berlin]")
public class ResultOverview {
  @SerializedName("siriusScore")
  private Double siriusScore = null;

  @SerializedName("zodiacScore")
  private Double zodiacScore = null;

  @SerializedName("topCSIScore")
  private Double topCSIScore = null;

  @SerializedName("confidenceScore")
  private Double confidenceScore = null;

  @SerializedName("canopusResult")
  private Boolean canopusResult = null;

  public ResultOverview siriusScore(Double siriusScore) {
    this.siriusScore = siriusScore;
    return this;
  }

   /**
   * Sirius Score (isotope + tree score) of the formula candidate.  If NULL result is not available
   * @return siriusScore
  **/
  @Schema(description = "Sirius Score (isotope + tree score) of the formula candidate.  If NULL result is not available")
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
  @Schema(description = "Zodiac Score of the formula candidate.  If NULL result is not available")
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
  @Schema(description = "CSI:FingerID Score of the top ranking structure candidate of the structure database search  performed for this formula candidate.  If NULL structure database result is not available or the structure candidate list is empty.")
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
  @Schema(description = "Confidence Score of the  IF NULL structure database result not available a structure candidate hit of another formula candidate is  the top ranking structure candidate.")
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
  @Schema(description = "True if Canopus compound class prediction results are available.")
  public Boolean isCanopusResult() {
    return canopusResult;
  }

  public void setCanopusResult(Boolean canopusResult) {
    this.canopusResult = canopusResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
