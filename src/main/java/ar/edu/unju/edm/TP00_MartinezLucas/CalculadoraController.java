package ar.edu.unju.edm.TP00_MartinezLucas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController {

  @GetMapping("/menu")
  public String mostrarMenuCalculadora(){
    return "index";
  }
  
  @GetMapping("/calculoSuma")
  public String getSumaPage(@RequestParam (name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model){
    int resultadoS=0;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNumero1(num1);
    nuevaCalculadora.setNumero2(num2);
    resultadoS = nuevaCalculadora.SumaNumeros();
    model.addAttribute("resultadoS", resultadoS);
    return "resultado";
  }

  @GetMapping("/calculoResta")
  public String getRestaPage(@RequestParam (name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model){
    int resultadoR=0;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNumero1(num1);
    nuevaCalculadora.setNumero2(num2);
    resultadoR = nuevaCalculadora.restaNumeros();
    model.addAttribute("resultadoR", resultadoR);
    return "resultado";
  }

  @GetMapping("/calculoMultiplicion")
  public String getMultiplicionPage(@RequestParam (name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model){
    int resultadoM=0;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNumero1(num1);
    nuevaCalculadora.setNumero2(num2);
    resultadoM = nuevaCalculadora.MultiplicarNumeros();
    model.addAttribute("resultadoM", resultadoM);
    return "resultado";
  }

  @GetMapping("/calculoDivision")
  public String getDivisionPage(@RequestParam (name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model){
    int resultadoD=0;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNumero1(num1);
    nuevaCalculadora.setNumero2(num2);
    resultadoD = nuevaCalculadora.DivisionNumeros();
    model.addAttribute("resultadoD", resultadoD);
    return "resultado";
  }

  @GetMapping("/calculoPotencia")
  public String getPotenciaPage(@RequestParam (name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model){
    int resultadoP=0;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNumero1(num1);
    nuevaCalculadora.setNumero2(num2);
    resultadoP = nuevaCalculadora.PotenciaNumeros();
    model.addAttribute("resultadoP", resultadoP);
    return "resultado";
  }

  @GetMapping("/calculoRaiz")
  public String getRaizPage(@RequestParam (name = "num1") int num1,@RequestParam (name = "num2") int num2, Model model){
    double resultadoRC1;
    Calculadora nuevaCalculadora = new Calculadora();
    nuevaCalculadora.setNumero1(num1);
    nuevaCalculadora.setNumero2(num2);
    resultadoRC1 = nuevaCalculadora.RaizNumero();
    model.addAttribute("resultadoRC1", resultadoRC1);
    return "resultado";
  }
}
