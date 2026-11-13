let numElemento = 0; // Inicializado en 0 para que el primer click ejecute el case 1
let tabla;

const botonCrear = document.getElementById("crear");
const contenedor = document.getElementById("contenedor");
const mensajes = document.getElementById("mensajes");

const numFilas = 7;
const numCols = 3;

function creaSiguiente() {
    numElemento++;

    switch (numElemento) {
        case 1:
            crearTabla();
            creaPaso("Se ha creado la tabla.");
            break;

        case 2:
            crearCabeceraTabla();
            creaPaso("Se ha creado la cabecera de la tabla.");
            break;

        case 3:
            crearFilaCabeceraTabla();
            creaPaso("Se ha creado la fila de la cabecera de la tabla.");
            break;

        case 4:
            crearCuerpoTabla();
            creaPaso("Se ha creado el cuerpo de la tabla.");
            break;

        case 5:
            crearFilasCuerpoTabla();
            creaPaso("Se han creado las filas en el cuerpo de la tabla.");
            break;

        case 6:
            createCeldasDatos();
            creaPaso("Se han rellenado las celdas de datos.");
            break;

        case 7:
            ponerBorde();
            creaPaso("Se ha puesto un borde a la tabla.");
            break;

        case 8:
            borrarBorde();
            creaPaso("Se ha borrado el borde de la tabla.");
            break;

        case 9:
            cargarTailwind();
            // Nota: creaPaso se llama dinámicamente dentro de cargarTailwind al completar la carga.
            break;

        case 10:
            numElemento++;            
            recolocar();
            creaPaso("Tabla y lista recolocados.");
            break;
        case 11:
            numElemento++;
            estilizarPagina();
            creaPaso("Aplica estilos a la pagina y al botón");
            break;
        
        case 12:
            numElemento++;
            estilizarTabla();
            creaPaso("Aplica estilos a la tabla");
            break;

       case 13:
            numElemento++;
            estilizarLista();
            creaPaso("Aplica estilos a la Lista");
            break;
        case 14:
            numElemento++;
            crearPaso();
            creaPaso("elemento uno lista");
            break;
        case 15:
            numElemento++;
            crearPaso();
            creaPaso("elemento dos lista");
            break;
} 
}

function estilizarTabla(){

    contenedor.classList.add("overflow-x-auto");
    tabla.classList.add("w-full", "border-collapsed", "text-sm");
    tabla.querySelector("thead").classList.add("bg-indigo-100");

    tabla.querySelectorAll("th, td").forEach(celda =>{
        celda.classList.add("border","border-salate-300", "p-2", "text-left");

    })
    tabla.querySelectorAll("tbody tr").foreach(celda =>{
        celda.classList.add("even:bg-slate-50");
    });
}

function estilizarPagina(){
    document.body.classList.add("mx-auto", "max-w-5xl", "p-6")

    document.querySelector("h1").classList.add("mb-4", "text-3xl", "font-bold");

    botonCrear.classList.add("mb-6", "rounded-lg", "bg-indigo-700", "px-4", "py-2",
        "font-semibold", "text-white", "hover:bg-indigo-800",
        "disabled:opacity-50")
}

function recolocar(){
    // crear el nuevo div para contener la tabla y la lista
    const zona = document.createElement("div");

    // recuperar la lista
    const zonaLista = document.getElementById("divMensajes");

    // añadir zona delante del div con id divMensajes, variable zona
    zonaLista.before(zona);

    // recoloco el DOM moviendo dos divs al que acabamos de crear
    zona.appendChild(zonaLista);
    zona.appendChild(contenedor);

    // modificamos el aspecto para colocar la lista al lado de la tabla
    zona.classList.add("grid","grid-cols-1", "md:grid-cols-2", "gap-6");
}

function crearTabla() {
    tabla = document.createElement("table");
    tabla.id = "mitabla";
    contenedor.appendChild(tabla);
}

function crearCabeceraTabla() {
    const cabecera = document.createElement("thead");
    tabla.appendChild(cabecera);
}

function crearFilaCabeceraTabla() {
    const fila = document.createElement("tr");

    for (let columna = 1; columna <= numCols; columna++) {
        const celda = document.createElement("th");
        celda.scope = "col";
        celda.textContent = "Cabecera " + columna;
        fila.appendChild(celda);
    }
    tabla.querySelector("thead").appendChild(fila);
}

function estilizarLista(){
    document.querySelector("·divMensaje h2").classList.add(
        "mb-2", "text-xl", "font-semibold"
            );
            
        mensajes.classList.add(
        "space-y-1", 
        "[&>li:last-child]:font-semibold",
        "[&>li:last-child]:text-indigo-700"
        )
}
function crearCuerpoTabla() {
    const cuerpo = document.createElement("tbody");
    tabla.appendChild(cuerpo);
}

function crearFilasCuerpoTabla() {
    const cuerpo = tabla.querySelector("tbody");
    for (let fila = 1; fila <= numFilas; fila++) {
        cuerpo.appendChild(document.createElement("tr"));
    }
}

function createCeldasDatos() {
    const filas = tabla.querySelectorAll("tbody tr");

    filas.forEach((fila, iFila) => {
        for (let td = 1; td <= numCols; td++) {
            let celda = document.createElement("td");
            celda.textContent = `Fila ${iFila + 1}-${td}`;
            fila.appendChild(celda);
        }
    });
}

function ponerBorde() {
    let estiloBorde = document.getElementById("estilo-borde");
    
    // Crea la etiqueta <style> solo si no existe ya
    if (!estiloBorde) {
        estiloBorde = document.createElement("style");
        estiloBorde.id = "estilo-borde";
        estiloBorde.textContent = ".table_borde { border: 2px solid black; }";
        document.head.appendChild(estiloBorde);
    }
    
    tabla.classList.add("table_borde");
}

function borrarBorde() {
    tabla.classList.remove("table_borde");
}

function cargarTailwind() {
    const script = document.createElement("script");
    script.src = "https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4";
    botonCrear.disabled = true;

    script.addEventListener("load", () => {
        mensajes.classList.add("list-decimal", "list-inside");
        // Aplicar estilos de Tailwind a la tabla directamente al cargar
        tabla.classList.add("w-full", "text-left", "border-collapse", "my-4");
        creaPaso("Se ha cargado Tailwind CSS y formateado el elemento.");
        botonCrear.disabled = true; // Deshabilitado al finalizar todos los pasos
    });

    script.addEventListener("error", () => {
        script.remove();
        numElemento--;
        botonCrear.disabled = false;
        alert("No se pudo cargar Tailwind. Vuelve a pulsar Crear.");
    });

    document.head.appendChild(script);
}