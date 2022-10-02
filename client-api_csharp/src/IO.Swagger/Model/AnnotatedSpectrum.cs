/* 
 * Sirius Nightsky Middleware API
 *
 * Sirius Nightsky Middleware API
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// AnnotatedSpectrum
    /// </summary>
    [DataContract]
        public partial class AnnotatedSpectrum :  IEquatable<AnnotatedSpectrum>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AnnotatedSpectrum" /> class.
        /// </summary>
        /// <param name="collisionEnergy">collisionEnergy.</param>
        /// <param name="empty">empty.</param>
        /// <param name="intensities">intensities.</param>
        /// <param name="masses">masses.</param>
        /// <param name="maxIntensity">maxIntensity.</param>
        /// <param name="msLevel">msLevel.</param>
        public AnnotatedSpectrum(CollisionEnergy collisionEnergy = default(CollisionEnergy), bool? empty = default(bool?), List<double?> intensities = default(List<double?>), List<double?> masses = default(List<double?>), double? maxIntensity = default(double?), int? msLevel = default(int?))
        {
            this.CollisionEnergy = collisionEnergy;
            this.Empty = empty;
            this.Intensities = intensities;
            this.Masses = masses;
            this.MaxIntensity = maxIntensity;
            this.MsLevel = msLevel;
        }
        
        /// <summary>
        /// Gets or Sets CollisionEnergy
        /// </summary>
        [DataMember(Name="collisionEnergy", EmitDefaultValue=false)]
        public CollisionEnergy CollisionEnergy { get; set; }

        /// <summary>
        /// Gets or Sets Empty
        /// </summary>
        [DataMember(Name="empty", EmitDefaultValue=false)]
        public bool? Empty { get; set; }

        /// <summary>
        /// Gets or Sets Intensities
        /// </summary>
        [DataMember(Name="intensities", EmitDefaultValue=false)]
        public List<double?> Intensities { get; set; }

        /// <summary>
        /// Gets or Sets Masses
        /// </summary>
        [DataMember(Name="masses", EmitDefaultValue=false)]
        public List<double?> Masses { get; set; }

        /// <summary>
        /// Gets or Sets MaxIntensity
        /// </summary>
        [DataMember(Name="maxIntensity", EmitDefaultValue=false)]
        public double? MaxIntensity { get; set; }

        /// <summary>
        /// Gets or Sets MsLevel
        /// </summary>
        [DataMember(Name="msLevel", EmitDefaultValue=false)]
        public int? MsLevel { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AnnotatedSpectrum {\n");
            sb.Append("  CollisionEnergy: ").Append(CollisionEnergy).Append("\n");
            sb.Append("  Empty: ").Append(Empty).Append("\n");
            sb.Append("  Intensities: ").Append(Intensities).Append("\n");
            sb.Append("  Masses: ").Append(Masses).Append("\n");
            sb.Append("  MaxIntensity: ").Append(MaxIntensity).Append("\n");
            sb.Append("  MsLevel: ").Append(MsLevel).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AnnotatedSpectrum);
        }

        /// <summary>
        /// Returns true if AnnotatedSpectrum instances are equal
        /// </summary>
        /// <param name="input">Instance of AnnotatedSpectrum to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AnnotatedSpectrum input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CollisionEnergy == input.CollisionEnergy ||
                    (this.CollisionEnergy != null &&
                    this.CollisionEnergy.Equals(input.CollisionEnergy))
                ) && 
                (
                    this.Empty == input.Empty ||
                    (this.Empty != null &&
                    this.Empty.Equals(input.Empty))
                ) && 
                (
                    this.Intensities == input.Intensities ||
                    this.Intensities != null &&
                    input.Intensities != null &&
                    this.Intensities.SequenceEqual(input.Intensities)
                ) && 
                (
                    this.Masses == input.Masses ||
                    this.Masses != null &&
                    input.Masses != null &&
                    this.Masses.SequenceEqual(input.Masses)
                ) && 
                (
                    this.MaxIntensity == input.MaxIntensity ||
                    (this.MaxIntensity != null &&
                    this.MaxIntensity.Equals(input.MaxIntensity))
                ) && 
                (
                    this.MsLevel == input.MsLevel ||
                    (this.MsLevel != null &&
                    this.MsLevel.Equals(input.MsLevel))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.CollisionEnergy != null)
                    hashCode = hashCode * 59 + this.CollisionEnergy.GetHashCode();
                if (this.Empty != null)
                    hashCode = hashCode * 59 + this.Empty.GetHashCode();
                if (this.Intensities != null)
                    hashCode = hashCode * 59 + this.Intensities.GetHashCode();
                if (this.Masses != null)
                    hashCode = hashCode * 59 + this.Masses.GetHashCode();
                if (this.MaxIntensity != null)
                    hashCode = hashCode * 59 + this.MaxIntensity.GetHashCode();
                if (this.MsLevel != null)
                    hashCode = hashCode * 59 + this.MsLevel.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}
