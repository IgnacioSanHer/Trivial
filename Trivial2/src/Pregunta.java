

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Pregunta {
    String texto_pregunta, texto_respuesta;
    int tipo_pregunta;

    public Pregunta(String texto_pregunta, String texto_respuesta, int tipo_pregunta) {
        this.texto_pregunta = texto_pregunta;
        this.texto_respuesta = texto_respuesta;
        this.tipo_pregunta = tipo_pregunta;
    }

    public String getTexto_pregunta() {
        return texto_pregunta;
    }

    public String getTexto_respuesta() {
        return texto_respuesta;
    }

    public int getTipo_pregunta() {
        return tipo_pregunta;
    }
    
}
