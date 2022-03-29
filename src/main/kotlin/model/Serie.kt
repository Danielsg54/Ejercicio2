package model

class Serie : Entregable{

    var pTitulo : String = ""
    var num_temporadas : Int = 3
    var pEntregado : Boolean = false
    var pGenero : String = ""
    var pCreador : String = ""

    constructor(){

    }

    constructor(pTitulo : String, pCreador : String){
        this.pTitulo = pTitulo
        this.pCreador = pCreador
    }

    constructor(pTitulo : String, num_temporadas : Int, pGenero : String, pCreador : String){

        this.pTitulo = pTitulo
        this.num_temporadas = num_temporadas
        this.pGenero = pGenero
        this.pCreador = pCreador

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