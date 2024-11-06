package com.uisrael.servicedesk.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "tblRol")
@NoArgsConstructor
@ToString
public class Rol implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreRol;
	private String descripcion;
	private String status;
	
	@ManyToMany(cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
	@JoinTable(name = "tblAsignacion",
	joinColumns = @JoinColumn(name="idRol"),
	inverseJoinColumns = @JoinColumn(name="idUsuario"))
	private List<Usuario>usuarios=new ArrayList<>();
	}
