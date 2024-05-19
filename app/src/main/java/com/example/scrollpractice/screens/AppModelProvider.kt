package com.example.scrollpractice.screens

import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.scrollpractice.ImageApplication

/**
 * Provides Factory to create instance of ViewModel for the entire app
 */
object AppViewModelProvider {
    val Factory = viewModelFactory {
        // Initializer for CameraViewModel
        initializer {
            val application = (this[AndroidViewModelFactory.APPLICATION_KEY] as ImageApplication)
            CameraViewModel(application.container.imageRepository)
        }
        // Initializer for MyScreenViewModel
        initializer {
            val application = (this[AndroidViewModelFactory.APPLICATION_KEY] as ImageApplication)
            MyScreenViewModel(application.container.imageRepository)
        }
    }
}
