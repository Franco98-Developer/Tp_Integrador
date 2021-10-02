package com.example.composicionherencia

import java.util.ArrayList

class Dirigente(var anioDecargo:Int, cargo: ArrayList<String>,
                id:Int, nombre:String, apellido:String, lugar:Lugar):Empleado(cargo,id,nombre,apellido,lugar) {

    var ListaEleccion: Boolean=false
        get() = field
        set(value){
            lista(value)
            field=value
        }

    //Se sobrescribe el metodo de la clase Empleado
    override fun Identificacion(){
        println("------------Identificacion----------")
        println("Nombre: $Nombre.")
        println("Apellido: $Apellido.")
        println("Id: $id.")
        println("Cargo Dirigencial: $cargo")
        println("Años de Mandato: $anioDecargo.")
        println("---------------------------------------")

    }
    fun lista(LEleccion:Boolean){
        if (LEleccion==true){
            println("Se postula para las proximas elecciones.")
        }
        else{
            println("No se puede postular para las proximas elecciones.")
        }
    }

    //Se sobrescribe el metodo de la clase Empleado
    override fun Viajar(){
        println("El Dirigente $Nombre  $Apellido esta viajando con el equipo.")
    }
    //Se sobrescribe el metodo de la clase Empleado
    override fun concentrarse() {
        println("El Dirigente $Nombre  $Apellido se esta concentrando con el equipo")
    }
    //Se crea el metodo para la clase dirigente
    fun Reunion(){
        println("EL Diriginte $Nombre  $Apellido Asiste a la reunion de AFA. ")
    }

    //se crea el metodo tostring para la clase dirigente
    override fun toString(): String {
        return "¡El Dirigente de Nombre: $Nombre, Apellido: $Apellido con  Cargo:$cargo,Años de mandato:$anioDecargo \n, fecha de Nacimineto : ${lugar.FechaNac}  y Lugar de Nacimiento: ${lugar.LugarNac} se ha Registrado de manera Exitosa!"
    }


}