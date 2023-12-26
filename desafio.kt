// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val cursosConcluidos: MutableList<ConteudoEducacional> = mutableListOf())

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, nivel: Nivel)) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun concluiu(usuario: Usuario, conteudo: ConteudoEducacional) {
        usuario.cursosConcluidos.add(conteudo)

    }
}

fun main() {
    val alunoJoao = Usuario("João")
    val alunoMaria = Usuario("Maria")
    val alunoJose = Usuario("José")

    val cursoKotlinBasico = ConteudoEducacional("Kotlin Básico")
    val cursoKotlinIntermediario = ConteudoEducacional("Kotlin Intermediário")
    val cursoKotlinAvancado = ConteudoEducacional("Kotlin Avançado")

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(cursoKotlinBasico, cursoKotlinIntermediario, cursoKotlinAvancado), Nivel.DIFICIL)
    formacaoKotlin.matricular(alunoJoao)
    formacaoKotlin.matricular(alunoMaria)
    formacaoKotlin.matricular(alunoJose)

    formacaoKotlin.concluiu(alunoJoao, cursoKotlinBasico)
}
