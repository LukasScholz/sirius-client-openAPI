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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-06T19:33:15.226093Z[Etc/UTC]")
public class ZodiacEpochs {
  public static final String SERIALIZED_NAME_ITERATIONS = "iterations";
  @SerializedName(SERIALIZED_NAME_ITERATIONS)
  private Integer iterations;

  public static final String SERIALIZED_NAME_BURN_IN_PERIOD = "burnInPeriod";
  @SerializedName(SERIALIZED_NAME_BURN_IN_PERIOD)
  private Integer burnInPeriod;

  public static final String SERIALIZED_NAME_NUMBER_OF_MARKOV_CHAINS = "numberOfMarkovChains";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_MARKOV_CHAINS)
  private Integer numberOfMarkovChains;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public ZodiacEpochs() {
  }

  public ZodiacEpochs iterations(Integer iterations) {
    
    this.iterations = iterations;
    return this;
  }

   /**
   * Get iterations
   * @return iterations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }



  @Override
  public boolean equals(Object o) {
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
    openapiFields.add("iterations");
    openapiFields.add("burnInPeriod");
    openapiFields.add("numberOfMarkovChains");
    openapiFields.add("identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZodiacEpochs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ZodiacEpochs.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZodiacEpochs is not found in the empty JSON string", ZodiacEpochs.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZodiacEpochs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZodiacEpochs` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZodiacEpochs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZodiacEpochs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZodiacEpochs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZodiacEpochs.class));

       return (TypeAdapter<T>) new TypeAdapter<ZodiacEpochs>() {
           @Override
           public void write(JsonWriter out, ZodiacEpochs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZodiacEpochs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZodiacEpochs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZodiacEpochs
  * @throws IOException if the JSON string is invalid with respect to ZodiacEpochs
  */
  public static ZodiacEpochs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZodiacEpochs.class);
  }

 /**
  * Convert an instance of ZodiacEpochs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

