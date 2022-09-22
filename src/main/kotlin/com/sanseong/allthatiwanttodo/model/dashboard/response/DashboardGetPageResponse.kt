package com.sanseong.allthatiwanttodo.model.dashboard.response

import com.sanseong.allthatiwanttodo.entity.Dashboard
import org.springframework.data.domain.Page

class DashboardGetPageResponse(
    val content: Page<DashboardGetResponse>,
) {
    companion object{
        fun createBy(dashboards: Page<Dashboard>): DashboardGetPageResponse {
            return DashboardGetPageResponse(
                content = dashboards.map { DashboardGetResponse.createBy(it) },
            )
        }
    }
}
