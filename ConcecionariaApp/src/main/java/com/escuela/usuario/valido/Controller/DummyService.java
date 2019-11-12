package com.escuela.usuario.valido.Controller;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

	Map<String, Vehiculo> base = DummyBase.getMap();

	public boolean getAtribute(String mod, Integer precio) {
		Vehiculo vehiculo = base.get(mod);
		if (vehiculo == null) {
			return false;
		} else if (vehiculo.getPrecio()>precio) {
			
			return true;
		}
		return false;

	}

	public void setAtribute(String Mod, Vehiculo precio) {

		base.put(Mod, precio);
	}

	public boolean registerMod(String Mod, Vehiculo precioV) {
		Vehiculo vehiculo = base.get(Mod);
		if (vehiculo == null) {
			base.put(Mod, precioV);
			return true;
		}
		return false;
	}

	public Vehiculo searchMod(String Mod, Vehiculo vehiculo) {
		Vehiculo vehiculo1 = base.get(Mod);
		if(vehiculo1 == null) {
		return null;
		}	else  {
			base.values();
			return vehiculo1;
	    }	
	}
	//////////////////////////////
	Map<String, Usuario> admi = DummyBase.getMap1();

	public boolean getAtribute(String user, String pass) {
		Usuario usuario = admi.get(user);
		if (usuario == null) {
			return false;
		} else if (usuario.getPass().equals(pass)) {
			return true;
		}
		return false;

	}

	public void setAtribute(String user, Usuario pass) {

		admi.put(user, pass);
	}


}
