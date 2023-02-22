class Tipo(tipo:String) {

    var tipo=tipo
    val efectividades = mapOf(
        "acero" to mapOf("acero" to "normal", "agua" to "poco eficaz", "bicho" to "normal", "dragón" to "normal", "eléctrico" to "normal", "fantasma" to "normal", "fuego" to "normal", "hada" to "normal", "hielo" to "normal", "lucha" to "normal", "normal" to "normal", "planta" to "normal", "psíquico" to "normal", "roca" to "muy poco eficaz", "siniestro" to "normal", "tierra" to "muy eficaz", "veneno" to "normal", "volador" to "normal"),
        "agua" to mapOf("acero" to "muy poco eficaz", "agua" to "poco eficaz", "bicho" to "normal", "dragón" to "normal", "eléctrico" to "normal", "fantasma" to "normal", "fuego" to "muy eficaz", "hada" to "normal", "hielo" to "normal", "lucha" to "normal", "normal" to "normal", "planta" to "muy eficaz", "psíquico" to "normal", "roca" to "normal", "siniestro" to "normal", "tierra" to "muy poco eficaz", "veneno" to "normal", "volador" to "normal"),
        "bicho" to mapOf("acero" to "muy poco eficaz", "agua" to "normal", "bicho" to "normal", "dragón" to "poco eficaz", "eléctrico" to "poco eficaz", "fantasma" to "normal", "fuego" to "normal", "hada" to "poco eficaz", "hielo" to "normal", "lucha" to "muy eficaz", "normal" to "normal", "planta" to "poco eficaz", "psíquico" to "normal", "roca" to "muy eficaz", "siniestro" to "poco eficaz", "tierra" to "normal", "veneno" to "muy poco eficaz", "volador" to "poco eficaz"))


    init {
        val efectividades = mapOf(
            "acero" to mapOf("acero" to "normal", "agua" to "poco eficaz", "bicho" to "normal", "dragón" to "normal", "eléctrico" to "normal", "fantasma" to "normal", "fuego" to "normal", "hada" to "normal", "hielo" to "normal", "lucha" to "normal", "normal" to "normal", "planta" to "normal", "psíquico" to "normal", "roca" to "muy poco eficaz", "siniestro" to "normal", "tierra" to "muy eficaz", "veneno" to "normal", "volador" to "normal"),
            "agua" to mapOf("acero" to "muy poco eficaz", "agua" to "poco eficaz", "bicho" to "normal", "dragón" to "normal", "eléctrico" to "normal", "fantasma" to "normal", "fuego" to "muy eficaz", "hada" to "normal", "hielo" to "normal", "lucha" to "normal", "normal" to "normal", "planta" to "muy eficaz", "psíquico" to "normal", "roca" to "normal", "siniestro" to "normal", "tierra" to "muy poco eficaz", "veneno" to "normal", "volador" to "normal"),
            "bicho" to mapOf("acero" to "muy poco eficaz", "agua" to "normal", "bicho" to "normal", "dragón" to "poco eficaz", "eléctrico" to "poco eficaz", "fantasma" to "normal", "fuego" to "normal", "hada" to "poco eficaz", "hielo" to "normal", "lucha" to "muy eficaz", "normal" to "normal", "planta" to "poco eficaz", "psíquico" to "normal", "roca" to "muy eficaz", "siniestro" to "poco eficaz", "tierra" to "normal", "veneno" to "muy poco eficaz", "volador" to "poco eficaz"))
        

        if (tipo.lowercase() in efectividades) {
            this.tipo = tipo.lowercase()
        } else {
            this.tipo = ""
            throw IllegalArgumentException("El tipo no es válido")
        }
    }


}