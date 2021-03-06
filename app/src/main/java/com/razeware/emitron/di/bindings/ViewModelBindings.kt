package com.razeware.emitron.di.bindings

import androidx.lifecycle.ViewModel
import com.razeware.emitron.MainViewModel
import com.razeware.emitron.di.modules.viewmodel.ViewModelKey
import com.razeware.emitron.ui.collection.CollectionViewModel
import com.razeware.emitron.ui.download.DownloadViewModel
import com.razeware.emitron.ui.filter.FilterViewModel
import com.razeware.emitron.ui.library.LibraryViewModel
import com.razeware.emitron.ui.login.LoginViewModel
import com.razeware.emitron.ui.mytutorial.bookmarks.BookmarkViewModel
import com.razeware.emitron.ui.mytutorial.progressions.ProgressionViewModel
import com.razeware.emitron.ui.onboarding.OnboardingViewModel
import com.razeware.emitron.ui.player.PlayerViewModel
import com.razeware.emitron.ui.settings.SettingsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelBindings {

  @Binds
  @IntoMap
  @ViewModelKey(MainViewModel::class)
  abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(LibraryViewModel::class)
  abstract fun bindLibraryViewModel(viewModel: LibraryViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(BookmarkViewModel::class)
  abstract fun bindBookmarkViewModel(viewModel: BookmarkViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(FilterViewModel::class)
  abstract fun bindFilterViewModel(viewModel: FilterViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(LoginViewModel::class)
  abstract fun bindLoginViewModel(viewModel: LoginViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(SettingsViewModel::class)
  abstract fun bindSettingsViewModel(viewModel: SettingsViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(DownloadViewModel::class)
  abstract fun bindDownloadViewModel(viewModel: DownloadViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(PlayerViewModel::class)
  abstract fun bindPlayerViewModel(viewModel: PlayerViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(OnboardingViewModel::class)
  abstract fun bindOnboardingViewModel(viewModel: OnboardingViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(CollectionViewModel::class)
  abstract fun bindCollectionViewModel(viewModel: CollectionViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(ProgressionViewModel::class)
  abstract fun bindProgressionViewModel(viewModel: ProgressionViewModel): ViewModel
}
