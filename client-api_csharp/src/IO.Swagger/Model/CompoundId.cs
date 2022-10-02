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
    /// CompoundId
    /// </summary>
    [DataContract]
        public partial class CompoundId :  IEquatable<CompoundId>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompoundId" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="index">index.</param>
        /// <param name="ionMass">ionMass.</param>
        /// <param name="ionType">ionType.</param>
        /// <param name="name">name.</param>
        public CompoundId(string id = default(string), long? index = default(long?), double? ionMass = default(double?), string ionType = default(string), string name = default(string))
        {
            this.Id = id;
            this.Index = index;
            this.IonMass = ionMass;
            this.IonType = ionType;
            this.Name = name;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Index
        /// </summary>
        [DataMember(Name="index", EmitDefaultValue=false)]
        public long? Index { get; set; }

        /// <summary>
        /// Gets or Sets IonMass
        /// </summary>
        [DataMember(Name="ionMass", EmitDefaultValue=false)]
        public double? IonMass { get; set; }

        /// <summary>
        /// Gets or Sets IonType
        /// </summary>
        [DataMember(Name="ionType", EmitDefaultValue=false)]
        public string IonType { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CompoundId {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  IonMass: ").Append(IonMass).Append("\n");
            sb.Append("  IonType: ").Append(IonType).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return this.Equals(input as CompoundId);
        }

        /// <summary>
        /// Returns true if CompoundId instances are equal
        /// </summary>
        /// <param name="input">Instance of CompoundId to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CompoundId input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Index == input.Index ||
                    (this.Index != null &&
                    this.Index.Equals(input.Index))
                ) && 
                (
                    this.IonMass == input.IonMass ||
                    (this.IonMass != null &&
                    this.IonMass.Equals(input.IonMass))
                ) && 
                (
                    this.IonType == input.IonType ||
                    (this.IonType != null &&
                    this.IonType.Equals(input.IonType))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Index != null)
                    hashCode = hashCode * 59 + this.Index.GetHashCode();
                if (this.IonMass != null)
                    hashCode = hashCode * 59 + this.IonMass.GetHashCode();
                if (this.IonType != null)
                    hashCode = hashCode * 59 + this.IonType.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
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
