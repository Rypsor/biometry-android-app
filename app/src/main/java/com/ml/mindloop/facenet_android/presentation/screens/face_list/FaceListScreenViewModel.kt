package com.ml.mindloop.facenet_android.presentation.screens.face_list

import androidx.lifecycle.ViewModel
import com.ml.mindloop.facenet_android.domain.ImageVectorUseCase
import com.ml.mindloop.facenet_android.domain.PersonUseCase
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class FaceListScreenViewModel(
    val imageVectorUseCase: ImageVectorUseCase,
    val personUseCase: PersonUseCase,
) : ViewModel() {
    val personFlow = personUseCase.getAll()

    // Remove the person from `PersonRecord`
    // and all associated face embeddings from `FaceImageRecord`
    fun removeFace(id: Long) {
        personUseCase.removePerson(id)
        imageVectorUseCase.removeImages(id)
    }
}
