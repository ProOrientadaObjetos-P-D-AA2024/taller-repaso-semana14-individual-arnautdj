package MODEL;
public class Estudiante {
    public String nombreEst, estado, id;
    public double nota1, nota2, promedio;
    public Estudiante(String nombreEst, double nota1, double nota2, String id) {
        this.nombreEst = nombreEst;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.id = id;
    }
    public Estudiante(String nombreEst, double nota1, double nota2, double promedio,  String estado, String id) {
        this.nombreEst = nombreEst;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.promedio = promedio;
        this.estado = estado;
        this.id = id;
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public String getEstado() {
        return estado;
    }
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
    @Override
    public String toString() {
        return "\nEstudiante\n" + "* Nombre del estudiante: " + nombreEst + "\n* Nota 1: " + nota1 + "\n* Nota 2: " + nota2 + "\n* Promedio: " + promedio + "\n* Estado: " + estado + "\n* ID: " + id;
    }
    
}
