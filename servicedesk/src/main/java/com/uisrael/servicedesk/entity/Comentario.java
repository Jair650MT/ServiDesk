package com.uisrael.servicedesk.entity;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "tblComentario")
@NoArgsConstructor
@ToString
public class Comentario implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idComent;
	private String descripcion;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate fechaComent;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "idTiket")
	private Ticket ticket;
	
}
