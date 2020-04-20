package com.uca.capas.tarea2.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.SysexMessage;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/tarea2")
	public @ResponseBody String tarea2() {
		String texto ="Jose Segura 00001617 Ingenieria Informatica 4to Año";
		return texto;
	}
	
	@RequestMapping("/parametros")
	public @ResponseBody String parametros(HttpServletRequest request) {
		Integer dia =Integer.parseInt(request.getParameter("dia"));
		Integer mes =Integer.parseInt(request.getParameter("mes"));
		Integer anio =Integer.parseInt(request.getParameter("anio"));
		int diaSemana;
        Calendar c = Calendar.getInstance();
        c.set(anio,mes-1,dia);
        String res ="";
        diaSemana = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(c.getTime().toString());
        System.out.println(diaSemana);
        switch(diaSemana) {
        	case 1:
        		res= "Domingo";
        		break;
        	case 2:
        		res= "Lunes";
        		break;
        	case 3:
        		res= "Martes";
        		break;
        	case 4:
        		res= "Miercoles";
        		break;
        	case 5:
        		res= "Jueves";
        		break;
        	case 6:
        		res= "Viernes";
        		break;
        	case 7:
        		res= "Sabado";
        		break;
        	
        		
        }
		return res;
	}
}
