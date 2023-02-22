class Tipo(tipo:String) {

    var tipo=tipo

    init {
        val tiposValidos = setOf(
            "acero", "agua", "bicho", "dragon", "electrico", "fantasma", "fuego", "hada",
            "hielo", "lucha", "normal", "planta", "psiquico", "roca", "siniestro", "tierra",
            "veneno", "volador"
        )

        if (tipo.lowercase() in tiposValidos) {
            this.tipo = tipo.lowercase()
        } else {
            this.tipo = ""
            throw IllegalArgumentException("El tipo no es válido")
        }
    }
}