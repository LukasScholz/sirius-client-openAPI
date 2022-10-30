/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.FormulaCandidate;
import JSirius.model.ResultOverview;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Container for formula level results that holds a unique identifier (molecular formula + adduct).  It can be extended/annotated with a list of results that are available for this formula candidate and their scores.  It can further be extended/annotated with the action formula candidate results.
 */
@Schema(description = "Container for formula level results that holds a unique identifier (molecular formula + adduct).  It can be extended/annotated with a list of results that are available for this formula candidate and their scores.  It can further be extended/annotated with the action formula candidate results.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-30T12:32:46.643664Z[Etc/UTC]")
public class FormulaResultContainer {
  @SerializedName("id")
  private String id = null;

  @SerializedName("molecularFormula")
  private String molecularFormula = null;

  @SerializedName("adduct")
  private String adduct = null;

  @SerializedName("resultOverview")
  private ResultOverview resultOverview = null;

  @SerializedName("candidate")
  private FormulaCandidate candidate = null;

  public FormulaResultContainer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of this formula candidate
   * @return id
  **/
  @Schema(description = "Unique identifier of this formula candidate")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FormulaResultContainer molecularFormula(String molecularFormula) {
    this.molecularFormula = molecularFormula;
    return this;
  }

   /**
   * molecular formula of this formula candidate
   * @return molecularFormula
  **/
  @Schema(description = "molecular formula of this formula candidate")
  public String getMolecularFormula() {
    return molecularFormula;
  }

  public void setMolecularFormula(String molecularFormula) {
    this.molecularFormula = molecularFormula;
  }

  public FormulaResultContainer adduct(String adduct) {
    this.adduct = adduct;
    return this;
  }

   /**
   * Adduct of this formula candidate
   * @return adduct
  **/
  @Schema(description = "Adduct of this formula candidate")
  public String getAdduct() {
    return adduct;
  }

  public void setAdduct(String adduct) {
    this.adduct = adduct;
  }

  public FormulaResultContainer resultOverview(ResultOverview resultOverview) {
    this.resultOverview = resultOverview;
    return this;
  }

   /**
   * Get resultOverview
   * @return resultOverview
  **/
  @Schema(description = "")
  public ResultOverview getResultOverview() {
    return resultOverview;
  }

  public void setResultOverview(ResultOverview resultOverview) {
    this.resultOverview = resultOverview;
  }

  public FormulaResultContainer candidate(FormulaCandidate candidate) {
    this.candidate = candidate;
    return this;
  }

   /**
   * Get candidate
   * @return candidate
  **/
  @Schema(description = "")
  public FormulaCandidate getCandidate() {
    return candidate;
  }

  public void setCandidate(FormulaCandidate candidate) {
    this.candidate = candidate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaResultContainer formulaResultContainer = (FormulaResultContainer) o;
    return Objects.equals(this.id, formulaResultContainer.id) &&
        Objects.equals(this.molecularFormula, formulaResultContainer.molecularFormula) &&
        Objects.equals(this.adduct, formulaResultContainer.adduct) &&
        Objects.equals(this.resultOverview, formulaResultContainer.resultOverview) &&
        Objects.equals(this.candidate, formulaResultContainer.candidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, molecularFormula, adduct, resultOverview, candidate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaResultContainer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    molecularFormula: ").append(toIndentedString(molecularFormula)).append("\n");
    sb.append("    adduct: ").append(toIndentedString(adduct)).append("\n");
    sb.append("    resultOverview: ").append(toIndentedString(resultOverview)).append("\n");
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
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
