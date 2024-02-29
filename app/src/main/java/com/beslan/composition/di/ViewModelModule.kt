package com.beslan.composition.di

import androidx.lifecycle.ViewModel
import com.beslan.composition.presentation.GameViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(GameViewModel::class)
    fun bindGameViewModel(viewModel: GameViewModel): ViewModel

}