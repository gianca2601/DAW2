###
#EJERCICIO1
print ("hola mundo, este es mi primer programa de python")


# EJERCICIO2
nombre = input  ( "introduce tu nombre : ")
edad = input ("introduce tu edad :")

print (f" hola, {nombre}, tienes {edad}")

#EJERCICIO3
nombre = input ("mi nombre es ")
años = input ("edad")
vivo = input ("vivo en :")

print (f"me llamo, {nombre}, tengo,{años}, vivo en  {vivo}")


#EJERCICIO4
nombre = input ("nombre:")
apellido = input ("apellido:")
print (f" nombre completo: {nombre},{apellido}")

#EJERCICIO5
x = 5
y = 10

print(f"Antes del intercambio: x = {x}, y = {y}")

# Intercambio en una sola instrucción
x, y = y, x

print(f"Después del intercambio: x = {x}, y = {y}")

#EJERCICIO6
num1 = float(input("Introduce el primer número: "))
num2 = float(input("Introduce el segundo número: "))

print(f"Suma: {num1 + num2}")
print(f"Resta: {num1 - num2}")
print(f"Multiplicación: {num1 * num2}")
print(f"División: {num1 / num2}")

#EJERCICIO7
num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))

print(f"Cociente entero: {num1 // num2}")
print(f"Resto: {num1 % num2}")

#EJERCICIO8 
base = float(input("Introduce la base: "))
altura = float(input("Introduce la altura: "))

area = base * altura
print(f"El área del rectángulo es: {area}")


#EJERCICIO 9 
PI = 3.1416

radio = float(input("Introduce el radio del círculo: "))
area = PI * (radio ** 2)

print(f"El área del círculo es: {area}")

#EJERCICIO 10 
IVA = 0.21

precio_original = float(input("Introduce el precio del producto: "))
precio_final = precio_original * (1 + IVA)

print(f"Precio original: {precio_original}")
print(f"Precio final con IVA (21%): {precio_final}")

#EJERCICIO 11
edad = int(input("Introduce tu edad: "))

# 1. Texto concatenado
print("Tienes " + str(edad) + " años")

# 2. Edad el próximo año
print(f"El próximo año tendrás {edad + 1} años.")

#EJERCICO 12 
TASA_CAMBIO = 1.10

euros = float(input("Introduce la cantidad en euros: "))
dolares = euros * TASA_CAMBIO

print(f"{euros} € equivalen a {dolares} $")

#EJERCICIO 13
numero = float(input("Introduce un número decimal: "))

print(f"Valor original: {numero}")
print(f"El doble del número: {numero * 2}")

#EJERCICIO 14
IVA = 0.21

nombre_producto = input("Nombre del producto: ")
precio_unitario = float(input("Precio unitario: "))
cantidad = int(input("Cantidad comprada: "))

total_sin_iva = precio_unitario * cantidad
total_con_iva = total_sin_iva * (1 + IVA)

print(f"\nProducto: {nombre_producto}")
print(f"Total sin impuestos: {total_sin_iva:.2f}")
print(f"Total con IVA (21%): {total_con_iva:.2f}")

#EJERCICIO 15
nota1 = float(input("Introduce la primera nota: "))
nota2 = float(input("Introduce la segunda nota: "))
nota3 = float(input("Introduce la tercera nota: "))

promedio = (nota1 + nota2 + nota3) / 3

print(f"El promedio de las tres notas es: {promedio:.2f}")

#EJERCICIO 16 
celsius = float(input("Introduce la temperatura en grados Celsius: "))
fahrenheit = celsius * (9 / 5) + 32

print(f"{celsius} °C equivalen a {fahrenheit} °F")

#EJERCICIOI 17 
nombre = input("Nombre: ")
edad = input("Edad: ")
ciudad = input("Ciudad: ")

print(f"Me llamo {nombre}, tengo {edad} años y vivo en {ciudad}.")

# EJERCICIO 18 
numero = int(input("Introduce un número entero: "))

# Conversiones de tipo
valor_float = float(numero)
valor_str = str(numero)

print(f"Valor como float: {valor_float}")
print(f"Valor como str: '{valor_str}'")
print(f"El doble: {numero * 2}")
print(f"El triple: {numero * 3}")





