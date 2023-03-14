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
import JSirius.model.CompoundClass;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Container class that holds the CANOPUS compound class predictions for alle predictable compound classes.  This is the full CANOPUS result.
 */
@ApiModel(description = "Container class that holds the CANOPUS compound class predictions for alle predictable compound classes.  This is the full CANOPUS result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-14T16:23:17.741856Z[Etc/UTC]")
public class CanopusPredictions {
  public static final String SERIALIZED_NAME_CLASSY_FIRE_CLASSES = "classyFireClasses";
  @SerializedName(SERIALIZED_NAME_CLASSY_FIRE_CLASSES)
  private List<CompoundClass> classyFireClasses = null;

  public static final String SERIALIZED_NAME_NPC_CLASSES = "npcClasses";
  @SerializedName(SERIALIZED_NAME_NPC_CLASSES)
  private List<CompoundClass> npcClasses = null;

  public CanopusPredictions() {
  }

  public CanopusPredictions classyFireClasses(List<CompoundClass> classyFireClasses) {
    
    this.classyFireClasses = classyFireClasses;
    return this;
  }

  public CanopusPredictions addClassyFireClassesItem(CompoundClass classyFireClassesItem) {
    if (this.classyFireClasses == null) {
      this.classyFireClasses = new ArrayList<>();
    }
    this.classyFireClasses.add(classyFireClassesItem);
    return this;
  }

   /**
   * All predicted ClassyFire classes
   * @return classyFireClasses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All predicted ClassyFire classes")

  public List<CompoundClass> getClassyFireClasses() {
    return classyFireClasses;
  }


  public void setClassyFireClasses(List<CompoundClass> classyFireClasses) {
    this.classyFireClasses = classyFireClasses;
  }


  public CanopusPredictions npcClasses(List<CompoundClass> npcClasses) {
    
    this.npcClasses = npcClasses;
    return this;
  }

  public CanopusPredictions addNpcClassesItem(CompoundClass npcClassesItem) {
    if (this.npcClasses == null) {
      this.npcClasses = new ArrayList<>();
    }
    this.npcClasses.add(npcClassesItem);
    return this;
  }

   /**
   * All predicted NPC classes
   * @return npcClasses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All predicted NPC classes")

  public List<CompoundClass> getNpcClasses() {
    return npcClasses;
  }


  public void setNpcClasses(List<CompoundClass> npcClasses) {
    this.npcClasses = npcClasses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CanopusPredictions canopusPredictions = (CanopusPredictions) o;
    return Objects.equals(this.classyFireClasses, canopusPredictions.classyFireClasses) &&
        Objects.equals(this.npcClasses, canopusPredictions.npcClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classyFireClasses, npcClasses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CanopusPredictions {\n");
    sb.append("    classyFireClasses: ").append(toIndentedString(classyFireClasses)).append("\n");
    sb.append("    npcClasses: ").append(toIndentedString(npcClasses)).append("\n");
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
    openapiFields.add("classyFireClasses");
    openapiFields.add("npcClasses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CanopusPredictions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CanopusPredictions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CanopusPredictions is not found in the empty JSON string", CanopusPredictions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CanopusPredictions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CanopusPredictions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("classyFireClasses") != null && !jsonObj.get("classyFireClasses").isJsonNull()) {
        JsonArray jsonArrayclassyFireClasses = jsonObj.getAsJsonArray("classyFireClasses");
        if (jsonArrayclassyFireClasses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("classyFireClasses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `classyFireClasses` to be an array in the JSON string but got `%s`", jsonObj.get("classyFireClasses").toString()));
          }

          // validate the optional field `classyFireClasses` (array)
          for (int i = 0; i < jsonArrayclassyFireClasses.size(); i++) {
            CompoundClass.validateJsonObject(jsonArrayclassyFireClasses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("npcClasses") != null && !jsonObj.get("npcClasses").isJsonNull()) {
        JsonArray jsonArraynpcClasses = jsonObj.getAsJsonArray("npcClasses");
        if (jsonArraynpcClasses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("npcClasses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `npcClasses` to be an array in the JSON string but got `%s`", jsonObj.get("npcClasses").toString()));
          }

          // validate the optional field `npcClasses` (array)
          for (int i = 0; i < jsonArraynpcClasses.size(); i++) {
            CompoundClass.validateJsonObject(jsonArraynpcClasses.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CanopusPredictions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CanopusPredictions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CanopusPredictions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CanopusPredictions.class));

       return (TypeAdapter<T>) new TypeAdapter<CanopusPredictions>() {
           @Override
           public void write(JsonWriter out, CanopusPredictions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CanopusPredictions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CanopusPredictions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CanopusPredictions
  * @throws IOException if the JSON string is invalid with respect to CanopusPredictions
  */
  public static CanopusPredictions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CanopusPredictions.class);
  }

 /**
  * Convert an instance of CanopusPredictions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

