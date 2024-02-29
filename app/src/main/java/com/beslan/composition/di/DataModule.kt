package com.beslan.composition.di

import com.beslan.composition.data.GameRepositoryImpl
import com.beslan.composition.domain.repository.GameRepository
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindGameRepository(impl: GameRepositoryImpl): GameRepository

}