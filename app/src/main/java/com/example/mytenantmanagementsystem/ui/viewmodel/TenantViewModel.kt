package com.example.mytenantmanagementsystem.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.example.mytenantmanagementsystem.data.model.Tenant
import com.example.mytenantmanagementsystem.data.repository.TenantRepository

class TenantViewModel : ViewModel() {

    init {
        Log.d("TENANT_LIFECYCLE", "TenantViewModel: init")
    }

    private val _tenants = MutableLiveData<List<Tenant>>(TenantRepository.tenants.toList())
    val tenants: LiveData<List<Tenant>> get() = _tenants

    val tenantCountText: LiveData<String> = tenants.map { list ->
        "Total Tenants: ${list.size}"
    }

    val totalRentText: LiveData<String> = tenants.map { list ->
        val total = list.sumOf { it.rent.toDoubleOrNull() ?: 0.0 }
        "Total Rent: KSh $total"
    }

    val allTenantsText: LiveData<String> = tenants.map { list ->
        if (list.isEmpty()) {
            "No tenants added yet."
        } else {
            list.joinToString(separator = "\n\n") { it.summary() }
        }
    }

    fun addTenant(name: String, phone: String, rent: String): Tenant? {
        if (name.isBlank() || phone.isBlank() || rent.isBlank()) {
            return null
        }
        val tenant = Tenant(name.trim(), phone.trim(), rent.trim())
        TenantRepository.addTenant(tenant)
        _tenants.value = TenantRepository.tenants.toList()
        return tenant
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("TENANT_LIFECYCLE", "TenantViewModel: onCleared")
    }
}
