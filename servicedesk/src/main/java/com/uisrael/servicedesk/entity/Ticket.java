package com.uisrael.servicedesk.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tblTicket")
@Data
@NoArgsConstructor
@ToString
public class Ticket implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTicket;
	private String tituloTicket;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate fechaCreacion;
	private String prioridad;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "Usuario")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "ticket",cascade = CascadeType.REFRESH)
	private List<Comentario>comentario=new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "idProyecto")
	private Proyecto proyecto;
	
	@OneToOne(mappedBy = "ticket",cascade = CascadeType.REFRESH)
	private Solucion solucion;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "idCategoria")
	private Categoria categoria;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "idEstado")
	private Estado estado;
	
}
