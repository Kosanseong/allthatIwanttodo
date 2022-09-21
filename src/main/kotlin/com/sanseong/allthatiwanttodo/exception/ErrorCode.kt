package com.sanseong.allthatiwanttodo.exception

import org.springframework.http.HttpStatus

enum class ErrorCode(
    val errorCode: String,
    val httpStatus: HttpStatus,
    val message: String
) {
    DASHBOARD_NOT_FOUND("DB-001", HttpStatus.BAD_REQUEST, "boardId is not exist")
}
