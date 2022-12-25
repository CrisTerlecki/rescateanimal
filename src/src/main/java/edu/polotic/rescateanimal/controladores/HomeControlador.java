package edu.polotic.rescateanimal.controladores;

import edu.polotic.rescateanimal.repositorios.*;
import edu.polotic.rescateanimal.servicios.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeControlador {


    @RequestMapping("/")
    public ModelAndView home()
    {
        ModelAndView maw = new ModelAndView();
        maw.setViewName("fragments/base");
        maw.addObject("titulo", "Inicio");
        maw.addObject("vista", "inicio/home");

    }

    @RequestMapping("/ejemplo")
    public ModelAndView ejemplo()
    {
        ModelAndView maw = new ModelAndView();
        maw.setViewName("fragments/base");
        maw.addObject("titulo", "Ejemplo");
        maw.addObject("vista", "inicio/ejemplo");
        return maw;  
    }
    
}