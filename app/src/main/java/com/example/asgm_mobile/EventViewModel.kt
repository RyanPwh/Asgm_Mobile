package com.example.asgm_mobile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//import com.google.firebase.database.DatabaseReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class EventViewModel : ViewModel(){

    private val eventLiveData = MutableLiveData<Event?>()
    private var listener: ListenerRegistration? = null
    var adminid = ""
    private var db: FirebaseFirestore = FirebaseFirestore.getInstance()

    override fun onCleared() {
        super.onCleared()
        listener?.remove()

    }

    // Return observable live data
    fun getEventLiveData(): LiveData<Event?> {
        return eventLiveData
    }

    fun addEvent(eventName: String, oname:String, desc: String, contact:String, eDate: String):Boolean {



        val l = Event(
            id = "",
            ContactNum = contact,
            Date = eDate,
        Description = desc,
        EventName = eventName,
        OName = oname,

        )


        Firebase.firestore
            .collection("Event")
            .document()
            .set(l)


        return true
    }


}