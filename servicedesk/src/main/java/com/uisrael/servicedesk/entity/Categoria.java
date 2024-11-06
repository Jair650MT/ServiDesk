package com.uisrael.servicedesk.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "tblCategoria")
@NoArgsConstructor
@ToString
public class Categoria implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCat;
	private String descripcion;
	
	@OneToMany(mappedBy = "categoria",cascade = CascadeType.REFRESH)
	private List<Ticket>tickets=new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "idTipo")
	private Tipo tipo;
}
