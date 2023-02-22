class Pokemon(
    val nombre: String,
    val tipo: Tipo,
    val nivel: Int,
    val ataques: MutableList<Ataque> = MutableList(4) { Ataque("", Tipo("")) }
) {

    // Constructor secundario
    constructor(nombre: String, tipo: Tipo, nivel: Int) : this(nombre, tipo, nivel, MutableList(4) { Ataque("", Tipo("")) })





