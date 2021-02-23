package com.sprintBootbackendproduct.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona  implements Serializable{

	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private  Integer id;
		private  String nombre;
		private  String fecha_nacimiento;
		private  Integer edad;
		
		
		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getFecha_nacimiento() {
			return fecha_nacimiento;
		}


		public void setFecha_nacimiento(String fecha_nacimiento) {
			this.fecha_nacimiento = fecha_nacimiento;
		}


		public Integer getEdad() {
			return edad;
		}


		public void setEdad(Integer edad) {
			this.edad = edad;
		}


		private static final long serialVersionUID = -2342429087823139501L;
}
