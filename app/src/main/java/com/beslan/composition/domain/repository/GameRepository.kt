package com.beslan.composition.domain.repository

import com.beslan.composition.domain.entity.GameSettings
import com.beslan.composition.domain.entity.Level
import com.beslan.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question
    fun getGameSettings(level: Level): GameSettings

}