# Tarea 2 Debug 
1. El método main crea 3 coches con sus atributos marca, modelo y color. Luego un generador de números aleatorios genera tres valores diferentes por cada vez que ejecutemos el código. Luego llama al método "acelera" de la clase coche para sumarle a su velocidad la velocidad que se ha generado aleatoriamente a cada coche. Luego llama al método "pinta" para hacer una representación gráfica cuando los coches ya han acelerado, divide su velocidad entre 10 para saber cuantos espacios en blanco dejar antes de imprimir el coche, lo que da sensación de ser más rápido o lento según como de alejado esté de la parte izquierda de la consola. La división ocurre porque si por ejemplo, fuera a 70 km/h, dibujaría 70 espacios en blanco, dividiendo entre 10 dibuja solo 7 y es más fácil de leer visualmente. Luego vuelve a generar valores aleatorios. Llama al método "frena" y les resta el nuevo valor generado aleatoriamente a su velocidad. Si la velocidad baja de 0 se vuelve a establecer en 0. Luego vuelve a dibujar a los coches con el método pinta cuando han frenado.
2. En la linea 27 ya se han sumado los valores aleatorios a la velocidad del coche, cada vez que ejecutemos el programa o que lo depuremos serán diferentes. En el momento de depurarlo los valores son

>> velocidad_nueva1 = 49", "velocidad_nueva2 = 42", "velocidad_nueva3 = 70".

Los datos en los parámetros de los coches son 
>>"c: Fiat, 500, Rojo, velocidad 70", "c2: Audi, A4, Negro, velocidad 49", "c3: Renault, 4L, Gris, velocidad 42". 

3.Tenemos para los valores de las variables en nuestro momento de depurar 
    
>>"velocidad_nueva1 = 82", "velocidad_nueva2 = 22", "velocidad_nueva3 = 3".

Los datos en los parámetros de los coches son 
>>"c: Fiat, 500, Rojo, velocidad 0", "c2: Audi, A4, Negro, velocidad 27", "c3: Renault, 4L, Gris, velocidad 39".

