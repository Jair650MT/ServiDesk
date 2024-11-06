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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tblSolucion")
@Data
@NoArgsConstructor
@ToString
public class Solucion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSolucion;
	private String descripSolucion;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate fechaSolucion;
	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="idTicket")
	private Ticket ticket;

}
