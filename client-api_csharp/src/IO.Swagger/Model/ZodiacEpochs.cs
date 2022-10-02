/* 
 * SIRIUS Nightsky API
 *
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
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
    /// ZodiacEpochs
    /// </summary>
    [DataContract]
        public partial class ZodiacEpochs :  IEquatable<ZodiacEpochs>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ZodiacEpochs" /> class.
        /// </summary>
        /// <param name="iterations">iterations.</param>
        /// <param name="burnInPeriod">burnInPeriod.</param>
        /// <param name="numberOfMarkovChains">numberOfMarkovChains.</param>
        /// <param name="identifier">identifier.</param>
        public ZodiacEpochs(int? iterations = default(int?), int? burnInPeriod = default(int?), int? numberOfMarkovChains = default(int?), string identifier = default(string))
        {
            this.Iterations = iterations;
            this.BurnInPeriod = burnInPeriod;
            this.NumberOfMarkovChains = numberOfMarkovChains;
            this.Identifier = identifier;
        }
        
        /// <summary>
        /// Gets or Sets Iterations
        /// </summary>
        [DataMember(Name="iterations", EmitDefaultValue=false)]
        public int? Iterations { get; set; }

        /// <summary>
        /// Gets or Sets BurnInPeriod
        /// </summary>
        [DataMember(Name="burnInPeriod", EmitDefaultValue=false)]
        public int? BurnInPeriod { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfMarkovChains
        /// </summary>
        [DataMember(Name="numberOfMarkovChains", EmitDefaultValue=false)]
        public int? NumberOfMarkovChains { get; set; }

        /// <summary>
        /// Gets or Sets Identifier
        /// </summary>
        [DataMember(Name="identifier", EmitDefaultValue=false)]
        public string Identifier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ZodiacEpochs {\n");
            sb.Append("  Iterations: ").Append(Iterations).Append("\n");
            sb.Append("  BurnInPeriod: ").Append(BurnInPeriod).Append("\n");
            sb.Append("  NumberOfMarkovChains: ").Append(NumberOfMarkovChains).Append("\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
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
            return this.Equals(input as ZodiacEpochs);
        }

        /// <summary>
        /// Returns true if ZodiacEpochs instances are equal
        /// </summary>
        /// <param name="input">Instance of ZodiacEpochs to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ZodiacEpochs input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Iterations == input.Iterations ||
                    (this.Iterations != null &&
                    this.Iterations.Equals(input.Iterations))
                ) && 
                (
                    this.BurnInPeriod == input.BurnInPeriod ||
                    (this.BurnInPeriod != null &&
                    this.BurnInPeriod.Equals(input.BurnInPeriod))
                ) && 
                (
                    this.NumberOfMarkovChains == input.NumberOfMarkovChains ||
                    (this.NumberOfMarkovChains != null &&
                    this.NumberOfMarkovChains.Equals(input.NumberOfMarkovChains))
                ) && 
                (
                    this.Identifier == input.Identifier ||
                    (this.Identifier != null &&
                    this.Identifier.Equals(input.Identifier))
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
                if (this.Iterations != null)
                    hashCode = hashCode * 59 + this.Iterations.GetHashCode();
                if (this.BurnInPeriod != null)
                    hashCode = hashCode * 59 + this.BurnInPeriod.GetHashCode();
                if (this.NumberOfMarkovChains != null)
                    hashCode = hashCode * 59 + this.NumberOfMarkovChains.GetHashCode();
                if (this.Identifier != null)
                    hashCode = hashCode * 59 + this.Identifier.GetHashCode();
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
