public class Main {
    public static void main(String[] args) {

        // Declarações de valores, atribuindo eles x,y,z (A,B,C).

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        // Math.sqrt é "recebe raiz quadrada".

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 =" + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        // Math.pow é "elevado á", potenciação.

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado=" + B);
        System.out.println("5 elevado ao quadrado =" + C);

        A = Math.abs(y);
        B = Math.abs(z);

        // Math.abs é "valor absoluto", onde se é retirado qualquer operador negativo.

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absluto de " + z + " = " + B);

    }
}

// Glosário

// sqrt - Raiz Quadrada//
// pow - Potenciação//
// abs - Valor Absoluto//

// Diponível em//
// https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

// Foi utlizado a IDE VSCODE com extensões para Java.//
