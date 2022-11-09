package com.example.modulo5_classes_em_kotlin

fun main() {
    var veiculo = veiculo("Versa")
    println("PARTIDA_________________________________")
    veiculo.imprimirVelocidade()
    veiculo.aceleracao(30)
    veiculo.imprimirVelocidade()
    veiculo.aceleracao(20)
    veiculo.imprimirVelocidade()
    veiculo.reduzir(10)
    veiculo.imprimirVelocidade()
    veiculo.reduzir(45)
    veiculo.imprimirVelocidade()
    println("FINAL DA CORRIDA________________________")
}

class veiculo(modelo: String){
    var velocidade: Long
    var aceleracao: Long
    var reducao: Long
    var modelo: String
    init {
        this.velocidade = 0
        this.aceleracao = 0
        this.reducao = 0
        this.modelo = modelo
    }

    fun aceleracao(valorAceleracao: Long){
        velocidade += valorAceleracao
    }

    fun reduzir(reducao: Long){
        velocidade -= reducao
        if(velocidade < 0)
            velocidade = 0
    }

    fun imprimirVelocidade(){
        println("Modelo: $modelo, Velocidade Atual: $velocidade")
    }
}

/**Criar uma classe veículo que tenha as seguintes propriedades e métodos:
 * Propriedades:
 * -Long velocity: Valor inicial 0
 * -Long acceleration: Valor inicial 10
 * -String model
 *
 * Métodos:
    -Crie um método para incrementar a velocidade do carro que calcule a nova velocidade,
     somando o valor da propriedade acceleration ao da velocity, salvando o resultado em velocity

    -Crie um método para reduzir a velocidade do carro que calcule a nova velocidade,
     decrementando o valor da propriedade acceleration ao da velocity, salvando o resultado em velocity.
     Importante! O valor da velocidade nunca pode ser negativo.

    -Crie um método que retorna a velocidade atual do veículo.
 **/