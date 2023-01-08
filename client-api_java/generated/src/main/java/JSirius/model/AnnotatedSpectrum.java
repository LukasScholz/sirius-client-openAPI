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
import JSirius.model.AnnotatedPeak;
import JSirius.model.CollisionEnergy;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-08T15:23:14.296111Z[Etc/UTC]")
public class AnnotatedSpectrum {
  public static final String SERIALIZED_NAME_MS_LEVEL = "msLevel";
  @SerializedName(SERIALIZED_NAME_MS_LEVEL)
  private Integer msLevel;

  public static final String SERIALIZED_NAME_COLLISION_ENERGY = "collisionEnergy";
  @SerializedName(SERIALIZED_NAME_COLLISION_ENERGY)
  private CollisionEnergy collisionEnergy;

  public static final String SERIALIZED_NAME_PEAKS = "peaks";
  @SerializedName(SERIALIZED_NAME_PEAKS)
  private List<AnnotatedPeak> peaks = null;

  public AnnotatedSpectrum() {
  }

  public AnnotatedSpectrum msLevel(Integer msLevel) {
    
    this.msLevel = msLevel;
    return this;
  }

   /**
   * MS level of the measured spectrum.  Artificial spectra with no msLevel (e.g. Simulated Isotope patterns) use 0
   * @return msLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MS level of the measured spectrum.  Artificial spectra with no msLevel (e.g. Simulated Isotope patterns) use 0")

  public Integer getMsLevel() {
    return msLevel;
  }


  public void setMsLevel(Integer msLevel) {
    this.msLevel = msLevel;
  }


  public AnnotatedSpectrum collisionEnergy(CollisionEnergy collisionEnergy) {
    
    this.collisionEnergy = collisionEnergy;
    return this;
  }

   /**
   * Get collisionEnergy
   * @return collisionEnergy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CollisionEnergy getCollisionEnergy() {
    return collisionEnergy;
  }


  public void setCollisionEnergy(CollisionEnergy collisionEnergy) {
    this.collisionEnergy = collisionEnergy;
  }


  public AnnotatedSpectrum peaks(List<AnnotatedPeak> peaks) {
    
    this.peaks = peaks;
    return this;
  }

  public AnnotatedSpectrum addPeaksItem(AnnotatedPeak peaksItem) {
    if (this.peaks == null) {
      this.peaks = new ArrayList<>();
    }
    this.peaks.add(peaksItem);
    return this;
  }

   /**
   * Get peaks
   * @return peaks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AnnotatedPeak> getPeaks() {
    return peaks;
  }


  public void setPeaks(List<AnnotatedPeak> peaks) {
    this.peaks = peaks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedSpectrum annotatedSpectrum = (AnnotatedSpectrum) o;
    return Objects.equals(this.msLevel, annotatedSpectrum.msLevel) &&
        Objects.equals(this.collisionEnergy, annotatedSpectrum.collisionEnergy) &&
        Objects.equals(this.peaks, annotatedSpectrum.peaks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msLevel, collisionEnergy, peaks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedSpectrum {\n");
    sb.append("    msLevel: ").append(toIndentedString(msLevel)).append("\n");
    sb.append("    collisionEnergy: ").append(toIndentedString(collisionEnergy)).append("\n");
    sb.append("    peaks: ").append(toIndentedString(peaks)).append("\n");
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
    openapiFields.add("msLevel");
    openapiFields.add("collisionEnergy");
    openapiFields.add("peaks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnnotatedSpectrum
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnnotatedSpectrum.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnnotatedSpectrum is not found in the empty JSON string", AnnotatedSpectrum.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AnnotatedSpectrum.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnnotatedSpectrum` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `collisionEnergy`
      if (jsonObj.get("collisionEnergy") != null && !jsonObj.get("collisionEnergy").isJsonNull()) {
        CollisionEnergy.validateJsonObject(jsonObj.getAsJsonObject("collisionEnergy"));
      }
      if (jsonObj.get("peaks") != null && !jsonObj.get("peaks").isJsonNull()) {
        JsonArray jsonArraypeaks = jsonObj.getAsJsonArray("peaks");
        if (jsonArraypeaks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("peaks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `peaks` to be an array in the JSON string but got `%s`", jsonObj.get("peaks").toString()));
          }

          // validate the optional field `peaks` (array)
          for (int i = 0; i < jsonArraypeaks.size(); i++) {
            AnnotatedPeak.validateJsonObject(jsonArraypeaks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnnotatedSpectrum.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnnotatedSpectrum' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnnotatedSpectrum> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnnotatedSpectrum.class));

       return (TypeAdapter<T>) new TypeAdapter<AnnotatedSpectrum>() {
           @Override
           public void write(JsonWriter out, AnnotatedSpectrum value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnnotatedSpectrum read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnnotatedSpectrum given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnnotatedSpectrum
  * @throws IOException if the JSON string is invalid with respect to AnnotatedSpectrum
  */
  public static AnnotatedSpectrum fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnnotatedSpectrum.class);
  }

 /**
  * Convert an instance of AnnotatedSpectrum to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

