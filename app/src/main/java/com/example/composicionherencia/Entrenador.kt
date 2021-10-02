package com.example.composicionherencia

import java.util.ArrayList

class Entrenador (val id_federacion:String, cargo: ArrayList<String>,
                  id:Int, nombre:String, apellido:String, lugar:Lugar):Empleado(cargo,id,nombre,apellido,lugar) {
    //Se sobrescribe el metodo de la clase Entrenador
    override fun Viajar(){
        println("El entrenador $Nombre  $Apellido esta viajando con el equipo")
    }

    //Se sobrescribe el metodo de la clase Entrenador
    override fun concentrarse() {
        println("El entrenador $Nombre  $Apellido se esta concentrando con el equipo")
    }

    //Se crea el metodo para la clase Entrenador
    fun DirigirPartido(){
        println("El entrenador $Nombre $Apellido dirige  los partidos ")
    }
    //Se crea el metodo para la clase entrenador
    fun DirigirEntrenamiento(){
        println("El entrenador $Nombre $Apellido dirige  los Entrenamientos ")
    }
    //Se sobrescribe el metodo de la clase Entrenador
    override fun Identificacion(){
        println("------------Identificacion------------")
        println("Id: $id.")
        println("Nombre: $Nombre.")
        println("Apellido: $Apellido.")
        println("Cargo:$cargo")
        println("ID Federacion: $id_federacion.")
        println("---------------------------------------")

    }
    //Se crea el metodo tostring para la clase Entrenador
    override fun toString(): String {
        return "¡El Entrenador de Nombre: $Nombre, Apellido: $Apellido con la  \n Federacion:$id_federacion, fecha de Nacimineto : ${lugar.FechaNac}  y Lugar de Nacimiento: ${lugar.LugarNac} se ha Registrado de manera Exitosa!"
    }
}