package com.uisrael.servicedesk.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "tblUsuario")
@NoArgsConstructor
@ToString
public class Usuario implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String nombreUsuario;
	private String password;
	
	@ManyToMany(mappedBy = "usuarios",cascade = CascadeType.REFRESH)
	private List<Rol>roles=new ArrayList<>();
	
	@OneToOne(mappedBy = "usuario",cascade = CascadeType.REFRESH)
	private Empleado empleado;
}
