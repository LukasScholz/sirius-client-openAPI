/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.CompoundClasses;
import JSirius.model.FormulaCandidate;
import JSirius.model.StructureCandidate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Summary of the results of a Compound. Can be added to a CompoundId.  It is not null within a CompoundId if it was not requested und non null otherwise  The different summary fields within this summary are null if the corresponding  compound does not contain the represented results. The content of  non NULL  summary field id the result was computed but is empty.
 */
@Schema(description = "Summary of the results of a Compound. Can be added to a CompoundId.  It is not null within a CompoundId if it was not requested und non null otherwise  The different summary fields within this summary are null if the corresponding  compound does not contain the represented results. The content of  non NULL  summary field id the result was computed but is empty.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-22T12:54:23.732876Z[Etc/UTC]")
public class CompoundAnnotation {
  @SerializedName("formulaAnnotation")
  private FormulaCandidate formulaAnnotation = null;

  @SerializedName("structureAnnotation")
  private StructureCandidate structureAnnotation = null;

  @SerializedName("compoundClassAnnotation")
  private CompoundClasses compoundClassAnnotation = null;

  public CompoundAnnotation formulaAnnotation(FormulaCandidate formulaAnnotation) {
    this.formulaAnnotation = formulaAnnotation;
    return this;
  }

   /**
   * Get formulaAnnotation
   * @return formulaAnnotation
  **/
  @Schema(description = "")
  public FormulaCandidate getFormulaAnnotation() {
    return formulaAnnotation;
  }

  public void setFormulaAnnotation(FormulaCandidate formulaAnnotation) {
    this.formulaAnnotation = formulaAnnotation;
  }

  public CompoundAnnotation structureAnnotation(StructureCandidate structureAnnotation) {
    this.structureAnnotation = structureAnnotation;
    return this;
  }

   /**
   * Get structureAnnotation
   * @return structureAnnotation
  **/
  @Schema(description = "")
  public StructureCandidate getStructureAnnotation() {
    return structureAnnotation;
  }

  public void setStructureAnnotation(StructureCandidate structureAnnotation) {
    this.structureAnnotation = structureAnnotation;
  }

  public CompoundAnnotation compoundClassAnnotation(CompoundClasses compoundClassAnnotation) {
    this.compoundClassAnnotation = compoundClassAnnotation;
    return this;
  }

   /**
   * Get compoundClassAnnotation
   * @return compoundClassAnnotation
  **/
  @Schema(description = "")
  public CompoundClasses getCompoundClassAnnotation() {
    return compoundClassAnnotation;
  }

  public void setCompoundClassAnnotation(CompoundClasses compoundClassAnnotation) {
    this.compoundClassAnnotation = compoundClassAnnotation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompoundAnnotation compoundAnnotation = (CompoundAnnotation) o;
    return Objects.equals(this.formulaAnnotation, compoundAnnotation.formulaAnnotation) &&
        Objects.equals(this.structureAnnotation, compoundAnnotation.structureAnnotation) &&
        Objects.equals(this.compoundClassAnnotation, compoundAnnotation.compoundClassAnnotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulaAnnotation, structureAnnotation, compoundClassAnnotation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompoundAnnotation {\n");
    
    sb.append("    formulaAnnotation: ").append(toIndentedString(formulaAnnotation)).append("\n");
    sb.append("    structureAnnotation: ").append(toIndentedString(structureAnnotation)).append("\n");
    sb.append("    compoundClassAnnotation: ").append(toIndentedString(compoundClassAnnotation)).append("\n");
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
