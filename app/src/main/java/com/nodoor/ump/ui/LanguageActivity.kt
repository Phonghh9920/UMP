package com.nodoor.ump.ui

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.ump.FormError
import com.nodoor.iau_module.ConsentCallBack
import com.nodoor.iau_module.NoDoorAdConsent
import com.nodoor.ump.databinding.ActivityLanguageBinding


class LanguageActivity : AppCompatActivity(), ConsentCallBack {

    private lateinit var binding: ActivityLanguageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLanguageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonShowDialog.setOnClickListener {
            NoDoorAdConsent.showDialogConsent(this)
        }
        binding.buttonRequestDialog.setOnClickListener {
            NoDoorAdConsent.showDialogConsent(this)
        }


    }

    override fun getCurrentActivity(): Activity {
        return this@LanguageActivity
    }

    override fun isDebug(): Boolean {
        return true
    }

    /**
     * https://developers.google.com/admob/android/targeting
     */

    override fun isUnderAgeAd(): Boolean {
        return false
    }

    override fun onNotUsingAdConsent() {
        Log.v("ITGAdConsent", "onNotUsingAdConsent")
    }

    override fun onConsentSuccess(canPersonalized: Boolean) {
        Log.v("ITGAdConsent", "onConsentSuccess")

    }

    override fun onConsentError(formError: FormError) {
        Log.v("ITGAdConsent", "formError  ${formError.message}")
    }

    override fun onConsentStatus(consentStatus: Int) {

    }

    override fun onRequestShowDialog() {

    }
}