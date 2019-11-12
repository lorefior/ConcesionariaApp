package com.escuela.usuario.valido.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MyController {

	@Autowired
	DummyService service;
	DummyBase base;
	@GetMapping("/InicioApp")
	public String createUsuario(Vehiculo usuario) {
		
		return "InicioApp";
	}
	@GetMapping("/login")
	public String createUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}

	@PostMapping("/login")
	public String readUser(@ModelAttribute Usuario usuario, Model modelo) {
		
		if (service.getAtribute(usuario.getUser(), usuario.getPass())) {
			return "cuenta";
		} else {
			modelo.addAttribute("pepe", "Usuario y/o contraseña invalido!");
			return "error";
		}

	}
	
	@GetMapping("/lanzarVehiculo")
	public String createUsuario1(Vehiculo vehiculo) {
		
		return "lanzarVehiculo";
	}

	@PostMapping("/lanzarVehiculo")
	public String readMod1(@ModelAttribute Vehiculo vehiculo,Model modelo) {
		if(service.registerMod(vehiculo.getMod(), vehiculo))
			return "datos";
		else{
			System.out.println("error  existe vehiculo");
			modelo.addAttribute("pepe", "El vehiculo '" + vehiculo.getMod() +  "' ya existe!");
			return "error";
		}
	}
	@GetMapping("/proximamente")
	public String createUsuario15(Vehiculo usuario) {
		
		return "proximamente";
	}
	@GetMapping("/buscador")
	public String searchUser1(Vehiculo vehiculo) {
		return "buscador";
	}

	@PostMapping("/buscador")
	public String searchUser2(@ModelAttribute Vehiculo vehiculo, Model modelo) {
		Vehiculo Mod = service.searchMod(vehiculo.getMod(), vehiculo);
		if (Mod != null) {
			modelo.addAttribute("usuario", "Modelo: " + Mod.getMod());
			modelo.addAttribute("nombre", " Marca: " + Mod.getMarca());
			modelo.addAttribute("apellido", "Año: " + Mod.getAño());
			modelo.addAttribute("mail", "Color:  " + Mod.getColor());	
			modelo.addAttribute("edad", "Precio: " + Mod.getPrecio());


			return "datosBusqueda";
		} else {
			modelo.addAttribute("pepe", "Usuario no encontrado!");
			return "error";
		}
	}
}