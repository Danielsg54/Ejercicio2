package model

class Videojuego : Entregable{

    var pTitulo : String = ""
    var horas_estimadas : Int = 0
    var pEntregado : Boolean = false
    var pGenero : String = ""
    var pCompania : String = ""

    constructor(){

    }

    constructor(pTitulo : String, horas_estimadas : Int){

        this.pTitulo = pTitulo
        this.horas_estimadas = horas_estimadas
    }

    constructor(pTitulo : String, horas_estimadas : Int, pGenero : String,  pCompania : String){
        this.pTitulo = pTitulo
        this.horas_estimadas = horas_estimadas
        this.pGenero = pGenero
        this.pCompania = pCompania
    }

    override fun entregar() {
        this.pEntregado = true
    }

    override fun devolver() {
        this.pEntregado = false
    }

    override fun isEntregado(): Boolean {

        return this.pEntregado
    }
}