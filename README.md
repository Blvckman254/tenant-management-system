# MyTenantManagementSystem

## Description
MyTenantManagementSystem is a modern Android application built with Kotlin, designed to streamline tenant and property management. It provides landlords and property managers with an intuitive interface to manage tenants, track rental payments, and monitor property statistics in real-time.

---

## Download
You can build and install the debug APK directly from source:
```bash
./gradlew assembleDebug
```
The APK will be generated at `app/build/outputs/apk/debug/app-debug.apk`.

---

## Features
- **Tenant Management**: Add, view, update, and remove tenant records efficiently.
- **Dashboard & Analytics**: Real-time overview showing total tenant counts and total accumulated rent.
- **Reactive UI**: Powered by Jetpack LiveData Transformations (`map`) for seamless, reactive data updates across fragments.
- **Local Persistence**: Robust data persistence using the Room Database library with KSP.
- **Modern Navigation**: Fragment-based navigation using Jetpack Navigation Component and Safe Args.

---

## Architecture & ViewModel / LiveData Implementation
This project follows modern Android architecture principles using MVVM (Model-View-ViewModel), Jetpack Navigation, ViewBinding, and Jetpack Lifecycle components.

## TenantViewModel & LiveData
`TenantViewModel` acts as the single source of truth for UI-related data across fragments. It encapsulates tenant data management and exposes LiveData streams (`tenants`, `tenantCountText`, `totalRentText`, and `allTenantsText`) powered by LiveData Transformations (`map`). This ensures that UI components (such as `DashboardFragment` and `ViewTenantsFragment`) observe reactive state updates safely across configuration changes, while preserving state separation through `activityViewModels()`.

---

## Team

| Name             | Admission Number | PR Link |
|:-----------------|:-----------------| :--- |
| Abel Mokua       | 183983           | [PR #1](https://github.com/Blvckman254/tenant-management-system/pull/1) |
| Michael Udoye    | 191330           | [PR #2](https://github.com/Blvckman254/tenant-management-system/pull/2) |
| Malcom Ntege     | 161826           | [PR #3](https://github.com/Blvckman254/tenant-management-system/pull/3) |
| Scolastica Njeri | 193558           | [PR #4](https://github.com/Blvckman254/tenant-management-system/pull/4) |
| Jeff Kandia      | 192683           | [PR #5 & #6](https://github.com/Blvckman254/tenant-management-system/pull/6) |
| Edward Omotii    | 190757           | [PR #7](https://github.com/Blvckman254/tenant-management-system/pull/7) |
