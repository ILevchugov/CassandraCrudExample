# Getting Started

docker network create -d bridge cassandra-network

docker run --name my-cassandra -p 9042:9042 -d --network cassandra-network -e CASSANDRA_SEEDS=my-cassandra cassandra:4.0

docker run -it --network cassandra-network --rm cassandra cqlsh my-cassandra

