package com.example.avt07_zooap.models

import com.example.avt07_zooap.R

data class Animal (
    val id: Int,
    val name: String,
    val species: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)

val animalList = listOf(
    Animal(
        id = 1,
        name = "Guerreiro",
        species = "Mestre do Combate Corpo-a-Corpo",
        imageRes = R.drawable.warrior,
        description = "O guerreiro é um lutador close range, mestre de diversas armas e armaduras.",
        curiosities = "Você sabia que surto de ação é a coisa mais roubada do mundo?."
    ),
    Animal(
        id = 2,
        name = "Mago",
        species = "Mestre das Artes Arcanas",
        imageRes = R.drawable.mage,
        description = "Os magos são estudiosos curiosos da malha da trama, podendo usá-la para alterar a realidade.",
        curiosities = "Contemplem o magoooo!."
    ),
    Animal(
        id = 3,
        name = "Ladino",
        species = "Mestre da Furtividade e do Assassinato",
        imageRes = R.drawable.rogue,
        description = "Os ladinos são discretos, ardilosos e astutos. Focando em pontos fracos, cofres mal fechados e sombras.",
        curiosities = "Verifique seus bolsos 2x ao dia."
    ),
    Animal(
        id = 4,
        name = "Paladino",
        species = "Baluartes Divinos",
        imageRes = R.drawable.paladin,
        description = "Paladinos são servos de divindades, recebendo seus poderes das mesmas e exautando seus ideias com ações.",
        curiosities = "Pdr. Marcelo Rossi é dessa classe."
    ),
    Animal(
        id = 3,
        name = "Bruxo",
        species = "Arauto de Seres Poderosos",
        imageRes = R.drawable.warlock,
        description = "Bruxos são receptáculos dos poderes de entidades extra-planares, fazendo pactos com as mesmas para receber poderes e realizar suas vontades.",
        curiosities = "Ronaldinho Gaúcho é dessa classe."
    ),
)
