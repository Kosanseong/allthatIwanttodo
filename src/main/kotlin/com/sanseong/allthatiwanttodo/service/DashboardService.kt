package com.sanseong.allthatiwanttodo.service

import com.sanseong.allthatiwanttodo.entity.Dashboard
import com.sanseong.allthatiwanttodo.exception.BusinessException
import com.sanseong.allthatiwanttodo.exception.ErrorCode
import com.sanseong.allthatiwanttodo.model.dashboard.DashboardCreateModel
import com.sanseong.allthatiwanttodo.model.dashboard.toEntity
import com.sanseong.allthatiwanttodo.repository.DashboardRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class DashboardService(
    private val dashboardRepository: DashboardRepository
) {
    fun writeBoard(model: DashboardCreateModel): Dashboard {
        return dashboardRepository.save(model.toEntity())
    }

    fun getBoard(dashboardId: Long): Dashboard {
        return dashboardRepository.findByIdOrNull(dashboardId)
            ?: throw BusinessException(ErrorCode.DASHBOARD_NOT_FOUND)
    }
}

