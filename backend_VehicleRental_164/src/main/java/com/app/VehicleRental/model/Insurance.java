package com.app.VehicleRental.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.VehicleRental.model.RoadsideAssistance;
import com.app.VehicleRental.model.Verfication;
import com.app.VehicleRental.model.Payment;
import com.app.VehicleRental.model.ServiceCrew;
import com.app.VehicleRental.model.Insurance;
import com.app.VehicleRental.model.ExtendBooking;
import com.app.VehicleRental.model.Booking;
import com.app.VehicleRental.model.RentalCompany;
import com.app.VehicleRental.model.ReturnBikeInspection;
import com.app.VehicleRental.model.Customer;
import com.app.VehicleRental.model.Bike;
import com.app.VehicleRental.model.ReturnRentedBike;
import com.app.VehicleRental.enums.IDTypes;
import com.app.VehicleRental.converter.IDTypesConverter;
import com.app.VehicleRental.converter.DurationConverter;
import com.app.VehicleRental.converter.UUIDToByteConverter;
import com.app.VehicleRental.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Insurance")
@Table(name = "\"Insurance\"", schema =  "\"vehiclerental_434\"")
@Data
                        
public class Insurance {
	public Insurance () {   
  }
	  
  @Column(name = "\"InsuranceCompany\"", nullable = true )
  private String insuranceCompany;
  
	  
  @Column(name = "\"InsurancePolicy\"", nullable = true )
  private Boolean insurancePolicy;
  
	  
  @Column(name = "\"BikeModel\"", nullable = true )
  private String bikeModel;
  
	  
  @Column(name = "\"DateOfBooking\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date dateOfBooking;  
  
	  
  @Column(name = "\"Manufacturer\"", nullable = true )
  private String manufacturer;
  
	  
  @Column(name = "\"CustomerID\"", nullable = true )
  private Integer customerID;
  
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"InsuranceID\"", nullable = true )
  private Integer insuranceID;
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Insurance [" 
  + "InsuranceCompany= " + insuranceCompany  + ", " 
  + "InsurancePolicy= " + insurancePolicy  + ", " 
  + "BikeModel= " + bikeModel  + ", " 
  + "DateOfBooking= " + dateOfBooking  + ", " 
  + "Manufacturer= " + manufacturer  + ", " 
  + "CustomerID= " + customerID  + ", " 
  + "InsuranceID= " + insuranceID 
 + "]";
	}
	
}