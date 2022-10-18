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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CollisionEnergy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-18T13:38:04.287323Z[Etc/UTC]")
public class CollisionEnergy {
  @SerializedName("minEnergy")
  private Double minEnergy = null;

  @SerializedName("maxEnergy")
  private Double maxEnergy = null;

  @SerializedName("corrected")
  private Boolean corrected = null;

  public CollisionEnergy minEnergy(Double minEnergy) {
    this.minEnergy = minEnergy;
    return this;
  }

   /**
   * Get minEnergy
   * @return minEnergy
  **/
  @Schema(description = "")
  public Double getMinEnergy() {
    return minEnergy;
  }

  public void setMinEnergy(Double minEnergy) {
    this.minEnergy = minEnergy;
  }

  public CollisionEnergy maxEnergy(Double maxEnergy) {
    this.maxEnergy = maxEnergy;
    return this;
  }

   /**
   * Get maxEnergy
   * @return maxEnergy
  **/
  @Schema(description = "")
  public Double getMaxEnergy() {
    return maxEnergy;
  }

  public void setMaxEnergy(Double maxEnergy) {
    this.maxEnergy = maxEnergy;
  }

  public CollisionEnergy corrected(Boolean corrected) {
    this.corrected = corrected;
    return this;
  }

   /**
   * Get corrected
   * @return corrected
  **/
  @Schema(description = "")
  public Boolean isCorrected() {
    return corrected;
  }

  public void setCorrected(Boolean corrected) {
    this.corrected = corrected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollisionEnergy collisionEnergy = (CollisionEnergy) o;
    return Objects.equals(this.minEnergy, collisionEnergy.minEnergy) &&
        Objects.equals(this.maxEnergy, collisionEnergy.maxEnergy) &&
        Objects.equals(this.corrected, collisionEnergy.corrected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minEnergy, maxEnergy, corrected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollisionEnergy {\n");
    
    sb.append("    minEnergy: ").append(toIndentedString(minEnergy)).append("\n");
    sb.append("    maxEnergy: ").append(toIndentedString(maxEnergy)).append("\n");
    sb.append("    corrected: ").append(toIndentedString(corrected)).append("\n");
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
