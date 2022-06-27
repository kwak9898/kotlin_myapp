package com.example.myapp.domain

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "stocks")
class Stock (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: String,
    val type: String,
    val name: String,
    val code: String,
    val ticker: String,
    val updatedDate: LocalDateTime,
    val createdDate: LocalDateTime,
)