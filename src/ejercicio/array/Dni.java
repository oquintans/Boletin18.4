package ejercicio.array;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Dni {

    private int dni;

    public Dni() {

    }

    public Dni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        dni = Integer.parseInt(JOptionPane.showInputDialog("Introducir Nº D.N.I."));
        int letranum = dni % 23;
        return letranum;
    }

    public char getLetra(int letra) {
        char dni[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        JOptionPane.showMessageDialog(null, "Letra: " + dni[(int) letra]);
        return dni[(int) letra];
    }

}
