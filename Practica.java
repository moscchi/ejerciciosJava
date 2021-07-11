import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Practica {
 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
    /*   Scanner sc = new Scanner(System.in);
       System.out.println("Dame el precio del producto: ");
       double price = Double.parseDouble(sc.next());
        
       System.out.println("El precio es " + ((price*0.21)+price));
  */
  //10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
  /*int val = 1;      
  while(val < 101){
    if(val == 100){
        System.out.print(val);
    }else {
        System.out.print(val + ", ") ;
    }
    val++;
  }*/
  //11) Haz el mismo ejercicio anterior con un bucle for.
  /*for(var i = 1; i<101; i++){
    if(i == 100){
        System.out.print(i);
    }else {
    } System.out.print(i + " - ");
       
  }*/
  //12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
  /*for(var i = 0; i<101; i++){
    if(i % 2 == 0){
      System.out.print("Numero par: " + i + " ");
    } else if (i % 3 == 0){
      System.out.print("Numero div por 3: " + i + " ");
    }
    i++;
  }*/
  //Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
  // Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
  /*int cantVentas, parcialVentas = 0;
  int totalVentas = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Dame la cantidad de ventas: ");
  cantVentas = Integer.parseInt(sc.nextLine());
  for(int i = 0; i <= cantVentas; i++){
    System.out.println("Dame el valor de la venta "+i+": ");
    parcialVentas = Integer.parseInt(sc.nextLine());
    totalVentas += parcialVentas;
  }
  System.out.println("Total de valor de ventas: " + totalVentas);*/
  
  // Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
  /*int num = 0;
  do{
    System.out.println("Dame un numero hasta que me des uno mayor o igual a 0.");
    num = Integer.parseInt(sc.next());
  }while(num < 0);
  System.out.println(num);*/
  // Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
  //Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
  /*String password = "aloja";
  String intento = "";
  int j = 2;
  System.out.println("Intenta adivinar una contraseña. Tendrás 3 intentos:");
  for(int i = 0; i<3; i++){
    System.out.println("Dame una contraseña: ");
    intento = sc.next();
    if(password.equals(intento)){
      break;
    } else {
      System.out.println("Error. Te quedan " + j + " intentos.");
      j--;
    }
  }
  if(password.equals(intento)){
    System.out.println("Enhorabuena!");
  }else {
    System.out.println("Lo siento. No adivinaste");
  }*/
  
  //Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
  //Nota: Me voy a pasar el switch por los huevos
 /* List<String> laboral = new ArrayList<>();
  laboral.add("lunes");
  laboral.add("martes");
  laboral.add("miercoles");
  laboral.add("jueves");
  laboral.add("viernes");
  
  System.out.println("Dime el dia: ");
  String dia = sc.next().toLowerCase();
  laboral.stream().forEach((d) -> {
    if(d == dia) {
      System.out.println("El día "+ dia + " es laboral");
    } else {
      System.out.println("El día "+ dia + " es NO laboral");
      System.exit(1);
    }
  });

*/
//Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
/*  System.out.println("Dame primer numero");  
  Integer num1 = sc.nextInt();
  System.out.println("Dame segundo numero");  
  Integer num2 = sc.nextInt();

  List<Integer> numeros = new ArrayList<>();
  for(int i = 0; i < 10; i++){
    numeros.add(num1 > num2 ? (int)Math.floor(Math.random()*(num1-num2+1)+num2):(int)Math.floor(Math.random()*(num2-num1+1)+num1));
    }
  System.out.println(numeros);*/

  //Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt).
  /*String frase = "La lluvia en Sevilla es una maravilla";
  
  int contVoc = 0;
  for(int i = 0; i < frase.length() ; i++){
    if(frase.valueOf(frase.charAt(i)).equals("a") || frase.valueOf(frase.charAt(i)).equals("e") || frase.valueOf(frase.charAt(i)).equals("i") || 
    frase.valueOf(frase.charAt(i)).equals("o") || frase.valueOf(frase.charAt(i)).equals("u")){
      contVoc++;
    }
  }
    System.out.println("La frase '"+frase+"' tiene "+contVoc+" vocales.");*/

    
  
  }
}