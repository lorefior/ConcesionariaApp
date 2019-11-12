package com.escuela.usuario.valido.Controller;


import java.util.HashMap;
import java.util.Map;

public class DummyBase {

	private static Map<String, Vehiculo> mapa;

	static {

		mapa = new HashMap<String, Vehiculo>();

		mapa.put("Amarok",   new Vehiculo("Amarok" , 1500000 , "Volkswagen", "rojo , negro, blanco,gris" ,2019));
		mapa.put("Vento",    new Vehiculo("Vento" , 1380000 , "Volkswagen",  "rojo , negro, blanco, gris , azul",2019 ));
		mapa.put("UP!",      new Vehiculo("UP!" ,  1000000, "Volkswagen",  "rojo , negro, blanco,gris" ,2018));
		mapa.put("T-Cross",  new Vehiculo("T-Cross" ,  1000000 , "Volkswagen",  "rojo , negro, blanco,gris" ,2017));
		mapa.put("Polo",     new Vehiculo("Polo" ,  1000000 , "Volkswagen",  "rojo , negro, blanco,gris" ,2019));
		mapa.put("500",      new Vehiculo("500"   ,  1000000, "FIAT",  "Negro, Blanco, Rojo, Gris, Azul" ,2015));
		mapa.put("Toro",     new Vehiculo("Toro" ,  1000000, "FIAT",  "rojo , negro, blanco,gris" ,2018));
		mapa.put("C3",       new Vehiculo("C3" ,  1000000 , "Citroen",  "rojo , negro, blanco, gris" ,2017));
		mapa.put("C4",       new Vehiculo("C4" ,  1000000 , "Citroen",  "rojo , negro, blanco, gris" ,2018));
		mapa.put("DS3",      new Vehiculo("DS3" ,50 ,"Citroen",  "rojo , negro, blanco, gris" ,2018));
		mapa.put("5008",     new Vehiculo("5008" ,  1000000, "Peugeot",  "rojo , negro, blanco, gris" ,2018));
		mapa.put("308",      new Vehiculo("308",755000  , "Peugeot",  "rojo , negro, blanco, gris" ,2018));
		mapa.put("208",      new Vehiculo("208",  1000000, "Peugeot", "rojo , negro, blanco, gris" ,2017));
		mapa.put("408",      new Vehiculo("408" , 845000 , "Peugeot", "rojo , negro, blanco, gris" ,2017));

		
	}

	public static Map<String, Vehiculo> getMap() {
		return mapa;
	}

	public static void setMap(String modN, Vehiculo mod) {
		mapa.put(modN, mod);
	}
	private static Map<String, Usuario> admi;

	static {

		admi = new HashMap<String, Usuario>();
		admi.put("flor", new Usuario("flor", "1234"));
		admi.put("lore", new Usuario("lore", "1000"));
		admi.put("vale", new Usuario("vale", "1000"));
		admi.put("agusfior", new Usuario("agusfior", "1000"));
		admi.put("florvera", new Usuario("florvera", "1000"));

		
	}

	public static Map<String, Usuario> getMap1() {
		return admi;
	}
}