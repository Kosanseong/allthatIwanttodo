package com.sanseong.allthatiwanttodo.controller

import com.sanseong.allthatiwanttodo.model.dashboard.request.DashboardCreateRequest
import com.sanseong.allthatiwanttodo.model.dashboard.response.DashboardCreateResponse
import com.sanseong.allthatiwanttodo.service.DashboardService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dashboard")
class DashboardController(
    private val dashboardService: DashboardService,
) {

    @PostMapping
    fun writeDashboard(
        @RequestBody request: DashboardCreateRequest,
    ): DashboardCreateResponse {
        val dashboardId = dashboardService.writeBoard(request.toModel())

        return DashboardCreateResponse(dashboardId)
    }
}
