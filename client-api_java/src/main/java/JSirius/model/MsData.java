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
import JSirius.model.AnnotatedSpectrum;
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
 * The MsData wraps all spectral input data belonging to a compound.   Each compound has:  - One merged MS/MS spectrum (optional)  - One merged MS spectrum (optional)  - many MS/MS spectra  - many MS spectra   Each non-merged spectrum has an index which can be used to access the spectrum.   In the future we might add some additional information like chromatographic peak or something similar
 */
@Schema(description = "The MsData wraps all spectral input data belonging to a compound.   Each compound has:  - One merged MS/MS spectrum (optional)  - One merged MS spectrum (optional)  - many MS/MS spectra  - many MS spectra   Each non-merged spectrum has an index which can be used to access the spectrum.   In the future we might add some additional information like chromatographic peak or something similar")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-20T13:59:58.470730Z[Etc/UTC]")
public class MsData {
  @SerializedName("mergedMs1")
  private AnnotatedSpectrum mergedMs1 = null;

  @SerializedName("mergedMs2")
  private AnnotatedSpectrum mergedMs2 = null;

  @SerializedName("ms2Spectra")
  private List<AnnotatedSpectrum> ms2Spectra = null;

  @SerializedName("ms1Spectra")
  private List<AnnotatedSpectrum> ms1Spectra = null;

  public MsData mergedMs1(AnnotatedSpectrum mergedMs1) {
    this.mergedMs1 = mergedMs1;
    return this;
  }

   /**
   * Get mergedMs1
   * @return mergedMs1
  **/
  @Schema(description = "")
  public AnnotatedSpectrum getMergedMs1() {
    return mergedMs1;
  }

  public void setMergedMs1(AnnotatedSpectrum mergedMs1) {
    this.mergedMs1 = mergedMs1;
  }

  public MsData mergedMs2(AnnotatedSpectrum mergedMs2) {
    this.mergedMs2 = mergedMs2;
    return this;
  }

   /**
   * Get mergedMs2
   * @return mergedMs2
  **/
  @Schema(description = "")
  public AnnotatedSpectrum getMergedMs2() {
    return mergedMs2;
  }

  public void setMergedMs2(AnnotatedSpectrum mergedMs2) {
    this.mergedMs2 = mergedMs2;
  }

  public MsData ms2Spectra(List<AnnotatedSpectrum> ms2Spectra) {
    this.ms2Spectra = ms2Spectra;
    return this;
  }

  public MsData addMs2SpectraItem(AnnotatedSpectrum ms2SpectraItem) {
    if (this.ms2Spectra == null) {
      this.ms2Spectra = new ArrayList<AnnotatedSpectrum>();
    }
    this.ms2Spectra.add(ms2SpectraItem);
    return this;
  }

   /**
   * Get ms2Spectra
   * @return ms2Spectra
  **/
  @Schema(description = "")
  public List<AnnotatedSpectrum> getMs2Spectra() {
    return ms2Spectra;
  }

  public void setMs2Spectra(List<AnnotatedSpectrum> ms2Spectra) {
    this.ms2Spectra = ms2Spectra;
  }

  public MsData ms1Spectra(List<AnnotatedSpectrum> ms1Spectra) {
    this.ms1Spectra = ms1Spectra;
    return this;
  }

  public MsData addMs1SpectraItem(AnnotatedSpectrum ms1SpectraItem) {
    if (this.ms1Spectra == null) {
      this.ms1Spectra = new ArrayList<AnnotatedSpectrum>();
    }
    this.ms1Spectra.add(ms1SpectraItem);
    return this;
  }

   /**
   * Get ms1Spectra
   * @return ms1Spectra
  **/
  @Schema(description = "")
  public List<AnnotatedSpectrum> getMs1Spectra() {
    return ms1Spectra;
  }

  public void setMs1Spectra(List<AnnotatedSpectrum> ms1Spectra) {
    this.ms1Spectra = ms1Spectra;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsData msData = (MsData) o;
    return Objects.equals(this.mergedMs1, msData.mergedMs1) &&
        Objects.equals(this.mergedMs2, msData.mergedMs2) &&
        Objects.equals(this.ms2Spectra, msData.ms2Spectra) &&
        Objects.equals(this.ms1Spectra, msData.ms1Spectra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergedMs1, mergedMs2, ms2Spectra, ms1Spectra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsData {\n");
    
    sb.append("    mergedMs1: ").append(toIndentedString(mergedMs1)).append("\n");
    sb.append("    mergedMs2: ").append(toIndentedString(mergedMs2)).append("\n");
    sb.append("    ms2Spectra: ").append(toIndentedString(ms2Spectra)).append("\n");
    sb.append("    ms1Spectra: ").append(toIndentedString(ms1Spectra)).append("\n");
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
