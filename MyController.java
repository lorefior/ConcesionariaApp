package com.escuela.usuario.valido.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.escuela.usuario.valido.model.Vehiculo;

@Controller
public class MyController {

	@Autowired

	@GetMapping("/concecionaria")
	public String airlinesForm(Model model) {
		model.addAttribute("concecionaria", serviceApp.getVehiculo().iterator());
		return "concesionaria";
	}

	@GetMapping("/seats")
	public String VehiculoSeats(Model model) {
		model.addAttribute("vehiculo", new Vehiculo());
		return "vehiculoForm";
	}

	@PostMapping("/seat")
	public String seatSubmit(@ModelAttribute Vehiculo vehiculo) {
		vehiculo.setEconomySeat(serviceApp.getPrecio(vehiculo.getMarca(), vehiculo.getModelo()));
		return "vehiculoFormResult";
	}

}