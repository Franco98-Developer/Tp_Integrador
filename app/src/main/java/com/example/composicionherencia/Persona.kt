package com.example.composicionherencia
//Se utiliza la clase open para poder acceder a ella.
open class Persona {
    //Se establece los atributos.
    var id :Int=0
    var Nombre: String=""
    var Apellido: String=""
    var lugar: Lugar =Lugar("","")//Se declara el atributo de la composicion
    var edad:Int=0
        get() = field
        set(value) {
            verificarEdad(value)
            field = value
        }

    //Se inicializa el constructor.
    constructor(id:Int,Nombre:String,Apellido:String,lugar:Lugar){
        this.id=id
        this.Nombre=Nombre
        this.Apellido=Apellido
        this.lugar.LugarNac=lugar.LugarNac
        this.lugar.FechaNac=lugar.FechaNac
    }


    //Metodo llamado por el atributo edad.
    fun verificarEdad(edad: Int){
        if(edad<18){
            println("Edad: $edad")
            println("Debes ser mayor de Edad.")

        }else{
            println("Edad: $edad")
            println("Sos mayor de edad y estas apto para pertenecer al club")
        }
    }
    //Se establece los metodos y se le agrega la palabra open para habilitar la herencia.

    open fun concentrarse(){
        println("La Persona $Nombre esta concentrandose")
        println("---------------------------------------")

    }

    open fun Viajar(){
        println("La Persona $Nombre esta viajando.")
        println("---------------------------------------")
    }

    open fun Identificacion(){
        println("------------Identificacion----------")
        println("Id: $id.")
        println("Nombre: ${this.Nombre}.")
        println("Apellido: ${this.Apellido}.")
        println("Fecha de Nacimiento: ${this.lugar.FechaNac}.")
        println("Lugar de Nacimiento: ${this.lugar.LugarNac}.")
        println("---------------------------------------")

    }

    //Se crea el objeto toString de la clase persona.

    override fun toString(): String {
        return "¡La Persona  de Nombre: $Nombre, Apellido: $Apellido con la  fecha de Nacimineto : ${lugar.FechaNac}  \n y Lugar de Nacimiento: ${lugar.LugarNac} se ha Registrado de manera Exitosa!"
    }
}