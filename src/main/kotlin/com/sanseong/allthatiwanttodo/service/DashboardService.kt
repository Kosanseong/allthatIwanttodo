package com.sanseong.allthatiwanttodo.service

import com.sanseong.allthatiwanttodo.model.dashboard.DashboardCreateModel
import com.sanseong.allthatiwanttodo.model.dashboard.toEntity
import com.sanseong.allthatiwanttodo.repository.DashboardRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class DashboardService(
    private val dashboardRepository: DashboardRepository
) {
    fun writeBoard(model: DashboardCreateModel): Long {
        return dashboardRepository.save(model.toEntity()).id
    }
}

