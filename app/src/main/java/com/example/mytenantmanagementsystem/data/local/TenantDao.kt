package com.example.mytenantmanagementsystem.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mytenantmanagementsystem.data.model.Tenant

// @Dao: the operations we can do on the table. Room writes the code inside
@Dao
interface TenantDao {

    // suspend: can pause while the database works, without freezing the screen
    @Insert
    suspend fun insertTenant(tenant: Tenant)

    // LiveData: Room re-sends the list automatically whenever the table changes
    @Query("SELECT * FROM tenants ORDER BY name")
    fun getAllTenants(): LiveData<List<Tenant>>
}