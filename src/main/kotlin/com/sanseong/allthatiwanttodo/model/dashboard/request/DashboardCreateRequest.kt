package com.sanseong.allthatiwanttodo.model.dashboard.request

import com.sanseong.allthatiwanttodo.model.dashboard.DashboardCreateModel

data class DashboardCreateRequest(
    val content: String,
    val title: String,
) {
    fun toModel() = DashboardCreateModel(
        content = content,
        title = title,
    )
}

