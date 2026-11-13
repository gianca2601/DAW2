alert ("parate");
const parrafo = document.getElementById("parrafo")

parrafo.textContent = "hola";

const parrafoPresentacion = document.querySelector("·presentacion.p");

//-----------------------------------------

const listaAvisos = document.getElementsByClassName("aviso");

for (const avi of listaAvisos){
    avi.classList.add("destacado");

}
const parrafo2 = document.getElementById("parrafo2");
parrafo2.innerHTML = parrafo2.textContent + "con una palabra <strong>resaltada</strong>"

const listaParrafos = document.getElementsByTagName("p");
for ( const p of listaParrafos){
    p.classList.add("rojo");
}
const enlace1 = document.querySelector("a");

enlace1.setAttribute("href","http://www.chatgpt.com/")// ataque malisioso 