package com.sanseong.allthatiwanttodo.repository

import com.sanseong.allthatiwanttodo.entity.Dashboard
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor

interface DashboardRepository: JpaRepository<Dashboard, Long>, QuerydslPredicateExecutor<Dashboard>
