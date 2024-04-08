package com.example.motorcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MotorController {

    // Método para manejar la solicitud GET a la página principal
    @GetMapping("/")
    public String index(Model model) {
        // Aquí podrías inicializar variables relacionadas con el motor
        // y pasarlas al modelo para que se muestren en la página
        model.addAttribute("estadoMotor", "Apagado");
        return "index"; // Esto renderizará el archivo HTML index.html en src/main/resources/templates/
    }

    // Método para simular encender el motor
    @GetMapping("/encender")
    public String encenderMotor(Model model) {
        // Aquí podrías realizar acciones relacionadas con encender el motor
        model.addAttribute("estadoMotor", "Encendido");
        return "index"; // Redirecciona nuevamente a la página principal
    }

    // Método para simular apagar el motor
    @GetMapping("/apagar")
    public String apagarMotor(Model model) {
        // Aquí podrías realizar acciones relacionadas con apagar el motor
        model.addAttribute("estadoMotor", "Apagado");
        return "index"; // Redirecciona nuevamente a la página principal
    }
}

