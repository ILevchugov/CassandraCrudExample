package ru.levchugov.cassandra

import org.springframework.data.cassandra.repository.CassandraRepository

interface CassandraMovieRepository :
    CassandraRepository<Movie?, Int?>