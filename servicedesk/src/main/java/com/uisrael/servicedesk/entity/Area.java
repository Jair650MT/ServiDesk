package com.uisrael.servicedesk.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tblArea")
@Data
@NoArgsConstructor
@ToString
public class Area implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idArea;
	private String nombreArea;
	private String descripcionArea;
	
	@OneToMany(mappedBy = "area",cascade = CascadeType.REFRESH)
	private List<Empleado>empleados=new ArrayList<>();

}
