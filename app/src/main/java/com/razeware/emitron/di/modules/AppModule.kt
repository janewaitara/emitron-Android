package com.razeware.emitron.di.modules

import android.app.Application
import android.content.Context
import com.razeware.emitron.di.bindings.WorkerBindings
import com.razeware.emitron.di.modules.viewmodel.ViewModelModule
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Module(
  includes = [
    AndroidInjectionModule::class,
    ViewModelModule::class,
    NetModule::class,
    DataModule::class,
    SessionModule::class,
    WorkerBindings::class,
    DownloadModule::class
  ]
)
class AppModule {

  @Singleton
  @Provides
  fun provideApplicationContext(application: Application): Context = application

}
