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
import java.util.ArrayList;
import java.util.List;
/**
 * User/developer friendly parameter subset for the CSI:FingerID structure db search tool.
 */
@Schema(description = "User/developer friendly parameter subset for the CSI:FingerID structure db search tool.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-23T22:11:19.826751Z[Etc/UTC]")
public class StructureDbSearch {
  @SerializedName("enabled")
  private Boolean enabled = null;

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
    public static StructureSearchDBsEnum fromValue(String input) {
      for (StructureSearchDBsEnum b : StructureSearchDBsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StructureSearchDBsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StructureSearchDBsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StructureSearchDBsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StructureSearchDBsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("structureSearchDBs")
  private List<StructureSearchDBsEnum> structureSearchDBs = null;

  @SerializedName("tagLipids")
  private Boolean tagLipids = null;

  public StructureDbSearch enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * tags whether the tool is enabled
   * @return enabled
  **/
  @Schema(description = "tags whether the tool is enabled")
  public Boolean isEnabled() {
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
      this.structureSearchDBs = new ArrayList<StructureSearchDBsEnum>();
    }
    this.structureSearchDBs.add(structureSearchDBsItem);
    return this;
  }

   /**
   * Structure databases to search in
   * @return structureSearchDBs
  **/
  @Schema(description = "Structure databases to search in")
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
   * Candidates matching the lipid class estimated by El Gordo will be tagged.  The lipid class will only be available if El Gordo predicts that the MS/MS is a lipid spectrum.  If this parameter is set to &#x27;false&#x27; El Gordo will still be executed and e.g. improve the fragmentation  tree, but the matching structure candidates will not be tagged if they match lipid class.
   * @return tagLipids
  **/
  @Schema(description = "Candidates matching the lipid class estimated by El Gordo will be tagged.  The lipid class will only be available if El Gordo predicts that the MS/MS is a lipid spectrum.  If this parameter is set to 'false' El Gordo will still be executed and e.g. improve the fragmentation  tree, but the matching structure candidates will not be tagged if they match lipid class.")
  public Boolean isTagLipids() {
    return tagLipids;
  }

  public void setTagLipids(Boolean tagLipids) {
    this.tagLipids = tagLipids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
