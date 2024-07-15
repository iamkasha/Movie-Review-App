package org.kasha.movies.moviesapi.repository;

import org.bson.types.ObjectId;
import org.kasha.movies.moviesapi.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
