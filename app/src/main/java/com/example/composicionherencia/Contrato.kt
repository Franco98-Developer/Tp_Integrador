package com.example.composicionherencia

class Contrato  {
    //se establecen los atributos de la clase contrato
    var diasTrabajados:Int=0
    var valorDia:Double=0.0
    var liquidacion:Double=0.0
    var temporadas:Int=0
    var valorTemporadas:Double=0.0
    var Primas:Double=0.0
    var empleado:Empleado
    var total:Double=0.0


    //Se genera el constructor para la clase contrato
    constructor(valordia: Double, diasTrabajdos: Int, empleado: Empleado){
        this.valorDia=valordia
        this.diasTrabajados=diasTrabajdos
        this.empleado = empleado
    }

    //Se genera el metodo para liquidar el sueldo de la clase masajista
    fun liquidarSueldo(valordia: Double,diasTrabajdos: Int):Double{
        total= (valordia * diasTrabajdos).toDouble()
        return total
    }

    //Se genera el metodo para liquidar el sueldo de la clase Jugador y Entrenador
    fun liquidarSueldo(valordia: Double,diasTrabajdos: Int,Primas:Double):Double{
        total= (valordia * diasTrabajdos )+Primas.toDouble()
        return total
    }

    //Se genera el metodo para liquidar el sueldo de la clase Dirigente
    fun liquidarSueldo(temporadas:Int,valorTemporadas:Double,Primas: Double):Double{
        total= (temporadas * valorTemporadas + Primas).toDouble()
        return total

    }

    //Se crea el metodo tostring de la clase contrato
    override fun toString(): String {
        return "El sueldo a cobrar del Empleado ${empleado.Nombre} ${empleado.Apellido}  es de $ $total"
    }


}