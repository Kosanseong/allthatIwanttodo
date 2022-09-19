package com.sanseong.allthatiwanttodo.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Lob

@Entity
class Dashboard(
    @Id
    @GeneratedValue
    val id: Long = 0,
    @Lob
    val content: String,
    val title: String,
)
