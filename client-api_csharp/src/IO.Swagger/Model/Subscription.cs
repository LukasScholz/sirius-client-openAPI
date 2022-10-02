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
    /// Subscription
    /// </summary>
    [DataContract]
        public partial class Subscription :  IEquatable<Subscription>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Subscription" /> class.
        /// </summary>
        /// <param name="sid">sid.</param>
        /// <param name="subscriberId">subscriberId.</param>
        /// <param name="subscriberName">subscriberName.</param>
        /// <param name="expirationDate">expirationDate.</param>
        /// <param name="countQueries">countQueries.</param>
        /// <param name="compoundLimit">compoundLimit.</param>
        /// <param name="compoundHashRecordingTime">compoundHashRecordingTime.</param>
        /// <param name="maxQueriesPerCompound">maxQueriesPerCompound.</param>
        /// <param name="maxUserAccounts">maxUserAccounts.</param>
        /// <param name="serviceUrl">serviceUrl.</param>
        /// <param name="description">description.</param>
        /// <param name="name">name.</param>
        /// <param name="tos">tos.</param>
        /// <param name="pp">pp.</param>
        public Subscription(string sid = default(string), string subscriberId = default(string), string subscriberName = default(string), DateTime? expirationDate = default(DateTime?), bool? countQueries = default(bool?), int? compoundLimit = default(int?), int? compoundHashRecordingTime = default(int?), int? maxQueriesPerCompound = default(int?), int? maxUserAccounts = default(int?), string serviceUrl = default(string), string description = default(string), string name = default(string), string tos = default(string), string pp = default(string))
        {
            this.Sid = sid;
            this.SubscriberId = subscriberId;
            this.SubscriberName = subscriberName;
            this.ExpirationDate = expirationDate;
            this.CountQueries = countQueries;
            this.CompoundLimit = compoundLimit;
            this.CompoundHashRecordingTime = compoundHashRecordingTime;
            this.MaxQueriesPerCompound = maxQueriesPerCompound;
            this.MaxUserAccounts = maxUserAccounts;
            this.ServiceUrl = serviceUrl;
            this.Description = description;
            this.Name = name;
            this.Tos = tos;
            this.Pp = pp;
        }
        
        /// <summary>
        /// Gets or Sets Sid
        /// </summary>
        [DataMember(Name="sid", EmitDefaultValue=false)]
        public string Sid { get; set; }

        /// <summary>
        /// Gets or Sets SubscriberId
        /// </summary>
        [DataMember(Name="subscriberId", EmitDefaultValue=false)]
        public string SubscriberId { get; set; }

        /// <summary>
        /// Gets or Sets SubscriberName
        /// </summary>
        [DataMember(Name="subscriberName", EmitDefaultValue=false)]
        public string SubscriberName { get; set; }

        /// <summary>
        /// Gets or Sets ExpirationDate
        /// </summary>
        [DataMember(Name="expirationDate", EmitDefaultValue=false)]
        public DateTime? ExpirationDate { get; set; }

        /// <summary>
        /// Gets or Sets CountQueries
        /// </summary>
        [DataMember(Name="countQueries", EmitDefaultValue=false)]
        public bool? CountQueries { get; set; }

        /// <summary>
        /// Gets or Sets CompoundLimit
        /// </summary>
        [DataMember(Name="compoundLimit", EmitDefaultValue=false)]
        public int? CompoundLimit { get; set; }

        /// <summary>
        /// Gets or Sets CompoundHashRecordingTime
        /// </summary>
        [DataMember(Name="compoundHashRecordingTime", EmitDefaultValue=false)]
        public int? CompoundHashRecordingTime { get; set; }

        /// <summary>
        /// Gets or Sets MaxQueriesPerCompound
        /// </summary>
        [DataMember(Name="maxQueriesPerCompound", EmitDefaultValue=false)]
        public int? MaxQueriesPerCompound { get; set; }

        /// <summary>
        /// Gets or Sets MaxUserAccounts
        /// </summary>
        [DataMember(Name="maxUserAccounts", EmitDefaultValue=false)]
        public int? MaxUserAccounts { get; set; }

        /// <summary>
        /// Gets or Sets ServiceUrl
        /// </summary>
        [DataMember(Name="serviceUrl", EmitDefaultValue=false)]
        public string ServiceUrl { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Tos
        /// </summary>
        [DataMember(Name="tos", EmitDefaultValue=false)]
        public string Tos { get; set; }

        /// <summary>
        /// Gets or Sets Pp
        /// </summary>
        [DataMember(Name="pp", EmitDefaultValue=false)]
        public string Pp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Subscription {\n");
            sb.Append("  Sid: ").Append(Sid).Append("\n");
            sb.Append("  SubscriberId: ").Append(SubscriberId).Append("\n");
            sb.Append("  SubscriberName: ").Append(SubscriberName).Append("\n");
            sb.Append("  ExpirationDate: ").Append(ExpirationDate).Append("\n");
            sb.Append("  CountQueries: ").Append(CountQueries).Append("\n");
            sb.Append("  CompoundLimit: ").Append(CompoundLimit).Append("\n");
            sb.Append("  CompoundHashRecordingTime: ").Append(CompoundHashRecordingTime).Append("\n");
            sb.Append("  MaxQueriesPerCompound: ").Append(MaxQueriesPerCompound).Append("\n");
            sb.Append("  MaxUserAccounts: ").Append(MaxUserAccounts).Append("\n");
            sb.Append("  ServiceUrl: ").Append(ServiceUrl).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Tos: ").Append(Tos).Append("\n");
            sb.Append("  Pp: ").Append(Pp).Append("\n");
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
            return this.Equals(input as Subscription);
        }

        /// <summary>
        /// Returns true if Subscription instances are equal
        /// </summary>
        /// <param name="input">Instance of Subscription to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Subscription input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Sid == input.Sid ||
                    (this.Sid != null &&
                    this.Sid.Equals(input.Sid))
                ) && 
                (
                    this.SubscriberId == input.SubscriberId ||
                    (this.SubscriberId != null &&
                    this.SubscriberId.Equals(input.SubscriberId))
                ) && 
                (
                    this.SubscriberName == input.SubscriberName ||
                    (this.SubscriberName != null &&
                    this.SubscriberName.Equals(input.SubscriberName))
                ) && 
                (
                    this.ExpirationDate == input.ExpirationDate ||
                    (this.ExpirationDate != null &&
                    this.ExpirationDate.Equals(input.ExpirationDate))
                ) && 
                (
                    this.CountQueries == input.CountQueries ||
                    (this.CountQueries != null &&
                    this.CountQueries.Equals(input.CountQueries))
                ) && 
                (
                    this.CompoundLimit == input.CompoundLimit ||
                    (this.CompoundLimit != null &&
                    this.CompoundLimit.Equals(input.CompoundLimit))
                ) && 
                (
                    this.CompoundHashRecordingTime == input.CompoundHashRecordingTime ||
                    (this.CompoundHashRecordingTime != null &&
                    this.CompoundHashRecordingTime.Equals(input.CompoundHashRecordingTime))
                ) && 
                (
                    this.MaxQueriesPerCompound == input.MaxQueriesPerCompound ||
                    (this.MaxQueriesPerCompound != null &&
                    this.MaxQueriesPerCompound.Equals(input.MaxQueriesPerCompound))
                ) && 
                (
                    this.MaxUserAccounts == input.MaxUserAccounts ||
                    (this.MaxUserAccounts != null &&
                    this.MaxUserAccounts.Equals(input.MaxUserAccounts))
                ) && 
                (
                    this.ServiceUrl == input.ServiceUrl ||
                    (this.ServiceUrl != null &&
                    this.ServiceUrl.Equals(input.ServiceUrl))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Tos == input.Tos ||
                    (this.Tos != null &&
                    this.Tos.Equals(input.Tos))
                ) && 
                (
                    this.Pp == input.Pp ||
                    (this.Pp != null &&
                    this.Pp.Equals(input.Pp))
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
                if (this.Sid != null)
                    hashCode = hashCode * 59 + this.Sid.GetHashCode();
                if (this.SubscriberId != null)
                    hashCode = hashCode * 59 + this.SubscriberId.GetHashCode();
                if (this.SubscriberName != null)
                    hashCode = hashCode * 59 + this.SubscriberName.GetHashCode();
                if (this.ExpirationDate != null)
                    hashCode = hashCode * 59 + this.ExpirationDate.GetHashCode();
                if (this.CountQueries != null)
                    hashCode = hashCode * 59 + this.CountQueries.GetHashCode();
                if (this.CompoundLimit != null)
                    hashCode = hashCode * 59 + this.CompoundLimit.GetHashCode();
                if (this.CompoundHashRecordingTime != null)
                    hashCode = hashCode * 59 + this.CompoundHashRecordingTime.GetHashCode();
                if (this.MaxQueriesPerCompound != null)
                    hashCode = hashCode * 59 + this.MaxQueriesPerCompound.GetHashCode();
                if (this.MaxUserAccounts != null)
                    hashCode = hashCode * 59 + this.MaxUserAccounts.GetHashCode();
                if (this.ServiceUrl != null)
                    hashCode = hashCode * 59 + this.ServiceUrl.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Tos != null)
                    hashCode = hashCode * 59 + this.Tos.GetHashCode();
                if (this.Pp != null)
                    hashCode = hashCode * 59 + this.Pp.GetHashCode();
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
