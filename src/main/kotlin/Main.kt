import model.Serie
import model.Videojuego

fun main(args: Array<String>) {

    var serie = arrayOf<Serie>()
    var  videojuego = arrayOf<Videojuego>()

    val serie1 = Serie("Suits" , 9, "Abogados", "Eduardo")
    val serie2 = Serie("Vikings" , 6, "Vikingos", "Charlie")
    val serie3 = Serie("VisAVis" , 5, "Reos", "Amanda")
    val serie4 = Serie("Riverdale" , 6, "Estudiantes", "Felipe")
    val serie5 = Serie("Gambito de Dama" , 1, "Ajedrez", "Sofia")

    val videojuego1 = Videojuego("Horizon Zero Down", 98, "Aventura", "Sony")
    val videojuego2 = Videojuego("Minecraft" , 15, "Exploracion", "Microsoft")
    val videojuego3 = Videojuego("God of War" , 106, "Accion, Aventura", "Monica Studio")
    val videojuego4 = Videojuego("Destiny 2" , 140, "Shooter, Mundo Abierto", "Bungie")
    val videojuego5 = Videojuego("Genshin Impact" , 50, "Aventura", "Hoyoverse")

    serie = serie.plus(serie1)
    serie = serie.plus(serie2)
    serie = serie.plus(serie3)
    serie = serie.plus(serie4)
    serie = serie.plus(serie5)

    videojuego = videojuego.plus(videojuego1)
    videojuego = videojuego.plus(videojuego2)
    videojuego = videojuego.plus(videojuego3)
    videojuego = videojuego.plus(videojuego4)
    videojuego = videojuego.plus(videojuego5)

    serie1.entregar()
    serie2.entregar()
    serie3.entregar()

    videojuego1.entregar()
    videojuego2.entregar()
    videojuego3.entregar()

    var contador = 0
    for(i in serie.indices) {

        if (serie.get(i).isEntregado()) {
            contador++
            serie.get(i).devolver()
        }
    }
    for(i in videojuego.indices) {

        if(videojuego.get(i).isEntregado()){
            contador++
            videojuego.get(i).devolver()
        }
    }

    println("La cantidad de series entregadas es de " + contador)

}