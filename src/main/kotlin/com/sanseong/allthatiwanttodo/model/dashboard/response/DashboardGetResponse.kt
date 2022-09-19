package com.sanseong.allthatiwanttodo.model.dashboard.response

import com.sanseong.allthatiwanttodo.entity.Dashboard

data class DashboardGetResponse(
    val dashboardId: Long,
    val content: String,
    val title: String,
) {
    companion object {
        fun createBy(dashboard: Dashboard) = DashboardGetResponse(
            dashboardId = dashboard.id,
            content = dashboard.content,
            title = dashboard.title,
        )
    }
}
