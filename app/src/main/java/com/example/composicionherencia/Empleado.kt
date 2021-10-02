package com.example.composicionherencia

import java.util.ArrayList

open class Empleado(var cargo:ArrayList<String> = arrayListOf(),id:Int,nombre:String,apellido:String,lugar:Lugar):Persona(id,nombre,apellido,lugar) {

}