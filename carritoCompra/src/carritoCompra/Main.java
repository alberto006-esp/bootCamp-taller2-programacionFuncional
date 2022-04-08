package carritoCompra;

import java.math.BigDecimal;
import java.util.List;

import controlador.CarritoControler;
import enumerador.Tax;
import modelo.Product;

public class Main {
	
	public static BigDecimal precioTotal= new BigDecimal("0");
	public static BigDecimal precioConIva= new BigDecimal("0");

	public static void main(String[] args) {
		List<Product> carritoCompra = List.of(
				new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
		
		precioTotal=CarritoControler.calcularTotal(carritoCompra);
		System.out.println("Coste total carrito compra: "+precioTotal);
		CarritoControler.listarEmpiezanC(carritoCompra);
		
		//implementacion sin metodos.
		/*carritoCompra.stream().forEach(product ->{
		precioConIva=product.getPrecio().multiply(product.getTipoIva().getPrecio());
		precioTotal=precioTotal.add(precioConIva);
	});*/
		
		
		/*Stream <Product> productosEmpiezanC=carritoCompra.stream().filter(product->product.getNombre().startsWith("C")).sorted();
        productosEmpiezanC.forEach((p)-> {
            System.out.println(p.getNombre());
        });*/
		
		
	}


}
