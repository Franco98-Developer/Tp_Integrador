package com.example.composicionherencia

fun main(){

    var lug1=Lugar("Capital Federal","15/10/1998")//Se crea el objeto lugar para la persona
    var p1=Persona(2,"franco","Fernandez",lug1)//Se crea el objeto persona
    var edad:Int=18

    //Se llama a los metodos de la clase persona.
    p1.Identificacion()
    p1.Viajar()
    p1.concentrarse()
    println(p1)//se llama al metodo tostring de la clase persona.
    p1.edad=edad

    println("------------------------------------------------------------------------------------------")

    //Se establecen los objetos
    var lugMasajista=Lugar("Lomas De Zamora","22/7/1991")
    var msa1=Masajista("Reflexologia",7,arrayListOf("Intercional"),19,"jose","Hernandez",lugMasajista)
    var contratoMasajista=Contrato(2000.0,20,msa1)
    contratoMasajista.liquidarSueldo(4000.0,24)
    msa1.Identificacion()
    msa1.Darmasaje()
    println(contratoMasajista)
    println(msa1)//se llama al metodo tostring de la clase Masajista.

    println("-------------------------------------------------------------------------------------------")
    //Se establecen los objetos
    var lugFut=Lugar("Bahia Blanca","23/01/1974")
    var jug1=Jugador(10,arrayListOf("Delantero"),4,"Lionel","Messi",lugFut)
    var nacionalidad="Argentina"
    var contratoJug=Contrato(500000.0,24,jug1)
    jug1.Identificacion()
    jug1.Entrenar()
    jug1.jugarPartido()
    contratoJug.liquidarSueldo(2,3000000.0,5000.0)
    jug1.nacionalidad=nacionalidad
    println(contratoJug)

    println("-------------------------------------------------------------------------------------------")

    //Se establecen los objetos
    var lugarEntre=Lugar("Cordoba","12/10/1982")
    var entre1=Entrenador("AFA",arrayListOf("Entrenador de la AFA"),5,"Lionel","Scaloni",lugarEntre)
    var contratoEntre=Contrato(2000.0,24,entre1)

    entre1.Identificacion()
    entre1.DirigirPartido()
    entre1.DirigirEntrenamiento()
    contratoEntre.liquidarSueldo(4,1000000.0,20.000)
    println(contratoEntre)
    println(entre1)

    println("-------------------------------------------------------------------------------------------")

    //Se establecen los objetos
    var Listaeleccion:Boolean=true
    var lugarDir=Lugar("Lanus","18/05/1964")
    var dir1=Dirigente(4,arrayListOf("Presidente"),12,"Hugo","Moyano",lugarDir)
    var contratoDir=Contrato(3000.0,30,dir1)


    dir1.Identificacion()
    dir1.Viajar()
    dir1.Reunion()
    dir1.ListaEleccion=Listaeleccion
    println("-------------------------------------------------------------------------------------------")
    contratoDir.liquidarSueldo(3000.0,30,200.0)
    println(contratoDir)
    println("-------------------------------------------------------------------------------------------")
    println(dir1)



}