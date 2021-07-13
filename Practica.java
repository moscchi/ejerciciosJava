import java.nio.charset.StandardCharsets;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practica {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 1) Lee un número por teclado que pida el precio de un producto (puede tener
    // decimales) y calcule el precio final con IVA. El IVA sera una constante que
    // sera del 21%.
    /*
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Dame el precio del producto: "); double price =
     * Double.parseDouble(sc.next());
     * 
     * System.out.println("El precio es " + ((price*0.21)+price));
     */
    // 2) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
    /*
     * int val = 1; while(val < 101){ if(val == 100){ System.out.print(val); }else {
     * System.out.print(val + ", ") ; } val++; }
     */
    // 3) Haz el mismo ejercicio anterior con un bucle for.
    /*
     * for(var i = 1; i<101; i++){ if(i == 100){ System.out.print(i); }else { }
     * System.out.print(i + " - ");
     * 
     * }
     */
    // 4) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
    // Utiliza el bucle que desees.
    /*
     * for(var i = 0; i<101; i++){ if(i % 2 == 0){ System.out.print("Numero par: " +
     * i + " "); } else if (i % 3 == 0){ System.out.print("Numero div por 3: " + i +
     * " "); } i++; }
     */
    // 5) Realiza una aplicación que nos pida un número de ventas a introducir,
    // después nos pedirá tantas ventas por teclado como número de ventas se hayan
    // indicado.
    // Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite
    // y lo que no.
    /*
     * int cantVentas, parcialVentas = 0; int totalVentas = 0; Scanner sc = new
     * Scanner(System.in); System.out.println("Dame la cantidad de ventas: ");
     * cantVentas = Integer.parseInt(sc.nextLine()); for(int i = 0; i <= cantVentas;
     * i++){ System.out.println("Dame el valor de la venta "+i+": "); parcialVentas
     * = Integer.parseInt(sc.nextLine()); totalVentas += parcialVentas; }
     * System.out.println("Total de valor de ventas: " + totalVentas);
     */

    // 6)Lee un número por teclado y comprueba que este numero es mayor o igual que
    // cero, si no lo es lo volverá a pedir (do while), después muestra ese número
    // por consola.
    /*
     * int num = 0; do{
     * System.out.println("Dame un numero hasta que me des uno mayor o igual a 0.");
     * num = Integer.parseInt(sc.next()); }while(num < 0); System.out.println(num);
     */
    // 7) Escribe una aplicación con un String que contenga una contraseña
    // cualquiera. Después se te pedirá que introduzcas la contraseña, con 3
    // intentos.
    // Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo
    // “Enhorabuena”. Piensa bien en la condición de salida (3 intentos y si acierta
    // sale, aunque le queden intentos).
    /*
     * String password = "aloja"; String intento = ""; int j = 2;
     * System.out.println("Intenta adivinar una contraseña. Tendrás 3 intentos:");
     * for(int i = 0; i<3; i++){ System.out.println("Dame una contraseña: ");
     * intento = sc.next(); if(password.equals(intento)){ break; } else {
     * System.out.println("Error. Te quedan " + j + " intentos."); j--; } }
     * if(password.equals(intento)){ System.out.println("Enhorabuena!"); }else {
     * System.out.println("Lo siento. No adivinaste"); }
     */

    // 8)Crea una aplicación que nos pida un día de la semana y que nos diga si es
    // un dia laboral o no. Usa un switch para ello.
    // Nota: Me voy a pasar el switch por los huevos
    /*
     * List<String> laboral = new ArrayList<>(); laboral.add("lunes");
     * laboral.add("martes"); laboral.add("miercoles"); laboral.add("jueves");
     * laboral.add("viernes");
     * 
     * System.out.println("Dime el dia: "); String dia = sc.next().toLowerCase();
     * laboral.stream().forEach((d) -> { if(d == dia) {
     * System.out.println("El día "+ dia + " es laboral"); } else {
     * System.out.println("El día "+ dia + " es NO laboral"); System.exit(1); } });
     * 
     */
    // 9)Pide por teclado dos número y genera 10 números aleatorios entre esos
    // números. Usa el método Math.random para generar un número entero aleatorio
    // (recuerda el casting de double a int).
    /*
     * System.out.println("Dame primer numero"); Integer num1 = sc.nextInt();
     * System.out.println("Dame segundo numero"); Integer num2 = sc.nextInt();
     * 
     * List<Integer> numeros = new ArrayList<>(); for(int i = 0; i < 10; i++){
     * numeros.add(num1 > num2 ?
     * (int)Math.floor(Math.random()*(num1-num2+1)+num2):(int)Math.floor(Math.random
     * ()*(num2-num1+1)+num1)); } System.out.println(numeros);
     */

    // 10) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta
    // cuantas vocales hay en total (recorre el String con charAt).
    /*
     * String frase = "La lluvia en Sevilla es una maravilla";
     * 
     * int contVoc = 0; for(int i = 0; i < frase.length() ; i++){
     * if(frase.valueOf(frase.charAt(i)).equals("a") ||
     * frase.valueOf(frase.charAt(i)).equals("e") ||
     * frase.valueOf(frase.charAt(i)).equals("i") ||
     * frase.valueOf(frase.charAt(i)).equals("o") ||
     * frase.valueOf(frase.charAt(i)).equals("u")){ contVoc++; } }
     * System.out.println("La frase '"+frase+"' tiene "+contVoc+" vocales.");
     */

    // 11) Reemplaza todas las a del String anterior por una e.
    /*
     * String frase = "La lluvia en Sevilla es una maravilla";
     * System.out.println(frase.replace("a", "e"));
     */
    // 12) Recorre el String del ejercicio anterior y transforma cada carácter a su
    // código ASCII. Muestralos en linea recta, separados por un espacio entre cada
    // carácter.
    /*
     * String frase = "La lluvia en Sevilla es una maravilla"; for(int i = 0; i <
     * frase.length() ; i++){ System.out.print(" " + (int)frase.charAt(i)); }
     */
    /*
     * 13) Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2
     * operandos (int) y un signo aritmético (String), según este último se
     * realizara la operación correspondiente. Al final mostrara el resultado en un
     * cuadro de dialogo. Los signos aritméticos disponibles son:
     * 
     * +: suma los dos operandos. -: resta los operandos. : multiplica los
     * operandos. /: divide los operandos, este debe dar un resultado con decimales
     * (double) ^: 1º operando como base y 2º como exponente. %: módulo, resto de la
     * división entre operando1 y operando2.
     */
    /*
     * System.out.println("Ingrese el primer numero: "); int n1 = sc.nextInt();
     * System.out.println("Ingrese el segundo numero: "); int n2 = sc.nextInt();
     * System.out.
     * println("Ingrese que operación quiere hacer: ( + | - | * | / | % )"); String
     * signo = sc.next(); int result = 0 ; switch(signo){ case "+": result = n1 +
     * n2; break; case "-": result = n1 - n2; break; case "*": result = n1 * n2;
     * break; case "/": result = n1 / n2; break; case "^": result = n1 ^ n2; break;
     * case "%": result = n1 % n2; break; default: System.out.
     * println("Error con el signo ingresado. Por favor la próxima vez fijese bien que ingresa."
     * ); break; } System.out.println("El resultado es " + result);
     */

    // 14) Convertir una frase a mayúsculas o minúsculas, que daremos opción a que
    // el usuario lo pida y mostraremos el resultado por pantalla.
/*    System.out.println("Ingrese una frase.");
    String frase = sc.next();
    StringBuilder sb = new StringBuilder();
    System.out.println(
        "Frase guardada. Ingrese 1 si quiere convertirla en mayusculas o 2 si quiere convertirla en minúsculas.");
    int orden = sc.nextInt();
    StringBuilder convert = orden == 2 ? sb.append(frase.toUpperCase())
        : orden == 1 ? sb.append(frase.toLowerCase()) : sb.append("Número ingresado inválido");

    System.out.println("La frase convertida queda: " + convert);*/

    //15) Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene. Por ejemplo: si introducimos 1250,
    // nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.
 /*   System.out.println("Dame un nro entero positivo, te diré la cantidad de sus cifras.");
    int num = sc.nextInt();
    String nume = "";
    
    System.out.println("El numero " +num+" tiene "+nume.valueOf(num).length() +" cifras.");*/
  }
}