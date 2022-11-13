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
 * User/developer friendly parameter subset for the CSI:FingerID structure db search tool.
 */
@ApiModel(description = "User/developer friendly parameter subset for the CSI:FingerID structure db search tool.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-13T15:41:00.515300Z[Etc/UTC]")
public class StructureDbSearch {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  /**
   * Gets or Sets structureSearchDBs
   */
  @JsonAdapter(StructureSearchDBsEnum.Adapter.class)
  public enum StructureSearchDBsEnum {
    ALL("ALL"),
    
    ALL_BUT_INSILICO("ALL_BUT_INSILICO"),
    
    PUBCHEM("PUBCHEM"),
    
    MESH("MESH"),
    
    HMDB("HMDB"),
    
    KNAPSACK("KNAPSACK"),
    
    CHEBI("CHEBI"),
    
    PUBMED("PUBMED"),
    
    BIO("BIO"),
    
    KEGG("KEGG"),
    
    HSDB("HSDB"),
    
    MACONDA("MACONDA"),
    
    METACYC("METACYC"),
    
    GNPS("GNPS"),
    
    ZINCBIO("ZINCBIO"),
    
    TRAIN("TRAIN"),
    
    UNDP("UNDP"),
    
    YMDB("YMDB"),
    
    PLANTCYC("PLANTCYC"),
    
    NORMAN("NORMAN"),
    
    ADDITIONAL("ADDITIONAL"),
    
    SUPERNATURAL("SUPERNATURAL"),
    
    COCONUT("COCONUT"),
    
    PUBCHEMANNOTATIONBIO("PUBCHEMANNOTATIONBIO"),
    
    PUBCHEMANNOTATIONDRUG("PUBCHEMANNOTATIONDRUG"),
    
    PUBCHEMANNOTATIONSAFETYANDTOXIC("PUBCHEMANNOTATIONSAFETYANDTOXIC"),
    
    PUBCHEMANNOTATIONFOOD("PUBCHEMANNOTATIONFOOD"),
    
    LIPID("LIPID"),
    
    KEGGMINE("KEGGMINE"),
    
    ECOCYCMINE("ECOCYCMINE"),
    
    YMDBMINE("YMDBMINE");

    private String value;

    StructureSearchDBsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StructureSearchDBsEnum fromValue(String value) {
      for (StructureSearchDBsEnum b : StructureSearchDBsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StructureSearchDBsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StructureSearchDBsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StructureSearchDBsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StructureSearchDBsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STRUCTURE_SEARCH_D_BS = "structureSearchDBs";
  @SerializedName(SERIALIZED_NAME_STRUCTURE_SEARCH_D_BS)
  private List<StructureSearchDBsEnum> structureSearchDBs = null;

  public static final String SERIALIZED_NAME_TAG_LIPIDS = "tagLipids";
  @SerializedName(SERIALIZED_NAME_TAG_LIPIDS)
  private Boolean tagLipids;

  public StructureDbSearch() {
  }

  public StructureDbSearch enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * tags whether the tool is enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "tags whether the tool is enabled")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public StructureDbSearch structureSearchDBs(List<StructureSearchDBsEnum> structureSearchDBs) {
    
    this.structureSearchDBs = structureSearchDBs;
    return this;
  }

  public StructureDbSearch addStructureSearchDBsItem(StructureSearchDBsEnum structureSearchDBsItem) {
    if (this.structureSearchDBs == null) {
      this.structureSearchDBs = new ArrayList<>();
    }
    this.structureSearchDBs.add(structureSearchDBsItem);
    return this;
  }

   /**
   * Structure databases to search in
   * @return structureSearchDBs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Structure databases to search in")

  public List<StructureSearchDBsEnum> getStructureSearchDBs() {
    return structureSearchDBs;
  }


  public void setStructureSearchDBs(List<StructureSearchDBsEnum> structureSearchDBs) {
    this.structureSearchDBs = structureSearchDBs;
  }


  public StructureDbSearch tagLipids(Boolean tagLipids) {
    
    this.tagLipids = tagLipids;
    return this;
  }

   /**
   * Candidates matching the lipid class estimated by El Gordo will be tagged.  The lipid class will only be available if El Gordo predicts that the MS/MS is a lipid spectrum.  If this parameter is set to &#39;false&#39; El Gordo will still be executed and e.g. improve the fragmentation  tree, but the matching structure candidates will not be tagged if they match lipid class.
   * @return tagLipids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Candidates matching the lipid class estimated by El Gordo will be tagged.  The lipid class will only be available if El Gordo predicts that the MS/MS is a lipid spectrum.  If this parameter is set to 'false' El Gordo will still be executed and e.g. improve the fragmentation  tree, but the matching structure candidates will not be tagged if they match lipid class.")

  public Boolean getTagLipids() {
    return tagLipids;
  }


  public void setTagLipids(Boolean tagLipids) {
    this.tagLipids = tagLipids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructureDbSearch structureDbSearch = (StructureDbSearch) o;
    return Objects.equals(this.enabled, structureDbSearch.enabled) &&
        Objects.equals(this.structureSearchDBs, structureDbSearch.structureSearchDBs) &&
        Objects.equals(this.tagLipids, structureDbSearch.tagLipids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, structureSearchDBs, tagLipids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructureDbSearch {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    structureSearchDBs: ").append(toIndentedString(structureSearchDBs)).append("\n");
    sb.append("    tagLipids: ").append(toIndentedString(tagLipids)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("structureSearchDBs");
    openapiFields.add("tagLipids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StructureDbSearch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StructureDbSearch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StructureDbSearch is not found in the empty JSON string", StructureDbSearch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StructureDbSearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StructureDbSearch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("structureSearchDBs") != null && !jsonObj.get("structureSearchDBs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `structureSearchDBs` to be an array in the JSON string but got `%s`", jsonObj.get("structureSearchDBs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StructureDbSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StructureDbSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StructureDbSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StructureDbSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<StructureDbSearch>() {
           @Override
           public void write(JsonWriter out, StructureDbSearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StructureDbSearch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StructureDbSearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StructureDbSearch
  * @throws IOException if the JSON string is invalid with respect to StructureDbSearch
  */
  public static StructureDbSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StructureDbSearch.class);
  }

 /**
  * Convert an instance of StructureDbSearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

