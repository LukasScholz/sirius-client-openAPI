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
 * ZodiacEpochs
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-27T08:20:35.998782Z[Etc/UTC]")
public class ZodiacEpochs {
  @SerializedName("iterations")
  private Integer iterations = null;

  @SerializedName("burnInPeriod")
  private Integer burnInPeriod = null;

  @SerializedName("numberOfMarkovChains")
  private Integer numberOfMarkovChains = null;

  @SerializedName("identifier")
  private String identifier = null;

  public ZodiacEpochs iterations(Integer iterations) {
    this.iterations = iterations;
    return this;
  }

   /**
   * Get iterations
   * @return iterations
  **/
  @Schema(description = "")
  public Integer getIterations() {
    return iterations;
  }

  public void setIterations(Integer iterations) {
    this.iterations = iterations;
  }

  public ZodiacEpochs burnInPeriod(Integer burnInPeriod) {
    this.burnInPeriod = burnInPeriod;
    return this;
  }

   /**
   * Get burnInPeriod
   * @return burnInPeriod
  **/
  @Schema(description = "")
  public Integer getBurnInPeriod() {
    return burnInPeriod;
  }

  public void setBurnInPeriod(Integer burnInPeriod) {
    this.burnInPeriod = burnInPeriod;
  }

  public ZodiacEpochs numberOfMarkovChains(Integer numberOfMarkovChains) {
    this.numberOfMarkovChains = numberOfMarkovChains;
    return this;
  }

   /**
   * Get numberOfMarkovChains
   * @return numberOfMarkovChains
  **/
  @Schema(description = "")
  public Integer getNumberOfMarkovChains() {
    return numberOfMarkovChains;
  }

  public void setNumberOfMarkovChains(Integer numberOfMarkovChains) {
    this.numberOfMarkovChains = numberOfMarkovChains;
  }

  public ZodiacEpochs identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @Schema(description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZodiacEpochs zodiacEpochs = (ZodiacEpochs) o;
    return Objects.equals(this.iterations, zodiacEpochs.iterations) &&
        Objects.equals(this.burnInPeriod, zodiacEpochs.burnInPeriod) &&
        Objects.equals(this.numberOfMarkovChains, zodiacEpochs.numberOfMarkovChains) &&
        Objects.equals(this.identifier, zodiacEpochs.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iterations, burnInPeriod, numberOfMarkovChains, identifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZodiacEpochs {\n");
    
    sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
    sb.append("    burnInPeriod: ").append(toIndentedString(burnInPeriod)).append("\n");
    sb.append("    numberOfMarkovChains: ").append(toIndentedString(numberOfMarkovChains)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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