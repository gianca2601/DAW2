
let persona= {
	nombre:"pepe",
 	edad: 22,
 	saludar:function(){
 	console.log("hola, soy: " + this.nombre +"-" + this.edad);

 }

 }; 
 persona.saludar();
 console.log(persona.nombre);

 function Animal(nombre, tipo){
 		this.nombre= nombre;
	 	this.tipo = tipo;
	 	this.saludar = function(){

 			console.log("hola me llamo "+ this.nombre);
 			console.log("y soy  "+ this.tipo);
	 };
 }
 
 let prr = new Animal( "chichi, "perro");
 let gt = new Animal( "pirata", "gato");

 prr.saludar();
 console.log (prr.nombre);
 gr.saludar();