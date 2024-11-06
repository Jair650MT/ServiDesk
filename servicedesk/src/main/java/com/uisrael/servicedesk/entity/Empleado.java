package com.uisrael.servicedesk.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tblEmpleado")
@Data
@NoArgsConstructor
@ToString
public class Empleado implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmpleado;
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private String email;
	private String cargo;
	private boolean estado;
	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "idArea")
	private Area area;
	

}
