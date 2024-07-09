package com.nodoor.iau_module

import com.google.android.play.core.appupdate.AppUpdateInfo
import com.google.android.play.core.install.model.AppUpdateType


interface UpdateInstanceCallback {
    fun updateAvailableListener(updateAvailability: AppUpdateInfo): Int {
        return AppUpdateType.FLEXIBLE
    }

    fun initializeMobileAdsSdk() {

    }

    fun resultConsentForm(canRequestAds: Boolean) {

    }
}