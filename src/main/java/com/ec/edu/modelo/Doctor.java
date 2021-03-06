package com.ec.edu.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

	
	@Id
	@Column(name ="doct_id")
	private Integer id;
	@Column(name ="doct_cedula")
	private String cedula;
	@Column(name ="doct_nombre")
	private String nombre;
	@Column(name ="doct_apellido")
	private String apellido;
	@Column(name ="doct_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name ="doct_numero_consultorio")
	private Integer numCosultorio;
	@Column(name ="doct_codigo_senecyt")
	private String codigoSenecyt;
	@Column(name ="doct_genero")
	private String genero;
	
	//Relacion: 
	
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	private List<CitaMedica> citaMedica;
	
	
	
	
	//Metodos set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getNumCosultorio() {
		return numCosultorio;
	}
	public void setNumCosultorio(Integer numCosultorio) {
		this.numCosultorio = numCosultorio;
	}
	public String getCodigoSenecyt() {
		return codigoSenecyt;
	}
	public void setCodigoSenecyt(String codigoSenecyt) {
		this.codigoSenecyt = codigoSenecyt;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	

	
	
	
	
}
