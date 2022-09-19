package com.sanseong.allthatiwanttodo.controller

import com.sanseong.allthatiwanttodo.model.dashboard.request.DashboardCreateRequest
import com.sanseong.allthatiwanttodo.model.dashboard.response.DashboardCreateResponse
import com.sanseong.allthatiwanttodo.model.dashboard.response.DashboardGetResponse
import com.sanseong.allthatiwanttodo.service.DashboardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
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
        return DashboardCreateResponse(dashboardService.writeBoard(request.toModel()).id)
    }

    @GetMapping("/{dashboardId}")
    fun getDashboard(
        @PathVariable dashboardId: Long,
    ): DashboardGetResponse {
        return DashboardGetResponse.createBy(dashboardService.getBoard(dashboardId))
    }
}
