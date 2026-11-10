print("ejercicio 1 ")

ficha_alumno= {
    "nombre": "Carlos",
    "edad": "22",
    "ciudad": "Valdemoro"
}
print(ficha_alumno)

print("ejercicio 2 ")
print(f"elnombre del alumno es {ficha_alumno['nombre']}")

## Carlos ha cumplido años. Actualiza el valor  de la clace 
ficha_alumno["edad"]=23
print(ficha_alumno)

print("ejercicio 3 ")

ficha_alumno["email"]="carlos.perez@valledelmiro.es"

##Añade una lista de las asignaturas en las que está matriculado. La clave será "asignaturas" y el valor será una lista con los siguientes strings: ["Programación", "Bases de Datos", "Sistemas Informáticos"] .
ficha_alumno["asignatura"] = ["Programación", "Bases de Datos", "Sistemas Informáticos"] 

##Imprime la ficha para ver toda la nueva información
print(ficha_alumno)


print("ejercicio 4 ")

ficha_alumno.pop("ciudad")

print(ficha_alumno)

print("ejercicio 5 ")

print("claves:", list(ficha_alumno.keys()))
print("valor:", list(ficha_alumno.values()))

print("pares clave-valor ", list(ficha_alumno.items()) )

notas_alumnos ={ 
    "programacion": 9,
    "base de datos": 7.5
}
ficha_alumno["notas"] = notas_alumnos

print(ficha_alumno)

print(ficha_alumno["notas"]["programacion"])