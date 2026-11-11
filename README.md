# MyTenantManagementSystem

## Architecture & ViewModel / LiveData Implementation
This project follows modern Android architecture principles using MVVM (Model-View-ViewModel), Jetpack Navigation, ViewBinding, and Jetpack Lifecycle components.

### TenantViewModel & LiveData
`TenantViewModel` acts as the single source of truth for UI-related data across fragments. It encapsulates tenant data management and exposes LiveData streams (`tenants`, `tenantCountText`, `totalRentText`, and `allTenantsText`) powered by LiveData Transformations (`map`). This ensures that UI components (such as `DashboardFragment` and `ViewTenantsFragment`) observe reactive state updates safely across configuration changes, while preserving state separation through `activityViewModels()`.
