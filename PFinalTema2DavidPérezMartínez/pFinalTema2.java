import javax.swing.JOptionPane;

class Alumno {
    String nombre;
    String nota;
    
    void passExam(){
    JOptionPane.showMessageDialog(null, "Enhorabuena, has aprobado, " + nombre);
    }
    void failExam() {
    JOptionPane.showMessageDialog(null, "Necesitas estudiar, " + nombre);
    }
}

public class pFinalTema2 {
    public static void main (String [] args) {
        Alumno a = new Alumno();
        String elmejor = "Esta practica ha sido realizada por David Perez Martinez.";
        JOptionPane.showMessageDialog(null, elmejor);
        String numero = JOptionPane.showInputDialog(null, "Introduce el numero de alumnos:");
        int numAlumno = Integer.parseInt(numero);
        for (int x = 0; x < numAlumno; x++) {
            a.nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del alumno No: " + (x + 1));
            a.nota = JOptionPane.showInputDialog(null, "Introduce la nota de " + a.nombre);
            int notaAlumno = Integer.parseInt(a.nota);
            if (notaAlumno < 5) {
                a.failExam();
            }
            else {
                a.passExam();
            }
        }
    }
}