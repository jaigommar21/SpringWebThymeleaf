package pe.edu.tecsup.springwebthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.tecsup.springwebthymeleaf.model.Producto;

@Controller
public class ProductoController {

	@GetMapping("/productos")
	public String productos(Model model) {
		
		String mensaje = "Hello Everyone!!!";
		model.addAttribute("mensaje", mensaje);
		
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto("IPhone", 2000.0));
		productos.add(new Producto("Galaxy", 2500.0));
		productos.add(new Producto("Huawei", 1600.0));
		model.addAttribute("productos", productos);
		
		return "productos";
	}
	
}
