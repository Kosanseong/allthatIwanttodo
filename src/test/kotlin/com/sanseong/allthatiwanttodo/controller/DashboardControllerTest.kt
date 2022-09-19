package com.sanseong.allthatiwanttodo.controller

import com.sanseong.allthatiwanttodo.entity.Dashboard
import com.sanseong.allthatiwanttodo.service.DashboardService
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post
import org.springframework.test.web.servlet.setup.MockMvcBuilders

internal class DashboardControllerTest {
    private var dashboardService: DashboardService = mockk()

    private var controller = DashboardController(dashboardService)

    private val mockMvc: MockMvc = MockMvcBuilders.standaloneSetup(controller).build()

    @Test
    fun createBoard() {
        //given
        val dashboard = Dashboard(
            id = 1,
            title = "테스트 컨텐트",
            content = "테스트 타이틀",
        )

        every { dashboardService.writeBoard(any()) } returns dashboard

        val requestJson = """
            {
                "content": "테스트 컨텐트",
                "title": "테스트 타이틀"
            }
        """.trimIndent()
        //when
        //then
        mockMvc.post("/dashboard") {
            contentType = MediaType.APPLICATION_JSON
            content = requestJson
        }.andExpect {
            status { isOk() }
            content { contentType(MediaType.APPLICATION_JSON) }
            content { json("""{"dashboardId": 1}""") }
        }
    }
}
