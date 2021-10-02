package com.example.composicionherencia

import java.util.ArrayList
//Se crea el constructor para la clase masajista.
class Masajista (var especialidad:String,var aniosExperiencia:Int ,cargo:ArrayList<String>,id:Int,nombre:String,apellido:String,lugar:Lugar):Empleado(cargo,id,nombre,apellido,lugar){

    //Se sobrescribe el metodo de la clase Masajista
    override fun Identificacion(){
        println("------------Identificacion----------")
        println("Id: $id.")
        println("Nombre: $Nombre.")
        println("Apellido: $Apellido.")
        println("Cargo:$cargo.")
        println("Especialidad: $especialidad.")
        println("Años de Experiencia: $aniosExperiencia.")
        println("Fecha de Nacimiento: ${lugar.FechaNac}.")
        println("Lugar de Nacimineto: ${lugar.LugarNac}.")
        println("---------------------------------------")

    }
    //Se sobrescribe el metodo de la clase Masajista
    override fun Viajar(){
        println("El Masajista $Nombre  $Apellido esta viajando con el equipo")
    }

    //Se sobrescribe el metodo de la clase Masajista
    override fun concentrarse() {
        println("El Masajista $Nombre  $Apellido se esta concentrando con el equipo")
    }

    //Se crea el metodo para la clase Masajista
    fun Darmasaje(){
        println("El masajista $Nombre descontractura al equipo.")
    }

    //Se crea el metodo tostring para la clase Masajista
    override fun toString(): String {
        return "¡El Masajista  de Nombre: $Nombre, Apellido: $Apellido con la  Especialidad: $especialidad fecha de Nacimineto : ${lugar.FechaNac}  \n y Lugar de Nacimiento: ${lugar.LugarNac} se ha Registrado de manera Exitosa!"
    }
}