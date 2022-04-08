package enumerador;

import java.math.BigDecimal;

public enum Tax {
	SUPERREDUCED(new BigDecimal("1.04")), REDUCED(new BigDecimal("1.10")), NORMAL(new BigDecimal("1.21"));

	private  BigDecimal precio;

	private Tax(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
}
