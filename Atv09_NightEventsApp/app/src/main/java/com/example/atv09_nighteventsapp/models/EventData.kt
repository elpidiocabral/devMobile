package com.example.atv09_nighteventsapp.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.atv09_nighteventsapp.R
import com.example.atv09_nighteventsapp.R.drawable.img1
import com.example.atv09_nighteventsapp.R.drawable.img2
import com.example.atv09_nighteventsapp.R.drawable.img3
import com.example.atv09_nighteventsapp.R.drawable.img4
import com.example.atv09_nighteventsapp.R.drawable.img5

data class Event(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val location: String,
    val isFavorite: MutableState<Boolean> = mutableStateOf(false),
    val isSubscribed: MutableState<Boolean> = mutableStateOf(false),
    val imageRes: Int
)

val eventList = listOf(
    Event(
        id = 1,
        title = "Conferência de Elden Ring",
        description = "Tendências em Elden Ring.",
        date = "2024-12-15",
        location = "Centro de Eventos Quixadaense",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = img1
    ),
    Event(
        id = 2,
        title = "Palestra - Montando Builds de Arcano",
        description = "Aprenda a montar builds de Arcano de formo otimizada.",
        date = "2024-12-26",
        location = "Centro de Eventos Quixadaense",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = img2
    ),
    Event(
        id = 3,
        title = "Palestra - Montando Builds de Inteligência",
        description = "Aprenda a montar builds de Inteligência de formo otimizada.",
        date = "2024-12-24",
        location = "Centro de Eventos Quixadaense",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = img3
    ),
    Event(
        id = 4,
        title = "Reunião dos Intusiastas de Godwyn",
        description = "Os fiéis do príncipe da morte se reunem para discutir o que fazer.",
        date = "2024-12-01",
        location = "Centro de Eventos Quixadaense",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = img4
    ),
    Event(
        id = 5,
        title = "Palestra - Melhores Equipamentos Lendários da DLC",
        description = "Melhores equipamentos vindos da DLC - Shadow of the Erdtree.",
        date = "2024-12-02",
        location = "Centro de Eventos Quixadaense",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = img5
    ),
)
