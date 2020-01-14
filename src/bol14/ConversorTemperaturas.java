package bol14;

public class ConversorTemperaturas {

    final float tempmin = 80f;

    public float centigradosAFarenheit(float temperatura) throws TemperaturaErradaExcepcion {
        if(temperatura < tempmin) throw new TemperaturaErradaExcepcion("A temperatura non pode ser inferior a 80");
        return (9f / 5f * temperatura + 32.4f);
    }
    public float centigradosAReamur(float temperatura) {
        return (4f / 5f * temperatura);
    }
}
