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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-08T15:23:14.296111Z[Etc/UTC]")
public class Timeout {
  public static final String SERIALIZED_NAME_NUMBER_OF_SECONDS_PER_DECOMPOSITION = "numberOfSecondsPerDecomposition";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SECONDS_PER_DECOMPOSITION)
  private Integer numberOfSecondsPerDecomposition;

  public static final String SERIALIZED_NAME_NUMBER_OF_SECONDS_PER_INSTANCE = "numberOfSecondsPerInstance";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SECONDS_PER_INSTANCE)
  private Integer numberOfSecondsPerInstance;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public Timeout() {
  }

  public Timeout numberOfSecondsPerDecomposition(Integer numberOfSecondsPerDecomposition) {
    
    this.numberOfSecondsPerDecomposition = numberOfSecondsPerDecomposition;
    return this;
  }

   /**
   * Get numberOfSecondsPerDecomposition
   * @return numberOfSecondsPerDecomposition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfSecondsPerDecomposition() {
    return numberOfSecondsPerDecomposition;
  }


  public void setNumberOfSecondsPerDecomposition(Integer numberOfSecondsPerDecomposition) {
    this.numberOfSecondsPerDecomposition = numberOfSecondsPerDecomposition;
  }


  public Timeout numberOfSecondsPerInstance(Integer numberOfSecondsPerInstance) {
    
    this.numberOfSecondsPerInstance = numberOfSecondsPerInstance;
    return this;
  }

   /**
   * Get numberOfSecondsPerInstance
   * @return numberOfSecondsPerInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfSecondsPerInstance() {
    return numberOfSecondsPerInstance;
  }


  public void setNumberOfSecondsPerInstance(Integer numberOfSecondsPerInstance) {
    this.numberOfSecondsPerInstance = numberOfSecondsPerInstance;
  }


  public Timeout identifier(String identifier) {
    
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
    Timeout timeout = (Timeout) o;
    return Objects.equals(this.numberOfSecondsPerDecomposition, timeout.numberOfSecondsPerDecomposition) &&
        Objects.equals(this.numberOfSecondsPerInstance, timeout.numberOfSecondsPerInstance) &&
        Objects.equals(this.identifier, timeout.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfSecondsPerDecomposition, numberOfSecondsPerInstance, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timeout {\n");
    sb.append("    numberOfSecondsPerDecomposition: ").append(toIndentedString(numberOfSecondsPerDecomposition)).append("\n");
    sb.append("    numberOfSecondsPerInstance: ").append(toIndentedString(numberOfSecondsPerInstance)).append("\n");
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
    openapiFields.add("numberOfSecondsPerDecomposition");
    openapiFields.add("numberOfSecondsPerInstance");
    openapiFields.add("identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Timeout
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Timeout.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Timeout is not found in the empty JSON string", Timeout.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Timeout.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Timeout` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!Timeout.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Timeout' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Timeout> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Timeout.class));

       return (TypeAdapter<T>) new TypeAdapter<Timeout>() {
           @Override
           public void write(JsonWriter out, Timeout value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Timeout read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Timeout given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Timeout
  * @throws IOException if the JSON string is invalid with respect to Timeout
  */
  public static Timeout fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Timeout.class);
  }

 /**
  * Convert an instance of Timeout to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

