package com.dto;

public class MascotaDto {

	private Integer idMascota;
	private String rutDueño;
	private String tipoMascota;
	private String edad;
	private String nombreMascota;
	public MascotaDto() {
	}
	public Integer getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(Integer idMascota) {
		this.idMascota = idMascota;
	}
	public String getRutDueño() {
		return rutDueño;
	}
	public void setRutDueño(String rutDueño) {
		this.rutDueño = rutDueño;
	}
	public String getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	
}
