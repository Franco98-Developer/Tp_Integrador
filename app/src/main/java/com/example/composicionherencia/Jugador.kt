package com.example.composicionherencia

import java.util.ArrayList

class Jugador(var dorsal:Int, cargo: ArrayList<String>, id:Int, nombre:String, apellido:String, lugar:Lugar):Empleado(cargo,id,nombre,apellido,lugar){

    var nacionalidad:String=""
        get() = field
        set(value) {
            verificar(value)
            field = value
        }

    //Se sobrescribe el metodo de la clase Jugador
    override fun Identificacion(){
        println("------------Identificacion-------------")
        println("Id: $id.")
        println("Nombre: $Nombre.")
        println("Apellido: $Apellido.")
        println("Cargo:$cargo.")
        println("Dorsal: $dorsal.")
        println("Fecha de Nacimiento: ${lugar.FechaNac}.")
        println("Lugar de Nacimineto: ${lugar.LugarNac}.")
        println("---------------------------------------")
    }

    fun verificar(nacionalidad:String){
        if (nacionalidad=="Argentina"){
            println("Estas Apto para la combocatoria del seleccionado nacional.AFA.")
        }
        else{
            println("No estas apto para formar parte del selccionado Argentino.AFA.")

        }
    }
    //Se sobrescribe el metodo de la clase Jugador
    override fun Viajar(){
        println("El Jugador $Nombre  $Apellido esta viajando con el equipo.")
    }
    //Se sobrescribe el metodo de la clase Jugador
    override fun concentrarse() {
        println("El Jugador $Nombre  $Apellido se esta concentrando con el equipo.")
    }

    //Se crea el metodo para la clase jugador
    fun jugarPartido(){
        println("El jugador $Nombre esta combocado para jugar el partido.")
    }
    //Se crea el metodo para la clase jugador
    fun Entrenar(){
        println("El jugador $Nombre se esta entrenando para el partido.")
    }
    //Se crea el metodo tostring para la clase  jugador
    override fun toString(): String {
        return "¡El Futbolista de Nombre: $Nombre, Apellido: $Apellido con el Dorsal:$dorsal \n, fecha de Nacimineto : ${lugar.FechaNac}  y Lugar de Nacimiento: ${lugar.LugarNac} se ha Registrado de manera Exitosa!"
    }
}