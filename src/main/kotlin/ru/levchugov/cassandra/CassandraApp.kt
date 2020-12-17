package ru.levchugov.cassandra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CassandraApp

fun main(args: Array<String>) {
    runApplication<CassandraApp>(*args)
}
