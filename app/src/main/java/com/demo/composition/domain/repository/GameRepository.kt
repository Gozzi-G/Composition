package com.demo.composition.domain.repository

import com.demo.composition.domain.entity.GameSettings
import com.demo.composition.domain.entity.Level
import com.demo.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level) : GameSettings
}