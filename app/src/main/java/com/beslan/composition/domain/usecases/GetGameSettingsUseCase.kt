package com.beslan.composition.domain.usecases

import com.beslan.composition.domain.entity.GameSettings
import com.beslan.composition.domain.entity.Level
import com.beslan.composition.domain.repository.GameRepository
import javax.inject.Inject

class GetGameSettingsUseCase @Inject constructor (private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}