package app.revanced.manager.ui.viewmodel

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.lifecycle.ViewModel
import app.revanced.manager.domain.manager.PreferencesManager
import app.revanced.manager.ui.theme.Theme
import app.revanced.manager.util.ghOrganization
import app.revanced.manager.util.openUrl

class SettingsViewModel(
    private val app: Application,
    val prefs: PreferencesManager
) : ViewModel() {
    var showThemePicker by mutableStateOf(false)
        private set

    fun showThemePicker() {
        showThemePicker = true
    }

    fun dismissThemePicker() {
        showThemePicker = false
    }

    fun setTheme(theme: Theme) {
        prefs.theme = theme
    }

    fun openGitHub() = app.openUrl(ghOrganization)
}