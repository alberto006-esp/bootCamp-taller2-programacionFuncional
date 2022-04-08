package controlador;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import modelo.Product;

public class CarritoControler {
		public static BigDecimal precioTotal= new BigDecimal("0");
		public static BigDecimal precioConIva= new BigDecimal("0");

	public CarritoControler() {
	}

	public static BigDecimal calcularTotal(List<Product> carritoCompra) {
	
		carritoCompra.stream().forEach(product ->{
			precioConIva=product.getPrecio().multiply(product.getTipoIva().getPrecio());
			precioTotal=precioTotal.add(precioConIva);
			});
		
		return precioTotal;
		
	}

	public static void listarEmpiezanC(List<Product> carritoCompra) {
		System.out.print("Lista de productos que empiezan por C: ");
		Stream <Product> productosEmpiezanC=carritoCompra.stream().filter(product->product.getNombre().startsWith("C")).sorted();
        productosEmpiezanC.forEach((p)-> {
            System.out.print(p.getNombre()+",");
        });
		
	}

}
