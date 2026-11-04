"""● Realiza todos los apartados de forma individual en un único archivo de código
llamado Tarea3_tuNombre_tuApellido.py



● Utiliza comentarios para separar los ejercicios en un único archivo.

● Al comenzar cada ejercicio, lo primero que debes hacer es un print con el
identificador del ejercicio.
Por ejemplo: 

print(“tarea3”)

      
● Utiliza los métodos y operadores de listas trabajados en clase.

● No utilices librerías externas.

● Muestra por pantalla los resultados solicitados mediante print(). Ten en cuenta
que cada print debe dejar claro qué está mostrando.
Por ejemplo: print(f"Nombre en mayúsculas: {nombre_mayusculas}")
● Comprueba que el programa funciona antes de entregarlo.
● Lee atentamente cada apartado antes de comenzar."""

print(f"ejercicio1")
tareas_del_dia_srt ="revisar el correo, preparar la reunion de equipo, termina el informe mensual, llamar al cliente X"
tarea_lista = tareas_del_dia_srt.split(", ") # se separa por comas primero 
print(tarea_lista) #imprimimos  tarea lista// 

print(f"ejercicio2")
tarea_lista.append("enviar la factrura al proveedor") # append añadir elemento al final 

tarea_lista.insert(0,"comprar cafe")# insert añadir elemento  segun posicion ej 0 
print(tarea_lista)

print(f"ejercicio3")
tarea_lista.remove("llamar al cliente x ")
tarea_lista.remove("terminar el informa mensual ")

