// Ejemplo de cómo se van creando las variables r1, r2, r3...

// 1. 
const r1 = document.getElementById("titulo-principal");

// 2. 
const r2 = document.getElementById("presentacion");

// 3. 
const r3 = document.getElementById("table-prestamos");

// 4. 
const r4 = document.getElementById("correo");

// 5. 
const r5 = document.getElementById("limpiar");


//B. Selección mediante getElementsByClassName (6–10)

//6

const r6 = document.getElementsByClassName(".tarjeta");
//7
const r7 = document.getElementsByClassName("destacado");
//8
const r8 = document.getElementsByTagName(".tarjeta", "disponible");

//9
const r9 = document.getElementsByTagName("enlace-maenu")[1];
//10
const r10 = document.getElementsById("presentacion").getElementsById("texto");

