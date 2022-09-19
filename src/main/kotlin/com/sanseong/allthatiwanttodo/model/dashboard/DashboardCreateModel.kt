package com.sanseong.allthatiwanttodo.model.dashboard

import com.sanseong.allthatiwanttodo.entity.Dashboard

data class DashboardCreateModel(
    val title: String,
    val content: String,
)

fun DashboardCreateModel.toEntity() = Dashboard(
    content = content,
    title = title,
)
