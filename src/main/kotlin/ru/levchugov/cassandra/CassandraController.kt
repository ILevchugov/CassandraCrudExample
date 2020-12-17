package ru.levchugov.cassandra

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cassandra")
class CassandraController {
    @Autowired
    var cassandraMovieRepository: CassandraMovieRepository? = null

    @GetMapping(value = ["movies"])
    fun read(): ResponseEntity<Any?> {
        return ResponseEntity<Any?>(cassandraMovieRepository!!.findAll(), HttpStatus.OK)
    }

    @PostMapping(value = ["movies"])
    fun create(@RequestBody move: Movie): ResponseEntity<Any> {
        cassandraMovieRepository?.save(move)
        return ResponseEntity(HttpStatus.OK)
    }

    @DeleteMapping(value = ["movies/{id}"])
    fun remove(@PathVariable(name = "id") id: Int): ResponseEntity<Any> {
        cassandraMovieRepository?.deleteById(id)
        return ResponseEntity(HttpStatus.OK)
    }
}