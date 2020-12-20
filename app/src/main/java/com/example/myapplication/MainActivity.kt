package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollButton.setOnClickListener {
                listAnimal()
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun listAnimal() {

        val animal = Animal(9)
        val animalList = animal.list()
        val animalImage: ImageView = findViewById(R.id.imageView)
        val animaltext: TextView = findViewById(R.id.textView)
        val animalinfo: TextView = findViewById((R.id.textView2))

        when(animalList){
            1 -> {
                animalImage.setImageResource(R.drawable.img1)
                animaltext.text = "Asno"
                animalinfo.text = "O Asno é uma subespécie doméstica do Asno-selvagem-africano. É um mamífero perissodáctilo da família Equidae, cujo nome popular é jumento, jegue, jerico, burro ou ainda asno-doméstico. De tamanho médio, focinho e orelhas compridas, é utilizado desde a Pré-história como animal de carga.\n" +
                        "*Nome científico: Equus asinus\n" +
                        "*Expectativa de Vida: 25 – 30 anos (na natureza)\n" +
                        "*Período de Gestação: Fêmea: 11 – 14 meses\n" +
                        "*Peso: 80 – 480 kg (Adulto)\n" +
                        "*Altura: 79 – 160 cm (Adulto, até à cernelha)\n" +
                        "*Velocidade: 24 km/h (Maximum)"
            }
            2 -> {
                animalImage.setImageResource(R.drawable.img2)
                animaltext.text = "Elefante"
                animalinfo.text = "Elefante é o termo genérico e popular pelo qual são denominados os membros da família Elephantidae, um grupo de mamíferos proboscídeos elefantídeos, de grande porte, do qual há três espécies no mundo atual, duas africanas e uma asiática. Há ainda os mamutes, hoje extintos.\n" +
                        "*Comprimento: Elefante-asiático: 5,5 – 6,5 m\n" +
                        "*Velocidade: Elefante-da-savana: 40 km/h\n" +
                        "*Peso: Elefante-da-savana: 6.000 kg, Elefante-asiático: 4.000 kg, Elefante-da-floresta: 2.700 kg\n" +
                        "*Período de Gestação: Elefante-da-savana: 22 meses, Elefante-asiático: 18 – 22 meses\n" +
                        "*Expectativa de Vida: Elefante-da-savana: 60 – 70 anos, Elefante-asiático: 48 anos, Elefante-da-floresta: 60 – 70 anos\n" +
                        "*Altura: Elefante-da-savana: 3,2 m, Elefante-asiático: 2,8 m"
            }
            3 -> {
                animalImage.setImageResource(R.drawable.img3)
                animaltext.text = "Urso Panda"
                animalinfo.text = "O panda-gigante é um mamífero omnívoro da família Ursidae endêmico da República Popular da China\n" +
                        "*Nome científico: Ailuropoda melanoleuca\n" +
                        "*Expectativa de Vida: 20 anos (na natureza)\n" +
                        "*Peso: Fêmea: 70 – 100 kg (Adulto)\n" +
                        "*Altura: 60 – 90 cm (Adulto, até ao ombro)\n" +
                        "*Nível Trófico: Herbívoro Enciclopédia da Vida\n" +
                        "*Comprimento: 1,2 – 1,9 m (Adulto)\n" +
                        "*Período de Gestação: 95 – 160 dias"
            }
            4 -> {
                animalImage.setImageResource(R.drawable.img4)
                animaltext.text = "Urso pardo"
                animalinfo.text = "O urso-pardo é um mamífero carnívoro da família dos ursídeos. É o urso de mais ampla distribuição geográfica dentre todos os membros vivos de sua família.\n" +
                        "*Nome científico: Ursus arctos\n" +
                        "*Peso: 80 – 600 kg (Adulto)\n" +
                        "*Altura: 70 – 150 cm (Adulto, até ao ombro)\n" +
                        "*Velocidade: Urso-cinzento: 56 km/h\n" +
                        "*Comprimento: 1,4 – 2,8 m (Adulto, cabeça e corpo)\n" +
                        "*Expectativa de Vida: Urso-cinzento: 20 – 25 anos, Urso-marsicano: 35 anos"
            }
            5 -> {
                animalImage.setImageResource(R.drawable.img5)
                animaltext.text = "Zebra"
                animalinfo.text ="As zebras são mamíferos que pertencem à família dos cavalos, os equídeos, nativos da África central e do sul.\n" +
                        "*Velocidade: Zebra comum: 65 km/h\n" +
                        "*Reino: Animalia\n" +
                        "*Classe: Mammalia\n" +
                        "*Peso: Zebra comum: 400 kg, Equus zebra: 280 kg, Equus grevyi: 380 kg\n" +
                        "*Comprimento: Equus zebra: 2,4 m, Equus grevyi: 2,7 m Enciclopédia da Vida\n" +
                        "*Período de Gestação: Equus zebra: 12 meses, Equus grevyi: 13 meses"
            }
            6 -> {
                animalImage.setImageResource(R.drawable.img6)
                animaltext.text = "Hipopótamo"
                ("O hipopótamo-comum ou hipopótamo-do-nilo é um mamífero Omnívoro de grande porte da África subsariana e uma das duas únicas espécies não extintas da família Hippopotamidae, sendo a outra o hipopótamo-pigmeu. \n" +
                        "*Velocidade: 48 km/h (Maximum, em terra, correndo)\n" +
                        "*Nível Trófico: Onívoro \n" +
                        "*Expectativa de Vida: 40 – 50 anos\n" +
                        "*Período de Gestação: 243 dias\n" +
                        "*Comprimento: 3,3 – 5,2 m (Adulto)\n" +
                        "*Altura: 1,5 m (Adulto, até ao ombro)\n" +
                        "*Peso: Macho: 1.500 – 1.800 kg (Adulto), Fêmea: 1.300 – 1.500 kg (Adulto)").also { animalinfo.text = it }
            }
            7 -> {
                animalImage.setImageResource(R.drawable.img7)
                animaltext.text = "Girafa"
                animalinfo.text = "Traduzido do inglês-A girafa é um mamífero artiodáctilo africano, o animal terrestre vivo mais alto e o maior ruminante. É tradicionalmente considerada uma espécie, Giraffa camelopardalis, com nove subespécies.\n" +
                        "*Altura: 4,6 – 6,1 m\n" +
                        "*Comprimento: 4,2 m Enciclopédia da Vida\n" +
                        "*Peso:: 800 kg Enciclopédia da Vida\n" +
                        "*Período de Gestação: 15 meses Enciclopédia da Vida\n" +
                        "*Horas de Sono: 4,6 horas (em cativeiro)\n" +
                        "*Velocidade: 60 km/h (Maximum, sprint)"
            }
            8 -> {
                animalImage.setImageResource(R.drawable.img8)
                animaltext.text = "Leão"
                animalinfo.text = "O leão [feminino: leoa] é uma espécie de mamífero carnívoro do gênero Panthera e da família Felidae. A espécie é atualmente encontrada na África subsaariana e na Ásia, com uma única população remanescente em perigo, no Parque Nacional da Floresta de Gir, Gujarat, Índia.\n" +
                        "*Nome científico: Panthera leo\n" +
                        "*Expectativa de Vida: 10 – 14 anos (Adulto, na natureza)\n" +
                        "*Símbolo de: Inglaterra\n" +
                        "*Velocidade: 80 km/h (Maximum, em curtos períodos)\n" +
                        "*Peso: Macho: 190 kg (Adulto), Fêmea: 130 kg (Adulto)\n" +
                        "*Comprimento: Macho: 1,7 – 2,5 m (cabeça e corpo), Fêmea: 1,4 – 1,8 m (cabeça e corpo)\n" +
                        "*Altura: Macho: 1,2 m (Adulto, até ao ombro), Fêmea: 1,1 m (Adulto, até ao ombro)"
            }
            9 -> {
                animalImage.setImageResource(R.drawable.img9)
                animaltext.text = "Cavalo"
                animalinfo.text = "Cavalo é um mamífero herbívoro da ordem dos ungulados, uma das três subespécies modernas da espécie Equus ferus. A denominação para as fêmeas é égua, para os machos não castrados é garanhão, para os machos castrados é capão, e para os filhotes é potro.\n" +
                        "*Velocidade: 88 km/h (Maximum, sprint)\n" +
                        "*Nível Trófico: Herbívoro" +
                        "*Expectativa de Vida: 25 – 30 anos\n" +
                        "*Período de Gestação: 11 – 12 meses\n" +
                        "*Comprimento: 2,4 m (Adulto)\n" +
                        "*Peso: 380 – 1.000 kg (Adulto)\n"
            }
        }
    }
}

class Animal(private val num: Int){

    fun list():Int {
        return (1..num).random()
    }
}