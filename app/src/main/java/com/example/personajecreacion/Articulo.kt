package com.example.personajecreacion

class Articulo(
    private var tipoArticulo: TipoArticulo,
    private var nombre: Nombre,
    private var peso: Int
) {

    enum class TipoArticulo { ARMA, OBJETO, PROTECCION, ORO }
    enum class Nombre { BASTON, ESPADA, DAGA, MARTILLO, GARRAS, POCION, IRA, ESCUDO, ARMADURA, MONEDA }

    fun getPeso(): Int {
        return peso
    }

    fun getNombre(): Nombre {
        return nombre
    }

    fun getTipoArticulo(): TipoArticulo {
        return tipoArticulo
    }

    fun getAumentoAtaque(): Int {
        return when (nombre) {
            Nombre.BASTON -> 10
            Nombre.ESPADA -> 20
            Nombre.DAGA -> 15
            Nombre.MARTILLO -> 25
            Nombre.GARRAS -> 30
            Nombre.IRA -> 80
            else -> 0 // Para otros tipos de armas no especificados
        }
    }

    fun getAumentoDefensa(): Int {
        return when (nombre) {
            Nombre.ESCUDO -> 10
            Nombre.ARMADURA -> 20
            else -> 0 // Para otros tipos de protecciones no especificados
        }
    }

    fun getAumentoVida(): Int {
        return when (nombre) {
            Nombre.POCION -> 100
            else -> 0 // Para otros tipos de objetos no especificados
        }
    }

    override fun toString(): String {
        return "[Tipo Artículo:$tipoArticulo, Nombre:$nombre, Peso:$peso]"
    }
}