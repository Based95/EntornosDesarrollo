1. En la función1… Què fan aquestes línies de codi?

       String string2 = "string2";   
   //Crea una variable String (Variable de texto) llamada string2 con el valor de texto string2

       string2= string2.substring(0, string2.length()-1);  
   //Usamos la variable string2 y le extraemos desde la posición 0 hasta la longitud del texto string2 -1 carácter por lo cual quedaría string2 = "string"

       string2=string2+"1";   
   //Le añadimos el texto 1 al valor de string2, por lo cual quedaría string2="string1"

2. Què valen les variables string1 i string2 abans d'executar el codi de comprovació següent?

   Ambos contienen el valor "string1".

3. Per què no funciona l'operador == ? Quin operador s'ha d'usar en lloc d'aquest?

   No funciona porque son variables de tipo texto, no de número. Para que funcione usamos el comando: "if(string1.equals(string2) )"

4. La función2() està declarada com segueix:

       public void funcion2() {   
       System.out.println("--------------------");   
       System.out.println("Aquesta és la funció 2");   
       System.out.println("Com faig la crida perquè funcione????");   
       }   

   Aquesta funció com l'he de cridar des del mètode MAIN perquè funcione. Existeixen 2 possibilitats. Explica-les.

   Una de las razones es porque funcion2 no es static, y no puedes llamar a una función no estática desde una estática.

   La otra forma de solucionarlo es creando un objeto instanciando a la propia clase y llamando a la función desde ese objeto:

       ED_Debug  obj  =  new  ED_Debug()    
       obj.funcion2();