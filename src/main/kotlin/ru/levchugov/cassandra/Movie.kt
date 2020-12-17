package ru.levchugov.cassandra

import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table
data class Movie(
    @Column @PrimaryKey val id: Int,
    @Column val title: String? = null,
    @Column val year: String? = null
)