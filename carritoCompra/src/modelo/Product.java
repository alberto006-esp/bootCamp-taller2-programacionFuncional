package modelo;

import java.math.BigDecimal;

import enumerador.Tax;

public class Product implements Comparable<Product>{
	private String nombre;
	private BigDecimal precio;
	private Tax tipoIva;

	public Product(String nombre, BigDecimal precio, Tax tipoIva) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.tipoIva = tipoIva;
	}

	public Product() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Tax getTipoIva() {
		return tipoIva;
	}

	public void setTipoIva(Tax tipoIva) {
		this.tipoIva = tipoIva;
	}

	@Override
	public String toString() {
		return "Product [nombre=" + nombre + ", precio=" + precio + ", tipoIva=" + tipoIva + "]";
	}

	@Override
	public int compareTo(Product o) {
		return this.nombre.compareTo(o.getNombre());
	}


}
