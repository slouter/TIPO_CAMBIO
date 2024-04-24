package com.dev.cambio.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cambio")
public class TipoCambio  {
	
	@Id
	@Column(name = "indentificador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int x_ident;
	
	@Column(name = "descripcion")
	private String x_desc;
	
	@Column(name = "estado")
	private int x_estado;
	
	@Column(name = "intervalo_1")
	private double x_inter1;
	
	@Column(name = "tccompra_1")
	private double x_tccompra1;
	
	@Column(name = "tcventa_1")
	private double x_tcventa1;
	
	@Column(name = "intervalo_2")
	private double x_inter2;
	
	@Column(name = "tccompra_2")
	private double x_tccompra2;
	
	@Column(name = "tcventa_2")
	private double x_tcventa2;
	
	@Column(name = "intervalo_3")
	private double x_inter3;
	
	@Column(name = "tccompra_3")
	private double x_tccompra3;
	
	@Column(name = "tcventa_3")
	private double x_tcventa3;
	
	@Column(name = "intervalo_4")
	private double x_inter4;
	
	@Column(name = "tccompra_4")
	private double x_tccompra4;
	
	@Column(name = "tcventa_4")
	private double x_tcventa4;
	
	@Column(name = "intervalo_5")
	private double x_inter5;
	
	@Column(name = "tccompra_5")
	private double x_tccompra5;
	
	@Column(name = "tcventa_5")
	private double x_tcventa5;

	public TipoCambio() {		
	}

	public TipoCambio(int x_ident, String x_desc, int x_estado, double x_inter1, double x_tccompra1, double x_tcventa1,
			double x_inter2, double x_tccompra2, double x_tcventa2, double x_inter3, double x_tccompra3,
			double x_tcventa3, double x_inter4, double x_tccompra4, double x_tcventa4, double x_inter5,
			double x_tccompra5, double x_tcventa5) {
		this.x_ident = x_ident;
		this.x_desc = x_desc;
		this.x_estado = x_estado;
		this.x_inter1 = x_inter1;
		this.x_tccompra1 = x_tccompra1;
		this.x_tcventa1 = x_tcventa1;
		this.x_inter2 = x_inter2;
		this.x_tccompra2 = x_tccompra2;
		this.x_tcventa2 = x_tcventa2;
		this.x_inter3 = x_inter3;
		this.x_tccompra3 = x_tccompra3;
		this.x_tcventa3 = x_tcventa3;
		this.x_inter4 = x_inter4;
		this.x_tccompra4 = x_tccompra4;
		this.x_tcventa4 = x_tcventa4;
		this.x_inter5 = x_inter5;
		this.x_tccompra5 = x_tccompra5;
		this.x_tcventa5 = x_tcventa5;
	}

	public int getX_ident() {
		return x_ident;
	}

	public void setX_ident(int x_ident) {
		this.x_ident = x_ident;
	}

	public String getX_desc() {
		return x_desc;
	}

	public void setX_desc(String x_desc) {
		this.x_desc = x_desc;
	}

	public int getX_estado() {
		return x_estado;
	}

	public void setX_estado(int x_estado) {
		this.x_estado = x_estado;
	}

	public double getX_inter1() {
		return x_inter1;
	}

	public void setX_inter1(double x_inter1) {
		this.x_inter1 = x_inter1;
	}

	public double getX_tccompra1() {
		return x_tccompra1;
	}

	public void setX_tccompra1(double x_tccompra1) {
		this.x_tccompra1 = x_tccompra1;
	}

	public double getX_tcventa1() {
		return x_tcventa1;
	}

	public void setX_tcventa1(double x_tcventa1) {
		this.x_tcventa1 = x_tcventa1;
	}

	public double getX_inter2() {
		return x_inter2;
	}

	public void setX_inter2(double x_inter2) {
		this.x_inter2 = x_inter2;
	}

	public double getX_tccompra2() {
		return x_tccompra2;
	}

	public void setX_tccompra2(double x_tccompra2) {
		this.x_tccompra2 = x_tccompra2;
	}

	public double getX_tcventa2() {
		return x_tcventa2;
	}

	public void setX_tcventa2(double x_tcventa2) {
		this.x_tcventa2 = x_tcventa2;
	}

	public double getX_inter3() {
		return x_inter3;
	}

	public void setX_inter3(double x_inter3) {
		this.x_inter3 = x_inter3;
	}

	public double getX_tccompra3() {
		return x_tccompra3;
	}

	public void setX_tccompra3(double x_tccompra3) {
		this.x_tccompra3 = x_tccompra3;
	}

	public double getX_tcventa3() {
		return x_tcventa3;
	}

	public void setX_tcventa3(double x_tcventa3) {
		this.x_tcventa3 = x_tcventa3;
	}

	public double getX_inter4() {
		return x_inter4;
	}

	public void setX_inter4(double x_inter4) {
		this.x_inter4 = x_inter4;
	}

	public double getX_tccompra4() {
		return x_tccompra4;
	}

	public void setX_tccompra4(double x_tccompra4) {
		this.x_tccompra4 = x_tccompra4;
	}

	public double getX_tcventa4() {
		return x_tcventa4;
	}

	public void setX_tcventa4(double x_tcventa4) {
		this.x_tcventa4 = x_tcventa4;
	}

	public double getX_inter5() {
		return x_inter5;
	}

	public void setX_inter5(double x_inter5) {
		this.x_inter5 = x_inter5;
	}

	public double getX_tccompra5() {
		return x_tccompra5;
	}

	public void setX_tccompra5(double x_tccompra5) {
		this.x_tccompra5 = x_tccompra5;
	}

	public double getX_tcventa5() {
		return x_tcventa5;
	}

	public void setX_tcventa5(double x_tcventa5) {
		this.x_tcventa5 = x_tcventa5;
	}

	@Override
	public String toString() {
		return "tipoCambio [x_ident=" + x_ident + ", x_desc=" + x_desc + ", x_estado=" + x_estado + ", x_inter1="
				+ x_inter1 + ", x_tccompra1=" + x_tccompra1 + ", x_tcventa1=" + x_tcventa1 + ", x_inter2=" + x_inter2
				+ ", x_tccompra2=" + x_tccompra2 + ", x_tcventa2=" + x_tcventa2 + ", x_inter3=" + x_inter3
				+ ", x_tccompra3=" + x_tccompra3 + ", x_tcventa3=" + x_tcventa3 + ", x_inter4=" + x_inter4
				+ ", x_tccompra4=" + x_tccompra4 + ", x_tcventa4=" + x_tcventa4 + ", x_inter5=" + x_inter5
				+ ", x_tccompra5=" + x_tccompra5 + ", x_tcventa5=" + x_tcventa5 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x_desc, x_estado, x_ident, x_inter1, x_inter2, x_inter3, x_inter4, x_inter5, x_tccompra1,
				x_tccompra2, x_tccompra3, x_tccompra4, x_tccompra5, x_tcventa1, x_tcventa2, x_tcventa3, x_tcventa4,
				x_tcventa5);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoCambio other = (TipoCambio) obj;
		return Objects.equals(x_desc, other.x_desc) && x_estado == other.x_estado && x_ident == other.x_ident
				&& Double.doubleToLongBits(x_inter1) == Double.doubleToLongBits(other.x_inter1)
				&& Double.doubleToLongBits(x_inter2) == Double.doubleToLongBits(other.x_inter2)
				&& Double.doubleToLongBits(x_inter3) == Double.doubleToLongBits(other.x_inter3)
				&& Double.doubleToLongBits(x_inter4) == Double.doubleToLongBits(other.x_inter4)
				&& Double.doubleToLongBits(x_inter5) == Double.doubleToLongBits(other.x_inter5)
				&& Double.doubleToLongBits(x_tccompra1) == Double.doubleToLongBits(other.x_tccompra1)
				&& Double.doubleToLongBits(x_tccompra2) == Double.doubleToLongBits(other.x_tccompra2)
				&& Double.doubleToLongBits(x_tccompra3) == Double.doubleToLongBits(other.x_tccompra3)
				&& Double.doubleToLongBits(x_tccompra4) == Double.doubleToLongBits(other.x_tccompra4)
				&& Double.doubleToLongBits(x_tccompra5) == Double.doubleToLongBits(other.x_tccompra5)
				&& Double.doubleToLongBits(x_tcventa1) == Double.doubleToLongBits(other.x_tcventa1)
				&& Double.doubleToLongBits(x_tcventa2) == Double.doubleToLongBits(other.x_tcventa2)
				&& Double.doubleToLongBits(x_tcventa3) == Double.doubleToLongBits(other.x_tcventa3)
				&& Double.doubleToLongBits(x_tcventa4) == Double.doubleToLongBits(other.x_tcventa4)
				&& Double.doubleToLongBits(x_tcventa5) == Double.doubleToLongBits(other.x_tcventa5);
	}
	
	
	
	
}
