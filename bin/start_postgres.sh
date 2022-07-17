#!/usr/bin/env bash
FROM postgres
ENV POSTGRES_PASSWORD docker
ENV POSTGRES_DB dev
COPY cp ./schema.sql postgres-db:/docker-entrypoint-initdb.d/schema.sql
COPY cp ./data.sql postgres-db:/docker-entrypoint-initdb.d/data.sql
docker exec -u postgres postgres-db psql dev postgres -f docker-entrypoint-initdb.d/schema.sql
docker exec -u postgres postgres-db psql dev postgres -f docker-entrypoint-initdb.d/data.sql