package com.empresa.proyecto.controller;

import com.empresa.proyecto.form.PersonaForm;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("persona")
public class PersonaController {

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public ModelAndView viewRegister() {
        ModelAndView mav = new ModelAndView("register");
        PersonaForm personaForm = new PersonaForm();
        mav.addObject("personaForm", personaForm);
        return mav;
    }

    @RequestMapping(value = "action", method = RequestMethod.POST)
    public ModelAndView viewAction(@Valid @ModelAttribute("personaForm") PersonaForm personaForm, 
                                    BindingResult resultado) {
        
        if(resultado.hasErrors()){
            ModelAndView mav = new ModelAndView("register");
            return mav;
        }else{
            ModelAndView mav = new ModelAndView("result");
            mav.addObject("personaForm", personaForm);
            return mav;
        }
    }

}
